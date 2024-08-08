// WAJP to check whether the number is Special two digit number or not.

import java.util.Scanner;

class CheckSpecialTwoDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        // Ex. 59
        int original = num;
        int sum = 0;
        int mul = 1;

        while(num>0) {
            int rem = num % 10;
            sum = sum + rem;
            mul = mul * rem;
            num = num / 10;
        }

        System.out.println(sum);
        System.out.println(mul);

        int add = sum + mul;

        if(original == add) {
            System.out.println("Its a Special Two Digit");
        }
        else {
            System.out.println("It's Not a Special Two Digit");
        }

    }
}