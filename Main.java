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

        System.out.println(tree.find(10));
        System.out.println(tree.find(20));

        tree.traversePreOrder();
        tree.traverseInOrder();
        tree.traversePostOrder();

        System.out.println(tree.height());

        System.out.println(tree.min());
        System.out.println("Done");

    }
}
