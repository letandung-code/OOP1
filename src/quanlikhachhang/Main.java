package quanlikhachhang;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<KhachHang> danhSach = new ArrayList<>();

        // ===== Thêm dữ liệu mẫu =====
        danhSach.add(new KhachHangVietNam(
                "VN001", "Nguyễn Văn A", LocalDate.of(2024, 1, 15),
                100, 1500, "Sinh hoạt", 50));

        danhSach.add(new KhachHangVietNam(
                "VN002", "Trần Thị B", LocalDate.of(2024, 2, 20),
                30, 1500, "Sinh hoạt", 50));

        danhSach.add(new KhachHangNuocNgoai(
                "NN001", "John Smith", LocalDate.of(2024, 3, 10),
                200, 2000, "Mỹ"));

        danhSach.add(new KhachHangNuocNgoai(
                "NN002", "Yuki Tanaka", LocalDate.of(2024, 3, 25),
                80, 2000, "Nhật"));

        // ===== In danh sách =====
        System.out.println("===== DANH SÁCH HÓA ĐƠN =====");
        for (KhachHang kh : danhSach) {
            System.out.println(kh);
        }

        double tongVN = 0, tongNN = 0;
        for (KhachHang kh : danhSach) {
            if (kh instanceof KhachHangVietNam) {
                tongVN += kh.thanhTien();
            } else if (kh instanceof KhachHangNuocNgoai) {
                tongNN += kh.thanhTien();
            }
        }

        System.out.println("\n===== TỔNG KẾT =====");
        System.out.printf("Tổng tiền khách Việt Nam : %,.0f VNĐ%n", tongVN);
        System.out.printf("Tổng tiền khách nước ngoài: %,.0f VNĐ%n", tongNN);
        System.out.printf("Tổng cộng                : %,.0f VNĐ%n", tongVN + tongNN);

        Scanner sc = new Scanner(System.in);
        System.out.println("\n===== NHẬP KHÁCH HÀNG MỚI =====");
        System.out.print("Loại (1-Việt Nam, 2-Nước ngoài): ");
        int loai = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Mã khách hàng: ");
        String ma = sc.nextLine();
        System.out.print("Họ tên: ");
        String ten = sc.nextLine();
        System.out.print("Ngày lập (yyyy-MM-dd): ");
        LocalDate ngay = LocalDate.parse(sc.nextLine());
        System.out.print("Số KW: ");
        double soKW = Double.parseDouble(sc.nextLine());
        System.out.print("Đơn giá: ");
        double donGia = Double.parseDouble(sc.nextLine());

        KhachHang moi;
        if (loai == 1) {
            System.out.print("Đối tượng: ");
            String dt = sc.nextLine();
            System.out.print("Định mức: ");
            double dm = Double.parseDouble(sc.nextLine());
            moi = new KhachHangVietNam(ma, ten, ngay, soKW, donGia, dt, dm);
        } else {
            System.out.print("Quốc tịch: ");
            String qt = sc.nextLine();
            moi = new KhachHangNuocNgoai(ma, ten, ngay, soKW, donGia, qt);
        }

        danhSach.add(moi);

        System.out.println("\n===== DANH SÁCH SAU KHI THÊM =====");
        for (KhachHang kh : danhSach) {
            System.out.println(kh);
        }

        sc.close();
    }
}