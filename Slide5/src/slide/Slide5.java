package slide;

import java.io.FileReader;
import java.io.FileWriter;

public class Slide5 {
	public static void main(String[] args) {
//		try {
//			FileWriter fWriter = new FileWriter("dataOMG.txt");
//			fWriter.write("Đang học slide 5");
//			fWriter.close();
//			System.out.println("Ghi file thành công");
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		}
		try {
			FileReader fReader = new FileReader("dataOMG1.txt");
			int ch;
			while((ch = fReader.read()) != -1) {
				System.out.print((char)ch);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
