package challenge;
import java.util.Scanner;
public class Tugass03 {
    
    public static void main(String[] args) {
        
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai sisi :");
        a = input.nextInt();
        for (int i=1;i<=a;i++){
            for(int j=a; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
