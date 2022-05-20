package functions;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        System.out.println("Enter the radius");
        Scanner sc = new Scanner(System.in);
        float radius= sc.nextFloat();
        System.out.println(calculateArea(radius));
        System.out.println(circumference(radius));
    }
    static float calculateArea(float radius)
    {
        float area = (3.14f * (radius * radius));
        return area;
    }
    static float circumference(float radius)
    {
        float circumference = (2 * 3.14f * radius);
        return circumference;
    }

}
