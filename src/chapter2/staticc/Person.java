package chapter2.staticc;

public class Person {
    //static 변수
    static  int population = 0;

    //인스턴스 변수
    String name;

    Person(){
        population++;
        //생성자 호출 될  때마다 static변수 증가
    }
    //인스턴스 메서드
    void printName(){
        System.out.println("나의 이름은 "+this.name+" 입니다.");
    }

    //static method
    static void printPopulation(){
        System.out.println("현재 인구 수 : " + population);
    }


}
