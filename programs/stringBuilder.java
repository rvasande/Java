class stringBuilder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        sb.insert(0, 's');
        System.out.println(sb);

        sb.insert(3, 'n');
        System.out.println(sb);

        sb.delete(0, 1);
        System.out.println(sb);

        StringBuilder str = new StringBuilder("h");
        str.append('e');
        str.append('l');
        str.append('l');
        str.append('o');
        System.out.println(str);

        // for(int i =0;i<sb.length();i++){
        // System.out.println(sb.charAt(i));

        // }
    }
}