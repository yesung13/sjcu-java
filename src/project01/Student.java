package project01;

public class Student extends Person {

    String grade;
    String dept;

    public Student(String name) {
        super(name); // Person 클래스의 생성자 호출
    }
}