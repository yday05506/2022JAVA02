package exception01;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileExam7 {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("c:/Temp/test123.java");
        } catch (FileNotFoundException fe) {    // 파일을 찾을 수 없을 때 발생하는 예외
            System.out.println(fe.toString());
        }
    }
}
