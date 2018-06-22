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
 * This class is a wrapper for {@link QuanHuyen}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see QuanHuyen
 * @generated
 */
public class QuanHuyenWrapper implements QuanHuyen, ModelWrapper<QuanHuyen> {
	public QuanHuyenWrapper(QuanHuyen quanHuyen) {
		_quanHuyen = quanHuyen;
	}

	@Override
	public Class<?> getModelClass() {
		return QuanHuyen.class;
	}

	@Override
	public String getModelClassName() {
		return QuanHuyen.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("quanHuyenId", getQuanHuyenId());
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
		Long quanHuyenId = (Long)attributes.get("quanHuyenId");

		if (quanHuyenId != null) {
			setQuanHuyenId(quanHuyenId);
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
	* Returns the primary key of this quan huyen.
	*
	* @return the primary key of this quan huyen
	*/
	@Override
	public long getPrimaryKey() {
		return _quanHuyen.getPrimaryKey();
	}

	/**
	* Sets the primary key of this quan huyen.
	*
	* @param primaryKey the primary key of this quan huyen
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_quanHuyen.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the quan huyen ID of this quan huyen.
	*
	* @return the quan huyen ID of this quan huyen
	*/
	@Override
	public long getQuanHuyenId() {
		return _quanHuyen.getQuanHuyenId();
	}

	/**
	* Sets the quan huyen ID of this quan huyen.
	*
	* @param quanHuyenId the quan huyen ID of this quan huyen
	*/
	@Override
	public void setQuanHuyenId(long quanHuyenId) {
		_quanHuyen.setQuanHuyenId(quanHuyenId);
	}

	/**
	* Returns the company ID of this quan huyen.
	*
	* @return the company ID of this quan huyen
	*/
	@Override
	public long getCompanyId() {
		return _quanHuyen.getCompanyId();
	}

	/**
	* Sets the company ID of this quan huyen.
	*
	* @param companyId the company ID of this quan huyen
	*/
	@Override
	public void setCompanyId(long companyId) {
		_quanHuyen.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this quan huyen.
	*
	* @return the user ID of this quan huyen
	*/
	@Override
	public long getUserId() {
		return _quanHuyen.getUserId();
	}

	/**
	* Sets the user ID of this quan huyen.
	*
	* @param userId the user ID of this quan huyen
	*/
	@Override
	public void setUserId(long userId) {
		_quanHuyen.setUserId(userId);
	}

	/**
	* Returns the user uuid of this quan huyen.
	*
	* @return the user uuid of this quan huyen
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _quanHuyen.getUserUuid();
	}

	/**
	* Sets the user uuid of this quan huyen.
	*
	* @param userUuid the user uuid of this quan huyen
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_quanHuyen.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this quan huyen.
	*
	* @return the user name of this quan huyen
	*/
	@Override
	public java.lang.String getUserName() {
		return _quanHuyen.getUserName();
	}

	/**
	* Sets the user name of this quan huyen.
	*
	* @param userName the user name of this quan huyen
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_quanHuyen.setUserName(userName);
	}

	/**
	* Returns the create date of this quan huyen.
	*
	* @return the create date of this quan huyen
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _quanHuyen.getCreateDate();
	}

	/**
	* Sets the create date of this quan huyen.
	*
	* @param createDate the create date of this quan huyen
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_quanHuyen.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this quan huyen.
	*
	* @return the modified date of this quan huyen
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _quanHuyen.getModifiedDate();
	}

	/**
	* Sets the modified date of this quan huyen.
	*
	* @param modifiedDate the modified date of this quan huyen
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_quanHuyen.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the ten of this quan huyen.
	*
	* @return the ten of this quan huyen
	*/
	@Override
	public java.lang.String getTen() {
		return _quanHuyen.getTen();
	}

	/**
	* Sets the ten of this quan huyen.
	*
	* @param ten the ten of this quan huyen
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_quanHuyen.setTen(ten);
	}

	/**
	* Returns the ma of this quan huyen.
	*
	* @return the ma of this quan huyen
	*/
	@Override
	public java.lang.String getMa() {
		return _quanHuyen.getMa();
	}

	/**
	* Sets the ma of this quan huyen.
	*
	* @param ma the ma of this quan huyen
	*/
	@Override
	public void setMa(java.lang.String ma) {
		_quanHuyen.setMa(ma);
	}

	/**
	* Returns the trang thai of this quan huyen.
	*
	* @return the trang thai of this quan huyen
	*/
	@Override
	public boolean getTrangThai() {
		return _quanHuyen.getTrangThai();
	}

	/**
	* Returns <code>true</code> if this quan huyen is trang thai.
	*
	* @return <code>true</code> if this quan huyen is trang thai; <code>false</code> otherwise
	*/
	@Override
	public boolean isTrangThai() {
		return _quanHuyen.isTrangThai();
	}

	/**
	* Sets whether this quan huyen is trang thai.
	*
	* @param trangThai the trang thai of this quan huyen
	*/
	@Override
	public void setTrangThai(boolean trangThai) {
		_quanHuyen.setTrangThai(trangThai);
	}

	@Override
	public boolean isNew() {
		return _quanHuyen.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_quanHuyen.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _quanHuyen.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_quanHuyen.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _quanHuyen.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _quanHuyen.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_quanHuyen.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _quanHuyen.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_quanHuyen.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_quanHuyen.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_quanHuyen.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new QuanHuyenWrapper((QuanHuyen)_quanHuyen.clone());
	}

	@Override
	public int compareTo(
		com.minimart.portlet.danhmucchung.model.QuanHuyen quanHuyen) {
		return _quanHuyen.compareTo(quanHuyen);
	}

	@Override
	public int hashCode() {
		return _quanHuyen.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.minimart.portlet.danhmucchung.model.QuanHuyen> toCacheModel() {
		return _quanHuyen.toCacheModel();
	}

	@Override
	public com.minimart.portlet.danhmucchung.model.QuanHuyen toEscapedModel() {
		return new QuanHuyenWrapper(_quanHuyen.toEscapedModel());
	}

	@Override
	public com.minimart.portlet.danhmucchung.model.QuanHuyen toUnescapedModel() {
		return new QuanHuyenWrapper(_quanHuyen.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _quanHuyen.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _quanHuyen.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_quanHuyen.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof QuanHuyenWrapper)) {
			return false;
		}

		QuanHuyenWrapper quanHuyenWrapper = (QuanHuyenWrapper)obj;

		if (Validator.equals(_quanHuyen, quanHuyenWrapper._quanHuyen)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public QuanHuyen getWrappedQuanHuyen() {
		return _quanHuyen;
	}

	@Override
	public QuanHuyen getWrappedModel() {
		return _quanHuyen;
	}

	@Override
	public void resetOriginalValues() {
		_quanHuyen.resetOriginalValues();
	}

	private QuanHuyen _quanHuyen;
}