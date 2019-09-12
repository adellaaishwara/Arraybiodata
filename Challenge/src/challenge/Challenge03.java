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
public class Challenge03 {
    public static void main(String[] args){
        int sisi;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah sisi persegi:");
        sisi = input.nextInt();
        
        for (int i = 1; i <= sisi; i++) {
            for (int j = 1; j <= sisi; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}