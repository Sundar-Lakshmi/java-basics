package functions;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter a num");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        isPrime(num);
    }

    static void isPrime(int num) {
        for (int i = 2; i <= (num*num); i++) {
            if (num % i == 0) {
                System.out.println("Not a prime");
                break;
            } else
                System.out.println("Prime");
                break;
        }
    }
}
