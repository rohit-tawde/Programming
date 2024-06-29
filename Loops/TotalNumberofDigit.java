import java.util.*;

// WA java program to print total number of digit from a number.

public class TotalNumberofDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        while(num != 0 )
        {
            
            count++;
            num = num / 10;
            
        }
        System.out.println("counted total digits: "+count);
    }
}