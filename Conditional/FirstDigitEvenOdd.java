import java.util.*;

public class FirstDigitEvenOdd
 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int rev=0;
        while(num>0) {

        num = num / 10;
    
        }

         if(num > 9) {
            if(num%2 == 0) {
                System.out.println("First digit of the number is evern " + num);
            }
            else {
                System.out.println("First digit of the number is odd " + num);
            }
        }

        System.out.println();



    }
}