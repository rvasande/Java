
public class InnerClasses {

    public static void main(String[] args) {

        // Outer class
        class OuterClass {

            // Inner class
            class InnerClass {
                public void display() {
                    System.out.println("Inside InnerClass");
                }
            }
        }

        // Creating object of InnerClass
        OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
        innerClass.display();
    }
}