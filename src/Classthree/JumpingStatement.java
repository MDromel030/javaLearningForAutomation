package Classthree;

public class JumpingStatement {
    public static void main(String[] args) {

        // break example
        System.out.println("Break example:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }

        // continue example
        System.out.println("\nContinue example:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
