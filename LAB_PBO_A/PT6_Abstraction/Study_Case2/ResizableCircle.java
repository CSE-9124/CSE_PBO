package LAB_PBO_A.PT6_Abstraction.Study_Case2;

public class ResizableCircle extends Circle implements Resizable{

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius += radius * percent / 100.0;
    }


}
