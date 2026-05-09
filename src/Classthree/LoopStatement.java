package Classthree;

public class LoopStatement {

    public static void main(String[] args) {


        System.out.println("Basic for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Enhanced for loop
        System.out.println("\nEnhanced for loop:");
        int[] numbers = {10, 20, 30, 40};

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
