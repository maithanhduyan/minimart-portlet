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

import com.minimart.portlet.mathang.model.NhomMatHang;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NhomMatHang in entity cache.
 *
 * @author Mai Thành Duy An
 * @see NhomMatHang
 * @generated
 */
public class NhomMatHangCacheModel implements CacheModel<NhomMatHang>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{nhomMatHangId=");
		sb.append(nhomMatHangId);
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
		sb.append(", status=");
		sb.append(status);
		sb.append(", note=");
		sb.append(note);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NhomMatHang toEntityModel() {
		NhomMatHangImpl nhomMatHangImpl = new NhomMatHangImpl();

		nhomMatHangImpl.setNhomMatHangId(nhomMatHangId);
		nhomMatHangImpl.setGroupId(groupId);
		nhomMatHangImpl.setCompanyId(companyId);
		nhomMatHangImpl.setUserId(userId);

		if (userName == null) {
			nhomMatHangImpl.setUserName(StringPool.BLANK);
		}
		else {
			nhomMatHangImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			nhomMatHangImpl.setCreateDate(null);
		}
		else {
			nhomMatHangImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			nhomMatHangImpl.setModifiedDate(null);
		}
		else {
			nhomMatHangImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			nhomMatHangImpl.setName(StringPool.BLANK);
		}
		else {
			nhomMatHangImpl.setName(name);
		}

		if (code == null) {
			nhomMatHangImpl.setCode(StringPool.BLANK);
		}
		else {
			nhomMatHangImpl.setCode(code);
		}

		nhomMatHangImpl.setStatus(status);

		if (note == null) {
			nhomMatHangImpl.setNote(StringPool.BLANK);
		}
		else {
			nhomMatHangImpl.setNote(note);
		}

		nhomMatHangImpl.resetOriginalValues();

		return nhomMatHangImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		nhomMatHangId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		code = objectInput.readUTF();
		status = objectInput.readInt();
		note = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(nhomMatHangId);
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

		objectOutput.writeInt(status);

		if (note == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(note);
		}
	}

	public long nhomMatHangId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String code;
	public int status;
	public String note;
}