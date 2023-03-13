
public class functonOverloading {
    public static void main(String[] args) {
        Car ref = new Car();
        ref.details(10);
        ref.details("vassu");
        ref.details(101 , "rushi");
    }

}

class Car {
    // int price;
    // String brand;

    public void details(int price) {
        System.out.println(price);
    }
    public void details(String brand) {
        System.out.println(brand);
    }
    public void details(int price , String brand) {
        System.out.println(price + " " + brand);
    }
}