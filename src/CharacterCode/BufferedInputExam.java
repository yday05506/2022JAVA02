package CharacterCode;

import java.io.*;

public class BufferedInputExam {
    public static void main(String[] args) {
        // BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        String s = "";
        try {
            s = in.readLine();  // 키보드로부터 라인 단위로 데이터를 입력하게 되면
                                // 버퍼에 임시적으로 저장되면 그 값을 s에게 넘겨줌
        } catch (Exception e) { // 예외가 발생되었을 경우에만 실행
            System.out.println("Error : " + e.toString());
        }
        System.out.println(s);
    }
}
