package Classthree;

public class ClassConstructorMethod {
    String name;
    int age;

    // Constructor
    ClassConstructorMethod(String n, int a) {
        this.name = n;
        this.age = a;
    }

    // Method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        ClassConstructorMethod obj = new ClassConstructorMethod("Rumel", 25);
        obj.display();
    }
}
