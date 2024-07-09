import java.util.Scanner;

public class FindLcm {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int i = num1 > num2 ? num1 : num2;

        while(true) {
            if(i % num1 == 0 && i % num2 == 0) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}