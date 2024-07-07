import java.util.Scanner;

class checkDisariumNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        // Calculate the number of digits in num
        int temp = num;
        int count = 0;
        while(temp != 0) {
           temp = temp / 10;
           count++;
        }
        System.out.println("Number of digits: " + count);

        // Calculate the sum of digits raised to their respective positions
        temp = num;
        int sum = 0;
        int currentCount = count;
        while(temp > 0) {
            int rem = temp % 10;
            int product = 1;
            for(int i = 1; i <= currentCount; i++) {
                product *= rem;
            }
            sum += product;
            currentCount--;
            temp = temp / 10;
        }

        // Check if sum is equal to the original number
        if(sum == num) {
            System.out.println(num + " is a Disarium number");
        } else {
            System.out.println(num + " is not a Disarium number");
        }
    }
}
