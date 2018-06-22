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

package com.minimart.portlet.danhmucchung.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.minimart.portlet.danhmucchung.model.TinhThanhPho;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TinhThanhPho in entity cache.
 *
 * @author Mai Thành Duy An
 * @see TinhThanhPho
 * @generated
 */
public class TinhThanhPhoCacheModel implements CacheModel<TinhThanhPho>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{tinhThanhPhoId=");
		sb.append(tinhThanhPhoId);
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
		sb.append(", ma=");
		sb.append(ma);
		sb.append(", trangThai=");
		sb.append(trangThai);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TinhThanhPho toEntityModel() {
		TinhThanhPhoImpl tinhThanhPhoImpl = new TinhThanhPhoImpl();

		tinhThanhPhoImpl.setTinhThanhPhoId(tinhThanhPhoId);
		tinhThanhPhoImpl.setCompanyId(companyId);
		tinhThanhPhoImpl.setUserId(userId);

		if (userName == null) {
			tinhThanhPhoImpl.setUserName(StringPool.BLANK);
		}
		else {
			tinhThanhPhoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tinhThanhPhoImpl.setCreateDate(null);
		}
		else {
			tinhThanhPhoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tinhThanhPhoImpl.setModifiedDate(null);
		}
		else {
			tinhThanhPhoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (ten == null) {
			tinhThanhPhoImpl.setTen(StringPool.BLANK);
		}
		else {
			tinhThanhPhoImpl.setTen(ten);
		}

		if (ma == null) {
			tinhThanhPhoImpl.setMa(StringPool.BLANK);
		}
		else {
			tinhThanhPhoImpl.setMa(ma);
		}

		tinhThanhPhoImpl.setTrangThai(trangThai);

		tinhThanhPhoImpl.resetOriginalValues();

		return tinhThanhPhoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tinhThanhPhoId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		ten = objectInput.readUTF();
		ma = objectInput.readUTF();
		trangThai = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(tinhThanhPhoId);
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

		if (ma == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ma);
		}

		objectOutput.writeBoolean(trangThai);
	}

	public long tinhThanhPhoId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String ten;
	public String ma;
	public boolean trangThai;
}