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

package com.minimart.portlet.khohang.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link KhoHang}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see KhoHang
 * @generated
 */
public class KhoHangWrapper implements KhoHang, ModelWrapper<KhoHang> {
	public KhoHangWrapper(KhoHang khoHang) {
		_khoHang = khoHang;
	}

	@Override
	public Class<?> getModelClass() {
		return KhoHang.class;
	}

	@Override
	public String getModelClassName() {
		return KhoHang.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("khoHangId", getKhoHangId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("trangThai", getTrangThai());
		attributes.put("itemType", getItemType());
		attributes.put("choPhepNhapKho", getChoPhepNhapKho());
		attributes.put("cuaHangId", getCuaHangId());
		attributes.put("autoId", getAutoId());
		attributes.put("sigmaId", getSigmaId());
		attributes.put("ghiChu", getGhiChu());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long khoHangId = (Long)attributes.get("khoHangId");

		if (khoHangId != null) {
			setKhoHangId(khoHangId);
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

		Boolean trangThai = (Boolean)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		Integer itemType = (Integer)attributes.get("itemType");

		if (itemType != null) {
			setItemType(itemType);
		}

		Boolean choPhepNhapKho = (Boolean)attributes.get("choPhepNhapKho");

		if (choPhepNhapKho != null) {
			setChoPhepNhapKho(choPhepNhapKho);
		}

		Long cuaHangId = (Long)attributes.get("cuaHangId");

		if (cuaHangId != null) {
			setCuaHangId(cuaHangId);
		}

		Long autoId = (Long)attributes.get("autoId");

		if (autoId != null) {
			setAutoId(autoId);
		}

		Long sigmaId = (Long)attributes.get("sigmaId");

		if (sigmaId != null) {
			setSigmaId(sigmaId);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}
	}

	/**
	* Returns the primary key of this kho hang.
	*
	* @return the primary key of this kho hang
	*/
	@Override
	public long getPrimaryKey() {
		return _khoHang.getPrimaryKey();
	}

	/**
	* Sets the primary key of this kho hang.
	*
	* @param primaryKey the primary key of this kho hang
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_khoHang.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the kho hang ID of this kho hang.
	*
	* @return the kho hang ID of this kho hang
	*/
	@Override
	public long getKhoHangId() {
		return _khoHang.getKhoHangId();
	}

	/**
	* Sets the kho hang ID of this kho hang.
	*
	* @param khoHangId the kho hang ID of this kho hang
	*/
	@Override
	public void setKhoHangId(long khoHangId) {
		_khoHang.setKhoHangId(khoHangId);
	}

	/**
	* Returns the company ID of this kho hang.
	*
	* @return the company ID of this kho hang
	*/
	@Override
	public long getCompanyId() {
		return _khoHang.getCompanyId();
	}

	/**
	* Sets the company ID of this kho hang.
	*
	* @param companyId the company ID of this kho hang
	*/
	@Override
	public void setCompanyId(long companyId) {
		_khoHang.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this kho hang.
	*
	* @return the user ID of this kho hang
	*/
	@Override
	public long getUserId() {
		return _khoHang.getUserId();
	}

	/**
	* Sets the user ID of this kho hang.
	*
	* @param userId the user ID of this kho hang
	*/
	@Override
	public void setUserId(long userId) {
		_khoHang.setUserId(userId);
	}

	/**
	* Returns the user uuid of this kho hang.
	*
	* @return the user uuid of this kho hang
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _khoHang.getUserUuid();
	}

	/**
	* Sets the user uuid of this kho hang.
	*
	* @param userUuid the user uuid of this kho hang
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_khoHang.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this kho hang.
	*
	* @return the user name of this kho hang
	*/
	@Override
	public java.lang.String getUserName() {
		return _khoHang.getUserName();
	}

	/**
	* Sets the user name of this kho hang.
	*
	* @param userName the user name of this kho hang
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_khoHang.setUserName(userName);
	}

	/**
	* Returns the create date of this kho hang.
	*
	* @return the create date of this kho hang
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _khoHang.getCreateDate();
	}

	/**
	* Sets the create date of this kho hang.
	*
	* @param createDate the create date of this kho hang
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_khoHang.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this kho hang.
	*
	* @return the modified date of this kho hang
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _khoHang.getModifiedDate();
	}

	/**
	* Sets the modified date of this kho hang.
	*
	* @param modifiedDate the modified date of this kho hang
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_khoHang.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the ten of this kho hang.
	*
	* @return the ten of this kho hang
	*/
	@Override
	public java.lang.String getTen() {
		return _khoHang.getTen();
	}

	/**
	* Sets the ten of this kho hang.
	*
	* @param ten the ten of this kho hang
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_khoHang.setTen(ten);
	}

	/**
	* Returns the trang thai of this kho hang.
	*
	* @return the trang thai of this kho hang
	*/
	@Override
	public boolean getTrangThai() {
		return _khoHang.getTrangThai();
	}

	/**
	* Returns <code>true</code> if this kho hang is trang thai.
	*
	* @return <code>true</code> if this kho hang is trang thai; <code>false</code> otherwise
	*/
	@Override
	public boolean isTrangThai() {
		return _khoHang.isTrangThai();
	}

	/**
	* Sets whether this kho hang is trang thai.
	*
	* @param trangThai the trang thai of this kho hang
	*/
	@Override
	public void setTrangThai(boolean trangThai) {
		_khoHang.setTrangThai(trangThai);
	}

	/**
	* Returns the item type of this kho hang.
	*
	* @return the item type of this kho hang
	*/
	@Override
	public int getItemType() {
		return _khoHang.getItemType();
	}

	/**
	* Sets the item type of this kho hang.
	*
	* @param itemType the item type of this kho hang
	*/
	@Override
	public void setItemType(int itemType) {
		_khoHang.setItemType(itemType);
	}

	/**
	* Returns the cho phep nhap kho of this kho hang.
	*
	* @return the cho phep nhap kho of this kho hang
	*/
	@Override
	public boolean getChoPhepNhapKho() {
		return _khoHang.getChoPhepNhapKho();
	}

	/**
	* Returns <code>true</code> if this kho hang is cho phep nhap kho.
	*
	* @return <code>true</code> if this kho hang is cho phep nhap kho; <code>false</code> otherwise
	*/
	@Override
	public boolean isChoPhepNhapKho() {
		return _khoHang.isChoPhepNhapKho();
	}

	/**
	* Sets whether this kho hang is cho phep nhap kho.
	*
	* @param choPhepNhapKho the cho phep nhap kho of this kho hang
	*/
	@Override
	public void setChoPhepNhapKho(boolean choPhepNhapKho) {
		_khoHang.setChoPhepNhapKho(choPhepNhapKho);
	}

	/**
	* Returns the cua hang ID of this kho hang.
	*
	* @return the cua hang ID of this kho hang
	*/
	@Override
	public long getCuaHangId() {
		return _khoHang.getCuaHangId();
	}

	/**
	* Sets the cua hang ID of this kho hang.
	*
	* @param cuaHangId the cua hang ID of this kho hang
	*/
	@Override
	public void setCuaHangId(long cuaHangId) {
		_khoHang.setCuaHangId(cuaHangId);
	}

	/**
	* Returns the auto ID of this kho hang.
	*
	* @return the auto ID of this kho hang
	*/
	@Override
	public long getAutoId() {
		return _khoHang.getAutoId();
	}

	/**
	* Sets the auto ID of this kho hang.
	*
	* @param autoId the auto ID of this kho hang
	*/
	@Override
	public void setAutoId(long autoId) {
		_khoHang.setAutoId(autoId);
	}

	/**
	* Returns the sigma ID of this kho hang.
	*
	* @return the sigma ID of this kho hang
	*/
	@Override
	public long getSigmaId() {
		return _khoHang.getSigmaId();
	}

	/**
	* Sets the sigma ID of this kho hang.
	*
	* @param sigmaId the sigma ID of this kho hang
	*/
	@Override
	public void setSigmaId(long sigmaId) {
		_khoHang.setSigmaId(sigmaId);
	}

	/**
	* Returns the ghi chu of this kho hang.
	*
	* @return the ghi chu of this kho hang
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _khoHang.getGhiChu();
	}

	/**
	* Sets the ghi chu of this kho hang.
	*
	* @param ghiChu the ghi chu of this kho hang
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_khoHang.setGhiChu(ghiChu);
	}

	@Override
	public boolean isNew() {
		return _khoHang.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_khoHang.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _khoHang.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_khoHang.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _khoHang.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _khoHang.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_khoHang.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _khoHang.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_khoHang.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_khoHang.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_khoHang.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new KhoHangWrapper((KhoHang)_khoHang.clone());
	}

	@Override
	public int compareTo(com.minimart.portlet.khohang.model.KhoHang khoHang) {
		return _khoHang.compareTo(khoHang);
	}

	@Override
	public int hashCode() {
		return _khoHang.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.minimart.portlet.khohang.model.KhoHang> toCacheModel() {
		return _khoHang.toCacheModel();
	}

	@Override
	public com.minimart.portlet.khohang.model.KhoHang toEscapedModel() {
		return new KhoHangWrapper(_khoHang.toEscapedModel());
	}

	@Override
	public com.minimart.portlet.khohang.model.KhoHang toUnescapedModel() {
		return new KhoHangWrapper(_khoHang.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _khoHang.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _khoHang.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_khoHang.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KhoHangWrapper)) {
			return false;
		}

		KhoHangWrapper khoHangWrapper = (KhoHangWrapper)obj;

		if (Validator.equals(_khoHang, khoHangWrapper._khoHang)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public KhoHang getWrappedKhoHang() {
		return _khoHang;
	}

	@Override
	public KhoHang getWrappedModel() {
		return _khoHang;
	}

	@Override
	public void resetOriginalValues() {
		_khoHang.resetOriginalValues();
	}

	private KhoHang _khoHang;
}