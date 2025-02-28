package chapter3.generic;

public class Main {
    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();
        //stringBox.setItem(new Object()); 에러 string 이외에 타입 지정 불가
        stringBox.setItem("ABC");
        String item = stringBox.getItem(); // 형변환 필요없음
        //Object item = stringBox.getItem(); <- 이것도 가능

        Box nomalBox = new Box();
        nomalBox.setItem(new Object());
        nomalBox.setItem("ABC"); //타입지정 없이도 가능 근데 경고뜸

        Box<Object> objectBox = new Box<>();
        objectBox.setItem(new Object());
        objectBox.setItem("ABC"); //Object로 하면 경고 안뜸

        //제너릭 제한
        Box<Apple> appleBox = new Box<>();
        Box<Grape> grapeBox = new Box<>(); //가능
        //모든 객체에 동일하게 동작해야하는 static멤버에 타입변수 적용 불가능
        //T는 인스턴스 변수로 간주됨




    }
}
