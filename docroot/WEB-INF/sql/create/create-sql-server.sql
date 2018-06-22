drop database lportal;
create database lportal;

go

use lportal;

create table minimart_Duong (
	duongId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten nvarchar(75) null,
	ma nvarchar(75) null,
	trangThai bit
);

create table minimart_bangluong (
	banLuongId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten nvarchar(75) null,
	trangThai bit,
	thang int,
	nam int,
	ngay datetime null,
	chiTiet nvarchar(75) null,
	ghiChu nvarchar(75) null
);

create table minimart_calamviec (
	caLamViecId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten nvarchar(75) null,
	cuaHangId bigint,
	gioVaoLam datetime null,
	gioRaVe datetime null,
	gioNghiGiuaCaTu datetime null,
	gioNghiGiuaCaDen datetime null,
	tiLeLuong int,
	hoatDong bit
);

create table minimart_cuahang (
	uuid_ nvarchar(75) null,
	cuaHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten nvarchar(75) null,
	gioMoCua datetime null,
	gioDongCua datetime null,
	hoatDong bit,
	uuTien int,
	diaChi nvarchar(75) null,
	dienThoai nvarchar(75) null,
	khoHangId bigint
);

create table minimart_dathang (
	datHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten nvarchar(75) null,
	khachHangId bigint,
	diaChiId bigint,
	tienHang int,
	tiLeThue float,
	tiLeGiamGia float,
	tienGiamGia int,
	phiVanChuyen int,
	tongCong int,
	loai int,
	giamTheoTien int,
	trangThai bit,
	userModifiedId bigint,
	timeModified datetime null,
	userCreateId bigint,
	loaiGia int,
	hoatDong bit
);

create table minimart_dathangchitiet (
	datHangChiTietId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	soLuong int,
	donGia int,
	thanhTien int,
	tiLeGiamGia float,
	ghiChu nvarchar(75) null,
	trangThai bit,
	baoHanh nvarchar(75) null,
	donViTinhId bigint,
	datHangId bigint,
	maHangId bigint
);

create table minimart_donhang (
	donHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	cuaHangId bigint,
	khachHangId bigint,
	hoatDong bit,
	tongCong int,
	daThanhToan bit,
	phiVanChuyen int,
	trangThaiDonHangId bigint,
	ngayThanhToan datetime null,
	khachDua int,
	traLai int,
	thueVAT int,
	diemTichLuy int,
	thanhToanTienMat int,
	thanhToanThe int,
	thanhToanChuyenKhoan int,
	phieuGiamGiaId bigint,
	truTichLuy int,
	inHoaDonLan int,
	maDonHang nvarchar(75) null
);

create table minimart_donhangchitiet (
	donHangChiTietId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	donHangId bigint,
	matHangId bigint,
	soLuong int,
	donViTinhId bigint,
	thanhTien int,
	tiLeGiamGia int,
	kichThuoc nvarchar(75) null,
	hanSuDung datetime null,
	hoatDong bit,
	huy bit
);

create table minimart_donvitinh (
	donViTinhId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	name nvarchar(75) null,
	status int,
	note nvarchar(75) null
);

create table minimart_dotkhuyenmai (
	dotKhuyenMaiId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten nvarchar(75) null,
	trangThai bit,
	userModifieldId bigint,
	ngayBatDau datetime null,
	ngayHetHan datetime null,
	ngungApDung bit,
	tiLeGiaGia int,
	ghiChu nvarchar(75) null
);

create table minimart_dotkhuyenmaichitiet (
	dotKhuyenMaiChiTietId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	dotKhuyenMaiId bigint,
	nhomMatHangId bigint,
	matHangId bigint,
	matHangTangId bigint,
	tiLeGiamGia float,
	giaTriDonHang float,
	soLuongMua int,
	soLuongTang int,
	giaBan int
);

create table minimart_khachhang (
	khachHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten nvarchar(75) null,
	nhomKhachHangId bigint,
	ma nvarchar(75) null,
	diaChi nvarchar(75) null,
	dienThoai nvarchar(75) null,
	email nvarchar(75) null,
	facebook nvarchar(75) null,
	twitter nvarchar(75) null,
	socialMedia1 nvarchar(75) null,
	socialMedia2 nvarchar(75) null,
	socialMedia3 nvarchar(75) null,
	trangThai int,
	diemTichLuy int,
	maSoThue nvarchar(75) null,
	hoatDong bit,
	ngaySinh datetime null
);

