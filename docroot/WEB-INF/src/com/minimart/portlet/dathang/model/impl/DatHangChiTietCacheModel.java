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

import com.minimart.portlet.dathang.model.DatHangChiTiet;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DatHangChiTiet in entity cache.
 *
 * @author Mai Thành Duy An
 * @see DatHangChiTiet
 * @generated
 */
public class DatHangChiTietCacheModel implements CacheModel<DatHangChiTiet>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{datHangChiTietId=");
		sb.append(datHangChiTietId);
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
		sb.append(", soLuong=");
		sb.append(soLuong);
		sb.append(", donGia=");
		sb.append(donGia);
		sb.append(", thanhTien=");
		sb.append(thanhTien);
		sb.append(", tiLeGiamGia=");
		sb.append(tiLeGiamGia);
		sb.append(", ghiChu=");
		sb.append(ghiChu);
		sb.append(", trangThai=");
		sb.append(trangThai);
		sb.append(", baoHanh=");
		sb.append(baoHanh);
		sb.append(", donViTinhId=");
		sb.append(donViTinhId);
		sb.append(", datHangId=");
		sb.append(datHangId);
		sb.append(", maHangId=");
		sb.append(maHangId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DatHangChiTiet toEntityModel() {
		DatHangChiTietImpl datHangChiTietImpl = new DatHangChiTietImpl();

		datHangChiTietImpl.setDatHangChiTietId(datHangChiTietId);
		datHangChiTietImpl.setCompanyId(companyId);
		datHangChiTietImpl.setUserId(userId);

		if (userName == null) {
			datHangChiTietImpl.setUserName(StringPool.BLANK);
		}
		else {
			datHangChiTietImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			datHangChiTietImpl.setCreateDate(null);
		}
		else {
			datHangChiTietImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			datHangChiTietImpl.setModifiedDate(null);
		}
		else {
			datHangChiTietImpl.setModifiedDate(new Date(modifiedDate));
		}

		datHangChiTietImpl.setSoLuong(soLuong);
		datHangChiTietImpl.setDonGia(donGia);
		datHangChiTietImpl.setThanhTien(thanhTien);
		datHangChiTietImpl.setTiLeGiamGia(tiLeGiamGia);

		if (ghiChu == null) {
			datHangChiTietImpl.setGhiChu(StringPool.BLANK);
		}
		else {
			datHangChiTietImpl.setGhiChu(ghiChu);
		}

		datHangChiTietImpl.setTrangThai(trangThai);

		if (baoHanh == null) {
			datHangChiTietImpl.setBaoHanh(StringPool.BLANK);
		}
		else {
			datHangChiTietImpl.setBaoHanh(baoHanh);
		}

		datHangChiTietImpl.setDonViTinhId(donViTinhId);
		datHangChiTietImpl.setDatHangId(datHangId);
		datHangChiTietImpl.setMaHangId(maHangId);

		datHangChiTietImpl.resetOriginalValues();

		return datHangChiTietImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		datHangChiTietId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		soLuong = objectInput.readInt();
		donGia = objectInput.readInt();
		thanhTien = objectInput.readInt();
		tiLeGiamGia = objectInput.readDouble();
		ghiChu = objectInput.readUTF();
		trangThai = objectInput.readBoolean();
		baoHanh = objectInput.readUTF();
		donViTinhId = objectInput.readLong();
		datHangId = objectInput.readLong();
		maHangId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(datHangChiTietId);
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
		objectOutput.writeInt(soLuong);
		objectOutput.writeInt(donGia);
		objectOutput.writeInt(thanhTien);
		objectOutput.writeDouble(tiLeGiamGia);

		if (ghiChu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ghiChu);
		}

		objectOutput.writeBoolean(trangThai);

		if (baoHanh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(baoHanh);
		}

		objectOutput.writeLong(donViTinhId);
		objectOutput.writeLong(datHangId);
		objectOutput.writeLong(maHangId);
	}

	public long datHangChiTietId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int soLuong;
	public int donGia;
	public int thanhTien;
	public double tiLeGiamGia;
	public String ghiChu;
	public boolean trangThai;
	public String baoHanh;
	public long donViTinhId;
	public long datHangId;
	public long maHangId;
}