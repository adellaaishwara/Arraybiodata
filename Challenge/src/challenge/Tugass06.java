/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge;

/**
 *
 * @author User
 */
public class Tugass06 {
    public static void main(String[] args){
        
       int i,j,k,l;
    
        for (i=1;i<=3;i++){
            for(j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print("*");
            }
            for (l=1;l<=i-1;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
