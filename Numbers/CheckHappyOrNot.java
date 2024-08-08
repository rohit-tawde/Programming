// WAJP to check whether the number is happy or not
// ex. 49 = 16 + 81 = 97 = 81 + 49 = 130 = 1 + 9 + 0 = 10 = 1 + 0 = 1 

import java.util.Scanner;

class CheckHappyOrNot {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        int rem = 0;
        int sqr = 0;

        while(num>9) {
            int sum = 0;

            while(num>0) {
                rem = num %10;
                sqr = rem * rem;
                sum = sum + sqr;
                num = num / 10;
            }
            num = sum;
        }

        if(num==1) {
            System.out.println("Happy Number");
        }
        else {
            System.out.println("Sad Number");
        }
    }
}
