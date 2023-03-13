public class Demo {
public static void main(String args []){
    student ref = new student("rushikesh", "mihir");
    // System.out.println(ref);
    ref.name();
}
}

class student {
    String s1;
    String s2;

    student(String a, String b) {
        s1 = a;
        s2 = b;
    }
    void name(){
        System.out.println("student name is " + s1 + " " + s2);
    }
}