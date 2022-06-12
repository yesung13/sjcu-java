package lecture07;

import java.util.ArrayList;

/**
 * Created by berno579@gmail.com on 2022/06/11
 * Github : http://github.com/bee0113
 */
public class ArrayListEx {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>(7);
        al.add("Hello");
        al.add("Hi");
        al.add("Java");

        int n = al.size(); // 사이즈 3 저장됨
//        int c = al.capacity(); // 해당 컬렉션에는 없는 메서드
        al.add(2, "Sanni");
//        al.add(5, "Sanni"); // add 메서드는 인덱스가 사이즈 메서드보다 크면 값 삽입 불가능

        String str = al.get(1);

        System.out.println("size: " + n);
        System.out.println(str);





    }


}
