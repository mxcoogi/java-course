package chapter3.generic;

public class Grape extends Fruit{


    public Grape(String name, int weight) {
        super(name, weight);
    }

    @Override
    public String toString() {
        return name + " " + weight;
    }
}
