import java.util.Scanner;

// WAJP to check number is xylom or phloem first and last add then add remaining number is same then xyom
// ex. 34326, 1234

class CheckXylon {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int first = 0;
        int last = 0;
        
        while(num!=0) {
            int rem = num % 10;
            last = rem;
            num = num / 10;
            break;
        }

        int sum = 0;

        while(num!=0) {

            int rem = num % 10;
            sum = sum + rem;

            if(rem<10) {
                first = rem;
            }
             
            num = num / 10;
        }

        sum = sum - first;
        System.out.println("Sum of avoiding first and last: "+sum);
        System.out.println("First Number: "+first);
        System.out.println("Last Number: "+last);

        int addFirstLast = first + last;


        System.out.println("Addition of first and last digit: "+addFirstLast);


        if(sum == addFirstLast) {
            System.out.println("The Number Given is Xylon");
        }
        else {
            System.out.println("The Number Given is Phloem");
        }

    }
}


