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

import com.minimart.portlet.cuahang.model.TangCa;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TangCa in entity cache.
 *
 * @author Mai Thành Duy An
 * @see TangCa
 * @generated
 */
public class TangCaCacheModel implements CacheModel<TangCa>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{tangCaId=");
		sb.append(tangCaId);
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
		sb.append(", caLamViecId=");
		sb.append(caLamViecId);
		sb.append(", nhanVienId=");
		sb.append(nhanVienId);
		sb.append(", tangCaTu=");
		sb.append(tangCaTu);
		sb.append(", tangCaDen=");
		sb.append(tangCaDen);
		sb.append(", hoatDong=");
		sb.append(hoatDong);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TangCa toEntityModel() {
		TangCaImpl tangCaImpl = new TangCaImpl();

		tangCaImpl.setTangCaId(tangCaId);
		tangCaImpl.setCompanyId(companyId);
		tangCaImpl.setUserId(userId);

		if (userName == null) {
			tangCaImpl.setUserName(StringPool.BLANK);
		}
		else {
			tangCaImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tangCaImpl.setCreateDate(null);
		}
		else {
			tangCaImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tangCaImpl.setModifiedDate(null);
		}
		else {
			tangCaImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (ten == null) {
			tangCaImpl.setTen(StringPool.BLANK);
		}
		else {
			tangCaImpl.setTen(ten);
		}

		tangCaImpl.setCuaHangId(cuaHangId);
		tangCaImpl.setCaLamViecId(caLamViecId);
		tangCaImpl.setNhanVienId(nhanVienId);

		if (tangCaTu == Long.MIN_VALUE) {
			tangCaImpl.setTangCaTu(null);
		}
		else {
			tangCaImpl.setTangCaTu(new Date(tangCaTu));
		}

		if (tangCaDen == Long.MIN_VALUE) {
			tangCaImpl.setTangCaDen(null);
		}
		else {
			tangCaImpl.setTangCaDen(new Date(tangCaDen));
		}

		tangCaImpl.setHoatDong(hoatDong);

		tangCaImpl.resetOriginalValues();

		return tangCaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tangCaId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		ten = objectInput.readUTF();
		cuaHangId = objectInput.readLong();
		caLamViecId = objectInput.readLong();
		nhanVienId = objectInput.readLong();
		tangCaTu = objectInput.readLong();
		tangCaDen = objectInput.readLong();
		hoatDong = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(tangCaId);
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
		objectOutput.writeLong(caLamViecId);
		objectOutput.writeLong(nhanVienId);
		objectOutput.writeLong(tangCaTu);
		objectOutput.writeLong(tangCaDen);
		objectOutput.writeBoolean(hoatDong);
	}

	public long tangCaId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String ten;
	public long cuaHangId;
	public long caLamViecId;
	public long nhanVienId;
	public long tangCaTu;
	public long tangCaDen;
	public boolean hoatDong;
}