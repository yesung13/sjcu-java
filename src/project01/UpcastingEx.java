package project01;

class UpcastingEx {

    public static void main(String[] args) {

        Person p;
        Student s = new Student("홍길동");
        p = s; // 업캐스팅 된 변수 p

        System.out.println(p.name);
        s.grade = "A"; // Person의 멤버가 아니라 Student의 멤버
        s.dept = "Com"; // Person의 멤버가 아니라 Student의 멤버
    }
}
