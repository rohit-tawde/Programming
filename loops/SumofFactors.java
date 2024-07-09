import java.util.Scanner;

class SumofFactors {

//    3. WAJP to the sum of all the factors a number 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;

        for(int i=1; i<=num/2; i++) {
            if(num % i == 0) {
            System.out.println("Number of Factors: "+ i);
            sum = sum + i;

            }
        }

        System.out.println("Sum of Factors: "+ sum);


    }
}