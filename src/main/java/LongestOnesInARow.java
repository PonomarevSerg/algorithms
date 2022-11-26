import java.util.Arrays;

public class LongestOnesInARow {
    public static void main(String[] args) {
        System.out.println(onesInARow("1100101011"));;
    }

    /*
    You are given a binary substring s (a string containing only "0" and "1"). An operation involves flipping a "0" into a "1".
    What is the length of the longest substring containing only "1" after performing at most one operation?
    For example, given s = "1101100111", the answer is 5. If you perform the operation at index 2, the string becomes 1111100111.
    */

    public static int onesInARow(String s) {
        int[] array = Arrays.stream(s.split("")).mapToInt(Integer::parseInt).toArray();

        int current;
        int value = 0;
        int operation;
        for (int i = 0; i < array.length; i++) {
            current = 0;
            operation = 0;
            for (int j = i; j < array.length; j++) {
                if (array[j] == 1) {
                    current++;
                } else if (array[j] == 0 & operation + 1 != 2) {
                    current++;
                    operation++;
                } else {
                    i = j;
                    if (current > value) {
                        value = current;
                    }
                    break;
                }
            }
        }
        return value;
    }
}
