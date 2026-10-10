package quanlikhachhang;

import java.util.ArrayList;
import java.util.List;

class ListQuanLi implements IQuanLi<KhachHang>{
	private List<KhachHang> danhSach = new ArrayList<KhachHang>();

	@Override
	public void them(KhachHang t) {
		// TODO Auto-generated method stub
		if(timKiemTheoMa(t.getMaKhachHang()) != null) {
			System.out.println("Ma da ton tai !!!");
			return;
		}else {
			danhSach.add(t);
		}
	}

	@Override
	public boolean xoa(String ma) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void sua(String ma, KhachHang tmoi) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<KhachHang> timKiemTheoTen(String ten) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<KhachHang> timKiemTheoMa(String prefix) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<KhachHang> sapXepTheoLuong() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<KhachHang> sapXepTheoTen() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
