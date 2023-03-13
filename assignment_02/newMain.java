class OuterClass { 
    // Static nested class 
    static class NestedClass { 
        public void printMessage() 
        { 
            System.out.println("This is a static nested class."); 
        } 
    } 
} 

public class newMain { 
    public static void main(String[] args) 
    { 
        // Creating an instance of the static nested class 
        OuterClass.NestedClass nestedObject 
            = new OuterClass.NestedClass(); 
  
        // Accessing the printMessage method of the static nested class 
        nestedObject.printMessage(); 
    } 
} 