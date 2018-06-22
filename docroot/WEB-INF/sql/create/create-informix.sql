database sysmaster;
drop database lportal;
create database lportal WITH LOG;

create procedure 'lportal'.isnull(test_string varchar)
returning boolean;
IF test_string IS NULL THEN
	RETURN 't';
ELSE
	RETURN 'f';
END IF
end procedure;


create table minimart_Duong (
	duongId int8 not null primary key,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	ten varchar(75),
	ma varchar(75),
	trangThai boolean
)
extent size 16 next size 16
lock mode row;

create table minimart_bangluong (
	banLuongId int8 not null primary key,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	ten varchar(75),
	trangThai boolean,
	thang int,
	nam int,
	ngay datetime YEAR TO FRACTION,
	chiTiet varchar(75),
	ghiChu varchar(75)
)
extent size 16 next size 16
lock mode row;

create table minimart_calamviec (
	caLamViecId int8 not null primary key,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	ten varchar(75),
	cuaHangId int8,
	gioVaoLam datetime YEAR TO FRACTION,
	gioRaVe datetime YEAR TO FRACTION,
	gioNghiGiuaCaTu datetime YEAR TO FRACTION,
	gioNghiGiuaCaDen datetime YEAR TO FRACTION,
	tiLeLuong int,
	hoatDong boolean
)
extent size 16 next size 16
lock mode row;

create table minimart_cuahang (
	uuid_ varchar(75),
	cuaHangId int8 not null primary key,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	ten varchar(75),
	gioMoCua datetime YEAR TO FRACTION,
	gioDongCua datetime YEAR TO FRACTION,
	hoatDong boolean,
	uuTien int,
	diaChi varchar(75),
	dienThoai varchar(75),
	khoHangId int8
)
extent size 16 next size 16
lock mode row;

create table minimart_dathang (
	datHangId int8 not null primary key,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	ten varchar(75),
	khachHangId int8,
	diaChiId int8,
	tienHang int,
	tiLeThue float,
	tiLeGiamGia float,
	tienGiamGia int,
	phiVanChuyen int,
	tongCong int,
	loai int,
	giamTheoTien int,
	trangThai boolean,
	userModifiedId int8,
	timeModified datetime YEAR TO FRACTION,
	userCreateId int8,
	loaiGia int,
	hoatDong boolean
)
extent size 16 next size 16
lock mode row;

create table minimart_dathangchitiet (
	datHangChiTietId int8 not null primary key,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	soLuong int,
	donGia int,
	thanhTien int,
	tiLeGiamGia float,
	ghiChu varchar(75),
	trangThai boolean,
	baoHanh varchar(75),
	donViTinhId int8,
	datHangId int8,
	maHangId int8
)
extent size 16 next size 16
lock mode row;

create table minimart_donhang (
	donHangId int8 not null primary key,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	cuaHangId int8,
	khachHangId int8,
	hoatDong boolean,
	tongCong int,
	daThanhToan boolean,
	phiVanChuyen int,
	trangThaiDonHangId int8,
	ngayThanhToan datetime YEAR TO FRACTION,
	khachDua int,
	traLai int,
	thueVAT int,
	diemTichLuy int,
	thanhToanTienMat int,
	thanhToanThe int,
	thanhToanChuyenKhoan int,
	phieuGiamGiaId int8,
	truTichLuy int,
	inHoaDonLan int,
	maDonHang varchar(75)
)
extent size 16 next size 16
lock mode row;

create table minimart_donhangchitiet (
	donHangChiTietId int8 not null primary key,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	donHangId int8,
	matHangId int8,
	soLuong int,
	donViTinhId int8,
	thanhTien int,
	tiLeGiamGia int,
	kichThuoc varchar(75),
	hanSuDung datetime YEAR TO FRACTION,
	hoatDong boolean,
	huy boolean
)
extent size 16 next size 16
lock mode row;

create table minimart_donvitinh (
	donViTinhId int8 not null primary key,
	groupId int8,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	name varchar(75),
	status int,
	note varchar(75)
)
extent size 16 next size 16
lock mode row;

create table minimart_dotkhuyenmai (
	dotKhuyenMaiId int8 not null primary key,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	ten varchar(75),
	trangThai boolean,
	userModifieldId int8,
	ngayBatDau datetime YEAR TO FRACTION,
	ngayHetHan datetime YEAR TO FRACTION,
	ngungApDung boolean,
	tiLeGiaGia int,
	ghiChu varchar(75)
)
extent size 16 next size 16
lock mode row;

create table minimart_dotkhuyenmaichitiet (
	dotKhuyenMaiChiTietId int8 not null primary key,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	dotKhuyenMaiId int8,
	nhomMatHangId int8,
	matHangId int8,
	matHangTangId int8,
	tiLeGiamGia float,
	giaTriDonHang float,
	soLuongMua int,
	soLuongTang int,
	giaBan int
)
extent size 16 next size 16
lock mode row;

