package Lab4.New2;

import Lab4.New.*;

public class Child1 extends Parent {

    public Child1() {
        System.out.println("Child1 non-parametric constructor initialised");
    }

    public void proc1() {
        System.out.println("hello from child1 proc1");
        x = 50; // default not accessed in subclass different package
        y = 60; // public accessed
        z = 70; // protected accessed in subclass different package
        a = 80; // private not accessed
    }

    public void proc2() {
        Parent p = new Parent();
        System.out.println("Accessing variable from parent class through object: ");
        p.x = 50; // default not accessed from outside package
        p.y = 60; // public accessed
        p.z = 70; // protected accessed in parent only via inheritance
        p.a = 80; // private not accessed at all
    }

    // Method overloading
    // of the
    // overriden method

    // proc1()

    public void proc1(int x) {
        System.out.println("Hello from overloaded child1 proc1");
    }
}
