package Com.Sparta.meet;

public class Main {
    static class Node{

        int data;
        Node left;
        Node right;

        //constructor
        Node(int sata) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
    class btree{
        void add(Node start, int data){
            if (start.data > data) {
                if (start.left == null) {
                    start.left = new Node(data);
                } else
                    add(start.left, data);

            }
            else if (start.data < data) {
                if (start.right == null)
                    start.right = new Node(data);
            }
            else {add(start.right,data);

            }

            }

        }

    }

    public static void main(String[] args) {


        Node start = new Node(10);

        System.out.println("Hello world!");
    }
}