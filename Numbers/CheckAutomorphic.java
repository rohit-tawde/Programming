import java.util.Scanner;
class CheckAutomorphic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int square = num * num;
        int lastdigit = 0;
        int anotherLast = 0;
        
        while(square != 0) {
            int rem = square % 10;

             lastdigit = rem;

            break;
        }

        System.out.println(lastdigit);

        while(num != 0) {
            int rem = num % 10;
            anotherLast = rem;
            break;
        }

        if(lastdigit == anotherLast) {
            System.out.println("Automorphic Number");
        }
        else {
            System.out.println("Not Automorphic Number");
        }

    }
}