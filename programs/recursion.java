public class recursion {
  
        static void display(){
            System.out.println("recursion method");
            display();
        }
    
    public static void main(String[] args) {
        display();
    }
}
