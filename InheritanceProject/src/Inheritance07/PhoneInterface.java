package Inheritance07;

public interface PhoneInterface {
	final int TIMEOUT = 10000;	//��� �ʵ�(�빮�ڷ� ǥ��)
	void sendCall();	//�߻� �޼ҵ�
	void receiveCall();	//�߻� �޼ҵ�
	
	//�ڹ� 8����
	default void printLogo() {
		//�߻�޼ҵ尡 �ƴ� �Ϲ� �޼ҵ��ε� default�� ���� ��� ����
		System.out.println("** Phone **");
	}
}
