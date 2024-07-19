import java.util.Scanner;

class checkAutomorphicnNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int square = num * num;
        boolean flag =true;

        while(num != 0) {
            if(num % 10 != square % 10) {
                flag = false;
                break;
            }
            num = num / 10;
            square = square / 10;
        }
        
        if(flag) {
            System.out.println("Automorphic number");
        }
        else {
            System.out.println("Not a Automorphic number");
        }
    }
}