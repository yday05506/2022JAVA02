package exception01;

public class ThrowExam {
    // try~catch 문장 안에 있는 arrayMethod() 메소드 안에서 예외가 발생되었을 때
    // ArrayIndexOutOfBoundsException를 호춣ㄴ 곳으로 던지라는 의미
    public static void arrayMethod() throws ArrayIndexOutOfBoundsException {
        String[] irum = new String[3];
        irum[0] = "이미림";
        irum[1] = "마이스터";
        irum[2] = "뉴미디어소프트웨어";
        irum[3] = "뉴미디어솔루션";    // 이 문장 실행할 때 예외 발생
    }
    public static void main(String[] args) {
        ThrowExam ts = new ThrowExam();

        try {
            arrayMethod();
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("배열 예외 발생");
        }
    }
}
