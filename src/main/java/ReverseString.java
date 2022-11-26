public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("abc"));
    }
    public static String reverseString (String string) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            result.insert(0, findChar(string, i));
        }
        return result.toString();
    }
    public static char findChar(String word, int letter) {
        char[] wordArr = word.toCharArray();
        return wordArr[letter];
    }
}
