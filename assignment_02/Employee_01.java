public class Employee_01 {
  double salary;
  double hours;

  public Employee_01(double salary, double hours) {
    this.salary = salary;
    this.hours = hours;
  }

  public void getInfo() {
    System.out.println("Salary: " + salary);
    System.out.println("Hours of work per day: " + hours);
  }

  public double AddSal() {
    if (salary < 500) {
      salary = salary + 10;
    }
    return salary;
  }

  public double AddWork() {
    if (hours > 6) {
      salary = salary + 5;
    }
    return salary;
  }

  public static void main(String[] args) {
    Employee_01 e1 = new Employee_01(400, 8);
    e1.getInfo();
    double finalSalary = e1.AddSal() + e1.AddWork();
    System.out.println("Final salary: " + finalSalary);
  }
}