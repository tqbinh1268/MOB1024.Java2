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

// === PHẦN ĐỊNH NGHĨA THÊM ===
@FunctionalInterface
interface DiscountCalculator {
    double applyDiscount(Product p, double percentage);
}

public class ProductManager {

    public static final Predicate<Product> IS_LUXURY = p -> p.price > 1000;
    public static final Function<Product, Double> CALC_VALUE = p -> p.price * p.quantity;

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>(Arrays.asList(
            new Product(1, "Macbook M3", 2000.0, 5),
            new Product(2, "Chuột Gaming", 50.0, 2),
            new Product(3, "Bàn phím cơ", 150.0, 12),
            new Product(4, "iPhone 15 Pro", 1200.0, 3)
        ));

        // --- SỬ DỤNG FUNCTIONAL INTERFACE TỰ ĐỊNH NGHĨA ---
        // Định nghĩa logic: Giảm giá dựa trên tổng trị giá mặt hàng đó trong kho
        DiscountCalculator holidayDiscount = (p, rate) -> (p.price * p.quantity) * (rate / 100);

        System.out.println("=== CHƯƠNG TRÌNH KHUYẾN MÃI OMG ===");
        list.forEach(p -> {
            double discountAmount = holidayDiscount.applyDiscount(p, 10); // Giảm 10%
            System.out.println("Sản phẩm: " + p.name + " | Tiền giảm: " + discountAmount + "$");
        });
        
        // --- CÁC PHẦN CŨ CỦA BẠN ---
        System.out.println("\n=== TẤT CẢ SẢN PHẨM ===");
        Consumer<Product> printReport = p -> {
            System.out.println(p + " => Tổng giá trị kho: " + CALC_VALUE.apply(p) + "$");
        };
        list.forEach(printReport);

        System.out.println("\n=== DANH SÁCH HÀNG CAO CẤP (>1000$) ===");
        list.stream()
            .filter(IS_LUXURY)
            .forEach(p -> System.out.println("- " + p.name));

        System.out.println("\n=== KIỂM TRA HÀNG SẮP HẾT ===");
        list.stream()
            .filter(p -> p.quantity < 5)
            .forEach(p -> System.out.println("!!! Cần nhập thêm: " + p.name));
    }
}