import java.util.Scanner;

class CountFactors {
    public static void main(String[] args) {

        //  2. WAJP to print the total number of factors of a number
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        for(int i=1; i<=num/2; i++) {
            if(num % i == 0) { 

                System.out.println("Factor Numbers: "+ i);
                count++;
            }
        }

        System.out.println("Count of factors: "+count);

    }
}