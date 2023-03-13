public class ThisKeywordExample{ 
    int num1; 
    int num2; 
  
    ThisKeywordExample(){ 
        System.out.println("Default Constructor"); 
    } 
  
    ThisKeywordExample(int num1, int num2){ 
        this.num1 = num1; 
        this.num2 = num2; 
    } 
  
    void display(){ 
        System.out.println("Value of num1 = "+num1); 
        System.out.println("Value of num2 = "+num2); 
    } 
  
    public static void main(String[] args){ 
        ThisKeywordExample obj1 = new ThisKeywordExample(); 
        ThisKeywordExample obj2 = new ThisKeywordExample(10, 20); 
        obj1.display(); 
        obj2.display(); 
    } 
}