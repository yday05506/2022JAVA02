package Inheritance08;

public interface PhoneInterface {
	//�ڹ� 7
	final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	
	//�ڹ� 8
	default void printLogo() {	//�߻� �޼ҵ尡 �ƴ� �Ϲ� �޼ҵ忡�� default ���̱� ����(���� 8 �̻�)
		System.out.println("** Phone **");
	}
}
