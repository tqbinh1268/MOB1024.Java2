package slide2;

import java.util.*;
import java.util.function.*;

// 1. Định nghĩa lớp Product
class Product {
    int id;
    String name;
    double price;
    int quantity;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | %-15s | Giá: %7.2f | Kho: %d", id, name, price, quantity);
    }
}

public class ProductManager {

    // 2. Cách viết Cấp độ Lớp (Static Fields) - Tái sử dụng các quy tắc kinh doanh
    // Predicate: Quy tắc lọc hàng cao cấp
    public static final Predicate<Product> IS_LUXURY = p -> p.price > 1000;
    
    // Function: Quy tắc tính giá trị hàng tồn (Giá * Số lượng)
    public static final Function<Product, Double> CALC_VALUE = p -> p.price * p.quantity;

    public static void main(String[] args) {
        // Dữ liệu mẫu
        List<Product> list = new ArrayList<>(Arrays.asList(
            new Product(1, "Macbook M3", 2000.0, 5),
            new Product(2, "Chuột Gaming", 50.0, 2),
            new Product(3, "Bàn phím cơ", 150.0, 12),
            new Product(4, "iPhone 15 Pro", 1200.0, 3)
        ));

        // 3. Supplier: Cung cấp sản phẩm mặc định nếu cần (Ví dụ khi tìm không thấy)
        Supplier<Product> emptyProduct = () -> new Product(0, "Không xác định", 0, 0);

        // 4. Consumer: Hành động in báo cáo có định dạng
        Consumer<Product> printReport = p -> {
            double totalValue = CALC_VALUE.apply(p); // Dùng Function ở trên
            System.out.println(p + " => Tổng giá trị kho: " + totalValue + "$");
        };

        System.out.println("=== TẤT CẢ SẢN PHẨM ===");
        list.forEach(printReport); // Dùng Consumer
        System.out.println("");
        list.forEach(p -> {
        	System.out.println(p + " => Tổng giá trị kho: " + p.quantity * p.price + "$ OMG");
        });

        System.out.println("\n=== DANH SÁCH HÀNG CAO CẤP (>1000$) ===");
        list.stream()
            .filter(IS_LUXURY) // Dùng Predicate đã khai báo ở trên
            .forEach(p -> System.out.println("- " + p.name)); // Lambda Inline

        System.out.println("\n=== KIỂM TRA HÀNG SẮP HẾT (Dưới 5 cái) ===");
        list.stream()
            .filter(p -> p.quantity < 5) // Predicate Inline
            .forEach(p -> System.out.println("!!! Cần nhập thêm: " + p.name));

        // 5. Minh họa biến đổi dữ liệu (Function)
        System.out.println("\n=== DANH SÁCH TÊN SẢN PHẨM (Viết hoa) ===");
        List<String> names = list.stream()
            .map(p -> p.name.toUpperCase()) // Function: Biến Product thành String
            .toList();
        System.out.println(names);
    }
}
