package kisaExam.section150;

/**
 * Created by berno579@gmail.com on 2022/09/14
 * Github : http://github.com/bee0113
 */
public class P207_4 {
    public static void main(String[] args) {
        int a = 0, sum = 0;
        while (a < 10) {
            a++;
            if (a % 2 == 1) {
                continue;
            }
            sum += a;
        }
        System.out.println(sum);
    }
}
