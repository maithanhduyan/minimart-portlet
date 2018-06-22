create table minimart_Duong (
	duongId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten varchar(75) null,
	ma varchar(75) null,
	trangThai bool
);

create table minimart_bangluong (
	banLuongId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten varchar(75) null,
	trangThai bool,
	thang integer,
	nam integer,
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
	tiLeLuong integer,
	hoatDong bool
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
	hoatDong bool,
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
	createDate timestamp null,
	modifiedDate timestamp null,
	ten varchar(75) null,
	khachHangId bigint,
	diaChiId bigint,
	tienHang integer,
	tiLeThue double precision,
	tiLeGiamGia double precision,
	tienGiamGia integer,
	phiVanChuyen integer,
	tongCong integer,
	loai integer,
	giamTheoTien integer,
	trangThai bool,
	userModifiedId bigint,
	timeModified timestamp null,
	userCreateId bigint,
	loaiGia integer,
	hoatDong bool
);

create table minimart_dathangchitiet (
	datHangChiTietId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	soLuong integer,
	donGia integer,
	thanhTien integer,
	tiLeGiamGia double precision,
	ghiChu varchar(75) null,
	trangThai bool,
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
	hoatDong bool,
	tongCong integer,
	daThanhToan bool,
	phiVanChuyen integer,
	trangThaiDonHangId bigint,
	ngayThanhToan timestamp null,
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
	createDate timestamp null,
	modifiedDate timestamp null,
	donHangId bigint,
	matHangId bigint,
	soLuong integer,
	donViTinhId bigint,
	thanhTien integer,
	tiLeGiamGia integer,
	kichThuoc varchar(75) null,
	hanSuDung timestamp null,
	hoatDong bool,
	huy bool
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
	status integer,
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
	trangThai bool,
	userModifieldId bigint,
	ngayBatDau timestamp null,
	ngayHetHan timestamp null,
	ngungApDung bool,
	tiLeGiaGia integer,
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
	tiLeGiamGia double precision,
	giaTriDonHang double precision,
	soLuongMua integer,
	soLuongTang integer,
	giaBan integer
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
	trangThai integer,
	diemTichLuy integer,
	maSoThue varchar(75) null,
	hoatDong bool,
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
	trangThai bool,
	itemType integer,
	choPhepNhapKho bool,
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
	trangThai bool,
	tileGiamGia integer,
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
	hoatDong bool
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
	hoatDong bool,
	doUuTien integer,
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
	trangThai bool,
	nghiThu7 bool,
	nghiChuNhat bool,
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
	createDate timestamp null,
	modifiedDate timestamp null,
	ten varchar(75) null,
	hoatDong bool,
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
	createDate timestamp null,
	modifiedDate timestamp null,
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
	createDate timestamp null,
	modifiedDate timestamp null,
	ten varchar(75) null,
	ghiChu varchar(75) null,
	hoatDong bool,
	uuTien integer,
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
	trangThai bool
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
	trangThai bool
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
	hoatDong bool
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
	khoa bool,
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
	createDate timestamp null,
	modifiedDate timestamp null,
	ten varchar(75) null,
	ma varchar(75) null,
	trangThai bool
);

create table minimart_trangthaidonhang (
	trangThaiDonHangId bigint not null primary key,
	companyId bigint,
	userId bigint,
	userName varchar(75) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	ten varchar(75) null,
	hoatDong bool,
	ghiChu varchar(75) null
);
