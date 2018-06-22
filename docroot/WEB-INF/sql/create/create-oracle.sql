drop user &1 cascade;
create user &1 identified by &2;
grant connect,resource to &1;
connect &1/&2;
set define off;

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


create unique index IX_C1D49713 on minimart_Duong (ma);
create unique index IX_7923C262 on minimart_Duong (ten);
create index IX_8326635E on minimart_Duong (ten, ma, trangThai);

create index IX_FCEFCA56 on minimart_bangluong (ten, trangThai);

create index IX_20D8C500 on minimart_calamviec (ten, hoatDong);

create index IX_8C634B2A on minimart_cuahang (ten, hoatDong);
create index IX_1F7CC77F on minimart_cuahang (uuid_);
create index IX_612BE749 on minimart_cuahang (uuid_, companyId);

create index IX_B871BAC2 on minimart_dathang (ten, hoatDong);
create index IX_C4CC0BC4 on minimart_dathang (ten, hoatDong, khachHangId);

create index IX_1460C612 on minimart_dathangchitiet (datHangId, maHangId);

create index IX_34CA0955 on minimart_donhang (cuaHangId, khachHangId, hoatDong);
create index IX_E59F8F41 on minimart_donhang (cuaHangId, trangThaiDonHangId, hoatDong);

create index IX_D57E67 on minimart_donhangchitiet (donHangId, hoatDong);
create index IX_FB2DDC7A on minimart_donhangchitiet (donHangId, matHangId, hoatDong);

create index IX_AE896918 on minimart_donvitinh (name);

create index IX_1C1757A2 on minimart_dotkhuyenmai (ngayBatDau);
create index IX_5F2F959D on minimart_dotkhuyenmai (ngayHetHan);
create index IX_9F843073 on minimart_dotkhuyenmai (ten);

create index IX_40E1585A on minimart_dotkhuyenmaichitiet (dotKhuyenMaiId, nhomMatHangId);
create index IX_1E2FA83 on minimart_dotkhuyenmaichitiet (dotKhuyenMaiId, nhomMatHangId, matHangId);

create index IX_843CF506 on minimart_khachhang (ten, ma);
create index IX_8BDA555A on minimart_khachhang (ten, ma, nhomKhachHangId, hoatDong);

create index IX_CE5BA335 on minimart_khohang (ten);

create index IX_E12C7494 on minimart_loaihinhkhuyenmai (ten, trangThai);

create unique index IX_F067BB0E on minimart_mathang (code_, hoatDong);
create index IX_4E970648 on minimart_mathang (companyId, status);
create index IX_F0161F9C on minimart_mathang (companyId, userId);
create index IX_21D92E45 on minimart_mathang (name);
create index IX_AD811BEE on minimart_mathang (uuid_);
create index IX_48F1C77A on minimart_mathang (uuid_, companyId);
create unique index IX_7159E47C on minimart_mathang (uuid_, groupId);

create index IX_1F9A0E3D on minimart_nhacungcap (tenNhaCungCap, maNhaCungCap);
create index IX_15F459E4 on minimart_nhacungcap (tenNhaCungCap, maNhaCungCap, nhomNhaCungCapId);
create index IX_C3E9676 on minimart_nhacungcap (tenNhaCungCap, maNhaCungCap, nhomNhaCungCapId, hoatDong);

create index IX_2A9791FF on minimart_nhanvien (nghiThu7);
create index IX_D681F234 on minimart_nhanvien (nghiThu7, nghiChuNhat);
create index IX_33564D4D on minimart_nhanvien (ten, ho);
create index IX_24C7C89B on minimart_nhanvien (ten, ho, trangThai);
create index IX_F73BF9 on minimart_nhanvien (uuid_);
create index IX_D909C28F on minimart_nhanvien (uuid_, companyId);

create index IX_8A926928 on minimart_nhomkhachhang (ten, hoatDong);

create index IX_5F2A5F2D on minimart_nhommathang (name);

create index IX_26488F5D on minimart_nhomnhacungcap (ten);
create index IX_7CAD08AF on minimart_nhomnhacungcap (ten, hoatDong);

create unique index IX_148DC594 on minimart_phuongxa (ma);
create unique index IX_7D906401 on minimart_phuongxa (ten);
create index IX_6F5C6FDF on minimart_phuongxa (ten, ma, trangThai);

create unique index IX_C485C640 on minimart_quanhuyen (ma);
create unique index IX_CC9878D5 on minimart_quanhuyen (ten);
create index IX_6175988B on minimart_quanhuyen (ten, ma, trangThai);

create index IX_ACB23072 on minimart_tangca (userId, cuaHangId, caLamViecId, hoatDong);

create index IX_D476D830 on minimart_thetratruoc (ngayHetHan);
create index IX_B0FF3853 on minimart_thetratruoc (ngayHetHan, khoa);
create index IX_7C1C17FB on minimart_thetratruoc (trangThai);

create index IX_E4DAA48A on minimart_thuchi (lyDoThuChi);
create index IX_14C6456D on minimart_thuchi (nhanVienId);
create index IX_97D0C12 on minimart_thuchi (ten);

create unique index IX_F67E497F on minimart_tinhthanhpho (ma);
create unique index IX_D9B05D76 on minimart_tinhthanhpho (ten);
create index IX_69D5BDCA on minimart_tinhthanhpho (ten, ma, trangThai);

create index IX_7084D6D8 on minimart_trangthaidonhang (ten);



quit