package CharacterCode;

import java.io.*;
import java.util.StringTokenizer;

public class sungDatasExam {
    public void readingData(String fname) throws IOException {
        try {
            FileReader fr = new FileReader(new File(fname));
            BufferedReader br = new BufferedReader(fr);
            String csvStr = "";
            String tmpStr = "";
            do {
                tmpStr = br.readLine();
                if(tmpStr != null) {
                    csvStr += tmpStr + "\t";
                }
            }
            while (tmpStr != null);
            StringTokenizer parse = new StringTokenizer(csvStr, "\t");
            int length = parse.countTokens() / 4;
            String[] name = new String[length];
            String[] address = new String[length];
            double[] math = new double[length];
            double[] english = new double[length];
            double[] total = new double[length];
            double[] avg = new double[length];

            for(int i = 0; i < length; i++) {
                name[i] = parse.nextToken();
                address[i] = parse.nextToken();
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
