package lecture07;

import java.util.Vector;

/**
 * Created by berno579@gmail.com on 2022/04/24
 * Github : http://github.com/bee0113
 */
public class VectorEx {

    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>(7);

        v.add(5);
        v.add(4);
        v.add(-1);

        int n = v.size();
        int c = v.capacity();

        v.add(2, 100);
        //v.add(5, 100); // 5의 레퍼

        Integer obj = v.get(1);
        int i = obj.intValue();

        System.out.println("size: " + n + "\ncapacity: " + c + "\nintvalue: " + i);

    }
}
