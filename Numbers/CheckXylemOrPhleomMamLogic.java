import java.util.Scanner;

class CheckXylemOrPhleomMamLogic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        // Ex. 34326 

        int sum1 = 0;
        int sum2 = 0;

        // To store last digit 
        sum1 = num % 10;
        num = num / 10;

        while(num > 9)
        {
            sum2 = sum2 + num % 10;
            num = num / 10;
        }
        sum1 = sum1 + num;

        if(sum1==sum2) {
            System.out.println("It's a Xylem Number");
        }
        else {
            System.out.println("It's a Phleom Number");
        }

    }
}