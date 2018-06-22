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

import com.minimart.portlet.banhang.model.DonHangChiTiet;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DonHangChiTiet in entity cache.
 *
 * @author Mai Thành Duy An
 * @see DonHangChiTiet
 * @generated
 */
public class DonHangChiTietCacheModel implements CacheModel<DonHangChiTiet>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{donHangChiTietId=");
		sb.append(donHangChiTietId);
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
		sb.append(", donHangId=");
		sb.append(donHangId);
		sb.append(", matHangId=");
		sb.append(matHangId);
		sb.append(", soLuong=");
		sb.append(soLuong);
		sb.append(", donViTinhId=");
		sb.append(donViTinhId);
		sb.append(", thanhTien=");
		sb.append(thanhTien);
		sb.append(", tiLeGiamGia=");
		sb.append(tiLeGiamGia);
		sb.append(", kichThuoc=");
		sb.append(kichThuoc);
		sb.append(", hanSuDung=");
		sb.append(hanSuDung);
		sb.append(", hoatDong=");
		sb.append(hoatDong);
		sb.append(", huy=");
		sb.append(huy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DonHangChiTiet toEntityModel() {
		DonHangChiTietImpl donHangChiTietImpl = new DonHangChiTietImpl();

		donHangChiTietImpl.setDonHangChiTietId(donHangChiTietId);
		donHangChiTietImpl.setCompanyId(companyId);
		donHangChiTietImpl.setUserId(userId);

		if (userName == null) {
			donHangChiTietImpl.setUserName(StringPool.BLANK);
		}
		else {
			donHangChiTietImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			donHangChiTietImpl.setCreateDate(null);
		}
		else {
			donHangChiTietImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			donHangChiTietImpl.setModifiedDate(null);
		}
		else {
			donHangChiTietImpl.setModifiedDate(new Date(modifiedDate));
		}

		donHangChiTietImpl.setDonHangId(donHangId);
		donHangChiTietImpl.setMatHangId(matHangId);
		donHangChiTietImpl.setSoLuong(soLuong);
		donHangChiTietImpl.setDonViTinhId(donViTinhId);
		donHangChiTietImpl.setThanhTien(thanhTien);
		donHangChiTietImpl.setTiLeGiamGia(tiLeGiamGia);

		if (kichThuoc == null) {
			donHangChiTietImpl.setKichThuoc(StringPool.BLANK);
		}
		else {
			donHangChiTietImpl.setKichThuoc(kichThuoc);
		}

		if (hanSuDung == Long.MIN_VALUE) {
			donHangChiTietImpl.setHanSuDung(null);
		}
		else {
			donHangChiTietImpl.setHanSuDung(new Date(hanSuDung));
		}

		donHangChiTietImpl.setHoatDong(hoatDong);
		donHangChiTietImpl.setHuy(huy);

		donHangChiTietImpl.resetOriginalValues();

		return donHangChiTietImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		donHangChiTietId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		donHangId = objectInput.readLong();
		matHangId = objectInput.readLong();
		soLuong = objectInput.readInt();
		donViTinhId = objectInput.readLong();
		thanhTien = objectInput.readInt();
		tiLeGiamGia = objectInput.readInt();
		kichThuoc = objectInput.readUTF();
		hanSuDung = objectInput.readLong();
		hoatDong = objectInput.readBoolean();
		huy = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(donHangChiTietId);
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
		objectOutput.writeLong(donHangId);
		objectOutput.writeLong(matHangId);
		objectOutput.writeInt(soLuong);
		objectOutput.writeLong(donViTinhId);
		objectOutput.writeInt(thanhTien);
		objectOutput.writeInt(tiLeGiamGia);

		if (kichThuoc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kichThuoc);
		}

		objectOutput.writeLong(hanSuDung);
		objectOutput.writeBoolean(hoatDong);
		objectOutput.writeBoolean(huy);
	}

	public long donHangChiTietId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long donHangId;
	public long matHangId;
	public int soLuong;
	public long donViTinhId;
	public int thanhTien;
	public int tiLeGiamGia;
	public String kichThuoc;
	public long hanSuDung;
	public boolean hoatDong;
	public boolean huy;
}