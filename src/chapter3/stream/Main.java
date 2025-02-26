package chapter3.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.print("반복문으로 출력 : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("스트림으로 출력 : ");
        Arrays.stream(arr).forEach(n-> System.out.print(n+" "));
        System.out.println();
        //중간연산
        //filter
        List<Object> sList = new ArrayList<>();
        sList.add("qwe"); sList.add("qwef");sList.add("qweff");sList.add("qwesdfsf");sList.add("qe");
        sList.stream().filter(s -> s.toString().length() >= 5).forEach(s-> {
            System.out.println(s);
        });
        //map
        Person[] pArr = {new Person("q"),new Person("W"),new Person("e"),new Person("r"),new Person("t")};
        Arrays.stream(pArr).map(p -> p.getName()).forEach(p-> System.out.println(p));

        //최종연산 forEach(), count(), sum(), reduce()
        int cnt = (int)sList.stream().filter(s -> s.toString().length() >= 5).count();
        System.out.println(cnt);


        Stream<Object> stream = sList.stream();
        stream.sorted().forEach(s -> System.out.println(s));

        int res = Arrays.stream(arr).reduce(0, (a, b)-> a/2+b);
        System.out.println(res);

        List<Customer> cList = new ArrayList<>();
        cList.add(new Customer("이순신",40, 100));
        cList.add(new Customer("김유신", 20, 100));
        cList.add(new Customer("홍길동", 13, 50));
        System.out.println("고객 명단 출력");
        cList.stream().map(s->s.getName()).forEach(s -> System.out.print(s+" "));
        System.out.println();
        int total = cList.stream().mapToInt(s->s.getPrice()).sum();
        System.out.println(total);
        cList.stream().filter(s->s.getAge() >=20).map(s->s.getName()).sorted().forEach(s-> System.out.println(s));
    }
}
