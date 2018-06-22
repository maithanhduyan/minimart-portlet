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

package com.minimart.portlet.dathang.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.minimart.portlet.dathang.model.DatHang;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DatHang in entity cache.
 *
 * @author Mai Thành Duy An
 * @see DatHang
 * @generated
 */
public class DatHangCacheModel implements CacheModel<DatHang>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(47);

		sb.append("{datHangId=");
		sb.append(datHangId);
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
		sb.append(", khachHangId=");
		sb.append(khachHangId);
		sb.append(", diaChiId=");
		sb.append(diaChiId);
		sb.append(", tienHang=");
		sb.append(tienHang);
		sb.append(", tiLeThue=");
		sb.append(tiLeThue);
		sb.append(", tiLeGiamGia=");
		sb.append(tiLeGiamGia);
		sb.append(", tienGiamGia=");
		sb.append(tienGiamGia);
		sb.append(", phiVanChuyen=");
		sb.append(phiVanChuyen);
		sb.append(", tongCong=");
		sb.append(tongCong);
		sb.append(", loai=");
		sb.append(loai);
		sb.append(", giamTheoTien=");
		sb.append(giamTheoTien);
		sb.append(", trangThai=");
		sb.append(trangThai);
		sb.append(", userModifiedId=");
		sb.append(userModifiedId);
		sb.append(", timeModified=");
		sb.append(timeModified);
		sb.append(", userCreateId=");
		sb.append(userCreateId);
		sb.append(", loaiGia=");
		sb.append(loaiGia);
		sb.append(", hoatDong=");
		sb.append(hoatDong);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DatHang toEntityModel() {
		DatHangImpl datHangImpl = new DatHangImpl();

		datHangImpl.setDatHangId(datHangId);
		datHangImpl.setCompanyId(companyId);
		datHangImpl.setUserId(userId);

		if (userName == null) {
			datHangImpl.setUserName(StringPool.BLANK);
		}
		else {
			datHangImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			datHangImpl.setCreateDate(null);
		}
		else {
			datHangImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			datHangImpl.setModifiedDate(null);
		}
		else {
			datHangImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (ten == null) {
			datHangImpl.setTen(StringPool.BLANK);
		}
		else {
			datHangImpl.setTen(ten);
		}

		datHangImpl.setKhachHangId(khachHangId);
		datHangImpl.setDiaChiId(diaChiId);
		datHangImpl.setTienHang(tienHang);
		datHangImpl.setTiLeThue(tiLeThue);
		datHangImpl.setTiLeGiamGia(tiLeGiamGia);
		datHangImpl.setTienGiamGia(tienGiamGia);
		datHangImpl.setPhiVanChuyen(phiVanChuyen);
		datHangImpl.setTongCong(tongCong);
		datHangImpl.setLoai(loai);
		datHangImpl.setGiamTheoTien(giamTheoTien);
		datHangImpl.setTrangThai(trangThai);
		datHangImpl.setUserModifiedId(userModifiedId);

		if (timeModified == Long.MIN_VALUE) {
			datHangImpl.setTimeModified(null);
		}
		else {
			datHangImpl.setTimeModified(new Date(timeModified));
		}

		datHangImpl.setUserCreateId(userCreateId);
		datHangImpl.setLoaiGia(loaiGia);
		datHangImpl.setHoatDong(hoatDong);

		datHangImpl.resetOriginalValues();

		return datHangImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		datHangId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		ten = objectInput.readUTF();
		khachHangId = objectInput.readLong();
		diaChiId = objectInput.readLong();
		tienHang = objectInput.readInt();
		tiLeThue = objectInput.readDouble();
		tiLeGiamGia = objectInput.readDouble();
		tienGiamGia = objectInput.readInt();
		phiVanChuyen = objectInput.readInt();
		tongCong = objectInput.readInt();
		loai = objectInput.readInt();
		giamTheoTien = objectInput.readInt();
		trangThai = objectInput.readBoolean();
		userModifiedId = objectInput.readLong();
		timeModified = objectInput.readLong();
		userCreateId = objectInput.readLong();
		loaiGia = objectInput.readInt();
		hoatDong = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(datHangId);
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

		objectOutput.writeLong(khachHangId);
		objectOutput.writeLong(diaChiId);
		objectOutput.writeInt(tienHang);
		objectOutput.writeDouble(tiLeThue);
		objectOutput.writeDouble(tiLeGiamGia);
		objectOutput.writeInt(tienGiamGia);
		objectOutput.writeInt(phiVanChuyen);
		objectOutput.writeInt(tongCong);
		objectOutput.writeInt(loai);
		objectOutput.writeInt(giamTheoTien);
		objectOutput.writeBoolean(trangThai);
		objectOutput.writeLong(userModifiedId);
		objectOutput.writeLong(timeModified);
		objectOutput.writeLong(userCreateId);
		objectOutput.writeInt(loaiGia);
		objectOutput.writeBoolean(hoatDong);
	}

	public long datHangId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String ten;
	public long khachHangId;
	public long diaChiId;
	public int tienHang;
	public double tiLeThue;
	public double tiLeGiamGia;
	public int tienGiamGia;
	public int phiVanChuyen;
	public int tongCong;
	public int loai;
	public int giamTheoTien;
	public boolean trangThai;
	public long userModifiedId;
	public long timeModified;
	public long userCreateId;
	public int loaiGia;
	public boolean hoatDong;
}