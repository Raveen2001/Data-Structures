public class BinaryTree {
    private class Node{
        int value;
        Node leftChild;
        Node rightChild;

        Node(int value){
            this.value = value;
        }

        @Override
        public String toString(){
            return ("Node=" + this.value);
        }
    }

    private Node root;


    public void insert(int value){
        if(root == null){
            root = new Node(value);
            return;
        }
        var cur = root;
        while(true){
            if(cur.value > value){
                if(cur.leftChild == null){
                    cur.leftChild = new Node(value);
                    break;
                }
                cur = cur.leftChild;
            }else{
                if(cur.rightChild == null){
                    cur.rightChild = new Node(value);
                    break;
                }
                cur = cur.rightChild;
            }
        }
    }

    public boolean find(int value){
        var cur = root;
        while(cur != null){
            if(cur.value == value) return true;
            else if(cur.value > value) cur = cur.leftChild;
            else cur = cur.rightChild;
        }
        return false;
    }

    public void traversePreOrder(){
        traversePreOrder(root);
        System.out.println();
    }

    private void traversePreOrder(Node root){
        if(root == null) return;
        System.out.print(root.value + " ");
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }
    public void traverseInOrder(){
        traverseInOrder(root);
        System.out.println();
    }

    private void traverseInOrder(Node root){
        if(root == null) return;
        traverseInOrder(root.rightChild);
        System.out.print(root.value + " ");
        traverseInOrder(root.leftChild);

    }

    public void traversePostOrder(){
        traversePostOrder(root);
        System.out.println();
    }

    private void  traversePostOrder(Node root){
        if(root == null) return;
        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.print(root.value + " ");
    }

    public int height(){
        return height(root);
    }

    private int height(Node root){
        if(root == null) return -1;
        if(isLeafNode(root)) return 0;
        return (1 + Math.max(height(root.leftChild), height(root.rightChild)));
    }

    public int min(){
//        return  min(root); // for  binary tree;

        // for Binary Search Tree
        if(root == null) return -1;
        var cur = root;
        while(cur.leftChild != null){
            cur = cur.leftChild;
        }
        return cur.value;
    }

    private int min(Node root){
        if(root == null) return Integer.MAX_VALUE;
        if(isLeafNode(root)) return root.value;
        int left = min(root.leftChild);
        int right = min(root.rightChild);

        return (Math.min(Math.min(left, right), root.value));
    }


    public boolean equals(BinaryTree tree2){
        return equals(root, tree2.root);
    }

    private boolean equals(Node tree1, Node tree2){
        if(tree1 == null && tree2 == null) return true;
        if(tree1 == null || tree2 == null) return false;
        return ((tree1.value == tree2.value) && equals(tree1.leftChild, tree2.leftChild) && equals(tree1.rightChild, tree2.rightChild));
    }

    private boolean isLeafNode(Node node){
        return (root.leftChild == null && root.rightChild == null);
    }
}
