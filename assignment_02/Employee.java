class Employee {
    private int Emp_id;
    private String Emp_Name;
    private double Basic_Sal;
    private double Hra;
    private double Medical;
    private double Pf;
    private double Pt;
    private double Net_Sal;
    private double Gross_Sal;
    private static int totalEmployees;
 
    // Default constructor 
    Employee() {
       Emp_id = 0;
       Emp_Name = "";
       Basic_Sal = 0.0;
       Hra = 0.0;
       Medical = 0.0;
       Pf = 0.0;
       Pt = 0.0;
       Net_Sal = 0.0;
       Gross_Sal = 0.0;
    }
 
    // Parameterized constructor 
    Employee(int Emp_id, String Emp_Name, double Basic_Sal, double Medical) {
       this.Emp_id = Emp_id;
       this.Emp_Name = Emp_Name;
       this.Basic_Sal = Basic_Sal;
       this.Medical = Medical;
       Hra = Basic_Sal * 0.5;
       Pf = Basic_Sal * 0.12;
       Pt = 200;
       Gross_Sal = Basic_Sal + Hra + Medical;
       Net_Sal = Gross_Sal - (Pt + Pf);
       totalEmployees++;
    }
 
    // Method to calculate net and gross salary
    public void calculateSalary() {
       Gross_Sal = Basic_Sal + Hra + Medical;
       Net_Sal = Gross_Sal - (Pt + Pf);
    }
 
    // Method to display employee details
    public void displayEmployeeDetails() {
       System.out.println("Employee id: " + Emp_id);
       System.out.println("Employee name: " + Emp_Name);
       System.out.println("Basic Salary: " + Basic_Sal);
       System.out.println("Gross Salary: " + Gross_Sal);
       System.out.println("Net Salary: " + Net_Sal);
    }
 
    // Method to get total number of employees
    public static int totalEmployees() {
       return totalEmployees;
    }

    public static void main(String[] args) {
        Employee ref  = new Employee(11,"rushikesh",10000.00,5000.0808);
        ref.totalEmployees();
    }
 }