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

package com.minimart.portlet.ketoan.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link BangLuong}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see BangLuong
 * @generated
 */
public class BangLuongWrapper implements BangLuong, ModelWrapper<BangLuong> {
	public BangLuongWrapper(BangLuong bangLuong) {
		_bangLuong = bangLuong;
	}

	@Override
	public Class<?> getModelClass() {
		return BangLuong.class;
	}

	@Override
	public String getModelClassName() {
		return BangLuong.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("banLuongId", getBanLuongId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("trangThai", getTrangThai());
		attributes.put("thang", getThang());
		attributes.put("nam", getNam());
		attributes.put("ngay", getNgay());
		attributes.put("chiTiet", getChiTiet());
		attributes.put("ghiChu", getGhiChu());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long banLuongId = (Long)attributes.get("banLuongId");

		if (banLuongId != null) {
			setBanLuongId(banLuongId);
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

		Integer thang = (Integer)attributes.get("thang");

		if (thang != null) {
			setThang(thang);
		}

		Integer nam = (Integer)attributes.get("nam");

		if (nam != null) {
			setNam(nam);
		}

		Date ngay = (Date)attributes.get("ngay");

		if (ngay != null) {
			setNgay(ngay);
		}

		String chiTiet = (String)attributes.get("chiTiet");

		if (chiTiet != null) {
			setChiTiet(chiTiet);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}
	}

	/**
	* Returns the primary key of this bang luong.
	*
	* @return the primary key of this bang luong
	*/
	@Override
	public long getPrimaryKey() {
		return _bangLuong.getPrimaryKey();
	}

	/**
	* Sets the primary key of this bang luong.
	*
	* @param primaryKey the primary key of this bang luong
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_bangLuong.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ban luong ID of this bang luong.
	*
	* @return the ban luong ID of this bang luong
	*/
	@Override
	public long getBanLuongId() {
		return _bangLuong.getBanLuongId();
	}

	/**
	* Sets the ban luong ID of this bang luong.
	*
	* @param banLuongId the ban luong ID of this bang luong
	*/
	@Override
	public void setBanLuongId(long banLuongId) {
		_bangLuong.setBanLuongId(banLuongId);
	}

	/**
	* Returns the company ID of this bang luong.
	*
	* @return the company ID of this bang luong
	*/
	@Override
	public long getCompanyId() {
		return _bangLuong.getCompanyId();
	}

	/**
	* Sets the company ID of this bang luong.
	*
	* @param companyId the company ID of this bang luong
	*/
	@Override
	public void setCompanyId(long companyId) {
		_bangLuong.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this bang luong.
	*
	* @return the user ID of this bang luong
	*/
	@Override
	public long getUserId() {
		return _bangLuong.getUserId();
	}

	/**
	* Sets the user ID of this bang luong.
	*
	* @param userId the user ID of this bang luong
	*/
	@Override
	public void setUserId(long userId) {
		_bangLuong.setUserId(userId);
	}

	/**
	* Returns the user uuid of this bang luong.
	*
	* @return the user uuid of this bang luong
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _bangLuong.getUserUuid();
	}

	/**
	* Sets the user uuid of this bang luong.
	*
	* @param userUuid the user uuid of this bang luong
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_bangLuong.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this bang luong.
	*
	* @return the user name of this bang luong
	*/
	@Override
	public java.lang.String getUserName() {
		return _bangLuong.getUserName();
	}

	/**
	* Sets the user name of this bang luong.
	*
	* @param userName the user name of this bang luong
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_bangLuong.setUserName(userName);
	}

	/**
	* Returns the create date of this bang luong.
	*
	* @return the create date of this bang luong
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _bangLuong.getCreateDate();
	}

	/**
	* Sets the create date of this bang luong.
	*
	* @param createDate the create date of this bang luong
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_bangLuong.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this bang luong.
	*
	* @return the modified date of this bang luong
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _bangLuong.getModifiedDate();
	}

	/**
	* Sets the modified date of this bang luong.
	*
	* @param modifiedDate the modified date of this bang luong
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_bangLuong.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the ten of this bang luong.
	*
	* @return the ten of this bang luong
	*/
	@Override
	public java.lang.String getTen() {
		return _bangLuong.getTen();
	}

	/**
	* Sets the ten of this bang luong.
	*
	* @param ten the ten of this bang luong
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_bangLuong.setTen(ten);
	}

	/**
	* Returns the trang thai of this bang luong.
	*
	* @return the trang thai of this bang luong
	*/
	@Override
	public boolean getTrangThai() {
		return _bangLuong.getTrangThai();
	}

	/**
	* Returns <code>true</code> if this bang luong is trang thai.
	*
	* @return <code>true</code> if this bang luong is trang thai; <code>false</code> otherwise
	*/
	@Override
	public boolean isTrangThai() {
		return _bangLuong.isTrangThai();
	}

	/**
	* Sets whether this bang luong is trang thai.
	*
	* @param trangThai the trang thai of this bang luong
	*/
	@Override
	public void setTrangThai(boolean trangThai) {
		_bangLuong.setTrangThai(trangThai);
	}

	/**
	* Returns the thang of this bang luong.
	*
	* @return the thang of this bang luong
	*/
	@Override
	public int getThang() {
		return _bangLuong.getThang();
	}

	/**
	* Sets the thang of this bang luong.
	*
	* @param thang the thang of this bang luong
	*/
	@Override
	public void setThang(int thang) {
		_bangLuong.setThang(thang);
	}

	/**
	* Returns the nam of this bang luong.
	*
	* @return the nam of this bang luong
	*/
	@Override
	public int getNam() {
		return _bangLuong.getNam();
	}

	/**
	* Sets the nam of this bang luong.
	*
	* @param nam the nam of this bang luong
	*/
	@Override
	public void setNam(int nam) {
		_bangLuong.setNam(nam);
	}

	/**
	* Returns the ngay of this bang luong.
	*
	* @return the ngay of this bang luong
	*/
	@Override
	public java.util.Date getNgay() {
		return _bangLuong.getNgay();
	}

	/**
	* Sets the ngay of this bang luong.
	*
	* @param ngay the ngay of this bang luong
	*/
	@Override
	public void setNgay(java.util.Date ngay) {
		_bangLuong.setNgay(ngay);
	}

	/**
	* Returns the chi tiet of this bang luong.
	*
	* @return the chi tiet of this bang luong
	*/
	@Override
	public java.lang.String getChiTiet() {
		return _bangLuong.getChiTiet();
	}

	/**
	* Sets the chi tiet of this bang luong.
	*
	* @param chiTiet the chi tiet of this bang luong
	*/
	@Override
	public void setChiTiet(java.lang.String chiTiet) {
		_bangLuong.setChiTiet(chiTiet);
	}

	/**
	* Returns the ghi chu of this bang luong.
	*
	* @return the ghi chu of this bang luong
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _bangLuong.getGhiChu();
	}

	/**
	* Sets the ghi chu of this bang luong.
	*
	* @param ghiChu the ghi chu of this bang luong
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_bangLuong.setGhiChu(ghiChu);
	}

	@Override
	public boolean isNew() {
		return _bangLuong.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_bangLuong.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _bangLuong.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_bangLuong.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _bangLuong.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _bangLuong.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_bangLuong.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _bangLuong.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_bangLuong.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_bangLuong.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_bangLuong.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new BangLuongWrapper((BangLuong)_bangLuong.clone());
	}

	@Override
	public int compareTo(com.minimart.portlet.ketoan.model.BangLuong bangLuong) {
		return _bangLuong.compareTo(bangLuong);
	}

	@Override
	public int hashCode() {
		return _bangLuong.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.minimart.portlet.ketoan.model.BangLuong> toCacheModel() {
		return _bangLuong.toCacheModel();
	}

	@Override
	public com.minimart.portlet.ketoan.model.BangLuong toEscapedModel() {
		return new BangLuongWrapper(_bangLuong.toEscapedModel());
	}

	@Override
	public com.minimart.portlet.ketoan.model.BangLuong toUnescapedModel() {
		return new BangLuongWrapper(_bangLuong.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _bangLuong.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _bangLuong.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_bangLuong.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BangLuongWrapper)) {
			return false;
		}

		BangLuongWrapper bangLuongWrapper = (BangLuongWrapper)obj;

		if (Validator.equals(_bangLuong, bangLuongWrapper._bangLuong)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public BangLuong getWrappedBangLuong() {
		return _bangLuong;
	}

	@Override
	public BangLuong getWrappedModel() {
		return _bangLuong;
	}

	@Override
	public void resetOriginalValues() {
		_bangLuong.resetOriginalValues();
	}

	private BangLuong _bangLuong;
}