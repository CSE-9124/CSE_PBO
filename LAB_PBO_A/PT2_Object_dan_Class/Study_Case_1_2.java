package LAB_PBO_A.PT2_Object_dan_Class;

import java.util.Scanner;

class Retangled {
    double lenght;
    double width;

    void calculateArea() {
        double luas = lenght * width;
        System.out.println(luas);
    }

    double calculateParamiter(){
        return 2 * (lenght + width);
    }
}

public class Study_Case_1_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Retangled obj = new Retangled();
        System.out.print("Input Panjang : ");
        obj.lenght = scan.nextDouble();
        System.out.print("Input Lebar : ");
        obj.width = scan.nextDouble();
    
        obj.calculateArea();
        System.out.println(obj.calculateParamiter());
        
        scan.close();
    }
    
}