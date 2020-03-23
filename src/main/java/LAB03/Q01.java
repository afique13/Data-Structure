/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB03;

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
        System.out.println(Combo(4,2,2,4,2,(4-2)));
        System.out.println(Combo(7,2,5,7,2,5));
    }
    
    public static int Combo(int nc,int rc,int bc,int n, int r, int b){
        if(n==1&&r==1&&b==1){
            return (nc/(rc*bc));
        }else if((r==1||b==1)&&n>1){
            nc=nc*(n-1);
            if(r!=1&&b==1){
                rc=rc*(r-1);
                return Combo(nc,rc,bc,n-1,r-1,b);
            }else if(b!=1&&r==1){
                bc=bc*(b-1);
                return Combo(nc,rc,bc,n-1,r,b-1);
            }else if(r==1&&b==1)
                return Combo(nc,bc,rc,n-1,r,b);
        }else{
           nc=nc*(n-1);
           rc=rc*(r-1);
           bc=bc*(b-1);
        }

        return Combo(nc,rc,bc,n-1,r-1,b-1);
    }
        
}
