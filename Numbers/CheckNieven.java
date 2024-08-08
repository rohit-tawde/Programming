import java.util.Scanner;

class CheckNieven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int orignalNum = num;

        // ex. 18 is  Nieven Number

        int sum = 0;
        while(num!=0) {
            int rem = num % 10;
            sum = sum + rem;

            num = num / 10;

        }

        if(orignalNum % sum == 0 ) {
            System.out.println("Nieven Number");
        }
        else {
             System.out.println("Not Nieven Number");
        }
    }
}