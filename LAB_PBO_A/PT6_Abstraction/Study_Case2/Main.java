package LAB_PBO_A.PT6_Abstraction.Study_Case2;

public class Main {
    public static void main(String[] args) {
        ResizableCircle circle = new ResizableCircle(7.0);

        System.out.println("Perimeter of original ResizableCircle: " + circle.getPerimeter());
        System.out.println("Area of original ResizableCircle: " + circle.getArea());
        
        circle.resize(50);

        System.out.println("\nPerimeter of resized ResizableCircle: " + circle.getPerimeter());
        System.out.println("Area of resized ResizableCircle: " + circle.getArea());
    }
    
    
}
