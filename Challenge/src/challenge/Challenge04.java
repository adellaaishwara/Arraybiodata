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
public class Challenge04 {
    public static void main(String[] args) {
         int panjang,lebar;
         Scanner input = new Scanner(System.in);
         System.out.println("Masukkan nilai panjang:");
         panjang = input.nextInt();
         System.out.println("Masukka nilai besar:");
         lebar = input.nextInt();
         
         for (int i = 1; i <= lebar; i++) {
             for(int j = 1; j <= panjang; j++) {
                 System.out.print(" * ");
             }
             System.out.print("");
         }
        
    }
}
