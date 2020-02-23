package NguyenDuyNghia.com.test;

import NguyenDuyNghia.com.model.SinhVien;

public class testSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SinhVien teo=new SinhVien(1, "Nguyễn Văn Tèo", 8);
		teo.xetTotNghiep();
		teo.xetTotNghiep(4);
		teo.xetTotNghiep(9, 1);

	}

}
