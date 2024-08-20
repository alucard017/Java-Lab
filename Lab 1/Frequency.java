public class Frequency {
    public static void main(String[] args) {
        String str = args[0];
        int[] freq = new int[26];
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' ) {
                ch = Character.toLowerCase(ch);
                freq[ch - 'a']++;
            }
        }
              
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                char letter = (char) (i + 'a');
                System.out.println(letter + " " + freq[i]);
            }
        }
    }
}

