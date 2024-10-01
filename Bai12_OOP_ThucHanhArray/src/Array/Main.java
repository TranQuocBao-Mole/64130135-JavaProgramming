package Array;

public class Main {
	public static void main(String[] args) {
		QLSV qlsv = new QLSV();
		qlsv.list.add(new SinhVien("64130135","Trần Quốc Bảo","Công Nghệ Thông Tin","Nha Trang"));
		qlsv.list.add(new SinhVien("64135362","Trần Bình Đẳng","Công Nghệ Thông Tin","Đà Nẵng"));

		qlsv.hienThiDanhSachSinhVien();
		SinhVien sv = qlsv.timKiemSinhVienTheoTen("Trần Quốc Bảo");
		System.out.println(sv.getId()+" "+sv.getHoTen()+" "+sv.getNganh()+" "+sv.getQueQuan());
		qlsv.xoaSinhVienTheoMaSo("64135362");
		qlsv.themSinhVien(new SinhVien("64132024","Trần Tôn Hậu","Công Nghệ Thông Tin","Lâm Đồng"));
		qlsv.sapXep(qlsv.list);
		qlsv.hienThiDanhSachSinhVien();
	}

}