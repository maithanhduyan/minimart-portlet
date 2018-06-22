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

import com.minimart.portlet.khuyenmai.model.LoaiHinhKhuyenMai;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing LoaiHinhKhuyenMai in entity cache.
 *
 * @author Mai Thành Duy An
 * @see LoaiHinhKhuyenMai
 * @generated
 */
public class LoaiHinhKhuyenMaiCacheModel implements CacheModel<LoaiHinhKhuyenMai>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{loaiHinhKhuyenMaiId=");
		sb.append(loaiHinhKhuyenMaiId);
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
		sb.append(", tileGiamGia=");
		sb.append(tileGiamGia);
		sb.append(", ngayBatDau=");
		sb.append(ngayBatDau);
		sb.append(", ngayHetHan=");
		sb.append(ngayHetHan);
		sb.append(", imageid=");
		sb.append(imageid);
		sb.append(", ghiChu=");
		sb.append(ghiChu);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LoaiHinhKhuyenMai toEntityModel() {
		LoaiHinhKhuyenMaiImpl loaiHinhKhuyenMaiImpl = new LoaiHinhKhuyenMaiImpl();

		loaiHinhKhuyenMaiImpl.setLoaiHinhKhuyenMaiId(loaiHinhKhuyenMaiId);
		loaiHinhKhuyenMaiImpl.setCompanyId(companyId);
		loaiHinhKhuyenMaiImpl.setUserId(userId);

		if (userName == null) {
			loaiHinhKhuyenMaiImpl.setUserName(StringPool.BLANK);
		}
		else {
			loaiHinhKhuyenMaiImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			loaiHinhKhuyenMaiImpl.setCreateDate(null);
		}
		else {
			loaiHinhKhuyenMaiImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			loaiHinhKhuyenMaiImpl.setModifiedDate(null);
		}
		else {
			loaiHinhKhuyenMaiImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (ten == null) {
			loaiHinhKhuyenMaiImpl.setTen(StringPool.BLANK);
		}
		else {
			loaiHinhKhuyenMaiImpl.setTen(ten);
		}

		loaiHinhKhuyenMaiImpl.setTrangThai(trangThai);
		loaiHinhKhuyenMaiImpl.setTileGiamGia(tileGiamGia);

		if (ngayBatDau == Long.MIN_VALUE) {
			loaiHinhKhuyenMaiImpl.setNgayBatDau(null);
		}
		else {
			loaiHinhKhuyenMaiImpl.setNgayBatDau(new Date(ngayBatDau));
		}

		if (ngayHetHan == Long.MIN_VALUE) {
			loaiHinhKhuyenMaiImpl.setNgayHetHan(null);
		}
		else {
			loaiHinhKhuyenMaiImpl.setNgayHetHan(new Date(ngayHetHan));
		}

		if (imageid == null) {
			loaiHinhKhuyenMaiImpl.setImageid(StringPool.BLANK);
		}
		else {
			loaiHinhKhuyenMaiImpl.setImageid(imageid);
		}

		if (ghiChu == null) {
			loaiHinhKhuyenMaiImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			loaiHinhKhuyenMaiImpl.setGhiChu(ghiChu);
		}

		loaiHinhKhuyenMaiImpl.resetOriginalValues();

		return loaiHinhKhuyenMaiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		loaiHinhKhuyenMaiId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		ten = objectInput.readUTF();
		trangThai = objectInput.readBoolean();
		tileGiamGia = objectInput.readInt();
		ngayBatDau = objectInput.readLong();
		ngayHetHan = objectInput.readLong();
		imageid = objectInput.readUTF();
		ghiChu = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(loaiHinhKhuyenMaiId);
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
		objectOutput.writeInt(tileGiamGia);
		objectOutput.writeLong(ngayBatDau);
		objectOutput.writeLong(ngayHetHan);

		if (imageid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(imageid);
		}

		if (ghiChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ghiChu);
		}
	}

	public long loaiHinhKhuyenMaiId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String ten;
	public boolean trangThai;
	public int tileGiamGia;
	public long ngayBatDau;
	public long ngayHetHan;
	public String imageid;
	public String ghiChu;
}