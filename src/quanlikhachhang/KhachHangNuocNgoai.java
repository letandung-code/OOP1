package quanlikhachhang;

import java.time.LocalDate;

public class KhachHangNuocNgoai extends KhachHang{
	private String quocTich;
	public KhachHangNuocNgoai(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, double soKW, double donGia
			, String quocTich) {
		super(maKhachHang, hoTen, ngayLapHoaDon, soKW, donGia);
		// TODO Auto-generated constructor stub
		this.quocTich = quocTich;
	}
	
	
	public String getQuocTich() {
		return quocTich;
	}


	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}


	@Override
	
	public double thanhTien() {
		// TODO Auto-generated method stub
		return soKW*donGia;
	}

	
}
