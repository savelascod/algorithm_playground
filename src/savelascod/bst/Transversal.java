package savelascod.bst;

import java.util.List;

public class Transversal {

    /**
     * Creates the preOrder transversal of a BST and stores the information in the given List
     */
    public static void preOrderTransversal(Node root, List transversal) {
        transversal.add(root.data);
        if (root.left != null) preOrderTransversal(root.left, transversal);
        if (root.right != null) preOrderTransversal(root.right, transversal);
    }

    /**
     * Creates the inOrder transversal of a BST and stores the information in the given List
     */
    public static void inOrderTransversal(Node root, List transversal) {
        if (root.left != null) inOrderTransversal(root.left, transversal);
        transversal.add(root.data);
        if (root.right != null) inOrderTransversal(root.right, transversal);
    }

    /**
     * Creates the posOrder transversal of a BST and stores the information in the given List
     */
    public static void postOrderTransversal(Node root, List transversal) {
        if (root.left != null) preOrderTransversal(root.left, transversal);
        if (root.right != null) preOrderTransversal(root.right, transversal);
        transversal.add(root.data);
    }

}
