package lecture05;

public class Professor extends Human{
    private String subject;

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void showProfessorInfo(){
        showInfo();
        System.out.println(" 담당과목:" + subject );
    }
}
