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

package com.minimart.portlet.khuyenmai.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.minimart.portlet.khuyenmai.model.DotKhuyenMai;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DotKhuyenMai in entity cache.
 *
 * @author Mai Thành Duy An
 * @see DotKhuyenMai
 * @generated
 */
public class DotKhuyenMaiCacheModel implements CacheModel<DotKhuyenMai>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{dotKhuyenMaiId=");
		sb.append(dotKhuyenMaiId);
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
		sb.append(", userModifieldId=");
		sb.append(userModifieldId);
		sb.append(", ngayBatDau=");
		sb.append(ngayBatDau);
		sb.append(", ngayHetHan=");
		sb.append(ngayHetHan);
		sb.append(", ngungApDung=");
		sb.append(ngungApDung);
		sb.append(", tiLeGiaGia=");
		sb.append(tiLeGiaGia);
		sb.append(", ghiChu=");
		sb.append(ghiChu);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DotKhuyenMai toEntityModel() {
		DotKhuyenMaiImpl dotKhuyenMaiImpl = new DotKhuyenMaiImpl();

		dotKhuyenMaiImpl.setDotKhuyenMaiId(dotKhuyenMaiId);
		dotKhuyenMaiImpl.setCompanyId(companyId);
		dotKhuyenMaiImpl.setUserId(userId);

		if (userName == null) {
			dotKhuyenMaiImpl.setUserName(StringPool.BLANK);
		}
		else {
			dotKhuyenMaiImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			dotKhuyenMaiImpl.setCreateDate(null);
		}
		else {
			dotKhuyenMaiImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dotKhuyenMaiImpl.setModifiedDate(null);
		}
		else {
			dotKhuyenMaiImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (ten == null) {
			dotKhuyenMaiImpl.setTen(StringPool.BLANK);
		}
		else {
			dotKhuyenMaiImpl.setTen(ten);
		}

		dotKhuyenMaiImpl.setTrangThai(trangThai);
		dotKhuyenMaiImpl.setUserModifieldId(userModifieldId);

		if (ngayBatDau == Long.MIN_VALUE) {
			dotKhuyenMaiImpl.setNgayBatDau(null);
		}
		else {
			dotKhuyenMaiImpl.setNgayBatDau(new Date(ngayBatDau));
		}

		if (ngayHetHan == Long.MIN_VALUE) {
			dotKhuyenMaiImpl.setNgayHetHan(null);
		}
		else {
			dotKhuyenMaiImpl.setNgayHetHan(new Date(ngayHetHan));
		}

		dotKhuyenMaiImpl.setNgungApDung(ngungApDung);
		dotKhuyenMaiImpl.setTiLeGiaGia(tiLeGiaGia);

		if (ghiChu == null) {
			dotKhuyenMaiImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			dotKhuyenMaiImpl.setGhiChu(ghiChu);
		}

		dotKhuyenMaiImpl.resetOriginalValues();

		return dotKhuyenMaiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		dotKhuyenMaiId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		ten = objectInput.readUTF();
		trangThai = objectInput.readBoolean();
		userModifieldId = objectInput.readLong();
		ngayBatDau = objectInput.readLong();
		ngayHetHan = objectInput.readLong();
		ngungApDung = objectInput.readBoolean();
		tiLeGiaGia = objectInput.readInt();
		ghiChu = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(dotKhuyenMaiId);
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
		objectOutput.writeLong(userModifieldId);
		objectOutput.writeLong(ngayBatDau);
		objectOutput.writeLong(ngayHetHan);
		objectOutput.writeBoolean(ngungApDung);
		objectOutput.writeInt(tiLeGiaGia);

		if (ghiChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ghiChu);
		}
	}

	public long dotKhuyenMaiId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String ten;
	public boolean trangThai;
	public long userModifieldId;
	public long ngayBatDau;
	public long ngayHetHan;
	public boolean ngungApDung;
	public int tiLeGiaGia;
	public String ghiChu;
}