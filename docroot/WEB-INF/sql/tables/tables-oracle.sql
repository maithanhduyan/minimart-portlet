create table minimart_donvitinh (
	donViTinhId number(30,0) not null primary key,
	groupId number(30,0),
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	name VARCHAR2(75 CHAR) null,
	status number(30,0),
	note VARCHAR2(75 CHAR) null
);

create table minimart_mathang (
	uuid_ VARCHAR2(75 CHAR) null,
	matHangId number(30,0) not null primary key,
	groupId number(30,0),
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	name VARCHAR2(75 CHAR) null,
	code_ VARCHAR2(75 CHAR) null,
	giaNhap number(30,0),
	status number(30,0),
	giaBan number(30,0),
	giaBan1 number(30,0),
	giaBan2 number(30,0),
	giaBan3 number(30,0),
	tonToiThieu number(30,0),
	tonToiDa number(30,0),
	giaVon number(30,0),
	hoaHong number(30,0),
	nhomMatHangId number(30,0),
	donViTinhId number(30,0),
	size_ VARCHAR2(75 CHAR) null,
	imageUrl VARCHAR2(75 CHAR) null,
	hoatDong number(1, 0)
);

create table minimart_nhommathang (
	nhomMatHangId number(30,0) not null primary key,
	groupId number(30,0),
	companyId number(30,0),
	userId number(30,0),
	userName VARCHAR2(75 CHAR) null,
	createDate timestamp null,
	modifiedDate timestamp null,
	name VARCHAR2(75 CHAR) null,
	code_ VARCHAR2(75 CHAR) null,
	status number(30,0),
	note VARCHAR2(75 CHAR) null
);
