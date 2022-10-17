package Practice;

import java.io.*;
import java.util.*;

public class ReadingD {
    int length;
    String[] s_number = new String[10];
    String[] name = new String[10];
    double[] korean = new double[10];
    double[] english = new double[10];
    double[] math = new double[10];
    double[] total = new double[10];
    double[] avg = new double[10];
    String[] score = new String[10];
    double[] grade = new double[10];

    public void readingData(String fname) throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            FileReader fr = new FileReader(new File(fname));
            BufferedReader br = new BufferedReader(fr);
            String csvStr = "";
            String tmpStr = "";
            do {
                tmpStr = br.readLine();
                if (tmpStr != null) {
                    csvStr += tmpStr + "\t";
                }
            } while (tmpStr != null);
            StringTokenizer parse = new StringTokenizer(csvStr, "\t");
            int length = parse.countTokens() / 5;
            String[] s_number = new String[length];
            String[] name = new String[length];
            double[] korean = new double[length];
            double[] english = new double[length];
            double[] math = new double[length];
            double[] total = new double[length];
            double[] avg = new double[length];
            String[] score = new String[length];
            double[] grade = new double[length];

            for (int i = 0; i < length; i++) {
                s_number[i] = parse.nextToken();
                name[i] = parse.nextToken();
                score[i] = parse.nextToken();
                math[i] = Double.valueOf(parse.nextToken()).doubleValue();
                english[i] = Double.valueOf(parse.nextToken()).doubleValue();
                korean[i] = Double.valueOf(parse.nextToken()).doubleValue();
                grade[i] = i;
                total[i] = math[i] + english[i] + korean[i];
                avg[i] = total[i] / 3.0;
            }

            System.out.println("학번" + "\t" + "이름" + "\t" + "국어" + "\t" + "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균" + "\t" + "학점" + "\t" + "등수");
            System.out.println("=========================================================================================");
            for (int j = 0; j < length; j++) {
                System.out.println(s_number[j] + "\t" + name[j] + "\t" + (int)(korean[j]) + "\t" + (int)(english[j]) + "\t" + (int)(math[j]) + "\t" + (int)(total[j]) + "\t" + (int)(avg[j]) + "\t" + score[j] + "\t" + (int)(grade[j]));
            }
        } catch (
                FileNotFoundException e) {
            System.out.println("잘못된 파일 이름을 입력했습니다.");
        }
    }

    public void writingData(String s) {
    }
}
