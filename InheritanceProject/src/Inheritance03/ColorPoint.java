package Inheritance03;

public class ColorPoint extends Point{
	private String color;
	
	public ColorPoint(int x, int y, String color) {
		//super() �޼ҵ�� 1���� ���
		super(x, y);	//ColorPoint �������� ù ��° �ٿ� ��ġ�ؾ� ��
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}
