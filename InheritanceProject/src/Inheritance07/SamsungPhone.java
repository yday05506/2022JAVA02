package Inheritance07;

public class SamsungPhone implements PhoneInterface {
	@Override
	public void sendCall() {	//������
		// TODO Auto-generated method stub
		System.out.println("�츮����");
	}
	
	@Override
	public void receiveCall() {	//������
		// TODO Auto-generated method stub
		System.out.println("��ȭ�� �Խ��ϴ�.");
	}
	
	public void flash() {	//�Ϲ� �޼ҵ�
		System.out.println("��ȭ�⿡ ���� �������ϴ�.");
	}
}
