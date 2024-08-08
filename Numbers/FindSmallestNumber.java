import java.util.Scanner;

// WAJP to print total number of digits from a number
// WAJP to check whether the number is prime number or not
// WAJP to ceheck whether the number is nyon number or not

class FindSmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");

        int num = sc.nextInt();
        int digit = 9;
        int rem = 0;

        while(num != 0) {

            rem = num % 10;

            if(rem<digit)
            {
                digit = rem;
            }
            num = num / 10;
        }

        System.out.println(digit);
    }

}