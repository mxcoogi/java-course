package chapter2.wrapper;

public class CustomInteger {

    //1. 속성
    int value;
    //2. 생성자
    CustomInteger(int value){
        this.value = value;
    }
    //3. 기능
    @Override
    public String toString(){
        return String.valueOf(this.value);
    }
}
