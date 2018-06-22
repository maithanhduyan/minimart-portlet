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

package com.minimart.portlet.banhang.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TrangThaiDonHang}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see TrangThaiDonHang
 * @generated
 */
public class TrangThaiDonHangWrapper implements TrangThaiDonHang,
	ModelWrapper<TrangThaiDonHang> {
	public TrangThaiDonHangWrapper(TrangThaiDonHang trangThaiDonHang) {
		_trangThaiDonHang = trangThaiDonHang;
	}

	@Override
	public Class<?> getModelClass() {
		return TrangThaiDonHang.class;
	}

	@Override
	public String getModelClassName() {
		return TrangThaiDonHang.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("trangThaiDonHangId", getTrangThaiDonHangId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("hoatDong", getHoatDong());
		attributes.put("ghiChu", getGhiChu());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long trangThaiDonHangId = (Long)attributes.get("trangThaiDonHangId");

		if (trangThaiDonHangId != null) {
			setTrangThaiDonHangId(trangThaiDonHangId);
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

		Boolean hoatDong = (Boolean)attributes.get("hoatDong");

		if (hoatDong != null) {
			setHoatDong(hoatDong);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}
	}

	/**
	* Returns the primary key of this trang thai don hang.
	*
	* @return the primary key of this trang thai don hang
	*/
	@Override
	public long getPrimaryKey() {
		return _trangThaiDonHang.getPrimaryKey();
	}

	/**
	* Sets the primary key of this trang thai don hang.
	*
	* @param primaryKey the primary key of this trang thai don hang
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_trangThaiDonHang.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the trang thai don hang ID of this trang thai don hang.
	*
	* @return the trang thai don hang ID of this trang thai don hang
	*/
	@Override
	public long getTrangThaiDonHangId() {
		return _trangThaiDonHang.getTrangThaiDonHangId();
	}

	/**
	* Sets the trang thai don hang ID of this trang thai don hang.
	*
	* @param trangThaiDonHangId the trang thai don hang ID of this trang thai don hang
	*/
	@Override
	public void setTrangThaiDonHangId(long trangThaiDonHangId) {
		_trangThaiDonHang.setTrangThaiDonHangId(trangThaiDonHangId);
	}

	/**
	* Returns the company ID of this trang thai don hang.
	*
	* @return the company ID of this trang thai don hang
	*/
	@Override
	public long getCompanyId() {
		return _trangThaiDonHang.getCompanyId();
	}

	/**
	* Sets the company ID of this trang thai don hang.
	*
	* @param companyId the company ID of this trang thai don hang
	*/
	@Override
	public void setCompanyId(long companyId) {
		_trangThaiDonHang.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this trang thai don hang.
	*
	* @return the user ID of this trang thai don hang
	*/
	@Override
	public long getUserId() {
		return _trangThaiDonHang.getUserId();
	}

	/**
	* Sets the user ID of this trang thai don hang.
	*
	* @param userId the user ID of this trang thai don hang
	*/
	@Override
	public void setUserId(long userId) {
		_trangThaiDonHang.setUserId(userId);
	}

	/**
	* Returns the user uuid of this trang thai don hang.
	*
	* @return the user uuid of this trang thai don hang
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _trangThaiDonHang.getUserUuid();
	}

	/**
	* Sets the user uuid of this trang thai don hang.
	*
	* @param userUuid the user uuid of this trang thai don hang
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_trangThaiDonHang.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this trang thai don hang.
	*
	* @return the user name of this trang thai don hang
	*/
	@Override
	public java.lang.String getUserName() {
		return _trangThaiDonHang.getUserName();
	}

	/**
	* Sets the user name of this trang thai don hang.
	*
	* @param userName the user name of this trang thai don hang
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_trangThaiDonHang.setUserName(userName);
	}

	/**
	* Returns the create date of this trang thai don hang.
	*
	* @return the create date of this trang thai don hang
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _trangThaiDonHang.getCreateDate();
	}

	/**
	* Sets the create date of this trang thai don hang.
	*
	* @param createDate the create date of this trang thai don hang
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_trangThaiDonHang.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this trang thai don hang.
	*
	* @return the modified date of this trang thai don hang
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _trangThaiDonHang.getModifiedDate();
	}

	/**
	* Sets the modified date of this trang thai don hang.
	*
	* @param modifiedDate the modified date of this trang thai don hang
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_trangThaiDonHang.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the ten of this trang thai don hang.
	*
	* @return the ten of this trang thai don hang
	*/
	@Override
	public java.lang.String getTen() {
		return _trangThaiDonHang.getTen();
	}

	/**
	* Sets the ten of this trang thai don hang.
	*
	* @param ten the ten of this trang thai don hang
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_trangThaiDonHang.setTen(ten);
	}

	/**
	* Returns the hoat dong of this trang thai don hang.
	*
	* @return the hoat dong of this trang thai don hang
	*/
	@Override
	public boolean getHoatDong() {
		return _trangThaiDonHang.getHoatDong();
	}

	/**
	* Returns <code>true</code> if this trang thai don hang is hoat dong.
	*
	* @return <code>true</code> if this trang thai don hang is hoat dong; <code>false</code> otherwise
	*/
	@Override
	public boolean isHoatDong() {
		return _trangThaiDonHang.isHoatDong();
	}

	/**
	* Sets whether this trang thai don hang is hoat dong.
	*
	* @param hoatDong the hoat dong of this trang thai don hang
	*/
	@Override
	public void setHoatDong(boolean hoatDong) {
		_trangThaiDonHang.setHoatDong(hoatDong);
	}

	/**
	* Returns the ghi chu of this trang thai don hang.
	*
	* @return the ghi chu of this trang thai don hang
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _trangThaiDonHang.getGhiChu();
	}

	/**
	* Sets the ghi chu of this trang thai don hang.
	*
	* @param ghiChu the ghi chu of this trang thai don hang
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_trangThaiDonHang.setGhiChu(ghiChu);
	}

	@Override
	public boolean isNew() {
		return _trangThaiDonHang.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_trangThaiDonHang.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _trangThaiDonHang.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_trangThaiDonHang.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _trangThaiDonHang.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _trangThaiDonHang.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_trangThaiDonHang.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _trangThaiDonHang.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_trangThaiDonHang.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_trangThaiDonHang.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_trangThaiDonHang.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TrangThaiDonHangWrapper((TrangThaiDonHang)_trangThaiDonHang.clone());
	}

	@Override
	public int compareTo(
		com.minimart.portlet.banhang.model.TrangThaiDonHang trangThaiDonHang) {
		return _trangThaiDonHang.compareTo(trangThaiDonHang);
	}

	@Override
	public int hashCode() {
		return _trangThaiDonHang.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.minimart.portlet.banhang.model.TrangThaiDonHang> toCacheModel() {
		return _trangThaiDonHang.toCacheModel();
	}

	@Override
	public com.minimart.portlet.banhang.model.TrangThaiDonHang toEscapedModel() {
		return new TrangThaiDonHangWrapper(_trangThaiDonHang.toEscapedModel());
	}

	@Override
	public com.minimart.portlet.banhang.model.TrangThaiDonHang toUnescapedModel() {
		return new TrangThaiDonHangWrapper(_trangThaiDonHang.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _trangThaiDonHang.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _trangThaiDonHang.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_trangThaiDonHang.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TrangThaiDonHangWrapper)) {
			return false;
		}

		TrangThaiDonHangWrapper trangThaiDonHangWrapper = (TrangThaiDonHangWrapper)obj;

		if (Validator.equals(_trangThaiDonHang,
					trangThaiDonHangWrapper._trangThaiDonHang)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TrangThaiDonHang getWrappedTrangThaiDonHang() {
		return _trangThaiDonHang;
	}

	@Override
	public TrangThaiDonHang getWrappedModel() {
		return _trangThaiDonHang;
	}

	@Override
	public void resetOriginalValues() {
		_trangThaiDonHang.resetOriginalValues();
	}

	private TrangThaiDonHang _trangThaiDonHang;
}