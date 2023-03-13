interface A {
    void show();
}

interface B extends A {
    void display();
}

class C implements B {
    public void show() {
        System.out.println("interface A");
    }

    public void display() {
        System.out.println("interface B");
    }

    public void dis() {
        System.out.println("class c");
    }

    public static void main(String[] args) {
        C ref = new C();
        ref.show();
        // ref.display();
        ref.dis();
    }
}
