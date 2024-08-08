// WAJP to print the largest digit from a number
// WAJP to print the smallest digit of a number
import java.util.Scanner;

class CheckNumberPerfect {

    public static void main(String[] args) {
        // Do Factors 
        // 2. Addition of Factors
        // 3. Original == Addition
        // ex. 6 is a perfect number
        // if same then it's a Perfect number

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;
        int originalNum = num;

        for(int i=1; i<=num/2; i++) {
            if(num%i==0) {
                sum = sum + i;
            }
        }

        if(sum==originalNum) {
            System.out.println("The Given number is a perfect number");
        }
        else {
            System.out.println("The Given number is not a perfect number");
        }



    }
}