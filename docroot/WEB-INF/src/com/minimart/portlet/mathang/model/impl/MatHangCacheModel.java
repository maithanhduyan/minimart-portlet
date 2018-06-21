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

package com.minimart.portlet.mathang.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.minimart.portlet.mathang.model.MatHang;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MatHang in entity cache.
 *
 * @author Mai Thành Duy An
 * @see MatHang
 * @generated
 */
public class MatHangCacheModel implements CacheModel<MatHang>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(51);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", matHangId=");
		sb.append(matHangId);
		sb.append(", groupId=");
		sb.append(groupId);
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
		sb.append(", name=");
		sb.append(name);
		sb.append(", code=");
		sb.append(code);
		sb.append(", giaNhap=");
		sb.append(giaNhap);
		sb.append(", status=");
		sb.append(status);
		sb.append(", giaBan=");
		sb.append(giaBan);
		sb.append(", giaBan1=");
		sb.append(giaBan1);
		sb.append(", giaBan2=");
		sb.append(giaBan2);
		sb.append(", giaBan3=");
		sb.append(giaBan3);
		sb.append(", tonToiThieu=");
		sb.append(tonToiThieu);
		sb.append(", tonToiDa=");
		sb.append(tonToiDa);
		sb.append(", giaVon=");
		sb.append(giaVon);
		sb.append(", hoaHong=");
		sb.append(hoaHong);
		sb.append(", nhomMatHangId=");
		sb.append(nhomMatHangId);
		sb.append(", donViTinhId=");
		sb.append(donViTinhId);
		sb.append(", size=");
		sb.append(size);
		sb.append(", imageUrl=");
		sb.append(imageUrl);
		sb.append(", hoatDong=");
		sb.append(hoatDong);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MatHang toEntityModel() {
		MatHangImpl matHangImpl = new MatHangImpl();

		if (uuid == null) {
			matHangImpl.setUuid(StringPool.BLANK);
		}
		else {
			matHangImpl.setUuid(uuid);
		}

		matHangImpl.setMatHangId(matHangId);
		matHangImpl.setGroupId(groupId);
		matHangImpl.setCompanyId(companyId);
		matHangImpl.setUserId(userId);

		if (userName == null) {
			matHangImpl.setUserName(StringPool.BLANK);
		}
		else {
			matHangImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			matHangImpl.setCreateDate(null);
		}
		else {
			matHangImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			matHangImpl.setModifiedDate(null);
		}
		else {
			matHangImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			matHangImpl.setName(StringPool.BLANK);
		}
		else {
			matHangImpl.setName(name);
		}

		if (code == null) {
			matHangImpl.setCode(StringPool.BLANK);
		}
		else {
			matHangImpl.setCode(code);
		}

		matHangImpl.setGiaNhap(giaNhap);
		matHangImpl.setStatus(status);
		matHangImpl.setGiaBan(giaBan);
		matHangImpl.setGiaBan1(giaBan1);
		matHangImpl.setGiaBan2(giaBan2);
		matHangImpl.setGiaBan3(giaBan3);
		matHangImpl.setTonToiThieu(tonToiThieu);
		matHangImpl.setTonToiDa(tonToiDa);
		matHangImpl.setGiaVon(giaVon);
		matHangImpl.setHoaHong(hoaHong);
		matHangImpl.setNhomMatHangId(nhomMatHangId);
		matHangImpl.setDonViTinhId(donViTinhId);

		if (size == null) {
			matHangImpl.setSize(StringPool.BLANK);
		}
		else {
			matHangImpl.setSize(size);
		}

		if (imageUrl == null) {
			matHangImpl.setImageUrl(StringPool.BLANK);
		}
		else {
			matHangImpl.setImageUrl(imageUrl);
		}

		matHangImpl.setHoatDong(hoatDong);

		matHangImpl.resetOriginalValues();

		return matHangImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		matHangId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		code = objectInput.readUTF();
		giaNhap = objectInput.readInt();
		status = objectInput.readInt();
		giaBan = objectInput.readInt();
		giaBan1 = objectInput.readInt();
		giaBan2 = objectInput.readInt();
		giaBan3 = objectInput.readInt();
		tonToiThieu = objectInput.readInt();
		tonToiDa = objectInput.readInt();
		giaVon = objectInput.readInt();
		hoaHong = objectInput.readInt();
		nhomMatHangId = objectInput.readLong();
		donViTinhId = objectInput.readLong();
		size = objectInput.readUTF();
		imageUrl = objectInput.readUTF();
		hoatDong = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(matHangId);
		objectOutput.writeLong(groupId);
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

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(code);
		}

		objectOutput.writeInt(giaNhap);
		objectOutput.writeInt(status);
		objectOutput.writeInt(giaBan);
		objectOutput.writeInt(giaBan1);
		objectOutput.writeInt(giaBan2);
		objectOutput.writeInt(giaBan3);
		objectOutput.writeInt(tonToiThieu);
		objectOutput.writeInt(tonToiDa);
		objectOutput.writeInt(giaVon);
		objectOutput.writeInt(hoaHong);
		objectOutput.writeLong(nhomMatHangId);
		objectOutput.writeLong(donViTinhId);

		if (size == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(size);
		}

		if (imageUrl == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(imageUrl);
		}

		objectOutput.writeBoolean(hoatDong);
	}

	public String uuid;
	public long matHangId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String code;
	public int giaNhap;
	public int status;
	public int giaBan;
	public int giaBan1;
	public int giaBan2;
	public int giaBan3;
	public int tonToiThieu;
	public int tonToiDa;
	public int giaVon;
	public int hoaHong;
	public long nhomMatHangId;
	public long donViTinhId;
	public String size;
	public String imageUrl;
	public boolean hoatDong;
}