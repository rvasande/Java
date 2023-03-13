import java.util.*;

class Array {
    public static void main(String args[]) {
        // int[] marks = new int[5];
        // marks[0]=98;
        // marks[1]=28;
        // marks[2]=48;
        // marks[3]=68;
        // marks[4]=58;
        // // System.out.println(marks[0]);
        // // System.out.println(marks[1]);
        // // System.out.println(marks[2]);

        // for(int i = 0;i<5 ; i++){
        // System.out.println(marks[i]);
        // }
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
       int x = sc.nextInt();
   
       
        // output
        for (int i = 0; i < numbers.length; i++) {
            // System.out.println(numbers[i]);
            if(numbers[i]==x){
              System.out.println("number found at index " + i);
            }
        }
        
    }
    
}