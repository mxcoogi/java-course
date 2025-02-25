package chapter2.capsulation;

public class Person {

    //속성
    private String name;
    private String secret;

    //생성자 기본 접근제어자는 default
    public Person(String name){
        this.name = name;
    }
    //기능
    public void methodA(){}
    public void methodB(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
