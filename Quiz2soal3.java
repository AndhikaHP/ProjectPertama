
package quiz2soal3;

import java.util.Scanner;

public class Quiz2soal3 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double a,b,c;
        System.out.println("menghitung nilai a");
        System.out.print("masukkan nilai b = ");
        b=input.nextDouble();
        System.out.print("masukkan nilai c = ");
        c=input.nextDouble();
        a=(b-c)*(b+c);
        System.out.println("Hasil nilai a = "+a);
    }
    
}
