package bytecode;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;

public class BufferedExam {
    public static void main(String[] args) {
        // 키보드로부터 1바이트를 읽을 수 있고, 버퍼를 사용할 것임
        // bi 객체 변수는 in 객체의 메소드들을 사용 가능
        BufferedInputStream bi = new BufferedInputStream(System.in);
        // 1바이트를 화면에 출력하는 객체인데 버퍼를 사용해서 출력 할 것임
        // 버퍼를 사용하는 이유 : 데이터 양이 많을 경우 속도 빨라짐
        BufferedOutputStream bo = new BufferedOutputStream(System.out);

        int aa;

        try {
            while((aa = bi.read()) != -1) { // ctrl + z
                bo.write(aa);   // bo가 가리키는 임시 기억 공간인 버퍼에 출력
            }
            bo.flush(); // 버퍼에 출력되어 있는 데이터를 한꺼번에 화면에 출력
        }
        catch (IOException e) {
        }
    }
}
