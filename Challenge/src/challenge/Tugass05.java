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
public class Tugass05 {
    public static void main(String[] args){
        
         int i,j,k,l;
        
        for(i=1; i<=3; i++){
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=2; i>=1; i--){
            for(j=2; j>=i; j--){
                System.out.print(" ");
            }
            for(k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
