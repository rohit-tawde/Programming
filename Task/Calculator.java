import java.util.Scanner;
class Calculator {

    public static void addtion(int num1 , int num2) { 

        int add = num1 + num2;
        System.out.println("Addition : "+ add);

    }
    public static void subtraction(int num1 , int num2) { 

        int sub = num1 - num2;
        System.out.println("Subtraction : "+ sub);

    }
     public static void multiplication(int num1 , int num2) { 

        int mul = num1 *num2;
        System.out.println("Multiplication : "+ mul);

    }
     public static void division(int num1 , int num2) { 

        int div = num1/num2;
        System.out.println("Division : "+ div);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean check = true;

        while(check) {

        System.out.println("Enter Number 1st:");
        int num1 = sc.nextInt();

        System.out.println("Enter Number 2nd: ");
        int num2 = sc.nextInt();

        System.out.println("1. Addtion");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");

        System.out.println("Enter Choice: ");
        int choice = sc.nextInt();
        boolean anotherChoice = true;
        
        while(anotherChoice) {

            anotherChoice = false;  
            if(choice>0) {
                switch(choice) {
            case 1:
                addtion(num1, num2);
            break;

             case 2:
                subtraction(num1, num2);
            break;

             case 3:
                multiplication(num1, num2);
            break;

             case 4:
                division(num1, num2);
            break;

            case 5:
                check=false;
            break;

            default:
                System.out.println("Invalid Choice");
             

        }
            }
            else {
                System.out.println("Wrong input Enter Positive Choice: ");
                choice = sc.nextInt();
                anotherChoice = true;
            }
        }

        
    }
    }
}