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

import com.minimart.portlet.cuahang.model.CaLamViec;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CaLamViec in entity cache.
 *
 * @author Mai Thành Duy An
 * @see CaLamViec
 * @generated
 */
public class CaLamViecCacheModel implements CacheModel<CaLamViec>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{caLamViecId=");
		sb.append(caLamViecId);
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
		sb.append(", cuaHangId=");
		sb.append(cuaHangId);
		sb.append(", gioVaoLam=");
		sb.append(gioVaoLam);
		sb.append(", gioRaVe=");
		sb.append(gioRaVe);
		sb.append(", gioNghiGiuaCaTu=");
		sb.append(gioNghiGiuaCaTu);
		sb.append(", gioNghiGiuaCaDen=");
		sb.append(gioNghiGiuaCaDen);
		sb.append(", tiLeLuong=");
		sb.append(tiLeLuong);
		sb.append(", hoatDong=");
		sb.append(hoatDong);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CaLamViec toEntityModel() {
		CaLamViecImpl caLamViecImpl = new CaLamViecImpl();

		caLamViecImpl.setCaLamViecId(caLamViecId);
		caLamViecImpl.setCompanyId(companyId);
		caLamViecImpl.setUserId(userId);

		if (userName == null) {
			caLamViecImpl.setUserName(StringPool.BLANK);
		}
		else {
			caLamViecImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			caLamViecImpl.setCreateDate(null);
		}
		else {
			caLamViecImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			caLamViecImpl.setModifiedDate(null);
		}
		else {
			caLamViecImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (ten == null) {
			caLamViecImpl.setTen(StringPool.BLANK);
		}
		else {
			caLamViecImpl.setTen(ten);
		}

		caLamViecImpl.setCuaHangId(cuaHangId);

		if (gioVaoLam == Long.MIN_VALUE) {
			caLamViecImpl.setGioVaoLam(null);
		}
		else {
			caLamViecImpl.setGioVaoLam(new Date(gioVaoLam));
		}

		if (gioRaVe == Long.MIN_VALUE) {
			caLamViecImpl.setGioRaVe(null);
		}
		else {
			caLamViecImpl.setGioRaVe(new Date(gioRaVe));
		}

		if (gioNghiGiuaCaTu == Long.MIN_VALUE) {
			caLamViecImpl.setGioNghiGiuaCaTu(null);
		}
		else {
			caLamViecImpl.setGioNghiGiuaCaTu(new Date(gioNghiGiuaCaTu));
		}

		if (gioNghiGiuaCaDen == Long.MIN_VALUE) {
			caLamViecImpl.setGioNghiGiuaCaDen(null);
		}
		else {
			caLamViecImpl.setGioNghiGiuaCaDen(new Date(gioNghiGiuaCaDen));
		}

		caLamViecImpl.setTiLeLuong(tiLeLuong);
		caLamViecImpl.setHoatDong(hoatDong);

		caLamViecImpl.resetOriginalValues();

		return caLamViecImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		caLamViecId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		ten = objectInput.readUTF();
		cuaHangId = objectInput.readLong();
		gioVaoLam = objectInput.readLong();
		gioRaVe = objectInput.readLong();
		gioNghiGiuaCaTu = objectInput.readLong();
		gioNghiGiuaCaDen = objectInput.readLong();
		tiLeLuong = objectInput.readInt();
		hoatDong = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(caLamViecId);
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

		objectOutput.writeLong(cuaHangId);
		objectOutput.writeLong(gioVaoLam);
		objectOutput.writeLong(gioRaVe);
		objectOutput.writeLong(gioNghiGiuaCaTu);
		objectOutput.writeLong(gioNghiGiuaCaDen);
		objectOutput.writeInt(tiLeLuong);
		objectOutput.writeBoolean(hoatDong);
	}

	public long caLamViecId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String ten;
	public long cuaHangId;
	public long gioVaoLam;
	public long gioRaVe;
	public long gioNghiGiuaCaTu;
	public long gioNghiGiuaCaDen;
	public int tiLeLuong;
	public boolean hoatDong;
}