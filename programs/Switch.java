import java.util.*;

class Switch{
    public static void main(String args []){
        Scanner inp = new Scanner(System.in);
        // int x = inp.nextInt();
        String a = inp.nextLine();
        System.out.println(a);

        // switch(x){
        //     case 1 : System.out.println("your pressing  1 ");
        //     break;
        //     case 2 : System.out.println("your pressing 2");
        //     break;
        //     default:System.out.println("invalid");
        // }

    switch(a){
        case "hi" : System.out.println(a);
        break;
        default:System.out.println("invalid");
    }


    }
}

