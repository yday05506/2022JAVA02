package CharacterCode;

import java.io.*;

public class FileExam {
    public static void main(String[] args) {
        char buffer[] = new char[100];
        try {
            // fr 객체 변수는 datar.txt 파일을 가리킴
            FileReader fr = new FileReader("src/CharacterCode/datar.txt");
            // fw 객체 변수는 dataw.txt 파일을 가리킴
            FileWriter fw = new FileWriter("src/CharacterCode/dataw.txt");
            // fr이 가리키는 datar.txt 파일의 내용을 읽어서 buffer 배열에 저장
            fr.read(buffer, 0, 100);
            // String(buffer)는 buffer 배열에 저장되어 있는 데이터를 문자열로 변경하여 str에 저장
            String str = new String(buffer);
            // System.out.println(str);
            // buffer 배열에 저장되어 있는 데이터를 임시기억공간에 출력
            fw.write(buffer);
            // 버퍼(임시기억공간)에 저장되어 있는 데이터를 한꺼번에 dataw.txt 파일에 출력
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
