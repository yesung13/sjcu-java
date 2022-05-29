package sample;

/**
 * Created by berno579@gmail.com on 2022/05/28
 * Github : http://github.com/bee0113
 */
public class GreedyAlgorithmEx {
    public static void main(String[] args) {
        int n = 4450;
        int cnt = 0;
        int[] cointypes = {1000 ,500, 100, 50, 10};

        for (int i = 0; i < 5; i++) {
            cnt=0;
            int coin = cointypes[i];
            cnt += n / coin;
            n %= coin;
            System.out.println(cnt);
        }

    }
}
