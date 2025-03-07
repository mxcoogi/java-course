package chapter3.thread.single;

public class Main {
    public static void main(String[] args) {
        System.out.println("::: 스레드 작업 시작");
        String threadName = Thread.currentThread().getName();
        for (int i = 0; i < 10; i++) {
            System.out.println("스레드 이름 : " + threadName + " - " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("::: 작업 끝");
    }
}

