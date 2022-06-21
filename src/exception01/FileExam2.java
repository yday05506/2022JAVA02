package exception01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExam2 {
    public static void main(String[] args) throws IOException {
        try {
            // 입출력 클래스는 예외처리 문장을 작성하지 않으면 오류가 발생하도록 설계가 되어있음
            FileReader fr = new FileReader("datarr.txt");
            FileWriter fw = new FileWriter("dataww.txt");
            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }
        } catch (Exception e) { // 모든 예외를 처리해 준다
            // 지정된 파일을 찾을 수 없습니다.
            System.out.println(e.toString());
        }
    }
}
