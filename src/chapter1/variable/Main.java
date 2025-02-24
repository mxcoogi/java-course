package chapter1.variable;

public class Main {
    public static void main(String[] args) {
        int a = 1; //선언 할당 초기화
        a = 2; //재할당
        System.out.println("a: " + a);

        boolean booleanBox = true;
        System.out.println("booleanBox: " + booleanBox);

        char charBox = 'a';
        charBox = 'b';
        System.out.println("charBox: " + charBox);

        long longBox = 1l;
        longBox = 2l;
        System.out.println("longBox: " + longBox);

        float floatBox = 0.12345678f;
        float floatBox2 = 0.1234567890f;
        System.out.println("floatBox: " + floatBox);
        System.out.println("floatBox2: " + floatBox2);

        double doubleBox = 0.123456789;
        System.out.println("doubleBox: " + doubleBox);


        //형변환

        //다운캐스팅 : 큰 데이터 -> 작은 상자에 넣기
        double bigBox = 10.123;
        int smallBox = (int)bigBox;
        //큰 데이터가 작은상자에 들어가면 데이터 손실 발생

        //업캐스팅 : 작은데이터 -> 큰 상자에 넣기
        int smallBox2 = 10;
        double bigBox2 = smallBox2;
        //형 변환 필요 없다. 크기가 넉넉하기 때문에~. 손실 없다


        //문자열 데이터
        String str = "안녕하세요"; //쌍따옴표


    }
}
