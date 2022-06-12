package lecture07;

import java.util.Iterator;
import java.util.Vector;

/**
 * Created by berno579@gmail.com on 2022/06/11
 * Github : http://github.com/bee0113
 */
public class IteratorEx {

    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>(7);

        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);

        Iterator<Integer> it = v.iterator();
        while(it.hasNext()) {
            int n = it.next();
            System.out.println(n);
        }

    }
}
