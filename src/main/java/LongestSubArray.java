public class LongestSubArray {


    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 7, 4, 2, 1, 1, 5};

        System.out.println(subArray(nums, 8));
    }

    /*
    Given an array of positive integers nums and an integer k,
    find the length of the longest subarray whose sum is less than or equal to k.
    curr <= k. Let's look at an example where nums = [3, 1, 2, 7, 4, 2, 1, 1, 5] and k = 8
    */

    public static int subArray(int[] array, int k) {
        int temp;
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            temp = 0;
            int l = 0;
            for (int j = i; j < array.length; j++) {
                if (k >= l + array[j]) {
                    l = l + array[j];
                    temp++;
                } else {
                    if (temp > counter) {
                        counter = temp;
                    }
                    break;
                }
            }
        }
        return counter;
    }
}
