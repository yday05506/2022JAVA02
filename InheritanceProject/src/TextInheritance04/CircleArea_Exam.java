package TextInheritance04;

public class CircleArea_Exam {
	private double area(int r) {
		return 3.14 * r * r;	//원의 면적
	}
	
	protected double round(int r) {
		return 2 * 3.14 * r;	//원의 둘레
	}
}
