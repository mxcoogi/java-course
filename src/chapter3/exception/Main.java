package chapter3.exception;

public class Main {
    public static void main(String[] args) {
        //1 의도하지 않은 예외
        //int ret = 10 / 0;
        //System.out.println("ret : " + ret);

        //2 의도적인 예외 throw
//        int age = 10;
//        if(age < 18){
//            throw new IllegalArgumentException("미성년자는 접근 불가");
//        }
        ExceptionPractice exceptionPractice = new ExceptionPractice();
//        try {
//            exceptionPractice.callUncheckedException();
//        }catch (RuntimeException e){
//            System.out.println("언체크 예외");
//        }
        try {
            exceptionPractice.callCheckedException();
        } catch (Exception e) {
            System.out.println("체크 예외 처리");
        }


    }
}
