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

package com.minimart.portlet.thethanhtoan.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.minimart.portlet.thethanhtoan.model.TheTraTruoc;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TheTraTruoc in entity cache.
 *
 * @author Mai Thành Duy An
 * @see TheTraTruoc
 * @generated
 */
public class TheTraTruocCacheModel implements CacheModel<TheTraTruoc>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{theTraTruocId=");
		sb.append(theTraTruocId);
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
		sb.append(", tenThe=");
		sb.append(tenThe);
		sb.append(", nhomTheTraTruocId=");
		sb.append(nhomTheTraTruocId);
		sb.append(", khoa=");
		sb.append(khoa);
		sb.append(", ngayHetHan=");
		sb.append(ngayHetHan);
		sb.append(", trangThai=");
		sb.append(trangThai);
		sb.append(", userModifiledId=");
		sb.append(userModifiledId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TheTraTruoc toEntityModel() {
		TheTraTruocImpl theTraTruocImpl = new TheTraTruocImpl();

		theTraTruocImpl.setTheTraTruocId(theTraTruocId);
		theTraTruocImpl.setCompanyId(companyId);
		theTraTruocImpl.setUserId(userId);

		if (userName == null) {
			theTraTruocImpl.setUserName(StringPool.BLANK);
		}
		else {
			theTraTruocImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			theTraTruocImpl.setCreateDate(null);
		}
		else {
			theTraTruocImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			theTraTruocImpl.setModifiedDate(null);
		}
		else {
			theTraTruocImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (tenThe == null) {
			theTraTruocImpl.setTenThe(StringPool.BLANK);
		}
		else {
			theTraTruocImpl.setTenThe(tenThe);
		}

		theTraTruocImpl.setNhomTheTraTruocId(nhomTheTraTruocId);
		theTraTruocImpl.setKhoa(khoa);

		if (ngayHetHan == Long.MIN_VALUE) {
			theTraTruocImpl.setNgayHetHan(null);
		}
		else {
			theTraTruocImpl.setNgayHetHan(new Date(ngayHetHan));
		}

		if (trangThai == null) {
			theTraTruocImpl.setTrangThai(StringPool.BLANK);
		}
		else {
			theTraTruocImpl.setTrangThai(trangThai);
		}

		theTraTruocImpl.setUserModifiledId(userModifiledId);

		theTraTruocImpl.resetOriginalValues();

		return theTraTruocImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		theTraTruocId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		tenThe = objectInput.readUTF();
		nhomTheTraTruocId = objectInput.readLong();
		khoa = objectInput.readBoolean();
		ngayHetHan = objectInput.readLong();
		trangThai = objectInput.readUTF();
		userModifiledId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(theTraTruocId);
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

		if (tenThe == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenThe);
		}

		objectOutput.writeLong(nhomTheTraTruocId);
		objectOutput.writeBoolean(khoa);
		objectOutput.writeLong(ngayHetHan);

		if (trangThai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(trangThai);
		}

		objectOutput.writeLong(userModifiledId);
	}

	public long theTraTruocId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String tenThe;
	public long nhomTheTraTruocId;
	public boolean khoa;
	public long ngayHetHan;
	public String trangThai;
	public long userModifiledId;
}