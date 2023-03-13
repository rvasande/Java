import java.util.Scanner;

interface clientInterface{
    void input(); //public + abstract 
    void output(); //public + abstract
}

class developer implements clientInterface{
    String name ; int sal;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name ");
        name = sc.nextLine();
        System.out.println("enter salary");
        sal = sc.nextInt();
    }
    public void output(){
     System.out.println("name of employee is " + name);
     System.out.println("salary of employee is " + sal);
    }

    public static void main(String[] args) {
        // clientInterface ref = new developer(); we can aslo make referance variable of interface
        developer ref = new developer();
        ref.input();
        ref.output();
    }
}