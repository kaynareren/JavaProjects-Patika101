package BaseJavaPractises;
import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        // değişkenleri oluştur
        int matematik,fizik,kimya,biyoloji,türkçe;

        // scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        // kullanıcıdan değerleri al
        System.out.print("Matematik notunuzu giriniz:");
        matematik = inp.nextInt();

        System.out.println("fizik notunuzu giriniz:");
        fizik = inp.nextInt();

        System.out.println("kimya notunuzu giriniz:");
        kimya = inp.nextInt();

        System.out.println("biyoloji notunuzu giriniz:");
        biyoloji = inp.nextInt();

        System.out.println("türkçe notunuzu giriniz:");
        türkçe = inp.nextInt();

        // kullanıcıya sonuç verdik
        int toplam = (matematik + fizik + kimya + biyoloji + türkçe);
        double sonuc = toplam / 5;
        System.out.println(" ortalamanız : " + sonuc);

        // kullanıcının geçip geçmediğini söyledik
        System.out.println( sonuc >= 60 ? "Geçtiniz" : "Kaldınız");

    }
}
