package git_6;

public class ClassConstructorMethod {
    String name;
    int age;

    ClassConstructorMethod(String n, int a) {
        name = n;
        age = a;
    }
    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        ClassConstructorMethod obj = new ClassConstructorMethod("Rahim", 25);
        obj.showInfo();
    }
}
