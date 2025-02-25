package chapter2.finall;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        a = 2;
        System.out.println(a);

        final  int b = 2;
        //b = 3; final로 선언된 변수는 변경 불가능

        //클래스는 상속할 수 없게 만든다.
        //메서드는 오버라이딩 불가

        //상수
        System.out.println("상수 활용 : " + Circle.PI);
        final Circle c1 = new Circle(5);
        //c1 = new Circle(4); final로 선언해서 참조변경을 막음
        //c1.radius = 4; 내부 변경은 못막음 why? 속성에 final 키워드가 없어서
        System.out.println("c1 = " + c1);

        //불변 객체의 내부 상태가 변경이 필요한 경우??
        Circle c2 = new Circle(10); //새로운 객체 생성
        Circle c3 = c2.changeRadius(20); //메서드 활용
    }
}
