package chapter3.generic;

public class Main {
    public static void main(String[] args) {

        //1 재사용 불가
//        Box box = new Box(1);
//        //new Box("String");
//        //new Box(0.1);
//
//        //낮은 타입 안정성
//        ObjectBox objectBox = new ObjectBox("ABC");
//        //item을 활용하기 위해서는 다운캐스팅 필요  ClassCastException 가능성
//        String item = (String)objectBox.getItem();

        //제네릭 활용 <T> 타입 매개변수 1. 타입소거 T -> Object , 2. 자동으로 downCasting
        GenericBox<String> strBox = new GenericBox<>("ABC");
        System.out.println(strBox.getItem());
        GenericBox<Integer> intBox = new GenericBox<>(100);
        System.out.println(intBox.getItem());
        GenericBox<Double> doubleBox = new GenericBox<>(0.01);
        System.out.println(doubleBox.getItem());

        //일반메서드 사용하기
        strBox.printItem("ABC");
        //strBox.printItem(100);
        strBox.printBoxItem("ABC");
        strBox.printBoxItem(100); // 다 들어가네..?



    }
}
