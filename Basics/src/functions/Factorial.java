package functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factorial(num));
    }
    static int factorial(int num)
    {
        int fact = 1;
        int i = 1;
        while(i<=num)
        {
            fact = fact * i;
            i++;
        }
        return fact;
    }
}
