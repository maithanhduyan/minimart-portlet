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

import com.minimart.portlet.danhmucchung.model.PhuongXa;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PhuongXa in entity cache.
 *
 * @author Mai Thành Duy An
 * @see PhuongXa
 * @generated
 */
public class PhuongXaCacheModel implements CacheModel<PhuongXa>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{phuongXaId=");
		sb.append(phuongXaId);
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
	public PhuongXa toEntityModel() {
		PhuongXaImpl phuongXaImpl = new PhuongXaImpl();

		phuongXaImpl.setPhuongXaId(phuongXaId);
		phuongXaImpl.setCompanyId(companyId);
		phuongXaImpl.setUserId(userId);

		if (userName == null) {
			phuongXaImpl.setUserName(StringPool.BLANK);
		}
		else {
			phuongXaImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			phuongXaImpl.setCreateDate(null);
		}
		else {
			phuongXaImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			phuongXaImpl.setModifiedDate(null);
		}
		else {
			phuongXaImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (ten == null) {
			phuongXaImpl.setTen(StringPool.BLANK);
		}
		else {
			phuongXaImpl.setTen(ten);
		}

		if (ma == null) {
			phuongXaImpl.setMa(StringPool.BLANK);
		}
		else {
			phuongXaImpl.setMa(ma);
		}

		phuongXaImpl.setTrangThai(trangThai);

		phuongXaImpl.resetOriginalValues();

		return phuongXaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		phuongXaId = objectInput.readLong();
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
		objectOutput.writeLong(phuongXaId);
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

	public long phuongXaId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String ten;
	public String ma;
	public boolean trangThai;
}