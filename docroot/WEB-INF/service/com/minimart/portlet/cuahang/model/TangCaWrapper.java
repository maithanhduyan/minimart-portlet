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

package com.minimart.portlet.cuahang.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TangCa}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see TangCa
 * @generated
 */
public class TangCaWrapper implements TangCa, ModelWrapper<TangCa> {
	public TangCaWrapper(TangCa tangCa) {
		_tangCa = tangCa;
	}

	@Override
	public Class<?> getModelClass() {
		return TangCa.class;
	}

	@Override
	public String getModelClassName() {
		return TangCa.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tangCaId", getTangCaId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("cuaHangId", getCuaHangId());
		attributes.put("caLamViecId", getCaLamViecId());
		attributes.put("nhanVienId", getNhanVienId());
		attributes.put("tangCaTu", getTangCaTu());
		attributes.put("tangCaDen", getTangCaDen());
		attributes.put("hoatDong", getHoatDong());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tangCaId = (Long)attributes.get("tangCaId");

		if (tangCaId != null) {
			setTangCaId(tangCaId);
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

		Long cuaHangId = (Long)attributes.get("cuaHangId");

		if (cuaHangId != null) {
			setCuaHangId(cuaHangId);
		}

		Long caLamViecId = (Long)attributes.get("caLamViecId");

		if (caLamViecId != null) {
			setCaLamViecId(caLamViecId);
		}

		Long nhanVienId = (Long)attributes.get("nhanVienId");

		if (nhanVienId != null) {
			setNhanVienId(nhanVienId);
		}

		Date tangCaTu = (Date)attributes.get("tangCaTu");

		if (tangCaTu != null) {
			setTangCaTu(tangCaTu);
		}

		Date tangCaDen = (Date)attributes.get("tangCaDen");

		if (tangCaDen != null) {
			setTangCaDen(tangCaDen);
		}

		Boolean hoatDong = (Boolean)attributes.get("hoatDong");

		if (hoatDong != null) {
			setHoatDong(hoatDong);
		}
	}

	/**
	* Returns the primary key of this tang ca.
	*
	* @return the primary key of this tang ca
	*/
	@Override
	public long getPrimaryKey() {
		return _tangCa.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tang ca.
	*
	* @param primaryKey the primary key of this tang ca
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tangCa.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the tang ca ID of this tang ca.
	*
	* @return the tang ca ID of this tang ca
	*/
	@Override
	public long getTangCaId() {
		return _tangCa.getTangCaId();
	}

	/**
	* Sets the tang ca ID of this tang ca.
	*
	* @param tangCaId the tang ca ID of this tang ca
	*/
	@Override
	public void setTangCaId(long tangCaId) {
		_tangCa.setTangCaId(tangCaId);
	}

	/**
	* Returns the company ID of this tang ca.
	*
	* @return the company ID of this tang ca
	*/
	@Override
	public long getCompanyId() {
		return _tangCa.getCompanyId();
	}

	/**
	* Sets the company ID of this tang ca.
	*
	* @param companyId the company ID of this tang ca
	*/
	@Override
	public void setCompanyId(long companyId) {
		_tangCa.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this tang ca.
	*
	* @return the user ID of this tang ca
	*/
	@Override
	public long getUserId() {
		return _tangCa.getUserId();
	}

	/**
	* Sets the user ID of this tang ca.
	*
	* @param userId the user ID of this tang ca
	*/
	@Override
	public void setUserId(long userId) {
		_tangCa.setUserId(userId);
	}

	/**
	* Returns the user uuid of this tang ca.
	*
	* @return the user uuid of this tang ca
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tangCa.getUserUuid();
	}

	/**
	* Sets the user uuid of this tang ca.
	*
	* @param userUuid the user uuid of this tang ca
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_tangCa.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this tang ca.
	*
	* @return the user name of this tang ca
	*/
	@Override
	public java.lang.String getUserName() {
		return _tangCa.getUserName();
	}

	/**
	* Sets the user name of this tang ca.
	*
	* @param userName the user name of this tang ca
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_tangCa.setUserName(userName);
	}

	/**
	* Returns the create date of this tang ca.
	*
	* @return the create date of this tang ca
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _tangCa.getCreateDate();
	}

	/**
	* Sets the create date of this tang ca.
	*
	* @param createDate the create date of this tang ca
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_tangCa.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this tang ca.
	*
	* @return the modified date of this tang ca
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _tangCa.getModifiedDate();
	}

	/**
	* Sets the modified date of this tang ca.
	*
	* @param modifiedDate the modified date of this tang ca
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_tangCa.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the ten of this tang ca.
	*
	* @return the ten of this tang ca
	*/
	@Override
	public java.lang.String getTen() {
		return _tangCa.getTen();
	}

	/**
	* Sets the ten of this tang ca.
	*
	* @param ten the ten of this tang ca
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_tangCa.setTen(ten);
	}

	/**
	* Returns the cua hang ID of this tang ca.
	*
	* @return the cua hang ID of this tang ca
	*/
	@Override
	public long getCuaHangId() {
		return _tangCa.getCuaHangId();
	}

	/**
	* Sets the cua hang ID of this tang ca.
	*
	* @param cuaHangId the cua hang ID of this tang ca
	*/
	@Override
	public void setCuaHangId(long cuaHangId) {
		_tangCa.setCuaHangId(cuaHangId);
	}

	/**
	* Returns the ca lam viec ID of this tang ca.
	*
	* @return the ca lam viec ID of this tang ca
	*/
	@Override
	public long getCaLamViecId() {
		return _tangCa.getCaLamViecId();
	}

	/**
	* Sets the ca lam viec ID of this tang ca.
	*
	* @param caLamViecId the ca lam viec ID of this tang ca
	*/
	@Override
	public void setCaLamViecId(long caLamViecId) {
		_tangCa.setCaLamViecId(caLamViecId);
	}

	/**
	* Returns the nhan vien ID of this tang ca.
	*
	* @return the nhan vien ID of this tang ca
	*/
	@Override
	public long getNhanVienId() {
		return _tangCa.getNhanVienId();
	}

	/**
	* Sets the nhan vien ID of this tang ca.
	*
	* @param nhanVienId the nhan vien ID of this tang ca
	*/
	@Override
	public void setNhanVienId(long nhanVienId) {
		_tangCa.setNhanVienId(nhanVienId);
	}

	/**
	* Returns the tang ca tu of this tang ca.
	*
	* @return the tang ca tu of this tang ca
	*/
	@Override
	public java.util.Date getTangCaTu() {
		return _tangCa.getTangCaTu();
	}

	/**
	* Sets the tang ca tu of this tang ca.
	*
	* @param tangCaTu the tang ca tu of this tang ca
	*/
	@Override
	public void setTangCaTu(java.util.Date tangCaTu) {
		_tangCa.setTangCaTu(tangCaTu);
	}

	/**
	* Returns the tang ca den of this tang ca.
	*
	* @return the tang ca den of this tang ca
	*/
	@Override
	public java.util.Date getTangCaDen() {
		return _tangCa.getTangCaDen();
	}

	/**
	* Sets the tang ca den of this tang ca.
	*
	* @param tangCaDen the tang ca den of this tang ca
	*/
	@Override
	public void setTangCaDen(java.util.Date tangCaDen) {
		_tangCa.setTangCaDen(tangCaDen);
	}

	/**
	* Returns the hoat dong of this tang ca.
	*
	* @return the hoat dong of this tang ca
	*/
	@Override
	public boolean getHoatDong() {
		return _tangCa.getHoatDong();
	}

	/**
	* Returns <code>true</code> if this tang ca is hoat dong.
	*
	* @return <code>true</code> if this tang ca is hoat dong; <code>false</code> otherwise
	*/
	@Override
	public boolean isHoatDong() {
		return _tangCa.isHoatDong();
	}

	/**
	* Sets whether this tang ca is hoat dong.
	*
	* @param hoatDong the hoat dong of this tang ca
	*/
	@Override
	public void setHoatDong(boolean hoatDong) {
		_tangCa.setHoatDong(hoatDong);
	}

	@Override
	public boolean isNew() {
		return _tangCa.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_tangCa.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _tangCa.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tangCa.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _tangCa.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _tangCa.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_tangCa.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tangCa.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_tangCa.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_tangCa.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tangCa.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TangCaWrapper((TangCa)_tangCa.clone());
	}

	@Override
	public int compareTo(com.minimart.portlet.cuahang.model.TangCa tangCa) {
		return _tangCa.compareTo(tangCa);
	}

	@Override
	public int hashCode() {
		return _tangCa.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.minimart.portlet.cuahang.model.TangCa> toCacheModel() {
		return _tangCa.toCacheModel();
	}

	@Override
	public com.minimart.portlet.cuahang.model.TangCa toEscapedModel() {
		return new TangCaWrapper(_tangCa.toEscapedModel());
	}

	@Override
	public com.minimart.portlet.cuahang.model.TangCa toUnescapedModel() {
		return new TangCaWrapper(_tangCa.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _tangCa.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _tangCa.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_tangCa.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TangCaWrapper)) {
			return false;
		}

		TangCaWrapper tangCaWrapper = (TangCaWrapper)obj;

		if (Validator.equals(_tangCa, tangCaWrapper._tangCa)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TangCa getWrappedTangCa() {
		return _tangCa;
	}

	@Override
	public TangCa getWrappedModel() {
		return _tangCa;
	}

	@Override
	public void resetOriginalValues() {
		_tangCa.resetOriginalValues();
	}

	private TangCa _tangCa;
}