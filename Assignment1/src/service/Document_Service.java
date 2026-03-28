package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import entity.Document;

public class Document_Service {
    private List<Document> lsDocument = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // Thêm mới
    public void add() {
        System.out.println("--- Nhập thông tin Document ---");
        System.out.print("Nhập id: ");
        int id = sc.nextInt();
        sc.nextLine(); // Xử lý trôi lệnh (quan trọng)

        System.out.print("Nhập title: ");
        String title = sc.nextLine();

        System.out.print("Nhập author: ");
        String author = sc.nextLine();

        System.out.print("Nhập category: ");
        String category = sc.nextLine();

        lsDocument.add(new Document(id, title, author, category));
        System.out.println("=> Thêm thành công!");
    }

    // Tìm kiếm theo ID (Trả về Optional để an toàn)
    private Optional<Document> findById(int id) {
        return lsDocument.stream()
                .filter(d -> d.getId() == id)
                .findFirst();
    }

    // Xóa theo ID
    public void delete(int id) {
        boolean removed = lsDocument.removeIf(d -> d.getId() == id);
        if (removed) {
            System.out.println("=> Xóa thành công ID: " + id);
        } else {
            System.out.println("=> Lỗi: Không tìm thấy ID để xóa.");
        }
    }

    // CÁC PHƯƠNG THỨC UPDATE RIÊNG BIỆT (Tránh nhầm lẫn)
    
    public void updateTitle(int id, String newTitle) {
        findById(id).ifPresentOrElse(
            d -> { d.setTitle(newTitle); System.out.println("Cập nhật Title thành công."); },
            () -> System.out.println("Lỗi: Không tìm thấy ID " + id)
        );
    }

    public void updateAuthor(int id, String newAuthor) {
        findById(id).ifPresentOrElse(
            d -> { d.setAuthor(newAuthor); System.out.println("Cập nhật Author thành công."); },
            () -> System.out.println("Lỗi: Không tìm thấy ID " + id)
        );
    }

    public void updateCategory(int id, String newCategory) {
        findById(id).ifPresentOrElse(
            d -> { d.setCategory(newCategory); System.out.println("Cập nhật Category thành công."); },
            () -> System.out.println("Lỗi: Không tìm thấy ID " + id)
        );
    }

    // Hiển thị danh sách
    public void displayAll() {
        if (lsDocument.isEmpty()) {
            System.out.println("Danh sách trống.");
        } else {
            lsDocument.forEach(System.out::println);
        }
    }
}