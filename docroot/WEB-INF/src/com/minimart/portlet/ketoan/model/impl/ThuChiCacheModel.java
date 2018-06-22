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

package com.minimart.portlet.ketoan.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.minimart.portlet.ketoan.model.ThuChi;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ThuChi in entity cache.
 *
 * @author Mai Thành Duy An
 * @see ThuChi
 * @generated
 */
public class ThuChiCacheModel implements CacheModel<ThuChi>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{thuChiId=");
		sb.append(thuChiId);
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
		sb.append(", tenDoiTuong=");
		sb.append(tenDoiTuong);
		sb.append(", diaChiId=");
		sb.append(diaChiId);
		sb.append(", loai=");
		sb.append(loai);
		sb.append(", loaiDoiTuong=");
		sb.append(loaiDoiTuong);
		sb.append(", thu=");
		sb.append(thu);
		sb.append(", chi=");
		sb.append(chi);
		sb.append(", nhaCungCapId=");
		sb.append(nhaCungCapId);
		sb.append(", khachHangId=");
		sb.append(khachHangId);
		sb.append(", nhanVienId=");
		sb.append(nhanVienId);
		sb.append(", theTraTruocId=");
		sb.append(theTraTruocId);
		sb.append(", taiKhoanNganHangId=");
		sb.append(taiKhoanNganHangId);
		sb.append(", datHangId=");
		sb.append(datHangId);
		sb.append(", bangLuongId=");
		sb.append(bangLuongId);
		sb.append(", lyDoThuChi=");
		sb.append(lyDoThuChi);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ThuChi toEntityModel() {
		ThuChiImpl thuChiImpl = new ThuChiImpl();

		thuChiImpl.setThuChiId(thuChiId);
		thuChiImpl.setCompanyId(companyId);
		thuChiImpl.setUserId(userId);

		if (userName == null) {
			thuChiImpl.setUserName(StringPool.BLANK);
		}
		else {
			thuChiImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			thuChiImpl.setCreateDate(null);
		}
		else {
			thuChiImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			thuChiImpl.setModifiedDate(null);
		}
		else {
			thuChiImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (ten == null) {
			thuChiImpl.setTen(StringPool.BLANK);
		}
		else {
			thuChiImpl.setTen(ten);
		}

		if (tenDoiTuong == null) {
			thuChiImpl.setTenDoiTuong(StringPool.BLANK);
		}
		else {
			thuChiImpl.setTenDoiTuong(tenDoiTuong);
		}

		thuChiImpl.setDiaChiId(diaChiId);
		thuChiImpl.setLoai(loai);
		thuChiImpl.setLoaiDoiTuong(loaiDoiTuong);
		thuChiImpl.setThu(thu);
		thuChiImpl.setChi(chi);
		thuChiImpl.setNhaCungCapId(nhaCungCapId);
		thuChiImpl.setKhachHangId(khachHangId);
		thuChiImpl.setNhanVienId(nhanVienId);
		thuChiImpl.setTheTraTruocId(theTraTruocId);
		thuChiImpl.setTaiKhoanNganHangId(taiKhoanNganHangId);
		thuChiImpl.setDatHangId(datHangId);
		thuChiImpl.setBangLuongId(bangLuongId);

		if (lyDoThuChi == null) {
			thuChiImpl.setLyDoThuChi(StringPool.BLANK);
		}
		else {
			thuChiImpl.setLyDoThuChi(lyDoThuChi);
		}

		thuChiImpl.resetOriginalValues();

		return thuChiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		thuChiId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		ten = objectInput.readUTF();
		tenDoiTuong = objectInput.readUTF();
		diaChiId = objectInput.readLong();
		loai = objectInput.readInt();
		loaiDoiTuong = objectInput.readInt();
		thu = objectInput.readInt();
		chi = objectInput.readInt();
		nhaCungCapId = objectInput.readLong();
		khachHangId = objectInput.readLong();
		nhanVienId = objectInput.readLong();
		theTraTruocId = objectInput.readLong();
		taiKhoanNganHangId = objectInput.readLong();
		datHangId = objectInput.readLong();
		bangLuongId = objectInput.readLong();
		lyDoThuChi = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(thuChiId);
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

		if (tenDoiTuong == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenDoiTuong);
		}

		objectOutput.writeLong(diaChiId);
		objectOutput.writeInt(loai);
		objectOutput.writeInt(loaiDoiTuong);
		objectOutput.writeInt(thu);
		objectOutput.writeInt(chi);
		objectOutput.writeLong(nhaCungCapId);
		objectOutput.writeLong(khachHangId);
		objectOutput.writeLong(nhanVienId);
		objectOutput.writeLong(theTraTruocId);
		objectOutput.writeLong(taiKhoanNganHangId);
		objectOutput.writeLong(datHangId);
		objectOutput.writeLong(bangLuongId);

		if (lyDoThuChi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lyDoThuChi);
		}
	}

	public long thuChiId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String ten;
	public String tenDoiTuong;
	public long diaChiId;
	public int loai;
	public int loaiDoiTuong;
	public int thu;
	public int chi;
	public long nhaCungCapId;
	public long khachHangId;
	public long nhanVienId;
	public long theTraTruocId;
	public long taiKhoanNganHangId;
	public long datHangId;
	public long bangLuongId;
	public String lyDoThuChi;
}