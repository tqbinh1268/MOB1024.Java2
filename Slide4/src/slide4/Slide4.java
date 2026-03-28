package slide4;

public class Slide4 {
	public static void main(String[] args) {
		System.out.println(GenericCalculator.tong(1, 2));
		System.out.println(GenericCalculator.tong(1.0, 2.5));
		System.out.println(GenericCalculator.tong("Tran", "Binh"));
//		System.out.println(GenericCalculator.tong("So: ", 2));
	}
	static public class GenericCalculator {
	    @SuppressWarnings("unchecked")
	    public static <T> T tong(T a, T b) {
	        // Kiểm tra nếu là String
	        if (a instanceof String || b instanceof String) {
	            return (T) (a.toString() + b.toString());
	        }
	        
	        // Kiểm tra nếu là Integer
	        if (a instanceof Integer && b instanceof Integer) {
	            return (T) Integer.valueOf(((Integer) a) + ((Integer) b));
	        }
	        
	        // Kiểm tra nếu là Double
	        if (a instanceof Double && b instanceof Double) {
	            return (T) Double.valueOf(((Double) a) + ((Double) b));
	        }

	        throw new IllegalArgumentException("Kiểu dữ liệu không hỗ trợ phép cộng!");
	    }

	    public static void main(String[] args) {
	        String s = tong("A", "B"); // AB
	        int i = tong(1, 2);        // 3
	        double d = tong(1.5, 2.0); // 3.5
	    }
	}
}
