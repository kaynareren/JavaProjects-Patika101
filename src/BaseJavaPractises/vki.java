package BaseJavaPractises;
import java.util.Scanner;

public class vki {
    public static void main(String[] args) {
        double vki, boy, kilo;

        Scanner input = new Scanner(System.in);

        System.out.print("LÜTFEN BOYUNUZU CM OLARAK GİRİN : ");
        boy = input.nextDouble();

        System.out.print("LÜTFEN KİLONUZU KG OLARAK GİRİNİZ : ");
        kilo = input.nextDouble();

        vki = kilo/(boy*boy);

        System.out.println("VÜCUT KİTLE İNDEKSİNİZ : " + vki);

    }
}
