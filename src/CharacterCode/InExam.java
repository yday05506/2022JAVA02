package CharacterCode;

import java.io.*;

public class InExam {
    public static void main(String[] args) {
        String a = "", b="";
        int sum = 0;
        float average = 0;
        // 키보드로부터 데이터를 입력받음
        InputStreamReader nn = new InputStreamReader(System.in);
        //BufferedReader in = new BufferedReader(new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(nn);
        try {
            System.out.print("Enter the string(정수) > ");
            a = in.readLine();  // 한 줄씩 입력
            System.out.print("Enter the string(정수) > ");
            b = in.readLine();  // 한 줄씩 입력
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("You input is " + a + ", " + b);
        // Integer 클래스 안에 parseInt(a)에서 a값을 정수형으로 변환해서 c에 저장
        int c = Integer.parseInt(a);
        // Integer 클래스 안에 parseInt(b)에서 b값을 정수형으로 변환해서 c에 저장
        int d = Integer.parseInt(b);
        sum = c + d;
        average = (float)sum / 2;
        System.out.println("두 수의 합 : " + sum);
        System.out.println("평균 : " + average);
    }
}
