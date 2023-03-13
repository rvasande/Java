public class Staff {
    String name;
    String birthDate;
    String designation;
    double salary;
    
    public Staff(String name, String birthDate, String designation, double salary) {
      this.name = name;
      this.birthDate = birthDate;
      this.designation = designation;
      this.salary = salary;
    }
    
    public void display() {
      System.out.println("Name: " + name);
      System.out.println("Birth Date: " + birthDate);
      System.out.println("Designation: " + designation);
      System.out.println("Salary: " + salary);
    }
    
    public static void main(String[] args) {
      Staff staff1 = new Staff("John", "01/01/1980", "Manager", 10000);
      Staff staff2 = new Staff("Mary", "02/02/1975", "Supervisor", 20000);
      Staff staff3 = new Staff("James", "03/03/1970", "CEO", 30000);
      Staff staff4 = new Staff("Dave", "04/04/1965", "CFO", 40000);
      Staff staff5 = new Staff("Lisa", "05/05/1960", "Assistant", 5000);
      
      double lowestSalary = staff1.salary;
      Staff staffWithLowestSalary = staff1;
      
      if (staff2.salary < lowestSalary) {
        lowestSalary = staff2.salary;
        staffWithLowestSalary = staff2;
      }
      if (staff3.salary < lowestSalary) {
        lowestSalary = staff3.salary;
        staffWithLowestSalary = staff3;
      }
      if (staff4.salary < lowestSalary) {
        lowestSalary = staff4.salary;
        staffWithLowestSalary = staff4;
      }
      if (staff5.salary < lowestSalary) {
        lowestSalary = staff5.salary;
        staffWithLowestSalary = staff5;
      }
      
      System.out.println("Staff with the lowest salary: ");
      staffWithLowestSalary.display();
    }
  }