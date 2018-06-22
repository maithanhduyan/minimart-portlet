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
