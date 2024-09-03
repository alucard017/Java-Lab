package Lab5.p3;

import Lab5.p2.TwoD;

public class Circle extends TwoD {
    public void getArea(int... dimensions) {
        int x = dimensions[0];
        System.out.println("Area of Circle is: " + Math.PI * x * x);
    }

    // public void getVolume(int... dimensions) {

    // // System.out.println("Volume of TwoD Shapes is Not Defined");
    // }

}
