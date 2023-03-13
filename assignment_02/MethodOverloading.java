public class MethodOverloading {
	
	//overloaded add() method for integer
	public static int add(int a, int b) 
    { 
        return a + b; 
    } 
  
    //overloaded add() method for String
    public static String add(String a, String b) 
    { 
        return a + b; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        System.out.println(add(10, 20)); 
        System.out.println(add("Hello", " World")); 
    } 

}