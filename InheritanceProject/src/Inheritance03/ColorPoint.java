package Inheritance03;

public class ColorPoint extends Point{
	private String color;
	
	public ColorPoint(int x, int y, String color) {
		//super() 메소드는 1개만 기술
		super(x, y);	//ColorPoint 생성자의 첫 번째 줄에 위치해야 함
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}
