package TextInheritance11;

public class SoundExam {
    public static void main(String[] args) {
        Sound radio = new Radio();  // UpCasting과 유사
        // radio 객체 변수는 Radio 클래스에서 재정의된 메소드에 접근
        Sound tv = new TV();    // UpCasting과 유사함

        radio.SoundUp(5);
        tv.SoundUp(5);
    }
}
