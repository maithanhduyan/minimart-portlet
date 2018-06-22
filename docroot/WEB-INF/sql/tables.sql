create table minimart_Duong (
	duongId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	ten VARCHAR(75) null,
	ma VARCHAR(75) null,
	trangThai BOOLEAN
);

create table minimart_bangluong (
	banLuongId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	ten VARCHAR(75) null,
	trangThai BOOLEAN,
	thang INTEGER,
	nam INTEGER,
	ngay DATE null,
	chiTiet VARCHAR(75) null,
	ghiChu VARCHAR(75) null
);

create table minimart_calamviec (
	caLamViecId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	ten VARCHAR(75) null,
	cuaHangId LONG,
	gioVaoLam DATE null,
	gioRaVe DATE null,
	gioNghiGiuaCaTu DATE null,
	gioNghiGiuaCaDen DATE null,
	tiLeLuong INTEGER,
	hoatDong BOOLEAN
);

create table minimart_cuahang (
	uuid_ VARCHAR(75) null,
	cuaHangId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	ten VARCHAR(75) null,
	gioMoCua DATE null,
	gioDongCua DATE null,
	hoatDong BOOLEAN,
	uuTien INTEGER,
	diaChi VARCHAR(75) null,
	dienThoai VARCHAR(75) null,
	khoHangId LONG
);

create table minimart_dathang (
	datHangId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	ten VARCHAR(75) null,
	khachHangId LONG,
	diaChiId LONG,
	tienHang INTEGER,
	tiLeThue DOUBLE,
	tiLeGiamGia DOUBLE,
	tienGiamGia INTEGER,
	phiVanChuyen INTEGER,
	tongCong INTEGER,
	loai INTEGER,
	giamTheoTien INTEGER,
	trangThai BOOLEAN,
	userModifiedId LONG,
	timeModified DATE null,
	userCreateId LONG,
	loaiGia INTEGER,
	hoatDong BOOLEAN
);

create table minimart_dathangchitiet (
	datHangChiTietId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	soLuong INTEGER,
	donGia INTEGER,
	thanhTien INTEGER,
	tiLeGiamGia DOUBLE,
	ghiChu VARCHAR(75) null,
	trangThai BOOLEAN,
	baoHanh VARCHAR(75) null,
	donViTinhId LONG,
	datHangId LONG,
	maHangId LONG
);

create table minimart_donhang (
	donHangId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	cuaHangId LONG,
	khachHangId LONG,
	hoatDong BOOLEAN,
	tongCong INTEGER,
	daThanhToan BOOLEAN,
	phiVanChuyen INTEGER,
	trangThaiDonHangId LONG,
	ngayThanhToan DATE null,
	khachDua INTEGER,
	traLai INTEGER,
	thueVAT INTEGER,
	diemTichLuy INTEGER,
	thanhToanTienMat INTEGER,
	thanhToanThe INTEGER,
	thanhToanChuyenKhoan INTEGER,
	phieuGiamGiaId LONG,
	truTichLuy INTEGER,
	inHoaDonLan INTEGER,
	maDonHang VARCHAR(75) null
);

create table minimart_donhangchitiet (
	donHangChiTietId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	donHangId LONG,
	matHangId LONG,
	soLuong INTEGER,
	donViTinhId LONG,
	thanhTien INTEGER,
	tiLeGiamGia INTEGER,
	kichThuoc VARCHAR(75) null,
	hanSuDung DATE null,
	hoatDong BOOLEAN,
	huy BOOLEAN
);

create table minimart_donvitinh (
	donViTinhId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	status INTEGER,
	note VARCHAR(75) null
);

create table minimart_dotkhuyenmai (
	dotKhuyenMaiId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	ten VARCHAR(75) null,
	trangThai BOOLEAN,
	userModifieldId LONG,
	ngayBatDau DATE null,
	ngayHetHan DATE null,
	ngungApDung BOOLEAN,
	tiLeGiaGia INTEGER,
	ghiChu VARCHAR(75) null
);

create table minimart_dotkhuyenmaichitiet (
	dotKhuyenMaiChiTietId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	dotKhuyenMaiId LONG,
	nhomMatHangId LONG,
	matHangId LONG,
	matHangTangId LONG,
	tiLeGiamGia DOUBLE,
	giaTriDonHang DOUBLE,
	soLuongMua INTEGER,
	soLuongTang INTEGER,
	giaBan INTEGER
);

create table minimart_khachhang (
	khachHangId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	ten VARCHAR(75) null,
	nhomKhachHangId LONG,
	ma VARCHAR(75) null,
	diaChi VARCHAR(75) null,
	dienThoai VARCHAR(75) null,
	email VARCHAR(75) null,
	facebook VARCHAR(75) null,
	twitter VARCHAR(75) null,
	socialMedia1 VARCHAR(75) null,
	socialMedia2 VARCHAR(75) null,
	socialMedia3 VARCHAR(75) null,
	trangThai INTEGER,
	diemTichLuy INTEGER,
	maSoThue VARCHAR(75) null,
	hoatDong BOOLEAN,
	ngaySinh DATE null
);

