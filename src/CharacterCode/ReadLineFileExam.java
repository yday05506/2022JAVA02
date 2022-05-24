package CharacterCode;

import java.io.*;

public class ReadLineFileExam {
    public static void main(String[] args) {
        String fname = "C:/Temp/BufferInput.txt";
        try {
            // fr은 "BufferedInput.txt" 파일을 가리키는 객체 변수
            FileReader fr = new FileReader(fname);
            // br은 "BufferedInpute.txt" 파일을 가리키는 객체 변수이고
            // 버퍼 클래스에 있는 readLine() 메소드를 사용하기 위함
            // 버퍼 클래스는 입력과 출력의 속도를 증가 시켜줌
            BufferedReader br = new BufferedReader(fr);
            String s = "";

            while((s = br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
