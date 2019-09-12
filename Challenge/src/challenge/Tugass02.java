/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tugass02 {
    
    public static void main(String[] args) {
        
        int i;
        int j;
        
           for(i=3; i>=1; i--){
               for(j=1; j<=i; j++){
                   System.out.print(" * ");
               }
               System.out.println("\n");
           }
    }
}

