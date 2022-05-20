package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        System.out.println("Enter numbers to store");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i = 0; i< arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

//            System.out.println(Arrays.toString(arr));

        for (int i =0; i< arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
