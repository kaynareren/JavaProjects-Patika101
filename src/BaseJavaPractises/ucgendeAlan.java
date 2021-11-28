package BaseJavaPractises;
import java.util.Scanner;
public class ucgendeAlan {
    public static void main(String[] args) {
        //değişkenler belirlendi
        int a, b, c, u;
        double alan;

        //kullanıcıdan veri alma
        Scanner ücgen = new Scanner(System.in);
        System.out.print("1.KENARI GİRİN :");
        a = ücgen.nextInt();
        System.out.print("2.KENARI GİRİN :");
        b = ücgen.nextInt();
        System.out.print("3.KENARI GİRİN :");
        c = ücgen.nextInt();

        u = (a + b + c) / 2;

        alan = Math.sqrt( u * (u - a) * (u - b) * (u - c));
        System.out.println("ÜÇGENİN ALANI :" + alan);

    }
}
