import java.util.Scanner;

/*   

    Program to find the largest of two integer numbers

*/

public class FindLargestInteger {

    public static void main(String[] args) {


         // step1 : create 2 integer variables
         // step2 : read data using Scanner

        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

         // step3 is the logic to find largest 
        if(number1>number2) {
            System.out.println(number1);
        }
        else {
            System.out.println(number2);
        }

    }
}