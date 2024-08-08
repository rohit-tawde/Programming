import java.util.Scanner;

class FindLargeNumber {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int large = 0;
        int rem = 0;

        while(num != 0) {
            rem = num % 10;
           if(large<rem) {
              large = rem;
           }
            num = num / 10;
        }

        System.out.println("Largest Digits is: "+large);
    }
}