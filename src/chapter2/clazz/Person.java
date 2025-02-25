package chapter2.clazz;

public class Person {
    //1. 속성
    String name;
    int age;
    String address;
    //2. 생성자
    Person(String name, int age){
        this.name= name;
        this.age = age;
    }

    //3. 기능
    //getter 속성을 가져오는 기능
    String getName(){
        return this.name;
    }
    //setter 속성 설정해주는 기능
    void setAddress(String address){
        this.address = address;
    }


    int sum(int val1, int val2){
        int res = val1 + val2;
        return res;
    }
}
