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
 * This class is a wrapper for {@link PhuongXa}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see PhuongXa
 * @generated
 */
public class PhuongXaWrapper implements PhuongXa, ModelWrapper<PhuongXa> {
	public PhuongXaWrapper(PhuongXa phuongXa) {
		_phuongXa = phuongXa;
	}

	@Override
	public Class<?> getModelClass() {
		return PhuongXa.class;
	}

	@Override
	public String getModelClassName() {
		return PhuongXa.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("phuongXaId", getPhuongXaId());
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
		Long phuongXaId = (Long)attributes.get("phuongXaId");

		if (phuongXaId != null) {
			setPhuongXaId(phuongXaId);
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
	* Returns the primary key of this phuong xa.
	*
	* @return the primary key of this phuong xa
	*/
	@Override
	public long getPrimaryKey() {
		return _phuongXa.getPrimaryKey();
	}

	/**
	* Sets the primary key of this phuong xa.
	*
	* @param primaryKey the primary key of this phuong xa
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_phuongXa.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the phuong xa ID of this phuong xa.
	*
	* @return the phuong xa ID of this phuong xa
	*/
	@Override
	public long getPhuongXaId() {
		return _phuongXa.getPhuongXaId();
	}

	/**
	* Sets the phuong xa ID of this phuong xa.
	*
	* @param phuongXaId the phuong xa ID of this phuong xa
	*/
	@Override
	public void setPhuongXaId(long phuongXaId) {
		_phuongXa.setPhuongXaId(phuongXaId);
	}

	/**
	* Returns the company ID of this phuong xa.
	*
	* @return the company ID of this phuong xa
	*/
	@Override
	public long getCompanyId() {
		return _phuongXa.getCompanyId();
	}

	/**
	* Sets the company ID of this phuong xa.
	*
	* @param companyId the company ID of this phuong xa
	*/
	@Override
	public void setCompanyId(long companyId) {
		_phuongXa.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this phuong xa.
	*
	* @return the user ID of this phuong xa
	*/
	@Override
	public long getUserId() {
		return _phuongXa.getUserId();
	}

	/**
	* Sets the user ID of this phuong xa.
	*
	* @param userId the user ID of this phuong xa
	*/
	@Override
	public void setUserId(long userId) {
		_phuongXa.setUserId(userId);
	}

	/**
	* Returns the user uuid of this phuong xa.
	*
	* @return the user uuid of this phuong xa
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phuongXa.getUserUuid();
	}

	/**
	* Sets the user uuid of this phuong xa.
	*
	* @param userUuid the user uuid of this phuong xa
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_phuongXa.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this phuong xa.
	*
	* @return the user name of this phuong xa
	*/
	@Override
	public java.lang.String getUserName() {
		return _phuongXa.getUserName();
	}

	/**
	* Sets the user name of this phuong xa.
	*
	* @param userName the user name of this phuong xa
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_phuongXa.setUserName(userName);
	}

	/**
	* Returns the create date of this phuong xa.
	*
	* @return the create date of this phuong xa
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _phuongXa.getCreateDate();
	}

	/**
	* Sets the create date of this phuong xa.
	*
	* @param createDate the create date of this phuong xa
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_phuongXa.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this phuong xa.
	*
	* @return the modified date of this phuong xa
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _phuongXa.getModifiedDate();
	}

	/**
	* Sets the modified date of this phuong xa.
	*
	* @param modifiedDate the modified date of this phuong xa
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_phuongXa.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the ten of this phuong xa.
	*
	* @return the ten of this phuong xa
	*/
	@Override
	public java.lang.String getTen() {
		return _phuongXa.getTen();
	}

	/**
	* Sets the ten of this phuong xa.
	*
	* @param ten the ten of this phuong xa
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_phuongXa.setTen(ten);
	}

	/**
	* Returns the ma of this phuong xa.
	*
	* @return the ma of this phuong xa
	*/
	@Override
	public java.lang.String getMa() {
		return _phuongXa.getMa();
	}

	/**
	* Sets the ma of this phuong xa.
	*
	* @param ma the ma of this phuong xa
	*/
	@Override
	public void setMa(java.lang.String ma) {
		_phuongXa.setMa(ma);
	}

	/**
	* Returns the trang thai of this phuong xa.
	*
	* @return the trang thai of this phuong xa
	*/
	@Override
	public boolean getTrangThai() {
		return _phuongXa.getTrangThai();
	}

	/**
	* Returns <code>true</code> if this phuong xa is trang thai.
	*
	* @return <code>true</code> if this phuong xa is trang thai; <code>false</code> otherwise
	*/
	@Override
	public boolean isTrangThai() {
		return _phuongXa.isTrangThai();
	}

	/**
	* Sets whether this phuong xa is trang thai.
	*
	* @param trangThai the trang thai of this phuong xa
	*/
	@Override
	public void setTrangThai(boolean trangThai) {
		_phuongXa.setTrangThai(trangThai);
	}

	@Override
	public boolean isNew() {
		return _phuongXa.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_phuongXa.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _phuongXa.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_phuongXa.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _phuongXa.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _phuongXa.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_phuongXa.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _phuongXa.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_phuongXa.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_phuongXa.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_phuongXa.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PhuongXaWrapper((PhuongXa)_phuongXa.clone());
	}

	@Override
	public int compareTo(
		com.minimart.portlet.danhmucchung.model.PhuongXa phuongXa) {
		return _phuongXa.compareTo(phuongXa);
	}

	@Override
	public int hashCode() {
		return _phuongXa.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.minimart.portlet.danhmucchung.model.PhuongXa> toCacheModel() {
		return _phuongXa.toCacheModel();
	}

	@Override
	public com.minimart.portlet.danhmucchung.model.PhuongXa toEscapedModel() {
		return new PhuongXaWrapper(_phuongXa.toEscapedModel());
	}

	@Override
	public com.minimart.portlet.danhmucchung.model.PhuongXa toUnescapedModel() {
		return new PhuongXaWrapper(_phuongXa.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _phuongXa.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _phuongXa.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_phuongXa.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PhuongXaWrapper)) {
			return false;
		}

		PhuongXaWrapper phuongXaWrapper = (PhuongXaWrapper)obj;

		if (Validator.equals(_phuongXa, phuongXaWrapper._phuongXa)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PhuongXa getWrappedPhuongXa() {
		return _phuongXa;
	}

	@Override
	public PhuongXa getWrappedModel() {
		return _phuongXa;
	}

	@Override
	public void resetOriginalValues() {
		_phuongXa.resetOriginalValues();
	}

	private PhuongXa _phuongXa;
}