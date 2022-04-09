package lecture07;

/**
 * Created by berno579@gmail.com on 2022/04/09
 * Github : http://github.com/bee0113
 */
public class AutoBoxingUnBoxingEx {

    public static void main(String[] args) {
        int n = 10;
        Integer intObject = n;
        System.out.println("intObject = " + intObject);

        int m = intObject + 10;
        System.out.println("m = " + m);

        String a = " xyz\t ";
        System.out.println(a.trim());
        System.out.println(a.charAt(2));
    }
}
