create table minimart_Duong (
	duongId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten varchar(75) null,
	ma varchar(75) null,
	trangThai boolean
);

create table minimart_bangluong (
	banLuongId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten varchar(75) null,
	trangThai boolean,
	thang int,
	nam int,
	ngay timestamp null,
	chiTiet varchar(75) null,
	ghiChu varchar(75) null
);

create table minimart_calamviec (
	caLamViecId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten varchar(75) null,
	cuaHangId bigint,
	gioVaoLam timestamp null,
	gioRaVe timestamp null,
	gioNghiGiuaCaTu timestamp null,
	gioNghiGiuaCaDen timestamp null,
	tiLeLuong int,
	hoatDong boolean
);

create table minimart_cuahang (
	uuid_ varchar(75) null,
	cuaHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten varchar(75) null,
	gioMoCua timestamp null,
	gioDongCua timestamp null,
	hoatDong boolean,
	uuTien int,
	diaChi varchar(75) null,
	dienThoai varchar(75) null,
	khoHangId bigint
);

create table minimart_dathang (
	datHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten varchar(75) null,
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
	trangThai boolean,
	userModifiedId bigint,
	timeModified timestamp null,
	userCreateId bigint,
	loaiGia int,
	hoatDong boolean
);

create table minimart_dathangchitiet (
	datHangChiTietId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	soLuong int,
	donGia int,
	thanhTien int,
	tiLeGiamGia float,
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
	createDate timestamp null,
	modifiedDate timestamp null,
	cuaHangId bigint,
	khachHangId bigint,
	hoatDong boolean,
	tongCong int,
	daThanhToan boolean,
	phiVanChuyen int,
	trangThaiDonHangId bigint,
	ngayThanhToan timestamp null,
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
	maDonHang varchar(75) null
);

create table minimart_donhangchitiet (
	donHangChiTietId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	donHangId bigint,
	matHangId bigint,
	soLuong int,
	donViTinhId bigint,
	thanhTien int,
	tiLeGiamGia int,
	kichThuoc varchar(75) null,
	hanSuDung timestamp null,
	hoatDong boolean,
	huy boolean
);

create table minimart_donvitinh (
	donViTinhId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	name varchar(75) null,
	status int,
	note varchar(75) null
);

create table minimart_dotkhuyenmai (
	dotKhuyenMaiId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten varchar(75) null,
	trangThai boolean,
	userModifieldId bigint,
	ngayBatDau timestamp null,
	ngayHetHan timestamp null,
	ngungApDung boolean,
	tiLeGiaGia int,
	ghiChu varchar(75) null
);

create table minimart_dotkhuyenmaichitiet (
	dotKhuyenMaiChiTietId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
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
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
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
	trangThai int,
	diemTichLuy int,
	maSoThue varchar(75) null,
	hoatDong boolean,
	ngaySinh timestamp null
);

create table minimart_khohang (
	khoHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten varchar(75) null,
	trangThai boolean,
	itemType int,
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
	createDate timestamp null,
	modifiedDate timestamp null,
	ten varchar(75) null,
	trangThai boolean,
	tileGiamGia int,
	ngayBatDau timestamp null,
	ngayHetHan timestamp null,
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
	createDate timestamp null,
	modifiedDate timestamp null,
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
	createDate timestamp null,
	modifiedDate timestamp null,
	tenNhaCungCap varchar(75) null,
	nhomNhaCungCapId bigint,
	maNhaCungCap varchar(75) null,
	diaChi varchar(75) null,
	dienThoai varchar(75) null,
	email varchar(75) null,
	website varchar(75) null,
	ghiChu varchar(75) null,
	hoatDong boolean,
	doUuTien int,
	logoURL varchar(75) null
);

create table minimart_nhanvien (
	uuid_ varchar(75) null,
	nhanVienId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten varchar(75) null,
	ho varchar(75) null,
	trangThai boolean,
	nghiThu7 boolean,
	nghiChuNhat boolean,
	cachTinhLuong int,
	luongCa int,
	luongThang int,
	image varchar(75) null,
	diaChiId bigint
);

create table minimart_nhomkhachhang (
	nhomKhachHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten varchar(75) null,
	hoatDong boolean,
	diemTichLuy int,
	tiLeGiamGia int,
	uuTien int,
	image varchar(75) null
);

create table minimart_nhommathang (
	nhomMatHangId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	name varchar(75) null,
	code_ varchar(75) null,
	status int,
	note varchar(75) null
);

create table minimart_nhomnhacungcap (
	nhomNhaCungCapId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten varchar(75) null,
	ghiChu varchar(75) null,
	hoatDong boolean,
	uuTien int,
	image varchar(75) null
);

create table minimart_phuongxa (
	phuongXaId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten varchar(75) null,
	ma varchar(75) null,
	trangThai boolean
);

create table minimart_quanhuyen (
	quanHuyenId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten varchar(75) null,
	ma varchar(75) null,
	trangThai boolean
);

create table minimart_tangca (
	tangCaId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten varchar(75) null,
	cuaHangId bigint,
	caLamViecId bigint,
	nhanVienId bigint,
	tangCaTu timestamp null,
	tangCaDen timestamp null,
	hoatDong boolean
);

create table minimart_thetratruoc (
	theTraTruocId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	tenThe varchar(75) null,
	nhomTheTraTruocId bigint,
	khoa boolean,
	ngayHetHan timestamp null,
	trangThai varchar(75) null,
	userModifiledId bigint
);

create table minimart_thuchi (
	thuChiId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten varchar(75) null,
	tenDoiTuong varchar(75) null,
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
	lyDoThuChi varchar(75) null
);

create table minimart_tinhthanhpho (
	tinhThanhPhoId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten varchar(75) null,
	ma varchar(75) null,
	trangThai boolean
);

create table minimart_trangthaidonhang (
	trangThaiDonHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten varchar(75) null,
	hoatDong boolean,
	ghiChu varchar(75) null
);
