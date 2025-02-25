package chapter2.interfaceexample;

public class Main {
    public static void main(String[] args) {
        LuxuryCar luxuryCar = new LuxuryCar();
        SpeedCar speedCar = new SpeedCar();

//        luxuryCar.drive();
//        luxuryCar.stop();
//        //같은 자동차인데 주행시키는 방법이 다르다 -> 일관성이 없음
//        //speedCar.move();
//        //speedCar.stop();
//        speedCar.drive();
        //interface 활용
        luxuryCar.drive();
        luxuryCar.stop();
        speedCar.drive();
        speedCar.stop();
        //확장
        luxuryCar.charge();
        speedCar.autoParking();
    }
}
