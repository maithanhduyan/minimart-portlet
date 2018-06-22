create table minimart_Duong (
	duongId decimal(20,0) not null primary key,
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	ma varchar(75) null,
	trangThai int
)
go

create table minimart_bangluong (
	banLuongId decimal(20,0) not null primary key,
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	trangThai int,
	thang int,
	nam int,
	ngay datetime null,
	chiTiet varchar(75) null,
	ghiChu varchar(75) null
)
go

create table minimart_calamviec (
	caLamViecId decimal(20,0) not null primary key,
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	cuaHangId decimal(20,0),
	gioVaoLam datetime null,
	gioRaVe datetime null,
	gioNghiGiuaCaTu datetime null,
	gioNghiGiuaCaDen datetime null,
	tiLeLuong int,
	hoatDong int
)
go

create table minimart_cuahang (
	uuid_ varchar(75) null,
	cuaHangId decimal(20,0) not null primary key,
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	gioMoCua datetime null,
	gioDongCua datetime null,
	hoatDong int,
	uuTien int,
	diaChi varchar(75) null,
	dienThoai varchar(75) null,
	khoHangId decimal(20,0)
)
go

create table minimart_dathang (
	datHangId decimal(20,0) not null primary key,
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	khachHangId decimal(20,0),
	diaChiId decimal(20,0),
	tienHang int,
	tiLeThue float,
	tiLeGiamGia float,
	tienGiamGia int,
	phiVanChuyen int,
	tongCong int,
	loai int,
	giamTheoTien int,
	trangThai int,
	userModifiedId decimal(20,0),
	timeModified datetime null,
	userCreateId decimal(20,0),
	loaiGia int,
	hoatDong int
)
go

create table minimart_dathangchitiet (
	datHangChiTietId decimal(20,0) not null primary key,
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	soLuong int,
	donGia int,
	thanhTien int,
	tiLeGiamGia float,
	ghiChu varchar(75) null,
	trangThai int,
	baoHanh varchar(75) null,
	donViTinhId decimal(20,0),
	datHangId decimal(20,0),
	maHangId decimal(20,0)
)
go

create table minimart_donhang (
	donHangId decimal(20,0) not null primary key,
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	cuaHangId decimal(20,0),
	khachHangId decimal(20,0),
	hoatDong int,
	tongCong int,
	daThanhToan int,
	phiVanChuyen int,
	trangThaiDonHangId decimal(20,0),
	ngayThanhToan datetime null,
	khachDua int,
	traLai int,
	thueVAT int,
	diemTichLuy int,
	thanhToanTienMat int,
	thanhToanThe int,
	thanhToanChuyenKhoan int,
	phieuGiamGiaId decimal(20,0),
	truTichLuy int,
	inHoaDonLan int,
	maDonHang varchar(75) null
)
go

create table minimart_donhangchitiet (
	donHangChiTietId decimal(20,0) not null primary key,
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	donHangId decimal(20,0),
	matHangId decimal(20,0),
	soLuong int,
	donViTinhId decimal(20,0),
	thanhTien int,
	tiLeGiamGia int,
	kichThuoc varchar(75) null,
	hanSuDung datetime null,
	hoatDong int,
	huy int
)
go

create table minimart_donvitinh (
	donViTinhId decimal(20,0) not null primary key,
	groupId decimal(20,0),
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	name varchar(75) null,
	status int,
	note varchar(75) null
)
go

create table minimart_dotkhuyenmai (
	dotKhuyenMaiId decimal(20,0) not null primary key,
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	trangThai int,
	userModifieldId decimal(20,0),
	ngayBatDau datetime null,
	ngayHetHan datetime null,
	ngungApDung int,
	tiLeGiaGia int,
	ghiChu varchar(75) null
)
go

create table minimart_dotkhuyenmaichitiet (
	dotKhuyenMaiChiTietId decimal(20,0) not null primary key,
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	dotKhuyenMaiId decimal(20,0),
	nhomMatHangId decimal(20,0),
	matHangId decimal(20,0),
	matHangTangId decimal(20,0),
	tiLeGiamGia float,
	giaTriDonHang float,
	soLuongMua int,
	soLuongTang int,
	giaBan int
)
go

create table minimart_khachhang (
	khachHangId decimal(20,0) not null primary key,
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	nhomKhachHangId decimal(20,0),
	ma varchar(75) null,
	diaChi varchar(75) null,
	dienThoai varchar(75) null,
	email varchar(75) null,
	facebook varchar(75) null,
	twitter varchar(75) null,
	socialMedia1 varchar(75) null,
	socialMedia2 varchar(75) null,
	socialMedia3 varchar(75) null,
	trangThai int,
	diemTichLuy int,
	maSoThue varchar(75) null,
	hoatDong int,
	ngaySinh datetime null
)
go

