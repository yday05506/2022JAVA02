package Inheritance08;

public class SmartPhone extends PDA implements MobliePhoneInterface, MP3Interface{
	//인터페이스를 구현 할 PDA 클래스를 SmartPhone 클래스가 상속 받았기 때문에
	//추상 메소드로 선언 된 모든 메소드를 여기서 재정의(Overriding) 해야 함
	//MobilePhoneInterface의 추상 메소드 구현
	
	@Override
	public void sendCall() {
		System.out.println("따르릉 따르릉");
	}
	
	@Override
	public void receiveCall() {
		System.out.println("전화가 왔어요.");
	}
	
	@Override
	public void sendSMS() {
		System.out.println("문자 갑니다.");
	}
	
	@Override
	public void receiveSMS() {
		System.out.println("문자 왔어요.");
	}
	
	//MP3Interface의 추상 메소드 구현
	@Override
	public void play() {
		System.out.println("음악 연주합니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("음악 중단합니다.");
	}
	
	//추가로 작성한 메소드
	public void schedule() {
		System.out.println("일정 관리");
	}
}
