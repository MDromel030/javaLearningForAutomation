package Classthree;

public class IfStatement {
    public static void main(String[] args) {

        int number = 10;

        // Simple if
        if (number > 0) {
            System.out.println("Number is positive");
        }

        // if-else
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // else-if
        int marks = 75;

        if (marks >= 80) {
            System.out.println("Grade A+");
        } else if (marks >= 70) {
            System.out.println("Grade A");
        } else if (marks >= 60) {
            System.out.println("Grade B");
        } else {
            System.out.println("Fail");
        }

        // Nested if
        int age = 20;
        if (age >= 18) {
            if (age >= 21) {
                System.out.println("Eligible for everything");
            } else {
                System.out.println("Eligible with restriction");
            }
        }
    }
}
