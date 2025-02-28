package chapter3.generic;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();
        //stringBox.setItem(new Object()); 에러 string 이외에 타입 지정 불가
//        stringBox.setItem("ABC");
//        String item = stringBox.getItem(); // 형변환 필요없음
//        //Object item = stringBox.getItem(); <- 이것도 가능
//
//        Box nomalBox = new Box();
//        nomalBox.setItem(new Object());
//        nomalBox.setItem("ABC"); //타입지정 없이도 가능 근데 경고뜸
//
//        Box<Object> objectBox = new Box<>();
//        objectBox.setItem(new Object());
//        objectBox.setItem("ABC"); //Object로 하면 경고 안뜸

        //제너릭 제한
//        Box<Apple> appleBox = new Box<>();
//        Box<Grape> grapeBox = new Box<>(); //가능
        //모든 객체에 동일하게 동작해야하는 static멤버에 타입변수 적용 불가능
        //T는 인스턴스 변수로 간주됨

        //Box<Fruit> fruitBox = new Box<Apple>();; 생성할 때 상속관계여도 에러남 대입된 타입이 일치해야댐!
        //제너릭 클래스 타입이 상속관계있으먼 가능
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();

        //Box add(T item)일때
        // item이 Fruit이고 Apple을 넣는다면 가능 상속관계이기 때문
        fruitBox.add(new Apple("1", 2));
        fruitBox.add(new Fruit("2", 324));
        fruitBox.add(new Grape("3", 112));

        //와일드 카드
        System.out.println(Juicer.makeJuice(fruitBox));

        //형변환



    }
}

//와일드 카드 ㅈ제너릭 메서드
class Juicer{
    static <T extends Fruit> Juice makeJuice(FruitBox<T> box){

        String temp = "";
        for(Fruit var: box.getList()){
            temp += var + " ";
        }
        return new Juice(temp);

    }
}

class Juice{

    String name;
    Juice(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class FruitComp implements Comparator<Fruit>{

    @Override
    public int compare(Fruit o1, Fruit o2) {
        return o1.weight - o2.weight;
    }
}