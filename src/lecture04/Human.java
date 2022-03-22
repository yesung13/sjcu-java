package lecture04;

public class Human {
    String nane;
    int age;
    double height;
    double weight;

    public Human() {}

    public Human(String nane, int age, double height, double weight) {
        this.nane = nane;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getNane() {
        return nane;
    }

    public void setNane(String nane) {
        this.nane = nane;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
