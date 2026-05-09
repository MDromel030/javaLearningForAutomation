package class_one;

public class Identifiers {
    public static void main(String[] args) {
        int number1 = 10;
        int _value = 20;
        int Value = 15;
        int $price = 30;
        double pi_value =3.1416;
        String Login_test = "PASSED";

        System.out.println("number1: " + number1);
        System.out.println("_value: " + _value);
        System.out.println("Value: " + Value);
        System.out.println("$price: " + $price);
        System.out.println("pi_value: " + pi_value);
        System.out.println("Login_test: " + Login_test);

       //INVALID IDENTIFIERS

        // int 1number = 50;      // cannot start with digit

        // int class = 100;       // class is a keyword

        // string my value = "two";     // space is  not allowed

        // int num#1 = 40;        // special character '#' not allowed


    }
}
