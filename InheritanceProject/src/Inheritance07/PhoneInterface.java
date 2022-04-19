package Inheritance07;

public interface PhoneInterface {
	final int TIMEOUT = 10000;	//상수 필드(대문자로 표현)
	void sendCall();	//추상 메소드
	void receiveCall();	//추상 메소드
	
	//자바 8버전
	default void printLogo() {
		//추상메소드가 아닌 일반 메소드인데 default를 붙인 경우 가능
		System.out.println("** Phone **");
	}
}
