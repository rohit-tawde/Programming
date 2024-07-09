import java.util.Scanner;

class CheckLargeDigit {
    public static void main(String[] args) {

//   6. WAJP to print the largest digit from a given number 

        Scanner sc= new Scanner(System.in);

        int num =sc.nextInt();
        int digit = 0;

        while(num != 0) {

            int rem = num % 10;
            
           if(digit<rem) {
            digit = rem;
           }
           num = num / 10;

        }

        System.out.println(digit);
    }
}