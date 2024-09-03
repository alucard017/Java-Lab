package Lab5;

import Lab5.p1.*;
import Lab5.p3.*;

public class Main {
    public static void main(String[] args) {
        Shape s = (Circle) Shape.getShape("circle");
        s.getArea(10);
        s.getVolume();
        System.out.println();

        Shape s1 = (Sphere) Shape.getShape("sphere");
        s1.getVolume(5);
        s1.getArea();
        System.out.println();

        Shape r = (Rect) Shape.getShape("rectangle");
        r.getArea(5, 3);
        r.getVolume();
        System.out.println();
    }
}
