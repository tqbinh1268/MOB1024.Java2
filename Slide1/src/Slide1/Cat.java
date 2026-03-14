package Slide1;

public class Cat extends Animal{
	public Cat(String name, int age) {
		super(name,age);
	}
	
//	@Override
	public void meow() {
		System.out.println(name + " kêu: Meow! Meow!");
	}
	
	@Override
	public void sound() {
		System.out.println("Mèo kêu Meow! Meow!");
	}
}
