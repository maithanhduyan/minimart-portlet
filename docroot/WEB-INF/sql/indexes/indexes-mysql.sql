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
