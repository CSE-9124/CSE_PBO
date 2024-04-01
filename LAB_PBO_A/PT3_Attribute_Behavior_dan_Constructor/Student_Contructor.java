package LAB_PBO_A.PT3_Attribute_Behavior_dan_Constructor;

public class Student_Contructor {
    String fullName, studyProgram;
    double gpa;

    public void showStudentData() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Study Program: " + studyProgram);
        System.out.println("GPA: " + gpa);
    }
    
    // Constructor
        public Student_Contructor(String fullName, String studyProgram, double gpa) {
            this.fullName = fullName;
            this.studyProgram = studyProgram;
            this.gpa = gpa;
        }

    // Multiple Constructor
        public Student_Contructor() {}

        public Student_Contructor(String fullName) {
            this.fullName = fullName;
        }


    public static void main(String[] args) {
        Student_Contructor student = new Student_Contructor("Cholyn Sharon E.", "Information System", 4.0);
        student.showStudentData();
    }
}
