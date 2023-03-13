import java.util.*;

class ArrayRevision{
   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int size = sc.nextInt();
//     int numbers[] =new int [size];

//     for(int i = 0;i<size;i++){
//         numbers[i] = sc.nextInt();
//     }
//     int x = sc.nextInt();
//     for(int i = 0; i<size;i++){
//         // System.out.println(numbers[i]);
//         if(numbers[i]== x){
//   System.out.println("number found at index " + i);
//         }
//     }

Scanner sc = new Scanner(System.in);
int size = sc.nextInt();
int numbers[]= new int[size];

for(int i=0;i<numbers.length;i++){
    numbers[i]=sc.nextInt();
}
int x = sc.nextInt();

for(int i =0; i<size ;i++){
    // System.out.println(numbers[i]);
    if(numbers[i]==x){
System.out.println("number found at index : " + i);
    }
}

   } 
    
}