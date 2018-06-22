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

package com.minimart.portlet.danhmucchung.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Duong}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see Duong
 * @generated
 */
public class DuongWrapper implements Duong, ModelWrapper<Duong> {
	public DuongWrapper(Duong duong) {
		_duong = duong;
	}

	@Override
	public Class<?> getModelClass() {
		return Duong.class;
	}

	@Override
	public String getModelClassName() {
		return Duong.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("duongId", getDuongId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("ma", getMa());
		attributes.put("trangThai", getTrangThai());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long duongId = (Long)attributes.get("duongId");

		if (duongId != null) {
			setDuongId(duongId);
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

		String ma = (String)attributes.get("ma");

		if (ma != null) {
			setMa(ma);
		}

		Boolean trangThai = (Boolean)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}
	}

	/**
	* Returns the primary key of this duong.
	*
	* @return the primary key of this duong
	*/
	@Override
	public long getPrimaryKey() {
		return _duong.getPrimaryKey();
	}

	/**
	* Sets the primary key of this duong.
	*
	* @param primaryKey the primary key of this duong
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_duong.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the duong ID of this duong.
	*
	* @return the duong ID of this duong
	*/
	@Override
	public long getDuongId() {
		return _duong.getDuongId();
	}

	/**
	* Sets the duong ID of this duong.
	*
	* @param duongId the duong ID of this duong
	*/
	@Override
	public void setDuongId(long duongId) {
		_duong.setDuongId(duongId);
	}

	/**
	* Returns the company ID of this duong.
	*
	* @return the company ID of this duong
	*/
	@Override
	public long getCompanyId() {
		return _duong.getCompanyId();
	}

	/**
	* Sets the company ID of this duong.
	*
	* @param companyId the company ID of this duong
	*/
	@Override
	public void setCompanyId(long companyId) {
		_duong.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this duong.
	*
	* @return the user ID of this duong
	*/
	@Override
	public long getUserId() {
		return _duong.getUserId();
	}

	/**
	* Sets the user ID of this duong.
	*
	* @param userId the user ID of this duong
	*/
	@Override
	public void setUserId(long userId) {
		_duong.setUserId(userId);
	}

	/**
	* Returns the user uuid of this duong.
	*
	* @return the user uuid of this duong
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _duong.getUserUuid();
	}

	/**
	* Sets the user uuid of this duong.
	*
	* @param userUuid the user uuid of this duong
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_duong.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this duong.
	*
	* @return the user name of this duong
	*/
	@Override
	public java.lang.String getUserName() {
		return _duong.getUserName();
	}

	/**
	* Sets the user name of this duong.
	*
	* @param userName the user name of this duong
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_duong.setUserName(userName);
	}

	/**
	* Returns the create date of this duong.
	*
	* @return the create date of this duong
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _duong.getCreateDate();
	}

	/**
	* Sets the create date of this duong.
	*
	* @param createDate the create date of this duong
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_duong.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this duong.
	*
	* @return the modified date of this duong
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _duong.getModifiedDate();
	}

	/**
	* Sets the modified date of this duong.
	*
	* @param modifiedDate the modified date of this duong
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_duong.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the ten of this duong.
	*
	* @return the ten of this duong
	*/
	@Override
	public java.lang.String getTen() {
		return _duong.getTen();
	}

	/**
	* Sets the ten of this duong.
	*
	* @param ten the ten of this duong
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_duong.setTen(ten);
	}

	/**
	* Returns the ma of this duong.
	*
	* @return the ma of this duong
	*/
	@Override
	public java.lang.String getMa() {
		return _duong.getMa();
	}

	/**
	* Sets the ma of this duong.
	*
	* @param ma the ma of this duong
	*/
	@Override
	public void setMa(java.lang.String ma) {
		_duong.setMa(ma);
	}

	/**
	* Returns the trang thai of this duong.
	*
	* @return the trang thai of this duong
	*/
	@Override
	public boolean getTrangThai() {
		return _duong.getTrangThai();
	}

	/**
	* Returns <code>true</code> if this duong is trang thai.
	*
	* @return <code>true</code> if this duong is trang thai; <code>false</code> otherwise
	*/
	@Override
	public boolean isTrangThai() {
		return _duong.isTrangThai();
	}

	/**
	* Sets whether this duong is trang thai.
	*
	* @param trangThai the trang thai of this duong
	*/
	@Override
	public void setTrangThai(boolean trangThai) {
		_duong.setTrangThai(trangThai);
	}

	@Override
	public boolean isNew() {
		return _duong.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_duong.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _duong.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_duong.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _duong.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _duong.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_duong.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _duong.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_duong.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_duong.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_duong.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DuongWrapper((Duong)_duong.clone());
	}

	@Override
	public int compareTo(com.minimart.portlet.danhmucchung.model.Duong duong) {
		return _duong.compareTo(duong);
	}

	@Override
	public int hashCode() {
		return _duong.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.minimart.portlet.danhmucchung.model.Duong> toCacheModel() {
		return _duong.toCacheModel();
	}

	@Override
	public com.minimart.portlet.danhmucchung.model.Duong toEscapedModel() {
		return new DuongWrapper(_duong.toEscapedModel());
	}

	@Override
	public com.minimart.portlet.danhmucchung.model.Duong toUnescapedModel() {
		return new DuongWrapper(_duong.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _duong.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _duong.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_duong.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DuongWrapper)) {
			return false;
		}

		DuongWrapper duongWrapper = (DuongWrapper)obj;

		if (Validator.equals(_duong, duongWrapper._duong)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Duong getWrappedDuong() {
		return _duong;
	}

	@Override
	public Duong getWrappedModel() {
		return _duong;
	}

	@Override
	public void resetOriginalValues() {
		_duong.resetOriginalValues();
	}

	private Duong _duong;
}