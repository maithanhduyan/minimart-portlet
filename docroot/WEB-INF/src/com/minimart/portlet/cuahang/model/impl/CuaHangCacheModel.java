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

package com.minimart.portlet.cuahang.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.minimart.portlet.cuahang.model.CuaHang;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CuaHang in entity cache.
 *
 * @author Mai Thành Duy An
 * @see CuaHang
 * @generated
 */
public class CuaHangCacheModel implements CacheModel<CuaHang>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", cuaHangId=");
		sb.append(cuaHangId);
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
		sb.append(", gioMoCua=");
		sb.append(gioMoCua);
		sb.append(", gioDongCua=");
		sb.append(gioDongCua);
		sb.append(", hoatDong=");
		sb.append(hoatDong);
		sb.append(", uuTien=");
		sb.append(uuTien);
		sb.append(", diaChi=");
		sb.append(diaChi);
		sb.append(", dienThoai=");
		sb.append(dienThoai);
		sb.append(", khoHangId=");
		sb.append(khoHangId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CuaHang toEntityModel() {
		CuaHangImpl cuaHangImpl = new CuaHangImpl();

		if (uuid == null) {
			cuaHangImpl.setUuid(StringPool.BLANK);
		}
		else {
			cuaHangImpl.setUuid(uuid);
		}

		cuaHangImpl.setCuaHangId(cuaHangId);
		cuaHangImpl.setCompanyId(companyId);
		cuaHangImpl.setUserId(userId);

		if (userName == null) {
			cuaHangImpl.setUserName(StringPool.BLANK);
		}
		else {
			cuaHangImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			cuaHangImpl.setCreateDate(null);
		}
		else {
			cuaHangImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			cuaHangImpl.setModifiedDate(null);
		}
		else {
			cuaHangImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (ten == null) {
			cuaHangImpl.setTen(StringPool.BLANK);
		}
		else {
			cuaHangImpl.setTen(ten);
		}

		if (gioMoCua == Long.MIN_VALUE) {
			cuaHangImpl.setGioMoCua(null);
		}
		else {
			cuaHangImpl.setGioMoCua(new Date(gioMoCua));
		}

		if (gioDongCua == Long.MIN_VALUE) {
			cuaHangImpl.setGioDongCua(null);
		}
		else {
			cuaHangImpl.setGioDongCua(new Date(gioDongCua));
		}

		cuaHangImpl.setHoatDong(hoatDong);
		cuaHangImpl.setUuTien(uuTien);

		if (diaChi == null) {
			cuaHangImpl.setDiaChi(StringPool.BLANK);
		}
		else {
			cuaHangImpl.setDiaChi(diaChi);
		}

		if (dienThoai == null) {
			cuaHangImpl.setDienThoai(StringPool.BLANK);
		}
		else {
			cuaHangImpl.setDienThoai(dienThoai);
		}

		cuaHangImpl.setKhoHangId(khoHangId);

		cuaHangImpl.resetOriginalValues();

		return cuaHangImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		cuaHangId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		ten = objectInput.readUTF();
		gioMoCua = objectInput.readLong();
		gioDongCua = objectInput.readLong();
		hoatDong = objectInput.readBoolean();
		uuTien = objectInput.readInt();
		diaChi = objectInput.readUTF();
		dienThoai = objectInput.readUTF();
		khoHangId = objectInput.readLong();
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

		objectOutput.writeLong(cuaHangId);
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

		objectOutput.writeLong(gioMoCua);
		objectOutput.writeLong(gioDongCua);
		objectOutput.writeBoolean(hoatDong);
		objectOutput.writeInt(uuTien);

		if (diaChi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(diaChi);
		}

		if (dienThoai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dienThoai);
		}

		objectOutput.writeLong(khoHangId);
	}

	public String uuid;
	public long cuaHangId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String ten;
	public long gioMoCua;
	public long gioDongCua;
	public boolean hoatDong;
	public int uuTien;
	public String diaChi;
	public String dienThoai;
	public long khoHangId;
}