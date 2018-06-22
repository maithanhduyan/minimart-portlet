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

package com.minimart.portlet.khachhang.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.minimart.portlet.khachhang.model.KhachHang;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing KhachHang in entity cache.
 *
 * @author Mai Thành Duy An
 * @see KhachHang
 * @generated
 */
public class KhachHangCacheModel implements CacheModel<KhachHang>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{khachHangId=");
		sb.append(khachHangId);
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
		sb.append(", nhomKhachHangId=");
		sb.append(nhomKhachHangId);
		sb.append(", ma=");
		sb.append(ma);
		sb.append(", diaChi=");
		sb.append(diaChi);
		sb.append(", dienThoai=");
		sb.append(dienThoai);
		sb.append(", email=");
		sb.append(email);
		sb.append(", facebook=");
		sb.append(facebook);
		sb.append(", twitter=");
		sb.append(twitter);
		sb.append(", socialMedia1=");
		sb.append(socialMedia1);
		sb.append(", socialMedia2=");
		sb.append(socialMedia2);
		sb.append(", socialMedia3=");
		sb.append(socialMedia3);
		sb.append(", trangThai=");
		sb.append(trangThai);
		sb.append(", diemTichLuy=");
		sb.append(diemTichLuy);
		sb.append(", maSoThue=");
		sb.append(maSoThue);
		sb.append(", hoatDong=");
		sb.append(hoatDong);
		sb.append(", ngaySinh=");
		sb.append(ngaySinh);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public KhachHang toEntityModel() {
		KhachHangImpl khachHangImpl = new KhachHangImpl();

		khachHangImpl.setKhachHangId(khachHangId);
		khachHangImpl.setCompanyId(companyId);
		khachHangImpl.setUserId(userId);

		if (userName == null) {
			khachHangImpl.setUserName(StringPool.BLANK);
		}
		else {
			khachHangImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			khachHangImpl.setCreateDate(null);
		}
		else {
			khachHangImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			khachHangImpl.setModifiedDate(null);
		}
		else {
			khachHangImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (ten == null) {
			khachHangImpl.setTen(StringPool.BLANK);
		}
		else {
			khachHangImpl.setTen(ten);
		}

		khachHangImpl.setNhomKhachHangId(nhomKhachHangId);

		if (ma == null) {
			khachHangImpl.setMa(StringPool.BLANK);
		}
		else {
			khachHangImpl.setMa(ma);
		}

		if (diaChi == null) {
			khachHangImpl.setDiaChi(StringPool.BLANK);
		}
		else {
			khachHangImpl.setDiaChi(diaChi);
		}

		if (dienThoai == null) {
			khachHangImpl.setDienThoai(StringPool.BLANK);
		}
		else {
			khachHangImpl.setDienThoai(dienThoai);
		}

		if (email == null) {
			khachHangImpl.setEmail(StringPool.BLANK);
		}
		else {
			khachHangImpl.setEmail(email);
		}

		if (facebook == null) {
			khachHangImpl.setFacebook(StringPool.BLANK);
		}
		else {
			khachHangImpl.setFacebook(facebook);
		}

		if (twitter == null) {
			khachHangImpl.setTwitter(StringPool.BLANK);
		}
		else {
			khachHangImpl.setTwitter(twitter);
		}

		if (socialMedia1 == null) {
			khachHangImpl.setSocialMedia1(StringPool.BLANK);
		}
		else {
			khachHangImpl.setSocialMedia1(socialMedia1);
		}

		if (socialMedia2 == null) {
			khachHangImpl.setSocialMedia2(StringPool.BLANK);
		}
		else {
			khachHangImpl.setSocialMedia2(socialMedia2);
		}

		if (socialMedia3 == null) {
			khachHangImpl.setSocialMedia3(StringPool.BLANK);
		}
		else {
			khachHangImpl.setSocialMedia3(socialMedia3);
		}

		khachHangImpl.setTrangThai(trangThai);
		khachHangImpl.setDiemTichLuy(diemTichLuy);

		if (maSoThue == null) {
			khachHangImpl.setMaSoThue(StringPool.BLANK);
		}
		else {
			khachHangImpl.setMaSoThue(maSoThue);
		}

		khachHangImpl.setHoatDong(hoatDong);

		if (ngaySinh == Long.MIN_VALUE) {
			khachHangImpl.setNgaySinh(null);
		}
		else {
			khachHangImpl.setNgaySinh(new Date(ngaySinh));
		}

		khachHangImpl.resetOriginalValues();

		return khachHangImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		khachHangId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		ten = objectInput.readUTF();
		nhomKhachHangId = objectInput.readLong();
		ma = objectInput.readUTF();
		diaChi = objectInput.readUTF();
		dienThoai = objectInput.readUTF();
		email = objectInput.readUTF();
		facebook = objectInput.readUTF();
		twitter = objectInput.readUTF();
		socialMedia1 = objectInput.readUTF();
		socialMedia2 = objectInput.readUTF();
		socialMedia3 = objectInput.readUTF();
		trangThai = objectInput.readInt();
		diemTichLuy = objectInput.readInt();
		maSoThue = objectInput.readUTF();
		hoatDong = objectInput.readBoolean();
		ngaySinh = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(khachHangId);
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

		objectOutput.writeLong(nhomKhachHangId);

		if (ma == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ma);
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

		if (facebook == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(facebook);
		}

		if (twitter == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(twitter);
		}

		if (socialMedia1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(socialMedia1);
		}

		if (socialMedia2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(socialMedia2);
		}

		if (socialMedia3 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(socialMedia3);
		}

		objectOutput.writeInt(trangThai);
		objectOutput.writeInt(diemTichLuy);

		if (maSoThue == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maSoThue);
		}

		objectOutput.writeBoolean(hoatDong);
		objectOutput.writeLong(ngaySinh);
	}

	public long khachHangId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String ten;
	public long nhomKhachHangId;
	public String ma;
	public String diaChi;
	public String dienThoai;
	public String email;
	public String facebook;
	public String twitter;
	public String socialMedia1;
	public String socialMedia2;
	public String socialMedia3;
	public int trangThai;
	public int diemTichLuy;
	public String maSoThue;
	public boolean hoatDong;
	public long ngaySinh;
}