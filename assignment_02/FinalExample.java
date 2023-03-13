public class FinalExample { 
  
    // final variable 
    final int MAX_VALUE = 100; 
  
    public static void main(String args[]) 
    { 
        // final variable 
        final int LOCAL_VAR = 50; 
  
        // Error: cannot assign a value to final variable 
        // LOCAL_VAR = 75; 
  
        FinalExample obj = new FinalExample(); 
  
        // Error: cannot assign a value to final variable 
        // obj.MAX_VALUE = 200; 
    } 
}