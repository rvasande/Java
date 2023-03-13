class WhileLoop{
    public static void main(String args[]){
        int i = 0;
        while(i<5){
            System.out.println("hello world");
            i++;
        }

        int n = 0;
        do{
            System.out.println(n + " condition is false");
            n++;
        }while(n == 5);
    }
}