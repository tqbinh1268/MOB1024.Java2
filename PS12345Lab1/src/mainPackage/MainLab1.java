package mainPackage;

import java.util.ArrayList;

import dao.ProductDAO;
import entity.*;

public class MainLab1 {
	public static void main(String[] args) {
		ArrayList<Product> listProduct = new ArrayList<Product>();
		
		Product p1 = new Product("Ao01","Áo thun",10);
		listProduct.add(p1);
		listProduct.add(new Product("Ao02","Áo sơ mi",-12));
		listProduct.add(new ImportedProduct("Q01","Quần tây",15,0.1,1));
		listProduct.add(new ImportedProduct("Q02","Quần Jean",20,0.15,-1));
		listProduct.add(new ImportedProduct("Q03","Quần đùi",-3,0.15,1));
		
		ProductDAO p2 = new ProductDAO();
		p2.NewProduct();
		listProduct.add(p2);
		
		for(Product p : listProduct) {
			System.out.println(p.toString());
		}
	}
}
