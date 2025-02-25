package chapter2.wrapper;

public class Main {
    public static void main(String[] args) {
        int a=1; //기본형
        System.out.println(a);

        Person personA = new Person(); //참조형 변수
        System.out.println(personA); // 출력하면 뭐가나오나??? -> 힙에 저장된 메모리의 주소값이 나옴

        int[] arr = {1,2,3,4,5};
        System.out.println(arr); //배열도 참조형변수 -> 메모리의 주소값이 나옴


        //wrapper class?? -> 기본형 변수를 감싸고 있는 클래스
        // 이것도 참조형임
        Integer num = 100;
        //출력하면 메모리주소가 나오는게 아니라 기본형처럼 나옴 why? 내부적으로 어떤 처리가 되어있음
        //Integer 객체가 toString() 메서드를 오버라이드하고 있기 때문
        System.out.println(num);
        System.out.println(num.toString()); //wrapper 클래스의 기능

        //직접 만든 래퍼클래스
        CustomInteger myInteger = new CustomInteger(10);
        String myStringInteger = myInteger.toString();

        //오토박싱
        Integer num2 = 3;
        //오토박싱 내부적으로?? 래퍼 <- 기본형
        Integer num3 = Integer.valueOf(3);

        //오토언박싱
        int num4 = num3;
        //내부적
        int b = num3.intValue();

    }
}
