package savelascod.bst;


public class PreOrder {


    public static Node constructBST(int[] transversal, int index, int size){
        Node root = new Node(transversal[index]);
        int posGreaterThanRoot = -1;
        for (int indexAux = index+1; indexAux < size; indexAux++) {
            if(transversal[indexAux]>transversal[index]) {
                posGreaterThanRoot = indexAux;
                break;
            }
        }
        //left
        if(posGreaterThanRoot!=-1){
            if(index+1!=posGreaterThanRoot) root.left = constructBST(transversal, index+1, posGreaterThanRoot);
            root.right = constructBST(transversal, posGreaterThanRoot, size);
        }
        return root;
    }

    public static void main(String[] args){
        int preOrder[] = new int[]{10,5,1,7,40,50};
        Node root = constructBST(preOrder, 0, preOrder.length);
        System.out.println(root);
    }


}
