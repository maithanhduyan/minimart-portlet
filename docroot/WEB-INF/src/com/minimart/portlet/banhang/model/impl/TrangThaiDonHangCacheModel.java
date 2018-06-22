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

package com.minimart.portlet.banhang.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.minimart.portlet.banhang.model.TrangThaiDonHang;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TrangThaiDonHang in entity cache.
 *
 * @author Mai Thành Duy An
 * @see TrangThaiDonHang
 * @generated
 */
public class TrangThaiDonHangCacheModel implements CacheModel<TrangThaiDonHang>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{trangThaiDonHangId=");
		sb.append(trangThaiDonHangId);
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
		sb.append(", hoatDong=");
		sb.append(hoatDong);
		sb.append(", ghiChu=");
		sb.append(ghiChu);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TrangThaiDonHang toEntityModel() {
		TrangThaiDonHangImpl trangThaiDonHangImpl = new TrangThaiDonHangImpl();

		trangThaiDonHangImpl.setTrangThaiDonHangId(trangThaiDonHangId);
		trangThaiDonHangImpl.setCompanyId(companyId);
		trangThaiDonHangImpl.setUserId(userId);

		if (userName == null) {
			trangThaiDonHangImpl.setUserName(StringPool.BLANK);
		}
		else {
			trangThaiDonHangImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			trangThaiDonHangImpl.setCreateDate(null);
		}
		else {
			trangThaiDonHangImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			trangThaiDonHangImpl.setModifiedDate(null);
		}
		else {
			trangThaiDonHangImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (ten == null) {
			trangThaiDonHangImpl.setTen(StringPool.BLANK);
		}
		else {
			trangThaiDonHangImpl.setTen(ten);
		}

		trangThaiDonHangImpl.setHoatDong(hoatDong);

		if (ghiChu == null) {
			trangThaiDonHangImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			trangThaiDonHangImpl.setGhiChu(ghiChu);
		}

		trangThaiDonHangImpl.resetOriginalValues();

		return trangThaiDonHangImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		trangThaiDonHangId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		ten = objectInput.readUTF();
		hoatDong = objectInput.readBoolean();
		ghiChu = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(trangThaiDonHangId);
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

		objectOutput.writeBoolean(hoatDong);

		if (ghiChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ghiChu);
		}
	}

	public long trangThaiDonHangId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String ten;
	public boolean hoatDong;
	public String ghiChu;
}