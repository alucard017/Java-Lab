public class QuadraticRoot {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        if (a == 0) {
            System.out.println("Coefficient 'a' cannot be zero.");
            return;
        }

        double D = b * b - 4 * a * c;

        if (D > 0) {
            double sqrtD = Math.sqrt(D);
            double root1 = (-b + sqrtD) / (2 * a);
            double root2 = (-b - sqrtD) / (2 * a);
            System.out.println("Root1 : "+ root1 +", Root2 : "+ root2);
        } else if (D == 0) {
            double root = -b / (2 * a);
            System.out.println("Root: "+ root);
        } else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-D) / (2 * a);
            System.out.println("Root1 : "+real+"+"+imaginary+"i, Root2 : "+ real+"-"+imaginary+"i, ");
        }
    }
}