create table minimart_khohang (
	khoHangId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	ten VARCHAR(75) null,
	trangThai BOOLEAN,
	itemType INTEGER,
	choPhepNhapKho BOOLEAN,
	cuaHangId LONG,
	autoId LONG,
	sigmaId LONG,
	ghiChu VARCHAR(75) null
);

create table minimart_loaihinhkhuyenmai (
	loaiHinhKhuyenMaiId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	ten VARCHAR(75) null,
	trangThai BOOLEAN,
	tileGiamGia INTEGER,
	ngayBatDau DATE null,
	ngayHetHan DATE null,
	imageid VARCHAR(75) null,
	ghiChu VARCHAR(75) null
);

create table minimart_mathang (
	uuid_ VARCHAR(75) null,
	matHangId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	code_ VARCHAR(75) null,
	giaNhap INTEGER,
	status INTEGER,
	giaBan INTEGER,
	giaBan1 INTEGER,
	giaBan2 INTEGER,
	giaBan3 INTEGER,
	tonToiThieu INTEGER,
	tonToiDa INTEGER,
	giaVon INTEGER,
	hoaHong INTEGER,
	nhomMatHangId LONG,
	donViTinhId LONG,
	size_ VARCHAR(75) null,
	imageUrl VARCHAR(75) null,
	hoatDong BOOLEAN
);

create table minimart_nhacungcap (
	nhaCungCapId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	tenNhaCungCap VARCHAR(75) null,
	nhomNhaCungCapId LONG,
	maNhaCungCap VARCHAR(75) null,
	diaChi VARCHAR(75) null,
	dienThoai VARCHAR(75) null,
	email VARCHAR(75) null,
	website VARCHAR(75) null,
	ghiChu VARCHAR(75) null,
	hoatDong BOOLEAN,
	doUuTien INTEGER,
	logoURL VARCHAR(75) null
);

create table minimart_nhanvien (
	uuid_ VARCHAR(75) null,
	nhanVienId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	ten VARCHAR(75) null,
	ho VARCHAR(75) null,
	trangThai BOOLEAN,
	nghiThu7 BOOLEAN,
	nghiChuNhat BOOLEAN,
	cachTinhLuong INTEGER,
	luongCa INTEGER,
	luongThang INTEGER,
	image VARCHAR(75) null,
	diaChiId LONG
);

create table minimart_nhomkhachhang (
	nhomKhachHangId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	ten VARCHAR(75) null,
	hoatDong BOOLEAN,
	diemTichLuy INTEGER,
	tiLeGiamGia INTEGER,
	uuTien INTEGER,
	image VARCHAR(75) null
);

create table minimart_nhommathang (
	nhomMatHangId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	code_ VARCHAR(75) null,
	status INTEGER,
	note VARCHAR(75) null
);

create table minimart_nhomnhacungcap (
	nhomNhaCungCapId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	ten VARCHAR(75) null,
	ghiChu VARCHAR(75) null,
	hoatDong BOOLEAN,
	uuTien INTEGER,
	image VARCHAR(75) null
);

create table minimart_phuongxa (
	phuongXaId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	ten VARCHAR(75) null,
	ma VARCHAR(75) null,
	trangThai BOOLEAN
);

create table minimart_quanhuyen (
	quanHuyenId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	ten VARCHAR(75) null,
	ma VARCHAR(75) null,
	trangThai BOOLEAN
);

create table minimart_tangca (
	tangCaId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	ten VARCHAR(75) null,
	cuaHangId LONG,
	caLamViecId LONG,
	nhanVienId LONG,
	tangCaTu DATE null,
	tangCaDen DATE null,
	hoatDong BOOLEAN
);

create table minimart_thetratruoc (
	theTraTruocId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	tenThe VARCHAR(75) null,
	nhomTheTraTruocId LONG,
	khoa BOOLEAN,
	ngayHetHan DATE null,
	trangThai VARCHAR(75) null,
	userModifiledId LONG
);

create table minimart_thuchi (
	thuChiId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	ten VARCHAR(75) null,
	tenDoiTuong VARCHAR(75) null,
	diaChiId LONG,
	loai INTEGER,
	loaiDoiTuong INTEGER,
	thu INTEGER,
	chi INTEGER,
	nhaCungCapId LONG,
	khachHangId LONG,
	nhanVienId LONG,
	theTraTruocId LONG,
	taiKhoanNganHangId LONG,
	datHangId LONG,
	bangLuongId LONG,
	lyDoThuChi VARCHAR(75) null
);

create table minimart_tinhthanhpho (
	tinhThanhPhoId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	ten VARCHAR(75) null,
	ma VARCHAR(75) null,
	trangThai BOOLEAN
);

create table minimart_trangthaidonhang (
	trangThaiDonHangId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	ten VARCHAR(75) null,
	hoatDong BOOLEAN,
	ghiChu VARCHAR(75) null
);