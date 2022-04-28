package lecture06;

/**
 * Created by berno579@gmail.com on 2022/03/15
 * Github : http://github.com/bee0113
 */
public class LearnAct04 {

    public static void main(String[] args) {
        String str = "My name is Tom.";

        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                cnt++;
            }

        }
        System.out.println("공백 문자의 개수: " + cnt);

    }

}
