package Lab5.p2;

import Lab5.p1.*;

public abstract class TwoD implements Shape {
    public abstract void getArea(int... dimensions);

    public void getVolume(int... dimensions) {
        System.out.println("Volume of TwoD Shapes is not defined");
    }
}
