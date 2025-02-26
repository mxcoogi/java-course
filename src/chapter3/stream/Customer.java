package chapter3.stream;

import javax.swing.text.html.parser.TagElement;

public class Customer {
    private String name;
    private int age;
    private int price;

    public Customer(String name, int age, int price){
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPrice() {
        return price;
    }
}
