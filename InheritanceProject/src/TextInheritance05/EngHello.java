package TextInheritance05;

public class EngHello extends Greeting {

	public String name = "Mr. Hong";
	
	public void sayHello() {
		System.out.println(name + ", Nice to meet you.");
	}
	
	public void test() {
		System.out.print(super.name);	//super.name은 부모클래스의 name을 출력
		super.sayHello();	//부모 클래스에 있는 sayHello() 메소드를 호출
	}
	
	public static void main(String[] args) {
		EngHello eng = new EngHello();
		eng.sayHello();
		eng.test();
	}

}
