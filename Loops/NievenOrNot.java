import java.util.*;

class NievenOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 5. WAJP to check whether the number is Nieven number or not
        // ex. 6804 = 6 + 8 + 0 + 4 = 18 then devide 6804/18== reminder 0 then Nieven number

        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        int product = 1;
        int add = 0;
        while(num != 0) {
            sum = sum + num % 10;
            product = product * (num % 10); // BODMAS RUlE 
            num = num / 10;
        }

        


    }
}