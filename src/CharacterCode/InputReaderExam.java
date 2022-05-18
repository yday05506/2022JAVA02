package CharacterCode;

import java.io.*;

public class InputReaderExam {
    public static void main(String[] args) {
        // reader 객체변수는 read() 메소드에 의해 키보드로부터 데이터를 입력받을 수 있는 권한을 받음
        Reader reader = new InputStreamReader(System.in);
        // InputReaderExam reader = new InputStreamReader(System.in);
        try {
            while(true) {
                // 키보드로부터 입력 받음
                int i = reader.read();
                if(i == -1) break;  // ctrl + z(-1)
                char c = (char)i;
                System.out.print(c);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println();
    }
}
