package chapter2.clazz;

public class Main {

    public static void main(String[] args) {
        Person personA = new Person("김마리", 5);
        Person personB = new Person("steve", 25);

        System.out.println(personA.name);
        System.out.println(personA.name);

        int res1 = personA.sum(1, 2);
        int res2 = personB.sum(2,3);
        System.out.println(res1);
        System.out.println(res2);

        String nameA = personA.getName();
        personA.setAddress("대전광역시");

    }

}
