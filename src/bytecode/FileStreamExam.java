package bytecode;

import java.io.*;

public class FileStreamExam {
    public static void main(String[] args) throws IOException{
        byte[] b = new byte[1024];
        // fis는 "tin.txt" 파일을 가리키는 객체 변수
        FileInputStream fis = new FileInputStream("E:\\mirim\\2022\\class\\Java\\src\\bytecode");   // 절대 경로
        // fos는 "tout.txt" 파일을 가리키는 객체 변수
        FileOutputStream fos = new FileOutputStream("src/bytecode/tout.txt");
//        FileOutputStream fos = new FileOutputStream("src/bytecode/tout.txt"); // 상대 경로
        // fis가 가리키는 "tin.txt" 파일에서 데이터를 읽고 배열 b에 저장
        fis.read(b);
        // 배열 b에 저장되어 있는 데이터를 fos가 가리키는 "tout.txt" 파일에 출력
        fos.write(b);
        // 파일을 닫아줌.
        // fis 객체 변수는 더 이상 "tin.txt" 파일을 사용하지 않음
        fis.close();
        // 파일을 닫을 때 객체 생성의 역순으로 함
        fos.close();
    }
}
