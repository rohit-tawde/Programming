import java.util.Scanner;

class CheckPrime {
    public static void main(String[] args) {
        System.out.println("Enter a Number ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        boolean ans = false;

        for(int i=1; i<=num; i++) {

        if(num%i==0 && num%num==0) {
           ans = true;
        }
        else {
            ans=false;
        }
        }

        if(ans) {
            System.out.println("Number is prime");
        }
        else {
            System.out.println("Number is not a prime");
        }
    }
}