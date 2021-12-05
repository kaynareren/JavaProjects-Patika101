package BaseJavaPractises;

import java.util.Scanner;

public class kodBlokları {
    public static void main(String[] args) {

        int n1, n2, select;

        Scanner input = new Scanner(System.in);

        System.out.print("ENTER THE FIRST NUMBER : ");
        n1 = input.nextInt();
        System.out.print("ENTER THE SECOND NUMBER : ");
        n2 = input.nextInt();

        System.out.println("1-ADD\n2-SUBTRACT\n3-MULTIPLY\n4-DIVIDE");
        System.out.print("SELECT : ");
        select = input.nextInt();


        switch (select) {
            case 1:
                System.out.println("EQUALS : " + (n1 + n2));
                break;
            case 2:
                System.out.println("EQUALS : " + (n1 - n2));
                break;
            case 3:
                System.out.println("EQUALS : " + (n1 * n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("NO NUMBER IS DIVIDED BY ZERO !!");
                    break;
                } else {
                    System.out.println("EQUALS : " + (n1 / n2));
                }
            default:
                System.out.println("ERROR");
                break;

        }
    }
}
