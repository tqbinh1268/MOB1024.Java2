package Slide1;

import java.util.ArrayList;

public class Slide1 {
	public static void main(String[] args) {
		ArrayList<Animal> listAnimal = new ArrayList<Animal>();
		listAnimal.add(new Dog("Lu",3));
		listAnimal.add(new Cat("Na",1));
		for(Animal a : listAnimal) {
			a.eat();
			a.sleep();
			a.sound();
			if(a instanceof Dog d) {
//				Dog d = (Dog)a;
				d.bark();
			}else if(a instanceof Cat c) {
				c.meow();
			}
		}
//		MayTinh mayTinh = new MayTinh();
//		System.out.println(mayTinh.tinhTong(3, 5));
//		System.out.println(mayTinh.tinhTong(3.5, 5));
//		System.out.println(mayTinh.tinhTong(3, 5,6));
//		System.out.println("00 PS00000 Tran Quang Binh");
//		Xe xe = new Xe();
//		xe.setHangXe("Toyota");
//		xe.setNamSanXuat(2026);
//		System.out.println(xe.toString());
//		
//		Xe xe2 = new Xe("Honda",2000);
//		System.out.println(xe2.toString());
	}
}
