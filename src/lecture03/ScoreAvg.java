package lecture03;

/**
 * Created by berno579@gmail.com on 2022/03/19
 * Github : http://github.com/bee0113
 */
public class ScoreAvg {
    public static void main(String[] args) {
        double score[][] = {{3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
        double sum = 0;

        for (int year = 0; year < score.length; year++) { // 각 학년별로 반혹
            for (int term = 0; term < score[year].length; term++) { // 각 학년의 학기별로 반복
                sum += score[year][term];
            }
        }

        int n = score.length;      // 배열의 행 개수, 4
        int m = score[0].length; // 배열의 열 개수, 2
        System.out.println("4년 전체 평점 평균: " + sum / (n * m));

    }
}
