package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args){
        System.out.println("Enter numbers to store in a 2D array");
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][2];
        for(int i = 0; i<arr.length;i++)
        {
            for(int j = 0; j<arr[i].length;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<arr.length;i++)
        {
            for(int j = 0; j<arr[i].length;j++)
            {
                System.out.println(arr[i][j]);
            }
//            System.out.println();
        }

        for(int i = 0; i<arr.length;i++)
        {
         System.out.println(Arrays.toString(arr[i]));
        }
}
}
