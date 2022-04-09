package lecture07;

/**
 * Created by berno579@gmail.com on 2022/04/09
 * Github : http://github.com/bee0113
 */
public class StringBufferEx {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This");
        sb.append(" is pencil");
        System.out.println(sb);

        sb.insert(7, " my");
        System.out.println(sb);

        sb.replace(8, 10, "your");
        System.out.println(sb);

        sb.delete(8, 13);
        System.out.println(sb);

        sb.setLength(4);
        System.out.println(sb);
    }
}
