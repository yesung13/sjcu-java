package lecture04;

/**
 * Created by berno579@gmail.com on 2022/03/15
 * Github : http://github.com/bee0113
 */
public class LearnAct01 {


    public static void main(String[] args) {
        // 1.
        System.out.println("1문제");
        example1();

        // 2.
        System.out.println("\n2문제");
        example2();
    }

    public static void example1() {
        Human h = new Human();
        Human[] array = new Human[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = h;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].nane + " ");

        }


    }

    public static void example2() {


    }

}
