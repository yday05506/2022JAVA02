package TextInheritance04;

public class CircleMainTest {

	public static void main(String[] args) {
		CircleArea_Exam cp = new CircleArea_Exam();
		
//		System.out.println("원의 면적은 " + cp.area(10));	//area() 메소드가 private로 되어있기 때문에 해당 클래스 내에서만 사용 가능
		System.out.println("원의 둘레는 " + cp.round(10));	//protected로 선언된 메소드는 상속 관계에서 접근 가능
															//같은 패키지에 있어도 접근 가능
	}

}
