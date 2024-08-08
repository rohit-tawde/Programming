import java.util.Scanner;

class CountNumber {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        while(num != 0) {
            count++;
            num = num / 10;
        }
        System.out.println("Total Number of Digits: "+count);
    }
}