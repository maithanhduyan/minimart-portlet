create table minimart_Duong (
	duongId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	ma varchar(75),
	trangThai smallint
);

create table minimart_bangluong (
	banLuongId bigint not null primary key,
	companyId bigint,
	userId bigint,
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
	caLamViecId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	cuaHangId bigint,
	gioVaoLam timestamp,
	gioRaVe timestamp,
	gioNghiGiuaCaTu timestamp,
	gioNghiGiuaCaDen timestamp,
	tiLeLuong integer,
	hoatDong smallint
);

create table minimart_cuahang (
	uuid_ varchar(75),
	cuaHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
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
	khoHangId bigint
);

create table minimart_dathang (
	datHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
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
	trangThai smallint,
	userModifiedId bigint,
	timeModified timestamp,
	userCreateId bigint,
	loaiGia integer,
	hoatDong smallint
);

create table minimart_dathangchitiet (
	datHangChiTietId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	soLuong integer,
	donGia integer,
	thanhTien integer,
	tiLeGiamGia double,
	ghiChu varchar(75),
	trangThai smallint,
	baoHanh varchar(75),
	donViTinhId bigint,
	datHangId bigint,
	maHangId bigint
);

create table minimart_donhang (
	donHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	cuaHangId bigint,
	khachHangId bigint,
	hoatDong smallint,
	tongCong integer,
	daThanhToan smallint,
	phiVanChuyen integer,
	trangThaiDonHangId bigint,
	ngayThanhToan timestamp,
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
	maDonHang varchar(75)
);

create table minimart_donhangchitiet (
	donHangChiTietId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	donHangId bigint,
	matHangId bigint,
	soLuong integer,
	donViTinhId bigint,
	thanhTien integer,
	tiLeGiamGia integer,
	kichThuoc varchar(75),
	hanSuDung timestamp,
	hoatDong smallint,
	huy smallint
);

create table minimart_donvitinh (
	donViTinhId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	name varchar(75),
	status integer,
	note varchar(75)
);

create table minimart_dotkhuyenmai (
	dotKhuyenMaiId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	trangThai smallint,
	userModifieldId bigint,
	ngayBatDau timestamp,
	ngayHetHan timestamp,
	ngungApDung smallint,
	tiLeGiaGia integer,
	ghiChu varchar(75)
);

create table minimart_dotkhuyenmaichitiet (
	dotKhuyenMaiChiTietId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
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
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	nhomKhachHangId bigint,
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
	khoHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	trangThai smallint,
	itemType integer,
	choPhepNhapKho smallint,
	cuaHangId bigint,
	autoId bigint,
	sigmaId bigint,
	ghiChu varchar(75)
);

create table minimart_loaihinhkhuyenmai (
	loaiHinhKhuyenMaiId bigint not null primary key,
	companyId bigint,
	userId bigint,
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
	matHangId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
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
	nhomMatHangId bigint,
	donViTinhId bigint,
	size_ varchar(75),
	imageUrl varchar(75),
	hoatDong smallint
);

create table minimart_nhacungcap (
	nhaCungCapId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	tenNhaCungCap varchar(75),
	nhomNhaCungCapId bigint,
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
	nhanVienId bigint not null primary key,
	companyId bigint,
	userId bigint,
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
	diaChiId bigint
);

create table minimart_nhomkhachhang (
	nhomKhachHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
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
	nhomMatHangId bigint not null primary key,
	groupId bigint,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	name varchar(75),
	code_ varchar(75),
	status integer,
	note varchar(75)
);

create table minimart_nhomnhacungcap (
	nhomNhaCungCapId bigint not null primary key,
	companyId bigint,
	userId bigint,
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
	phuongXaId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	ma varchar(75),
	trangThai smallint
);

create table minimart_quanhuyen (
	quanHuyenId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	ma varchar(75),
	trangThai smallint
);

create table minimart_tangca (
	tangCaId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	cuaHangId bigint,
	caLamViecId bigint,
	nhanVienId bigint,
	tangCaTu timestamp,
	tangCaDen timestamp,
	hoatDong smallint
);

create table minimart_thetratruoc (
	theTraTruocId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	tenThe varchar(75),
	nhomTheTraTruocId bigint,
	khoa smallint,
	ngayHetHan timestamp,
	trangThai varchar(75),
	userModifiledId bigint
);

create table minimart_thuchi (
	thuChiId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	tenDoiTuong varchar(75),
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
	lyDoThuChi varchar(75)
);

create table minimart_tinhthanhpho (
	tinhThanhPhoId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	ma varchar(75),
	trangThai smallint
);

create table minimart_trangthaidonhang (
	trangThaiDonHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	ten varchar(75),
	hoatDong smallint,
	ghiChu varchar(75)
);
