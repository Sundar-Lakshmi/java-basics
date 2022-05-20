package functions;

import java.util.Scanner;

public class ReturnFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.next();
        String personalized = greet(name);
        System.out.println(personalized);
    }
    static String greet(String name)
    {
        String message =  "Hello " + name;
        return message;
    }

}


