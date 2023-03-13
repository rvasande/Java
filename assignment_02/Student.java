public class Student {
    private int PRN_No;
    private String name;
    private int college_code;

    public Student(int PRN_No, String name, int college_code) {
        this.PRN_No = PRN_No;
        this.name = name;
        this.college_code = college_code;
    }

    public int getPRN_No() {
        return PRN_No;
    }

    public void setPRN_No(int PRN_No) {
        this.PRN_No = PRN_No;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCollege_code() {
        return college_code;
    }

    public void setCollege_code(int college_code) {
        this.college_code = college_code;
    }
}

 class Stud_Result {
    private int PRN_No;
    private int sub_Code;
    private int marks_Obtained;

    public Stud_Result(int PRN_No, int sub_Code, int marks_Obtained) {
        this.PRN_No = PRN_No;
        this.sub_Code = sub_Code;
        this.marks_Obtained = marks_Obtained;
    }

    public int getPRN_No() {
        return PRN_No;
    }

    public void setPRN_No(int PRN_No) {
        this.PRN_No = PRN_No;
    }

    public int getSub_Code() {
        return sub_Code;
    }

    public void setSub_Code(int sub_Code) {
        this.sub_Code = sub_Code;
    }

    public int getMarks_Obtained() {
        return marks_Obtained;
    }

    public void setMarks_Obtained(int marks_Obtained) {
        this.marks_Obtained = marks_Obtained;
    }
}

 class StudentResult {

    public static Student getTopper(Student[] studentArray, Stud_Result[] studResultArray) {
        int max = 0;
        Student topper = null;
        for (int i = 0; i < studentArray.length; i++) {
            int totalMarks = 0;
            for (int j = 0; j < studResultArray.length; j++) {
                if (studentArray[i].getPRN_No() == studResultArray[j].getPRN_No()) {
                    totalMarks += studResultArray[j].getMarks_Obtained();
                }
            }
            if (totalMarks > max) {
                max = totalMarks;
                topper = studentArray[i];
            }
        }
        return topper;
    }

    public static void main(String[] args) {
        Student[] studentArray = new Student[3];
        studentArray[0] = new Student(001, "John", 1);
        studentArray[1] = new Student(002, "Alice", 1);
        studentArray[2] = new Student(003, "Bob", 1);

        Stud_Result[] studResultArray = new Stud_Result[4];
        studResultArray[0] = new Stud_Result(001, 1, 80);
        studResultArray[1] = new Stud_Result(001, 2, 90);
        studResultArray[2] = new Stud_Result(002, 1, 70);
        studResultArray[3] = new Stud_Result(003, 1, 95);

        System.out.println("Topper is : " + getTopper(studentArray, studResultArray).getName());
    }

}