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

package com.minimart.portlet.khuyenmai.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link LoaiHinhKhuyenMai}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see LoaiHinhKhuyenMai
 * @generated
 */
public class LoaiHinhKhuyenMaiWrapper implements LoaiHinhKhuyenMai,
	ModelWrapper<LoaiHinhKhuyenMai> {
	public LoaiHinhKhuyenMaiWrapper(LoaiHinhKhuyenMai loaiHinhKhuyenMai) {
		_loaiHinhKhuyenMai = loaiHinhKhuyenMai;
	}

	@Override
	public Class<?> getModelClass() {
		return LoaiHinhKhuyenMai.class;
	}

	@Override
	public String getModelClassName() {
		return LoaiHinhKhuyenMai.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("loaiHinhKhuyenMaiId", getLoaiHinhKhuyenMaiId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("trangThai", getTrangThai());
		attributes.put("tileGiamGia", getTileGiamGia());
		attributes.put("ngayBatDau", getNgayBatDau());
		attributes.put("ngayHetHan", getNgayHetHan());
		attributes.put("imageid", getImageid());
		attributes.put("ghiChu", getGhiChu());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long loaiHinhKhuyenMaiId = (Long)attributes.get("loaiHinhKhuyenMaiId");

		if (loaiHinhKhuyenMaiId != null) {
			setLoaiHinhKhuyenMaiId(loaiHinhKhuyenMaiId);
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

		Integer tileGiamGia = (Integer)attributes.get("tileGiamGia");

		if (tileGiamGia != null) {
			setTileGiamGia(tileGiamGia);
		}

		Date ngayBatDau = (Date)attributes.get("ngayBatDau");

		if (ngayBatDau != null) {
			setNgayBatDau(ngayBatDau);
		}

		Date ngayHetHan = (Date)attributes.get("ngayHetHan");

		if (ngayHetHan != null) {
			setNgayHetHan(ngayHetHan);
		}

		String imageid = (String)attributes.get("imageid");

		if (imageid != null) {
			setImageid(imageid);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}
	}

	/**
	* Returns the primary key of this loai hinh khuyen mai.
	*
	* @return the primary key of this loai hinh khuyen mai
	*/
	@Override
	public long getPrimaryKey() {
		return _loaiHinhKhuyenMai.getPrimaryKey();
	}

	/**
	* Sets the primary key of this loai hinh khuyen mai.
	*
	* @param primaryKey the primary key of this loai hinh khuyen mai
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_loaiHinhKhuyenMai.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the loai hinh khuyen mai ID of this loai hinh khuyen mai.
	*
	* @return the loai hinh khuyen mai ID of this loai hinh khuyen mai
	*/
	@Override
	public long getLoaiHinhKhuyenMaiId() {
		return _loaiHinhKhuyenMai.getLoaiHinhKhuyenMaiId();
	}

	/**
	* Sets the loai hinh khuyen mai ID of this loai hinh khuyen mai.
	*
	* @param loaiHinhKhuyenMaiId the loai hinh khuyen mai ID of this loai hinh khuyen mai
	*/
	@Override
	public void setLoaiHinhKhuyenMaiId(long loaiHinhKhuyenMaiId) {
		_loaiHinhKhuyenMai.setLoaiHinhKhuyenMaiId(loaiHinhKhuyenMaiId);
	}

	/**
	* Returns the company ID of this loai hinh khuyen mai.
	*
	* @return the company ID of this loai hinh khuyen mai
	*/
	@Override
	public long getCompanyId() {
		return _loaiHinhKhuyenMai.getCompanyId();
	}

	/**
	* Sets the company ID of this loai hinh khuyen mai.
	*
	* @param companyId the company ID of this loai hinh khuyen mai
	*/
	@Override
	public void setCompanyId(long companyId) {
		_loaiHinhKhuyenMai.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this loai hinh khuyen mai.
	*
	* @return the user ID of this loai hinh khuyen mai
	*/
	@Override
	public long getUserId() {
		return _loaiHinhKhuyenMai.getUserId();
	}

	/**
	* Sets the user ID of this loai hinh khuyen mai.
	*
	* @param userId the user ID of this loai hinh khuyen mai
	*/
	@Override
	public void setUserId(long userId) {
		_loaiHinhKhuyenMai.setUserId(userId);
	}

	/**
	* Returns the user uuid of this loai hinh khuyen mai.
	*
	* @return the user uuid of this loai hinh khuyen mai
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiHinhKhuyenMai.getUserUuid();
	}

	/**
	* Sets the user uuid of this loai hinh khuyen mai.
	*
	* @param userUuid the user uuid of this loai hinh khuyen mai
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_loaiHinhKhuyenMai.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this loai hinh khuyen mai.
	*
	* @return the user name of this loai hinh khuyen mai
	*/
	@Override
	public java.lang.String getUserName() {
		return _loaiHinhKhuyenMai.getUserName();
	}

	/**
	* Sets the user name of this loai hinh khuyen mai.
	*
	* @param userName the user name of this loai hinh khuyen mai
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_loaiHinhKhuyenMai.setUserName(userName);
	}

	/**
	* Returns the create date of this loai hinh khuyen mai.
	*
	* @return the create date of this loai hinh khuyen mai
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _loaiHinhKhuyenMai.getCreateDate();
	}

	/**
	* Sets the create date of this loai hinh khuyen mai.
	*
	* @param createDate the create date of this loai hinh khuyen mai
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_loaiHinhKhuyenMai.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this loai hinh khuyen mai.
	*
	* @return the modified date of this loai hinh khuyen mai
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _loaiHinhKhuyenMai.getModifiedDate();
	}

	/**
	* Sets the modified date of this loai hinh khuyen mai.
	*
	* @param modifiedDate the modified date of this loai hinh khuyen mai
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_loaiHinhKhuyenMai.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the ten of this loai hinh khuyen mai.
	*
	* @return the ten of this loai hinh khuyen mai
	*/
	@Override
	public java.lang.String getTen() {
		return _loaiHinhKhuyenMai.getTen();
	}

	/**
	* Sets the ten of this loai hinh khuyen mai.
	*
	* @param ten the ten of this loai hinh khuyen mai
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_loaiHinhKhuyenMai.setTen(ten);
	}

	/**
	* Returns the trang thai of this loai hinh khuyen mai.
	*
	* @return the trang thai of this loai hinh khuyen mai
	*/
	@Override
	public boolean getTrangThai() {
		return _loaiHinhKhuyenMai.getTrangThai();
	}

	/**
	* Returns <code>true</code> if this loai hinh khuyen mai is trang thai.
	*
	* @return <code>true</code> if this loai hinh khuyen mai is trang thai; <code>false</code> otherwise
	*/
	@Override
	public boolean isTrangThai() {
		return _loaiHinhKhuyenMai.isTrangThai();
	}

	/**
	* Sets whether this loai hinh khuyen mai is trang thai.
	*
	* @param trangThai the trang thai of this loai hinh khuyen mai
	*/
	@Override
	public void setTrangThai(boolean trangThai) {
		_loaiHinhKhuyenMai.setTrangThai(trangThai);
	}

	/**
	* Returns the tile giam gia of this loai hinh khuyen mai.
	*
	* @return the tile giam gia of this loai hinh khuyen mai
	*/
	@Override
	public int getTileGiamGia() {
		return _loaiHinhKhuyenMai.getTileGiamGia();
	}

	/**
	* Sets the tile giam gia of this loai hinh khuyen mai.
	*
	* @param tileGiamGia the tile giam gia of this loai hinh khuyen mai
	*/
	@Override
	public void setTileGiamGia(int tileGiamGia) {
		_loaiHinhKhuyenMai.setTileGiamGia(tileGiamGia);
	}

	/**
	* Returns the ngay bat dau of this loai hinh khuyen mai.
	*
	* @return the ngay bat dau of this loai hinh khuyen mai
	*/
	@Override
	public java.util.Date getNgayBatDau() {
		return _loaiHinhKhuyenMai.getNgayBatDau();
	}

	/**
	* Sets the ngay bat dau of this loai hinh khuyen mai.
	*
	* @param ngayBatDau the ngay bat dau of this loai hinh khuyen mai
	*/
	@Override
	public void setNgayBatDau(java.util.Date ngayBatDau) {
		_loaiHinhKhuyenMai.setNgayBatDau(ngayBatDau);
	}

	/**
	* Returns the ngay het han of this loai hinh khuyen mai.
	*
	* @return the ngay het han of this loai hinh khuyen mai
	*/
	@Override
	public java.util.Date getNgayHetHan() {
		return _loaiHinhKhuyenMai.getNgayHetHan();
	}

	/**
	* Sets the ngay het han of this loai hinh khuyen mai.
	*
	* @param ngayHetHan the ngay het han of this loai hinh khuyen mai
	*/
	@Override
	public void setNgayHetHan(java.util.Date ngayHetHan) {
		_loaiHinhKhuyenMai.setNgayHetHan(ngayHetHan);
	}

	/**
	* Returns the imageid of this loai hinh khuyen mai.
	*
	* @return the imageid of this loai hinh khuyen mai
	*/
	@Override
	public java.lang.String getImageid() {
		return _loaiHinhKhuyenMai.getImageid();
	}

	/**
	* Sets the imageid of this loai hinh khuyen mai.
	*
	* @param imageid the imageid of this loai hinh khuyen mai
	*/
	@Override
	public void setImageid(java.lang.String imageid) {
		_loaiHinhKhuyenMai.setImageid(imageid);
	}

	/**
	* Returns the ghi chu of this loai hinh khuyen mai.
	*
	* @return the ghi chu of this loai hinh khuyen mai
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _loaiHinhKhuyenMai.getGhiChu();
	}

	/**
	* Sets the ghi chu of this loai hinh khuyen mai.
	*
	* @param ghiChu the ghi chu of this loai hinh khuyen mai
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_loaiHinhKhuyenMai.setGhiChu(ghiChu);
	}

	@Override
	public boolean isNew() {
		return _loaiHinhKhuyenMai.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_loaiHinhKhuyenMai.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _loaiHinhKhuyenMai.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_loaiHinhKhuyenMai.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _loaiHinhKhuyenMai.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _loaiHinhKhuyenMai.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_loaiHinhKhuyenMai.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _loaiHinhKhuyenMai.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_loaiHinhKhuyenMai.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_loaiHinhKhuyenMai.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_loaiHinhKhuyenMai.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LoaiHinhKhuyenMaiWrapper((LoaiHinhKhuyenMai)_loaiHinhKhuyenMai.clone());
	}

	@Override
	public int compareTo(
		com.minimart.portlet.khuyenmai.model.LoaiHinhKhuyenMai loaiHinhKhuyenMai) {
		return _loaiHinhKhuyenMai.compareTo(loaiHinhKhuyenMai);
	}

	@Override
	public int hashCode() {
		return _loaiHinhKhuyenMai.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.minimart.portlet.khuyenmai.model.LoaiHinhKhuyenMai> toCacheModel() {
		return _loaiHinhKhuyenMai.toCacheModel();
	}

	@Override
	public com.minimart.portlet.khuyenmai.model.LoaiHinhKhuyenMai toEscapedModel() {
		return new LoaiHinhKhuyenMaiWrapper(_loaiHinhKhuyenMai.toEscapedModel());
	}

	@Override
	public com.minimart.portlet.khuyenmai.model.LoaiHinhKhuyenMai toUnescapedModel() {
		return new LoaiHinhKhuyenMaiWrapper(_loaiHinhKhuyenMai.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _loaiHinhKhuyenMai.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _loaiHinhKhuyenMai.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_loaiHinhKhuyenMai.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LoaiHinhKhuyenMaiWrapper)) {
			return false;
		}

		LoaiHinhKhuyenMaiWrapper loaiHinhKhuyenMaiWrapper = (LoaiHinhKhuyenMaiWrapper)obj;

		if (Validator.equals(_loaiHinhKhuyenMai,
					loaiHinhKhuyenMaiWrapper._loaiHinhKhuyenMai)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public LoaiHinhKhuyenMai getWrappedLoaiHinhKhuyenMai() {
		return _loaiHinhKhuyenMai;
	}

	@Override
	public LoaiHinhKhuyenMai getWrappedModel() {
		return _loaiHinhKhuyenMai;
	}

	@Override
	public void resetOriginalValues() {
		_loaiHinhKhuyenMai.resetOriginalValues();
	}

	private LoaiHinhKhuyenMai _loaiHinhKhuyenMai;
}