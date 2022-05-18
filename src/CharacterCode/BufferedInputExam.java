package CharacterCode;

import java.io.*;

public class BufferedInputExam {
    public static void main(String[] args) {
        // BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        String s = "";
        try {
            s = in.readLine();  // 키보드로부터 라인 단위로 데이터를 입력
        } catch (Exception e) {
            System.out.println("Error : " + e.toString());
        }
        System.out.println(s);
    }
}
