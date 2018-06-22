drop database if exists lportal;
create database lportal character set utf8;
use lportal;

create table minimart_Duong (
	duongId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	ma varchar(75) null,
	trangThai tinyint
) engine InnoDB;

create table minimart_bangluong (
	banLuongId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	trangThai tinyint,
	thang integer,
	nam integer,
	ngay datetime null,
	chiTiet varchar(75) null,
	ghiChu varchar(75) null
) engine InnoDB;

create table minimart_calamviec (
	caLamViecId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	cuaHangId bigint,
	gioVaoLam datetime null,
	gioRaVe datetime null,
	gioNghiGiuaCaTu datetime null,
	gioNghiGiuaCaDen datetime null,
	tiLeLuong integer,
	hoatDong tinyint
) engine InnoDB;

create table minimart_cuahang (
	uuid_ varchar(75) null,
	cuaHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	gioMoCua datetime null,
	gioDongCua datetime null,
	hoatDong tinyint,
	uuTien integer,
	diaChi varchar(75) null,
	dienThoai varchar(75) null,
	khoHangId bigint
) engine InnoDB;

create table minimart_dathang (
	datHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	khachHangId bigint,
	diaChiId bigint,
	tienHang integer,
	tiLeThue double,
	tiLeGiamGia double,
	tienGiamGia integer,
	phiVanChuyen integer,
	tongCong integer,
	loai integer,
	giamTheoTien integer,
	trangThai tinyint,
	userModifiedId bigint,
	timeModified datetime null,
	userCreateId bigint,
	loaiGia integer,
	hoatDong tinyint
) engine InnoDB;

create table minimart_dathangchitiet (
	datHangChiTietId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	soLuong integer,
	donGia integer,
	thanhTien integer,
	tiLeGiamGia double,
	ghiChu varchar(75) null,
	trangThai tinyint,
	baoHanh varchar(75) null,
	donViTinhId bigint,
	datHangId bigint,
	maHangId bigint
) engine InnoDB;

create table minimart_donhang (
	donHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	cuaHangId bigint,
	khachHangId bigint,
	hoatDong tinyint,
	tongCong integer,
	daThanhToan tinyint,
	phiVanChuyen integer,
	trangThaiDonHangId bigint,
	ngayThanhToan datetime null,
	khachDua integer,
	traLai integer,
	thueVAT integer,
	diemTichLuy integer,
	thanhToanTienMat integer,
	thanhToanThe integer,
	thanhToanChuyenKhoan integer,
	phieuGiamGiaId bigint,
	truTichLuy integer,
	inHoaDonLan integer,
	maDonHang varchar(75) null
) engine InnoDB;

create table minimart_donhangchitiet (
	donHangChiTietId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	donHangId bigint,
	matHangId bigint,
	soLuong integer,
	donViTinhId bigint,
	thanhTien integer,
	tiLeGiamGia integer,
	kichThuoc varchar(75) null,
	hanSuDung datetime null,
	hoatDong tinyint,
	huy tinyint
) engine InnoDB;

create table minimart_donvitinh (
	donViTinhId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	name varchar(75) null,
	status integer,
	note varchar(75) null
) engine InnoDB;

create table minimart_dotkhuyenmai (
	dotKhuyenMaiId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	trangThai tinyint,
	userModifieldId bigint,
	ngayBatDau datetime null,
	ngayHetHan datetime null,
	ngungApDung tinyint,
	tiLeGiaGia integer,
	ghiChu varchar(75) null
) engine InnoDB;

create table minimart_dotkhuyenmaichitiet (
	dotKhuyenMaiChiTietId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	dotKhuyenMaiId bigint,
	nhomMatHangId bigint,
	matHangId bigint,
	matHangTangId bigint,
	tiLeGiamGia double,
	giaTriDonHang double,
	soLuongMua integer,
	soLuongTang integer,
	giaBan integer
) engine InnoDB;

create table minimart_khachhang (
	khachHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	nhomKhachHangId bigint,
	ma varchar(75) null,
	diaChi varchar(75) null,
	dienThoai varchar(75) null,
	email varchar(75) null,
	facebook varchar(75) null,
	twitter varchar(75) null,
	socialMedia1 varchar(75) null,
	socialMedia2 varchar(75) null,
	socialMedia3 varchar(75) null,
	trangThai integer,
	diemTichLuy integer,
	maSoThue varchar(75) null,
	hoatDong tinyint,
	ngaySinh datetime null
) engine InnoDB;

