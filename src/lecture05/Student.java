package lecture05;

public class Student extends Human{

    private String grade;

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void showStudentInfo(){
        showInfo();
        System.out.println(" 학년:" + grade );
    }
}
