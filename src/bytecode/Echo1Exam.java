package bytecode;

import java.io.IOException;

public class Echo1Exam {
    public static void main(String[] args) {
        int bt;
        try {
            // 문자를 입력 받을 때 리턴 값은 아스키코드 값(ASCII CODE)
            bt = System.in.read();  // 1바이트 데이터 입력, 2바이트 한글 데이터는 처리 불가
            // bt값을 문자로 형변환
            System.out.print((char)bt);
        }
        catch (IOException e) {
            System.err.println(e);
        }
    }
}
