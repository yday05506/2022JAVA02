package Practice;;

import java.io.IOException;

public class WritingD {
    public static void main(String[] args) {
        ReadingD wd = new ReadingD();
        try {
            wd.readingData ("C:/Temp/sung_read.txt");
            wd.writingData("C:/Temp/sung_write.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
