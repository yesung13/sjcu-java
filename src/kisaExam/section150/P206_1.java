package kisaExam.section150;

/**
 * Created by berno579@gmail.com on 2022/09/13
 * Github : http://github.com/bee0113
 */
public class P206_1 {
    public static void main(String[] args) {
        int a[] = new int[8];
        int i = 0;
        int n = 10;

        while (n > 0) {
            a[i++] = n % 2;
            n /= 2;
        }

        for (i = 7; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
