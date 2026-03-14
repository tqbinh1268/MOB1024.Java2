package dao;
import java.util.Scanner;

import entity.*;

public class ProductDAO extends Product{
	Scanner scanner = new Scanner(System.in);
	public void NewProduct() {
		String id;
		
		do {
			System.out.print("Nhập ID: ");
			id = scanner.nextLine();
		}while(!this.setId(id));
		
		System.out.print("Nhập name: ");
		this.setName(scanner.nextLine());
		
		double basePrice;
		
		do {
			System.out.print("Nhập Base Price: ");
			basePrice = scanner.nextDouble();
		} while (!this.setBasePrice(basePrice));
	}
}
