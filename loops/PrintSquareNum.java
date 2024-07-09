import java.util.Scanner;

class PrintSquareNum {

    public static void main(String[] args) {

    // 5. WAJP to print the sqaure of a number
    
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int square = num * num;

        System.out.println("Square Number: "+square);


    }
}