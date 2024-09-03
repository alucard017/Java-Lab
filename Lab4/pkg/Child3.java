package Lab4.pkg;

import Lab4.New.Parent;

public class Child3 {
    public void access1() {
        System.out.println("Accessing variable from parent class in Child3");
        x = 50; // default not accessed
        y = 60; // public not accessed as not inherited
        z = 70; // protected not accessed as not inherited
        a = 80; // private not accessed
    }

    public void accessVariableByObject() {
        Parent p = new Parent();
        p.x = 50; // default not accessed in different package
        p.y = 60; // public accessed
        p.z = 70; // protected not accessed as not subclass
        p.a = 80; // private not accessed
    }
}
