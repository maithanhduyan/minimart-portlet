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

package com.minimart.portlet.thethanhtoan.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TheTraTruoc}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see TheTraTruoc
 * @generated
 */
public class TheTraTruocWrapper implements TheTraTruoc,
	ModelWrapper<TheTraTruoc> {
	public TheTraTruocWrapper(TheTraTruoc theTraTruoc) {
		_theTraTruoc = theTraTruoc;
	}

	@Override
	public Class<?> getModelClass() {
		return TheTraTruoc.class;
	}

	@Override
	public String getModelClassName() {
		return TheTraTruoc.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("theTraTruocId", getTheTraTruocId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("tenThe", getTenThe());
		attributes.put("nhomTheTraTruocId", getNhomTheTraTruocId());
		attributes.put("khoa", getKhoa());
		attributes.put("ngayHetHan", getNgayHetHan());
		attributes.put("trangThai", getTrangThai());
		attributes.put("userModifiledId", getUserModifiledId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long theTraTruocId = (Long)attributes.get("theTraTruocId");

		if (theTraTruocId != null) {
			setTheTraTruocId(theTraTruocId);
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

		String tenThe = (String)attributes.get("tenThe");

		if (tenThe != null) {
			setTenThe(tenThe);
		}

		Long nhomTheTraTruocId = (Long)attributes.get("nhomTheTraTruocId");

		if (nhomTheTraTruocId != null) {
			setNhomTheTraTruocId(nhomTheTraTruocId);
		}

		Boolean khoa = (Boolean)attributes.get("khoa");

		if (khoa != null) {
			setKhoa(khoa);
		}

		Date ngayHetHan = (Date)attributes.get("ngayHetHan");

		if (ngayHetHan != null) {
			setNgayHetHan(ngayHetHan);
		}

		String trangThai = (String)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		Long userModifiledId = (Long)attributes.get("userModifiledId");

		if (userModifiledId != null) {
			setUserModifiledId(userModifiledId);
		}
	}

	/**
	* Returns the primary key of this the tra truoc.
	*
	* @return the primary key of this the tra truoc
	*/
	@Override
	public long getPrimaryKey() {
		return _theTraTruoc.getPrimaryKey();
	}

	/**
	* Sets the primary key of this the tra truoc.
	*
	* @param primaryKey the primary key of this the tra truoc
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_theTraTruoc.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the the tra truoc ID of this the tra truoc.
	*
	* @return the the tra truoc ID of this the tra truoc
	*/
	@Override
	public long getTheTraTruocId() {
		return _theTraTruoc.getTheTraTruocId();
	}

	/**
	* Sets the the tra truoc ID of this the tra truoc.
	*
	* @param theTraTruocId the the tra truoc ID of this the tra truoc
	*/
	@Override
	public void setTheTraTruocId(long theTraTruocId) {
		_theTraTruoc.setTheTraTruocId(theTraTruocId);
	}

	/**
	* Returns the company ID of this the tra truoc.
	*
	* @return the company ID of this the tra truoc
	*/
	@Override
	public long getCompanyId() {
		return _theTraTruoc.getCompanyId();
	}

	/**
	* Sets the company ID of this the tra truoc.
	*
	* @param companyId the company ID of this the tra truoc
	*/
	@Override
	public void setCompanyId(long companyId) {
		_theTraTruoc.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this the tra truoc.
	*
	* @return the user ID of this the tra truoc
	*/
	@Override
	public long getUserId() {
		return _theTraTruoc.getUserId();
	}

	/**
	* Sets the user ID of this the tra truoc.
	*
	* @param userId the user ID of this the tra truoc
	*/
	@Override
	public void setUserId(long userId) {
		_theTraTruoc.setUserId(userId);
	}

	/**
	* Returns the user uuid of this the tra truoc.
	*
	* @return the user uuid of this the tra truoc
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _theTraTruoc.getUserUuid();
	}

	/**
	* Sets the user uuid of this the tra truoc.
	*
	* @param userUuid the user uuid of this the tra truoc
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_theTraTruoc.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this the tra truoc.
	*
	* @return the user name of this the tra truoc
	*/
	@Override
	public java.lang.String getUserName() {
		return _theTraTruoc.getUserName();
	}

	/**
	* Sets the user name of this the tra truoc.
	*
	* @param userName the user name of this the tra truoc
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_theTraTruoc.setUserName(userName);
	}

	/**
	* Returns the create date of this the tra truoc.
	*
	* @return the create date of this the tra truoc
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _theTraTruoc.getCreateDate();
	}

	/**
	* Sets the create date of this the tra truoc.
	*
	* @param createDate the create date of this the tra truoc
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_theTraTruoc.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this the tra truoc.
	*
	* @return the modified date of this the tra truoc
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _theTraTruoc.getModifiedDate();
	}

	/**
	* Sets the modified date of this the tra truoc.
	*
	* @param modifiedDate the modified date of this the tra truoc
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_theTraTruoc.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the ten the of this the tra truoc.
	*
	* @return the ten the of this the tra truoc
	*/
	@Override
	public java.lang.String getTenThe() {
		return _theTraTruoc.getTenThe();
	}

	/**
	* Sets the ten the of this the tra truoc.
	*
	* @param tenThe the ten the of this the tra truoc
	*/
	@Override
	public void setTenThe(java.lang.String tenThe) {
		_theTraTruoc.setTenThe(tenThe);
	}

	/**
	* Returns the nhom the tra truoc ID of this the tra truoc.
	*
	* @return the nhom the tra truoc ID of this the tra truoc
	*/
	@Override
	public long getNhomTheTraTruocId() {
		return _theTraTruoc.getNhomTheTraTruocId();
	}

	/**
	* Sets the nhom the tra truoc ID of this the tra truoc.
	*
	* @param nhomTheTraTruocId the nhom the tra truoc ID of this the tra truoc
	*/
	@Override
	public void setNhomTheTraTruocId(long nhomTheTraTruocId) {
		_theTraTruoc.setNhomTheTraTruocId(nhomTheTraTruocId);
	}

	/**
	* Returns the khoa of this the tra truoc.
	*
	* @return the khoa of this the tra truoc
	*/
	@Override
	public boolean getKhoa() {
		return _theTraTruoc.getKhoa();
	}

	/**
	* Returns <code>true</code> if this the tra truoc is khoa.
	*
	* @return <code>true</code> if this the tra truoc is khoa; <code>false</code> otherwise
	*/
	@Override
	public boolean isKhoa() {
		return _theTraTruoc.isKhoa();
	}

	/**
	* Sets whether this the tra truoc is khoa.
	*
	* @param khoa the khoa of this the tra truoc
	*/
	@Override
	public void setKhoa(boolean khoa) {
		_theTraTruoc.setKhoa(khoa);
	}

	/**
	* Returns the ngay het han of this the tra truoc.
	*
	* @return the ngay het han of this the tra truoc
	*/
	@Override
	public java.util.Date getNgayHetHan() {
		return _theTraTruoc.getNgayHetHan();
	}

	/**
	* Sets the ngay het han of this the tra truoc.
	*
	* @param ngayHetHan the ngay het han of this the tra truoc
	*/
	@Override
	public void setNgayHetHan(java.util.Date ngayHetHan) {
		_theTraTruoc.setNgayHetHan(ngayHetHan);
	}

	/**
	* Returns the trang thai of this the tra truoc.
	*
	* @return the trang thai of this the tra truoc
	*/
	@Override
	public java.lang.String getTrangThai() {
		return _theTraTruoc.getTrangThai();
	}

	/**
	* Sets the trang thai of this the tra truoc.
	*
	* @param trangThai the trang thai of this the tra truoc
	*/
	@Override
	public void setTrangThai(java.lang.String trangThai) {
		_theTraTruoc.setTrangThai(trangThai);
	}

	/**
	* Returns the user modifiled ID of this the tra truoc.
	*
	* @return the user modifiled ID of this the tra truoc
	*/
	@Override
	public long getUserModifiledId() {
		return _theTraTruoc.getUserModifiledId();
	}

	/**
	* Sets the user modifiled ID of this the tra truoc.
	*
	* @param userModifiledId the user modifiled ID of this the tra truoc
	*/
	@Override
	public void setUserModifiledId(long userModifiledId) {
		_theTraTruoc.setUserModifiledId(userModifiledId);
	}

	@Override
	public boolean isNew() {
		return _theTraTruoc.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_theTraTruoc.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _theTraTruoc.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_theTraTruoc.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _theTraTruoc.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _theTraTruoc.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_theTraTruoc.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _theTraTruoc.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_theTraTruoc.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_theTraTruoc.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_theTraTruoc.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TheTraTruocWrapper((TheTraTruoc)_theTraTruoc.clone());
	}

	@Override
	public int compareTo(
		com.minimart.portlet.thethanhtoan.model.TheTraTruoc theTraTruoc) {
		return _theTraTruoc.compareTo(theTraTruoc);
	}

	@Override
	public int hashCode() {
		return _theTraTruoc.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.minimart.portlet.thethanhtoan.model.TheTraTruoc> toCacheModel() {
		return _theTraTruoc.toCacheModel();
	}

	@Override
	public com.minimart.portlet.thethanhtoan.model.TheTraTruoc toEscapedModel() {
		return new TheTraTruocWrapper(_theTraTruoc.toEscapedModel());
	}

	@Override
	public com.minimart.portlet.thethanhtoan.model.TheTraTruoc toUnescapedModel() {
		return new TheTraTruocWrapper(_theTraTruoc.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _theTraTruoc.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _theTraTruoc.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_theTraTruoc.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TheTraTruocWrapper)) {
			return false;
		}

		TheTraTruocWrapper theTraTruocWrapper = (TheTraTruocWrapper)obj;

		if (Validator.equals(_theTraTruoc, theTraTruocWrapper._theTraTruoc)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TheTraTruoc getWrappedTheTraTruoc() {
		return _theTraTruoc;
	}

	@Override
	public TheTraTruoc getWrappedModel() {
		return _theTraTruoc;
	}

	@Override
	public void resetOriginalValues() {
		_theTraTruoc.resetOriginalValues();
	}

	private TheTraTruoc _theTraTruoc;
}