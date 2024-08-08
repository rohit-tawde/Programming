
// WAJP to check whether a number is tech number or not

import java.util.Scanner;

class CheckTechNumber {

    public static void main(String[] args) {
        // Ex . 2025

       Scanner sc = new Scanner(System.in);

       int num = sc.nextInt();
       int original = num;
       int temp = num;
       int count = 0;
       int count2 = 0;
       int rev = 0;
       int sum = 0;
       int add = 0;

       while(num>0) {
        count++;
        num = num / 10;
       }

       System.out.println(count);

       if(count%2==0) {

          for(int i = 1; i<=count/2; i++) {
                int rem = temp % 10;
                rev = rev * 10 + rem;
                temp = temp / 10;
          }
          
       }
       else 
       {
            System.out.println("It's Not a Tech Number");
       }

        while(rev>0) {
            int rem = rev % 10;
            add = add * 10 + rem;
            rev = rev / 10;
        }

        // Split Number
        System.out.println(add);
        System.out.println(temp);

        // Addition of split number
        int addition = temp + add;

        // Finding Square 
        addition = addition * addition;

        if(addition == original) {
            System.out.println("It's a Tech Number");
        }
        else {
            System.out.println("It's Not a Tech Number");
        }


    }
}

