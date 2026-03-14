package slide1;

import java.util.ArrayList;

public class Slide1 {
	public static void main(String[] args) {
		ArrayList<Product> dsProduct = new ArrayList<Product>();
		ImportedProduct iP = new ImportedProduct();
		iP.setID("Ao01");
		iP.setName("Ao thun");
		iP.setBasePrice(10);
		iP.SetTaxRate(0.1);
		iP.SetShippingFee(2);
		dsProduct.add(iP);
		
		ImportedProduct iP2 = new ImportedProduct();
		iP2.setID("Ao02");
		iP2.setName("Ao so mi");
		iP2.setBasePrice(12);
		iP2.SetTaxRate(0.15);
		iP2.SetShippingFee(1);
		dsProduct.add(iP2);
		
		
		
//		for(int i=0;i<2;i++) {
//			ImportedProductDAO p3 = new ImportedProductDAO();
//			p3.NewImportedProduct();
//			dsProduct.add(p3);
//		}
		
		for(Product p : dsProduct) {
			System.out.println(p.toString());
		}
	}
}
