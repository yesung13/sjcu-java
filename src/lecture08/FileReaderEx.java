package lecture08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by berno579@gmail.com on 2022/05/05
 * Github : http://github.com/bee0113
 */
public class FileReaderEx {

    public static void main(String[] args) {

        FileReader fin = null;

        try {
            fin = new FileReader("/Users/yoonjaeseung/upload/test.txt");
            int c;

            while ((c = fin.read()) != -1) { // read() 메서드는 파일의 끝을 만나는 경우 -1 반환.
                System.out.print((char) c);
            }
            System.out.println();
            fin.close();

        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }


}
