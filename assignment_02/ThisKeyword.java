    
    
public class ThisKeyword { 
    int num; 
    String name; 
  
    // Constructor 1 
    ThisKeyword() 
    { 
        System.out.println("Default Constructor"); 
    } 
  
    // Constructor 2 
    ThisKeyword(int num, String name) 
    { 
        this.num = num; 
        this.name = name; 
    } 
  
    // Method 1 
    void display() 
    { 
        System.out.println("Number is " + num + " and Name is " + name); 
    } 
  
    // Method 2 
    void print() 
    { 
        // Displays the current class name 
        System.out.println("This is the example of this keyword"); 
    } 
  
    // Main Method 
    public static void main(String[] args) 
    { 
        ThisKeyword Obj1 = new ThisKeyword(); 
        ThisKeyword Obj2 = new ThisKeyword(11, "GeeksforGeeks"); 
        Obj1.print(); 
        Obj2.display(); 
    } 
}