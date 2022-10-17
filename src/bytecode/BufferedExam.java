package bytecode;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;

public class BufferedExam {
    public static void main(String[] args) {
        BufferedInputStream bi = new BufferedInputStream(System.in);
        BufferedOutputStream bo = new BufferedOutputStream(System.out);

        int aa;

        try {
            while((aa = bi.read()) != -1) {
                bo.write(aa);
            }
            bo.flush();
        }
        catch (IOException e) {
        }
    }
}
