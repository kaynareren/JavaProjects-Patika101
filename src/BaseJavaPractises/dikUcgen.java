package BaseJavaPractises;

import java.util.Scanner;


public class dikUcgen {
    public static void main(String[] args) {


        //değişkenler belirlendi.
        int a, b;
        double c;

        //kullanıcıdan veri alma
        Scanner girdi = new Scanner(System.in);
        System.out.print("1. KENARI GİRİNİZ:");
        a = girdi.nextInt();
        System.out.print("2. KENARI GİRİNİZ:");
        b = girdi.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println("HİPOTENÜS:" + c);
    }
}
