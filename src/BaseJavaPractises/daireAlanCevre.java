package BaseJavaPractises;
import java.util.Scanner;

public class daireAlanCevre {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("ÇEMBERİN YARIÇAPINI GİRİN :");
        r = input.nextInt();

        double alan = (pi * r * r);
        double cevre = (2 * pi * r);

        System.out.println("ÇEMBERİN ALANI :" + alan);
        System.out.println("ÇEMBERİN ÇEVRESİ :" + cevre);

    }
}
