package chapter3.exception;

public class ExceptionPractice {

    //1. 언체크 예외 호출 예시
    public void callUncheckedException() {
        if(true){
            System.out.println("언체크 예외");
            throw new RuntimeException();
        }
//        try {
//            if (true) {
//                System.out.println("언체크 예외");
//                throw new RuntimeException();
//            }
//        } catch (RuntimeException e) {
//            System.out.println("언체크 예외 처리" + e);
//        }catch (Exception e){
//            System.out.println("체크 예외처리");
//        }

    }
    //체크예외
    public void callCheckedException() throws Exception{
        if (true) {
            System.out.println("체크 예외 발생");
            throw new Exception();
        }
        //        try {
//            if (true) {
//                System.out.println("체크 예외 발생");
//                throw new Exception();
//            }
//        } catch (Exception e) {
//            System.out.println("체크 예외 처리");
//        }
    }


}
