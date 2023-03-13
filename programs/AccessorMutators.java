
public class AccessorMutators {

    public static void main(String[] args) {
        Student ref = new Student();
        ref.setName("vassu");
        System.out.println(ref.getName());
        ref.setNum(101);
        System.out.println(ref.getNum());
    }

}

class Student {
    private String name;
    private int num;

    public void setNum(int n) {
        this.num = n;
    }

    public int getNum() {
        return this.num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}