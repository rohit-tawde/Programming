import java.util.Scanner;

class CheckNeonNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalNum = num;
        int square = num * num;
        int sum = 0;

        while(square!=0) {
            int rem = square % 10;
            sum = sum + rem;
            square = square / 10;
        }

        if(originalNum==sum) {
            System.out.println("It's a Neon Number");
        }
        else {
            System.out.println("It's Not a Neon Number");
        }

    }

}