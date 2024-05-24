package W3A3Q2;

public class Recursion {
    public static void main(String[] args) {
        String recurs = "face";
        System.out.println("The substrings of \"" + recurs + "\" are as follows:");
        generateSubstrings(recurs);
    }

    public static void generateSubstrings(String recurs) {
        generateSubstringsHelper(recurs, 0, "");
    }

    private static void generateSubstringsHelper(String recurs, int num, String word) {
        int length = recurs.length();
        if (num > length) {
            return;
        } else {
            System.out.println(word);
            for (int i = num; i < length; i++) {
                generateSubstringsHelper(recurs, i + 1, word + recurs.charAt(i));
            }
        }
    }
}