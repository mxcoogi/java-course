package chapter3.thread.multi;

public class Main {
    public static void main(String[] args) {

        System.out.println("메인 함수 시작");
        MyThread thread0 = new MyThread();
        MyThread thread1 = new MyThread();
        thread0.start();
        thread1.start();
        System.out.println("메인 함수 종료");
    }
}
