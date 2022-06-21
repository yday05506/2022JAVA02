package exception01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExam {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("datarr.txt");
        FileWriter fw = new FileWriter("dataww.txt");
        int c;
        while((c = fr.read()) != -1) {
            fw.write(c);
        }
    }
}
