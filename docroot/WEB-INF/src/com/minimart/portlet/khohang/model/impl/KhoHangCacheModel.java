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

package com.minimart.portlet.khohang.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.minimart.portlet.khohang.model.KhoHang;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing KhoHang in entity cache.
 *
 * @author Mai Thành Duy An
 * @see KhoHang
 * @generated
 */
public class KhoHangCacheModel implements CacheModel<KhoHang>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{khoHangId=");
		sb.append(khoHangId);
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
		sb.append(", trangThai=");
		sb.append(trangThai);
		sb.append(", itemType=");
		sb.append(itemType);
		sb.append(", choPhepNhapKho=");
		sb.append(choPhepNhapKho);
		sb.append(", cuaHangId=");
		sb.append(cuaHangId);
		sb.append(", autoId=");
		sb.append(autoId);
		sb.append(", sigmaId=");
		sb.append(sigmaId);
		sb.append(", ghiChu=");
		sb.append(ghiChu);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public KhoHang toEntityModel() {
		KhoHangImpl khoHangImpl = new KhoHangImpl();

		khoHangImpl.setKhoHangId(khoHangId);
		khoHangImpl.setCompanyId(companyId);
		khoHangImpl.setUserId(userId);

		if (userName == null) {
			khoHangImpl.setUserName(StringPool.BLANK);
		}
		else {
			khoHangImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			khoHangImpl.setCreateDate(null);
		}
		else {
			khoHangImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			khoHangImpl.setModifiedDate(null);
		}
		else {
			khoHangImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (ten == null) {
			khoHangImpl.setTen(StringPool.BLANK);
		}
		else {
			khoHangImpl.setTen(ten);
		}

		khoHangImpl.setTrangThai(trangThai);
		khoHangImpl.setItemType(itemType);
		khoHangImpl.setChoPhepNhapKho(choPhepNhapKho);
		khoHangImpl.setCuaHangId(cuaHangId);
		khoHangImpl.setAutoId(autoId);
		khoHangImpl.setSigmaId(sigmaId);

		if (ghiChu == null) {
			khoHangImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			khoHangImpl.setGhiChu(ghiChu);
		}

		khoHangImpl.resetOriginalValues();

		return khoHangImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		khoHangId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		ten = objectInput.readUTF();
		trangThai = objectInput.readBoolean();
		itemType = objectInput.readInt();
		choPhepNhapKho = objectInput.readBoolean();
		cuaHangId = objectInput.readLong();
		autoId = objectInput.readLong();
		sigmaId = objectInput.readLong();
		ghiChu = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(khoHangId);
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

		objectOutput.writeBoolean(trangThai);
		objectOutput.writeInt(itemType);
		objectOutput.writeBoolean(choPhepNhapKho);
		objectOutput.writeLong(cuaHangId);
		objectOutput.writeLong(autoId);
		objectOutput.writeLong(sigmaId);

		if (ghiChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ghiChu);
		}
	}

	public long khoHangId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String ten;
	public boolean trangThai;
	public int itemType;
	public boolean choPhepNhapKho;
	public long cuaHangId;
	public long autoId;
	public long sigmaId;
	public String ghiChu;
}