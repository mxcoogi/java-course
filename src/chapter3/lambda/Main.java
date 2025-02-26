package chapter3.lambda;

public class Main {

    public static int calculate(int a, int b, Calculator calculator){
        return calculator.sum(a, b);
    }

    public static void main(String[] args) {
        //인터페이스를 활용한 익명클래스 만들기
//        Calculator calculator = new Calculator() {
//
//            @Override
//            public int sum(int a, int b) {
//                return a + b;
//            }
//
//        };
//        int ret = calculator.sum(2, 2);
//        System.out.println(ret);

        //인터페이스를 활용한 람다식 만들기
        Calculator calculator1 = (a, b) -> a+b;
        int ret1= calculator1.sum(3,3);
        System.out.println(ret1);
        
        //람다식을 매개변수로 전달하는 방법
        //1. 익명클래스 변수에 담아 매개변수로 전달
        Calculator cal1 = new Calculator() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };
        int ret2 = calculate(4, 4, cal1);
        System.out.println(ret2);

        //2. 람다식을 변수에 담아 매개변수로 전달
        Calculator cal2 = (a, b) -> a+b;
        int ret3 = calculate(5, 5, cal2);
        System.out.println(ret3);

        //3. 람다식을 직접 매개변수로 전달
        int ret5 = calculate(6, 6, (a, b)-> a+b);


    }


}
