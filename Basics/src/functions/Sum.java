package functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sum( a,  b));

    }
    static int sum(int a , int b)
    {
        int sum = a + b;
        return sum;
    }
}
