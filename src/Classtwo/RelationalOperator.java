package Classtwo;

public class RelationalOperator {

    public static void main(String[] args) {

        int a = 10, b = 5;

        System.out.println("a < b: " + (a < b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        String name = "Test";
        System.out.println("instanceof: " + (name instanceof String));
    }
}
