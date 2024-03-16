package Latihan;

public class Main2 {
    public static void main(String[] args) {
        // JAVA TYPE CASTING :
        System.out.println("JAVA TYPE CASTING");
        // Widening Casting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        
        System.out.println(myInt);      // Output: 9
        System.out.println(myDouble);   // Output: 9.0
        
        // Narrowing Casting
        double MyDouble = 9.78d;
        int MyInt = (int) myDouble; // Manual casting: double to int
    
        System.out.println(MyDouble);   // Outputs 9.78
        System.out.println(MyInt);      // Outputs 9
        
        // JAVA OPERATORS :
        System.out.println("JAVA OPERATORS");
        // Arithmetic
        int Number = 16;
        ++Number; // Increases the value variable by 1
        System.out.println(Number);
        --Number; // Decreases the value variable by 1
        System.out.println(Number);
        
        // Assignment
        Number |= 39;
        System.out.println(Number);
    }
}
