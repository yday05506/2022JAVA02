package Practice;

import java.io.*;

public class WritingD {
    public static void main(String[] args) {
        ReadingD wd = new ReadingD();
        try {
            wd.ReadingD("C:/Temp/sung_read.txt");
            wd.WritingD("C:/Temp/sung_write.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}