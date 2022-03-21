package lecture03;

/**
 * Created by berno579@gmail.com on 2022/03/15
 * Github : http://github.com/bee0113
 */
public class ForSample {

    public static void main(String[] args) {

        //0부터 100까지 합
//        int sum = 0;
//        for(int i=0; i<=100; i++) {
//            sum += i;
//        }
//        System.out.println(sum);

        int sum = 0;
        for (int i = 1; i <= 10; i++) { //1~10까지 반복
            sum += i;
            System.out.print(i); // 더하는 수 출력

            if (i <= 9) { //1~9까지는  + 출력
                System.out.print("+");
            } else { // i가 10인 경우
                System.out.print("="); // = 출력하고
                System.out.println(sum); // 덧셈 결과 출력
            }
        }
    }
}
