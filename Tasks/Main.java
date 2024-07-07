class Main{

    int id;
    String name;
    String designation;
    double salary;
    String department;


    Main(int id) {

        this.id = id;

    }
    Main(int id, String name) {
        this(id);
        this.name = name;   
    }
    Main(int id, String name, String designation) {

        this(id,name);
        this.designation = designation;

    }
    Main(int id, String name, String designation, double salary) {

        this(id,name,designation);
        this.salary = salary;
    }
    Main(int id , String name , String designation, double salary, String department) {

        this(id, name, designation, salary);
        this.department = department;

    }
    public static void main(String []args){
      Main m1 = new Main(10,"Rohit","Software Engineer", 2.5, "Testing");
      Main m2 = new Main(20,"Nishikant","Senior Engineer", 5.3, "Development");
      Main m3 = new Main(30,"Ankit","Junior Engineer", 3.4, "Testing");
      Main m4 = new Main(40,"Rahul","Senior Engineer", 4.5, "Development");
      Main m5 = new Main(50,"Akshay","Software Engineer", 3.3, "Testing");


      System.out.println("Emp Id: "+m1.id);
      System.out.println("Emp Name: "+m1.name);
      System.out.println("Emp Designation: "+ m1.designation);
      System.out.println("Emp Salary: "+ m1.salary+"LPA");
      System.out.println("Emp Department: "+ m1.department);

      System.out.println("-----------------------");
      
      System.out.println("Emp Id: "+m2.id);
      System.out.println("Emp Name: "+m2.name);
      System.out.println("Emp Designation: "+ m2.designation);
      System.out.println("Emp Salary: "+ m2.salary+"LPA");
      System.out.println("Emp Department: "+ m2.department);

      System.out.println("-----------------------");

      System.out.println("Emp Id: "+m3.id);
      System.out.println("Emp Name: "+m3.name);
      System.out.println("Emp Designation: "+ m3.designation);
      System.out.println("Emp Salary: "+ m3.salary+"LPA");
      System.out.println("Emp Department: "+ m3.department);

      System.out.println("-----------------------");

      System.out.println("Emp Id: "+m4.id);
      System.out.println("Emp Name: "+m4.name);
      System.out.println("Emp Designation: "+ m4.designation);
      System.out.println("Emp Salary: "+ m4.salary+"LPA");
      System.out.println("Emp Department: "+ m4.department);

      System.out.println("-----------------------");  

      System.out.println("Emp Id: "+m5.id);
      System.out.println("Emp Name: "+m5.name);
      System.out.println("Emp Designation: "+ m5.designation);
      System.out.println("Emp Salary: "+ m5.salary+"LPA");
      System.out.println("Emp Department: "+ m5.department);

    }
}