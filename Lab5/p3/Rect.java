package Lab5.p3;

import Lab5.p2.TwoD;

public class Rect extends TwoD {
    public void getArea(int... dimensions) {
        int x = dimensions[0];
        int y = dimensions[1];
        System.out.println("Area of Rectangle is: " + x * y);
    }
}
