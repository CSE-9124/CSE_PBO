package LAB_PBO_A.PT3_Attribute_Behavior_dan_Constructor;

import java.util.Scanner;

public class Student_Behavior {
    String fullName, studyProgram;
    double gpa;

    // Behavior
        public void showStudentData() {
            System.out.println("Full Name: " + fullName);
            System.out.println("Study Program: " + studyProgram);
            System.out.println("GPA: " + gpa);
        }

        public String getGradingScale() {
            String gradingScale = "";

            if (gpa >= 3.5) {
                gradingScale = "Cum Laude";
            } else if (gpa >= 3.0) {
                gradingScale = "Magna Cum Laude";
            } else if (gpa >= 2.5) {
                gradingScale = "Good";
            } else {
                gradingScale = "Not Meeting Criteria";
            }

            return gradingScale;
        }


    public static void main(String[] args) {
        // Create a new instance object of Student class
        Student_Behavior student = new Student_Behavior();

        Scanner scan = new Scanner(System.in);

        // Fill in the attribute values
        System.out.println("----> Inputan <----");
        System.out.print("Input Full Name \t: ");
        student.fullName = scan.nextLine();

        System.out.print("Input Study Program \t: ");
        student.studyProgram = scan.nextLine();
        
        System.out.print("Input GPA \t\t: ");
        student.gpa = scan.nextDouble();

        // Call the showStudentData() method
        System.out.println("\n----> Information <----");
        student.showStudentData();

        // Call the getGradingScale() method
        System.out.println("Grade Scale: " + student.getGradingScale());

        scan.close();
    }
}
