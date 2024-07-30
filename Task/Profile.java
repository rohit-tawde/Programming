import java.util.Scanner;
class Profile {

    int sid;
    String name;

    public void setId(int sid) {

        this.sid = sid;

    }
    public void setName(String name) {

        this.name = name;

    }

    public static void main(String[] args) {

        Profile p1 = new Profile();

        System.out.println("Student Id: "+ p1.sid);
        System.out.println("Student Name: "+ p1.name);

        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to update your details: (Yes/No)");
        String ans = sc.next();

        if(ans.equals("Yes") || ans.equals("yes")) {

            System.out.println("What You want to update: (sid/name/both)");
            String ans1 = sc.next();

            if(ans1.equals("sid") || ans1.equals("Sid")) {
                
                System.out.println("Enter sid: ");
                int sid = sc.nextInt();
                p1.setId(sid);

                System.out.println("Student Id: "+ p1.sid);

            }
            else if(ans1.equals("name")) {
               
                System.out.println("Enter Name: ");
                String name = sc.next();
                p1.setName(name);
                
                System.out.println("Student Id: "+ p1.sid);
                System.out.println("Student Id: "+ p1.name);


            }
            else {
               
                System.out.println("Enter sid: ");
                int sid = sc.nextInt();
                p1.setId(sid);

                System.out.println("Enter Name: ");
                String name = sc.next();
                p1.setName(name);

                System.out.println("Student Id: "+ p1.sid);
                System.out.println("Student Id: "+ p1.name);


            }

        }
        else {
            System.out.println("Thanks ");
        }
    }
}