package latihan.pkg2;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int perangko,bulatperangko;
         System.out.print("Masukkan Jumlah lembar = ");
         perangko = input.nextInt();
         if(perangko%5!=0){
         bulatperangko=(perangko+(5-perangko%5))/5;
         System.out.println("Perangka yg dibutuhkan = "+bulatperangko);
         }
         else{
         perangko=perangko/5;
         System.out.println("Perangka yg dibutuhkan = "+perangko);
         }
    }    
}
