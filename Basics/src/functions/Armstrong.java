package functions;

import java.util.Scanner;

public class Armstrong {
    private static int tot;

    public static void main(String[] args) {
        System.out.println("Enter a num");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int tot = 0;
        int original = num;
        while (num != 0)
        {
            int rem;
            rem = num%10;
            tot = tot + (rem * rem * rem);
            System.out.println(tot);
            num = num/10;

        }
        if ( original == tot)
        {
            System.out.println("Its an Armstrong num");
        }
}
}
