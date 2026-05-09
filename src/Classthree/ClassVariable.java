package Classthree;

public class ClassVariable {

    int instanceVar = 10;
    static int staticVar = 20;
    public void show() {
        int localVar = 30;

        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        ClassVariable obj = new ClassVariable();
        obj.show();
    }
}
