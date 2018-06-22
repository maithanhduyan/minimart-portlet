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
 * This class is a wrapper for {@link DonHangChiTiet}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see DonHangChiTiet
 * @generated
 */
public class DonHangChiTietWrapper implements DonHangChiTiet,
	ModelWrapper<DonHangChiTiet> {
	public DonHangChiTietWrapper(DonHangChiTiet donHangChiTiet) {
		_donHangChiTiet = donHangChiTiet;
	}

	@Override
	public Class<?> getModelClass() {
		return DonHangChiTiet.class;
	}

	@Override
	public String getModelClassName() {
		return DonHangChiTiet.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("donHangChiTietId", getDonHangChiTietId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("donHangId", getDonHangId());
		attributes.put("matHangId", getMatHangId());
		attributes.put("soLuong", getSoLuong());
		attributes.put("donViTinhId", getDonViTinhId());
		attributes.put("thanhTien", getThanhTien());
		attributes.put("tiLeGiamGia", getTiLeGiamGia());
		attributes.put("kichThuoc", getKichThuoc());
		attributes.put("hanSuDung", getHanSuDung());
		attributes.put("hoatDong", getHoatDong());
		attributes.put("huy", getHuy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long donHangChiTietId = (Long)attributes.get("donHangChiTietId");

		if (donHangChiTietId != null) {
			setDonHangChiTietId(donHangChiTietId);
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

		Long donHangId = (Long)attributes.get("donHangId");

		if (donHangId != null) {
			setDonHangId(donHangId);
		}

		Long matHangId = (Long)attributes.get("matHangId");

		if (matHangId != null) {
			setMatHangId(matHangId);
		}

		Integer soLuong = (Integer)attributes.get("soLuong");

		if (soLuong != null) {
			setSoLuong(soLuong);
		}

		Long donViTinhId = (Long)attributes.get("donViTinhId");

		if (donViTinhId != null) {
			setDonViTinhId(donViTinhId);
		}

		Integer thanhTien = (Integer)attributes.get("thanhTien");

		if (thanhTien != null) {
			setThanhTien(thanhTien);
		}

		Integer tiLeGiamGia = (Integer)attributes.get("tiLeGiamGia");

		if (tiLeGiamGia != null) {
			setTiLeGiamGia(tiLeGiamGia);
		}

		String kichThuoc = (String)attributes.get("kichThuoc");

		if (kichThuoc != null) {
			setKichThuoc(kichThuoc);
		}

		Date hanSuDung = (Date)attributes.get("hanSuDung");

		if (hanSuDung != null) {
			setHanSuDung(hanSuDung);
		}

		Boolean hoatDong = (Boolean)attributes.get("hoatDong");

		if (hoatDong != null) {
			setHoatDong(hoatDong);
		}

		Boolean huy = (Boolean)attributes.get("huy");

		if (huy != null) {
			setHuy(huy);
		}
	}

	/**
	* Returns the primary key of this don hang chi tiet.
	*
	* @return the primary key of this don hang chi tiet
	*/
	@Override
	public long getPrimaryKey() {
		return _donHangChiTiet.getPrimaryKey();
	}

	/**
	* Sets the primary key of this don hang chi tiet.
	*
	* @param primaryKey the primary key of this don hang chi tiet
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_donHangChiTiet.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the don hang chi tiet ID of this don hang chi tiet.
	*
	* @return the don hang chi tiet ID of this don hang chi tiet
	*/
	@Override
	public long getDonHangChiTietId() {
		return _donHangChiTiet.getDonHangChiTietId();
	}

	/**
	* Sets the don hang chi tiet ID of this don hang chi tiet.
	*
	* @param donHangChiTietId the don hang chi tiet ID of this don hang chi tiet
	*/
	@Override
	public void setDonHangChiTietId(long donHangChiTietId) {
		_donHangChiTiet.setDonHangChiTietId(donHangChiTietId);
	}

	/**
	* Returns the company ID of this don hang chi tiet.
	*
	* @return the company ID of this don hang chi tiet
	*/
	@Override
	public long getCompanyId() {
		return _donHangChiTiet.getCompanyId();
	}

	/**
	* Sets the company ID of this don hang chi tiet.
	*
	* @param companyId the company ID of this don hang chi tiet
	*/
	@Override
	public void setCompanyId(long companyId) {
		_donHangChiTiet.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this don hang chi tiet.
	*
	* @return the user ID of this don hang chi tiet
	*/
	@Override
	public long getUserId() {
		return _donHangChiTiet.getUserId();
	}

	/**
	* Sets the user ID of this don hang chi tiet.
	*
	* @param userId the user ID of this don hang chi tiet
	*/
	@Override
	public void setUserId(long userId) {
		_donHangChiTiet.setUserId(userId);
	}

	/**
	* Returns the user uuid of this don hang chi tiet.
	*
	* @return the user uuid of this don hang chi tiet
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _donHangChiTiet.getUserUuid();
	}

	/**
	* Sets the user uuid of this don hang chi tiet.
	*
	* @param userUuid the user uuid of this don hang chi tiet
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_donHangChiTiet.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this don hang chi tiet.
	*
	* @return the user name of this don hang chi tiet
	*/
	@Override
	public java.lang.String getUserName() {
		return _donHangChiTiet.getUserName();
	}

	/**
	* Sets the user name of this don hang chi tiet.
	*
	* @param userName the user name of this don hang chi tiet
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_donHangChiTiet.setUserName(userName);
	}

	/**
	* Returns the create date of this don hang chi tiet.
	*
	* @return the create date of this don hang chi tiet
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _donHangChiTiet.getCreateDate();
	}

	/**
	* Sets the create date of this don hang chi tiet.
	*
	* @param createDate the create date of this don hang chi tiet
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_donHangChiTiet.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this don hang chi tiet.
	*
	* @return the modified date of this don hang chi tiet
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _donHangChiTiet.getModifiedDate();
	}

	/**
	* Sets the modified date of this don hang chi tiet.
	*
	* @param modifiedDate the modified date of this don hang chi tiet
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_donHangChiTiet.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the don hang ID of this don hang chi tiet.
	*
	* @return the don hang ID of this don hang chi tiet
	*/
	@Override
	public long getDonHangId() {
		return _donHangChiTiet.getDonHangId();
	}

	/**
	* Sets the don hang ID of this don hang chi tiet.
	*
	* @param donHangId the don hang ID of this don hang chi tiet
	*/
	@Override
	public void setDonHangId(long donHangId) {
		_donHangChiTiet.setDonHangId(donHangId);
	}

	/**
	* Returns the mat hang ID of this don hang chi tiet.
	*
	* @return the mat hang ID of this don hang chi tiet
	*/
	@Override
	public long getMatHangId() {
		return _donHangChiTiet.getMatHangId();
	}

	/**
	* Sets the mat hang ID of this don hang chi tiet.
	*
	* @param matHangId the mat hang ID of this don hang chi tiet
	*/
	@Override
	public void setMatHangId(long matHangId) {
		_donHangChiTiet.setMatHangId(matHangId);
	}

	/**
	* Returns the so luong of this don hang chi tiet.
	*
	* @return the so luong of this don hang chi tiet
	*/
	@Override
	public int getSoLuong() {
		return _donHangChiTiet.getSoLuong();
	}

	/**
	* Sets the so luong of this don hang chi tiet.
	*
	* @param soLuong the so luong of this don hang chi tiet
	*/
	@Override
	public void setSoLuong(int soLuong) {
		_donHangChiTiet.setSoLuong(soLuong);
	}

	/**
	* Returns the don vi tinh ID of this don hang chi tiet.
	*
	* @return the don vi tinh ID of this don hang chi tiet
	*/
	@Override
	public long getDonViTinhId() {
		return _donHangChiTiet.getDonViTinhId();
	}

	/**
	* Sets the don vi tinh ID of this don hang chi tiet.
	*
	* @param donViTinhId the don vi tinh ID of this don hang chi tiet
	*/
	@Override
	public void setDonViTinhId(long donViTinhId) {
		_donHangChiTiet.setDonViTinhId(donViTinhId);
	}

	/**
	* Returns the thanh tien of this don hang chi tiet.
	*
	* @return the thanh tien of this don hang chi tiet
	*/
	@Override
	public int getThanhTien() {
		return _donHangChiTiet.getThanhTien();
	}

	/**
	* Sets the thanh tien of this don hang chi tiet.
	*
	* @param thanhTien the thanh tien of this don hang chi tiet
	*/
	@Override
	public void setThanhTien(int thanhTien) {
		_donHangChiTiet.setThanhTien(thanhTien);
	}

	/**
	* Returns the ti le giam gia of this don hang chi tiet.
	*
	* @return the ti le giam gia of this don hang chi tiet
	*/
	@Override
	public int getTiLeGiamGia() {
		return _donHangChiTiet.getTiLeGiamGia();
	}

	/**
	* Sets the ti le giam gia of this don hang chi tiet.
	*
	* @param tiLeGiamGia the ti le giam gia of this don hang chi tiet
	*/
	@Override
	public void setTiLeGiamGia(int tiLeGiamGia) {
		_donHangChiTiet.setTiLeGiamGia(tiLeGiamGia);
	}

	/**
	* Returns the kich thuoc of this don hang chi tiet.
	*
	* @return the kich thuoc of this don hang chi tiet
	*/
	@Override
	public java.lang.String getKichThuoc() {
		return _donHangChiTiet.getKichThuoc();
	}

	/**
	* Sets the kich thuoc of this don hang chi tiet.
	*
	* @param kichThuoc the kich thuoc of this don hang chi tiet
	*/
	@Override
	public void setKichThuoc(java.lang.String kichThuoc) {
		_donHangChiTiet.setKichThuoc(kichThuoc);
	}

	/**
	* Returns the han su dung of this don hang chi tiet.
	*
	* @return the han su dung of this don hang chi tiet
	*/
	@Override
	public java.util.Date getHanSuDung() {
		return _donHangChiTiet.getHanSuDung();
	}

	/**
	* Sets the han su dung of this don hang chi tiet.
	*
	* @param hanSuDung the han su dung of this don hang chi tiet
	*/
	@Override
	public void setHanSuDung(java.util.Date hanSuDung) {
		_donHangChiTiet.setHanSuDung(hanSuDung);
	}

	/**
	* Returns the hoat dong of this don hang chi tiet.
	*
	* @return the hoat dong of this don hang chi tiet
	*/
	@Override
	public boolean getHoatDong() {
		return _donHangChiTiet.getHoatDong();
	}

	/**
	* Returns <code>true</code> if this don hang chi tiet is hoat dong.
	*
	* @return <code>true</code> if this don hang chi tiet is hoat dong; <code>false</code> otherwise
	*/
	@Override
	public boolean isHoatDong() {
		return _donHangChiTiet.isHoatDong();
	}

	/**
	* Sets whether this don hang chi tiet is hoat dong.
	*
	* @param hoatDong the hoat dong of this don hang chi tiet
	*/
	@Override
	public void setHoatDong(boolean hoatDong) {
		_donHangChiTiet.setHoatDong(hoatDong);
	}

	/**
	* Returns the huy of this don hang chi tiet.
	*
	* @return the huy of this don hang chi tiet
	*/
	@Override
	public boolean getHuy() {
		return _donHangChiTiet.getHuy();
	}

	/**
	* Returns <code>true</code> if this don hang chi tiet is huy.
	*
	* @return <code>true</code> if this don hang chi tiet is huy; <code>false</code> otherwise
	*/
	@Override
	public boolean isHuy() {
		return _donHangChiTiet.isHuy();
	}

	/**
	* Sets whether this don hang chi tiet is huy.
	*
	* @param huy the huy of this don hang chi tiet
	*/
	@Override
	public void setHuy(boolean huy) {
		_donHangChiTiet.setHuy(huy);
	}

	@Override
	public boolean isNew() {
		return _donHangChiTiet.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_donHangChiTiet.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _donHangChiTiet.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_donHangChiTiet.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _donHangChiTiet.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _donHangChiTiet.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_donHangChiTiet.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _donHangChiTiet.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_donHangChiTiet.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_donHangChiTiet.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_donHangChiTiet.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DonHangChiTietWrapper((DonHangChiTiet)_donHangChiTiet.clone());
	}

	@Override
	public int compareTo(
		com.minimart.portlet.banhang.model.DonHangChiTiet donHangChiTiet) {
		return _donHangChiTiet.compareTo(donHangChiTiet);
	}

	@Override
	public int hashCode() {
		return _donHangChiTiet.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.minimart.portlet.banhang.model.DonHangChiTiet> toCacheModel() {
		return _donHangChiTiet.toCacheModel();
	}

	@Override
	public com.minimart.portlet.banhang.model.DonHangChiTiet toEscapedModel() {
		return new DonHangChiTietWrapper(_donHangChiTiet.toEscapedModel());
	}

	@Override
	public com.minimart.portlet.banhang.model.DonHangChiTiet toUnescapedModel() {
		return new DonHangChiTietWrapper(_donHangChiTiet.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _donHangChiTiet.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _donHangChiTiet.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_donHangChiTiet.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DonHangChiTietWrapper)) {
			return false;
		}

		DonHangChiTietWrapper donHangChiTietWrapper = (DonHangChiTietWrapper)obj;

		if (Validator.equals(_donHangChiTiet,
					donHangChiTietWrapper._donHangChiTiet)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DonHangChiTiet getWrappedDonHangChiTiet() {
		return _donHangChiTiet;
	}

	@Override
	public DonHangChiTiet getWrappedModel() {
		return _donHangChiTiet;
	}

	@Override
	public void resetOriginalValues() {
		_donHangChiTiet.resetOriginalValues();
	}

	private DonHangChiTiet _donHangChiTiet;
}