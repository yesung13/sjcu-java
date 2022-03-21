package lecture03;

/**
 * Created by berno579@gmail.com on 2022/03/17
 * Github : http://github.com/bee0113
 */
public class ForeachEx {
    public static void main(String[] args) {
        String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};

        for (int i = 0; i < names.length; i++) {
            String name = names[i];

        }
        for (String s : names) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
