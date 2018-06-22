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

import com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DotKhuyenMaiChiTiet in entity cache.
 *
 * @author Mai Thành Duy An
 * @see DotKhuyenMaiChiTiet
 * @generated
 */
public class DotKhuyenMaiChiTietCacheModel implements CacheModel<DotKhuyenMaiChiTiet>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{dotKhuyenMaiChiTietId=");
		sb.append(dotKhuyenMaiChiTietId);
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
		sb.append(", dotKhuyenMaiId=");
		sb.append(dotKhuyenMaiId);
		sb.append(", nhomMatHangId=");
		sb.append(nhomMatHangId);
		sb.append(", matHangId=");
		sb.append(matHangId);
		sb.append(", matHangTangId=");
		sb.append(matHangTangId);
		sb.append(", tiLeGiamGia=");
		sb.append(tiLeGiamGia);
		sb.append(", giaTriDonHang=");
		sb.append(giaTriDonHang);
		sb.append(", soLuongMua=");
		sb.append(soLuongMua);
		sb.append(", soLuongTang=");
		sb.append(soLuongTang);
		sb.append(", giaBan=");
		sb.append(giaBan);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DotKhuyenMaiChiTiet toEntityModel() {
		DotKhuyenMaiChiTietImpl dotKhuyenMaiChiTietImpl = new DotKhuyenMaiChiTietImpl();

		dotKhuyenMaiChiTietImpl.setDotKhuyenMaiChiTietId(dotKhuyenMaiChiTietId);
		dotKhuyenMaiChiTietImpl.setCompanyId(companyId);
		dotKhuyenMaiChiTietImpl.setUserId(userId);

		if (userName == null) {
			dotKhuyenMaiChiTietImpl.setUserName(StringPool.BLANK);
		}
		else {
			dotKhuyenMaiChiTietImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			dotKhuyenMaiChiTietImpl.setCreateDate(null);
		}
		else {
			dotKhuyenMaiChiTietImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dotKhuyenMaiChiTietImpl.setModifiedDate(null);
		}
		else {
			dotKhuyenMaiChiTietImpl.setModifiedDate(new Date(modifiedDate));
		}

		dotKhuyenMaiChiTietImpl.setDotKhuyenMaiId(dotKhuyenMaiId);
		dotKhuyenMaiChiTietImpl.setNhomMatHangId(nhomMatHangId);
		dotKhuyenMaiChiTietImpl.setMatHangId(matHangId);
		dotKhuyenMaiChiTietImpl.setMatHangTangId(matHangTangId);
		dotKhuyenMaiChiTietImpl.setTiLeGiamGia(tiLeGiamGia);
		dotKhuyenMaiChiTietImpl.setGiaTriDonHang(giaTriDonHang);
		dotKhuyenMaiChiTietImpl.setSoLuongMua(soLuongMua);
		dotKhuyenMaiChiTietImpl.setSoLuongTang(soLuongTang);
		dotKhuyenMaiChiTietImpl.setGiaBan(giaBan);

		dotKhuyenMaiChiTietImpl.resetOriginalValues();

		return dotKhuyenMaiChiTietImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		dotKhuyenMaiChiTietId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		dotKhuyenMaiId = objectInput.readLong();
		nhomMatHangId = objectInput.readLong();
		matHangId = objectInput.readLong();
		matHangTangId = objectInput.readLong();
		tiLeGiamGia = objectInput.readDouble();
		giaTriDonHang = objectInput.readDouble();
		soLuongMua = objectInput.readInt();
		soLuongTang = objectInput.readInt();
		giaBan = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(dotKhuyenMaiChiTietId);
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
		objectOutput.writeLong(dotKhuyenMaiId);
		objectOutput.writeLong(nhomMatHangId);
		objectOutput.writeLong(matHangId);
		objectOutput.writeLong(matHangTangId);
		objectOutput.writeDouble(tiLeGiamGia);
		objectOutput.writeDouble(giaTriDonHang);
		objectOutput.writeInt(soLuongMua);
		objectOutput.writeInt(soLuongTang);
		objectOutput.writeInt(giaBan);
	}

	public long dotKhuyenMaiChiTietId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long dotKhuyenMaiId;
	public long nhomMatHangId;
	public long matHangId;
	public long matHangTangId;
	public double tiLeGiamGia;
	public double giaTriDonHang;
	public int soLuongMua;
	public int soLuongTang;
	public int giaBan;
}