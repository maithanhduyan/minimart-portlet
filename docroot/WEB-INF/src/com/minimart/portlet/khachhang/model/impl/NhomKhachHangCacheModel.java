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

package com.minimart.portlet.khachhang.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.minimart.portlet.khachhang.model.NhomKhachHang;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NhomKhachHang in entity cache.
 *
 * @author Mai Thành Duy An
 * @see NhomKhachHang
 * @generated
 */
public class NhomKhachHangCacheModel implements CacheModel<NhomKhachHang>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{nhomKhachHangId=");
		sb.append(nhomKhachHangId);
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
		sb.append(", hoatDong=");
		sb.append(hoatDong);
		sb.append(", diemTichLuy=");
		sb.append(diemTichLuy);
		sb.append(", tiLeGiamGia=");
		sb.append(tiLeGiamGia);
		sb.append(", uuTien=");
		sb.append(uuTien);
		sb.append(", image=");
		sb.append(image);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NhomKhachHang toEntityModel() {
		NhomKhachHangImpl nhomKhachHangImpl = new NhomKhachHangImpl();

		nhomKhachHangImpl.setNhomKhachHangId(nhomKhachHangId);
		nhomKhachHangImpl.setCompanyId(companyId);
		nhomKhachHangImpl.setUserId(userId);

		if (userName == null) {
			nhomKhachHangImpl.setUserName(StringPool.BLANK);
		}
		else {
			nhomKhachHangImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			nhomKhachHangImpl.setCreateDate(null);
		}
		else {
			nhomKhachHangImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			nhomKhachHangImpl.setModifiedDate(null);
		}
		else {
			nhomKhachHangImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (ten == null) {
			nhomKhachHangImpl.setTen(StringPool.BLANK);
		}
		else {
			nhomKhachHangImpl.setTen(ten);
		}

		nhomKhachHangImpl.setHoatDong(hoatDong);
		nhomKhachHangImpl.setDiemTichLuy(diemTichLuy);
		nhomKhachHangImpl.setTiLeGiamGia(tiLeGiamGia);
		nhomKhachHangImpl.setUuTien(uuTien);

		if (image == null) {
			nhomKhachHangImpl.setImage(StringPool.BLANK);
		}
		else {
			nhomKhachHangImpl.setImage(image);
		}

		nhomKhachHangImpl.resetOriginalValues();

		return nhomKhachHangImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		nhomKhachHangId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		ten = objectInput.readUTF();
		hoatDong = objectInput.readBoolean();
		diemTichLuy = objectInput.readInt();
		tiLeGiamGia = objectInput.readInt();
		uuTien = objectInput.readInt();
		image = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(nhomKhachHangId);
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

		objectOutput.writeBoolean(hoatDong);
		objectOutput.writeInt(diemTichLuy);
		objectOutput.writeInt(tiLeGiamGia);
		objectOutput.writeInt(uuTien);

		if (image == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(image);
		}
	}

	public long nhomKhachHangId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String ten;
	public boolean hoatDong;
	public int diemTichLuy;
	public int tiLeGiamGia;
	public int uuTien;
	public String image;
}