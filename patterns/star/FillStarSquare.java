import java.util.*;
class FillStarSquare {
    public static void main(String[] arags) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int column = sc.nextInt();


        for(int i=1; i<=row; i++) {
            for(int j=1; j<=column; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }





    }
}