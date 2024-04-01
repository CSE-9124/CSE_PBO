package LAB_PBO_A.PT3_Attribute_Behavior_dan_Constructor;

public class Student_Attribute {
    // Attribut
        String fullName;
        String studyProgram;
        int age;
        double gpa;
        boolean isMale;

    // Keyword 'this'
    public Student_Attribute(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
