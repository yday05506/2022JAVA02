package TextInheritance02;

public class TruckMain {

	public static void main(String[] args) {
		Truck mytruck = new Truck();
		mytruck.carname = "프론티어";
		mytruck.ton = 3;
		System.out.println("나의 트럭은 " + mytruck.color + "이다.");
		System.out.println(mytruck.carname + "은(는) " + mytruck.ton + "을 실을 수 있다.");
	}

}
