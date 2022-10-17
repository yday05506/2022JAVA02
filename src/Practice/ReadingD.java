package Practice;

import java.io.*;
import java.util.*;

public class ReadingD {
    int length;
    String[] s_num = new String[10];
    String[] name = new String[10];;
    double[] korean = new double[10];
    double[] math = new double[10];
    double[] english = new double[10];
    double[] total = new double[10];
    double[] avg = new double[10];
    String[] grade = new String[10];
    int[] rank = new int[10];
    int ranker;

    public void WritingD(String fname) throws IOException {
        // String fname = "C:/Temp/writing.txt"
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(new File(fname));
            // fw는 "writing.txt"파일을 가리키는 객체변수이다.
            bw = new BufferedWriter(fw);
            // bw는 fw가 라리키는 파일을 가리키며, 버퍼라는 클래스를 추가하여 사용한다.

            bw.write("=============================================================");
            bw.newLine();
            bw.write("학번" + "\t\t" + "이름" + "\t\t" + "국어" + "\t\t" + "영어" + "\t\t" + "수학" + "\t\t" + "총점" + "\t\t" + "평균" + "\t\t" + "학점" + "\t\t" + "등수");
            bw.newLine();
            bw.write("=============================================================");
            bw.newLine();

            for (int j = 0; j < length; j++) {
                bw.write(s_num[j] + "\t" + name[j] + "\t" + String.format("%.0f", korean[j]) + "\t\t" + String.format("%.0f", math[j]) + "\t\t" + String.format("%.0f", english[j])
                        + "\t\t" + total[j] + "\t" + String.format("%.1f", avg[j]) + "\t\t" + grade[j]);
                // bw가 가리키는 파일 "writing.txt"에 출력한다.
                bw.newLine(); // BufferedWriter클래스는 newLine()메소드를 가지고 있다.
                // newLine()는 줄바꿈
            }
            bw.close(); // 파일을 닫을때는 객체생성의 역순으로 한다.
            fw.close();
        } catch (FileNotFoundException e) {
            System.out.println("잘못된 파일 이름을 입력했습니다");
        }
    }

    public void ReadingD(String fname) throws IOException {
        // String fname = "C:/Temp/writed.txt"
        // 배열에 파일으로 부터 읽어들인 데이터를 저장한다.
        try {
            String csvStr = "";
            String tmpStr = "";
            FileReader fr = new FileReader(new File(fname));
            BufferedReader br = new BufferedReader(fr);
            do {
                tmpStr = br.readLine();
                if (tmpStr != null) {
                    csvStr += tmpStr + "\t";
                }
            } while (tmpStr != null);
            StringTokenizer parse = new StringTokenizer(csvStr, "\t");
            length = parse.countTokens() / 5;

            for (int i = 0; i < length; i++) {
                s_num[i] = parse.nextToken();
                name[i] = parse.nextToken();
                korean[i] = Double.valueOf(parse.nextToken()).doubleValue();
                math[i] = Double.valueOf(parse.nextToken()).doubleValue();
                english[i] = Double.valueOf(parse.nextToken()).doubleValue();
                total[i] = math[i] + english[i] + korean[i];
                avg[i] = total[i] / 3.0;
                if (avg[i] >= 90 && avg[i] <= 100) grade[i] = "A";
                else if(avg[i] >= 80) grade[i] = "B";
                else if(avg[i] >= 70) grade[i] = "C";
                else if(avg[i] >= 60) grade[i] = "D";
                else grade[i] = "F";
                rank[i] = Arrays.sort((int)avg);
            }

        } catch (FileNotFoundException e) {
            System.out.println("잘못된 파일 이름을 입력했습니다");
        }
    }
}