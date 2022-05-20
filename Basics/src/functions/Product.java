package functions;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(product(a, b));
    }
    static int product(int a , int b)
    {
        int c = a*b;
        return c;
    }
}