create table minimart_khachhang (
	khachHangId int8 not null primary key,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	ten varchar(75),
	nhomKhachHangId int8,
	ma varchar(75),
	diaChi varchar(75),
	dienThoai varchar(75),
	email varchar(75),
	facebook varchar(75),
	twitter varchar(75),
	socialMedia1 varchar(75),
	socialMedia2 varchar(75),
	socialMedia3 varchar(75),
	trangThai int,
	diemTichLuy int,
	maSoThue varchar(75),
	hoatDong boolean,
	ngaySinh datetime YEAR TO FRACTION
)
extent size 16 next size 16
lock mode row;

create table minimart_khohang (
	khoHangId int8 not null primary key,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	ten varchar(75),
	trangThai boolean,
	itemType int,
	choPhepNhapKho boolean,
	cuaHangId int8,
	autoId int8,
	sigmaId int8,
	ghiChu varchar(75)
)
extent size 16 next size 16
lock mode row;

create table minimart_loaihinhkhuyenmai (
	loaiHinhKhuyenMaiId int8 not null primary key,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	ten varchar(75),
	trangThai boolean,
	tileGiamGia int,
	ngayBatDau datetime YEAR TO FRACTION,
	ngayHetHan datetime YEAR TO FRACTION,
	imageid varchar(75),
	ghiChu varchar(75)
)
extent size 16 next size 16
lock mode row;

create table minimart_mathang (
	uuid_ varchar(75),
	matHangId int8 not null primary key,
	groupId int8,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	name varchar(75),
	code_ varchar(75),
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
	nhomMatHangId int8,
	donViTinhId int8,
	size_ varchar(75),
	imageUrl varchar(75),
	hoatDong boolean
)
extent size 16 next size 16
lock mode row;

create table minimart_nhacungcap (
	nhaCungCapId int8 not null primary key,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	tenNhaCungCap varchar(75),
	nhomNhaCungCapId int8,
	maNhaCungCap varchar(75),
	diaChi varchar(75),
	dienThoai varchar(75),
	email varchar(75),
	website varchar(75),
	ghiChu varchar(75),
	hoatDong boolean,
	doUuTien int,
	logoURL varchar(75)
)
extent size 16 next size 16
lock mode row;

create table minimart_nhanvien (
	uuid_ varchar(75),
	nhanVienId int8 not null primary key,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	ten varchar(75),
	ho varchar(75),
	trangThai boolean,
	nghiThu7 boolean,
	nghiChuNhat boolean,
	cachTinhLuong int,
	luongCa int,
	luongThang int,
	image varchar(75),
	diaChiId int8
)
extent size 16 next size 16
lock mode row;

create table minimart_nhomkhachhang (
	nhomKhachHangId int8 not null primary key,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	ten varchar(75),
	hoatDong boolean,
	diemTichLuy int,
	tiLeGiamGia int,
	uuTien int,
	image varchar(75)
)
extent size 16 next size 16
lock mode row;

create table minimart_nhommathang (
	nhomMatHangId int8 not null primary key,
	groupId int8,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	name varchar(75),
	code_ varchar(75),
	status int,
	note varchar(75)
)
extent size 16 next size 16
lock mode row;

create table minimart_nhomnhacungcap (
	nhomNhaCungCapId int8 not null primary key,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	ten varchar(75),
	ghiChu varchar(75),
	hoatDong boolean,
	uuTien int,
	image varchar(75)
)
extent size 16 next size 16
lock mode row;

create table minimart_phuongxa (
	phuongXaId int8 not null primary key,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	ten varchar(75),
	ma varchar(75),
	trangThai boolean
)
extent size 16 next size 16
lock mode row;

create table minimart_quanhuyen (
	quanHuyenId int8 not null primary key,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	ten varchar(75),
	ma varchar(75),
	trangThai boolean
)
extent size 16 next size 16
lock mode row;

create table minimart_tangca (
	tangCaId int8 not null primary key,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	ten varchar(75),
	cuaHangId int8,
	caLamViecId int8,
	nhanVienId int8,
	tangCaTu datetime YEAR TO FRACTION,
	tangCaDen datetime YEAR TO FRACTION,
	hoatDong boolean
)
extent size 16 next size 16
lock mode row;

create table minimart_thetratruoc (
	theTraTruocId int8 not null primary key,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	tenThe varchar(75),
	nhomTheTraTruocId int8,
	khoa boolean,
	ngayHetHan datetime YEAR TO FRACTION,
	trangThai varchar(75),
	userModifiledId int8
)
extent size 16 next size 16
lock mode row;

create table minimart_thuchi (
	thuChiId int8 not null primary key,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	ten varchar(75),
	tenDoiTuong varchar(75),
	diaChiId int8,
	loai int,
	loaiDoiTuong int,
	thu int,
	chi int,
	nhaCungCapId int8,
	khachHangId int8,
	nhanVienId int8,
	theTraTruocId int8,
	taiKhoanNganHangId int8,
	datHangId int8,
	bangLuongId int8,
	lyDoThuChi varchar(75)
)
extent size 16 next size 16
lock mode row;

create table minimart_tinhthanhpho (
	tinhThanhPhoId int8 not null primary key,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	ten varchar(75),
	ma varchar(75),
	trangThai boolean
)
extent size 16 next size 16
lock mode row;

create table minimart_trangthaidonhang (
	trangThaiDonHangId int8 not null primary key,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	ten varchar(75),
	hoatDong boolean,
	ghiChu varchar(75)
)
extent size 16 next size 16
lock mode row;


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


