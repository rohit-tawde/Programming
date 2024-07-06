import java.util.Scanner;

class checkSpecialNum {
    public static void main(String[] arags) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;
        int mul = 1;
        int originalNum = num;

        while(num != 0) {
            int rem = num % 10;
            sum = sum + rem;
            mul = mul * rem;
            num = num / 10;
        }

        int check = sum + mul;
        if(check == originalNum)
        System.out.println("Its is special number digit");
        else 
        System.out.println("Its not a special number digit");

    }
}