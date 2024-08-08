import java.util.Scanner;

class CheckSpyNum {
    public static void main(String[] args) {

        int num = 123;
        int sum = 0;
        int mul = 1;
        int rev = 0;

        while(num != 0) {
            int rem = num % 10;
            sum = sum + rem;
            mul = mul * rem;
            num = num / 10;
        }

        System.out.println(sum);
        System.out.println(mul);

        if(sum == mul) {
            System.out.println("The Given number is a spy number");
        }
        else {
            System.out.println("The Given number is not a spy number");
        }

    }
}