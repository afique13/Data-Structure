/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUT07;

/**
 *
 * @author Owner
 */
public class Q03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("BST Implementation Using Array");
        ArrayBST<Character> arrayBST = new ArrayBST<>();
        arrayBST.addNode('F');
        arrayBST.addNode('A');
        arrayBST.addNode('C');
        arrayBST.addNode('U');
        arrayBST.addNode('L');
        arrayBST.addNode('T');
        arrayBST.addNode('Y');

        System.out.println("The number of elements in the tree : " + arrayBST.getSize());
        System.out.print("The tree elements - PREORDER : ");
        arrayBST.preOrder(0);
        System.out.println();
        System.out.print("The tree elements - INORDER : ");
        arrayBST.inOrder(0);
        System.out.println();
        System.out.print("The tree elements - POSTORDER : ");
        arrayBST.postOrder(0);
        System.out.println();

        System.out.println("Remove 1 Character L");
        arrayBST.removeNode('L');

        System.out.println("The number of elements in the tree : " + arrayBST.getSize());
        System.out.print("The tree elements - PREORDER : ");
        arrayBST.preOrder(0);
        System.out.println();
        System.out.print("The tree elements - INORDER : ");
        arrayBST.inOrder(0);
        System.out.println();
        System.out.print("The tree elements - POSTORDER : ");
        arrayBST.postOrder(0);
    }
    
}
