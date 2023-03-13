
public class StudentNew {
String name , address;
long phone;
   
public void sam(){
name = "sam";
address = "bavdhan , pune";
phone = 9922663266l;
System.out.println("name of student is " + name);
System.out.println("address of student is " + address);
System.out.println("phone no of student is " + phone);
}

public void john(){
name = "john";
address = "kothrud , pune";
phone = 8830464838l;
System.out.println("name of student is " + name);
System.out.println("address of student is " + address);
System.out.println("phone no of student is " + phone);
} 

public static void main(String[] args) {
StudentNew obj = new StudentNew();
obj.sam();   
System.out.println();
obj.john();   

}
}