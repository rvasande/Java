class Employee {
  private int emp_id;
  private String emp_name;
  private double basic_sal;
  private double hra;
  private double medical;
  private double pf;
  private double pt;
  private double net_sal;
  private double gross_sal;
  private static int total_employees = 0;

  // Default Constructor
  public Employee() {
    emp_id = 0;
    emp_name = "";
    basic_sal = 0;
    hra = 0;
    medical = 0;
    pf = 0;
    pt = 0;
    net_sal = 0;
    gross_sal = 0;
  }

  // Parameterized Constructor
  public Employee(int emp_id, String emp_name, double basic_sal, double medical) {
    this.emp_id = emp_id;
    this.emp_name = emp_name;
    this.basic_sal = basic_sal;
    this.medical = medical;
    this.hra = 0.5 * basic_sal;
    this.pf = 0.12 * basic_sal;
    this.pt = 200;
    this.gross_sal = basic_sal + hra + medical;
    this.net_sal = gross_sal - (pt + pf);
    this.total_employees++;
  }

  // Method to display net_sal and gross_sal
  public void displaySalary() {
    System.out.println("Net Salary: " + net_sal);
    System.out.println("Gross Salary: " + gross_sal);
  }

  // Static Method to display total number of employees
  public static void totalEmployees() {
    System.out.println("Total Employees: " + total_employees);
  }

}

//Test Class
public class TestEmployee {
  public static void main(String[] args) {
    Employee emp1 = new Employee(1, "John", 10000.00, 2000.00);
    emp1.displaySalary();
    Employee emp2 = new Employee(2, "David", 15000, 3000);
    emp2.displaySalary();
    Employee.totalEmployees();
  }
}