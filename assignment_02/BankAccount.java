public class BankAccount { 
  
    String depositorName; 
    int accountNumber; 
    String typeOfAccount; 
    double balanceAmount; 
  
    BankAccount(String name, int number, String type, double balance) 
    { 
        this.depositorName = name; 
        this.accountNumber = number; 
        this.typeOfAccount = type; 
        this.balanceAmount = balance; 
    } 
  
    // This will assign initial values  
    public void assignInitialValues(double balance) 
    { 
        this.balanceAmount = balance; 
    } 
  
    // This will deposit an amount 
    public void depositAmount(double amount) 
    { 
        this.balanceAmount = this.balanceAmount + amount; 
    } 
  
    // This will withdraw an amount 
    public void withdrawAmount(double amount) 
    { 
        if (this.balanceAmount > amount) 
        { 
            this.balanceAmount = this.balanceAmount - amount; 
        } 
        else
        { 
            System.out.println("Insufficient Balance"); 
        } 
    } 
  
    // This will display the name and balance 
    public void displayDetails() 
    { 
        System.out.println("Name: " + this.depositorName); 
        System.out.println("Account Number: " + this.accountNumber); 
        System.out.println("Type of Account: " + this.typeOfAccount); 
        System.out.println("Balance Amount: " + this.balanceAmount); 
    } 
} 

// Main Function 
 class Main { 
  
    public static void main(String[] args) 
    { 
        // Creating the objects of BankAccount 
        BankAccount one = new BankAccount("John", 12345, 
                                          "Saving", 5000.00); 
        BankAccount two = new BankAccount("David", 22456, 
                                          "Current", 25000.00); 
  
        one.assignInitialValues(5000.00); 
        two.assignInitialValues(25000.00); 
  
        one.depositAmount(3000.00); 
        two.withdrawAmount(6000.00); 
  
        one.displayDetails(); 
        two.displayDetails(); 
    } 
}