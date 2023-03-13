class rectangle{
    int lenght ; int breadth;
    rectangle(int a , int b){
      lenght = a;
     breadth = b;
    }
    int area(){
        return (lenght*breadth);
    }
}
class constructor {
public static void main(String args[]){
    rectangle ref = new rectangle(20, 10);
    int out =ref.area();
    System.out.println(ref.lenght);
    System.out.println(ref.breadth);
    System.out.println(out);
}
}