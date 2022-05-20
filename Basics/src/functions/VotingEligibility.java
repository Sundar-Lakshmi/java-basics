package functions;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        System.out.println("Enter the details of the individual");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        eligibilty(name, age);
    }
    static void eligibilty( String name, int age)
    {
        if (age >= 18)
        {
            System.out.println(name + " can vote");
        }
        else
        {
            System.out.println(name + " can't vote");
        }
    }
}
