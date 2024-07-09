import java.util.Scanner;

class CheckMagicOrNot {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();

        //  3. WAJP to check whether the number is magic number or not
        // 1252 = Add 1 + 2 + 5 + 2 = 10 = 1 + 0 = 1 if result 1 then its a magic number

        int rem = 0;
        while(num>=10) {
            int sum = 0;
            while(num != 0) {
                rem = num % 10;
                sum = sum + rem;
                num = num / 10;
            }
            num = sum;
        }
        if(num == 1) {
            System.out.println("It's a Magic Number");
        }
        else {
            System.out.println("It's Not a Magic Number");
        }

    }
}