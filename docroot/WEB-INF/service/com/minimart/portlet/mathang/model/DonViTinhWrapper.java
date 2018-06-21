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

package com.minimart.portlet.mathang.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DonViTinh}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see DonViTinh
 * @generated
 */
public class DonViTinhWrapper implements DonViTinh, ModelWrapper<DonViTinh> {
	public DonViTinhWrapper(DonViTinh donViTinh) {
		_donViTinh = donViTinh;
	}

	@Override
	public Class<?> getModelClass() {
		return DonViTinh.class;
	}

	@Override
	public String getModelClassName() {
		return DonViTinh.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("donViTinhId", getDonViTinhId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("status", getStatus());
		attributes.put("note", getNote());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long donViTinhId = (Long)attributes.get("donViTinhId");

		if (donViTinhId != null) {
			setDonViTinhId(donViTinhId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String note = (String)attributes.get("note");

		if (note != null) {
			setNote(note);
		}
	}

	/**
	* Returns the primary key of this don vi tinh.
	*
	* @return the primary key of this don vi tinh
	*/
	@Override
	public long getPrimaryKey() {
		return _donViTinh.getPrimaryKey();
	}

	/**
	* Sets the primary key of this don vi tinh.
	*
	* @param primaryKey the primary key of this don vi tinh
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_donViTinh.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the don vi tinh ID of this don vi tinh.
	*
	* @return the don vi tinh ID of this don vi tinh
	*/
	@Override
	public long getDonViTinhId() {
		return _donViTinh.getDonViTinhId();
	}

	/**
	* Sets the don vi tinh ID of this don vi tinh.
	*
	* @param donViTinhId the don vi tinh ID of this don vi tinh
	*/
	@Override
	public void setDonViTinhId(long donViTinhId) {
		_donViTinh.setDonViTinhId(donViTinhId);
	}

	/**
	* Returns the group ID of this don vi tinh.
	*
	* @return the group ID of this don vi tinh
	*/
	@Override
	public long getGroupId() {
		return _donViTinh.getGroupId();
	}

	/**
	* Sets the group ID of this don vi tinh.
	*
	* @param groupId the group ID of this don vi tinh
	*/
	@Override
	public void setGroupId(long groupId) {
		_donViTinh.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this don vi tinh.
	*
	* @return the company ID of this don vi tinh
	*/
	@Override
	public long getCompanyId() {
		return _donViTinh.getCompanyId();
	}

	/**
	* Sets the company ID of this don vi tinh.
	*
	* @param companyId the company ID of this don vi tinh
	*/
	@Override
	public void setCompanyId(long companyId) {
		_donViTinh.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this don vi tinh.
	*
	* @return the user ID of this don vi tinh
	*/
	@Override
	public long getUserId() {
		return _donViTinh.getUserId();
	}

	/**
	* Sets the user ID of this don vi tinh.
	*
	* @param userId the user ID of this don vi tinh
	*/
	@Override
	public void setUserId(long userId) {
		_donViTinh.setUserId(userId);
	}

	/**
	* Returns the user uuid of this don vi tinh.
	*
	* @return the user uuid of this don vi tinh
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _donViTinh.getUserUuid();
	}

	/**
	* Sets the user uuid of this don vi tinh.
	*
	* @param userUuid the user uuid of this don vi tinh
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_donViTinh.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this don vi tinh.
	*
	* @return the user name of this don vi tinh
	*/
	@Override
	public java.lang.String getUserName() {
		return _donViTinh.getUserName();
	}

	/**
	* Sets the user name of this don vi tinh.
	*
	* @param userName the user name of this don vi tinh
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_donViTinh.setUserName(userName);
	}

	/**
	* Returns the create date of this don vi tinh.
	*
	* @return the create date of this don vi tinh
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _donViTinh.getCreateDate();
	}

	/**
	* Sets the create date of this don vi tinh.
	*
	* @param createDate the create date of this don vi tinh
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_donViTinh.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this don vi tinh.
	*
	* @return the modified date of this don vi tinh
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _donViTinh.getModifiedDate();
	}

	/**
	* Sets the modified date of this don vi tinh.
	*
	* @param modifiedDate the modified date of this don vi tinh
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_donViTinh.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the name of this don vi tinh.
	*
	* @return the name of this don vi tinh
	*/
	@Override
	public java.lang.String getName() {
		return _donViTinh.getName();
	}

	/**
	* Sets the name of this don vi tinh.
	*
	* @param name the name of this don vi tinh
	*/
	@Override
	public void setName(java.lang.String name) {
		_donViTinh.setName(name);
	}

	/**
	* Returns the status of this don vi tinh.
	*
	* @return the status of this don vi tinh
	*/
	@Override
	public int getStatus() {
		return _donViTinh.getStatus();
	}

	/**
	* Sets the status of this don vi tinh.
	*
	* @param status the status of this don vi tinh
	*/
	@Override
	public void setStatus(int status) {
		_donViTinh.setStatus(status);
	}

	/**
	* Returns the note of this don vi tinh.
	*
	* @return the note of this don vi tinh
	*/
	@Override
	public java.lang.String getNote() {
		return _donViTinh.getNote();
	}

	/**
	* Sets the note of this don vi tinh.
	*
	* @param note the note of this don vi tinh
	*/
	@Override
	public void setNote(java.lang.String note) {
		_donViTinh.setNote(note);
	}

	@Override
	public boolean isNew() {
		return _donViTinh.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_donViTinh.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _donViTinh.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_donViTinh.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _donViTinh.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _donViTinh.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_donViTinh.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _donViTinh.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_donViTinh.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_donViTinh.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_donViTinh.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DonViTinhWrapper((DonViTinh)_donViTinh.clone());
	}

	@Override
	public int compareTo(com.minimart.portlet.mathang.model.DonViTinh donViTinh) {
		return _donViTinh.compareTo(donViTinh);
	}

	@Override
	public int hashCode() {
		return _donViTinh.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.minimart.portlet.mathang.model.DonViTinh> toCacheModel() {
		return _donViTinh.toCacheModel();
	}

	@Override
	public com.minimart.portlet.mathang.model.DonViTinh toEscapedModel() {
		return new DonViTinhWrapper(_donViTinh.toEscapedModel());
	}

	@Override
	public com.minimart.portlet.mathang.model.DonViTinh toUnescapedModel() {
		return new DonViTinhWrapper(_donViTinh.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _donViTinh.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _donViTinh.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_donViTinh.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DonViTinhWrapper)) {
			return false;
		}

		DonViTinhWrapper donViTinhWrapper = (DonViTinhWrapper)obj;

		if (Validator.equals(_donViTinh, donViTinhWrapper._donViTinh)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DonViTinh getWrappedDonViTinh() {
		return _donViTinh;
	}

	@Override
	public DonViTinh getWrappedModel() {
		return _donViTinh;
	}

	@Override
	public void resetOriginalValues() {
		_donViTinh.resetOriginalValues();
	}

	private DonViTinh _donViTinh;
}