create table minimart_khohang (
	khoHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten nvarchar(75) null,
	trangThai bit,
	itemType int,
	choPhepNhapKho bit,
	cuaHangId bigint,
	autoId bigint,
	sigmaId bigint,
	ghiChu nvarchar(75) null
);

create table minimart_loaihinhkhuyenmai (
	loaiHinhKhuyenMaiId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten nvarchar(75) null,
	trangThai bit,
	tileGiamGia int,
	ngayBatDau datetime null,
	ngayHetHan datetime null,
	imageid nvarchar(75) null,
	ghiChu nvarchar(75) null
);

create table minimart_mathang (
	uuid_ nvarchar(75) null,
	matHangId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	name nvarchar(75) null,
	code_ nvarchar(75) null,
	giaNhap int,
	status int,
	giaBan int,
	giaBan1 int,
	giaBan2 int,
	giaBan3 int,
	tonToiThieu int,
	tonToiDa int,
	giaVon int,
	hoaHong int,
	nhomMatHangId bigint,
	donViTinhId bigint,
	size_ nvarchar(75) null,
	imageUrl nvarchar(75) null,
	hoatDong bit
);

create table minimart_nhacungcap (
	nhaCungCapId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	tenNhaCungCap nvarchar(75) null,
	nhomNhaCungCapId bigint,
	maNhaCungCap nvarchar(75) null,
	diaChi nvarchar(75) null,
	dienThoai nvarchar(75) null,
	email nvarchar(75) null,
	website nvarchar(75) null,
	ghiChu nvarchar(75) null,
	hoatDong bit,
	doUuTien int,
	logoURL nvarchar(75) null
);

create table minimart_nhanvien (
	uuid_ nvarchar(75) null,
	nhanVienId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten nvarchar(75) null,
	ho nvarchar(75) null,
	trangThai bit,
	nghiThu7 bit,
	nghiChuNhat bit,
	cachTinhLuong int,
	luongCa int,
	luongThang int,
	image nvarchar(75) null,
	diaChiId bigint
);

create table minimart_nhomkhachhang (
	nhomKhachHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten nvarchar(75) null,
	hoatDong bit,
	diemTichLuy int,
	tiLeGiamGia int,
	uuTien int,
	image nvarchar(75) null
);

create table minimart_nhommathang (
	nhomMatHangId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	name nvarchar(75) null,
	code_ nvarchar(75) null,
	status int,
	note nvarchar(75) null
);

create table minimart_nhomnhacungcap (
	nhomNhaCungCapId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten nvarchar(75) null,
	ghiChu nvarchar(75) null,
	hoatDong bit,
	uuTien int,
	image nvarchar(75) null
);

create table minimart_phuongxa (
	phuongXaId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten nvarchar(75) null,
	ma nvarchar(75) null,
	trangThai bit
);

create table minimart_quanhuyen (
	quanHuyenId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten nvarchar(75) null,
	ma nvarchar(75) null,
	trangThai bit
);

create table minimart_tangca (
	tangCaId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten nvarchar(75) null,
	cuaHangId bigint,
	caLamViecId bigint,
	nhanVienId bigint,
	tangCaTu datetime null,
	tangCaDen datetime null,
	hoatDong bit
);

create table minimart_thetratruoc (
	theTraTruocId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	tenThe nvarchar(75) null,
	nhomTheTraTruocId bigint,
	khoa bit,
	ngayHetHan datetime null,
	trangThai nvarchar(75) null,
	userModifiledId bigint
);

create table minimart_thuchi (
	thuChiId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten nvarchar(75) null,
	tenDoiTuong nvarchar(75) null,
	diaChiId bigint,
	loai int,
	loaiDoiTuong int,
	thu int,
	chi int,
	nhaCungCapId bigint,
	khachHangId bigint,
	nhanVienId bigint,
	theTraTruocId bigint,
	taiKhoanNganHangId bigint,
	datHangId bigint,
	bangLuongId bigint,
	lyDoThuChi nvarchar(75) null
);

create table minimart_tinhthanhpho (
	tinhThanhPhoId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten nvarchar(75) null,
	ma nvarchar(75) null,
	trangThai bit
);

create table minimart_trangthaidonhang (
	trangThaiDonHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName nvarchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten nvarchar(75) null,
	hoatDong bit,
	ghiChu nvarchar(75) null
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


