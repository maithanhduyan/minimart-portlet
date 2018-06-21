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

import com.minimart.portlet.mathang.model.DonViTinh;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DonViTinh in entity cache.
 *
 * @author Mai Thành Duy An
 * @see DonViTinh
 * @generated
 */
public class DonViTinhCacheModel implements CacheModel<DonViTinh>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{donViTinhId=");
		sb.append(donViTinhId);
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
		sb.append(", status=");
		sb.append(status);
		sb.append(", note=");
		sb.append(note);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DonViTinh toEntityModel() {
		DonViTinhImpl donViTinhImpl = new DonViTinhImpl();

		donViTinhImpl.setDonViTinhId(donViTinhId);
		donViTinhImpl.setGroupId(groupId);
		donViTinhImpl.setCompanyId(companyId);
		donViTinhImpl.setUserId(userId);

		if (userName == null) {
			donViTinhImpl.setUserName(StringPool.BLANK);
		}
		else {
			donViTinhImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			donViTinhImpl.setCreateDate(null);
		}
		else {
			donViTinhImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			donViTinhImpl.setModifiedDate(null);
		}
		else {
			donViTinhImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			donViTinhImpl.setName(StringPool.BLANK);
		}
		else {
			donViTinhImpl.setName(name);
		}

		donViTinhImpl.setStatus(status);

		if (note == null) {
			donViTinhImpl.setNote(StringPool.BLANK);
		}
		else {
			donViTinhImpl.setNote(note);
		}

		donViTinhImpl.resetOriginalValues();

		return donViTinhImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		donViTinhId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		status = objectInput.readInt();
		note = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(donViTinhId);
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

		objectOutput.writeInt(status);

		if (note == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(note);
		}
	}

	public long donViTinhId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public int status;
	public String note;
}