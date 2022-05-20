package functions;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        System.out.println("Enter Student Details");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        System.out.println(calculateGrade(marks));
    }

    static String calculateGrade(int marks) {
        String grade = null;
        if (marks >= 91) {
            grade = "AA";
        }
        if (marks >= 81 && marks <= 90) {
            grade = "AB";
        }
        if (marks >= 71 && marks <= 80) {
            grade = "BB";
        }
        if (marks >= 61 && marks <= 70) {
            grade = "BC";
        }
        if (marks >= 51 && marks <= 60) {
            grade = "CD";
        }
        if (marks >= 41 && marks <= 50) {
            grade = "DD";
        }
        if (marks <= 40) {
            grade = "Fail";
        }
        return grade;
    }
}
