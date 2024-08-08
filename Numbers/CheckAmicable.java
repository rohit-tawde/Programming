    import java.util.Scanner;

    class CheckAmicable {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Number 1: ");
            int num1 = sc.nextInt();

            System.out.println("Enter Number 2: ");
            int num2 = sc.nextInt();

            // Ex. 220, 284
            int sum1 = 0;

            for(int i=1; i<num1; i++) {

                if(num1%i==0) {
                sum1 = sum1 + i;
                }
                
            }

            int sum2 = 0;
            for(int i=1; i<num2; i++) {
                if(num2%i==0) {
                sum2 = sum2 + i;
                }
            }

            if(sum1 == num2 && sum2 == num1) {
                System.out.println("Amicable Pair");
            }
            else {
                System.out.println("Not Amicable Pair");
            }


        }
    }

