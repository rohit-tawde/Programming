import java.util.Scanner;

class CheckStrong {
    public static void main(String[] args) {
        //  8. WAJP to check whether a number is strong number or not.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        // Ex. 145 is a Strong number 
        // 5 fact is = 120
        // 4 fact is = 24
        // 1 fact is = 1
        // 120 + 24 + 1 = 145
        // Check if Original number and Result is same then it is a Strong number...
        
        int orignalNum = num;
        int rem = 0;
        int sum = 0;

        while(num != 0) {

            rem = num % 10;
            int fact = 1;

            // while(rem>=1) {
            //     fact = fact * rem;
            //     rem--;
            // }

            for(int i = 1; i<=rem; i++) {

                    fact = fact * i;// 6 

            }
            
            sum=sum+fact;
            num = num / 10;

        }

        System.out.println("sum = "+sum);

        if(orignalNum == sum) {

            System.out.println(orignalNum + " is a Strong number.");
        }
        else {

            System.out.println(orignalNum + " is not a Strong number.");

        }
    }
}


