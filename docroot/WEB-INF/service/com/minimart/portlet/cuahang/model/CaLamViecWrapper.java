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
 * This class is a wrapper for {@link CaLamViec}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see CaLamViec
 * @generated
 */
public class CaLamViecWrapper implements CaLamViec, ModelWrapper<CaLamViec> {
	public CaLamViecWrapper(CaLamViec caLamViec) {
		_caLamViec = caLamViec;
	}

	@Override
	public Class<?> getModelClass() {
		return CaLamViec.class;
	}

	@Override
	public String getModelClassName() {
		return CaLamViec.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("caLamViecId", getCaLamViecId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("cuaHangId", getCuaHangId());
		attributes.put("gioVaoLam", getGioVaoLam());
		attributes.put("gioRaVe", getGioRaVe());
		attributes.put("gioNghiGiuaCaTu", getGioNghiGiuaCaTu());
		attributes.put("gioNghiGiuaCaDen", getGioNghiGiuaCaDen());
		attributes.put("tiLeLuong", getTiLeLuong());
		attributes.put("hoatDong", getHoatDong());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long caLamViecId = (Long)attributes.get("caLamViecId");

		if (caLamViecId != null) {
			setCaLamViecId(caLamViecId);
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

		Date gioVaoLam = (Date)attributes.get("gioVaoLam");

		if (gioVaoLam != null) {
			setGioVaoLam(gioVaoLam);
		}

		Date gioRaVe = (Date)attributes.get("gioRaVe");

		if (gioRaVe != null) {
			setGioRaVe(gioRaVe);
		}

		Date gioNghiGiuaCaTu = (Date)attributes.get("gioNghiGiuaCaTu");

		if (gioNghiGiuaCaTu != null) {
			setGioNghiGiuaCaTu(gioNghiGiuaCaTu);
		}

		Date gioNghiGiuaCaDen = (Date)attributes.get("gioNghiGiuaCaDen");

		if (gioNghiGiuaCaDen != null) {
			setGioNghiGiuaCaDen(gioNghiGiuaCaDen);
		}

		Integer tiLeLuong = (Integer)attributes.get("tiLeLuong");

		if (tiLeLuong != null) {
			setTiLeLuong(tiLeLuong);
		}

		Boolean hoatDong = (Boolean)attributes.get("hoatDong");

		if (hoatDong != null) {
			setHoatDong(hoatDong);
		}
	}

	/**
	* Returns the primary key of this ca lam viec.
	*
	* @return the primary key of this ca lam viec
	*/
	@Override
	public long getPrimaryKey() {
		return _caLamViec.getPrimaryKey();
	}

	/**
	* Sets the primary key of this ca lam viec.
	*
	* @param primaryKey the primary key of this ca lam viec
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_caLamViec.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ca lam viec ID of this ca lam viec.
	*
	* @return the ca lam viec ID of this ca lam viec
	*/
	@Override
	public long getCaLamViecId() {
		return _caLamViec.getCaLamViecId();
	}

	/**
	* Sets the ca lam viec ID of this ca lam viec.
	*
	* @param caLamViecId the ca lam viec ID of this ca lam viec
	*/
	@Override
	public void setCaLamViecId(long caLamViecId) {
		_caLamViec.setCaLamViecId(caLamViecId);
	}

	/**
	* Returns the company ID of this ca lam viec.
	*
	* @return the company ID of this ca lam viec
	*/
	@Override
	public long getCompanyId() {
		return _caLamViec.getCompanyId();
	}

	/**
	* Sets the company ID of this ca lam viec.
	*
	* @param companyId the company ID of this ca lam viec
	*/
	@Override
	public void setCompanyId(long companyId) {
		_caLamViec.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this ca lam viec.
	*
	* @return the user ID of this ca lam viec
	*/
	@Override
	public long getUserId() {
		return _caLamViec.getUserId();
	}

	/**
	* Sets the user ID of this ca lam viec.
	*
	* @param userId the user ID of this ca lam viec
	*/
	@Override
	public void setUserId(long userId) {
		_caLamViec.setUserId(userId);
	}

	/**
	* Returns the user uuid of this ca lam viec.
	*
	* @return the user uuid of this ca lam viec
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _caLamViec.getUserUuid();
	}

	/**
	* Sets the user uuid of this ca lam viec.
	*
	* @param userUuid the user uuid of this ca lam viec
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_caLamViec.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this ca lam viec.
	*
	* @return the user name of this ca lam viec
	*/
	@Override
	public java.lang.String getUserName() {
		return _caLamViec.getUserName();
	}

	/**
	* Sets the user name of this ca lam viec.
	*
	* @param userName the user name of this ca lam viec
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_caLamViec.setUserName(userName);
	}

	/**
	* Returns the create date of this ca lam viec.
	*
	* @return the create date of this ca lam viec
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _caLamViec.getCreateDate();
	}

	/**
	* Sets the create date of this ca lam viec.
	*
	* @param createDate the create date of this ca lam viec
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_caLamViec.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this ca lam viec.
	*
	* @return the modified date of this ca lam viec
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _caLamViec.getModifiedDate();
	}

	/**
	* Sets the modified date of this ca lam viec.
	*
	* @param modifiedDate the modified date of this ca lam viec
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_caLamViec.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the ten of this ca lam viec.
	*
	* @return the ten of this ca lam viec
	*/
	@Override
	public java.lang.String getTen() {
		return _caLamViec.getTen();
	}

	/**
	* Sets the ten of this ca lam viec.
	*
	* @param ten the ten of this ca lam viec
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_caLamViec.setTen(ten);
	}

	/**
	* Returns the cua hang ID of this ca lam viec.
	*
	* @return the cua hang ID of this ca lam viec
	*/
	@Override
	public long getCuaHangId() {
		return _caLamViec.getCuaHangId();
	}

	/**
	* Sets the cua hang ID of this ca lam viec.
	*
	* @param cuaHangId the cua hang ID of this ca lam viec
	*/
	@Override
	public void setCuaHangId(long cuaHangId) {
		_caLamViec.setCuaHangId(cuaHangId);
	}

	/**
	* Returns the gio vao lam of this ca lam viec.
	*
	* @return the gio vao lam of this ca lam viec
	*/
	@Override
	public java.util.Date getGioVaoLam() {
		return _caLamViec.getGioVaoLam();
	}

	/**
	* Sets the gio vao lam of this ca lam viec.
	*
	* @param gioVaoLam the gio vao lam of this ca lam viec
	*/
	@Override
	public void setGioVaoLam(java.util.Date gioVaoLam) {
		_caLamViec.setGioVaoLam(gioVaoLam);
	}

	/**
	* Returns the gio ra ve of this ca lam viec.
	*
	* @return the gio ra ve of this ca lam viec
	*/
	@Override
	public java.util.Date getGioRaVe() {
		return _caLamViec.getGioRaVe();
	}

	/**
	* Sets the gio ra ve of this ca lam viec.
	*
	* @param gioRaVe the gio ra ve of this ca lam viec
	*/
	@Override
	public void setGioRaVe(java.util.Date gioRaVe) {
		_caLamViec.setGioRaVe(gioRaVe);
	}

	/**
	* Returns the gio nghi giua ca tu of this ca lam viec.
	*
	* @return the gio nghi giua ca tu of this ca lam viec
	*/
	@Override
	public java.util.Date getGioNghiGiuaCaTu() {
		return _caLamViec.getGioNghiGiuaCaTu();
	}

	/**
	* Sets the gio nghi giua ca tu of this ca lam viec.
	*
	* @param gioNghiGiuaCaTu the gio nghi giua ca tu of this ca lam viec
	*/
	@Override
	public void setGioNghiGiuaCaTu(java.util.Date gioNghiGiuaCaTu) {
		_caLamViec.setGioNghiGiuaCaTu(gioNghiGiuaCaTu);
	}

	/**
	* Returns the gio nghi giua ca den of this ca lam viec.
	*
	* @return the gio nghi giua ca den of this ca lam viec
	*/
	@Override
	public java.util.Date getGioNghiGiuaCaDen() {
		return _caLamViec.getGioNghiGiuaCaDen();
	}

	/**
	* Sets the gio nghi giua ca den of this ca lam viec.
	*
	* @param gioNghiGiuaCaDen the gio nghi giua ca den of this ca lam viec
	*/
	@Override
	public void setGioNghiGiuaCaDen(java.util.Date gioNghiGiuaCaDen) {
		_caLamViec.setGioNghiGiuaCaDen(gioNghiGiuaCaDen);
	}

	/**
	* Returns the ti le luong of this ca lam viec.
	*
	* @return the ti le luong of this ca lam viec
	*/
	@Override
	public int getTiLeLuong() {
		return _caLamViec.getTiLeLuong();
	}

	/**
	* Sets the ti le luong of this ca lam viec.
	*
	* @param tiLeLuong the ti le luong of this ca lam viec
	*/
	@Override
	public void setTiLeLuong(int tiLeLuong) {
		_caLamViec.setTiLeLuong(tiLeLuong);
	}

	/**
	* Returns the hoat dong of this ca lam viec.
	*
	* @return the hoat dong of this ca lam viec
	*/
	@Override
	public boolean getHoatDong() {
		return _caLamViec.getHoatDong();
	}

	/**
	* Returns <code>true</code> if this ca lam viec is hoat dong.
	*
	* @return <code>true</code> if this ca lam viec is hoat dong; <code>false</code> otherwise
	*/
	@Override
	public boolean isHoatDong() {
		return _caLamViec.isHoatDong();
	}

	/**
	* Sets whether this ca lam viec is hoat dong.
	*
	* @param hoatDong the hoat dong of this ca lam viec
	*/
	@Override
	public void setHoatDong(boolean hoatDong) {
		_caLamViec.setHoatDong(hoatDong);
	}

	@Override
	public boolean isNew() {
		return _caLamViec.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_caLamViec.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _caLamViec.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_caLamViec.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _caLamViec.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _caLamViec.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_caLamViec.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _caLamViec.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_caLamViec.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_caLamViec.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_caLamViec.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CaLamViecWrapper((CaLamViec)_caLamViec.clone());
	}

	@Override
	public int compareTo(com.minimart.portlet.cuahang.model.CaLamViec caLamViec) {
		return _caLamViec.compareTo(caLamViec);
	}

	@Override
	public int hashCode() {
		return _caLamViec.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.minimart.portlet.cuahang.model.CaLamViec> toCacheModel() {
		return _caLamViec.toCacheModel();
	}

	@Override
	public com.minimart.portlet.cuahang.model.CaLamViec toEscapedModel() {
		return new CaLamViecWrapper(_caLamViec.toEscapedModel());
	}

	@Override
	public com.minimart.portlet.cuahang.model.CaLamViec toUnescapedModel() {
		return new CaLamViecWrapper(_caLamViec.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _caLamViec.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _caLamViec.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_caLamViec.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CaLamViecWrapper)) {
			return false;
		}

		CaLamViecWrapper caLamViecWrapper = (CaLamViecWrapper)obj;

		if (Validator.equals(_caLamViec, caLamViecWrapper._caLamViec)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CaLamViec getWrappedCaLamViec() {
		return _caLamViec;
	}

	@Override
	public CaLamViec getWrappedModel() {
		return _caLamViec;
	}

	@Override
	public void resetOriginalValues() {
		_caLamViec.resetOriginalValues();
	}

	private CaLamViec _caLamViec;
}