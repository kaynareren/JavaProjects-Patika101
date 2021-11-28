package BaseJavaPractises;
import java.util.Scanner;

public class manavKasa {
    public static void main(String[] args) {
        double kgE = 0, kgA = 0, kgD = 0, kgM = 0, kgP = 0, toplam = 0;

        Scanner manav = new Scanner(System.in);

        //kulanıcıdan değerleri TAM SAYI cinsinden al.
        System.out.print("ELMA MİKTARINI GİRİN : " );
        kgE = manav.nextDouble();

        System.out.print("ARMUT MİKTARINI GİRİNİZ : " );
        kgA = manav.nextDouble();

        System.out.print("DOMATES MİKTARINI GİRİN : ");
        kgD = manav.nextDouble();

        System.out.print("MUZ MİKTARINI GİRİN : ");
        kgM = manav.nextDouble();

        System.out.print("PATLICAN MİKTARINI GİRİN : ");
        kgP = manav.nextDouble();

        toplam = (kgE * 3.67 ) + (kgA * 2.14) + (kgD * 1.11) + (kgM * 0.95) + (kgP * 5.00);

        System.out.println("TOPLAM TUTAR : " + toplam);


    }
}
