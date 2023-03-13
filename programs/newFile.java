// public class newFile {
    
// }


import java.util.*; 
  
// Class of Area 
class Area 
{ 
    // Length and Breadth of Rectangle 
    private double length, breadth; 
  
    // Set the length and breadth 
    public void setDim(double l, double b) 
    { 
        length = l; 
        breadth = b; 
    } 
  
    // Return the area of Rectangle 
    public double getArea() 
    { 
        return length * breadth; 
    } 
} 
  
// Main Class 
public class newFile
{ 
    public static void main(String[] args) 
    { 
        Scanner s = new Scanner(System.in); 
  
        // Length and breadth of Rectangle 
        double l, b; 
        System.out.println("Enter length of Rectangle: "); 
        l = s.nextDouble(); 
        System.out.println("Enter breadth of Rectangle: "); 
        b = s.nextDouble(); 
    }
}