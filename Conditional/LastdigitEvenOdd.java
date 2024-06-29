 import java.util.Scanner;

public class LastdigitEvenOdd {

   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int rem = num % 10;

        if(rem % 2 == 0) {

            System.out.println("Last digit "+ rem +" is even");

        }
        else {
            System.out.println("Last digit "+ rem +" is odd");

        }
   }
}