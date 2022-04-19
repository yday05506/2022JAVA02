package Inheritance02;

public class Student extends Person{
	public void set() {
		age = 30;
		name = "ȫ�浿";
		height = 175;
		setWeight(99);
		System.out.println("age = " + age + ", name = " + name + ", height = " + height + ", weight =" + getWeight());
	}
}
