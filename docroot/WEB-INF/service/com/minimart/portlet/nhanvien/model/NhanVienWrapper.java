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

package com.minimart.portlet.nhanvien.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link NhanVien}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see NhanVien
 * @generated
 */
public class NhanVienWrapper implements NhanVien, ModelWrapper<NhanVien> {
	public NhanVienWrapper(NhanVien nhanVien) {
		_nhanVien = nhanVien;
	}

	@Override
	public Class<?> getModelClass() {
		return NhanVien.class;
	}

	@Override
	public String getModelClassName() {
		return NhanVien.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("nhanVienId", getNhanVienId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("ho", getHo());
		attributes.put("trangThai", getTrangThai());
		attributes.put("nghiThu7", getNghiThu7());
		attributes.put("nghiChuNhat", getNghiChuNhat());
		attributes.put("cachTinhLuong", getCachTinhLuong());
		attributes.put("luongCa", getLuongCa());
		attributes.put("luongThang", getLuongThang());
		attributes.put("image", getImage());
		attributes.put("diaChiId", getDiaChiId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long nhanVienId = (Long)attributes.get("nhanVienId");

		if (nhanVienId != null) {
			setNhanVienId(nhanVienId);
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

		String ho = (String)attributes.get("ho");

		if (ho != null) {
			setHo(ho);
		}

		Boolean trangThai = (Boolean)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		Boolean nghiThu7 = (Boolean)attributes.get("nghiThu7");

		if (nghiThu7 != null) {
			setNghiThu7(nghiThu7);
		}

		Boolean nghiChuNhat = (Boolean)attributes.get("nghiChuNhat");

		if (nghiChuNhat != null) {
			setNghiChuNhat(nghiChuNhat);
		}

		Integer cachTinhLuong = (Integer)attributes.get("cachTinhLuong");

		if (cachTinhLuong != null) {
			setCachTinhLuong(cachTinhLuong);
		}

		Integer luongCa = (Integer)attributes.get("luongCa");

		if (luongCa != null) {
			setLuongCa(luongCa);
		}

		Integer luongThang = (Integer)attributes.get("luongThang");

		if (luongThang != null) {
			setLuongThang(luongThang);
		}

		String image = (String)attributes.get("image");

		if (image != null) {
			setImage(image);
		}

		Long diaChiId = (Long)attributes.get("diaChiId");

		if (diaChiId != null) {
			setDiaChiId(diaChiId);
		}
	}

	/**
	* Returns the primary key of this nhan vien.
	*
	* @return the primary key of this nhan vien
	*/
	@Override
	public long getPrimaryKey() {
		return _nhanVien.getPrimaryKey();
	}

	/**
	* Sets the primary key of this nhan vien.
	*
	* @param primaryKey the primary key of this nhan vien
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_nhanVien.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this nhan vien.
	*
	* @return the uuid of this nhan vien
	*/
	@Override
	public java.lang.String getUuid() {
		return _nhanVien.getUuid();
	}

	/**
	* Sets the uuid of this nhan vien.
	*
	* @param uuid the uuid of this nhan vien
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_nhanVien.setUuid(uuid);
	}

	/**
	* Returns the nhan vien ID of this nhan vien.
	*
	* @return the nhan vien ID of this nhan vien
	*/
	@Override
	public long getNhanVienId() {
		return _nhanVien.getNhanVienId();
	}

	/**
	* Sets the nhan vien ID of this nhan vien.
	*
	* @param nhanVienId the nhan vien ID of this nhan vien
	*/
	@Override
	public void setNhanVienId(long nhanVienId) {
		_nhanVien.setNhanVienId(nhanVienId);
	}

	/**
	* Returns the company ID of this nhan vien.
	*
	* @return the company ID of this nhan vien
	*/
	@Override
	public long getCompanyId() {
		return _nhanVien.getCompanyId();
	}

	/**
	* Sets the company ID of this nhan vien.
	*
	* @param companyId the company ID of this nhan vien
	*/
	@Override
	public void setCompanyId(long companyId) {
		_nhanVien.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this nhan vien.
	*
	* @return the user ID of this nhan vien
	*/
	@Override
	public long getUserId() {
		return _nhanVien.getUserId();
	}

	/**
	* Sets the user ID of this nhan vien.
	*
	* @param userId the user ID of this nhan vien
	*/
	@Override
	public void setUserId(long userId) {
		_nhanVien.setUserId(userId);
	}

	/**
	* Returns the user uuid of this nhan vien.
	*
	* @return the user uuid of this nhan vien
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhanVien.getUserUuid();
	}

	/**
	* Sets the user uuid of this nhan vien.
	*
	* @param userUuid the user uuid of this nhan vien
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_nhanVien.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this nhan vien.
	*
	* @return the user name of this nhan vien
	*/
	@Override
	public java.lang.String getUserName() {
		return _nhanVien.getUserName();
	}

	/**
	* Sets the user name of this nhan vien.
	*
	* @param userName the user name of this nhan vien
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_nhanVien.setUserName(userName);
	}

	/**
	* Returns the create date of this nhan vien.
	*
	* @return the create date of this nhan vien
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _nhanVien.getCreateDate();
	}

	/**
	* Sets the create date of this nhan vien.
	*
	* @param createDate the create date of this nhan vien
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_nhanVien.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this nhan vien.
	*
	* @return the modified date of this nhan vien
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _nhanVien.getModifiedDate();
	}

	/**
	* Sets the modified date of this nhan vien.
	*
	* @param modifiedDate the modified date of this nhan vien
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_nhanVien.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the ten of this nhan vien.
	*
	* @return the ten of this nhan vien
	*/
	@Override
	public java.lang.String getTen() {
		return _nhanVien.getTen();
	}

	/**
	* Sets the ten of this nhan vien.
	*
	* @param ten the ten of this nhan vien
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_nhanVien.setTen(ten);
	}

	/**
	* Returns the ho of this nhan vien.
	*
	* @return the ho of this nhan vien
	*/
	@Override
	public java.lang.String getHo() {
		return _nhanVien.getHo();
	}

	/**
	* Sets the ho of this nhan vien.
	*
	* @param ho the ho of this nhan vien
	*/
	@Override
	public void setHo(java.lang.String ho) {
		_nhanVien.setHo(ho);
	}

	/**
	* Returns the trang thai of this nhan vien.
	*
	* @return the trang thai of this nhan vien
	*/
	@Override
	public boolean getTrangThai() {
		return _nhanVien.getTrangThai();
	}

	/**
	* Returns <code>true</code> if this nhan vien is trang thai.
	*
	* @return <code>true</code> if this nhan vien is trang thai; <code>false</code> otherwise
	*/
	@Override
	public boolean isTrangThai() {
		return _nhanVien.isTrangThai();
	}

	/**
	* Sets whether this nhan vien is trang thai.
	*
	* @param trangThai the trang thai of this nhan vien
	*/
	@Override
	public void setTrangThai(boolean trangThai) {
		_nhanVien.setTrangThai(trangThai);
	}

	/**
	* Returns the nghi thu7 of this nhan vien.
	*
	* @return the nghi thu7 of this nhan vien
	*/
	@Override
	public boolean getNghiThu7() {
		return _nhanVien.getNghiThu7();
	}

	/**
	* Returns <code>true</code> if this nhan vien is nghi thu7.
	*
	* @return <code>true</code> if this nhan vien is nghi thu7; <code>false</code> otherwise
	*/
	@Override
	public boolean isNghiThu7() {
		return _nhanVien.isNghiThu7();
	}

	/**
	* Sets whether this nhan vien is nghi thu7.
	*
	* @param nghiThu7 the nghi thu7 of this nhan vien
	*/
	@Override
	public void setNghiThu7(boolean nghiThu7) {
		_nhanVien.setNghiThu7(nghiThu7);
	}

	/**
	* Returns the nghi chu nhat of this nhan vien.
	*
	* @return the nghi chu nhat of this nhan vien
	*/
	@Override
	public boolean getNghiChuNhat() {
		return _nhanVien.getNghiChuNhat();
	}

	/**
	* Returns <code>true</code> if this nhan vien is nghi chu nhat.
	*
	* @return <code>true</code> if this nhan vien is nghi chu nhat; <code>false</code> otherwise
	*/
	@Override
	public boolean isNghiChuNhat() {
		return _nhanVien.isNghiChuNhat();
	}

	/**
	* Sets whether this nhan vien is nghi chu nhat.
	*
	* @param nghiChuNhat the nghi chu nhat of this nhan vien
	*/
	@Override
	public void setNghiChuNhat(boolean nghiChuNhat) {
		_nhanVien.setNghiChuNhat(nghiChuNhat);
	}

	/**
	* Returns the cach tinh luong of this nhan vien.
	*
	* @return the cach tinh luong of this nhan vien
	*/
	@Override
	public int getCachTinhLuong() {
		return _nhanVien.getCachTinhLuong();
	}

	/**
	* Sets the cach tinh luong of this nhan vien.
	*
	* @param cachTinhLuong the cach tinh luong of this nhan vien
	*/
	@Override
	public void setCachTinhLuong(int cachTinhLuong) {
		_nhanVien.setCachTinhLuong(cachTinhLuong);
	}

	/**
	* Returns the luong ca of this nhan vien.
	*
	* @return the luong ca of this nhan vien
	*/
	@Override
	public int getLuongCa() {
		return _nhanVien.getLuongCa();
	}

	/**
	* Sets the luong ca of this nhan vien.
	*
	* @param luongCa the luong ca of this nhan vien
	*/
	@Override
	public void setLuongCa(int luongCa) {
		_nhanVien.setLuongCa(luongCa);
	}

	/**
	* Returns the luong thang of this nhan vien.
	*
	* @return the luong thang of this nhan vien
	*/
	@Override
	public int getLuongThang() {
		return _nhanVien.getLuongThang();
	}

	/**
	* Sets the luong thang of this nhan vien.
	*
	* @param luongThang the luong thang of this nhan vien
	*/
	@Override
	public void setLuongThang(int luongThang) {
		_nhanVien.setLuongThang(luongThang);
	}

	/**
	* Returns the image of this nhan vien.
	*
	* @return the image of this nhan vien
	*/
	@Override
	public java.lang.String getImage() {
		return _nhanVien.getImage();
	}

	/**
	* Sets the image of this nhan vien.
	*
	* @param image the image of this nhan vien
	*/
	@Override
	public void setImage(java.lang.String image) {
		_nhanVien.setImage(image);
	}

	/**
	* Returns the dia chi ID of this nhan vien.
	*
	* @return the dia chi ID of this nhan vien
	*/
	@Override
	public long getDiaChiId() {
		return _nhanVien.getDiaChiId();
	}

	/**
	* Sets the dia chi ID of this nhan vien.
	*
	* @param diaChiId the dia chi ID of this nhan vien
	*/
	@Override
	public void setDiaChiId(long diaChiId) {
		_nhanVien.setDiaChiId(diaChiId);
	}

	@Override
	public boolean isNew() {
		return _nhanVien.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_nhanVien.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _nhanVien.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_nhanVien.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _nhanVien.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _nhanVien.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_nhanVien.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _nhanVien.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_nhanVien.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_nhanVien.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_nhanVien.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new NhanVienWrapper((NhanVien)_nhanVien.clone());
	}

	@Override
	public int compareTo(com.minimart.portlet.nhanvien.model.NhanVien nhanVien) {
		return _nhanVien.compareTo(nhanVien);
	}

	@Override
	public int hashCode() {
		return _nhanVien.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.minimart.portlet.nhanvien.model.NhanVien> toCacheModel() {
		return _nhanVien.toCacheModel();
	}

	@Override
	public com.minimart.portlet.nhanvien.model.NhanVien toEscapedModel() {
		return new NhanVienWrapper(_nhanVien.toEscapedModel());
	}

	@Override
	public com.minimart.portlet.nhanvien.model.NhanVien toUnescapedModel() {
		return new NhanVienWrapper(_nhanVien.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _nhanVien.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _nhanVien.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_nhanVien.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NhanVienWrapper)) {
			return false;
		}

		NhanVienWrapper nhanVienWrapper = (NhanVienWrapper)obj;

		if (Validator.equals(_nhanVien, nhanVienWrapper._nhanVien)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _nhanVien.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public NhanVien getWrappedNhanVien() {
		return _nhanVien;
	}

	@Override
	public NhanVien getWrappedModel() {
		return _nhanVien;
	}

	@Override
	public void resetOriginalValues() {
		_nhanVien.resetOriginalValues();
	}

	private NhanVien _nhanVien;
}