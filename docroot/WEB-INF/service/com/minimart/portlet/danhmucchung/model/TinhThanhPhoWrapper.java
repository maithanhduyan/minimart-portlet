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
 * This class is a wrapper for {@link TinhThanhPho}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see TinhThanhPho
 * @generated
 */
public class TinhThanhPhoWrapper implements TinhThanhPho,
	ModelWrapper<TinhThanhPho> {
	public TinhThanhPhoWrapper(TinhThanhPho tinhThanhPho) {
		_tinhThanhPho = tinhThanhPho;
	}

	@Override
	public Class<?> getModelClass() {
		return TinhThanhPho.class;
	}

	@Override
	public String getModelClassName() {
		return TinhThanhPho.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tinhThanhPhoId", getTinhThanhPhoId());
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
		Long tinhThanhPhoId = (Long)attributes.get("tinhThanhPhoId");

		if (tinhThanhPhoId != null) {
			setTinhThanhPhoId(tinhThanhPhoId);
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
	* Returns the primary key of this tinh thanh pho.
	*
	* @return the primary key of this tinh thanh pho
	*/
	@Override
	public long getPrimaryKey() {
		return _tinhThanhPho.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tinh thanh pho.
	*
	* @param primaryKey the primary key of this tinh thanh pho
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tinhThanhPho.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the tinh thanh pho ID of this tinh thanh pho.
	*
	* @return the tinh thanh pho ID of this tinh thanh pho
	*/
	@Override
	public long getTinhThanhPhoId() {
		return _tinhThanhPho.getTinhThanhPhoId();
	}

	/**
	* Sets the tinh thanh pho ID of this tinh thanh pho.
	*
	* @param tinhThanhPhoId the tinh thanh pho ID of this tinh thanh pho
	*/
	@Override
	public void setTinhThanhPhoId(long tinhThanhPhoId) {
		_tinhThanhPho.setTinhThanhPhoId(tinhThanhPhoId);
	}

	/**
	* Returns the company ID of this tinh thanh pho.
	*
	* @return the company ID of this tinh thanh pho
	*/
	@Override
	public long getCompanyId() {
		return _tinhThanhPho.getCompanyId();
	}

	/**
	* Sets the company ID of this tinh thanh pho.
	*
	* @param companyId the company ID of this tinh thanh pho
	*/
	@Override
	public void setCompanyId(long companyId) {
		_tinhThanhPho.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this tinh thanh pho.
	*
	* @return the user ID of this tinh thanh pho
	*/
	@Override
	public long getUserId() {
		return _tinhThanhPho.getUserId();
	}

	/**
	* Sets the user ID of this tinh thanh pho.
	*
	* @param userId the user ID of this tinh thanh pho
	*/
	@Override
	public void setUserId(long userId) {
		_tinhThanhPho.setUserId(userId);
	}

	/**
	* Returns the user uuid of this tinh thanh pho.
	*
	* @return the user uuid of this tinh thanh pho
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tinhThanhPho.getUserUuid();
	}

	/**
	* Sets the user uuid of this tinh thanh pho.
	*
	* @param userUuid the user uuid of this tinh thanh pho
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_tinhThanhPho.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this tinh thanh pho.
	*
	* @return the user name of this tinh thanh pho
	*/
	@Override
	public java.lang.String getUserName() {
		return _tinhThanhPho.getUserName();
	}

	/**
	* Sets the user name of this tinh thanh pho.
	*
	* @param userName the user name of this tinh thanh pho
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_tinhThanhPho.setUserName(userName);
	}

	/**
	* Returns the create date of this tinh thanh pho.
	*
	* @return the create date of this tinh thanh pho
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _tinhThanhPho.getCreateDate();
	}

	/**
	* Sets the create date of this tinh thanh pho.
	*
	* @param createDate the create date of this tinh thanh pho
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_tinhThanhPho.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this tinh thanh pho.
	*
	* @return the modified date of this tinh thanh pho
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _tinhThanhPho.getModifiedDate();
	}

	/**
	* Sets the modified date of this tinh thanh pho.
	*
	* @param modifiedDate the modified date of this tinh thanh pho
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_tinhThanhPho.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the ten of this tinh thanh pho.
	*
	* @return the ten of this tinh thanh pho
	*/
	@Override
	public java.lang.String getTen() {
		return _tinhThanhPho.getTen();
	}

	/**
	* Sets the ten of this tinh thanh pho.
	*
	* @param ten the ten of this tinh thanh pho
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_tinhThanhPho.setTen(ten);
	}

	/**
	* Returns the ma of this tinh thanh pho.
	*
	* @return the ma of this tinh thanh pho
	*/
	@Override
	public java.lang.String getMa() {
		return _tinhThanhPho.getMa();
	}

	/**
	* Sets the ma of this tinh thanh pho.
	*
	* @param ma the ma of this tinh thanh pho
	*/
	@Override
	public void setMa(java.lang.String ma) {
		_tinhThanhPho.setMa(ma);
	}

	/**
	* Returns the trang thai of this tinh thanh pho.
	*
	* @return the trang thai of this tinh thanh pho
	*/
	@Override
	public boolean getTrangThai() {
		return _tinhThanhPho.getTrangThai();
	}

	/**
	* Returns <code>true</code> if this tinh thanh pho is trang thai.
	*
	* @return <code>true</code> if this tinh thanh pho is trang thai; <code>false</code> otherwise
	*/
	@Override
	public boolean isTrangThai() {
		return _tinhThanhPho.isTrangThai();
	}

	/**
	* Sets whether this tinh thanh pho is trang thai.
	*
	* @param trangThai the trang thai of this tinh thanh pho
	*/
	@Override
	public void setTrangThai(boolean trangThai) {
		_tinhThanhPho.setTrangThai(trangThai);
	}

	@Override
	public boolean isNew() {
		return _tinhThanhPho.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tinhThanhPho.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tinhThanhPho.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tinhThanhPho.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tinhThanhPho.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tinhThanhPho.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tinhThanhPho.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tinhThanhPho.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tinhThanhPho.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tinhThanhPho.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tinhThanhPho.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TinhThanhPhoWrapper((TinhThanhPho)_tinhThanhPho.clone());
	}

	@Override
	public int compareTo(
		com.minimart.portlet.danhmucchung.model.TinhThanhPho tinhThanhPho) {
		return _tinhThanhPho.compareTo(tinhThanhPho);
	}

	@Override
	public int hashCode() {
		return _tinhThanhPho.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.minimart.portlet.danhmucchung.model.TinhThanhPho> toCacheModel() {
		return _tinhThanhPho.toCacheModel();
	}

	@Override
	public com.minimart.portlet.danhmucchung.model.TinhThanhPho toEscapedModel() {
		return new TinhThanhPhoWrapper(_tinhThanhPho.toEscapedModel());
	}

	@Override
	public com.minimart.portlet.danhmucchung.model.TinhThanhPho toUnescapedModel() {
		return new TinhThanhPhoWrapper(_tinhThanhPho.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tinhThanhPho.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tinhThanhPho.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tinhThanhPho.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TinhThanhPhoWrapper)) {
			return false;
		}

		TinhThanhPhoWrapper tinhThanhPhoWrapper = (TinhThanhPhoWrapper)obj;

		if (Validator.equals(_tinhThanhPho, tinhThanhPhoWrapper._tinhThanhPho)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TinhThanhPho getWrappedTinhThanhPho() {
		return _tinhThanhPho;
	}

	@Override
	public TinhThanhPho getWrappedModel() {
		return _tinhThanhPho;
	}

	@Override
	public void resetOriginalValues() {
		_tinhThanhPho.resetOriginalValues();
	}

	private TinhThanhPho _tinhThanhPho;
}