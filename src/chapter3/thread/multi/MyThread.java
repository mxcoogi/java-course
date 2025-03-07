package chapter3.thread.multi;

public class MyThread extends Thread{


    @Override
    public void run(){
        String threadName = Thread.currentThread().getName();
        System.out.println("현재 시작된 쓰레드 : " + threadName);
        for(int i = 0; i < 10; i++){
            System.out.println("작업중인 스레드 : " + threadName + "-" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("종료된 스레드 : " + threadName);
    }
}
