package CharacterCode;

import java.io.FileReader;
import java.io.FileWriter;

public class FileExam2 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("src/CharacterCode/datar2.txt");
            FileWriter fw = new FileWriter("src/CharacterCode/dataw2.txt");

            int c;
            while((c = fr.read()) != -1) {
                fw.write(c);    // dataw2.txt 파일에 실제적으로 출력
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
