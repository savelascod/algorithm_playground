package savelascod.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DetectLoopLinkedList {

    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    public static void main(String[] args) {

    }

    public static boolean detectLoop(Node node) {
        Set<Node> visitedNodes = new HashSet<>();
        while (node.next!=null){
            if(visitedNodes.contains(node)) return true;
            visitedNodes.add(node);
            node=node.next;
        }
        return false;
    }
}
