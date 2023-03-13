
public class Program_03 {
public static void main(String[] args) {
  Student ref = new Student();
  ref.show("sam","8830749985" ,11);  
  System.out.println();
  ref.show("john","8830468808" ,22);  
}
    
}
class Student{

public void show(String name  , String phone , int roll_no ){
System.out.println("name of Student is " + name);
System.out.println("phone number of Student is " + phone);
System.out.println("roll no of Student is " + roll_no);
}
}