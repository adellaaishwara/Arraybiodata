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
public class Challenge05 {
    public static void main(String[] args) {
        int tinggi;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah tinggi segitiga:");
        tinggi = input.nextInt();
        
        int i = 1;
        int j;
        while(i<=tinggi) {
            j = 1;
            while(j<=i) {
                System.out.print(" * ");
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}
