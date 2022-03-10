public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        BinaryTree tree = new BinaryTree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);

        BinaryTree tree2 = new BinaryTree();
        tree2.insert(7);
        tree2.insert(4);
        tree2.insert(9);
        tree2.insert(1);
        tree2.insert(6);
        tree2.insert(8);
        tree2.insert(10);

        System.out.println(tree.find(10));
        System.out.println(tree.find(20));

        tree.traversePreOrder();
        tree.traverseInOrder();
        tree.traversePostOrder();

        System.out.println(tree.height());

        System.out.println(tree.min());
//        tree.swapRoot();
        System.out.println(tree.equals(tree2));
        System.out.println(tree.isBinarySearchTree());

        tree.printNodeAtDistance(2);
        System.out.println(tree.getNodeAtDistance(2));
        tree.levelOrderTraversal();
        System.out.println("Done");

    }
}