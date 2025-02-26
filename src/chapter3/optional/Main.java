package chapter3.optional;

import chapter2.polymorphism.v1.Cat;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Camp camp = new Camp();
        Student steve = new Student("steve");
        camp.setStudent(steve);
        //Optional 객체 활용
        Optional<Student> student = camp.getStudent();
        boolean flag = student.isPresent();
        if (flag) {
            Student student1 = student.get();
        }else {
            System.out.println("데이터 없음");
        }

//        Student student = camp.getStudent();
//        String studentName;
////        String studentName = student.getName();
////        System.out.println("studentName : " + studentName);
//
//        if(student != null){
//            studentName = student.getName();
//        }else {
//            System.out.println("등록된 학생이 아님");
//        }
//        studentName = student.getName();
//        System.out.println("studentName : " + studentName);


    }
}
