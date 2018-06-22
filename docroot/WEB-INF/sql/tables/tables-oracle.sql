create table minimart_Duong (
	duongId number(30,0) not null primary key,
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten VARCHAR2(75 CHAR) null,
	ma VARCHAR2(75 CHAR) null,
	trangThai number(1, 0)
);

create table minimart_bangluong (
	banLuongId number(30,0) not null primary key,
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten VARCHAR2(75 CHAR) null,
	trangThai number(1, 0),
	thang number(30,0),
	nam number(30,0),
	ngay timestamp null,
	chiTiet VARCHAR2(75 CHAR) null,
	ghiChu VARCHAR2(75 CHAR) null
);

create table minimart_calamviec (
	caLamViecId number(30,0) not null primary key,
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten VARCHAR2(75 CHAR) null,
	cuaHangId number(30,0),
	gioVaoLam timestamp null,
	gioRaVe timestamp null,
	gioNghiGiuaCaTu timestamp null,
	gioNghiGiuaCaDen timestamp null,
	tiLeLuong number(30,0),
	hoatDong number(1, 0)
);

create table minimart_cuahang (
	uuid_ VARCHAR2(75 CHAR) null,
	cuaHangId number(30,0) not null primary key,
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten VARCHAR2(75 CHAR) null,
	gioMoCua timestamp null,
	gioDongCua timestamp null,
	hoatDong number(1, 0),
	uuTien number(30,0),
	diaChi VARCHAR2(75 CHAR) null,
	dienThoai VARCHAR2(75 CHAR) null,
	khoHangId number(30,0)
);

create table minimart_dathang (
	datHangId number(30,0) not null primary key,
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten VARCHAR2(75 CHAR) null,
	khachHangId number(30,0),
	diaChiId number(30,0),
	tienHang number(30,0),
	tiLeThue number(30,20),
	tiLeGiamGia number(30,20),
	tienGiamGia number(30,0),
	phiVanChuyen number(30,0),
	tongCong number(30,0),
	loai number(30,0),
	giamTheoTien number(30,0),
	trangThai number(1, 0),
	userModifiedId number(30,0),
	timeModified timestamp null,
	userCreateId number(30,0),
	loaiGia number(30,0),
	hoatDong number(1, 0)
);

create table minimart_dathangchitiet (
	datHangChiTietId number(30,0) not null primary key,
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	soLuong number(30,0),
	donGia number(30,0),
	thanhTien number(30,0),
	tiLeGiamGia number(30,20),
	ghiChu VARCHAR2(75 CHAR) null,
	trangThai number(1, 0),
	baoHanh VARCHAR2(75 CHAR) null,
	donViTinhId number(30,0),
	datHangId number(30,0),
	maHangId number(30,0)
);

create table minimart_donhang (
	donHangId number(30,0) not null primary key,
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	cuaHangId number(30,0),
	khachHangId number(30,0),
	hoatDong number(1, 0),
	tongCong number(30,0),
	daThanhToan number(1, 0),
	phiVanChuyen number(30,0),
	trangThaiDonHangId number(30,0),
	ngayThanhToan timestamp null,
	khachDua number(30,0),
	traLai number(30,0),
	thueVAT number(30,0),
	diemTichLuy number(30,0),
	thanhToanTienMat number(30,0),
	thanhToanThe number(30,0),
	thanhToanChuyenKhoan number(30,0),
	phieuGiamGiaId number(30,0),
	truTichLuy number(30,0),
	inHoaDonLan number(30,0),
	maDonHang VARCHAR2(75 CHAR) null
);

create table minimart_donhangchitiet (
	donHangChiTietId number(30,0) not null primary key,
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	donHangId number(30,0),
	matHangId number(30,0),
	soLuong number(30,0),
	donViTinhId number(30,0),
	thanhTien number(30,0),
	tiLeGiamGia number(30,0),
	kichThuoc VARCHAR2(75 CHAR) null,
	hanSuDung timestamp null,
	hoatDong number(1, 0),
	huy number(1, 0)
);

