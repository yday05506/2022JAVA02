package TextInheritance03;

public class Leader extends Student {
	boolean boss;
	
	public Leader(String name, String S_num, boolean boss) {
		super(name, S_num);	//Student Ŭ�������� ����
//		this.name = name;
//		this.S_num = S_num;
		this.boss = boss;
	}
	
	void isleader() {
		if(boss) {	//boss�� true�� ���� ����
			System.out.println(name + "�� �б�ȸ���̴�.");
		}
		else {	//boss�� false�� ���� ����
			System.out.println(name + "�� �б�ȸ���� �ƴϴ�.");
		}
	}
}
