
public class OOPS {
    public static void main(String[] args) {
        Details ref = new Details();
        ref.brand = "TATA";
        ref.color = "red";
        ref.show();
        Car ref2 = new Car(10000, "bmw");
        ref2.show();
    }
}

class Details {
    String color;
    String brand;

    public void show() {
        System.out.println(this.color);
        System.out.println(this.brand);
    }
}

class Car {
    int price;
    String brand;

    Car(int a, String b) {
        this.price = a;
        this.brand = b;
    }
    void show(){
        System.out.println(price + " " + brand);
    }
}