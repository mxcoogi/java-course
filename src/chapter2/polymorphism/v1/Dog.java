package chapter2.polymorphism.v1;

public class Dog implements Animal{

    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }

    @Override
    public void exist() {
        System.out.println("강아지 존재");
    }
    public void wag(){
        System.out.println("꼬리살랑");
    }
}
