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