create table minimart_donvitinh (
	donViTinhId number(30,0) not null primary key,
	groupId number(30,0),
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	name VARCHAR2(75 CHAR) null,
	status number(30,0),
	note VARCHAR2(75 CHAR) null
);

create table minimart_dotkhuyenmai (
	dotKhuyenMaiId number(30,0) not null primary key,
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten VARCHAR2(75 CHAR) null,
	trangThai number(1, 0),
	userModifieldId number(30,0),
	ngayBatDau timestamp null,
	ngayHetHan timestamp null,
	ngungApDung number(1, 0),
	tiLeGiaGia number(30,0),
	ghiChu VARCHAR2(75 CHAR) null
);

create table minimart_dotkhuyenmaichitiet (
	dotKhuyenMaiChiTietId number(30,0) not null primary key,
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	dotKhuyenMaiId number(30,0),
	nhomMatHangId number(30,0),
	matHangId number(30,0),
	matHangTangId number(30,0),
	tiLeGiamGia number(30,20),
	giaTriDonHang number(30,20),
	soLuongMua number(30,0),
	soLuongTang number(30,0),
	giaBan number(30,0)
);

create table minimart_khachhang (
	khachHangId number(30,0) not null primary key,
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten VARCHAR2(75 CHAR) null,
	nhomKhachHangId number(30,0),
	ma VARCHAR2(75 CHAR) null,
	diaChi VARCHAR2(75 CHAR) null,
	dienThoai VARCHAR2(75 CHAR) null,
	email VARCHAR2(75 CHAR) null,
	facebook VARCHAR2(75 CHAR) null,
	twitter VARCHAR2(75 CHAR) null,
	socialMedia1 VARCHAR2(75 CHAR) null,
	socialMedia2 VARCHAR2(75 CHAR) null,
	socialMedia3 VARCHAR2(75 CHAR) null,
	trangThai number(30,0),
	diemTichLuy number(30,0),
	maSoThue VARCHAR2(75 CHAR) null,
	hoatDong number(1, 0),
	ngaySinh timestamp null
);

create table minimart_khohang (
	khoHangId number(30,0) not null primary key,
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten VARCHAR2(75 CHAR) null,
	trangThai number(1, 0),
	itemType number(30,0),
	choPhepNhapKho number(1, 0),
	cuaHangId number(30,0),
	autoId number(30,0),
	sigmaId number(30,0),
	ghiChu VARCHAR2(75 CHAR) null
);

create table minimart_loaihinhkhuyenmai (
	loaiHinhKhuyenMaiId number(30,0) not null primary key,
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten VARCHAR2(75 CHAR) null,
	trangThai number(1, 0),
	tileGiamGia number(30,0),
	ngayBatDau timestamp null,
	ngayHetHan timestamp null,
	imageid VARCHAR2(75 CHAR) null,
	ghiChu VARCHAR2(75 CHAR) null
);

create table minimart_mathang (
	uuid_ VARCHAR2(75 CHAR) null,
	matHangId number(30,0) not null primary key,
	groupId number(30,0),
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	name VARCHAR2(75 CHAR) null,
	code_ VARCHAR2(75 CHAR) null,
	giaNhap number(30,0),
	status number(30,0),
	giaBan number(30,0),
	giaBan1 number(30,0),
	giaBan2 number(30,0),
	giaBan3 number(30,0),
	tonToiThieu number(30,0),
	tonToiDa number(30,0),
	giaVon number(30,0),
	hoaHong number(30,0),
	nhomMatHangId number(30,0),
	donViTinhId number(30,0),
	size_ VARCHAR2(75 CHAR) null,
	imageUrl VARCHAR2(75 CHAR) null,
	hoatDong number(1, 0)
);

create table minimart_nhacungcap (
	nhaCungCapId number(30,0) not null primary key,
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	tenNhaCungCap VARCHAR2(75 CHAR) null,
	nhomNhaCungCapId number(30,0),
	maNhaCungCap VARCHAR2(75 CHAR) null,
	diaChi VARCHAR2(75 CHAR) null,
	dienThoai VARCHAR2(75 CHAR) null,
	email VARCHAR2(75 CHAR) null,
	website VARCHAR2(75 CHAR) null,
	ghiChu VARCHAR2(75 CHAR) null,
	hoatDong number(1, 0),
	doUuTien number(30,0),
	logoURL VARCHAR2(75 CHAR) null
);

