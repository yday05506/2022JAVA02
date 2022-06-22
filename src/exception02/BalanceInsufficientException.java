package exception02;

// 사용자 예외를 정의할 때 exception 클래스를 상속
public class BalanceInsufficientException extends Exception {
    public BalanceInsufficientException() {}
    public BalanceInsufficientException(String message) {
        super(message);
    }
}
