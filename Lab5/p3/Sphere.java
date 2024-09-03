package Lab5.p3;

import Lab5.p2.ThreeD;

public class Sphere extends ThreeD {
    public void getVolume(int... dimensions) {
        int x = dimensions[0];
        System.out.println("Volume of Sphere is: " + (4 / 3) * Math.PI * x * x * x);
    }
}
