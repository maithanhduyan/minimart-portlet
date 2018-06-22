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

package com.minimart.portlet.khachhang.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link NhomKhachHang}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see NhomKhachHang
 * @generated
 */
public class NhomKhachHangWrapper implements NhomKhachHang,
	ModelWrapper<NhomKhachHang> {
	public NhomKhachHangWrapper(NhomKhachHang nhomKhachHang) {
		_nhomKhachHang = nhomKhachHang;
	}

	@Override
	public Class<?> getModelClass() {
		return NhomKhachHang.class;
	}

	@Override
	public String getModelClassName() {
		return NhomKhachHang.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("nhomKhachHangId", getNhomKhachHangId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("hoatDong", getHoatDong());
		attributes.put("diemTichLuy", getDiemTichLuy());
		attributes.put("tiLeGiamGia", getTiLeGiamGia());
		attributes.put("uuTien", getUuTien());
		attributes.put("image", getImage());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long nhomKhachHangId = (Long)attributes.get("nhomKhachHangId");

		if (nhomKhachHangId != null) {
			setNhomKhachHangId(nhomKhachHangId);
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

		Integer diemTichLuy = (Integer)attributes.get("diemTichLuy");

		if (diemTichLuy != null) {
			setDiemTichLuy(diemTichLuy);
		}

		Integer tiLeGiamGia = (Integer)attributes.get("tiLeGiamGia");

		if (tiLeGiamGia != null) {
			setTiLeGiamGia(tiLeGiamGia);
		}

		Integer uuTien = (Integer)attributes.get("uuTien");

		if (uuTien != null) {
			setUuTien(uuTien);
		}

		String image = (String)attributes.get("image");

		if (image != null) {
			setImage(image);
		}
	}

	/**
	* Returns the primary key of this nhom khach hang.
	*
	* @return the primary key of this nhom khach hang
	*/
	@Override
	public long getPrimaryKey() {
		return _nhomKhachHang.getPrimaryKey();
	}

	/**
	* Sets the primary key of this nhom khach hang.
	*
	* @param primaryKey the primary key of this nhom khach hang
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_nhomKhachHang.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the nhom khach hang ID of this nhom khach hang.
	*
	* @return the nhom khach hang ID of this nhom khach hang
	*/
	@Override
	public long getNhomKhachHangId() {
		return _nhomKhachHang.getNhomKhachHangId();
	}

	/**
	* Sets the nhom khach hang ID of this nhom khach hang.
	*
	* @param nhomKhachHangId the nhom khach hang ID of this nhom khach hang
	*/
	@Override
	public void setNhomKhachHangId(long nhomKhachHangId) {
		_nhomKhachHang.setNhomKhachHangId(nhomKhachHangId);
	}

	/**
	* Returns the company ID of this nhom khach hang.
	*
	* @return the company ID of this nhom khach hang
	*/
	@Override
	public long getCompanyId() {
		return _nhomKhachHang.getCompanyId();
	}

	/**
	* Sets the company ID of this nhom khach hang.
	*
	* @param companyId the company ID of this nhom khach hang
	*/
	@Override
	public void setCompanyId(long companyId) {
		_nhomKhachHang.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this nhom khach hang.
	*
	* @return the user ID of this nhom khach hang
	*/
	@Override
	public long getUserId() {
		return _nhomKhachHang.getUserId();
	}

	/**
	* Sets the user ID of this nhom khach hang.
	*
	* @param userId the user ID of this nhom khach hang
	*/
	@Override
	public void setUserId(long userId) {
		_nhomKhachHang.setUserId(userId);
	}

	/**
	* Returns the user uuid of this nhom khach hang.
	*
	* @return the user uuid of this nhom khach hang
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhomKhachHang.getUserUuid();
	}

	/**
	* Sets the user uuid of this nhom khach hang.
	*
	* @param userUuid the user uuid of this nhom khach hang
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_nhomKhachHang.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this nhom khach hang.
	*
	* @return the user name of this nhom khach hang
	*/
	@Override
	public java.lang.String getUserName() {
		return _nhomKhachHang.getUserName();
	}

	/**
	* Sets the user name of this nhom khach hang.
	*
	* @param userName the user name of this nhom khach hang
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_nhomKhachHang.setUserName(userName);
	}

	/**
	* Returns the create date of this nhom khach hang.
	*
	* @return the create date of this nhom khach hang
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _nhomKhachHang.getCreateDate();
	}

	/**
	* Sets the create date of this nhom khach hang.
	*
	* @param createDate the create date of this nhom khach hang
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_nhomKhachHang.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this nhom khach hang.
	*
	* @return the modified date of this nhom khach hang
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _nhomKhachHang.getModifiedDate();
	}

	/**
	* Sets the modified date of this nhom khach hang.
	*
	* @param modifiedDate the modified date of this nhom khach hang
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_nhomKhachHang.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the ten of this nhom khach hang.
	*
	* @return the ten of this nhom khach hang
	*/
	@Override
	public java.lang.String getTen() {
		return _nhomKhachHang.getTen();
	}

	/**
	* Sets the ten of this nhom khach hang.
	*
	* @param ten the ten of this nhom khach hang
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_nhomKhachHang.setTen(ten);
	}

	/**
	* Returns the hoat dong of this nhom khach hang.
	*
	* @return the hoat dong of this nhom khach hang
	*/
	@Override
	public boolean getHoatDong() {
		return _nhomKhachHang.getHoatDong();
	}

	/**
	* Returns <code>true</code> if this nhom khach hang is hoat dong.
	*
	* @return <code>true</code> if this nhom khach hang is hoat dong; <code>false</code> otherwise
	*/
	@Override
	public boolean isHoatDong() {
		return _nhomKhachHang.isHoatDong();
	}

	/**
	* Sets whether this nhom khach hang is hoat dong.
	*
	* @param hoatDong the hoat dong of this nhom khach hang
	*/
	@Override
	public void setHoatDong(boolean hoatDong) {
		_nhomKhachHang.setHoatDong(hoatDong);
	}

	/**
	* Returns the diem tich luy of this nhom khach hang.
	*
	* @return the diem tich luy of this nhom khach hang
	*/
	@Override
	public int getDiemTichLuy() {
		return _nhomKhachHang.getDiemTichLuy();
	}

	/**
	* Sets the diem tich luy of this nhom khach hang.
	*
	* @param diemTichLuy the diem tich luy of this nhom khach hang
	*/
	@Override
	public void setDiemTichLuy(int diemTichLuy) {
		_nhomKhachHang.setDiemTichLuy(diemTichLuy);
	}

	/**
	* Returns the ti le giam gia of this nhom khach hang.
	*
	* @return the ti le giam gia of this nhom khach hang
	*/
	@Override
	public int getTiLeGiamGia() {
		return _nhomKhachHang.getTiLeGiamGia();
	}

	/**
	* Sets the ti le giam gia of this nhom khach hang.
	*
	* @param tiLeGiamGia the ti le giam gia of this nhom khach hang
	*/
	@Override
	public void setTiLeGiamGia(int tiLeGiamGia) {
		_nhomKhachHang.setTiLeGiamGia(tiLeGiamGia);
	}

	/**
	* Returns the uu tien of this nhom khach hang.
	*
	* @return the uu tien of this nhom khach hang
	*/
	@Override
	public int getUuTien() {
		return _nhomKhachHang.getUuTien();
	}

	/**
	* Sets the uu tien of this nhom khach hang.
	*
	* @param uuTien the uu tien of this nhom khach hang
	*/
	@Override
	public void setUuTien(int uuTien) {
		_nhomKhachHang.setUuTien(uuTien);
	}

	/**
	* Returns the image of this nhom khach hang.
	*
	* @return the image of this nhom khach hang
	*/
	@Override
	public java.lang.String getImage() {
		return _nhomKhachHang.getImage();
	}

	/**
	* Sets the image of this nhom khach hang.
	*
	* @param image the image of this nhom khach hang
	*/
	@Override
	public void setImage(java.lang.String image) {
		_nhomKhachHang.setImage(image);
	}

	@Override
	public boolean isNew() {
		return _nhomKhachHang.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_nhomKhachHang.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _nhomKhachHang.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_nhomKhachHang.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _nhomKhachHang.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _nhomKhachHang.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_nhomKhachHang.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _nhomKhachHang.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_nhomKhachHang.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_nhomKhachHang.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_nhomKhachHang.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new NhomKhachHangWrapper((NhomKhachHang)_nhomKhachHang.clone());
	}

	@Override
	public int compareTo(
		com.minimart.portlet.khachhang.model.NhomKhachHang nhomKhachHang) {
		return _nhomKhachHang.compareTo(nhomKhachHang);
	}

	@Override
	public int hashCode() {
		return _nhomKhachHang.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.minimart.portlet.khachhang.model.NhomKhachHang> toCacheModel() {
		return _nhomKhachHang.toCacheModel();
	}

	@Override
	public com.minimart.portlet.khachhang.model.NhomKhachHang toEscapedModel() {
		return new NhomKhachHangWrapper(_nhomKhachHang.toEscapedModel());
	}

	@Override
	public com.minimart.portlet.khachhang.model.NhomKhachHang toUnescapedModel() {
		return new NhomKhachHangWrapper(_nhomKhachHang.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _nhomKhachHang.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _nhomKhachHang.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_nhomKhachHang.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NhomKhachHangWrapper)) {
			return false;
		}

		NhomKhachHangWrapper nhomKhachHangWrapper = (NhomKhachHangWrapper)obj;

		if (Validator.equals(_nhomKhachHang, nhomKhachHangWrapper._nhomKhachHang)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public NhomKhachHang getWrappedNhomKhachHang() {
		return _nhomKhachHang;
	}

	@Override
	public NhomKhachHang getWrappedModel() {
		return _nhomKhachHang;
	}

	@Override
	public void resetOriginalValues() {
		_nhomKhachHang.resetOriginalValues();
	}

	private NhomKhachHang _nhomKhachHang;
}