import java.util.Scanner;


// 1. WAJP to print the strong number between the range.
class strongNumRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // int num2 = sc.nextInt

        System.out.println("Enter one number: ");
        int num1 = sc.nextInt();

      
            int rem = num1 % 10;
            if(num1 % 10 == 7 || num1 % 7 == 0) {
                System.out.println("its a buzz ");
            }
            else {
                System.out.println("Its not buzz");
            }
        }



}
