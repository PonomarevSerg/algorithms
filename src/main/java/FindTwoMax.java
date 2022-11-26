import java.util.Arrays;

public class FindTwoMax {
    public static void main(String[] args) {
        int[] array1 = {-2, 1, 3, 6, 9};
        int[] array2 = {5, -4, 7, 0, 14};
        int[] array3 = {10, 4, -2, 8, 5};
        int[] array4 = {8, 3, -4, 10, -2};

        Arrays.stream(FindTwoMax.findTwoMax(array1)).forEach(System.out::println);
        System.out.println("===");
        Arrays.stream(FindTwoMax.findTwoMax(array2)).forEach(System.out::println);
        System.out.println("===");
        Arrays.stream(FindTwoMax.findTwoMax(array3)).forEach(System.out::println);
        System.out.println("===");
        Arrays.stream(FindTwoMax.findTwoMax(array4)).forEach(System.out::println);
    }

    public static int[] findTwoMax(int[] array) {
        int max1 = array[0];
        int max2 = array[1];
        int[] result = new int[2];

        for (int i = 2; i < array.length; i++) {
            if (array[i] > max1) {
                max2 = max1;
                max1 = array[i];
            } else if (array[i] > max2) {
                max2 = array[i];
            }
        }
        result[0] = max1;
        result[1] = max2;

        return result;
    }
}
