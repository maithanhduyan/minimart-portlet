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
 * This class is a wrapper for {@link NhomNhaCungCap}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see NhomNhaCungCap
 * @generated
 */
public class NhomNhaCungCapWrapper implements NhomNhaCungCap,
	ModelWrapper<NhomNhaCungCap> {
	public NhomNhaCungCapWrapper(NhomNhaCungCap nhomNhaCungCap) {
		_nhomNhaCungCap = nhomNhaCungCap;
	}

	@Override
	public Class<?> getModelClass() {
		return NhomNhaCungCap.class;
	}

	@Override
	public String getModelClassName() {
		return NhomNhaCungCap.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("nhomNhaCungCapId", getNhomNhaCungCapId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("hoatDong", getHoatDong());
		attributes.put("uuTien", getUuTien());
		attributes.put("image", getImage());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long nhomNhaCungCapId = (Long)attributes.get("nhomNhaCungCapId");

		if (nhomNhaCungCapId != null) {
			setNhomNhaCungCapId(nhomNhaCungCapId);
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

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		Boolean hoatDong = (Boolean)attributes.get("hoatDong");

		if (hoatDong != null) {
			setHoatDong(hoatDong);
		}

		Integer uuTien = (Integer)attributes.get("uuTien");

		if (uuTien != null) {
			setUuTien(uuTien);
		}

		String image = (String)attributes.get("image");

		if (image != null) {
			setImage(image);
		}
	}

	/**
	* Returns the primary key of this nhom nha cung cap.
	*
	* @return the primary key of this nhom nha cung cap
	*/
	@Override
	public long getPrimaryKey() {
		return _nhomNhaCungCap.getPrimaryKey();
	}

	/**
	* Sets the primary key of this nhom nha cung cap.
	*
	* @param primaryKey the primary key of this nhom nha cung cap
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_nhomNhaCungCap.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the nhom nha cung cap ID of this nhom nha cung cap.
	*
	* @return the nhom nha cung cap ID of this nhom nha cung cap
	*/
	@Override
	public long getNhomNhaCungCapId() {
		return _nhomNhaCungCap.getNhomNhaCungCapId();
	}

	/**
	* Sets the nhom nha cung cap ID of this nhom nha cung cap.
	*
	* @param nhomNhaCungCapId the nhom nha cung cap ID of this nhom nha cung cap
	*/
	@Override
	public void setNhomNhaCungCapId(long nhomNhaCungCapId) {
		_nhomNhaCungCap.setNhomNhaCungCapId(nhomNhaCungCapId);
	}

	/**
	* Returns the company ID of this nhom nha cung cap.
	*
	* @return the company ID of this nhom nha cung cap
	*/
	@Override
	public long getCompanyId() {
		return _nhomNhaCungCap.getCompanyId();
	}

	/**
	* Sets the company ID of this nhom nha cung cap.
	*
	* @param companyId the company ID of this nhom nha cung cap
	*/
	@Override
	public void setCompanyId(long companyId) {
		_nhomNhaCungCap.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this nhom nha cung cap.
	*
	* @return the user ID of this nhom nha cung cap
	*/
	@Override
	public long getUserId() {
		return _nhomNhaCungCap.getUserId();
	}

	/**
	* Sets the user ID of this nhom nha cung cap.
	*
	* @param userId the user ID of this nhom nha cung cap
	*/
	@Override
	public void setUserId(long userId) {
		_nhomNhaCungCap.setUserId(userId);
	}

	/**
	* Returns the user uuid of this nhom nha cung cap.
	*
	* @return the user uuid of this nhom nha cung cap
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhomNhaCungCap.getUserUuid();
	}

	/**
	* Sets the user uuid of this nhom nha cung cap.
	*
	* @param userUuid the user uuid of this nhom nha cung cap
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_nhomNhaCungCap.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this nhom nha cung cap.
	*
	* @return the user name of this nhom nha cung cap
	*/
	@Override
	public java.lang.String getUserName() {
		return _nhomNhaCungCap.getUserName();
	}

	/**
	* Sets the user name of this nhom nha cung cap.
	*
	* @param userName the user name of this nhom nha cung cap
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_nhomNhaCungCap.setUserName(userName);
	}

	/**
	* Returns the create date of this nhom nha cung cap.
	*
	* @return the create date of this nhom nha cung cap
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _nhomNhaCungCap.getCreateDate();
	}

	/**
	* Sets the create date of this nhom nha cung cap.
	*
	* @param createDate the create date of this nhom nha cung cap
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_nhomNhaCungCap.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this nhom nha cung cap.
	*
	* @return the modified date of this nhom nha cung cap
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _nhomNhaCungCap.getModifiedDate();
	}

	/**
	* Sets the modified date of this nhom nha cung cap.
	*
	* @param modifiedDate the modified date of this nhom nha cung cap
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_nhomNhaCungCap.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the ten of this nhom nha cung cap.
	*
	* @return the ten of this nhom nha cung cap
	*/
	@Override
	public java.lang.String getTen() {
		return _nhomNhaCungCap.getTen();
	}

	/**
	* Sets the ten of this nhom nha cung cap.
	*
	* @param ten the ten of this nhom nha cung cap
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_nhomNhaCungCap.setTen(ten);
	}

	/**
	* Returns the ghi chu of this nhom nha cung cap.
	*
	* @return the ghi chu of this nhom nha cung cap
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _nhomNhaCungCap.getGhiChu();
	}

	/**
	* Sets the ghi chu of this nhom nha cung cap.
	*
	* @param ghiChu the ghi chu of this nhom nha cung cap
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_nhomNhaCungCap.setGhiChu(ghiChu);
	}

	/**
	* Returns the hoat dong of this nhom nha cung cap.
	*
	* @return the hoat dong of this nhom nha cung cap
	*/
	@Override
	public boolean getHoatDong() {
		return _nhomNhaCungCap.getHoatDong();
	}

	/**
	* Returns <code>true</code> if this nhom nha cung cap is hoat dong.
	*
	* @return <code>true</code> if this nhom nha cung cap is hoat dong; <code>false</code> otherwise
	*/
	@Override
	public boolean isHoatDong() {
		return _nhomNhaCungCap.isHoatDong();
	}

	/**
	* Sets whether this nhom nha cung cap is hoat dong.
	*
	* @param hoatDong the hoat dong of this nhom nha cung cap
	*/
	@Override
	public void setHoatDong(boolean hoatDong) {
		_nhomNhaCungCap.setHoatDong(hoatDong);
	}

	/**
	* Returns the uu tien of this nhom nha cung cap.
	*
	* @return the uu tien of this nhom nha cung cap
	*/
	@Override
	public int getUuTien() {
		return _nhomNhaCungCap.getUuTien();
	}

	/**
	* Sets the uu tien of this nhom nha cung cap.
	*
	* @param uuTien the uu tien of this nhom nha cung cap
	*/
	@Override
	public void setUuTien(int uuTien) {
		_nhomNhaCungCap.setUuTien(uuTien);
	}

	/**
	* Returns the image of this nhom nha cung cap.
	*
	* @return the image of this nhom nha cung cap
	*/
	@Override
	public java.lang.String getImage() {
		return _nhomNhaCungCap.getImage();
	}

	/**
	* Sets the image of this nhom nha cung cap.
	*
	* @param image the image of this nhom nha cung cap
	*/
	@Override
	public void setImage(java.lang.String image) {
		_nhomNhaCungCap.setImage(image);
	}

	@Override
	public boolean isNew() {
		return _nhomNhaCungCap.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_nhomNhaCungCap.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _nhomNhaCungCap.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_nhomNhaCungCap.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _nhomNhaCungCap.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _nhomNhaCungCap.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_nhomNhaCungCap.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _nhomNhaCungCap.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_nhomNhaCungCap.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_nhomNhaCungCap.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_nhomNhaCungCap.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new NhomNhaCungCapWrapper((NhomNhaCungCap)_nhomNhaCungCap.clone());
	}

	@Override
	public int compareTo(
		com.minimart.portlet.nhacungcap.model.NhomNhaCungCap nhomNhaCungCap) {
		return _nhomNhaCungCap.compareTo(nhomNhaCungCap);
	}

	@Override
	public int hashCode() {
		return _nhomNhaCungCap.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.minimart.portlet.nhacungcap.model.NhomNhaCungCap> toCacheModel() {
		return _nhomNhaCungCap.toCacheModel();
	}

	@Override
	public com.minimart.portlet.nhacungcap.model.NhomNhaCungCap toEscapedModel() {
		return new NhomNhaCungCapWrapper(_nhomNhaCungCap.toEscapedModel());
	}

	@Override
	public com.minimart.portlet.nhacungcap.model.NhomNhaCungCap toUnescapedModel() {
		return new NhomNhaCungCapWrapper(_nhomNhaCungCap.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _nhomNhaCungCap.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _nhomNhaCungCap.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_nhomNhaCungCap.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NhomNhaCungCapWrapper)) {
			return false;
		}

		NhomNhaCungCapWrapper nhomNhaCungCapWrapper = (NhomNhaCungCapWrapper)obj;

		if (Validator.equals(_nhomNhaCungCap,
					nhomNhaCungCapWrapper._nhomNhaCungCap)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public NhomNhaCungCap getWrappedNhomNhaCungCap() {
		return _nhomNhaCungCap;
	}

	@Override
	public NhomNhaCungCap getWrappedModel() {
		return _nhomNhaCungCap;
	}

	@Override
	public void resetOriginalValues() {
		_nhomNhaCungCap.resetOriginalValues();
	}

	private NhomNhaCungCap _nhomNhaCungCap;
}