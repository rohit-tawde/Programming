import java.util.Scanner;

class CheckPerfectNumber {

    public static void main(String[] args) {
        //  4. WAJP to check whether the number is perfect number or not 

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum =0;
        int originalnum = num;

        for(int i=1; i<=num/2; i++) {

            if(num % i == 0) {
                System.out.println("Number of Factors : "+ i);
                // 6 = 1 2 3 
                // 1 + 2 + 3 = 6 
                // if the result is same as original number then we can say this is perfect number
                sum +=i;

            }
        }

        System.out.println(sum);
        System.out.println(originalnum);

        if(sum == originalnum) {

            System.out.println("The given number is perfect number ");

        }
        else {
            System.out.println("The given number is not a perfect number");
        }



    }
}