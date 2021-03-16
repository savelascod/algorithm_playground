package savelascod.problems;

public class isBST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        Node node1 = new Node(2);
        Node node2 = new Node(8);
        Node node3 = new Node(5);
        Node node4 = new Node(1);

        node3.left = node4;
        node1.right = node2;
        root.left = node1;
        root.right = node3;

        System.out.println(isBST(root));

    }

    static boolean isBST(Node node) {
        return isBSTRecursive(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static boolean isBSTRecursive(Node node, int minValue, int maxValue){
        //left validation
        if(node == null) return true;
        return (node.data >= minValue && node.data<= maxValue) &&
                (isBSTRecursive(node.left,minValue, node.data)) &&
                (isBSTRecursive(node.right, node.data, maxValue));
    }

}