create table minimart_khohang (
	khoHangId decimal(20,0) not null primary key,
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	trangThai int,
	itemType int,
	choPhepNhapKho int,
	cuaHangId decimal(20,0),
	autoId decimal(20,0),
	sigmaId decimal(20,0),
	ghiChu varchar(75) null
)
go

create table minimart_loaihinhkhuyenmai (
	loaiHinhKhuyenMaiId decimal(20,0) not null primary key,
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	trangThai int,
	tileGiamGia int,
	ngayBatDau datetime null,
	ngayHetHan datetime null,
	imageid varchar(75) null,
	ghiChu varchar(75) null
)
go

create table minimart_mathang (
	uuid_ varchar(75) null,
	matHangId decimal(20,0) not null primary key,
	groupId decimal(20,0),
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	name varchar(75) null,
	code_ varchar(75) null,
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
	nhomMatHangId decimal(20,0),
	donViTinhId decimal(20,0),
	size_ varchar(75) null,
	imageUrl varchar(75) null,
	hoatDong int
)
go

create table minimart_nhacungcap (
	nhaCungCapId decimal(20,0) not null primary key,
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	tenNhaCungCap varchar(75) null,
	nhomNhaCungCapId decimal(20,0),
	maNhaCungCap varchar(75) null,
	diaChi varchar(75) null,
	dienThoai varchar(75) null,
	email varchar(75) null,
	website varchar(75) null,
	ghiChu varchar(75) null,
	hoatDong int,
	doUuTien int,
	logoURL varchar(75) null
)
go

create table minimart_nhanvien (
	uuid_ varchar(75) null,
	nhanVienId decimal(20,0) not null primary key,
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	ho varchar(75) null,
	trangThai int,
	nghiThu7 int,
	nghiChuNhat int,
	cachTinhLuong int,
	luongCa int,
	luongThang int,
	image varchar(75) null,
	diaChiId decimal(20,0)
)
go

create table minimart_nhomkhachhang (
	nhomKhachHangId decimal(20,0) not null primary key,
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	hoatDong int,
	diemTichLuy int,
	tiLeGiamGia int,
	uuTien int,
	image varchar(75) null
)
go

create table minimart_nhommathang (
	nhomMatHangId decimal(20,0) not null primary key,
	groupId decimal(20,0),
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	name varchar(75) null,
	code_ varchar(75) null,
	status int,
	note varchar(75) null
)
go

create table minimart_nhomnhacungcap (
	nhomNhaCungCapId decimal(20,0) not null primary key,
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	ghiChu varchar(75) null,
	hoatDong int,
	uuTien int,
	image varchar(75) null
)
go

create table minimart_phuongxa (
	phuongXaId decimal(20,0) not null primary key,
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	ma varchar(75) null,
	trangThai int
)
go

create table minimart_quanhuyen (
	quanHuyenId decimal(20,0) not null primary key,
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	ma varchar(75) null,
	trangThai int
)
go

create table minimart_tangca (
	tangCaId decimal(20,0) not null primary key,
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	cuaHangId decimal(20,0),
	caLamViecId decimal(20,0),
	nhanVienId decimal(20,0),
	tangCaTu datetime null,
	tangCaDen datetime null,
	hoatDong int
)
go

create table minimart_thetratruoc (
	theTraTruocId decimal(20,0) not null primary key,
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	tenThe varchar(75) null,
	nhomTheTraTruocId decimal(20,0),
	khoa int,
	ngayHetHan datetime null,
	trangThai varchar(75) null,
	userModifiledId decimal(20,0)
)
go

create table minimart_thuchi (
	thuChiId decimal(20,0) not null primary key,
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	tenDoiTuong varchar(75) null,
	diaChiId decimal(20,0),
	loai int,
	loaiDoiTuong int,
	thu int,
	chi int,
	nhaCungCapId decimal(20,0),
	khachHangId decimal(20,0),
	nhanVienId decimal(20,0),
	theTraTruocId decimal(20,0),
	taiKhoanNganHangId decimal(20,0),
	datHangId decimal(20,0),
	bangLuongId decimal(20,0),
	lyDoThuChi varchar(75) null
)
go

create table minimart_tinhthanhpho (
	tinhThanhPhoId decimal(20,0) not null primary key,
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	ma varchar(75) null,
	trangThai int
)
go

create table minimart_trangthaidonhang (
	trangThaiDonHangId decimal(20,0) not null primary key,
	companyId decimal(20,0),
	userId decimal(20,0),
	userName varchar(75) null,
	createDate datetime null,
	modifiedDate datetime null,
	ten varchar(75) null,
	hoatDong int,
	ghiChu varchar(75) null
)
go
