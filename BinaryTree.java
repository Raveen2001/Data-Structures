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
}
