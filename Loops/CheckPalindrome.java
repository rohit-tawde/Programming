import java.util.*;
//  WA java program to check whether the number is palindrome or not 

public class CheckPalindrome
 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int rev=0;
        
        while(num>0) {
            int rem = num % 10;
            rev = rev * 10 + rem;  
            num = num/10; 

        }

        System.out.println(rev);

        if(rev == num) {
            System.out.println("The given number is palindrome..." + num);
        }
        else {
            System.out.println("The given number is not a palindrome..." + num);
        }

    }
}