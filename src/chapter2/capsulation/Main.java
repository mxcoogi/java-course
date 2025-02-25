package chapter2.capsulation;

public class Main {
    public static void main(String[] args) {
        //Person person = new Person(); //생성자가 private이기 때문에 오류
        Person person = new Person("kim");

        //person.name = "kim";
        //person.secret = "??"; private 이기 때문에 접근 불가


        //person.methodA();
        //person.methodB(); private 이기 때문에

        String name = person.getName(); //getter로 접근

    }
}
