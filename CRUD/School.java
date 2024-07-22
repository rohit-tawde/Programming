import java.util.Scanner;

public class School {

    String sName;
    String area;

    Student s;
    Scanner sc = new Scanner(System.in);

    School(String sName, String area) {
        this.sName = sName;
        this.area = area;
    }
    public void login() {

        if(this.s == null) {
            System.out.println("Enter Your Name: ");
            String name = sc.next();

            System.out.println("Enter Your Id: ");
            int id = sc.nextInt();

            System.out.println("Enter Your Std: ");
            int std = sc.nextInt();

            this.s = new Student(name,id,std);
            System.out.println("Login Successfull...");


        }
    }

    public void logout() {

        if(this.s==null) {
            System.out.println("First Login...");
        }
        else {
            this.s=null;
            System.out.println("Logout Successfull...");
        }
    }

    public void studentDetails() {
        if(this.s==null) {
            System.out.println("First Login...");
        }
        else {
            System.out.println("--------"+sName+"---------");
            System.out.println("Student Name: "+ s.getStudName());
            System.out.println("Student Id: "+s.getId());
            System.out.println("Student Std: "+s.getStd());
        }

    }
    public void updateDetails() {
            if(this.s==null) {
                System.out.println("First Login");
            }
            else {

                System.out.println("Enter Your Std: ");
                int std = sc.nextInt();

                s.setStd(std);

                System.out.println("Update Successfull...");
            }
    }
}