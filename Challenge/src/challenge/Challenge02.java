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
public class Challenge02 {
    public static void main(String[] args) {
        int a,b,jumlah;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai suku awal:");
        a = input.nextInt();
        System.out.println("Masukkan nilai beda tiap suku:");
        b = input.nextInt();
        System.out.println("Masukkan jumlah suku:");
        jumlah = input.nextInt();
        System.out.println("Berikut tampilan deret aritmatika!");
        int i = 1;
        do {
            System.out.print(a + " ");
            a+=b;
            i++;
        } while(i<=jumlah);
        
    }
}
