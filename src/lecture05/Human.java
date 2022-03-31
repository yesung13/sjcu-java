package lecture05;

public class Human {
    private String name;
    private String age;
    private String gender;

    public void setDefault(String name, String age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void showInfo() {
        System.out.print("이름:" + name + " 나이:" + age + " 성별:" + gender);
    }
}
