class Strings {
    public static void main(String args[]) {
        String fname = "rushikesh";
        String lname = "vasande";
        String fullname = fname + " " + lname;
        // System.out.println(fullname);

        System.out.println(fullname.length());
        for(int i =0; i <fullname.length(); i++){
        System.out.println(fullname.charAt(i));
        }

        String name1 = "tony";
        String name2 = "tony";

        // name1 > name = +tive value will be return
        // name1 = name = 0 will be return
        // name1 < name = -tive value will be return
        // hello wello = wello will be greater

        if (name1.compareTo(name2) == 0) {
            System.out.println("strings are equal");
        } else {
            System.out.println("strings are NOT equal");
        }
    }
}