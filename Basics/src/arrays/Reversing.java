package arrays;

import java.util.Arrays;

public class Reversing {
    public static void main(String[] args){
        System.out.println("Reversing array");
        int[] array = {1,2,3,4,5,6};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    static void reverse(int[] array){
        int start = 0;
        int end = array.length-1;
        while(start<end){
            swap(array, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
