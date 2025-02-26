package chapter3.collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //배열의 한계
        int[] numbers = new int[3]; //선언과 동시에 길이 설정 필요 선언한길이 이상의 데이터를 넣을 수 없음

        //컬렉션

        //ArrayList -> List 순서유지, 중복허용
        //요소의 순서를 유지하고 중복된 값 허용하는 자료구조
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        //배열의 길이가 정해지지 않기 때문에 마음대로 넣고 빼고 가능
        ArrayList<String> names = new ArrayList<>();
        //데이터 추가, 삭제, 조회
        names.add("김"); names.add("박"); names.add("최");
        names.add("김");
        System.out.println(names);
        String name1 = names.get(0);
        names.remove("김");

        //HashSet 순서유지X 중복X
        HashSet<String> uniqueNames = new HashSet<>();
        uniqueNames.add("김");
        uniqueNames.add("박");
        uniqueNames.add("최");
        System.out.println(uniqueNames);
        //순서보장 x -> get메서드 없음
        //중복 불가
        uniqueNames.add("김");
        System.out.println(uniqueNames);
        uniqueNames.remove("김");

        //HashMap 키-값 구조로 저장, 키 중복 불가, 값 중복 가능, 순서보장X
        HashMap<String, Integer> memberMap = new HashMap<>();
        memberMap.put("김", 1);
        memberMap.put("최", 2);
        memberMap.put("박", 3);
        System.out.println(memberMap);
        memberMap.put("김", 5);
        System.out.println(memberMap);//기존 값을 덮어 씌움
        Integer value = memberMap.get("김");
        System.out.println(value);
        memberMap.remove("김");
        System.out.println(memberMap);
        //키 확인
        Set<String> keySet = memberMap.keySet();
        Collection<Integer> valueSet = memberMap.values();
        System.out.println(keySet +" "+ valueSet);

    }
}
