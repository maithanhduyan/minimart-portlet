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
