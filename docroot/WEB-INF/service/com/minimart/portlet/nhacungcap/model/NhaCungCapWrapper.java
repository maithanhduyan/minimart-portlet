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

package com.minimart.portlet.nhacungcap.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link NhaCungCap}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see NhaCungCap
 * @generated
 */
public class NhaCungCapWrapper implements NhaCungCap, ModelWrapper<NhaCungCap> {
	public NhaCungCapWrapper(NhaCungCap nhaCungCap) {
		_nhaCungCap = nhaCungCap;
	}

	@Override
	public Class<?> getModelClass() {
		return NhaCungCap.class;
	}

	@Override
	public String getModelClassName() {
		return NhaCungCap.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("nhaCungCapId", getNhaCungCapId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("tenNhaCungCap", getTenNhaCungCap());
		attributes.put("nhomNhaCungCapId", getNhomNhaCungCapId());
		attributes.put("maNhaCungCap", getMaNhaCungCap());
		attributes.put("diaChi", getDiaChi());
		attributes.put("dienThoai", getDienThoai());
		attributes.put("email", getEmail());
		attributes.put("website", getWebsite());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("hoatDong", getHoatDong());
		attributes.put("doUuTien", getDoUuTien());
		attributes.put("logoURL", getLogoURL());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long nhaCungCapId = (Long)attributes.get("nhaCungCapId");

		if (nhaCungCapId != null) {
			setNhaCungCapId(nhaCungCapId);
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

		String tenNhaCungCap = (String)attributes.get("tenNhaCungCap");

		if (tenNhaCungCap != null) {
			setTenNhaCungCap(tenNhaCungCap);
		}

		Long nhomNhaCungCapId = (Long)attributes.get("nhomNhaCungCapId");

		if (nhomNhaCungCapId != null) {
			setNhomNhaCungCapId(nhomNhaCungCapId);
		}

		String maNhaCungCap = (String)attributes.get("maNhaCungCap");

		if (maNhaCungCap != null) {
			setMaNhaCungCap(maNhaCungCap);
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

		String website = (String)attributes.get("website");

		if (website != null) {
			setWebsite(website);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		Boolean hoatDong = (Boolean)attributes.get("hoatDong");

		if (hoatDong != null) {
			setHoatDong(hoatDong);
		}

		Integer doUuTien = (Integer)attributes.get("doUuTien");

		if (doUuTien != null) {
			setDoUuTien(doUuTien);
		}

		String logoURL = (String)attributes.get("logoURL");

		if (logoURL != null) {
			setLogoURL(logoURL);
		}
	}

	/**
	* Returns the primary key of this nha cung cap.
	*
	* @return the primary key of this nha cung cap
	*/
	@Override
	public long getPrimaryKey() {
		return _nhaCungCap.getPrimaryKey();
	}

	/**
	* Sets the primary key of this nha cung cap.
	*
	* @param primaryKey the primary key of this nha cung cap
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_nhaCungCap.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the nha cung cap ID of this nha cung cap.
	*
	* @return the nha cung cap ID of this nha cung cap
	*/
	@Override
	public long getNhaCungCapId() {
		return _nhaCungCap.getNhaCungCapId();
	}

	/**
	* Sets the nha cung cap ID of this nha cung cap.
	*
	* @param nhaCungCapId the nha cung cap ID of this nha cung cap
	*/
	@Override
	public void setNhaCungCapId(long nhaCungCapId) {
		_nhaCungCap.setNhaCungCapId(nhaCungCapId);
	}

	/**
	* Returns the company ID of this nha cung cap.
	*
	* @return the company ID of this nha cung cap
	*/
	@Override
	public long getCompanyId() {
		return _nhaCungCap.getCompanyId();
	}

	/**
	* Sets the company ID of this nha cung cap.
	*
	* @param companyId the company ID of this nha cung cap
	*/
	@Override
	public void setCompanyId(long companyId) {
		_nhaCungCap.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this nha cung cap.
	*
	* @return the user ID of this nha cung cap
	*/
	@Override
	public long getUserId() {
		return _nhaCungCap.getUserId();
	}

	/**
	* Sets the user ID of this nha cung cap.
	*
	* @param userId the user ID of this nha cung cap
	*/
	@Override
	public void setUserId(long userId) {
		_nhaCungCap.setUserId(userId);
	}

	/**
	* Returns the user uuid of this nha cung cap.
	*
	* @return the user uuid of this nha cung cap
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhaCungCap.getUserUuid();
	}

	/**
	* Sets the user uuid of this nha cung cap.
	*
	* @param userUuid the user uuid of this nha cung cap
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_nhaCungCap.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this nha cung cap.
	*
	* @return the user name of this nha cung cap
	*/
	@Override
	public java.lang.String getUserName() {
		return _nhaCungCap.getUserName();
	}

	/**
	* Sets the user name of this nha cung cap.
	*
	* @param userName the user name of this nha cung cap
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_nhaCungCap.setUserName(userName);
	}

	/**
	* Returns the create date of this nha cung cap.
	*
	* @return the create date of this nha cung cap
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _nhaCungCap.getCreateDate();
	}

	/**
	* Sets the create date of this nha cung cap.
	*
	* @param createDate the create date of this nha cung cap
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_nhaCungCap.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this nha cung cap.
	*
	* @return the modified date of this nha cung cap
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _nhaCungCap.getModifiedDate();
	}

	/**
	* Sets the modified date of this nha cung cap.
	*
	* @param modifiedDate the modified date of this nha cung cap
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_nhaCungCap.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the ten nha cung cap of this nha cung cap.
	*
	* @return the ten nha cung cap of this nha cung cap
	*/
	@Override
	public java.lang.String getTenNhaCungCap() {
		return _nhaCungCap.getTenNhaCungCap();
	}

	/**
	* Sets the ten nha cung cap of this nha cung cap.
	*
	* @param tenNhaCungCap the ten nha cung cap of this nha cung cap
	*/
	@Override
	public void setTenNhaCungCap(java.lang.String tenNhaCungCap) {
		_nhaCungCap.setTenNhaCungCap(tenNhaCungCap);
	}

	/**
	* Returns the nhom nha cung cap ID of this nha cung cap.
	*
	* @return the nhom nha cung cap ID of this nha cung cap
	*/
	@Override
	public long getNhomNhaCungCapId() {
		return _nhaCungCap.getNhomNhaCungCapId();
	}

	/**
	* Sets the nhom nha cung cap ID of this nha cung cap.
	*
	* @param nhomNhaCungCapId the nhom nha cung cap ID of this nha cung cap
	*/
	@Override
	public void setNhomNhaCungCapId(long nhomNhaCungCapId) {
		_nhaCungCap.setNhomNhaCungCapId(nhomNhaCungCapId);
	}

	/**
	* Returns the ma nha cung cap of this nha cung cap.
	*
	* @return the ma nha cung cap of this nha cung cap
	*/
	@Override
	public java.lang.String getMaNhaCungCap() {
		return _nhaCungCap.getMaNhaCungCap();
	}

	/**
	* Sets the ma nha cung cap of this nha cung cap.
	*
	* @param maNhaCungCap the ma nha cung cap of this nha cung cap
	*/
	@Override
	public void setMaNhaCungCap(java.lang.String maNhaCungCap) {
		_nhaCungCap.setMaNhaCungCap(maNhaCungCap);
	}

	/**
	* Returns the dia chi of this nha cung cap.
	*
	* @return the dia chi of this nha cung cap
	*/
	@Override
	public java.lang.String getDiaChi() {
		return _nhaCungCap.getDiaChi();
	}

	/**
	* Sets the dia chi of this nha cung cap.
	*
	* @param diaChi the dia chi of this nha cung cap
	*/
	@Override
	public void setDiaChi(java.lang.String diaChi) {
		_nhaCungCap.setDiaChi(diaChi);
	}

	/**
	* Returns the dien thoai of this nha cung cap.
	*
	* @return the dien thoai of this nha cung cap
	*/
	@Override
	public java.lang.String getDienThoai() {
		return _nhaCungCap.getDienThoai();
	}

	/**
	* Sets the dien thoai of this nha cung cap.
	*
	* @param dienThoai the dien thoai of this nha cung cap
	*/
	@Override
	public void setDienThoai(java.lang.String dienThoai) {
		_nhaCungCap.setDienThoai(dienThoai);
	}

	/**
	* Returns the email of this nha cung cap.
	*
	* @return the email of this nha cung cap
	*/
	@Override
	public java.lang.String getEmail() {
		return _nhaCungCap.getEmail();
	}

	/**
	* Sets the email of this nha cung cap.
	*
	* @param email the email of this nha cung cap
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_nhaCungCap.setEmail(email);
	}

	/**
	* Returns the website of this nha cung cap.
	*
	* @return the website of this nha cung cap
	*/
	@Override
	public java.lang.String getWebsite() {
		return _nhaCungCap.getWebsite();
	}

	/**
	* Sets the website of this nha cung cap.
	*
	* @param website the website of this nha cung cap
	*/
	@Override
	public void setWebsite(java.lang.String website) {
		_nhaCungCap.setWebsite(website);
	}

	/**
	* Returns the ghi chu of this nha cung cap.
	*
	* @return the ghi chu of this nha cung cap
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _nhaCungCap.getGhiChu();
	}

	/**
	* Sets the ghi chu of this nha cung cap.
	*
	* @param ghiChu the ghi chu of this nha cung cap
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_nhaCungCap.setGhiChu(ghiChu);
	}

	/**
	* Returns the hoat dong of this nha cung cap.
	*
	* @return the hoat dong of this nha cung cap
	*/
	@Override
	public boolean getHoatDong() {
		return _nhaCungCap.getHoatDong();
	}

	/**
	* Returns <code>true</code> if this nha cung cap is hoat dong.
	*
	* @return <code>true</code> if this nha cung cap is hoat dong; <code>false</code> otherwise
	*/
	@Override
	public boolean isHoatDong() {
		return _nhaCungCap.isHoatDong();
	}

	/**
	* Sets whether this nha cung cap is hoat dong.
	*
	* @param hoatDong the hoat dong of this nha cung cap
	*/
	@Override
	public void setHoatDong(boolean hoatDong) {
		_nhaCungCap.setHoatDong(hoatDong);
	}

	/**
	* Returns the do uu tien of this nha cung cap.
	*
	* @return the do uu tien of this nha cung cap
	*/
	@Override
	public int getDoUuTien() {
		return _nhaCungCap.getDoUuTien();
	}

	/**
	* Sets the do uu tien of this nha cung cap.
	*
	* @param doUuTien the do uu tien of this nha cung cap
	*/
	@Override
	public void setDoUuTien(int doUuTien) {
		_nhaCungCap.setDoUuTien(doUuTien);
	}

	/**
	* Returns the logo u r l of this nha cung cap.
	*
	* @return the logo u r l of this nha cung cap
	*/
	@Override
	public java.lang.String getLogoURL() {
		return _nhaCungCap.getLogoURL();
	}

	/**
	* Sets the logo u r l of this nha cung cap.
	*
	* @param logoURL the logo u r l of this nha cung cap
	*/
	@Override
	public void setLogoURL(java.lang.String logoURL) {
		_nhaCungCap.setLogoURL(logoURL);
	}

	@Override
	public boolean isNew() {
		return _nhaCungCap.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_nhaCungCap.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _nhaCungCap.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_nhaCungCap.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _nhaCungCap.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _nhaCungCap.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_nhaCungCap.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _nhaCungCap.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_nhaCungCap.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_nhaCungCap.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_nhaCungCap.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new NhaCungCapWrapper((NhaCungCap)_nhaCungCap.clone());
	}

	@Override
	public int compareTo(
		com.minimart.portlet.nhacungcap.model.NhaCungCap nhaCungCap) {
		return _nhaCungCap.compareTo(nhaCungCap);
	}

	@Override
	public int hashCode() {
		return _nhaCungCap.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.minimart.portlet.nhacungcap.model.NhaCungCap> toCacheModel() {
		return _nhaCungCap.toCacheModel();
	}

	@Override
	public com.minimart.portlet.nhacungcap.model.NhaCungCap toEscapedModel() {
		return new NhaCungCapWrapper(_nhaCungCap.toEscapedModel());
	}

	@Override
	public com.minimart.portlet.nhacungcap.model.NhaCungCap toUnescapedModel() {
		return new NhaCungCapWrapper(_nhaCungCap.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _nhaCungCap.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _nhaCungCap.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_nhaCungCap.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NhaCungCapWrapper)) {
			return false;
		}

		NhaCungCapWrapper nhaCungCapWrapper = (NhaCungCapWrapper)obj;

		if (Validator.equals(_nhaCungCap, nhaCungCapWrapper._nhaCungCap)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public NhaCungCap getWrappedNhaCungCap() {
		return _nhaCungCap;
	}

	@Override
	public NhaCungCap getWrappedModel() {
		return _nhaCungCap;
	}

	@Override
	public void resetOriginalValues() {
		_nhaCungCap.resetOriginalValues();
	}

	private NhaCungCap _nhaCungCap;
}