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

import com.minimart.portlet.banhang.model.DonHang;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DonHang in entity cache.
 *
 * @author Mai Thành Duy An
 * @see DonHang
 * @generated
 */
public class DonHangCacheModel implements CacheModel<DonHang>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(51);

		sb.append("{donHangId=");
		sb.append(donHangId);
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
		sb.append(", cuaHangId=");
		sb.append(cuaHangId);
		sb.append(", khachHangId=");
		sb.append(khachHangId);
		sb.append(", hoatDong=");
		sb.append(hoatDong);
		sb.append(", tongCong=");
		sb.append(tongCong);
		sb.append(", daThanhToan=");
		sb.append(daThanhToan);
		sb.append(", phiVanChuyen=");
		sb.append(phiVanChuyen);
		sb.append(", trangThaiDonHangId=");
		sb.append(trangThaiDonHangId);
		sb.append(", ngayThanhToan=");
		sb.append(ngayThanhToan);
		sb.append(", khachDua=");
		sb.append(khachDua);
		sb.append(", traLai=");
		sb.append(traLai);
		sb.append(", thueVAT=");
		sb.append(thueVAT);
		sb.append(", diemTichLuy=");
		sb.append(diemTichLuy);
		sb.append(", thanhToanTienMat=");
		sb.append(thanhToanTienMat);
		sb.append(", thanhToanThe=");
		sb.append(thanhToanThe);
		sb.append(", thanhToanChuyenKhoan=");
		sb.append(thanhToanChuyenKhoan);
		sb.append(", phieuGiamGiaId=");
		sb.append(phieuGiamGiaId);
		sb.append(", truTichLuy=");
		sb.append(truTichLuy);
		sb.append(", inHoaDonLan=");
		sb.append(inHoaDonLan);
		sb.append(", maDonHang=");
		sb.append(maDonHang);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DonHang toEntityModel() {
		DonHangImpl donHangImpl = new DonHangImpl();

		donHangImpl.setDonHangId(donHangId);
		donHangImpl.setCompanyId(companyId);
		donHangImpl.setUserId(userId);

		if (userName == null) {
			donHangImpl.setUserName(StringPool.BLANK);
		}
		else {
			donHangImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			donHangImpl.setCreateDate(null);
		}
		else {
			donHangImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			donHangImpl.setModifiedDate(null);
		}
		else {
			donHangImpl.setModifiedDate(new Date(modifiedDate));
		}

		donHangImpl.setCuaHangId(cuaHangId);
		donHangImpl.setKhachHangId(khachHangId);
		donHangImpl.setHoatDong(hoatDong);
		donHangImpl.setTongCong(tongCong);
		donHangImpl.setDaThanhToan(daThanhToan);
		donHangImpl.setPhiVanChuyen(phiVanChuyen);
		donHangImpl.setTrangThaiDonHangId(trangThaiDonHangId);

		if (ngayThanhToan == Long.MIN_VALUE) {
			donHangImpl.setNgayThanhToan(null);
		}
		else {
			donHangImpl.setNgayThanhToan(new Date(ngayThanhToan));
		}

		donHangImpl.setKhachDua(khachDua);
		donHangImpl.setTraLai(traLai);
		donHangImpl.setThueVAT(thueVAT);
		donHangImpl.setDiemTichLuy(diemTichLuy);
		donHangImpl.setThanhToanTienMat(thanhToanTienMat);
		donHangImpl.setThanhToanThe(thanhToanThe);
		donHangImpl.setThanhToanChuyenKhoan(thanhToanChuyenKhoan);
		donHangImpl.setPhieuGiamGiaId(phieuGiamGiaId);
		donHangImpl.setTruTichLuy(truTichLuy);
		donHangImpl.setInHoaDonLan(inHoaDonLan);

		if (maDonHang == null) {
			donHangImpl.setMaDonHang(StringPool.BLANK);
		}
		else {
			donHangImpl.setMaDonHang(maDonHang);
		}

		donHangImpl.resetOriginalValues();

		return donHangImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		donHangId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		cuaHangId = objectInput.readLong();
		khachHangId = objectInput.readLong();
		hoatDong = objectInput.readBoolean();
		tongCong = objectInput.readInt();
		daThanhToan = objectInput.readBoolean();
		phiVanChuyen = objectInput.readInt();
		trangThaiDonHangId = objectInput.readLong();
		ngayThanhToan = objectInput.readLong();
		khachDua = objectInput.readInt();
		traLai = objectInput.readInt();
		thueVAT = objectInput.readInt();
		diemTichLuy = objectInput.readInt();
		thanhToanTienMat = objectInput.readInt();
		thanhToanThe = objectInput.readInt();
		thanhToanChuyenKhoan = objectInput.readInt();
		phieuGiamGiaId = objectInput.readLong();
		truTichLuy = objectInput.readInt();
		inHoaDonLan = objectInput.readInt();
		maDonHang = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(donHangId);
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
		objectOutput.writeLong(cuaHangId);
		objectOutput.writeLong(khachHangId);
		objectOutput.writeBoolean(hoatDong);
		objectOutput.writeInt(tongCong);
		objectOutput.writeBoolean(daThanhToan);
		objectOutput.writeInt(phiVanChuyen);
		objectOutput.writeLong(trangThaiDonHangId);
		objectOutput.writeLong(ngayThanhToan);
		objectOutput.writeInt(khachDua);
		objectOutput.writeInt(traLai);
		objectOutput.writeInt(thueVAT);
		objectOutput.writeInt(diemTichLuy);
		objectOutput.writeInt(thanhToanTienMat);
		objectOutput.writeInt(thanhToanThe);
		objectOutput.writeInt(thanhToanChuyenKhoan);
		objectOutput.writeLong(phieuGiamGiaId);
		objectOutput.writeInt(truTichLuy);
		objectOutput.writeInt(inHoaDonLan);

		if (maDonHang == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maDonHang);
		}
	}

	public long donHangId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long cuaHangId;
	public long khachHangId;
	public boolean hoatDong;
	public int tongCong;
	public boolean daThanhToan;
	public int phiVanChuyen;
	public long trangThaiDonHangId;
	public long ngayThanhToan;
	public int khachDua;
	public int traLai;
	public int thueVAT;
	public int diemTichLuy;
	public int thanhToanTienMat;
	public int thanhToanThe;
	public int thanhToanChuyenKhoan;
	public long phieuGiamGiaId;
	public int truTichLuy;
	public int inHoaDonLan;
	public String maDonHang;
}