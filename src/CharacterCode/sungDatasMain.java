package CharacterCode;

import java.io.*;

public class sungDatasMain {
    public static void main(String[] args) {
        //sungDatasExam 클래스의 wd 객체 생성
        sungDatasExam wd = new sungDatasExam();
        try {
            //reading 메소드를 호출. 인자값으로 writed.txt 전달
            wd.readingData("C:/Temp/writed.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
