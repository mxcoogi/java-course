package chapter2.abstraction.v2;

public class Cat extends Animal{
    public void scratch(){
        System.out.println("스크래치");
    }
    
    @Override
    public void makeSound(){
        System.out.println("야옹");
    }
}
