
public class StaticInner {

    int a = 10;
    static int b = 20;

    static void show() {
        System.out.println("this is outer class");
    }

    static class inner {
         inner(){
            System.out.println("this is inner class");
            System.out.println(b);
            show();
         }
    }

    public static void main(String[] args) {
        StaticInner.inner ref = new StaticInner.inner();
        StaticInner.show();
}
}