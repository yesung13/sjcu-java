package kisaExam.section150;

/**
 * Created by berno579@gmail.com on 2022/09/14
 * Github : http://github.com/bee0113
 */
public class P206_2 {
    public static void main(String[] args) {
        int ary[][] = new int[3][5];
        int n = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                ary[i][j] = j * 3 + i + 1;
                System.out.println(ary[i][j] + " ");
            }
            System.out.println();
        }
    }
}
