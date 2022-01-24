import java.util.Scanner;

public class ortalamaNot {
    public static void main(String[] args) {

        int math, physics, chemistry, biology, turkish;

        Scanner input = new Scanner(System.in);

        System.out.print("PLEASE ENTER YOUR MATH POINT : ");
        math = input.nextInt();

        if ( math < 0  ||  100 < math ) {
            System.out.println("YOUR MATH POINT ISN'T IN THE VALID RANGE !");
            math = 0;
        }

        System.out.print("PLEASE ENTER YOUR PHYSICS POINT : ");
        physics = input.nextInt();

        if ( physics < 0 || 100 < physics ) {
            System.out.println("YOUR PHYSICS POINT ISN'T THE VALID RANGE !");
            physics = 0;
        }

        System.out.print("PLEASE ENTER YOUR CHEMISTRY POINT : ");
        chemistry = input.nextInt();

        if ( chemistry < 0 || 100 < chemistry ) {
            System.out.println("YOUR CHEMISTRY POINT ISN'T IN THE VALID RANGE !");
            chemistry = 0;
        }

        System.out.print("PLEASE ENTER YOUR BIOLOGY POINT : ");
        biology = input.nextInt();

        if ( biology < 0 || 100 < biology ) {
            System.out.println("YOUR BIOLOGY POINT ISN'T IN THE VALID RANGE !");
            biology = 0;
        }

        System.out.print("PLEASE ENTER YOUR TURKISH POINT : ");
        turkish = input.nextInt();

        if ( turkish < 0 || 100 < turkish ) {
            System.out.println("YOUR TURKISH POINT ISN'T IN THE VALID RANGE !");
            turkish = 0;
        }

        int average = ( math + physics + chemistry + biology + turkish ) / 5;

        if ( average < 55 ) {
            System.out.print("YOUR AVERAGE : " + average );
            System.out.println(", YOU AREN'T PASS THE CLASS ");
        } else {
            System.out.print("YOUR AVERAGE : " + average );
            System.out.println(", YOU ARE PASS THE CLASS");
        }

    }
}
