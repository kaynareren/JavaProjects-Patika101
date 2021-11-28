package BaseJavaPractises;
import java.util.Scanner;
public class kdvOranı {
    public static void main(String[] args) {
        /*değişkenler belirlendi.
         * iki farklı kdv oranı için iki farklı değişken,
         * iki farklı kdv tutarı için iki farklı kdv tutarı da belirlendi.*/
        double tutar, kdvOranı1 = 0.18,kdvOranı = 0.08, kdvTutarı,kdvTutarı1, kdvliTutar;

        //scanner sınıfı tanımladık.
        Scanner input = new Scanner(System.in);

        //kullanıcıdan değer aldık.
        System.out.print("ÜCRET TUTARI GİRİNİZ:");
        tutar = input.nextDouble();

        //diğer değişkenler oluşturuldu.
        kdvTutarı = tutar * kdvOranı;
        kdvTutarı1 = tutar * kdvOranı1;
        kdvliTutar = tutar + kdvTutarı;

        //kullanıcıya tüm bilgiler verildi.
        System.out.println("KDV'siz Tutar:" + tutar);
        System.out.println("KDV Oranı:" + ( tutar >= 1000 ? + kdvOranı : + kdvOranı1));
        System.out.println("KDV Tutarı:" + (tutar >= 1000 ? + kdvTutarı : + kdvTutarı1));
        System.out.println("KDV'li Tutar." + kdvliTutar);


    }
}
