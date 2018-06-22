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

package com.minimart.portlet.khachhang.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link KhachHang}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see KhachHang
 * @generated
 */
public class KhachHangWrapper implements KhachHang, ModelWrapper<KhachHang> {
	public KhachHangWrapper(KhachHang khachHang) {
		_khachHang = khachHang;
	}

	@Override
	public Class<?> getModelClass() {
		return KhachHang.class;
	}

	@Override
	public String getModelClassName() {
		return KhachHang.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("khachHangId", getKhachHangId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("nhomKhachHangId", getNhomKhachHangId());
		attributes.put("ma", getMa());
		attributes.put("diaChi", getDiaChi());
		attributes.put("dienThoai", getDienThoai());
		attributes.put("email", getEmail());
		attributes.put("facebook", getFacebook());
		attributes.put("twitter", getTwitter());
		attributes.put("socialMedia1", getSocialMedia1());
		attributes.put("socialMedia2", getSocialMedia2());
		attributes.put("socialMedia3", getSocialMedia3());
		attributes.put("trangThai", getTrangThai());
		attributes.put("diemTichLuy", getDiemTichLuy());
		attributes.put("maSoThue", getMaSoThue());
		attributes.put("hoatDong", getHoatDong());
		attributes.put("ngaySinh", getNgaySinh());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long khachHangId = (Long)attributes.get("khachHangId");

		if (khachHangId != null) {
			setKhachHangId(khachHangId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String ten = (String)attributes.get("ten");

		if (ten != null) {
			setTen(ten);
		}

		Long nhomKhachHangId = (Long)attributes.get("nhomKhachHangId");

		if (nhomKhachHangId != null) {
			setNhomKhachHangId(nhomKhachHangId);
		}

		String ma = (String)attributes.get("ma");

		if (ma != null) {
			setMa(ma);
		}

		String diaChi = (String)attributes.get("diaChi");

		if (diaChi != null) {
			setDiaChi(diaChi);
		}

		String dienThoai = (String)attributes.get("dienThoai");

		if (dienThoai != null) {
			setDienThoai(dienThoai);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String facebook = (String)attributes.get("facebook");

		if (facebook != null) {
			setFacebook(facebook);
		}

		String twitter = (String)attributes.get("twitter");

		if (twitter != null) {
			setTwitter(twitter);
		}

		String socialMedia1 = (String)attributes.get("socialMedia1");

		if (socialMedia1 != null) {
			setSocialMedia1(socialMedia1);
		}

		String socialMedia2 = (String)attributes.get("socialMedia2");

		if (socialMedia2 != null) {
			setSocialMedia2(socialMedia2);
		}

		String socialMedia3 = (String)attributes.get("socialMedia3");

		if (socialMedia3 != null) {
			setSocialMedia3(socialMedia3);
		}

		Integer trangThai = (Integer)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		Integer diemTichLuy = (Integer)attributes.get("diemTichLuy");

		if (diemTichLuy != null) {
			setDiemTichLuy(diemTichLuy);
		}

		String maSoThue = (String)attributes.get("maSoThue");

		if (maSoThue != null) {
			setMaSoThue(maSoThue);
		}

		Boolean hoatDong = (Boolean)attributes.get("hoatDong");

		if (hoatDong != null) {
			setHoatDong(hoatDong);
		}

		Date ngaySinh = (Date)attributes.get("ngaySinh");

		if (ngaySinh != null) {
			setNgaySinh(ngaySinh);
		}
	}

	/**
	* Returns the primary key of this khach hang.
	*
	* @return the primary key of this khach hang
	*/
	@Override
	public long getPrimaryKey() {
		return _khachHang.getPrimaryKey();
	}

	/**
	* Sets the primary key of this khach hang.
	*
	* @param primaryKey the primary key of this khach hang
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_khachHang.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the khach hang ID of this khach hang.
	*
	* @return the khach hang ID of this khach hang
	*/
	@Override
	public long getKhachHangId() {
		return _khachHang.getKhachHangId();
	}

	/**
	* Sets the khach hang ID of this khach hang.
	*
	* @param khachHangId the khach hang ID of this khach hang
	*/
	@Override
	public void setKhachHangId(long khachHangId) {
		_khachHang.setKhachHangId(khachHangId);
	}

	/**
	* Returns the company ID of this khach hang.
	*
	* @return the company ID of this khach hang
	*/
	@Override
	public long getCompanyId() {
		return _khachHang.getCompanyId();
	}

	/**
	* Sets the company ID of this khach hang.
	*
	* @param companyId the company ID of this khach hang
	*/
	@Override
	public void setCompanyId(long companyId) {
		_khachHang.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this khach hang.
	*
	* @return the user ID of this khach hang
	*/
	@Override
	public long getUserId() {
		return _khachHang.getUserId();
	}

	/**
	* Sets the user ID of this khach hang.
	*
	* @param userId the user ID of this khach hang
	*/
	@Override
	public void setUserId(long userId) {
		_khachHang.setUserId(userId);
	}

	/**
	* Returns the user uuid of this khach hang.
	*
	* @return the user uuid of this khach hang
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _khachHang.getUserUuid();
	}

	/**
	* Sets the user uuid of this khach hang.
	*
	* @param userUuid the user uuid of this khach hang
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_khachHang.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this khach hang.
	*
	* @return the user name of this khach hang
	*/
	@Override
	public java.lang.String getUserName() {
		return _khachHang.getUserName();
	}

	/**
	* Sets the user name of this khach hang.
	*
	* @param userName the user name of this khach hang
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_khachHang.setUserName(userName);
	}

	/**
	* Returns the create date of this khach hang.
	*
	* @return the create date of this khach hang
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _khachHang.getCreateDate();
	}

	/**
	* Sets the create date of this khach hang.
	*
	* @param createDate the create date of this khach hang
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_khachHang.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this khach hang.
	*
	* @return the modified date of this khach hang
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _khachHang.getModifiedDate();
	}

	/**
	* Sets the modified date of this khach hang.
	*
	* @param modifiedDate the modified date of this khach hang
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_khachHang.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the ten of this khach hang.
	*
	* @return the ten of this khach hang
	*/
	@Override
	public java.lang.String getTen() {
		return _khachHang.getTen();
	}

	/**
	* Sets the ten of this khach hang.
	*
	* @param ten the ten of this khach hang
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_khachHang.setTen(ten);
	}

	/**
	* Returns the nhom khach hang ID of this khach hang.
	*
	* @return the nhom khach hang ID of this khach hang
	*/
	@Override
	public long getNhomKhachHangId() {
		return _khachHang.getNhomKhachHangId();
	}

	/**
	* Sets the nhom khach hang ID of this khach hang.
	*
	* @param nhomKhachHangId the nhom khach hang ID of this khach hang
	*/
	@Override
	public void setNhomKhachHangId(long nhomKhachHangId) {
		_khachHang.setNhomKhachHangId(nhomKhachHangId);
	}

	/**
	* Returns the ma of this khach hang.
	*
	* @return the ma of this khach hang
	*/
	@Override
	public java.lang.String getMa() {
		return _khachHang.getMa();
	}

	/**
	* Sets the ma of this khach hang.
	*
	* @param ma the ma of this khach hang
	*/
	@Override
	public void setMa(java.lang.String ma) {
		_khachHang.setMa(ma);
	}

	/**
	* Returns the dia chi of this khach hang.
	*
	* @return the dia chi of this khach hang
	*/
	@Override
	public java.lang.String getDiaChi() {
		return _khachHang.getDiaChi();
	}

	/**
	* Sets the dia chi of this khach hang.
	*
	* @param diaChi the dia chi of this khach hang
	*/
	@Override
	public void setDiaChi(java.lang.String diaChi) {
		_khachHang.setDiaChi(diaChi);
	}

	/**
	* Returns the dien thoai of this khach hang.
	*
	* @return the dien thoai of this khach hang
	*/
	@Override
	public java.lang.String getDienThoai() {
		return _khachHang.getDienThoai();
	}

	/**
	* Sets the dien thoai of this khach hang.
	*
	* @param dienThoai the dien thoai of this khach hang
	*/
	@Override
	public void setDienThoai(java.lang.String dienThoai) {
		_khachHang.setDienThoai(dienThoai);
	}

	/**
	* Returns the email of this khach hang.
	*
	* @return the email of this khach hang
	*/
	@Override
	public java.lang.String getEmail() {
		return _khachHang.getEmail();
	}

	/**
	* Sets the email of this khach hang.
	*
	* @param email the email of this khach hang
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_khachHang.setEmail(email);
	}

	/**
	* Returns the facebook of this khach hang.
	*
	* @return the facebook of this khach hang
	*/
	@Override
	public java.lang.String getFacebook() {
		return _khachHang.getFacebook();
	}

	/**
	* Sets the facebook of this khach hang.
	*
	* @param facebook the facebook of this khach hang
	*/
	@Override
	public void setFacebook(java.lang.String facebook) {
		_khachHang.setFacebook(facebook);
	}

	/**
	* Returns the twitter of this khach hang.
	*
	* @return the twitter of this khach hang
	*/
	@Override
	public java.lang.String getTwitter() {
		return _khachHang.getTwitter();
	}

	/**
	* Sets the twitter of this khach hang.
	*
	* @param twitter the twitter of this khach hang
	*/
	@Override
	public void setTwitter(java.lang.String twitter) {
		_khachHang.setTwitter(twitter);
	}

	/**
	* Returns the social media1 of this khach hang.
	*
	* @return the social media1 of this khach hang
	*/
	@Override
	public java.lang.String getSocialMedia1() {
		return _khachHang.getSocialMedia1();
	}

	/**
	* Sets the social media1 of this khach hang.
	*
	* @param socialMedia1 the social media1 of this khach hang
	*/
	@Override
	public void setSocialMedia1(java.lang.String socialMedia1) {
		_khachHang.setSocialMedia1(socialMedia1);
	}

	/**
	* Returns the social media2 of this khach hang.
	*
	* @return the social media2 of this khach hang
	*/
	@Override
	public java.lang.String getSocialMedia2() {
		return _khachHang.getSocialMedia2();
	}

	/**
	* Sets the social media2 of this khach hang.
	*
	* @param socialMedia2 the social media2 of this khach hang
	*/
	@Override
	public void setSocialMedia2(java.lang.String socialMedia2) {
		_khachHang.setSocialMedia2(socialMedia2);
	}

	/**
	* Returns the social media3 of this khach hang.
	*
	* @return the social media3 of this khach hang
	*/
	@Override
	public java.lang.String getSocialMedia3() {
		return _khachHang.getSocialMedia3();
	}

	/**
	* Sets the social media3 of this khach hang.
	*
	* @param socialMedia3 the social media3 of this khach hang
	*/
	@Override
	public void setSocialMedia3(java.lang.String socialMedia3) {
		_khachHang.setSocialMedia3(socialMedia3);
	}

	/**
	* Returns the trang thai of this khach hang.
	*
	* @return the trang thai of this khach hang
	*/
	@Override
	public int getTrangThai() {
		return _khachHang.getTrangThai();
	}

	/**
	* Sets the trang thai of this khach hang.
	*
	* @param trangThai the trang thai of this khach hang
	*/
	@Override
	public void setTrangThai(int trangThai) {
		_khachHang.setTrangThai(trangThai);
	}

	/**
	* Returns the diem tich luy of this khach hang.
	*
	* @return the diem tich luy of this khach hang
	*/
	@Override
	public int getDiemTichLuy() {
		return _khachHang.getDiemTichLuy();
	}

	/**
	* Sets the diem tich luy of this khach hang.
	*
	* @param diemTichLuy the diem tich luy of this khach hang
	*/
	@Override
	public void setDiemTichLuy(int diemTichLuy) {
		_khachHang.setDiemTichLuy(diemTichLuy);
	}

	/**
	* Returns the ma so thue of this khach hang.
	*
	* @return the ma so thue of this khach hang
	*/
	@Override
	public java.lang.String getMaSoThue() {
		return _khachHang.getMaSoThue();
	}

	/**
	* Sets the ma so thue of this khach hang.
	*
	* @param maSoThue the ma so thue of this khach hang
	*/
	@Override
	public void setMaSoThue(java.lang.String maSoThue) {
		_khachHang.setMaSoThue(maSoThue);
	}

	/**
	* Returns the hoat dong of this khach hang.
	*
	* @return the hoat dong of this khach hang
	*/
	@Override
	public boolean getHoatDong() {
		return _khachHang.getHoatDong();
	}

	/**
	* Returns <code>true</code> if this khach hang is hoat dong.
	*
	* @return <code>true</code> if this khach hang is hoat dong; <code>false</code> otherwise
	*/
	@Override
	public boolean isHoatDong() {
		return _khachHang.isHoatDong();
	}

	/**
	* Sets whether this khach hang is hoat dong.
	*
	* @param hoatDong the hoat dong of this khach hang
	*/
	@Override
	public void setHoatDong(boolean hoatDong) {
		_khachHang.setHoatDong(hoatDong);
	}

	/**
	* Returns the ngay sinh of this khach hang.
	*
	* @return the ngay sinh of this khach hang
	*/
	@Override
	public java.util.Date getNgaySinh() {
		return _khachHang.getNgaySinh();
	}

	/**
	* Sets the ngay sinh of this khach hang.
	*
	* @param ngaySinh the ngay sinh of this khach hang
	*/
	@Override
	public void setNgaySinh(java.util.Date ngaySinh) {
		_khachHang.setNgaySinh(ngaySinh);
	}

	@Override
	public boolean isNew() {
		return _khachHang.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_khachHang.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _khachHang.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_khachHang.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _khachHang.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _khachHang.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_khachHang.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _khachHang.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_khachHang.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_khachHang.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_khachHang.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new KhachHangWrapper((KhachHang)_khachHang.clone());
	}

	@Override
	public int compareTo(
		com.minimart.portlet.khachhang.model.KhachHang khachHang) {
		return _khachHang.compareTo(khachHang);
	}

	@Override
	public int hashCode() {
		return _khachHang.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.minimart.portlet.khachhang.model.KhachHang> toCacheModel() {
		return _khachHang.toCacheModel();
	}

	@Override
	public com.minimart.portlet.khachhang.model.KhachHang toEscapedModel() {
		return new KhachHangWrapper(_khachHang.toEscapedModel());
	}

	@Override
	public com.minimart.portlet.khachhang.model.KhachHang toUnescapedModel() {
		return new KhachHangWrapper(_khachHang.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _khachHang.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _khachHang.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_khachHang.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KhachHangWrapper)) {
			return false;
		}

		KhachHangWrapper khachHangWrapper = (KhachHangWrapper)obj;

		if (Validator.equals(_khachHang, khachHangWrapper._khachHang)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public KhachHang getWrappedKhachHang() {
		return _khachHang;
	}

	@Override
	public KhachHang getWrappedModel() {
		return _khachHang;
	}

	@Override
	public void resetOriginalValues() {
		_khachHang.resetOriginalValues();
	}

	private KhachHang _khachHang;
}