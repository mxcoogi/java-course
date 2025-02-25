package chapter2.inheritance;

public class Child extends Parent{

    public String familyName = "조선";

    public Child(){
        super();
        System.out.println("자식 생성자");
    }

    public void superTest(){
        System.out.println(super.familyName);
    }
}
