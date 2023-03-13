
public class polymorphism {
    public static void main(String args[]) {
        Student ref = new Student();
        ref.rollNo = 33;
        ref.name = "vassu";
        ref.Details(ref.name);
        ref.Details(ref.rollNo);
        ref.Details(ref.rollNo , ref.name);
    }
}

class Student {
    int rollNo;
    String name;

    public void Details(String name) {
        System.out.println(name);
    }

    public void Details(int rollNo) {
        System.out.println(rollNo);
    }

    public void Details(int rollNo, String name) {
        System.out.println(rollNo + " " + name);
    }
}