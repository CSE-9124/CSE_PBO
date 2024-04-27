package LAB_PBO_A.PT6_Abstraction.A_Abstract_Class;

public class PlaneApp{

    public static void main(String[] args) {
        // Plane plane = new Plane() {
        //     @Override
        //     public String getPlaneName() {
        //         return null;
        //     }
        // };

        Rectangle obj = new Rectangle();
        System.out.println(obj.getPlaneName());
        System.out.println(obj.getDimension());
    }
}