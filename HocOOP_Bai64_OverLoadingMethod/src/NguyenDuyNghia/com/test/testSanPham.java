package NguyenDuyNghia.com.test;

import NguyenDuyNghia.com.model.SanPham;

public class testSanPham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SanPham sp1=new SanPham(1, "coca", 25);
		SanPham sp2=new SanPham(5, "pepsi", 15);
		SanPham sp3=new SanPham(3, "redbull", 30);
		
		double t=SanPham.tongTien(sp1,sp2,sp3);
		System.out.println(t);
	}

}
