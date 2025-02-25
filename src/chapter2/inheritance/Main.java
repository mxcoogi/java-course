package chapter2.inheritance;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.familyName);
        child.superTest();
        System.out.println(child.honor);
        child.introduceFamily();
    }
}
