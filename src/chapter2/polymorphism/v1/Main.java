package chapter2.polymorphism.v1;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat(); // 상위계층의 데이터 타입으로 고양이 만들기
        Animal dog = new Dog(); //한가지 데이터 타입으로 두가지 다루기

        cat.exist();
        cat.makeSound();

        dog.exist();
        dog.makeSound();

        //cat.scratch() 업캐스팅 자식의 고유기능 활용 불가
        //dog.wag()

        Cat cat2 = (Cat) cat; //다운캐스팅
        cat2.scratch();

        Dog dog2 = (Dog) dog; // 다운캐스팅
        ((Dog) dog).wag();

        //잘못된 다운캐스팅
//        Cat cat3 = (Cat) dog; //dog 는 Dog 클래스
//        cat3.scratch(); //ClassCastException 발생
//
        if (dog instanceof Cat) {
            Cat cat3 = (Cat) dog;
            cat3.scratch();
        } else {
            System.out.println("객체가 고양이가 아닙니당");
        }

        //다형성 장점
        Animal[] animals = {new Cat(), new Dog(), new Cat()};
        for (Animal animal : animals) {
            animal.makeSound();
        } //Animal 타입 하나로 다양한 자식 타입을 한번에 담을 수 있음
    }
}
