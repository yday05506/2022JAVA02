package Inheritance05;

public class MethodOverridingEx {
	static void paint(Shape p) {	//�� ���忡�� upcasting�� �Ǵ�
		p.draw();					//����Ŭ������ �������̵�(������)��
	}								//�޼ҵ尡 ȣ��

	public static void main(String[] args) {
		Line line = new Line();	//line ��ü ����
		
		paint(line);
		paint(new Shape());	//Shape Ŭ������ �����ǵ� �޼ҵ尡 ȣ��
		paint(new Line());	//Line Ŭ������ ���ǵ� �޼ҵ尡 ȣ��
		paint(new Rect());	//Rect Ŭ������ �����ǵ� �޼ҵ尡 ȣ��
		paint(new Circle());//Circle Ŭ������ �����ǵ� �޼ҵ尡 ȣ��
	}

}
