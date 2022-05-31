package CharacterCode;

import java.io.*;
import java.util.StringTokenizer;

public class sungDatasExam {
    public void readingData(String fname) throws IOException {
        // String fname = "C;/Temp/writed.txt";
        try {
            // File ff = new File(fname);
            // FileReader fr = new FileReader(ff);
            // new File(fname)은 임시 객체
            // fr은 writed.txt 파일을 가리키는 파일 객체 변수
            FileReader fr = new FileReader(new File(fname));
            // 버퍼클래스를 추가한 객체 변수는 br
            // 버퍼클래스를 사용하는 이유는 속도 증가
            BufferedReader br = new BufferedReader(fr);
            String csvStr = "";
            String tmpStr = "";
            do {
                // br이 가리키는 파일의 1줄을 읽어서 tmpStr에 저장
                // tmpStr은 null이 아님
                // 읽을 데이터가 없으면 tmpStr은 null이 됨
               tmpStr = br.readLine();  // readLine()의 리턴값은 String
                if(tmpStr != null) {
                    csvStr += tmpStr + "\t";
                }
            }
            while (tmpStr != null); // true면 do문 반복 처리
            // csvStr에 저장되어 있는 문자열에서 "\t"를 기준으로 토큰(조각)을 생성
            StringTokenizer parse = new StringTokenizer(csvStr, "\t");
            // parse.countTokens()값은 16
            // 즉, "\t"를 구분자로 하여 토큰(문자열 조각)이 16개 생성
            int length = parse.countTokens() / 4;   // length = 4
            // 각각의 배열의 공간이 4개가 만들어짐
            String[] name = new String[length]; // 4개의 메모리 생성
            String[] address = new String[length];
            double[] math = new double[length];
            double[] english = new double[length];
            double[] total = new double[length];
            double[] avg = new double[length];

            for(int i = 0; i < length; i++) {
                // parse는 첫 번째 토큰을 가리킴
                // 첫 번째 문자열을 읽어서 name[i]에 저장
                // 저장한 후에는 nextToken() 메소드에 의해서 parse는 다음 토큰을 가리킴
                name[i] = parse.nextToken();
                address[i] = parse.nextToken();
                // Double래퍼클래스의 valueOf() 메소드는 parse가 가리키는 문자열을 객체 타입의 실수형으로 변환
                // doubleValue() 메소드는 객체 타입의 실수값을 기본형 타입으로 변환 후에 math[i]에 저장
                math[i] = Double.valueOf(parse.nextToken()).doubleValue();
                english[i] = Double.valueOf(parse.nextToken()).doubleValue();
                total[i] = math[i] + english[i];
                avg[i] = total[i] / 2.0;
            }

            for(int j = 0; j < length; j++) {
                System.out.println(name[j] + "\t" + address[j] + "\t" + math[j] + "\t" + english[j] + "\t" + total[j] + "\t" + avg[j]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("잘못된 파일 이름을 입력했습니다.");
        }
    }
}