create table minimart_khohang (
	khoHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	trangThai tinyint,
	itemType integer,
	choPhepNhapKho tinyint,
	cuaHangId bigint,
	autoId bigint,
	sigmaId bigint,
	ghiChu varchar(75) null
) engine InnoDB;

create table minimart_loaihinhkhuyenmai (
	loaiHinhKhuyenMaiId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	trangThai tinyint,
	tileGiamGia integer,
	ngayBatDau datetime null,
	ngayHetHan datetime null,
	imageid varchar(75) null,
	ghiChu varchar(75) null
) engine InnoDB;

create table minimart_mathang (
	uuid_ varchar(75) null,
	matHangId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	name varchar(75) null,
	code_ varchar(75) null,
	giaNhap integer,
	status integer,
	giaBan integer,
	giaBan1 integer,
	giaBan2 integer,
	giaBan3 integer,
	tonToiThieu integer,
	tonToiDa integer,
	giaVon integer,
	hoaHong integer,
	nhomMatHangId bigint,
	donViTinhId bigint,
	size_ varchar(75) null,
	imageUrl varchar(75) null,
	hoatDong tinyint
) engine InnoDB;

create table minimart_nhacungcap (
	nhaCungCapId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	tenNhaCungCap varchar(75) null,
	nhomNhaCungCapId bigint,
	maNhaCungCap varchar(75) null,
	diaChi varchar(75) null,
	dienThoai varchar(75) null,
	email varchar(75) null,
	website varchar(75) null,
	ghiChu varchar(75) null,
	hoatDong tinyint,
	doUuTien integer,
	logoURL varchar(75) null
) engine InnoDB;

create table minimart_nhanvien (
	uuid_ varchar(75) null,
	nhanVienId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	ho varchar(75) null,
	trangThai tinyint,
	nghiThu7 tinyint,
	nghiChuNhat tinyint,
	cachTinhLuong integer,
	luongCa integer,
	luongThang integer,
	image varchar(75) null,
	diaChiId bigint
) engine InnoDB;

create table minimart_nhomkhachhang (
	nhomKhachHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	hoatDong tinyint,
	diemTichLuy integer,
	tiLeGiamGia integer,
	uuTien integer,
	image varchar(75) null
) engine InnoDB;

create table minimart_nhommathang (
	nhomMatHangId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	name varchar(75) null,
	code_ varchar(75) null,
	status integer,
	note varchar(75) null
) engine InnoDB;

create table minimart_nhomnhacungcap (
	nhomNhaCungCapId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	ghiChu varchar(75) null,
	hoatDong tinyint,
	uuTien integer,
	image varchar(75) null
) engine InnoDB;

create table minimart_phuongxa (
	phuongXaId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	ma varchar(75) null,
	trangThai tinyint
) engine InnoDB;

create table minimart_quanhuyen (
	quanHuyenId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	ma varchar(75) null,
	trangThai tinyint
) engine InnoDB;

create table minimart_tangca (
	tangCaId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	cuaHangId bigint,
	caLamViecId bigint,
	nhanVienId bigint,
	tangCaTu datetime null,
	tangCaDen datetime null,
	hoatDong tinyint
) engine InnoDB;

create table minimart_thetratruoc (
	theTraTruocId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	tenThe varchar(75) null,
	nhomTheTraTruocId bigint,
	khoa tinyint,
	ngayHetHan datetime null,
	trangThai varchar(75) null,
	userModifiledId bigint
) engine InnoDB;

create table minimart_thuchi (
	thuChiId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	tenDoiTuong varchar(75) null,
	diaChiId bigint,
	loai integer,
	loaiDoiTuong integer,
	thu integer,
	chi integer,
	nhaCungCapId bigint,
	khachHangId bigint,
	nhanVienId bigint,
	theTraTruocId bigint,
	taiKhoanNganHangId bigint,
	datHangId bigint,
	bangLuongId bigint,
	lyDoThuChi varchar(75) null
) engine InnoDB;

create table minimart_tinhthanhpho (
	tinhThanhPhoId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	ma varchar(75) null,
	trangThai tinyint
) engine InnoDB;

create table minimart_trangthaidonhang (
	trangThaiDonHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	hoatDong tinyint,
	ghiChu varchar(75) null
) engine InnoDB;


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


