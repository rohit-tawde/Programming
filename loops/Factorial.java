import java.util.*;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int result = 1;

        for(int i=2; i<=number; i++) {
            result = result * i;
        }

        System.out.println(result);
    }
}