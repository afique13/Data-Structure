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
public class Q02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BST<Character> tree = new BST<>();
        char [] letter = new char[7];
        letter[0] = 'F';
        letter[1] = 'A';
        letter[2] = 'C';
        letter[3] = 'U';
        letter[4] = 'L';
        letter[5] = 'T';
        letter[6] = 'Y';
        System.out.println("The elements: ");
        for(int i=0;i<letter.length;i++){
            System.out.print(letter[i]);
            tree.addNode(letter[i]);
        }
        System.out.print("\nThe number of elements in the tree : "+tree.getSize());
        System.out.print("\nThe tree elements - PREORDER : ");
        tree.setOrder(BST.PREORDER);
        tree.showTree();
        System.out.print("The tree elements - INORDER : ");
        tree.setOrder(BST.PREORDER);
        tree.showTree();
        System.out.print("The tree elements - POSTORDER : ");
        tree.setOrder(BST.POSTORDER);
        tree.showTree();
        System.out.print("Remmove 1 Character L");
        tree.remove('L');
        System.out.print("\nThe number of elements in the tree : "+tree.getSize());
        System.out.print("The tree elements - PREORDER : ");
        tree.setOrder(BST.PREORDER);
        tree.showTree();
        System.out.print("The tree elements - INORDER : ");
        tree.setOrder(BST.PREORDER);
        tree.showTree();
        System.out.print("The tree elements - POSTORDER : ");
        tree.setOrder(BST.POSTORDER);
        tree.showTree();

    }
    
}
