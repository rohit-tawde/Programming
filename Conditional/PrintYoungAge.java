/*
    Design an app to read age of three siblings Ramu,
    Raghu and Raju and store them in a variable. 
    The app when executed  should display the age of the 
    youngest sibling. 
*/

import java.util.Scanner;

public class PrintYoungAge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ramu, raghu, raju;

        ramu = sc.nextInt();
        raghu = sc.nextInt();
        raju = sc.nextInt();

        if(ramu < 0 || raghu < 0 || raju < 0) {

            System.out.println("Invalid age");
        }
        else if(ramu < raghu && ramu < raju) {

            System.out.println(ramu);
        }
        else if(raghu < raju) {
            
            System.out.println(raghu);
        }
        else {
            System.out.println(raju);
        }


    }
}