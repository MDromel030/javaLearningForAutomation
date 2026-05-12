package git_1;

public class IfStatement {

    public static void main(String[] args) {
        int number = 10;

        if (number > 0) {
            System.out.println("Number is positive");
        }


        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }


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

        // nested if
        int age = 20;

        if (age >= 18) {
            if (age >= 21) {
                System.out.println("Eligible for all activities");
            } else {
                System.out.println("Eligible with restriction");
            }
        }
    }
}