create table minimart_nhanvien (
	uuid_ VARCHAR2(75 CHAR) null,
	nhanVienId number(30,0) not null primary key,
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten VARCHAR2(75 CHAR) null,
	ho VARCHAR2(75 CHAR) null,
	trangThai number(1, 0),
	nghiThu7 number(1, 0),
	nghiChuNhat number(1, 0),
	cachTinhLuong number(30,0),
	luongCa number(30,0),
	luongThang number(30,0),
	image VARCHAR2(75 CHAR) null,
	diaChiId number(30,0)
);

create table minimart_nhomkhachhang (
	nhomKhachHangId number(30,0) not null primary key,
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten VARCHAR2(75 CHAR) null,
	hoatDong number(1, 0),
	diemTichLuy number(30,0),
	tiLeGiamGia number(30,0),
	uuTien number(30,0),
	image VARCHAR2(75 CHAR) null
);

create table minimart_nhommathang (
	nhomMatHangId number(30,0) not null primary key,
	groupId number(30,0),
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	name VARCHAR2(75 CHAR) null,
	code_ VARCHAR2(75 CHAR) null,
	status number(30,0),
	note VARCHAR2(75 CHAR) null
);

create table minimart_nhomnhacungcap (
	nhomNhaCungCapId number(30,0) not null primary key,
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten VARCHAR2(75 CHAR) null,
	ghiChu VARCHAR2(75 CHAR) null,
	hoatDong number(1, 0),
	uuTien number(30,0),
	image VARCHAR2(75 CHAR) null
);

create table minimart_phuongxa (
	phuongXaId number(30,0) not null primary key,
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten VARCHAR2(75 CHAR) null,
	ma VARCHAR2(75 CHAR) null,
	trangThai number(1, 0)
);

create table minimart_quanhuyen (
	quanHuyenId number(30,0) not null primary key,
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten VARCHAR2(75 CHAR) null,
	ma VARCHAR2(75 CHAR) null,
	trangThai number(1, 0)
);

create table minimart_tangca (
	tangCaId number(30,0) not null primary key,
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten VARCHAR2(75 CHAR) null,
	cuaHangId number(30,0),
	caLamViecId number(30,0),
	nhanVienId number(30,0),
	tangCaTu timestamp null,
	tangCaDen timestamp null,
	hoatDong number(1, 0)
);

create table minimart_thetratruoc (
	theTraTruocId number(30,0) not null primary key,
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	tenThe VARCHAR2(75 CHAR) null,
	nhomTheTraTruocId number(30,0),
	khoa number(1, 0),
	ngayHetHan timestamp null,
	trangThai VARCHAR2(75 CHAR) null,
	userModifiledId number(30,0)
);

create table minimart_thuchi (
	thuChiId number(30,0) not null primary key,
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten VARCHAR2(75 CHAR) null,
	tenDoiTuong VARCHAR2(75 CHAR) null,
	diaChiId number(30,0),
	loai number(30,0),
	loaiDoiTuong number(30,0),
	thu number(30,0),
	chi number(30,0),
	nhaCungCapId number(30,0),
	khachHangId number(30,0),
	nhanVienId number(30,0),
	theTraTruocId number(30,0),
	taiKhoanNganHangId number(30,0),
	datHangId number(30,0),
	bangLuongId number(30,0),
	lyDoThuChi VARCHAR2(75 CHAR) null
);

create table minimart_tinhthanhpho (
	tinhThanhPhoId number(30,0) not null primary key,
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten VARCHAR2(75 CHAR) null,
	ma VARCHAR2(75 CHAR) null,
	trangThai number(1, 0)
);

create table minimart_trangthaidonhang (
	trangThaiDonHangId number(30,0) not null primary key,
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten VARCHAR2(75 CHAR) null,
	hoatDong number(1, 0),
	ghiChu VARCHAR2(75 CHAR) null
);
