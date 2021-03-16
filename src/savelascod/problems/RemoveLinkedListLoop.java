package savelascod.problems;

import java.util.HashSet;
import java.util.Set;

public class RemoveLinkedListLoop {

    static class Node
    {
        int data;
        Node next;
    }


    public static void main(String[] args) {
        Node node1 =  new Node();
        Node node2 =  new Node();
        Node node3 =  new Node();
        Node node4 =  new Node();
        Node node5 =  new Node();

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node1;

        removeLoop(node1);
        System.out.println(node5.next);
    }

    public static void removeLoop(Node node){
        Set<Node> visitedNodes = new HashSet<>();
        Node previousNode = null;
        while (node!=null && node.next!=null){
            if(visitedNodes.contains(node)) {
                previousNode.next = null;
                break;
            }
            visitedNodes.add(node);
            previousNode=node;
            node=node.next;
        }
    }
}
