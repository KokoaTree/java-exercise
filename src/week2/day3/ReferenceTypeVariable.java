package week2.day3;

import java.util.Arrays;

public class ReferenceTypeVariable {
    public static void main(String[] args) {
//        Student 타입
        Student student = new Student(); // new를 통해 Student 객체 -> 인스턴스화
        Student[] students = new Student[30];

        students[0] = new Student();
        students[0].name = "김태환";
        students[0].phoneNumber = "010-1357-2468";
        students[0].age = 28;

        students[1] = new Student();
        students[1].name = "장매구";
        students[1].phoneNumber = "010-2345-84843";
        students[1].age = 25;

        students[2] = new Student();
        students[2].name = "신우사";
        students[2].phoneNumber = "010-2324-4949";
        students[2].age = 21;

        System.out.println(Arrays.toString(students));
        System.out.printf("%s\n%s\n%d\n", students[0].name, students[0].phoneNumber, students[0].age);
        System.out.printf("%s\n%s\n%d\n", students[1].name, students[1].phoneNumber, students[1].age);
        System.out.printf("%s\n%s\n%d\n", students[2].name, students[2].phoneNumber, students[2].age);

//        primitive type은 class X
    }

}
