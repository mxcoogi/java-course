package chapter1.methods;

public class Main {

    public static void main(String[] args) {

        // 1. 객체를 생성
        Calculator calc = new Calculator();
        // 2. 메서드를 호출
        int val = calc.sum(1, 2);
        System.out.println(val );
    }
}
