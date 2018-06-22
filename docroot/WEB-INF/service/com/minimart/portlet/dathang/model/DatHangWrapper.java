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
 * This class is a wrapper for {@link DatHang}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see DatHang
 * @generated
 */
public class DatHangWrapper implements DatHang, ModelWrapper<DatHang> {
	public DatHangWrapper(DatHang datHang) {
		_datHang = datHang;
	}

	@Override
	public Class<?> getModelClass() {
		return DatHang.class;
	}

	@Override
	public String getModelClassName() {
		return DatHang.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("datHangId", getDatHangId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("khachHangId", getKhachHangId());
		attributes.put("diaChiId", getDiaChiId());
		attributes.put("tienHang", getTienHang());
		attributes.put("tiLeThue", getTiLeThue());
		attributes.put("tiLeGiamGia", getTiLeGiamGia());
		attributes.put("tienGiamGia", getTienGiamGia());
		attributes.put("phiVanChuyen", getPhiVanChuyen());
		attributes.put("tongCong", getTongCong());
		attributes.put("loai", getLoai());
		attributes.put("giamTheoTien", getGiamTheoTien());
		attributes.put("trangThai", getTrangThai());
		attributes.put("userModifiedId", getUserModifiedId());
		attributes.put("timeModified", getTimeModified());
		attributes.put("userCreateId", getUserCreateId());
		attributes.put("loaiGia", getLoaiGia());
		attributes.put("hoatDong", getHoatDong());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long datHangId = (Long)attributes.get("datHangId");

		if (datHangId != null) {
			setDatHangId(datHangId);
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

		Long khachHangId = (Long)attributes.get("khachHangId");

		if (khachHangId != null) {
			setKhachHangId(khachHangId);
		}

		Long diaChiId = (Long)attributes.get("diaChiId");

		if (diaChiId != null) {
			setDiaChiId(diaChiId);
		}

		Integer tienHang = (Integer)attributes.get("tienHang");

		if (tienHang != null) {
			setTienHang(tienHang);
		}

		Double tiLeThue = (Double)attributes.get("tiLeThue");

		if (tiLeThue != null) {
			setTiLeThue(tiLeThue);
		}

		Double tiLeGiamGia = (Double)attributes.get("tiLeGiamGia");

		if (tiLeGiamGia != null) {
			setTiLeGiamGia(tiLeGiamGia);
		}

		Integer tienGiamGia = (Integer)attributes.get("tienGiamGia");

		if (tienGiamGia != null) {
			setTienGiamGia(tienGiamGia);
		}

		Integer phiVanChuyen = (Integer)attributes.get("phiVanChuyen");

		if (phiVanChuyen != null) {
			setPhiVanChuyen(phiVanChuyen);
		}

		Integer tongCong = (Integer)attributes.get("tongCong");

		if (tongCong != null) {
			setTongCong(tongCong);
		}

		Integer loai = (Integer)attributes.get("loai");

		if (loai != null) {
			setLoai(loai);
		}

		Integer giamTheoTien = (Integer)attributes.get("giamTheoTien");

		if (giamTheoTien != null) {
			setGiamTheoTien(giamTheoTien);
		}

		Boolean trangThai = (Boolean)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		Long userModifiedId = (Long)attributes.get("userModifiedId");

		if (userModifiedId != null) {
			setUserModifiedId(userModifiedId);
		}

		Date timeModified = (Date)attributes.get("timeModified");

		if (timeModified != null) {
			setTimeModified(timeModified);
		}

		Long userCreateId = (Long)attributes.get("userCreateId");

		if (userCreateId != null) {
			setUserCreateId(userCreateId);
		}

		Integer loaiGia = (Integer)attributes.get("loaiGia");

		if (loaiGia != null) {
			setLoaiGia(loaiGia);
		}

		Boolean hoatDong = (Boolean)attributes.get("hoatDong");

		if (hoatDong != null) {
			setHoatDong(hoatDong);
		}
	}

	/**
	* Returns the primary key of this dat hang.
	*
	* @return the primary key of this dat hang
	*/
	@Override
	public long getPrimaryKey() {
		return _datHang.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dat hang.
	*
	* @param primaryKey the primary key of this dat hang
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_datHang.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the dat hang ID of this dat hang.
	*
	* @return the dat hang ID of this dat hang
	*/
	@Override
	public long getDatHangId() {
		return _datHang.getDatHangId();
	}

	/**
	* Sets the dat hang ID of this dat hang.
	*
	* @param datHangId the dat hang ID of this dat hang
	*/
	@Override
	public void setDatHangId(long datHangId) {
		_datHang.setDatHangId(datHangId);
	}

	/**
	* Returns the company ID of this dat hang.
	*
	* @return the company ID of this dat hang
	*/
	@Override
	public long getCompanyId() {
		return _datHang.getCompanyId();
	}

	/**
	* Sets the company ID of this dat hang.
	*
	* @param companyId the company ID of this dat hang
	*/
	@Override
	public void setCompanyId(long companyId) {
		_datHang.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this dat hang.
	*
	* @return the user ID of this dat hang
	*/
	@Override
	public long getUserId() {
		return _datHang.getUserId();
	}

	/**
	* Sets the user ID of this dat hang.
	*
	* @param userId the user ID of this dat hang
	*/
	@Override
	public void setUserId(long userId) {
		_datHang.setUserId(userId);
	}

	/**
	* Returns the user uuid of this dat hang.
	*
	* @return the user uuid of this dat hang
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _datHang.getUserUuid();
	}

	/**
	* Sets the user uuid of this dat hang.
	*
	* @param userUuid the user uuid of this dat hang
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_datHang.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this dat hang.
	*
	* @return the user name of this dat hang
	*/
	@Override
	public java.lang.String getUserName() {
		return _datHang.getUserName();
	}

	/**
	* Sets the user name of this dat hang.
	*
	* @param userName the user name of this dat hang
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_datHang.setUserName(userName);
	}

	/**
	* Returns the create date of this dat hang.
	*
	* @return the create date of this dat hang
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _datHang.getCreateDate();
	}

	/**
	* Sets the create date of this dat hang.
	*
	* @param createDate the create date of this dat hang
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_datHang.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this dat hang.
	*
	* @return the modified date of this dat hang
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _datHang.getModifiedDate();
	}

	/**
	* Sets the modified date of this dat hang.
	*
	* @param modifiedDate the modified date of this dat hang
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_datHang.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the ten of this dat hang.
	*
	* @return the ten of this dat hang
	*/
	@Override
	public java.lang.String getTen() {
		return _datHang.getTen();
	}

	/**
	* Sets the ten of this dat hang.
	*
	* @param ten the ten of this dat hang
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_datHang.setTen(ten);
	}

	/**
	* Returns the khach hang ID of this dat hang.
	*
	* @return the khach hang ID of this dat hang
	*/
	@Override
	public long getKhachHangId() {
		return _datHang.getKhachHangId();
	}

	/**
	* Sets the khach hang ID of this dat hang.
	*
	* @param khachHangId the khach hang ID of this dat hang
	*/
	@Override
	public void setKhachHangId(long khachHangId) {
		_datHang.setKhachHangId(khachHangId);
	}

	/**
	* Returns the dia chi ID of this dat hang.
	*
	* @return the dia chi ID of this dat hang
	*/
	@Override
	public long getDiaChiId() {
		return _datHang.getDiaChiId();
	}

	/**
	* Sets the dia chi ID of this dat hang.
	*
	* @param diaChiId the dia chi ID of this dat hang
	*/
	@Override
	public void setDiaChiId(long diaChiId) {
		_datHang.setDiaChiId(diaChiId);
	}

	/**
	* Returns the tien hang of this dat hang.
	*
	* @return the tien hang of this dat hang
	*/
	@Override
	public int getTienHang() {
		return _datHang.getTienHang();
	}

	/**
	* Sets the tien hang of this dat hang.
	*
	* @param tienHang the tien hang of this dat hang
	*/
	@Override
	public void setTienHang(int tienHang) {
		_datHang.setTienHang(tienHang);
	}

	/**
	* Returns the ti le thue of this dat hang.
	*
	* @return the ti le thue of this dat hang
	*/
	@Override
	public double getTiLeThue() {
		return _datHang.getTiLeThue();
	}

	/**
	* Sets the ti le thue of this dat hang.
	*
	* @param tiLeThue the ti le thue of this dat hang
	*/
	@Override
	public void setTiLeThue(double tiLeThue) {
		_datHang.setTiLeThue(tiLeThue);
	}

	/**
	* Returns the ti le giam gia of this dat hang.
	*
	* @return the ti le giam gia of this dat hang
	*/
	@Override
	public double getTiLeGiamGia() {
		return _datHang.getTiLeGiamGia();
	}

	/**
	* Sets the ti le giam gia of this dat hang.
	*
	* @param tiLeGiamGia the ti le giam gia of this dat hang
	*/
	@Override
	public void setTiLeGiamGia(double tiLeGiamGia) {
		_datHang.setTiLeGiamGia(tiLeGiamGia);
	}

	/**
	* Returns the tien giam gia of this dat hang.
	*
	* @return the tien giam gia of this dat hang
	*/
	@Override
	public int getTienGiamGia() {
		return _datHang.getTienGiamGia();
	}

	/**
	* Sets the tien giam gia of this dat hang.
	*
	* @param tienGiamGia the tien giam gia of this dat hang
	*/
	@Override
	public void setTienGiamGia(int tienGiamGia) {
		_datHang.setTienGiamGia(tienGiamGia);
	}

	/**
	* Returns the phi van chuyen of this dat hang.
	*
	* @return the phi van chuyen of this dat hang
	*/
	@Override
	public int getPhiVanChuyen() {
		return _datHang.getPhiVanChuyen();
	}

	/**
	* Sets the phi van chuyen of this dat hang.
	*
	* @param phiVanChuyen the phi van chuyen of this dat hang
	*/
	@Override
	public void setPhiVanChuyen(int phiVanChuyen) {
		_datHang.setPhiVanChuyen(phiVanChuyen);
	}

	/**
	* Returns the tong cong of this dat hang.
	*
	* @return the tong cong of this dat hang
	*/
	@Override
	public int getTongCong() {
		return _datHang.getTongCong();
	}

	/**
	* Sets the tong cong of this dat hang.
	*
	* @param tongCong the tong cong of this dat hang
	*/
	@Override
	public void setTongCong(int tongCong) {
		_datHang.setTongCong(tongCong);
	}

	/**
	* Returns the loai of this dat hang.
	*
	* @return the loai of this dat hang
	*/
	@Override
	public int getLoai() {
		return _datHang.getLoai();
	}

	/**
	* Sets the loai of this dat hang.
	*
	* @param loai the loai of this dat hang
	*/
	@Override
	public void setLoai(int loai) {
		_datHang.setLoai(loai);
	}

	/**
	* Returns the giam theo tien of this dat hang.
	*
	* @return the giam theo tien of this dat hang
	*/
	@Override
	public int getGiamTheoTien() {
		return _datHang.getGiamTheoTien();
	}

	/**
	* Sets the giam theo tien of this dat hang.
	*
	* @param giamTheoTien the giam theo tien of this dat hang
	*/
	@Override
	public void setGiamTheoTien(int giamTheoTien) {
		_datHang.setGiamTheoTien(giamTheoTien);
	}

	/**
	* Returns the trang thai of this dat hang.
	*
	* @return the trang thai of this dat hang
	*/
	@Override
	public boolean getTrangThai() {
		return _datHang.getTrangThai();
	}

	/**
	* Returns <code>true</code> if this dat hang is trang thai.
	*
	* @return <code>true</code> if this dat hang is trang thai; <code>false</code> otherwise
	*/
	@Override
	public boolean isTrangThai() {
		return _datHang.isTrangThai();
	}

	/**
	* Sets whether this dat hang is trang thai.
	*
	* @param trangThai the trang thai of this dat hang
	*/
	@Override
	public void setTrangThai(boolean trangThai) {
		_datHang.setTrangThai(trangThai);
	}

	/**
	* Returns the user modified ID of this dat hang.
	*
	* @return the user modified ID of this dat hang
	*/
	@Override
	public long getUserModifiedId() {
		return _datHang.getUserModifiedId();
	}

	/**
	* Sets the user modified ID of this dat hang.
	*
	* @param userModifiedId the user modified ID of this dat hang
	*/
	@Override
	public void setUserModifiedId(long userModifiedId) {
		_datHang.setUserModifiedId(userModifiedId);
	}

	/**
	* Returns the time modified of this dat hang.
	*
	* @return the time modified of this dat hang
	*/
	@Override
	public java.util.Date getTimeModified() {
		return _datHang.getTimeModified();
	}

	/**
	* Sets the time modified of this dat hang.
	*
	* @param timeModified the time modified of this dat hang
	*/
	@Override
	public void setTimeModified(java.util.Date timeModified) {
		_datHang.setTimeModified(timeModified);
	}

	/**
	* Returns the user create ID of this dat hang.
	*
	* @return the user create ID of this dat hang
	*/
	@Override
	public long getUserCreateId() {
		return _datHang.getUserCreateId();
	}

	/**
	* Sets the user create ID of this dat hang.
	*
	* @param userCreateId the user create ID of this dat hang
	*/
	@Override
	public void setUserCreateId(long userCreateId) {
		_datHang.setUserCreateId(userCreateId);
	}

	/**
	* Returns the loai gia of this dat hang.
	*
	* @return the loai gia of this dat hang
	*/
	@Override
	public int getLoaiGia() {
		return _datHang.getLoaiGia();
	}

	/**
	* Sets the loai gia of this dat hang.
	*
	* @param loaiGia the loai gia of this dat hang
	*/
	@Override
	public void setLoaiGia(int loaiGia) {
		_datHang.setLoaiGia(loaiGia);
	}

	/**
	* Returns the hoat dong of this dat hang.
	*
	* @return the hoat dong of this dat hang
	*/
	@Override
	public boolean getHoatDong() {
		return _datHang.getHoatDong();
	}

	/**
	* Returns <code>true</code> if this dat hang is hoat dong.
	*
	* @return <code>true</code> if this dat hang is hoat dong; <code>false</code> otherwise
	*/
	@Override
	public boolean isHoatDong() {
		return _datHang.isHoatDong();
	}

	/**
	* Sets whether this dat hang is hoat dong.
	*
	* @param hoatDong the hoat dong of this dat hang
	*/
	@Override
	public void setHoatDong(boolean hoatDong) {
		_datHang.setHoatDong(hoatDong);
	}

	@Override
	public boolean isNew() {
		return _datHang.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_datHang.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _datHang.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_datHang.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _datHang.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _datHang.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_datHang.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _datHang.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_datHang.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_datHang.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_datHang.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DatHangWrapper((DatHang)_datHang.clone());
	}

	@Override
	public int compareTo(com.minimart.portlet.dathang.model.DatHang datHang) {
		return _datHang.compareTo(datHang);
	}

	@Override
	public int hashCode() {
		return _datHang.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.minimart.portlet.dathang.model.DatHang> toCacheModel() {
		return _datHang.toCacheModel();
	}

	@Override
	public com.minimart.portlet.dathang.model.DatHang toEscapedModel() {
		return new DatHangWrapper(_datHang.toEscapedModel());
	}

	@Override
	public com.minimart.portlet.dathang.model.DatHang toUnescapedModel() {
		return new DatHangWrapper(_datHang.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _datHang.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _datHang.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_datHang.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DatHangWrapper)) {
			return false;
		}

		DatHangWrapper datHangWrapper = (DatHangWrapper)obj;

		if (Validator.equals(_datHang, datHangWrapper._datHang)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DatHang getWrappedDatHang() {
		return _datHang;
	}

	@Override
	public DatHang getWrappedModel() {
		return _datHang;
	}

	@Override
	public void resetOriginalValues() {
		_datHang.resetOriginalValues();
	}

	private DatHang _datHang;
}