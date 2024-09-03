package Lab5.p2;

import Lab5.p1.*;

public abstract class ThreeD implements Shape {
    public abstract void getVolume(int... dimensions);

    public void getArea(int... dimensions) {
        System.out.println("Area of ThreeD Shapes is not defined");
    }
}
