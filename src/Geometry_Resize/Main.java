package Geometry_Resize;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Shape [] shape =new Shape[3];
            shape[0] =new Circle();
            shape[1] =new Rectangle();
            shape[2] =new Square();
        Random rd = new Random();
            double resize =  rd.nextDouble()*101;
        for(int i =0 ; i< shape.length;i++){
            double area_Resize = shape[i].getResize(resize);
            System.out.println("area" +area_Resize);
        }


    }
}
