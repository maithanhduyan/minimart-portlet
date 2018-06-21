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