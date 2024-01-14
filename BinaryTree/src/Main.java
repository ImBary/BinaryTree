public class Main {
    public static void main(String[] args) {
        Bst bst = new Bst();
        Node root = null;
        root = bst.insert(root,30);
        bst.insert(root,30);
        bst.insert(root,50);
        bst.insert(root,10);
        bst.printBST(root);
        root=bst.delete(root, 30);
        System.out.println();
        bst.printBST(root);
    }

}