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

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CuaHang}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see CuaHang
 * @generated
 */
public class CuaHangWrapper implements CuaHang, ModelWrapper<CuaHang> {
	public CuaHangWrapper(CuaHang cuaHang) {
		_cuaHang = cuaHang;
	}

	@Override
	public Class<?> getModelClass() {
		return CuaHang.class;
	}

	@Override
	public String getModelClassName() {
		return CuaHang.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("cuaHangId", getCuaHangId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("gioMoCua", getGioMoCua());
		attributes.put("gioDongCua", getGioDongCua());
		attributes.put("hoatDong", getHoatDong());
		attributes.put("uuTien", getUuTien());
		attributes.put("diaChi", getDiaChi());
		attributes.put("dienThoai", getDienThoai());
		attributes.put("khoHangId", getKhoHangId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long cuaHangId = (Long)attributes.get("cuaHangId");

		if (cuaHangId != null) {
			setCuaHangId(cuaHangId);
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

		Date gioMoCua = (Date)attributes.get("gioMoCua");

		if (gioMoCua != null) {
			setGioMoCua(gioMoCua);
		}

		Date gioDongCua = (Date)attributes.get("gioDongCua");

		if (gioDongCua != null) {
			setGioDongCua(gioDongCua);
		}

		Boolean hoatDong = (Boolean)attributes.get("hoatDong");

		if (hoatDong != null) {
			setHoatDong(hoatDong);
		}

		Integer uuTien = (Integer)attributes.get("uuTien");

		if (uuTien != null) {
			setUuTien(uuTien);
		}

		String diaChi = (String)attributes.get("diaChi");

		if (diaChi != null) {
			setDiaChi(diaChi);
		}

		String dienThoai = (String)attributes.get("dienThoai");

		if (dienThoai != null) {
			setDienThoai(dienThoai);
		}

		Long khoHangId = (Long)attributes.get("khoHangId");

		if (khoHangId != null) {
			setKhoHangId(khoHangId);
		}
	}

	/**
	* Returns the primary key of this cua hang.
	*
	* @return the primary key of this cua hang
	*/
	@Override
	public long getPrimaryKey() {
		return _cuaHang.getPrimaryKey();
	}

	/**
	* Sets the primary key of this cua hang.
	*
	* @param primaryKey the primary key of this cua hang
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_cuaHang.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this cua hang.
	*
	* @return the uuid of this cua hang
	*/
	@Override
	public java.lang.String getUuid() {
		return _cuaHang.getUuid();
	}

	/**
	* Sets the uuid of this cua hang.
	*
	* @param uuid the uuid of this cua hang
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_cuaHang.setUuid(uuid);
	}

	/**
	* Returns the cua hang ID of this cua hang.
	*
	* @return the cua hang ID of this cua hang
	*/
	@Override
	public long getCuaHangId() {
		return _cuaHang.getCuaHangId();
	}

	/**
	* Sets the cua hang ID of this cua hang.
	*
	* @param cuaHangId the cua hang ID of this cua hang
	*/
	@Override
	public void setCuaHangId(long cuaHangId) {
		_cuaHang.setCuaHangId(cuaHangId);
	}

	/**
	* Returns the company ID of this cua hang.
	*
	* @return the company ID of this cua hang
	*/
	@Override
	public long getCompanyId() {
		return _cuaHang.getCompanyId();
	}

	/**
	* Sets the company ID of this cua hang.
	*
	* @param companyId the company ID of this cua hang
	*/
	@Override
	public void setCompanyId(long companyId) {
		_cuaHang.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this cua hang.
	*
	* @return the user ID of this cua hang
	*/
	@Override
	public long getUserId() {
		return _cuaHang.getUserId();
	}

	/**
	* Sets the user ID of this cua hang.
	*
	* @param userId the user ID of this cua hang
	*/
	@Override
	public void setUserId(long userId) {
		_cuaHang.setUserId(userId);
	}

	/**
	* Returns the user uuid of this cua hang.
	*
	* @return the user uuid of this cua hang
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cuaHang.getUserUuid();
	}

	/**
	* Sets the user uuid of this cua hang.
	*
	* @param userUuid the user uuid of this cua hang
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_cuaHang.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this cua hang.
	*
	* @return the user name of this cua hang
	*/
	@Override
	public java.lang.String getUserName() {
		return _cuaHang.getUserName();
	}

	/**
	* Sets the user name of this cua hang.
	*
	* @param userName the user name of this cua hang
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_cuaHang.setUserName(userName);
	}

	/**
	* Returns the create date of this cua hang.
	*
	* @return the create date of this cua hang
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _cuaHang.getCreateDate();
	}

	/**
	* Sets the create date of this cua hang.
	*
	* @param createDate the create date of this cua hang
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_cuaHang.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this cua hang.
	*
	* @return the modified date of this cua hang
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _cuaHang.getModifiedDate();
	}

	/**
	* Sets the modified date of this cua hang.
	*
	* @param modifiedDate the modified date of this cua hang
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_cuaHang.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the ten of this cua hang.
	*
	* @return the ten of this cua hang
	*/
	@Override
	public java.lang.String getTen() {
		return _cuaHang.getTen();
	}

	/**
	* Sets the ten of this cua hang.
	*
	* @param ten the ten of this cua hang
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_cuaHang.setTen(ten);
	}

	/**
	* Returns the gio mo cua of this cua hang.
	*
	* @return the gio mo cua of this cua hang
	*/
	@Override
	public java.util.Date getGioMoCua() {
		return _cuaHang.getGioMoCua();
	}

	/**
	* Sets the gio mo cua of this cua hang.
	*
	* @param gioMoCua the gio mo cua of this cua hang
	*/
	@Override
	public void setGioMoCua(java.util.Date gioMoCua) {
		_cuaHang.setGioMoCua(gioMoCua);
	}

	/**
	* Returns the gio dong cua of this cua hang.
	*
	* @return the gio dong cua of this cua hang
	*/
	@Override
	public java.util.Date getGioDongCua() {
		return _cuaHang.getGioDongCua();
	}

	/**
	* Sets the gio dong cua of this cua hang.
	*
	* @param gioDongCua the gio dong cua of this cua hang
	*/
	@Override
	public void setGioDongCua(java.util.Date gioDongCua) {
		_cuaHang.setGioDongCua(gioDongCua);
	}

	/**
	* Returns the hoat dong of this cua hang.
	*
	* @return the hoat dong of this cua hang
	*/
	@Override
	public boolean getHoatDong() {
		return _cuaHang.getHoatDong();
	}

	/**
	* Returns <code>true</code> if this cua hang is hoat dong.
	*
	* @return <code>true</code> if this cua hang is hoat dong; <code>false</code> otherwise
	*/
	@Override
	public boolean isHoatDong() {
		return _cuaHang.isHoatDong();
	}

	/**
	* Sets whether this cua hang is hoat dong.
	*
	* @param hoatDong the hoat dong of this cua hang
	*/
	@Override
	public void setHoatDong(boolean hoatDong) {
		_cuaHang.setHoatDong(hoatDong);
	}

	/**
	* Returns the uu tien of this cua hang.
	*
	* @return the uu tien of this cua hang
	*/
	@Override
	public int getUuTien() {
		return _cuaHang.getUuTien();
	}

	/**
	* Sets the uu tien of this cua hang.
	*
	* @param uuTien the uu tien of this cua hang
	*/
	@Override
	public void setUuTien(int uuTien) {
		_cuaHang.setUuTien(uuTien);
	}

	/**
	* Returns the dia chi of this cua hang.
	*
	* @return the dia chi of this cua hang
	*/
	@Override
	public java.lang.String getDiaChi() {
		return _cuaHang.getDiaChi();
	}

	/**
	* Sets the dia chi of this cua hang.
	*
	* @param diaChi the dia chi of this cua hang
	*/
	@Override
	public void setDiaChi(java.lang.String diaChi) {
		_cuaHang.setDiaChi(diaChi);
	}

	/**
	* Returns the dien thoai of this cua hang.
	*
	* @return the dien thoai of this cua hang
	*/
	@Override
	public java.lang.String getDienThoai() {
		return _cuaHang.getDienThoai();
	}

	/**
	* Sets the dien thoai of this cua hang.
	*
	* @param dienThoai the dien thoai of this cua hang
	*/
	@Override
	public void setDienThoai(java.lang.String dienThoai) {
		_cuaHang.setDienThoai(dienThoai);
	}

	/**
	* Returns the kho hang ID of this cua hang.
	*
	* @return the kho hang ID of this cua hang
	*/
	@Override
	public long getKhoHangId() {
		return _cuaHang.getKhoHangId();
	}

	/**
	* Sets the kho hang ID of this cua hang.
	*
	* @param khoHangId the kho hang ID of this cua hang
	*/
	@Override
	public void setKhoHangId(long khoHangId) {
		_cuaHang.setKhoHangId(khoHangId);
	}

	@Override
	public boolean isNew() {
		return _cuaHang.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_cuaHang.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _cuaHang.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_cuaHang.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _cuaHang.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _cuaHang.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_cuaHang.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _cuaHang.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_cuaHang.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_cuaHang.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_cuaHang.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CuaHangWrapper((CuaHang)_cuaHang.clone());
	}

	@Override
	public int compareTo(com.minimart.portlet.cuahang.model.CuaHang cuaHang) {
		return _cuaHang.compareTo(cuaHang);
	}

	@Override
	public int hashCode() {
		return _cuaHang.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.minimart.portlet.cuahang.model.CuaHang> toCacheModel() {
		return _cuaHang.toCacheModel();
	}

	@Override
	public com.minimart.portlet.cuahang.model.CuaHang toEscapedModel() {
		return new CuaHangWrapper(_cuaHang.toEscapedModel());
	}

	@Override
	public com.minimart.portlet.cuahang.model.CuaHang toUnescapedModel() {
		return new CuaHangWrapper(_cuaHang.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _cuaHang.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _cuaHang.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_cuaHang.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CuaHangWrapper)) {
			return false;
		}

		CuaHangWrapper cuaHangWrapper = (CuaHangWrapper)obj;

		if (Validator.equals(_cuaHang, cuaHangWrapper._cuaHang)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _cuaHang.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CuaHang getWrappedCuaHang() {
		return _cuaHang;
	}

	@Override
	public CuaHang getWrappedModel() {
		return _cuaHang;
	}

	@Override
	public void resetOriginalValues() {
		_cuaHang.resetOriginalValues();
	}

	private CuaHang _cuaHang;
}