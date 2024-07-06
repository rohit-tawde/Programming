import java.util.Scanner;

class checkAutomorphicnNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int square = num * num;
        int rem1 =0;

        while(num != 0) {
            rem1 = num % 10;
            break;
        }
        while(square != 0) {
            int rem2 = square % 10;
            if(rem1==rem2) {
                System.out.println("Its a automorphic number");
                break;
            }
            else {
                System.out.println("Its not a automorphic number");
                
            }
            break;

        }
    }
}