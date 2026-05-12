package git_2;

public class LoopStatement {

    public static void main(String[] args) {

        System.out.println("Traditional For Loop:");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("\nEnhanced For Loop:");

        int[] numbers = {10, 20, 30, 40, 50};

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}