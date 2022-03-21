package lecture03;

/**
 * Created by berno579@gmail.com on 2022/03/19
 * Github : http://github.com/bee0113
 */
public class ReturnArray {
    static int[] makeArray() {
        int[] temp = new int[4];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = i;
        }

        return temp;
    }

    public static void main(String[] args) {

        int[] intArray;
        intArray = makeArray();
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
    }


}
