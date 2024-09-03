package Lab4.New;

import Lab4.New.*;

public class Child4 {
    public void access1() {
        System.out.println("Accessing variable from parent class in Child4:");
        x = 50; // default not accessed in subclass different package
        y = 60; // public not accessed as not inherited
        z = 70; // protected not accessed as not inherited
        a = 80; // private not accessed
    }

    public void accessVariableByObject() {
        Parent p = new Parent();
        p.x = 50; // default accessed in subclass different package
        p.y = 60; // public accessed
        p.z = 70; // protected accessed in subclass different package
        p.a = 80; // private not accessed
    }
}
