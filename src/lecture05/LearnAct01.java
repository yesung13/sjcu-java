package lecture05;


/**
 * Created by berno579@gmail.com on 2022/03/15
 * Github : http://github.com/bee0113
 */
public class LearnAct01 {

    public static void main(String[] args) {
        Student s = new Student();
        Professor p = new Professor();

        s.setDefault("홍길동", "13", "남");
        s.setGrade("1학년");
        p.setDefault("미나리", "55", "여");
        p.setSubject("수학");

        s.showStudentInfo();
        p.showProfessorInfo();
    }

}
