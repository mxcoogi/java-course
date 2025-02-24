package chapter1.condition;

public class Main {
    public static void main(String[] args) {

        //if(조건값)
        String light = "초록불";
        if(light.equals("초록불")){
            System.out.println("건너세요");
        } else if (light.equals("노랑불")) {
            System.out.println("주의하세요");
        } else{
            System.out.println("멈추세요");
        }
        System.out.println("...");


        //switch(단일값)
        int index = 1;
        switch (index){
            case  1:
                System.out.println(index);
                break;  //break를 만나면 switch문을 탈출함
                        //break가 없으면 1부터 차례대로 실행된다
            case 2:
                System.out.println(index);
                break;
            case 3:
                System.out.println(index);
                break;
            default:
                break;
        }


    }
}
