public class Main {
    public static void main(String[] args) {
        Bst bst = new Bst();
        Node root = null;
        root = bst.insert(root,30);
        bst.insert(root,130);
        bst.insert(root,430);
        bst.insert(root,2330);
        bst.insert(root,310);
        bst.insert(root,3032);
        bst.insert(root,3012);
        bst.insert(root,32);
        bst.printBST(root);
        root=bst.delete(root, 3012);
        System.out.println();
        bst.printBST(root);
    }

}