package quanlikhachhang;

import java.util.List;

interface IQuanLi<T> {
	 void them(T t);
	 boolean xoa(String ma);
	 void sua(String ma, T tmoi);
	 
	 List<T> timKiemTheoTen(String ten);
	 List<T> timKiemTheoMa(String prefix);
	 
	 List<T> sapXepTheoLuong();
	 List<T> sapXepTheoTen();
	 
	 
}
