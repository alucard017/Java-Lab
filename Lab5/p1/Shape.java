package Lab5.p1;

import Lab5.p3.*;

public interface Shape {
    public static Shape getShape(String type) {
        Shape s = null;
        switch (type) {
            case "circle":
                s = new Circle();
                break;
            case "rectangle":
                s = new Rect();
                break;
            case "sphere":
                s = new Sphere();
                break;
            default:
                s = null;
        }

        return s;
    }

    public void getArea(int... dimensions);

    public void getVolume(int... dimensions);
}