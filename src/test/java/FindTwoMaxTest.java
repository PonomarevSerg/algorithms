import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindTwoMaxTest {
    int[] array1 = {-2, 1, 3, 6, 9};
    int[] array2 = {5, -4, 7, 0, 14};
    int[] array3 = {10, 4, -2, 8, 5};
    int[] array4 = {8, 3, -4, 10, -2};

    FindTwoMax findTwoMax = new FindTwoMax();

    @Test
    void findTwoMax() {
        Assertions.assertArrayEquals(new int[]{9,6}, FindTwoMax.findTwoMax(array1) , "Array1 Equal Test");
        Assertions.assertArrayEquals(new int[]{14,7}, FindTwoMax.findTwoMax(array2) , "Array2 Equal Test");
        Assertions.assertArrayEquals(new int[]{10,8}, FindTwoMax.findTwoMax(array3) , "Array3 Equal Test");
        Assertions.assertArrayEquals(new int[]{10,8}, FindTwoMax.findTwoMax(array4) , "Array4 Equal Test");
    }
}