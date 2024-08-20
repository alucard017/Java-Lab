class Vector {
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

    public double[] Multiply(double ele) {
        double[] result = new double[elements.length];
        for (int i = 0; i < elements.length; i++)
            result[i] = ele * elements[i];
        return result;
    }

    public double Multiply(Vector ve) {
        double result = 0.0;
        for (int i = 0; i < ve.elements.length; i++) {
            result = result + (elements[i] * ve.elements[i]);
        }
        return result;
    }

}

public class Main2 {
    public static void main(String[] args) {
        double[] arr1 = { 1, 2, 3 };
        double[] arr2 = { 1, 2, 3 };

        Vector v1 = new Vector(arr1);
        Vector v2 = new Vector(arr2);

        System.out.println("Matrix Multiplication: " + v1.Multiply(v2));
        double[] arr = new double[arr2.length];
        arr = v2.Multiply(3.0);
        System.out.println("Matrix multiplied with Scalar: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
