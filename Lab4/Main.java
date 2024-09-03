package Lab4;

import Lab4.New.*;
import Lab4.New2.*;

// import Lab4.New.Child;
// abstract class Parent {
//     // Static block
//     static {
//         System.out.println("Parent Static block initialized");
//     }
//     {
//         System.out.println("Parent non-static block intialised.");
//     }

//     // Non-parametric constructor
//     public Parent() {
//         System.out.println("Parent non-paramteric constructor called.");
//     }

//     // Parameterized constructor
//     public Parent(int a, int b) {
//         System.out.println("Parent Parametric constructor called.");
//     }

//     abstract public void proc1();

//     public static Parent getObject(String type) {
//         Parent ob = null;
//         switch (type) {
//             case "child":
//                 ob = new Child();
//                 break;
//             case "child1":
//                 ob = new Child1();
//                 break;
//             default:
//                 ob = null;
//         }
//         return ob;
//     }
// }

// class Child extends Parent {

// static {
// System.out.println("Child Static block intialised.");
// }
// {
// System.out.println("Child non-static block intialised.");
// }

// public Child() {
// System.out.println("Child non-parametric Constructor called.");
// }

// public Child(int x) {
// // super(x, y);
// System.out.println("Child parametric Constructor called");
// }

// public void proc1() {
// System.out.println("Hello from child proc1");
// }
// }

// class Child1 extends Parent {
// public Child1() {
// System.out.println("Child1 non-parametric constructor initialised");
// }

// public void proc1() {
// System.out.println("hello from child1 proc1");
// }

// // Method overloading
// // of the
// // overriden method

// // proc1()

// public void proc1(int x) {
// System.out.println("Hello from overloaded child1 proc1");
// }
// }

public class Main {
    public static void main(String[] args) {
        // System.out.println("Creating Child 1");
        // Child p1 = new Child();
        // System.out.println("Creating Child 2");
        // Child p2 = new Child();

        Parent p1 = new Child();
        Child1 p = (Child1) Parent.getObject("child1");
        p.proc1();
        p.proc1(2);

        // p.proc1();
        // If we keep proc1() as default then it is not accessible from outside
        // packages.

        // It is only accessible within the current package.

        // If we modify the type of parent as Public and child as default, then it will
        // give an error, because reducing visibility is not allowed.

        // Just provide the access specifier as public in Child class.

        // Removing the non-parametric in parent and providing a parametric one while
        // leaving the child as it is will give an error as explicit constructor not
        // defined in parent. We must define the same parameterized constructor in Child
        // also, or else child will look for the non-parameteried one in the parent and
        // may not able to find it.

        // Just create and child constructor and invoke super().

        // Parent Static --> Child Static --> Parent Non-static --> Parent Constructor
        // --> Child Non-static --> Child Constructor

        // We can't invoke the overloaded proc1() using the parent varibale as it is not
        // defined previously in Parent. the child1 is overloading the overriden method
        // proc1(). Hence we must call it using Child1 variable.

        // The type Child1 must implement the inherited abstract method Parent.proc1()
    }
}