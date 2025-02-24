package chapter1.array;

public class Main {
    public static void main(String[] args) {
        String name1 = "kim";
        String name2 = "park";
        // 변수가 많아진다면..?

        //이럴 땐 배열을 사용하자
        String[] names = {"kim", "park"};
        //자료형[] 변수이름 = new 자료형[배열길이];
        int[] data = new int[5]; // 5개의 정수형 자료를 담는 배열
        //int[] data = {1,2,3,4,5};
        //4바이트씩 5개 0-> 20byte의 크기를 가진다
        //배열길이구하기
        int length = data.length;
        //배열의 요소에 접근하기 index 인덱스!
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        //배열의 범위가 벗어날 경우?
        //ArrayIndexOutOfBoundsException

        //배열에 반복문으로 접근하기
        for(int i=0;i<length;i++){
            System.out.println(i+" 번 째 요소에 접근 : " + arr[i]);
        }

        //향상된 for문
        for(int a : arr){
            System.out.println(a);
        }

        //2차원 배열 new boolean[2][2]; //행 수 , 열 수
        boolean[][] board = {
                {true, true},
                {false, true},
        };
        System.out.println(board[0][0]);
        System.out.println(board[1][0]);

    }
}
