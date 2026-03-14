package slide1;

import java.util.Scanner;

public class ImportedProductDAO extends ImportedProduct{
	Scanner sc = new Scanner(System.in);
	
	private ImportedProduct importedProduct;
	public void NewImportedProduct() {
	
		//Nhập ID
		String id;
		do {
			System.out.print("Nhập ID: ");
			id = sc.nextLine();
		}while(!this.setID(id));
		
		//Nhập tên
		System.out.print("Nhập tên SP: ");
		this.setName(sc.nextLine());
		
		//Nhập giá
		do {
			System.out.print("Nhập giá: ");
			double basePrice = sc.nextDouble();
			if(!this.setBasePrice(basePrice)) {
				System.out.println("Bạn nhập giá phải lớn hơn 0");
			}else {
				break;
			}
		}while(true);
		
		//Nhập thuế
		do {
			System.out.print("Nhập thuế: ");
			double importTaxRate = sc.nextDouble();
			if(!this.SetTaxRate(importTaxRate)) {
				System.out.println("Bạn nhập thuế trong khoảng từ 0 đến 1");
			}else {
				break;
			}
		}while(true);
		
		//Nhập phí ship
		do {
			System.out.print("Nhập phí ship: ");
			double shippingFee = sc.nextDouble();
			if(!this.SetShippingFee(shippingFee)) {
				System.out.println("Bạn nhập phí ship lớn hơn hoặc bằng 0");
			}else {
				break;
			}
		}while(true);
	}
}
