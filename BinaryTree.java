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

        insert(root, value);

    }

    public  void insert(Node node, int value){
        if(node == null){
            root = new Node(value);
            return;
        }

        if(node.value > value){
            if(node.leftChild == null){
                node.leftChild = new Node(value);
                return;
            }
            insert(node.leftChild, value);
        }else{
            if(node.rightChild == null){
                node.rightChild = new Node(value);
                return;
            }
            insert(node.rightChild, value);
        }
    }

}
