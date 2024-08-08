import java.util.*;

class SumOfFactors {
    public static void main(String[] args) {

        System.out.println("Enter Number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for(int i=1; i<=num/2; i++) {
            if(num % i ==0) {
                    sum = sum + i;
            }
        }

        System.out.println(sum);
    }
}

// WAJP Check Number it's a perfect number or not
