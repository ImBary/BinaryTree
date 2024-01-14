public class Node {
    int key;
    int r;
    Node left;
    Node right;
    Node parent;
    public Node(int key,int r){
        this.key = key;
        this.left = null;
        this.right = null;
        this.parent = null;
        this.r = r;
    }
}
