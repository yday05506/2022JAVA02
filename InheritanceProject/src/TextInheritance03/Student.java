package TextInheritance03;

public class Student {
	//��� ����
	String name;
	String S_num;
	String phone;
	String address;
	String major;
	
	//������
	public Student() {
	}
	public Student(String name, String S_num) {
		this.name = name;
		this.S_num = S_num;
	}
	
	//�޼ҵ�
	void study() {
		System.out.println("�����ϴ�.");
	}
	
	void eat() {
		System.out.println("�Ļ��ϴ�.");
	}
	
	void test() {
		System.out.println("���� ����.");
	}
	
	void extra_act() {
		System.out.println("���Ƹ� Ȱ���ϴ�.");
	}
}
