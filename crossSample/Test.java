import java.util.Scanner;
class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a age: ");
        int age = sc.nextInt();

         sc.nextLine();

        System.out.println("Enter a name: ");
        String name = sc.nextLine();

        System.out.println("Age: "+ age);
        System.out.println("Name: "+ name);

    }
}