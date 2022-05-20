package functions;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        find(a);
    }
    static int find(int a)
    {
        if(a%2 == 0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
        return a;
    }

}
