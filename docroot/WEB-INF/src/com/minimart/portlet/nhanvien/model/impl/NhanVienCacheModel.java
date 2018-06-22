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

package com.minimart.portlet.nhanvien.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.minimart.portlet.nhanvien.model.NhanVien;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NhanVien in entity cache.
 *
 * @author Mai Thành Duy An
 * @see NhanVien
 * @generated
 */
public class NhanVienCacheModel implements CacheModel<NhanVien>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", nhanVienId=");
		sb.append(nhanVienId);
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
		sb.append(", ho=");
		sb.append(ho);
		sb.append(", trangThai=");
		sb.append(trangThai);
		sb.append(", nghiThu7=");
		sb.append(nghiThu7);
		sb.append(", nghiChuNhat=");
		sb.append(nghiChuNhat);
		sb.append(", cachTinhLuong=");
		sb.append(cachTinhLuong);
		sb.append(", luongCa=");
		sb.append(luongCa);
		sb.append(", luongThang=");
		sb.append(luongThang);
		sb.append(", image=");
		sb.append(image);
		sb.append(", diaChiId=");
		sb.append(diaChiId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NhanVien toEntityModel() {
		NhanVienImpl nhanVienImpl = new NhanVienImpl();

		if (uuid == null) {
			nhanVienImpl.setUuid(StringPool.BLANK);
		}
		else {
			nhanVienImpl.setUuid(uuid);
		}

		nhanVienImpl.setNhanVienId(nhanVienId);
		nhanVienImpl.setCompanyId(companyId);
		nhanVienImpl.setUserId(userId);

		if (userName == null) {
			nhanVienImpl.setUserName(StringPool.BLANK);
		}
		else {
			nhanVienImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			nhanVienImpl.setCreateDate(null);
		}
		else {
			nhanVienImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			nhanVienImpl.setModifiedDate(null);
		}
		else {
			nhanVienImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (ten == null) {
			nhanVienImpl.setTen(StringPool.BLANK);
		}
		else {
			nhanVienImpl.setTen(ten);
		}

		if (ho == null) {
			nhanVienImpl.setHo(StringPool.BLANK);
		}
		else {
			nhanVienImpl.setHo(ho);
		}

		nhanVienImpl.setTrangThai(trangThai);
		nhanVienImpl.setNghiThu7(nghiThu7);
		nhanVienImpl.setNghiChuNhat(nghiChuNhat);
		nhanVienImpl.setCachTinhLuong(cachTinhLuong);
		nhanVienImpl.setLuongCa(luongCa);
		nhanVienImpl.setLuongThang(luongThang);

		if (image == null) {
			nhanVienImpl.setImage(StringPool.BLANK);
		}
		else {
			nhanVienImpl.setImage(image);
		}

		nhanVienImpl.setDiaChiId(diaChiId);

		nhanVienImpl.resetOriginalValues();

		return nhanVienImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		nhanVienId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		ten = objectInput.readUTF();
		ho = objectInput.readUTF();
		trangThai = objectInput.readBoolean();
		nghiThu7 = objectInput.readBoolean();
		nghiChuNhat = objectInput.readBoolean();
		cachTinhLuong = objectInput.readInt();
		luongCa = objectInput.readInt();
		luongThang = objectInput.readInt();
		image = objectInput.readUTF();
		diaChiId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(nhanVienId);
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

		if (ho == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ho);
		}

		objectOutput.writeBoolean(trangThai);
		objectOutput.writeBoolean(nghiThu7);
		objectOutput.writeBoolean(nghiChuNhat);
		objectOutput.writeInt(cachTinhLuong);
		objectOutput.writeInt(luongCa);
		objectOutput.writeInt(luongThang);

		if (image == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(image);
		}

		objectOutput.writeLong(diaChiId);
	}

	public String uuid;
	public long nhanVienId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String ten;
	public String ho;
	public boolean trangThai;
	public boolean nghiThu7;
	public boolean nghiChuNhat;
	public int cachTinhLuong;
	public int luongCa;
	public int luongThang;
	public String image;
	public long diaChiId;
}