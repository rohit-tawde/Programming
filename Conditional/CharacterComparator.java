/*
    Program to check smaller character of given char inputs 
*/
import java.util.Scanner;

public class CharacterComparator {
    public static void main(String[] args) {
        // Step 1: Create 2 char variables
        char ch1, ch2;
        
        // Step 2: Read characters
        Scanner s = new Scanner(System.in);
        ch1 = s.next().charAt(0);
        ch2 = s.next().charAt(0);
        
        // Logic to determine the smaller character
        if (ch1 < ch2) {
            System.out.println(ch1);
        } else {
            System.out.println(ch2);
        }
    }
}
