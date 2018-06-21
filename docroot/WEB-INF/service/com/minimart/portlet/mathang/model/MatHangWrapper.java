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

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MatHang}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see MatHang
 * @generated
 */
public class MatHangWrapper implements MatHang, ModelWrapper<MatHang> {
	public MatHangWrapper(MatHang matHang) {
		_matHang = matHang;
	}

	@Override
	public Class<?> getModelClass() {
		return MatHang.class;
	}

	@Override
	public String getModelClassName() {
		return MatHang.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("matHangId", getMatHangId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("code", getCode());
		attributes.put("giaNhap", getGiaNhap());
		attributes.put("status", getStatus());
		attributes.put("giaBan", getGiaBan());
		attributes.put("giaBan1", getGiaBan1());
		attributes.put("giaBan2", getGiaBan2());
		attributes.put("giaBan3", getGiaBan3());
		attributes.put("tonToiThieu", getTonToiThieu());
		attributes.put("tonToiDa", getTonToiDa());
		attributes.put("giaVon", getGiaVon());
		attributes.put("hoaHong", getHoaHong());
		attributes.put("nhomMatHangId", getNhomMatHangId());
		attributes.put("donViTinhId", getDonViTinhId());
		attributes.put("size", getSize());
		attributes.put("imageUrl", getImageUrl());
		attributes.put("hoatDong", getHoatDong());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long matHangId = (Long)attributes.get("matHangId");

		if (matHangId != null) {
			setMatHangId(matHangId);
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

		Integer giaNhap = (Integer)attributes.get("giaNhap");

		if (giaNhap != null) {
			setGiaNhap(giaNhap);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Integer giaBan = (Integer)attributes.get("giaBan");

		if (giaBan != null) {
			setGiaBan(giaBan);
		}

		Integer giaBan1 = (Integer)attributes.get("giaBan1");

		if (giaBan1 != null) {
			setGiaBan1(giaBan1);
		}

		Integer giaBan2 = (Integer)attributes.get("giaBan2");

		if (giaBan2 != null) {
			setGiaBan2(giaBan2);
		}

		Integer giaBan3 = (Integer)attributes.get("giaBan3");

		if (giaBan3 != null) {
			setGiaBan3(giaBan3);
		}

		Integer tonToiThieu = (Integer)attributes.get("tonToiThieu");

		if (tonToiThieu != null) {
			setTonToiThieu(tonToiThieu);
		}

		Integer tonToiDa = (Integer)attributes.get("tonToiDa");

		if (tonToiDa != null) {
			setTonToiDa(tonToiDa);
		}

		Integer giaVon = (Integer)attributes.get("giaVon");

		if (giaVon != null) {
			setGiaVon(giaVon);
		}

		Integer hoaHong = (Integer)attributes.get("hoaHong");

		if (hoaHong != null) {
			setHoaHong(hoaHong);
		}

		Long nhomMatHangId = (Long)attributes.get("nhomMatHangId");

		if (nhomMatHangId != null) {
			setNhomMatHangId(nhomMatHangId);
		}

		Long donViTinhId = (Long)attributes.get("donViTinhId");

		if (donViTinhId != null) {
			setDonViTinhId(donViTinhId);
		}

		String size = (String)attributes.get("size");

		if (size != null) {
			setSize(size);
		}

		String imageUrl = (String)attributes.get("imageUrl");

		if (imageUrl != null) {
			setImageUrl(imageUrl);
		}

		Boolean hoatDong = (Boolean)attributes.get("hoatDong");

		if (hoatDong != null) {
			setHoatDong(hoatDong);
		}
	}

	/**
	* Returns the primary key of this mat hang.
	*
	* @return the primary key of this mat hang
	*/
	@Override
	public long getPrimaryKey() {
		return _matHang.getPrimaryKey();
	}

	/**
	* Sets the primary key of this mat hang.
	*
	* @param primaryKey the primary key of this mat hang
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_matHang.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this mat hang.
	*
	* @return the uuid of this mat hang
	*/
	@Override
	public java.lang.String getUuid() {
		return _matHang.getUuid();
	}

	/**
	* Sets the uuid of this mat hang.
	*
	* @param uuid the uuid of this mat hang
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_matHang.setUuid(uuid);
	}

	/**
	* Returns the mat hang ID of this mat hang.
	*
	* @return the mat hang ID of this mat hang
	*/
	@Override
	public long getMatHangId() {
		return _matHang.getMatHangId();
	}

	/**
	* Sets the mat hang ID of this mat hang.
	*
	* @param matHangId the mat hang ID of this mat hang
	*/
	@Override
	public void setMatHangId(long matHangId) {
		_matHang.setMatHangId(matHangId);
	}

	/**
	* Returns the group ID of this mat hang.
	*
	* @return the group ID of this mat hang
	*/
	@Override
	public long getGroupId() {
		return _matHang.getGroupId();
	}

	/**
	* Sets the group ID of this mat hang.
	*
	* @param groupId the group ID of this mat hang
	*/
	@Override
	public void setGroupId(long groupId) {
		_matHang.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this mat hang.
	*
	* @return the company ID of this mat hang
	*/
	@Override
	public long getCompanyId() {
		return _matHang.getCompanyId();
	}

	/**
	* Sets the company ID of this mat hang.
	*
	* @param companyId the company ID of this mat hang
	*/
	@Override
	public void setCompanyId(long companyId) {
		_matHang.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this mat hang.
	*
	* @return the user ID of this mat hang
	*/
	@Override
	public long getUserId() {
		return _matHang.getUserId();
	}

	/**
	* Sets the user ID of this mat hang.
	*
	* @param userId the user ID of this mat hang
	*/
	@Override
	public void setUserId(long userId) {
		_matHang.setUserId(userId);
	}

	/**
	* Returns the user uuid of this mat hang.
	*
	* @return the user uuid of this mat hang
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _matHang.getUserUuid();
	}

	/**
	* Sets the user uuid of this mat hang.
	*
	* @param userUuid the user uuid of this mat hang
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_matHang.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this mat hang.
	*
	* @return the user name of this mat hang
	*/
	@Override
	public java.lang.String getUserName() {
		return _matHang.getUserName();
	}

	/**
	* Sets the user name of this mat hang.
	*
	* @param userName the user name of this mat hang
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_matHang.setUserName(userName);
	}

	/**
	* Returns the create date of this mat hang.
	*
	* @return the create date of this mat hang
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _matHang.getCreateDate();
	}

	/**
	* Sets the create date of this mat hang.
	*
	* @param createDate the create date of this mat hang
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_matHang.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this mat hang.
	*
	* @return the modified date of this mat hang
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _matHang.getModifiedDate();
	}

	/**
	* Sets the modified date of this mat hang.
	*
	* @param modifiedDate the modified date of this mat hang
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_matHang.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the name of this mat hang.
	*
	* @return the name of this mat hang
	*/
	@Override
	public java.lang.String getName() {
		return _matHang.getName();
	}

	/**
	* Sets the name of this mat hang.
	*
	* @param name the name of this mat hang
	*/
	@Override
	public void setName(java.lang.String name) {
		_matHang.setName(name);
	}

	/**
	* Returns the code of this mat hang.
	*
	* @return the code of this mat hang
	*/
	@Override
	public java.lang.String getCode() {
		return _matHang.getCode();
	}

	/**
	* Sets the code of this mat hang.
	*
	* @param code the code of this mat hang
	*/
	@Override
	public void setCode(java.lang.String code) {
		_matHang.setCode(code);
	}

	/**
	* Returns the gia nhap of this mat hang.
	*
	* @return the gia nhap of this mat hang
	*/
	@Override
	public int getGiaNhap() {
		return _matHang.getGiaNhap();
	}

	/**
	* Sets the gia nhap of this mat hang.
	*
	* @param giaNhap the gia nhap of this mat hang
	*/
	@Override
	public void setGiaNhap(int giaNhap) {
		_matHang.setGiaNhap(giaNhap);
	}

	/**
	* Returns the status of this mat hang.
	*
	* @return the status of this mat hang
	*/
	@Override
	public int getStatus() {
		return _matHang.getStatus();
	}

	/**
	* Sets the status of this mat hang.
	*
	* @param status the status of this mat hang
	*/
	@Override
	public void setStatus(int status) {
		_matHang.setStatus(status);
	}

	/**
	* Returns the gia ban of this mat hang.
	*
	* @return the gia ban of this mat hang
	*/
	@Override
	public int getGiaBan() {
		return _matHang.getGiaBan();
	}

	/**
	* Sets the gia ban of this mat hang.
	*
	* @param giaBan the gia ban of this mat hang
	*/
	@Override
	public void setGiaBan(int giaBan) {
		_matHang.setGiaBan(giaBan);
	}

	/**
	* Returns the gia ban1 of this mat hang.
	*
	* @return the gia ban1 of this mat hang
	*/
	@Override
	public int getGiaBan1() {
		return _matHang.getGiaBan1();
	}

	/**
	* Sets the gia ban1 of this mat hang.
	*
	* @param giaBan1 the gia ban1 of this mat hang
	*/
	@Override
	public void setGiaBan1(int giaBan1) {
		_matHang.setGiaBan1(giaBan1);
	}

	/**
	* Returns the gia ban2 of this mat hang.
	*
	* @return the gia ban2 of this mat hang
	*/
	@Override
	public int getGiaBan2() {
		return _matHang.getGiaBan2();
	}

	/**
	* Sets the gia ban2 of this mat hang.
	*
	* @param giaBan2 the gia ban2 of this mat hang
	*/
	@Override
	public void setGiaBan2(int giaBan2) {
		_matHang.setGiaBan2(giaBan2);
	}

	/**
	* Returns the gia ban3 of this mat hang.
	*
	* @return the gia ban3 of this mat hang
	*/
	@Override
	public int getGiaBan3() {
		return _matHang.getGiaBan3();
	}

	/**
	* Sets the gia ban3 of this mat hang.
	*
	* @param giaBan3 the gia ban3 of this mat hang
	*/
	@Override
	public void setGiaBan3(int giaBan3) {
		_matHang.setGiaBan3(giaBan3);
	}

	/**
	* Returns the ton toi thieu of this mat hang.
	*
	* @return the ton toi thieu of this mat hang
	*/
	@Override
	public int getTonToiThieu() {
		return _matHang.getTonToiThieu();
	}

	/**
	* Sets the ton toi thieu of this mat hang.
	*
	* @param tonToiThieu the ton toi thieu of this mat hang
	*/
	@Override
	public void setTonToiThieu(int tonToiThieu) {
		_matHang.setTonToiThieu(tonToiThieu);
	}

	/**
	* Returns the ton toi da of this mat hang.
	*
	* @return the ton toi da of this mat hang
	*/
	@Override
	public int getTonToiDa() {
		return _matHang.getTonToiDa();
	}

	/**
	* Sets the ton toi da of this mat hang.
	*
	* @param tonToiDa the ton toi da of this mat hang
	*/
	@Override
	public void setTonToiDa(int tonToiDa) {
		_matHang.setTonToiDa(tonToiDa);
	}

	/**
	* Returns the gia von of this mat hang.
	*
	* @return the gia von of this mat hang
	*/
	@Override
	public int getGiaVon() {
		return _matHang.getGiaVon();
	}

	/**
	* Sets the gia von of this mat hang.
	*
	* @param giaVon the gia von of this mat hang
	*/
	@Override
	public void setGiaVon(int giaVon) {
		_matHang.setGiaVon(giaVon);
	}

	/**
	* Returns the hoa hong of this mat hang.
	*
	* @return the hoa hong of this mat hang
	*/
	@Override
	public int getHoaHong() {
		return _matHang.getHoaHong();
	}

	/**
	* Sets the hoa hong of this mat hang.
	*
	* @param hoaHong the hoa hong of this mat hang
	*/
	@Override
	public void setHoaHong(int hoaHong) {
		_matHang.setHoaHong(hoaHong);
	}

	/**
	* Returns the nhom mat hang ID of this mat hang.
	*
	* @return the nhom mat hang ID of this mat hang
	*/
	@Override
	public long getNhomMatHangId() {
		return _matHang.getNhomMatHangId();
	}

	/**
	* Sets the nhom mat hang ID of this mat hang.
	*
	* @param nhomMatHangId the nhom mat hang ID of this mat hang
	*/
	@Override
	public void setNhomMatHangId(long nhomMatHangId) {
		_matHang.setNhomMatHangId(nhomMatHangId);
	}

	/**
	* Returns the don vi tinh ID of this mat hang.
	*
	* @return the don vi tinh ID of this mat hang
	*/
	@Override
	public long getDonViTinhId() {
		return _matHang.getDonViTinhId();
	}

	/**
	* Sets the don vi tinh ID of this mat hang.
	*
	* @param donViTinhId the don vi tinh ID of this mat hang
	*/
	@Override
	public void setDonViTinhId(long donViTinhId) {
		_matHang.setDonViTinhId(donViTinhId);
	}

	/**
	* Returns the size of this mat hang.
	*
	* @return the size of this mat hang
	*/
	@Override
	public java.lang.String getSize() {
		return _matHang.getSize();
	}

	/**
	* Sets the size of this mat hang.
	*
	* @param size the size of this mat hang
	*/
	@Override
	public void setSize(java.lang.String size) {
		_matHang.setSize(size);
	}

	/**
	* Returns the image url of this mat hang.
	*
	* @return the image url of this mat hang
	*/
	@Override
	public java.lang.String getImageUrl() {
		return _matHang.getImageUrl();
	}

	/**
	* Sets the image url of this mat hang.
	*
	* @param imageUrl the image url of this mat hang
	*/
	@Override
	public void setImageUrl(java.lang.String imageUrl) {
		_matHang.setImageUrl(imageUrl);
	}

	/**
	* Returns the hoat dong of this mat hang.
	*
	* @return the hoat dong of this mat hang
	*/
	@Override
	public boolean getHoatDong() {
		return _matHang.getHoatDong();
	}

	/**
	* Returns <code>true</code> if this mat hang is hoat dong.
	*
	* @return <code>true</code> if this mat hang is hoat dong; <code>false</code> otherwise
	*/
	@Override
	public boolean isHoatDong() {
		return _matHang.isHoatDong();
	}

	/**
	* Sets whether this mat hang is hoat dong.
	*
	* @param hoatDong the hoat dong of this mat hang
	*/
	@Override
	public void setHoatDong(boolean hoatDong) {
		_matHang.setHoatDong(hoatDong);
	}

	@Override
	public boolean isNew() {
		return _matHang.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_matHang.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _matHang.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_matHang.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _matHang.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _matHang.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_matHang.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _matHang.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_matHang.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_matHang.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_matHang.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MatHangWrapper((MatHang)_matHang.clone());
	}

	@Override
	public int compareTo(com.minimart.portlet.mathang.model.MatHang matHang) {
		return _matHang.compareTo(matHang);
	}

	@Override
	public int hashCode() {
		return _matHang.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.minimart.portlet.mathang.model.MatHang> toCacheModel() {
		return _matHang.toCacheModel();
	}

	@Override
	public com.minimart.portlet.mathang.model.MatHang toEscapedModel() {
		return new MatHangWrapper(_matHang.toEscapedModel());
	}

	@Override
	public com.minimart.portlet.mathang.model.MatHang toUnescapedModel() {
		return new MatHangWrapper(_matHang.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _matHang.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _matHang.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_matHang.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MatHangWrapper)) {
			return false;
		}

		MatHangWrapper matHangWrapper = (MatHangWrapper)obj;

		if (Validator.equals(_matHang, matHangWrapper._matHang)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _matHang.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public MatHang getWrappedMatHang() {
		return _matHang;
	}

	@Override
	public MatHang getWrappedModel() {
		return _matHang;
	}

	@Override
	public void resetOriginalValues() {
		_matHang.resetOriginalValues();
	}

	private MatHang _matHang;
}