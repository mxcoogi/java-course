package chapter2.staticc;

public class Main {
    public static void main(String[] args) {
        //클래스를 통해서 접근 static
        System.out.println("static 변수 활용: " + Person.population);
        Person.printPopulation();


        //instance example
        Person personA = new Person();
        personA.name = "kim";
        personA.printName();


    }
}
