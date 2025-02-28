package chapter3.generic;

import java.util.ArrayList;
import java.util.Arrays;

//public class Box {
//    Object item;
//
//    public void setItem(Object item) {
//        this.item = item;
//    }
//
//    public Object getItem() {
//        return item;
//    }
//}
// 제너릭 적용 클래스
public class Box<T>{
    //static T item; //Error -> 대입된 타입에 관계없이 동일한 것이여야 함
     ArrayList<T> list = new ArrayList<>();
     T[] itemArr; //제너릭 배열 타입의 참조변수 선언은 가능

//    T[] toArray(){
//        T[] tempArr = new T[itemArr.length];
//        return tempArr;
//    } 왜 안됨? -> new 연산자 때문! new 연산자는 컴파일 시점에 타입이 뭔지 알아야 한다 근데 T가 뭔지 모름
//      꼭 생성하고 싶으면 방법 두가지!
//      1. new 연산자 대신 Reflection API의 newInstance(동적 객체 생성) 메서드 사용
//      2. Obeject로 생성한다음 복사해서 형변환

    public void add(T item){
        list.add(item);
    }
    T get(int i){
        return list.get(i);
    }
    ArrayList<T> getList(){
        return list;
    }
    int size(){
        return list.size();
    }
    public String toString(){
        return list.toString();
    }


}