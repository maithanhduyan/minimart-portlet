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

package com.minimart.portlet.nhacungcap.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.minimart.portlet.nhacungcap.model.NhaCungCap;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NhaCungCap in entity cache.
 *
 * @author Mai Thành Duy An
 * @see NhaCungCap
 * @generated
 */
public class NhaCungCapCacheModel implements CacheModel<NhaCungCap>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{nhaCungCapId=");
		sb.append(nhaCungCapId);
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
		sb.append(", tenNhaCungCap=");
		sb.append(tenNhaCungCap);
		sb.append(", nhomNhaCungCapId=");
		sb.append(nhomNhaCungCapId);
		sb.append(", maNhaCungCap=");
		sb.append(maNhaCungCap);
		sb.append(", diaChi=");
		sb.append(diaChi);
		sb.append(", dienThoai=");
		sb.append(dienThoai);
		sb.append(", email=");
		sb.append(email);
		sb.append(", website=");
		sb.append(website);
		sb.append(", ghiChu=");
		sb.append(ghiChu);
		sb.append(", hoatDong=");
		sb.append(hoatDong);
		sb.append(", doUuTien=");
		sb.append(doUuTien);
		sb.append(", logoURL=");
		sb.append(logoURL);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NhaCungCap toEntityModel() {
		NhaCungCapImpl nhaCungCapImpl = new NhaCungCapImpl();

		nhaCungCapImpl.setNhaCungCapId(nhaCungCapId);
		nhaCungCapImpl.setCompanyId(companyId);
		nhaCungCapImpl.setUserId(userId);

		if (userName == null) {
			nhaCungCapImpl.setUserName(StringPool.BLANK);
		}
		else {
			nhaCungCapImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			nhaCungCapImpl.setCreateDate(null);
		}
		else {
			nhaCungCapImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			nhaCungCapImpl.setModifiedDate(null);
		}
		else {
			nhaCungCapImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (tenNhaCungCap == null) {
			nhaCungCapImpl.setTenNhaCungCap(StringPool.BLANK);
		}
		else {
			nhaCungCapImpl.setTenNhaCungCap(tenNhaCungCap);
		}

		nhaCungCapImpl.setNhomNhaCungCapId(nhomNhaCungCapId);

		if (maNhaCungCap == null) {
			nhaCungCapImpl.setMaNhaCungCap(StringPool.BLANK);
		}
		else {
			nhaCungCapImpl.setMaNhaCungCap(maNhaCungCap);
		}

		if (diaChi == null) {
			nhaCungCapImpl.setDiaChi(StringPool.BLANK);
		}
		else {
			nhaCungCapImpl.setDiaChi(diaChi);
		}

		if (dienThoai == null) {
			nhaCungCapImpl.setDienThoai(StringPool.BLANK);
		}
		else {
			nhaCungCapImpl.setDienThoai(dienThoai);
		}

		if (email == null) {
			nhaCungCapImpl.setEmail(StringPool.BLANK);
		}
		else {
			nhaCungCapImpl.setEmail(email);
		}

		if (website == null) {
			nhaCungCapImpl.setWebsite(StringPool.BLANK);
		}
		else {
			nhaCungCapImpl.setWebsite(website);
		}

		if (ghiChu == null) {
			nhaCungCapImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			nhaCungCapImpl.setGhiChu(ghiChu);
		}

		nhaCungCapImpl.setHoatDong(hoatDong);
		nhaCungCapImpl.setDoUuTien(doUuTien);

		if (logoURL == null) {
			nhaCungCapImpl.setLogoURL(StringPool.BLANK);
		}
		else {
			nhaCungCapImpl.setLogoURL(logoURL);
		}

		nhaCungCapImpl.resetOriginalValues();

		return nhaCungCapImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		nhaCungCapId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		tenNhaCungCap = objectInput.readUTF();
		nhomNhaCungCapId = objectInput.readLong();
		maNhaCungCap = objectInput.readUTF();
		diaChi = objectInput.readUTF();
		dienThoai = objectInput.readUTF();
		email = objectInput.readUTF();
		website = objectInput.readUTF();
		ghiChu = objectInput.readUTF();
		hoatDong = objectInput.readBoolean();
		doUuTien = objectInput.readInt();
		logoURL = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(nhaCungCapId);
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

		if (tenNhaCungCap == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenNhaCungCap);
		}

		objectOutput.writeLong(nhomNhaCungCapId);

		if (maNhaCungCap == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maNhaCungCap);
		}

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

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (website == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(website);
		}

		if (ghiChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ghiChu);
		}

		objectOutput.writeBoolean(hoatDong);
		objectOutput.writeInt(doUuTien);

		if (logoURL == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(logoURL);
		}
	}

	public long nhaCungCapId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String tenNhaCungCap;
	public long nhomNhaCungCapId;
	public String maNhaCungCap;
	public String diaChi;
	public String dienThoai;
	public String email;
	public String website;
	public String ghiChu;
	public boolean hoatDong;
	public int doUuTien;
	public String logoURL;
}