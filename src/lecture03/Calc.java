package lecture03;

/**
 * Created by berno579@gmail.com on 2022/03/20
 * Github : http://github.com/bee0113
 */
public class Calc {
    public static void main(String[] args) {
        double sum = 0.0;

        System.out.println("Hello world" + args.length);

        for (int i = 0; i < args.length; i++) { // 인자 개수만큼 반복
            sum += Double.parseDouble(args[i]); // 문자열을 실수(double 타입)로 변환하여 합산
        }
        System.out.println("합계 : " + sum);
    }
}
