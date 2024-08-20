public class BinaryToDecimal{
    public static void main(String[] args) {
        String binary = args[0];
        if (isBinary(binary) == true) {
            int ans = function(binary);
            System.out.println("Decimal value: " + ans);
        } else {
            System.out.println("Input is not in proper format.");
        }
    }

    public static boolean isBinary(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0' && str.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }

    public static int function(String str) {
        int ans = 0;
        int pow = 1;
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch == '1') {
                ans += pow;
            }
            pow *= 2;
        }
        return ans;
    }
}

