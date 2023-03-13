public class Program_02 {
    public static void main(String[] args) {
        
        Student ref = new Student(null, 0);
        ref.name="john";
        ref.roll_no=2;
        System.out.println("name of Student " + ref.name + " and roll no is " + ref.roll_no);
    }
}

class Student {
    String name;
    int roll_no;
    Student(String n , int r){
        name = n;
        roll_no = r;
    }
}