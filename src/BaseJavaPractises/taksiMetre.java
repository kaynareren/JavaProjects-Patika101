package BaseJavaPractises;
import java.util.Scanner;

public class taksiMetre {
    public static void main(String[] args) {

        //değişkenler belirlendi
        int km;
        double kmBaşı = 2.2, toplam, açılış = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("MESAFEYİ KM CİNSİNDEN GİRİNİZ :");
        km = input.nextInt();

        toplam =(km * kmBaşı);
        toplam += açılış;


        System.out.println("TUTAR :" + (toplam < 20 ? 20 : toplam));



    }
}
