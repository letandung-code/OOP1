package quanlikhachhang;

import java.time.LocalDate;

abstract class KhachHang {
	protected String maKhachHang;
	protected String hoTen;
	protected LocalDate ngayLapHoaDon;
	protected double soKW;
	protected double donGia;
	public KhachHang(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, double soKW, double donGia) {
		this.maKhachHang = maKhachHang;
		this.hoTen = hoTen;
		this.ngayLapHoaDon = ngayLapHoaDon;
		this.soKW = soKW;
		this.donGia = donGia;
	}
	public abstract double thanhTien();
	
	public LocalDate getNgayLapHoaDon() { return ngayLapHoaDon; }
	public String    getMaKhachHang()   { return maKhachHang; }
	public String    getHoTen()         { return hoTen; }
	
	@Override
	public String toString() {
	    return String.format("%s | %s | Ngày: %s | TT: %,.0f",
	            maKhachHang, hoTen, ngayLapHoaDon, thanhTien());
	}
}
