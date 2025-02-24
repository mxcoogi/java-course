package chapter1.loop;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("안녕하세요");
        }
        /*
        for(시작조건; 종결조건; 조건 변화수식){
            반복할 명령문
        }
        */

        //break 반복문을 벗어 날 때 사용
        for (int i = 0; i < 10; i++) {
            if(i==4){
                break;
            }
            System.out.println("안녕하세요");
        }
        //continue 반복문 스킵할때
        for (int i = 0; i < 10; i++) {
            if(i==4){
                continue;
                //안녕하세요 출력 안함
            }
            System.out.println("안녕하세요");
        }

        //반복문 while(종결조건)
        int i = 0;
        while(i <= 10){
            System.out.println(i);
            i++; //조건변화 수식
        }

        //do-while(종결조건)
        do {
            System.out.println(i);
            i++;
        }while(i <= 10);
        //먼저 실행시킴


    }
}
