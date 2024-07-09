import java.util.Scanner;

class checkTwistedPrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 0;
        int rev = 0;
        int count2 = 0; 


        for(int i=2; i<num; i++ ) {

            if(num%i==0) {
                count++;
            }
        }
        if(count==0) {
            System.out.println("Prime Number");

            while(num != 0) {
                int rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
                
            }
            for(int i=2; i<=rev; i++) {
                if(rev % i == 0) {
                    count2++;
                }
                if(count2 == 0) {
                System.out.println("Its a Twisted Prime Number");
                  break;
                }
            }
            
        }
        else {
            System.out.println("Not a Prime Number");
        }

    }
}