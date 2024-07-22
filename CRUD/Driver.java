
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter School Branch");
        String area = sc.next();

       
        School s = new School("Kendriy Vidyalaya", area);

        // Student s;

         
         boolean exit = true;
        while(exit) { 

         System.out.println("Enter Choice \n1.Login \n2.Logout \n3.Student Details \n4.Update Details");
         int choice = sc.nextInt();

        switch(choice) {

            case 1: {
                s.login();
            }
            break;
            case 2: {
                s.logout();
            }    
            break;
            case 3: {
                s.studentDetails();
            }
            break;
            case 4: {
                s.updateDetails();
            }
            break;
            case 5: {
               exit = false; 
               System.out.println("Application Closed...");
            }
            break;
            default: {
                System.out.println("Invalid Choice");
            }

        }


        }
    }
}