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

package com.minimart.portlet.dathang.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link DatHangChiTiet}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see DatHangChiTiet
 * @generated
 */
public class DatHangChiTietWrapper implements DatHangChiTiet,
	ModelWrapper<DatHangChiTiet> {
	public DatHangChiTietWrapper(DatHangChiTiet datHangChiTiet) {
		_datHangChiTiet = datHangChiTiet;
	}

	@Override
	public Class<?> getModelClass() {
		return DatHangChiTiet.class;
	}

	@Override
	public String getModelClassName() {
		return DatHangChiTiet.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("datHangChiTietId", getDatHangChiTietId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("soLuong", getSoLuong());
		attributes.put("donGia", getDonGia());
		attributes.put("thanhTien", getThanhTien());
		attributes.put("tiLeGiamGia", getTiLeGiamGia());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("trangThai", getTrangThai());
		attributes.put("baoHanh", getBaoHanh());
		attributes.put("donViTinhId", getDonViTinhId());
		attributes.put("datHangId", getDatHangId());
		attributes.put("maHangId", getMaHangId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long datHangChiTietId = (Long)attributes.get("datHangChiTietId");

		if (datHangChiTietId != null) {
			setDatHangChiTietId(datHangChiTietId);
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

		Integer soLuong = (Integer)attributes.get("soLuong");

		if (soLuong != null) {
			setSoLuong(soLuong);
		}

		Integer donGia = (Integer)attributes.get("donGia");

		if (donGia != null) {
			setDonGia(donGia);
		}

		Integer thanhTien = (Integer)attributes.get("thanhTien");

		if (thanhTien != null) {
			setThanhTien(thanhTien);
		}

		Double tiLeGiamGia = (Double)attributes.get("tiLeGiamGia");

		if (tiLeGiamGia != null) {
			setTiLeGiamGia(tiLeGiamGia);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		Boolean trangThai = (Boolean)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		String baoHanh = (String)attributes.get("baoHanh");

		if (baoHanh != null) {
			setBaoHanh(baoHanh);
		}

		Long donViTinhId = (Long)attributes.get("donViTinhId");

		if (donViTinhId != null) {
			setDonViTinhId(donViTinhId);
		}

		Long datHangId = (Long)attributes.get("datHangId");

		if (datHangId != null) {
			setDatHangId(datHangId);
		}

		Long maHangId = (Long)attributes.get("maHangId");

		if (maHangId != null) {
			setMaHangId(maHangId);
		}
	}

	/**
	* Returns the primary key of this dat hang chi tiet.
	*
	* @return the primary key of this dat hang chi tiet
	*/
	@Override
	public long getPrimaryKey() {
		return _datHangChiTiet.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dat hang chi tiet.
	*
	* @param primaryKey the primary key of this dat hang chi tiet
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_datHangChiTiet.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the dat hang chi tiet ID of this dat hang chi tiet.
	*
	* @return the dat hang chi tiet ID of this dat hang chi tiet
	*/
	@Override
	public long getDatHangChiTietId() {
		return _datHangChiTiet.getDatHangChiTietId();
	}

	/**
	* Sets the dat hang chi tiet ID of this dat hang chi tiet.
	*
	* @param datHangChiTietId the dat hang chi tiet ID of this dat hang chi tiet
	*/
	@Override
	public void setDatHangChiTietId(long datHangChiTietId) {
		_datHangChiTiet.setDatHangChiTietId(datHangChiTietId);
	}

	/**
	* Returns the company ID of this dat hang chi tiet.
	*
	* @return the company ID of this dat hang chi tiet
	*/
	@Override
	public long getCompanyId() {
		return _datHangChiTiet.getCompanyId();
	}

	/**
	* Sets the company ID of this dat hang chi tiet.
	*
	* @param companyId the company ID of this dat hang chi tiet
	*/
	@Override
	public void setCompanyId(long companyId) {
		_datHangChiTiet.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this dat hang chi tiet.
	*
	* @return the user ID of this dat hang chi tiet
	*/
	@Override
	public long getUserId() {
		return _datHangChiTiet.getUserId();
	}

	/**
	* Sets the user ID of this dat hang chi tiet.
	*
	* @param userId the user ID of this dat hang chi tiet
	*/
	@Override
	public void setUserId(long userId) {
		_datHangChiTiet.setUserId(userId);
	}

	/**
	* Returns the user uuid of this dat hang chi tiet.
	*
	* @return the user uuid of this dat hang chi tiet
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _datHangChiTiet.getUserUuid();
	}

	/**
	* Sets the user uuid of this dat hang chi tiet.
	*
	* @param userUuid the user uuid of this dat hang chi tiet
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_datHangChiTiet.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this dat hang chi tiet.
	*
	* @return the user name of this dat hang chi tiet
	*/
	@Override
	public java.lang.String getUserName() {
		return _datHangChiTiet.getUserName();
	}

	/**
	* Sets the user name of this dat hang chi tiet.
	*
	* @param userName the user name of this dat hang chi tiet
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_datHangChiTiet.setUserName(userName);
	}

	/**
	* Returns the create date of this dat hang chi tiet.
	*
	* @return the create date of this dat hang chi tiet
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _datHangChiTiet.getCreateDate();
	}

	/**
	* Sets the create date of this dat hang chi tiet.
	*
	* @param createDate the create date of this dat hang chi tiet
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_datHangChiTiet.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this dat hang chi tiet.
	*
	* @return the modified date of this dat hang chi tiet
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _datHangChiTiet.getModifiedDate();
	}

	/**
	* Sets the modified date of this dat hang chi tiet.
	*
	* @param modifiedDate the modified date of this dat hang chi tiet
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_datHangChiTiet.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the so luong of this dat hang chi tiet.
	*
	* @return the so luong of this dat hang chi tiet
	*/
	@Override
	public int getSoLuong() {
		return _datHangChiTiet.getSoLuong();
	}

	/**
	* Sets the so luong of this dat hang chi tiet.
	*
	* @param soLuong the so luong of this dat hang chi tiet
	*/
	@Override
	public void setSoLuong(int soLuong) {
		_datHangChiTiet.setSoLuong(soLuong);
	}

	/**
	* Returns the don gia of this dat hang chi tiet.
	*
	* @return the don gia of this dat hang chi tiet
	*/
	@Override
	public int getDonGia() {
		return _datHangChiTiet.getDonGia();
	}

	/**
	* Sets the don gia of this dat hang chi tiet.
	*
	* @param donGia the don gia of this dat hang chi tiet
	*/
	@Override
	public void setDonGia(int donGia) {
		_datHangChiTiet.setDonGia(donGia);
	}

	/**
	* Returns the thanh tien of this dat hang chi tiet.
	*
	* @return the thanh tien of this dat hang chi tiet
	*/
	@Override
	public int getThanhTien() {
		return _datHangChiTiet.getThanhTien();
	}

	/**
	* Sets the thanh tien of this dat hang chi tiet.
	*
	* @param thanhTien the thanh tien of this dat hang chi tiet
	*/
	@Override
	public void setThanhTien(int thanhTien) {
		_datHangChiTiet.setThanhTien(thanhTien);
	}

	/**
	* Returns the ti le giam gia of this dat hang chi tiet.
	*
	* @return the ti le giam gia of this dat hang chi tiet
	*/
	@Override
	public double getTiLeGiamGia() {
		return _datHangChiTiet.getTiLeGiamGia();
	}

	/**
	* Sets the ti le giam gia of this dat hang chi tiet.
	*
	* @param tiLeGiamGia the ti le giam gia of this dat hang chi tiet
	*/
	@Override
	public void setTiLeGiamGia(double tiLeGiamGia) {
		_datHangChiTiet.setTiLeGiamGia(tiLeGiamGia);
	}

	/**
	* Returns the ghi chu of this dat hang chi tiet.
	*
	* @return the ghi chu of this dat hang chi tiet
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _datHangChiTiet.getGhiChu();
	}

	/**
	* Sets the ghi chu of this dat hang chi tiet.
	*
	* @param ghiChu the ghi chu of this dat hang chi tiet
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_datHangChiTiet.setGhiChu(ghiChu);
	}

	/**
	* Returns the trang thai of this dat hang chi tiet.
	*
	* @return the trang thai of this dat hang chi tiet
	*/
	@Override
	public boolean getTrangThai() {
		return _datHangChiTiet.getTrangThai();
	}

	/**
	* Returns <code>true</code> if this dat hang chi tiet is trang thai.
	*
	* @return <code>true</code> if this dat hang chi tiet is trang thai; <code>false</code> otherwise
	*/
	@Override
	public boolean isTrangThai() {
		return _datHangChiTiet.isTrangThai();
	}

	/**
	* Sets whether this dat hang chi tiet is trang thai.
	*
	* @param trangThai the trang thai of this dat hang chi tiet
	*/
	@Override
	public void setTrangThai(boolean trangThai) {
		_datHangChiTiet.setTrangThai(trangThai);
	}

	/**
	* Returns the bao hanh of this dat hang chi tiet.
	*
	* @return the bao hanh of this dat hang chi tiet
	*/
	@Override
	public java.lang.String getBaoHanh() {
		return _datHangChiTiet.getBaoHanh();
	}

	/**
	* Sets the bao hanh of this dat hang chi tiet.
	*
	* @param baoHanh the bao hanh of this dat hang chi tiet
	*/
	@Override
	public void setBaoHanh(java.lang.String baoHanh) {
		_datHangChiTiet.setBaoHanh(baoHanh);
	}

	/**
	* Returns the don vi tinh ID of this dat hang chi tiet.
	*
	* @return the don vi tinh ID of this dat hang chi tiet
	*/
	@Override
	public long getDonViTinhId() {
		return _datHangChiTiet.getDonViTinhId();
	}

	/**
	* Sets the don vi tinh ID of this dat hang chi tiet.
	*
	* @param donViTinhId the don vi tinh ID of this dat hang chi tiet
	*/
	@Override
	public void setDonViTinhId(long donViTinhId) {
		_datHangChiTiet.setDonViTinhId(donViTinhId);
	}

	/**
	* Returns the dat hang ID of this dat hang chi tiet.
	*
	* @return the dat hang ID of this dat hang chi tiet
	*/
	@Override
	public long getDatHangId() {
		return _datHangChiTiet.getDatHangId();
	}

	/**
	* Sets the dat hang ID of this dat hang chi tiet.
	*
	* @param datHangId the dat hang ID of this dat hang chi tiet
	*/
	@Override
	public void setDatHangId(long datHangId) {
		_datHangChiTiet.setDatHangId(datHangId);
	}

	/**
	* Returns the ma hang ID of this dat hang chi tiet.
	*
	* @return the ma hang ID of this dat hang chi tiet
	*/
	@Override
	public long getMaHangId() {
		return _datHangChiTiet.getMaHangId();
	}

	/**
	* Sets the ma hang ID of this dat hang chi tiet.
	*
	* @param maHangId the ma hang ID of this dat hang chi tiet
	*/
	@Override
	public void setMaHangId(long maHangId) {
		_datHangChiTiet.setMaHangId(maHangId);
	}

	@Override
	public boolean isNew() {
		return _datHangChiTiet.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_datHangChiTiet.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _datHangChiTiet.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_datHangChiTiet.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _datHangChiTiet.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _datHangChiTiet.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_datHangChiTiet.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _datHangChiTiet.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_datHangChiTiet.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_datHangChiTiet.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_datHangChiTiet.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DatHangChiTietWrapper((DatHangChiTiet)_datHangChiTiet.clone());
	}

	@Override
	public int compareTo(
		com.minimart.portlet.dathang.model.DatHangChiTiet datHangChiTiet) {
		return _datHangChiTiet.compareTo(datHangChiTiet);
	}

	@Override
	public int hashCode() {
		return _datHangChiTiet.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.minimart.portlet.dathang.model.DatHangChiTiet> toCacheModel() {
		return _datHangChiTiet.toCacheModel();
	}

	@Override
	public com.minimart.portlet.dathang.model.DatHangChiTiet toEscapedModel() {
		return new DatHangChiTietWrapper(_datHangChiTiet.toEscapedModel());
	}

	@Override
	public com.minimart.portlet.dathang.model.DatHangChiTiet toUnescapedModel() {
		return new DatHangChiTietWrapper(_datHangChiTiet.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _datHangChiTiet.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _datHangChiTiet.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_datHangChiTiet.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DatHangChiTietWrapper)) {
			return false;
		}

		DatHangChiTietWrapper datHangChiTietWrapper = (DatHangChiTietWrapper)obj;

		if (Validator.equals(_datHangChiTiet,
					datHangChiTietWrapper._datHangChiTiet)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DatHangChiTiet getWrappedDatHangChiTiet() {
		return _datHangChiTiet;
	}

	@Override
	public DatHangChiTiet getWrappedModel() {
		return _datHangChiTiet;
	}

	@Override
	public void resetOriginalValues() {
		_datHangChiTiet.resetOriginalValues();
	}

	private DatHangChiTiet _datHangChiTiet;
}