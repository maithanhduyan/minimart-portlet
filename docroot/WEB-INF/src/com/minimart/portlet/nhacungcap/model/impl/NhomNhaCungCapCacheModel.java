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

package com.minimart.portlet.nhacungcap.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.minimart.portlet.nhacungcap.model.NhomNhaCungCap;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NhomNhaCungCap in entity cache.
 *
 * @author Mai Thành Duy An
 * @see NhomNhaCungCap
 * @generated
 */
public class NhomNhaCungCapCacheModel implements CacheModel<NhomNhaCungCap>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{nhomNhaCungCapId=");
		sb.append(nhomNhaCungCapId);
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
		sb.append(", ghiChu=");
		sb.append(ghiChu);
		sb.append(", hoatDong=");
		sb.append(hoatDong);
		sb.append(", uuTien=");
		sb.append(uuTien);
		sb.append(", image=");
		sb.append(image);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NhomNhaCungCap toEntityModel() {
		NhomNhaCungCapImpl nhomNhaCungCapImpl = new NhomNhaCungCapImpl();

		nhomNhaCungCapImpl.setNhomNhaCungCapId(nhomNhaCungCapId);
		nhomNhaCungCapImpl.setCompanyId(companyId);
		nhomNhaCungCapImpl.setUserId(userId);

		if (userName == null) {
			nhomNhaCungCapImpl.setUserName(StringPool.BLANK);
		}
		else {
			nhomNhaCungCapImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			nhomNhaCungCapImpl.setCreateDate(null);
		}
		else {
			nhomNhaCungCapImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			nhomNhaCungCapImpl.setModifiedDate(null);
		}
		else {
			nhomNhaCungCapImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (ten == null) {
			nhomNhaCungCapImpl.setTen(StringPool.BLANK);
		}
		else {
			nhomNhaCungCapImpl.setTen(ten);
		}

		if (ghiChu == null) {
			nhomNhaCungCapImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			nhomNhaCungCapImpl.setGhiChu(ghiChu);
		}

		nhomNhaCungCapImpl.setHoatDong(hoatDong);
		nhomNhaCungCapImpl.setUuTien(uuTien);

		if (image == null) {
			nhomNhaCungCapImpl.setImage(StringPool.BLANK);
		}
		else {
			nhomNhaCungCapImpl.setImage(image);
		}

		nhomNhaCungCapImpl.resetOriginalValues();

		return nhomNhaCungCapImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		nhomNhaCungCapId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		ten = objectInput.readUTF();
		ghiChu = objectInput.readUTF();
		hoatDong = objectInput.readBoolean();
		uuTien = objectInput.readInt();
		image = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(nhomNhaCungCapId);
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

		if (ghiChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ghiChu);
		}

		objectOutput.writeBoolean(hoatDong);
		objectOutput.writeInt(uuTien);

		if (image == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(image);
		}
	}

	public long nhomNhaCungCapId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String ten;
	public String ghiChu;
	public boolean hoatDong;
	public int uuTien;
	public String image;
}