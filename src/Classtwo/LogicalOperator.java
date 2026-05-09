package Classtwo;

public class LogicalOperator {

    public static void main(String[] args) {

        int number_one = 100, number_two = 200;

        System.out.println("a && b: " + (number_one > number_two && number_one < number_two));
        System.out.println("a || b: " + (number_one == number_two && number_one > number_two));
    }
}
