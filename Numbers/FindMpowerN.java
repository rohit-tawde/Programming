import java.util.Scanner;


// Find out  the m power n
class FindMpowerN {
    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter M: ");
        int m = sc.nextInt();

        System.out.println("Enter N: ");
        int n = sc.nextInt();

        int power = 1;

        for(int i = 1; i<=n; i++) {

            power = power * m;
    
        }

        System.out.println("M power N is : "+power);
    }
}

