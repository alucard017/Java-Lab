public class Vector {
    private double[] elements;

    public Vector(double[] arr) {
        elements = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            set(i, arr[i]);
        }
    }

    public Vector(Vector v) {
        elements = new double[v.elements.length];
        for (int i = 0; i < v.elements.length; i++) {
            elements[i] = v.elements[i];
        }
    }

    public void set(int index, double value) {
        elements[index] = value;
    }

    public double get(int index) {
        return elements[index];
    }
}

public class Main {
    public static void main(String[] args) {
        double[] numbers = { 1.0, 2.0, 3.0, 4.0 };
        Vector vec1 = new Vector(numbers);
        Vector vec2 = new Vector(vec1);

        vec1.set(2, 7);

        System.out.println("Vector 1 Elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(vec1.get(i) + " ");
        }
        System.out.println("\nVector 2 Elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(vec2.get(i) + " ");
        }

    }
}
