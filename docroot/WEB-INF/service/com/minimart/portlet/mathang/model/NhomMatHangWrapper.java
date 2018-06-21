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
 * This class is a wrapper for {@link NhomMatHang}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see NhomMatHang
 * @generated
 */
public class NhomMatHangWrapper implements NhomMatHang,
	ModelWrapper<NhomMatHang> {
	public NhomMatHangWrapper(NhomMatHang nhomMatHang) {
		_nhomMatHang = nhomMatHang;
	}

	@Override
	public Class<?> getModelClass() {
		return NhomMatHang.class;
	}

	@Override
	public String getModelClassName() {
		return NhomMatHang.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("nhomMatHangId", getNhomMatHangId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("code", getCode());
		attributes.put("status", getStatus());
		attributes.put("note", getNote());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long nhomMatHangId = (Long)attributes.get("nhomMatHangId");

		if (nhomMatHangId != null) {
			setNhomMatHangId(nhomMatHangId);
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

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
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
	* Returns the primary key of this nhom mat hang.
	*
	* @return the primary key of this nhom mat hang
	*/
	@Override
	public long getPrimaryKey() {
		return _nhomMatHang.getPrimaryKey();
	}

	/**
	* Sets the primary key of this nhom mat hang.
	*
	* @param primaryKey the primary key of this nhom mat hang
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_nhomMatHang.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the nhom mat hang ID of this nhom mat hang.
	*
	* @return the nhom mat hang ID of this nhom mat hang
	*/
	@Override
	public long getNhomMatHangId() {
		return _nhomMatHang.getNhomMatHangId();
	}

	/**
	* Sets the nhom mat hang ID of this nhom mat hang.
	*
	* @param nhomMatHangId the nhom mat hang ID of this nhom mat hang
	*/
	@Override
	public void setNhomMatHangId(long nhomMatHangId) {
		_nhomMatHang.setNhomMatHangId(nhomMatHangId);
	}

	/**
	* Returns the group ID of this nhom mat hang.
	*
	* @return the group ID of this nhom mat hang
	*/
	@Override
	public long getGroupId() {
		return _nhomMatHang.getGroupId();
	}

	/**
	* Sets the group ID of this nhom mat hang.
	*
	* @param groupId the group ID of this nhom mat hang
	*/
	@Override
	public void setGroupId(long groupId) {
		_nhomMatHang.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this nhom mat hang.
	*
	* @return the company ID of this nhom mat hang
	*/
	@Override
	public long getCompanyId() {
		return _nhomMatHang.getCompanyId();
	}

	/**
	* Sets the company ID of this nhom mat hang.
	*
	* @param companyId the company ID of this nhom mat hang
	*/
	@Override
	public void setCompanyId(long companyId) {
		_nhomMatHang.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this nhom mat hang.
	*
	* @return the user ID of this nhom mat hang
	*/
	@Override
	public long getUserId() {
		return _nhomMatHang.getUserId();
	}

	/**
	* Sets the user ID of this nhom mat hang.
	*
	* @param userId the user ID of this nhom mat hang
	*/
	@Override
	public void setUserId(long userId) {
		_nhomMatHang.setUserId(userId);
	}

	/**
	* Returns the user uuid of this nhom mat hang.
	*
	* @return the user uuid of this nhom mat hang
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhomMatHang.getUserUuid();
	}

	/**
	* Sets the user uuid of this nhom mat hang.
	*
	* @param userUuid the user uuid of this nhom mat hang
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_nhomMatHang.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this nhom mat hang.
	*
	* @return the user name of this nhom mat hang
	*/
	@Override
	public java.lang.String getUserName() {
		return _nhomMatHang.getUserName();
	}

	/**
	* Sets the user name of this nhom mat hang.
	*
	* @param userName the user name of this nhom mat hang
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_nhomMatHang.setUserName(userName);
	}

	/**
	* Returns the create date of this nhom mat hang.
	*
	* @return the create date of this nhom mat hang
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _nhomMatHang.getCreateDate();
	}

	/**
	* Sets the create date of this nhom mat hang.
	*
	* @param createDate the create date of this nhom mat hang
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_nhomMatHang.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this nhom mat hang.
	*
	* @return the modified date of this nhom mat hang
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _nhomMatHang.getModifiedDate();
	}

	/**
	* Sets the modified date of this nhom mat hang.
	*
	* @param modifiedDate the modified date of this nhom mat hang
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_nhomMatHang.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the name of this nhom mat hang.
	*
	* @return the name of this nhom mat hang
	*/
	@Override
	public java.lang.String getName() {
		return _nhomMatHang.getName();
	}

	/**
	* Sets the name of this nhom mat hang.
	*
	* @param name the name of this nhom mat hang
	*/
	@Override
	public void setName(java.lang.String name) {
		_nhomMatHang.setName(name);
	}

	/**
	* Returns the code of this nhom mat hang.
	*
	* @return the code of this nhom mat hang
	*/
	@Override
	public java.lang.String getCode() {
		return _nhomMatHang.getCode();
	}

	/**
	* Sets the code of this nhom mat hang.
	*
	* @param code the code of this nhom mat hang
	*/
	@Override
	public void setCode(java.lang.String code) {
		_nhomMatHang.setCode(code);
	}

	/**
	* Returns the status of this nhom mat hang.
	*
	* @return the status of this nhom mat hang
	*/
	@Override
	public int getStatus() {
		return _nhomMatHang.getStatus();
	}

	/**
	* Sets the status of this nhom mat hang.
	*
	* @param status the status of this nhom mat hang
	*/
	@Override
	public void setStatus(int status) {
		_nhomMatHang.setStatus(status);
	}

	/**
	* Returns the note of this nhom mat hang.
	*
	* @return the note of this nhom mat hang
	*/
	@Override
	public java.lang.String getNote() {
		return _nhomMatHang.getNote();
	}

	/**
	* Sets the note of this nhom mat hang.
	*
	* @param note the note of this nhom mat hang
	*/
	@Override
	public void setNote(java.lang.String note) {
		_nhomMatHang.setNote(note);
	}

	@Override
	public boolean isNew() {
		return _nhomMatHang.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_nhomMatHang.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _nhomMatHang.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_nhomMatHang.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _nhomMatHang.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _nhomMatHang.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_nhomMatHang.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _nhomMatHang.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_nhomMatHang.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_nhomMatHang.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_nhomMatHang.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new NhomMatHangWrapper((NhomMatHang)_nhomMatHang.clone());
	}

	@Override
	public int compareTo(
		com.minimart.portlet.mathang.model.NhomMatHang nhomMatHang) {
		return _nhomMatHang.compareTo(nhomMatHang);
	}

	@Override
	public int hashCode() {
		return _nhomMatHang.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.minimart.portlet.mathang.model.NhomMatHang> toCacheModel() {
		return _nhomMatHang.toCacheModel();
	}

	@Override
	public com.minimart.portlet.mathang.model.NhomMatHang toEscapedModel() {
		return new NhomMatHangWrapper(_nhomMatHang.toEscapedModel());
	}

	@Override
	public com.minimart.portlet.mathang.model.NhomMatHang toUnescapedModel() {
		return new NhomMatHangWrapper(_nhomMatHang.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _nhomMatHang.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _nhomMatHang.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_nhomMatHang.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NhomMatHangWrapper)) {
			return false;
		}

		NhomMatHangWrapper nhomMatHangWrapper = (NhomMatHangWrapper)obj;

		if (Validator.equals(_nhomMatHang, nhomMatHangWrapper._nhomMatHang)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public NhomMatHang getWrappedNhomMatHang() {
		return _nhomMatHang;
	}

	@Override
	public NhomMatHang getWrappedModel() {
		return _nhomMatHang;
	}

	@Override
	public void resetOriginalValues() {
		_nhomMatHang.resetOriginalValues();
	}

	private NhomMatHang _nhomMatHang;
}