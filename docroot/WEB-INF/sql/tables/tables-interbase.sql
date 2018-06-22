create table minimart_Duong (
	duongId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	ma varchar(75),
	trangThai smallint
);

create table minimart_bangluong (
	banLuongId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	trangThai smallint,
	thang integer,
	nam integer,
	ngay timestamp,
	chiTiet varchar(75),
	ghiChu varchar(75)
);

create table minimart_calamviec (
	caLamViecId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	cuaHangId int64,
	gioVaoLam timestamp,
	gioRaVe timestamp,
	gioNghiGiuaCaTu timestamp,
	gioNghiGiuaCaDen timestamp,
	tiLeLuong integer,
	hoatDong smallint
);

create table minimart_cuahang (
	uuid_ varchar(75),
	cuaHangId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	gioMoCua timestamp,
	gioDongCua timestamp,
	hoatDong smallint,
	uuTien integer,
	diaChi varchar(75),
	dienThoai varchar(75),
	khoHangId int64
);

create table minimart_dathang (
	datHangId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	khachHangId int64,
	diaChiId int64,
	tienHang integer,
	tiLeThue double precision,
	tiLeGiamGia double precision,
	tienGiamGia integer,
	phiVanChuyen integer,
	tongCong integer,
	loai integer,
	giamTheoTien integer,
	trangThai smallint,
	userModifiedId int64,
	timeModified timestamp,
	userCreateId int64,
	loaiGia integer,
	hoatDong smallint
);

create table minimart_dathangchitiet (
	datHangChiTietId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	soLuong integer,
	donGia integer,
	thanhTien integer,
	tiLeGiamGia double precision,
	ghiChu varchar(75),
	trangThai smallint,
	baoHanh varchar(75),
	donViTinhId int64,
	datHangId int64,
	maHangId int64
);

create table minimart_donhang (
	donHangId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	cuaHangId int64,
	khachHangId int64,
	hoatDong smallint,
	tongCong integer,
	daThanhToan smallint,
	phiVanChuyen integer,
	trangThaiDonHangId int64,
	ngayThanhToan timestamp,
	khachDua integer,
	traLai integer,
	thueVAT integer,
	diemTichLuy integer,
	thanhToanTienMat integer,
	thanhToanThe integer,
	thanhToanChuyenKhoan integer,
	phieuGiamGiaId int64,
	truTichLuy integer,
	inHoaDonLan integer,
	maDonHang varchar(75)
);

create table minimart_donhangchitiet (
	donHangChiTietId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	donHangId int64,
	matHangId int64,
	soLuong integer,
	donViTinhId int64,
	thanhTien integer,
	tiLeGiamGia integer,
	kichThuoc varchar(75),
	hanSuDung timestamp,
	hoatDong smallint,
	huy smallint
);

create table minimart_donvitinh (
	donViTinhId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	name varchar(75),
	status integer,
	note varchar(75)
);

create table minimart_dotkhuyenmai (
	dotKhuyenMaiId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	trangThai smallint,
	userModifieldId int64,
	ngayBatDau timestamp,
	ngayHetHan timestamp,
	ngungApDung smallint,
	tiLeGiaGia integer,
	ghiChu varchar(75)
);

create table minimart_dotkhuyenmaichitiet (
	dotKhuyenMaiChiTietId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	dotKhuyenMaiId int64,
	nhomMatHangId int64,
	matHangId int64,
	matHangTangId int64,
	tiLeGiamGia double precision,
	giaTriDonHang double precision,
	soLuongMua integer,
	soLuongTang integer,
	giaBan integer
);

create table minimart_khachhang (
	khachHangId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	nhomKhachHangId int64,
	ma varchar(75),
	diaChi varchar(75),
	dienThoai varchar(75),
	email varchar(75),
	facebook varchar(75),
	twitter varchar(75),
	socialMedia1 varchar(75),
	socialMedia2 varchar(75),
	socialMedia3 varchar(75),
	trangThai integer,
	diemTichLuy integer,
	maSoThue varchar(75),
	hoatDong smallint,
	ngaySinh timestamp
);

create table minimart_khohang (
	khoHangId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	trangThai smallint,
	itemType integer,
	choPhepNhapKho smallint,
	cuaHangId int64,
	autoId int64,
	sigmaId int64,
	ghiChu varchar(75)
);

create table minimart_loaihinhkhuyenmai (
	loaiHinhKhuyenMaiId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	trangThai smallint,
	tileGiamGia integer,
	ngayBatDau timestamp,
	ngayHetHan timestamp,
	imageid varchar(75),
	ghiChu varchar(75)
);

create table minimart_mathang (
	uuid_ varchar(75),
	matHangId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	name varchar(75),
	code_ varchar(75),
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
	nhomMatHangId int64,
	donViTinhId int64,
	size_ varchar(75),
	imageUrl varchar(75),
	hoatDong smallint
);

create table minimart_nhacungcap (
	nhaCungCapId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	tenNhaCungCap varchar(75),
	nhomNhaCungCapId int64,
	maNhaCungCap varchar(75),
	diaChi varchar(75),
	dienThoai varchar(75),
	email varchar(75),
	website varchar(75),
	ghiChu varchar(75),
	hoatDong smallint,
	doUuTien integer,
	logoURL varchar(75)
);

create table minimart_nhanvien (
	uuid_ varchar(75),
	nhanVienId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	ho varchar(75),
	trangThai smallint,
	nghiThu7 smallint,
	nghiChuNhat smallint,
	cachTinhLuong integer,
	luongCa integer,
	luongThang integer,
	image varchar(75),
	diaChiId int64
);

create table minimart_nhomkhachhang (
	nhomKhachHangId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	hoatDong smallint,
	diemTichLuy integer,
	tiLeGiamGia integer,
	uuTien integer,
	image varchar(75)
);

create table minimart_nhommathang (
	nhomMatHangId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	name varchar(75),
	code_ varchar(75),
	status integer,
	note varchar(75)
);

create table minimart_nhomnhacungcap (
	nhomNhaCungCapId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	ghiChu varchar(75),
	hoatDong smallint,
	uuTien integer,
	image varchar(75)
);

create table minimart_phuongxa (
	phuongXaId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	ma varchar(75),
	trangThai smallint
);

create table minimart_quanhuyen (
	quanHuyenId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	ma varchar(75),
	trangThai smallint
);

create table minimart_tangca (
	tangCaId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	cuaHangId int64,
	caLamViecId int64,
	nhanVienId int64,
	tangCaTu timestamp,
	tangCaDen timestamp,
	hoatDong smallint
);

create table minimart_thetratruoc (
	theTraTruocId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	tenThe varchar(75),
	nhomTheTraTruocId int64,
	khoa smallint,
	ngayHetHan timestamp,
	trangThai varchar(75),
	userModifiledId int64
);

create table minimart_thuchi (
	thuChiId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	tenDoiTuong varchar(75),
	diaChiId int64,
	loai integer,
	loaiDoiTuong integer,
	thu integer,
	chi integer,
	nhaCungCapId int64,
	khachHangId int64,
	nhanVienId int64,
	theTraTruocId int64,
	taiKhoanNganHangId int64,
	datHangId int64,
	bangLuongId int64,
	lyDoThuChi varchar(75)
);

create table minimart_tinhthanhpho (
	tinhThanhPhoId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	ma varchar(75),
	trangThai smallint
);

create table minimart_trangthaidonhang (
	trangThaiDonHangId int64 not null primary key,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	hoatDong smallint,
	ghiChu varchar(75)
);
