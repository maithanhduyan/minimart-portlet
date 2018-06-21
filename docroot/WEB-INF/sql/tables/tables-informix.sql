create table minimart_donvitinh (
	donViTinhId int8 not null primary key,
	groupId int8,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	name varchar(75),
	status int,
	note varchar(75)
)
extent size 16 next size 16
lock mode row;

create table minimart_mathang (
	uuid_ varchar(75),
	matHangId int8 not null primary key,
	groupId int8,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	name varchar(75),
	code_ varchar(75),
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
	nhomMatHangId int8,
	donViTinhId int8,
	size_ varchar(75),
	imageUrl varchar(75),
	hoatDong boolean
)
extent size 16 next size 16
lock mode row;

create table minimart_nhommathang (
	nhomMatHangId int8 not null primary key,
	groupId int8,
	companyId int8,
	userId int8,
	userName varchar(75),
	createDate datetime YEAR TO FRACTION,
	modifiedDate datetime YEAR TO FRACTION,
	name varchar(75),
	code_ varchar(75),
	status int,
	note varchar(75)
)
extent size 16 next size 16
lock mode row;
