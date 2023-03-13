class vehicle{
    public void show(){
        System.out.println("vehicle has so many types");
    }
}

class car extends vehicle{
    @Override
    public void show(){
        System.out.println("vehicle types is car");
    }
}

public class overriding {
    public static void main(String[] args) {
        car ref = new car();
        ref.show();
    }
}
