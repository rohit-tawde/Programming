/*
  largest of 4 numbers 
*/
import java.util.Scanner;
public class LargeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3, num4;

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        num4 = sc.nextInt();


        if(num1 > num2 && num1 > num3 && num1 > num4) {

            System.out.println(num1);

        }
        else if(num2 > num3 && num2 > num4) {

            System.out.println(num2);

        }
        else if(num3 > num4) {
            
            System.out.println(num3);

        }
        else {
            
            System.out.println(num4);
        }
    }
}