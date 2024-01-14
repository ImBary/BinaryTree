public class Bst {
    public Node insert(Node root,int value){
        if(root == null){
            return new Node(value,1);
        }
        Node current = root;
        while (current != null){
            if(value < current.key){
                if(current.left == null){
                    current.left =  new Node(value,1);
                    current.left.parent = current;
                    return current.left;
                }else{
                    current = current.left;
                }
            }else if(value > current.key){
                if(current.right == null) {
                    current.right = new Node(value,1);
                    current.right.parent = current;
                    return current.right;
                }else{
                    current = current.right;
                }
            }else{
                current.r +=1;
                return current;
            }
        }
        return null;
    }
    public void printBST(Node root){
        if(root != null){
            printBST(root.left);
            System.out.print(" key: "+root.key  + " repeating: " + root.r);
            printBST(root.right);

        }
    }

    public Node delete(Node root, int value) {
        if (root == null) {
            return null;
        }
        if (value < root.key) {
            root.left = delete(root.left, value);
        } else if (value > root.key) {
            root.right = delete(root.right, value);
        } else {
            if (root.r > 1) {
                root.r -= 1;
                return root;
            }
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            Node minValueNode = minValue(root.right);
            root.key = minValueNode.key;
            root.right = delete(root.right, minValueNode.key);
        }
        return root;
    }

    private Node minValue(Node root){
        while (root!=null){
            root = root.left;
        }
        return root;
    }
}
