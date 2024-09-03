package Lab4.New;

public class Child extends Parent {

    static {
        System.out.println("Child Static block intialised.");
    }
    {
        System.out.println("Child non-static block intialised.");
    }

    public Child() {
        System.out.println("Child non-parametric Constructor called.");
    }

    public Child(int x) {
        // super(x, y);
        System.out.println("Child parametric Constructor called");
    }

    public void proc1() {
        System.out.println("Hello from child proc1");
    }
}