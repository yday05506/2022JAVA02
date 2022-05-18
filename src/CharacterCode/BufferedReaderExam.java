package CharacterCode;

import java.io.*;

public class BufferedReaderExam {
    public static void main(String[] args) {
        InputStreamReader bi = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(bi);
        try {
            String aa = br.readLine();  // 키보드로부터 라인 단위로 데이터를 읽어서 aa에 저장
            System.out.println(aa);
            br.close(); // 자원 해제
            bi.close();
        } catch (IOException ie) {}
    }
}
