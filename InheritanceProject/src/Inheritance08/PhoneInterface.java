package Inheritance08;

public interface PhoneInterface {
	//자바 7
	final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	
	//자바 8
	default void printLogo() {	//추상 메소드가 아닌 일반 메소드에도 default 붙이기 가능(버전 8 이상)
		System.out.println("** Phone **");
	}
}
