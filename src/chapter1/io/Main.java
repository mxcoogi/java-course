package chapter1.io;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //출력
        System.out.println("Hello");
        System.out.println("world"); //자동 줄바꿈
        System.out.print("안녕");
        System.out.print("세상"); //자동 줄바꿈 x

        System.out.println("Hello\nworld");

        //입력
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine(); //문자열 입력받기
        System.out.println(str);

        //정수입력받기
        int intBox = scanner.nextInt();
        System.out.println(intBox);

        long longBox = scanner.nextLong();
        System.out.println(longBox);

        //소수
        double dobBox = scanner.nextDouble();
        System.out.println(dobBox);

    }
}
