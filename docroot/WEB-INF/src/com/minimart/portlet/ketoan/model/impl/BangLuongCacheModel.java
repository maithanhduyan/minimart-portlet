/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.minimart.portlet.ketoan.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.minimart.portlet.ketoan.model.BangLuong;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing BangLuong in entity cache.
 *
 * @author Mai Thành Duy An
 * @see BangLuong
 * @generated
 */
public class BangLuongCacheModel implements CacheModel<BangLuong>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{banLuongId=");
		sb.append(banLuongId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", ten=");
		sb.append(ten);
		sb.append(", trangThai=");
		sb.append(trangThai);
		sb.append(", thang=");
		sb.append(thang);
		sb.append(", nam=");
		sb.append(nam);
		sb.append(", ngay=");
		sb.append(ngay);
		sb.append(", chiTiet=");
		sb.append(chiTiet);
		sb.append(", ghiChu=");
		sb.append(ghiChu);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public BangLuong toEntityModel() {
		BangLuongImpl bangLuongImpl = new BangLuongImpl();

		bangLuongImpl.setBanLuongId(banLuongId);
		bangLuongImpl.setCompanyId(companyId);
		bangLuongImpl.setUserId(userId);

		if (userName == null) {
			bangLuongImpl.setUserName(StringPool.BLANK);
		}
		else {
			bangLuongImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			bangLuongImpl.setCreateDate(null);
		}
		else {
			bangLuongImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			bangLuongImpl.setModifiedDate(null);
		}
		else {
			bangLuongImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (ten == null) {
			bangLuongImpl.setTen(StringPool.BLANK);
		}
		else {
			bangLuongImpl.setTen(ten);
		}

		bangLuongImpl.setTrangThai(trangThai);
		bangLuongImpl.setThang(thang);
		bangLuongImpl.setNam(nam);

		if (ngay == Long.MIN_VALUE) {
			bangLuongImpl.setNgay(null);
		}
		else {
			bangLuongImpl.setNgay(new Date(ngay));
		}

		if (chiTiet == null) {
			bangLuongImpl.setChiTiet(StringPool.BLANK);
		}
		else {
			bangLuongImpl.setChiTiet(chiTiet);
		}

		if (ghiChu == null) {
			bangLuongImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			bangLuongImpl.setGhiChu(ghiChu);
		}

		bangLuongImpl.resetOriginalValues();

		return bangLuongImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		banLuongId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		ten = objectInput.readUTF();
		trangThai = objectInput.readBoolean();
		thang = objectInput.readInt();
		nam = objectInput.readInt();
		ngay = objectInput.readLong();
		chiTiet = objectInput.readUTF();
		ghiChu = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(banLuongId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (ten == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ten);
		}

		objectOutput.writeBoolean(trangThai);
		objectOutput.writeInt(thang);
		objectOutput.writeInt(nam);
		objectOutput.writeLong(ngay);

		if (chiTiet == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(chiTiet);
		}

		if (ghiChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ghiChu);
		}
	}

	public long banLuongId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String ten;
	public boolean trangThai;
	public int thang;
	public int nam;
	public long ngay;
	public String chiTiet;
	public String ghiChu;
}