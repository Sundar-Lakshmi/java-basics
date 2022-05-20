package functions;

import java.util.Scanner;

public class Functions {

    public static void main(String[] args) {
        sum();
    }

    static void sum()
    {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter frst num");
        a = sc.nextInt();
        System.out.println("Enter sec num");
        b = sc.nextInt();
        int c = a+b;
        System.out.println("Sum is " + c);
    }
}
