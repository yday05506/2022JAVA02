package Inheritance07;

public class SamsungPhone implements PhoneInterface {
	@Override
	public void sendCall() {	//재정의
		// TODO Auto-generated method stub
		System.out.println("띠리리링");
	}
	
	@Override
	public void receiveCall() {	//재정의
		// TODO Auto-generated method stub
		System.out.println("전화가 왔습니다.");
	}
	
	public void flash() {	//일반 메소드
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}
