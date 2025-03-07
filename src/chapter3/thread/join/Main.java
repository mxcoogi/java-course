package chapter3.thread.join;

import chapter3.thread.multi.MyThread;

public class Main {
    public static void main(String[] args) {
        System.out.println("메인 함수 시작");
        long startTime = System.currentTimeMillis();
        MyThread thread0 = new MyThread();
        MyThread thread1 = new MyThread();
        thread0.start();
        thread1.start();

        try{
            thread0.join();
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("작업 시간 : " + totalTime + "ms");
        System.out.println("메인 함수 종료");
    }
}
