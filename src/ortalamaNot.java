import java.util.Scanner;

public class ortalamaNot {
    public static void main(String[] args) {

         int heat;

         Scanner input = new Scanner(System.in);
         System.out.print("SICAKLIĞI GİRİNİZ : ");
         heat = input.nextInt();

         if (heat < 5) {
             System.out.println("KAYAK YAPABILIRSINIZ");
         } else if (heat <= 25) {
             if (heat < 15){
                 System.out.println("SINEMAYA GIDEBILIRSINIZ");
             }
             if (heat >= 10) {
                 System.out.println("PIKNIGE GIDEBILIRSINIZ");
             }
                 else {
             System.out.println("YUZMEYE GIDEBILIRSINIZ.");
             }
         }






    }
}
