public class SearchToLetter {
    public static void main(String[] args) {
        System.out.println(searchToLetter("petr", 'a'));
    }
    public static boolean searchToLetter (String word, char letter) {
        char[] wordArr = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            if (wordArr[i] == letter) {
                return true;
            }
        }
        return false;
    }
}
