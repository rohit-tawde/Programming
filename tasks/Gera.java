class Employees {
    int empID;
    String empName;
    private double salary;
    double increSalary;

   
    Employees(int empID) {
        this.empID = empID;
    }
    Employees(int empID, String empName) {
        this(empID);
        this.empName = empName;
    }
    Employees(int empID, String empName, double salary) {
        this(empID,empName);
        this.salary = salary;
    }

    private void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
            return salary;
    }

    public void empDetails() {
        
        if(empID == 1) {

             increSalary = 0.0;
             increSalary = this.salary * 1.5;

            this.setSalary(increSalary);
            System.out.println("Emp Id:" + empID);
            System.out.println("Emp Name: "+ empName);
            System.out.println("incremented sal: "+ increSalary);
        }

        if(empID == 2) {
            increSalary = 0.0;
            increSalary = this.salary;
            this.setSalary(increSalary);
            System.out.println("Emp Id:" + empID);
            System.out.println("Emp Name: "+ empName);
            System.out.println("incremented sal: "+ increSalary);

        }
        if(empID == 3) {
            increSalary = 0.0;
            increSalary = this.salary * 0.95;
            this.setSalary(increSalary);
            System.out.println("Emp Id:" + empID);
            System.out.println("Emp Name: "+ empName);
            System.out.println("decremented sal: "+ increSalary);

        }
      
       
    }

    }


class Gera {
    public static void main(String[] args) {

        Employees e1 = new Employees(1,"Rohit", 12000);
        Employees e2 = new Employees(2,"Nishikant",14000);
        Employees e3 = new Employees(3,"Akshay",20000);

         e1.empDetails();
         e2.empDetails();
         e3.empDetails();

    }
}


