/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUT07;

import java.util.Random;

/**
 *
 * @author Owner
 */
public class Q01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] num = new int[10];
        Random r = new Random();
        BST<Integer> tree = new BST<>();
        num[0] = 50;
        num[1] = 30;
        num[2] = 25;
        num[3] = 71;
        num[4] = 80;
        num[5] = 99;
        num[6] = 40;
        num[7] = 1;
        num[8] = 7;
        num[9] = 5;
        System.out.print("Numbers: ");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);
            tree.addNode(num[i]);
        }
        System.out.println("\nThe number of elements in the tree: "+tree.getSize());
        System.out.print("The tree elements - INORDER : ");
        tree.setOrder(BST.INORDER);
        tree.showTree();
        System.out.print("The tree elements - PREORDER : ");
        tree.setOrder(BST.PREORDER);
        tree.showTree();
        System.out.print("The tree elements - POSTORDER : ");
        tree.setOrder(BST.POSTORDER);
        tree.showTree();
    }
    
}
