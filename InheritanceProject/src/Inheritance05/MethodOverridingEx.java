package Inheritance05;

public class MethodOverridingEx {
	static void paint(Shape p) {	//이 문장에서 upcasting이 되는
		p.draw();					//하위클래스의 오버라이딩(재정의)된
	}								//메소드가 호출

	public static void main(String[] args) {
		Line line = new Line();	//line 객체 생성
		
		paint(line);
		paint(new Shape());	//Shape 클래스의 재정의된 메소드가 호출
		paint(new Line());	//Line 클래스의 정의된 메소드가 호출
		paint(new Rect());	//Rect 클래스의 재정의된 메소드가 호출
		paint(new Circle());//Circle 클래스의 재정의된 메소드가 호출
	}

}
