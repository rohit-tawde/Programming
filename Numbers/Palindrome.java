import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int orignalNum = num;

        int rev = 0;
        while(num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        
        if(orignalNum == rev) {
            System.out.println("The Given Number is Palindrome");
        }
        else {
            System.out.println("The Given Number is Not a Palindrome");
        }
    }
}