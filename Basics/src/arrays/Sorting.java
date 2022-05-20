package arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        System.out.println("Sorting Array");
        int[] arr = {1,2,3,4,5,6};
        swap(arr,2,3);
    }

    static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        System.out.println(Arrays.toString(array));
    }
}
