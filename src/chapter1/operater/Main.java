package chapter1.operater;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        //기본적인 사칙연산
        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        System.out.println(div); //정수형 div에 담기 때문에 소숫점 표시 안댐
        double div2 = a/3.0;
        System.out.println(div2);

        //모듈러 연산자
        int mod = a%b;
        System.out.println(mod);
        //시간연산
        int time = (10+5) % 12;

        //대입 연산자
        int num = 5;
        //복합 대입 연산자
        num+=3; //num = num + 3;
        num-=2; //num = num - 2;
        num *=3; //num = num * 3;
        num/=2; // num = num / 2;
        num%=2; // num = num % 2;

        //증감 연산자
        num = 1;
        num++; //+1
        num--; //-1

        //전위 연산(++i) -> 연산 후 값이 활용됨
        int box =5;
        System.out.println("++intBox: "+ (++box));
        //후위 연산 (++i) -> 값이 활용되고 연산
        System.out.println("intBox++: "+ (box++));

        //비교연산자
        //같으면 true 다르면 false
        System.out.println("10 == 10 : " + (10 == 10));
        System.out.println("10 != 5 : " + (10 != 5));
        System.out.println("10 < 5 : " + (10 < 5));
        System.out.println("10 >= 10 : " + (10 >= 10));

        //논리 연산자
        //AND &&
        System.out.println("true && true : " + (true && true));
        System.out.println("true && false : " + (true && false));
        //OR ||
        System.out.println("false || false : " + (false || false));
        System.out.println("true || false : " + (true || false ));
        //NOT !
        System.out.println("!true : " + !true);

        //연산자 우선순위
        //(산술연산 -> 비교 -> 논리 -> 대입)
        boolean flag = 10 + 5 > 12 && true;
        System.out.println(flag);
        boolean result = true||false&&false;
        System.out.println(result);
        boolean result2 = true||false&&!false;
        System.out.println(result2);

        //문자열 비교
        //문자열 비교는 항상 .equals()를 사용하자
        // ==은 메모리 주소값으로 비교하는것!
        String text = "Hello";
        String text2 = "hello";
        boolean result3 = text.equals(text2);
    }
}
