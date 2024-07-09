import java.util.*;

//  WA java program to print the addition of even of a number as well as odd digit of the number.

class AddEvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int even =0;
        int odd = 0;
        while(num != 0) {

            int rem = num % 10;
            if(rem%2==0) {
                even = even + rem;
            }
            else {
                odd = odd + rem;
            }
            num = num /10;

        }

        System.out.println("Addition of even numbers: "+even);
        System.out.println("Addition of odd numbers: "+odd);
    }
}