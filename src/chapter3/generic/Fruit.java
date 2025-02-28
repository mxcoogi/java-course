package chapter3.generic;

public class Fruit {
    int weight;
    String name;

    public Fruit(String name, int weight){
        this.name = name;
        this.weight = weight;
    }
    public String toString() {
        return name + " " + weight;
    }
}
