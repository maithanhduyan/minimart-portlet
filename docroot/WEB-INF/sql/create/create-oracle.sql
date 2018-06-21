drop user &1 cascade;
create user &1 identified by &2;
grant connect,resource to &1;
connect &1/&2;
set define off;

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


create index IX_AE896918 on minimart_donvitinh (name);

create unique index IX_F067BB0E on minimart_mathang (code_, hoatDong);
create index IX_4E970648 on minimart_mathang (companyId, status);
create index IX_F0161F9C on minimart_mathang (companyId, userId);
create index IX_21D92E45 on minimart_mathang (name);
create index IX_AD811BEE on minimart_mathang (uuid_);
create index IX_48F1C77A on minimart_mathang (uuid_, companyId);
create unique index IX_7159E47C on minimart_mathang (uuid_, groupId);

create index IX_5F2A5F2D on minimart_nhommathang (name);



quit