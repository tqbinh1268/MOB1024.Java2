package mainPackage;

import java.util.List;

import entity.Document;
import service.Document_Service;

public class Assignment {
	public static void main(String[] args) {
		Document_Service document_Service = new Document_Service();
		try {
			document_Service.add();
//			document_Service.add();
			document_Service.displayAll();
			document_Service.updateTitle(2, "");
			document_Service.displayAll();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
