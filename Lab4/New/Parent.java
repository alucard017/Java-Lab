package Lab4.New;

// import Lab4.New2.*;

public abstract class Parent {
    // Static block
    int x = 10;
    public int y = 20;
    protected int z = 30;
    private int a = 40;
    static {
        System.out.println("Parent Static block initialized");
    }
    {
        System.out.println("Parent non-static block intialised.");
    }

    // Non-parametric constructor
    public Parent() {
        System.out.println("Parent non-paramteric constructor called.");
    }

    // Parameterized constructor
    public Parent(int a, int b) {
        System.out.println("Parent Parametric constructor called.");
    }

    abstract public void proc1();

    public static Parent getObject(String type) {
        Parent ob = null;
        switch (type) {
            case "child":
                ob = new Child();
                break;
            case "child1":
                ob = new Child1();
                break;
            default:
                ob = null;
        }
        return ob;
    }
}
