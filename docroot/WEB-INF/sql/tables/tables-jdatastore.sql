create table minimart_Duong (
	duongId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	ten varchar(75) null,
	ma varchar(75) null,
	trangThai boolean
);

create table minimart_bangluong (
	banLuongId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	ten varchar(75) null,
	trangThai boolean,
	thang integer,
	nam integer,
	ngay date null,
	chiTiet varchar(75) null,
	ghiChu varchar(75) null
);

create table minimart_calamviec (
	caLamViecId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	ten varchar(75) null,
	cuaHangId bigint,
	gioVaoLam date null,
	gioRaVe date null,
	gioNghiGiuaCaTu date null,
	gioNghiGiuaCaDen date null,
	tiLeLuong integer,
	hoatDong boolean
);

create table minimart_cuahang (
	uuid_ varchar(75) null,
	cuaHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	ten varchar(75) null,
	gioMoCua date null,
	gioDongCua date null,
	hoatDong boolean,
	uuTien integer,
	diaChi varchar(75) null,
	dienThoai varchar(75) null,
	khoHangId bigint
);

create table minimart_dathang (
	datHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
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
	trangThai boolean,
	userModifiedId bigint,
	timeModified date null,
	userCreateId bigint,
	loaiGia integer,
	hoatDong boolean
);

create table minimart_dathangchitiet (
	datHangChiTietId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	soLuong integer,
	donGia integer,
	thanhTien integer,
	tiLeGiamGia double,
	ghiChu varchar(75) null,
	trangThai boolean,
	baoHanh varchar(75) null,
	donViTinhId bigint,
	datHangId bigint,
	maHangId bigint
);

create table minimart_donhang (
	donHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	cuaHangId bigint,
	khachHangId bigint,
	hoatDong boolean,
	tongCong integer,
	daThanhToan boolean,
	phiVanChuyen integer,
	trangThaiDonHangId bigint,
	ngayThanhToan date null,
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
);

create table minimart_donhangchitiet (
	donHangChiTietId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	donHangId bigint,
	matHangId bigint,
	soLuong integer,
	donViTinhId bigint,
	thanhTien integer,
	tiLeGiamGia integer,
	kichThuoc varchar(75) null,
	hanSuDung date null,
	hoatDong boolean,
	huy boolean
);

create table minimart_donvitinh (
	donViTinhId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	name varchar(75) null,
	status integer,
	note varchar(75) null
);

create table minimart_dotkhuyenmai (
	dotKhuyenMaiId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	ten varchar(75) null,
	trangThai boolean,
	userModifieldId bigint,
	ngayBatDau date null,
	ngayHetHan date null,
	ngungApDung boolean,
	tiLeGiaGia integer,
	ghiChu varchar(75) null
);

create table minimart_dotkhuyenmaichitiet (
	dotKhuyenMaiChiTietId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	dotKhuyenMaiId bigint,
	nhomMatHangId bigint,
	matHangId bigint,
	matHangTangId bigint,
	tiLeGiamGia double,
	giaTriDonHang double,
	soLuongMua integer,
	soLuongTang integer,
	giaBan integer
);

create table minimart_khachhang (
	khachHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
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
	hoatDong boolean,
	ngaySinh date null
);

create table minimart_khohang (
	khoHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	ten varchar(75) null,
	trangThai boolean,
	itemType integer,
	choPhepNhapKho boolean,
	cuaHangId bigint,
	autoId bigint,
	sigmaId bigint,
	ghiChu varchar(75) null
);

create table minimart_loaihinhkhuyenmai (
	loaiHinhKhuyenMaiId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	ten varchar(75) null,
	trangThai boolean,
	tileGiamGia integer,
	ngayBatDau date null,
	ngayHetHan date null,
	imageid varchar(75) null,
	ghiChu varchar(75) null
);

create table minimart_mathang (
	uuid_ varchar(75) null,
	matHangId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
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
	hoatDong boolean
);

create table minimart_nhacungcap (
	nhaCungCapId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	tenNhaCungCap varchar(75) null,
	nhomNhaCungCapId bigint,
	maNhaCungCap varchar(75) null,
	diaChi varchar(75) null,
	dienThoai varchar(75) null,
	email varchar(75) null,
	website varchar(75) null,
	ghiChu varchar(75) null,
	hoatDong boolean,
	doUuTien integer,
	logoURL varchar(75) null
);

create table minimart_nhanvien (
	uuid_ varchar(75) null,
	nhanVienId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	ten varchar(75) null,
	ho varchar(75) null,
	trangThai boolean,
	nghiThu7 boolean,
	nghiChuNhat boolean,
	cachTinhLuong integer,
	luongCa integer,
	luongThang integer,
	image varchar(75) null,
	diaChiId bigint
);

create table minimart_nhomkhachhang (
	nhomKhachHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	ten varchar(75) null,
	hoatDong boolean,
	diemTichLuy integer,
	tiLeGiamGia integer,
	uuTien integer,
	image varchar(75) null
);

create table minimart_nhommathang (
	nhomMatHangId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	name varchar(75) null,
	code_ varchar(75) null,
	status integer,
	note varchar(75) null
);

create table minimart_nhomnhacungcap (
	nhomNhaCungCapId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	ten varchar(75) null,
	ghiChu varchar(75) null,
	hoatDong boolean,
	uuTien integer,
	image varchar(75) null
);

create table minimart_phuongxa (
	phuongXaId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	ten varchar(75) null,
	ma varchar(75) null,
	trangThai boolean
);

create table minimart_quanhuyen (
	quanHuyenId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	ten varchar(75) null,
	ma varchar(75) null,
	trangThai boolean
);

create table minimart_tangca (
	tangCaId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	ten varchar(75) null,
	cuaHangId bigint,
	caLamViecId bigint,
	nhanVienId bigint,
	tangCaTu date null,
	tangCaDen date null,
	hoatDong boolean
);

create table minimart_thetratruoc (
	theTraTruocId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	tenThe varchar(75) null,
	nhomTheTraTruocId bigint,
	khoa boolean,
	ngayHetHan date null,
	trangThai varchar(75) null,
	userModifiledId bigint
);

create table minimart_thuchi (
	thuChiId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
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
);

create table minimart_tinhthanhpho (
	tinhThanhPhoId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	ten varchar(75) null,
	ma varchar(75) null,
	trangThai boolean
);

create table minimart_trangthaidonhang (
	trangThaiDonHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate date null,
	modifiedDate date null,
	ten varchar(75) null,
	hoatDong boolean,
	ghiChu varchar(75) null
);
