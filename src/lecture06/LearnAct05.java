package lecture06;

import java.util.Calendar;

/**
 * Created by berno579@gmail.com on 2022/03/15
 * Github : http://github.com/bee0113
 */
public class LearnAct05 {

    public static void main(String[] args) {
        System.out.println(Math.floor(Math.PI));

        Calendar myDate = Calendar.getInstance();
        myDate.clear();
        /*myDate.set(3030, 8, 25, 14,15);*/
        myDate.set(3030, 8, 25);
        myDate.set(Calendar.HOUR_OF_DAY, 14);
        myDate.set(Calendar.MINUTE, 15);

        System.out.println(myDate.getTime());


    }

}
