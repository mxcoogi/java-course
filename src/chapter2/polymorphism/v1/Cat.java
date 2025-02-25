package chapter2.polymorphism.v1;

public class Cat implements Animal{

    @Override
    public void exist() {
        System.out.println("고양이가 존재");
    }

    @Override
    public void makeSound() {
        System.out.println("애용");
    }
    public void scratch(){
        System.out.println("스크래치");
    }
}
