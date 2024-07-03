import java.util.Scanner;

public class Factors
{
    //   1. Write a java program to print the factors of a number

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        System.out.print(1);
    
        for(int i = 2; i<= number/2; i++) {
            if(number % i == 0)
            System.out.print(" ,"+i);
        }
    }
}