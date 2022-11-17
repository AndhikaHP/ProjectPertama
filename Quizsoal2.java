package quizsoal2;

import java.util.Scanner;

public class Quizsoal2 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
      int jam=3600;
      double waktu,detik;
      System.out.println("Mengkonversi detik ke jam");
      System.out.print("Masukkan jumlah detik = ");
      detik = input.nextDouble();
      waktu=detik/jam;
      System.out.println("Jumlah jam = "+waktu);
    }
    
}
