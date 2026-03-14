package Slide1;

public class Dog extends Animal{
	public Dog(String name, int age) {
		super(name,age);
	}
	
	public void bark() {
		System.out.println(name + " sủa: Woof! Woof!");
	}
	
	@Override
	public void sound() {
		System.out.println("Chó sủa Woof! Woof!");
	}
}
