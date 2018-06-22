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
 * This class is a wrapper for {@link DotKhuyenMai}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see DotKhuyenMai
 * @generated
 */
public class DotKhuyenMaiWrapper implements DotKhuyenMai,
	ModelWrapper<DotKhuyenMai> {
	public DotKhuyenMaiWrapper(DotKhuyenMai dotKhuyenMai) {
		_dotKhuyenMai = dotKhuyenMai;
	}

	@Override
	public Class<?> getModelClass() {
		return DotKhuyenMai.class;
	}

	@Override
	public String getModelClassName() {
		return DotKhuyenMai.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dotKhuyenMaiId", getDotKhuyenMaiId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("trangThai", getTrangThai());
		attributes.put("userModifieldId", getUserModifieldId());
		attributes.put("ngayBatDau", getNgayBatDau());
		attributes.put("ngayHetHan", getNgayHetHan());
		attributes.put("ngungApDung", getNgungApDung());
		attributes.put("tiLeGiaGia", getTiLeGiaGia());
		attributes.put("ghiChu", getGhiChu());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dotKhuyenMaiId = (Long)attributes.get("dotKhuyenMaiId");

		if (dotKhuyenMaiId != null) {
			setDotKhuyenMaiId(dotKhuyenMaiId);
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

		Long userModifieldId = (Long)attributes.get("userModifieldId");

		if (userModifieldId != null) {
			setUserModifieldId(userModifieldId);
		}

		Date ngayBatDau = (Date)attributes.get("ngayBatDau");

		if (ngayBatDau != null) {
			setNgayBatDau(ngayBatDau);
		}

		Date ngayHetHan = (Date)attributes.get("ngayHetHan");

		if (ngayHetHan != null) {
			setNgayHetHan(ngayHetHan);
		}

		Boolean ngungApDung = (Boolean)attributes.get("ngungApDung");

		if (ngungApDung != null) {
			setNgungApDung(ngungApDung);
		}

		Integer tiLeGiaGia = (Integer)attributes.get("tiLeGiaGia");

		if (tiLeGiaGia != null) {
			setTiLeGiaGia(tiLeGiaGia);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}
	}

	/**
	* Returns the primary key of this dot khuyen mai.
	*
	* @return the primary key of this dot khuyen mai
	*/
	@Override
	public long getPrimaryKey() {
		return _dotKhuyenMai.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dot khuyen mai.
	*
	* @param primaryKey the primary key of this dot khuyen mai
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dotKhuyenMai.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the dot khuyen mai ID of this dot khuyen mai.
	*
	* @return the dot khuyen mai ID of this dot khuyen mai
	*/
	@Override
	public long getDotKhuyenMaiId() {
		return _dotKhuyenMai.getDotKhuyenMaiId();
	}

	/**
	* Sets the dot khuyen mai ID of this dot khuyen mai.
	*
	* @param dotKhuyenMaiId the dot khuyen mai ID of this dot khuyen mai
	*/
	@Override
	public void setDotKhuyenMaiId(long dotKhuyenMaiId) {
		_dotKhuyenMai.setDotKhuyenMaiId(dotKhuyenMaiId);
	}

	/**
	* Returns the company ID of this dot khuyen mai.
	*
	* @return the company ID of this dot khuyen mai
	*/
	@Override
	public long getCompanyId() {
		return _dotKhuyenMai.getCompanyId();
	}

	/**
	* Sets the company ID of this dot khuyen mai.
	*
	* @param companyId the company ID of this dot khuyen mai
	*/
	@Override
	public void setCompanyId(long companyId) {
		_dotKhuyenMai.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this dot khuyen mai.
	*
	* @return the user ID of this dot khuyen mai
	*/
	@Override
	public long getUserId() {
		return _dotKhuyenMai.getUserId();
	}

	/**
	* Sets the user ID of this dot khuyen mai.
	*
	* @param userId the user ID of this dot khuyen mai
	*/
	@Override
	public void setUserId(long userId) {
		_dotKhuyenMai.setUserId(userId);
	}

	/**
	* Returns the user uuid of this dot khuyen mai.
	*
	* @return the user uuid of this dot khuyen mai
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dotKhuyenMai.getUserUuid();
	}

	/**
	* Sets the user uuid of this dot khuyen mai.
	*
	* @param userUuid the user uuid of this dot khuyen mai
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_dotKhuyenMai.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this dot khuyen mai.
	*
	* @return the user name of this dot khuyen mai
	*/
	@Override
	public java.lang.String getUserName() {
		return _dotKhuyenMai.getUserName();
	}

	/**
	* Sets the user name of this dot khuyen mai.
	*
	* @param userName the user name of this dot khuyen mai
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_dotKhuyenMai.setUserName(userName);
	}

	/**
	* Returns the create date of this dot khuyen mai.
	*
	* @return the create date of this dot khuyen mai
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _dotKhuyenMai.getCreateDate();
	}

	/**
	* Sets the create date of this dot khuyen mai.
	*
	* @param createDate the create date of this dot khuyen mai
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_dotKhuyenMai.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this dot khuyen mai.
	*
	* @return the modified date of this dot khuyen mai
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dotKhuyenMai.getModifiedDate();
	}

	/**
	* Sets the modified date of this dot khuyen mai.
	*
	* @param modifiedDate the modified date of this dot khuyen mai
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dotKhuyenMai.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the ten of this dot khuyen mai.
	*
	* @return the ten of this dot khuyen mai
	*/
	@Override
	public java.lang.String getTen() {
		return _dotKhuyenMai.getTen();
	}

	/**
	* Sets the ten of this dot khuyen mai.
	*
	* @param ten the ten of this dot khuyen mai
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_dotKhuyenMai.setTen(ten);
	}

	/**
	* Returns the trang thai of this dot khuyen mai.
	*
	* @return the trang thai of this dot khuyen mai
	*/
	@Override
	public boolean getTrangThai() {
		return _dotKhuyenMai.getTrangThai();
	}

	/**
	* Returns <code>true</code> if this dot khuyen mai is trang thai.
	*
	* @return <code>true</code> if this dot khuyen mai is trang thai; <code>false</code> otherwise
	*/
	@Override
	public boolean isTrangThai() {
		return _dotKhuyenMai.isTrangThai();
	}

	/**
	* Sets whether this dot khuyen mai is trang thai.
	*
	* @param trangThai the trang thai of this dot khuyen mai
	*/
	@Override
	public void setTrangThai(boolean trangThai) {
		_dotKhuyenMai.setTrangThai(trangThai);
	}

	/**
	* Returns the user modifield ID of this dot khuyen mai.
	*
	* @return the user modifield ID of this dot khuyen mai
	*/
	@Override
	public long getUserModifieldId() {
		return _dotKhuyenMai.getUserModifieldId();
	}

	/**
	* Sets the user modifield ID of this dot khuyen mai.
	*
	* @param userModifieldId the user modifield ID of this dot khuyen mai
	*/
	@Override
	public void setUserModifieldId(long userModifieldId) {
		_dotKhuyenMai.setUserModifieldId(userModifieldId);
	}

	/**
	* Returns the ngay bat dau of this dot khuyen mai.
	*
	* @return the ngay bat dau of this dot khuyen mai
	*/
	@Override
	public java.util.Date getNgayBatDau() {
		return _dotKhuyenMai.getNgayBatDau();
	}

	/**
	* Sets the ngay bat dau of this dot khuyen mai.
	*
	* @param ngayBatDau the ngay bat dau of this dot khuyen mai
	*/
	@Override
	public void setNgayBatDau(java.util.Date ngayBatDau) {
		_dotKhuyenMai.setNgayBatDau(ngayBatDau);
	}

	/**
	* Returns the ngay het han of this dot khuyen mai.
	*
	* @return the ngay het han of this dot khuyen mai
	*/
	@Override
	public java.util.Date getNgayHetHan() {
		return _dotKhuyenMai.getNgayHetHan();
	}

	/**
	* Sets the ngay het han of this dot khuyen mai.
	*
	* @param ngayHetHan the ngay het han of this dot khuyen mai
	*/
	@Override
	public void setNgayHetHan(java.util.Date ngayHetHan) {
		_dotKhuyenMai.setNgayHetHan(ngayHetHan);
	}

	/**
	* Returns the ngung ap dung of this dot khuyen mai.
	*
	* @return the ngung ap dung of this dot khuyen mai
	*/
	@Override
	public boolean getNgungApDung() {
		return _dotKhuyenMai.getNgungApDung();
	}

	/**
	* Returns <code>true</code> if this dot khuyen mai is ngung ap dung.
	*
	* @return <code>true</code> if this dot khuyen mai is ngung ap dung; <code>false</code> otherwise
	*/
	@Override
	public boolean isNgungApDung() {
		return _dotKhuyenMai.isNgungApDung();
	}

	/**
	* Sets whether this dot khuyen mai is ngung ap dung.
	*
	* @param ngungApDung the ngung ap dung of this dot khuyen mai
	*/
	@Override
	public void setNgungApDung(boolean ngungApDung) {
		_dotKhuyenMai.setNgungApDung(ngungApDung);
	}

	/**
	* Returns the ti le gia gia of this dot khuyen mai.
	*
	* @return the ti le gia gia of this dot khuyen mai
	*/
	@Override
	public int getTiLeGiaGia() {
		return _dotKhuyenMai.getTiLeGiaGia();
	}

	/**
	* Sets the ti le gia gia of this dot khuyen mai.
	*
	* @param tiLeGiaGia the ti le gia gia of this dot khuyen mai
	*/
	@Override
	public void setTiLeGiaGia(int tiLeGiaGia) {
		_dotKhuyenMai.setTiLeGiaGia(tiLeGiaGia);
	}

	/**
	* Returns the ghi chu of this dot khuyen mai.
	*
	* @return the ghi chu of this dot khuyen mai
	*/
	@Override
	public java.lang.String getGhiChu() {
		return _dotKhuyenMai.getGhiChu();
	}

	/**
	* Sets the ghi chu of this dot khuyen mai.
	*
	* @param ghiChu the ghi chu of this dot khuyen mai
	*/
	@Override
	public void setGhiChu(java.lang.String ghiChu) {
		_dotKhuyenMai.setGhiChu(ghiChu);
	}

	@Override
	public boolean isNew() {
		return _dotKhuyenMai.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dotKhuyenMai.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dotKhuyenMai.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dotKhuyenMai.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dotKhuyenMai.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dotKhuyenMai.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dotKhuyenMai.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dotKhuyenMai.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dotKhuyenMai.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dotKhuyenMai.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dotKhuyenMai.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DotKhuyenMaiWrapper((DotKhuyenMai)_dotKhuyenMai.clone());
	}

	@Override
	public int compareTo(
		com.minimart.portlet.khuyenmai.model.DotKhuyenMai dotKhuyenMai) {
		return _dotKhuyenMai.compareTo(dotKhuyenMai);
	}

	@Override
	public int hashCode() {
		return _dotKhuyenMai.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.minimart.portlet.khuyenmai.model.DotKhuyenMai> toCacheModel() {
		return _dotKhuyenMai.toCacheModel();
	}

	@Override
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMai toEscapedModel() {
		return new DotKhuyenMaiWrapper(_dotKhuyenMai.toEscapedModel());
	}

	@Override
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMai toUnescapedModel() {
		return new DotKhuyenMaiWrapper(_dotKhuyenMai.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dotKhuyenMai.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dotKhuyenMai.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dotKhuyenMai.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DotKhuyenMaiWrapper)) {
			return false;
		}

		DotKhuyenMaiWrapper dotKhuyenMaiWrapper = (DotKhuyenMaiWrapper)obj;

		if (Validator.equals(_dotKhuyenMai, dotKhuyenMaiWrapper._dotKhuyenMai)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DotKhuyenMai getWrappedDotKhuyenMai() {
		return _dotKhuyenMai;
	}

	@Override
	public DotKhuyenMai getWrappedModel() {
		return _dotKhuyenMai;
	}

	@Override
	public void resetOriginalValues() {
		_dotKhuyenMai.resetOriginalValues();
	}

	private DotKhuyenMai _dotKhuyenMai;
}