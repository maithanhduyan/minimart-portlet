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
 * This class is a wrapper for {@link DotKhuyenMaiChiTiet}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see DotKhuyenMaiChiTiet
 * @generated
 */
public class DotKhuyenMaiChiTietWrapper implements DotKhuyenMaiChiTiet,
	ModelWrapper<DotKhuyenMaiChiTiet> {
	public DotKhuyenMaiChiTietWrapper(DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet) {
		_dotKhuyenMaiChiTiet = dotKhuyenMaiChiTiet;
	}

	@Override
	public Class<?> getModelClass() {
		return DotKhuyenMaiChiTiet.class;
	}

	@Override
	public String getModelClassName() {
		return DotKhuyenMaiChiTiet.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dotKhuyenMaiChiTietId", getDotKhuyenMaiChiTietId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dotKhuyenMaiId", getDotKhuyenMaiId());
		attributes.put("nhomMatHangId", getNhomMatHangId());
		attributes.put("matHangId", getMatHangId());
		attributes.put("matHangTangId", getMatHangTangId());
		attributes.put("tiLeGiamGia", getTiLeGiamGia());
		attributes.put("giaTriDonHang", getGiaTriDonHang());
		attributes.put("soLuongMua", getSoLuongMua());
		attributes.put("soLuongTang", getSoLuongTang());
		attributes.put("giaBan", getGiaBan());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dotKhuyenMaiChiTietId = (Long)attributes.get(
				"dotKhuyenMaiChiTietId");

		if (dotKhuyenMaiChiTietId != null) {
			setDotKhuyenMaiChiTietId(dotKhuyenMaiChiTietId);
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

		Long dotKhuyenMaiId = (Long)attributes.get("dotKhuyenMaiId");

		if (dotKhuyenMaiId != null) {
			setDotKhuyenMaiId(dotKhuyenMaiId);
		}

		Long nhomMatHangId = (Long)attributes.get("nhomMatHangId");

		if (nhomMatHangId != null) {
			setNhomMatHangId(nhomMatHangId);
		}

		Long matHangId = (Long)attributes.get("matHangId");

		if (matHangId != null) {
			setMatHangId(matHangId);
		}

		Long matHangTangId = (Long)attributes.get("matHangTangId");

		if (matHangTangId != null) {
			setMatHangTangId(matHangTangId);
		}

		Double tiLeGiamGia = (Double)attributes.get("tiLeGiamGia");

		if (tiLeGiamGia != null) {
			setTiLeGiamGia(tiLeGiamGia);
		}

		Double giaTriDonHang = (Double)attributes.get("giaTriDonHang");

		if (giaTriDonHang != null) {
			setGiaTriDonHang(giaTriDonHang);
		}

		Integer soLuongMua = (Integer)attributes.get("soLuongMua");

		if (soLuongMua != null) {
			setSoLuongMua(soLuongMua);
		}

		Integer soLuongTang = (Integer)attributes.get("soLuongTang");

		if (soLuongTang != null) {
			setSoLuongTang(soLuongTang);
		}

		Integer giaBan = (Integer)attributes.get("giaBan");

		if (giaBan != null) {
			setGiaBan(giaBan);
		}
	}

	/**
	* Returns the primary key of this dot khuyen mai chi tiet.
	*
	* @return the primary key of this dot khuyen mai chi tiet
	*/
	@Override
	public long getPrimaryKey() {
		return _dotKhuyenMaiChiTiet.getPrimaryKey();
	}

	/**
	* Sets the primary key of this dot khuyen mai chi tiet.
	*
	* @param primaryKey the primary key of this dot khuyen mai chi tiet
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dotKhuyenMaiChiTiet.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the dot khuyen mai chi tiet ID of this dot khuyen mai chi tiet.
	*
	* @return the dot khuyen mai chi tiet ID of this dot khuyen mai chi tiet
	*/
	@Override
	public long getDotKhuyenMaiChiTietId() {
		return _dotKhuyenMaiChiTiet.getDotKhuyenMaiChiTietId();
	}

	/**
	* Sets the dot khuyen mai chi tiet ID of this dot khuyen mai chi tiet.
	*
	* @param dotKhuyenMaiChiTietId the dot khuyen mai chi tiet ID of this dot khuyen mai chi tiet
	*/
	@Override
	public void setDotKhuyenMaiChiTietId(long dotKhuyenMaiChiTietId) {
		_dotKhuyenMaiChiTiet.setDotKhuyenMaiChiTietId(dotKhuyenMaiChiTietId);
	}

	/**
	* Returns the company ID of this dot khuyen mai chi tiet.
	*
	* @return the company ID of this dot khuyen mai chi tiet
	*/
	@Override
	public long getCompanyId() {
		return _dotKhuyenMaiChiTiet.getCompanyId();
	}

	/**
	* Sets the company ID of this dot khuyen mai chi tiet.
	*
	* @param companyId the company ID of this dot khuyen mai chi tiet
	*/
	@Override
	public void setCompanyId(long companyId) {
		_dotKhuyenMaiChiTiet.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this dot khuyen mai chi tiet.
	*
	* @return the user ID of this dot khuyen mai chi tiet
	*/
	@Override
	public long getUserId() {
		return _dotKhuyenMaiChiTiet.getUserId();
	}

	/**
	* Sets the user ID of this dot khuyen mai chi tiet.
	*
	* @param userId the user ID of this dot khuyen mai chi tiet
	*/
	@Override
	public void setUserId(long userId) {
		_dotKhuyenMaiChiTiet.setUserId(userId);
	}

	/**
	* Returns the user uuid of this dot khuyen mai chi tiet.
	*
	* @return the user uuid of this dot khuyen mai chi tiet
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dotKhuyenMaiChiTiet.getUserUuid();
	}

	/**
	* Sets the user uuid of this dot khuyen mai chi tiet.
	*
	* @param userUuid the user uuid of this dot khuyen mai chi tiet
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_dotKhuyenMaiChiTiet.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this dot khuyen mai chi tiet.
	*
	* @return the user name of this dot khuyen mai chi tiet
	*/
	@Override
	public java.lang.String getUserName() {
		return _dotKhuyenMaiChiTiet.getUserName();
	}

	/**
	* Sets the user name of this dot khuyen mai chi tiet.
	*
	* @param userName the user name of this dot khuyen mai chi tiet
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_dotKhuyenMaiChiTiet.setUserName(userName);
	}

	/**
	* Returns the create date of this dot khuyen mai chi tiet.
	*
	* @return the create date of this dot khuyen mai chi tiet
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _dotKhuyenMaiChiTiet.getCreateDate();
	}

	/**
	* Sets the create date of this dot khuyen mai chi tiet.
	*
	* @param createDate the create date of this dot khuyen mai chi tiet
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_dotKhuyenMaiChiTiet.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this dot khuyen mai chi tiet.
	*
	* @return the modified date of this dot khuyen mai chi tiet
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _dotKhuyenMaiChiTiet.getModifiedDate();
	}

	/**
	* Sets the modified date of this dot khuyen mai chi tiet.
	*
	* @param modifiedDate the modified date of this dot khuyen mai chi tiet
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_dotKhuyenMaiChiTiet.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the dot khuyen mai ID of this dot khuyen mai chi tiet.
	*
	* @return the dot khuyen mai ID of this dot khuyen mai chi tiet
	*/
	@Override
	public long getDotKhuyenMaiId() {
		return _dotKhuyenMaiChiTiet.getDotKhuyenMaiId();
	}

	/**
	* Sets the dot khuyen mai ID of this dot khuyen mai chi tiet.
	*
	* @param dotKhuyenMaiId the dot khuyen mai ID of this dot khuyen mai chi tiet
	*/
	@Override
	public void setDotKhuyenMaiId(long dotKhuyenMaiId) {
		_dotKhuyenMaiChiTiet.setDotKhuyenMaiId(dotKhuyenMaiId);
	}

	/**
	* Returns the nhom mat hang ID of this dot khuyen mai chi tiet.
	*
	* @return the nhom mat hang ID of this dot khuyen mai chi tiet
	*/
	@Override
	public long getNhomMatHangId() {
		return _dotKhuyenMaiChiTiet.getNhomMatHangId();
	}

	/**
	* Sets the nhom mat hang ID of this dot khuyen mai chi tiet.
	*
	* @param nhomMatHangId the nhom mat hang ID of this dot khuyen mai chi tiet
	*/
	@Override
	public void setNhomMatHangId(long nhomMatHangId) {
		_dotKhuyenMaiChiTiet.setNhomMatHangId(nhomMatHangId);
	}

	/**
	* Returns the mat hang ID of this dot khuyen mai chi tiet.
	*
	* @return the mat hang ID of this dot khuyen mai chi tiet
	*/
	@Override
	public long getMatHangId() {
		return _dotKhuyenMaiChiTiet.getMatHangId();
	}

	/**
	* Sets the mat hang ID of this dot khuyen mai chi tiet.
	*
	* @param matHangId the mat hang ID of this dot khuyen mai chi tiet
	*/
	@Override
	public void setMatHangId(long matHangId) {
		_dotKhuyenMaiChiTiet.setMatHangId(matHangId);
	}

	/**
	* Returns the mat hang tang ID of this dot khuyen mai chi tiet.
	*
	* @return the mat hang tang ID of this dot khuyen mai chi tiet
	*/
	@Override
	public long getMatHangTangId() {
		return _dotKhuyenMaiChiTiet.getMatHangTangId();
	}

	/**
	* Sets the mat hang tang ID of this dot khuyen mai chi tiet.
	*
	* @param matHangTangId the mat hang tang ID of this dot khuyen mai chi tiet
	*/
	@Override
	public void setMatHangTangId(long matHangTangId) {
		_dotKhuyenMaiChiTiet.setMatHangTangId(matHangTangId);
	}

	/**
	* Returns the ti le giam gia of this dot khuyen mai chi tiet.
	*
	* @return the ti le giam gia of this dot khuyen mai chi tiet
	*/
	@Override
	public double getTiLeGiamGia() {
		return _dotKhuyenMaiChiTiet.getTiLeGiamGia();
	}

	/**
	* Sets the ti le giam gia of this dot khuyen mai chi tiet.
	*
	* @param tiLeGiamGia the ti le giam gia of this dot khuyen mai chi tiet
	*/
	@Override
	public void setTiLeGiamGia(double tiLeGiamGia) {
		_dotKhuyenMaiChiTiet.setTiLeGiamGia(tiLeGiamGia);
	}

	/**
	* Returns the gia tri don hang of this dot khuyen mai chi tiet.
	*
	* @return the gia tri don hang of this dot khuyen mai chi tiet
	*/
	@Override
	public double getGiaTriDonHang() {
		return _dotKhuyenMaiChiTiet.getGiaTriDonHang();
	}

	/**
	* Sets the gia tri don hang of this dot khuyen mai chi tiet.
	*
	* @param giaTriDonHang the gia tri don hang of this dot khuyen mai chi tiet
	*/
	@Override
	public void setGiaTriDonHang(double giaTriDonHang) {
		_dotKhuyenMaiChiTiet.setGiaTriDonHang(giaTriDonHang);
	}

	/**
	* Returns the so luong mua of this dot khuyen mai chi tiet.
	*
	* @return the so luong mua of this dot khuyen mai chi tiet
	*/
	@Override
	public int getSoLuongMua() {
		return _dotKhuyenMaiChiTiet.getSoLuongMua();
	}

	/**
	* Sets the so luong mua of this dot khuyen mai chi tiet.
	*
	* @param soLuongMua the so luong mua of this dot khuyen mai chi tiet
	*/
	@Override
	public void setSoLuongMua(int soLuongMua) {
		_dotKhuyenMaiChiTiet.setSoLuongMua(soLuongMua);
	}

	/**
	* Returns the so luong tang of this dot khuyen mai chi tiet.
	*
	* @return the so luong tang of this dot khuyen mai chi tiet
	*/
	@Override
	public int getSoLuongTang() {
		return _dotKhuyenMaiChiTiet.getSoLuongTang();
	}

	/**
	* Sets the so luong tang of this dot khuyen mai chi tiet.
	*
	* @param soLuongTang the so luong tang of this dot khuyen mai chi tiet
	*/
	@Override
	public void setSoLuongTang(int soLuongTang) {
		_dotKhuyenMaiChiTiet.setSoLuongTang(soLuongTang);
	}

	/**
	* Returns the gia ban of this dot khuyen mai chi tiet.
	*
	* @return the gia ban of this dot khuyen mai chi tiet
	*/
	@Override
	public int getGiaBan() {
		return _dotKhuyenMaiChiTiet.getGiaBan();
	}

	/**
	* Sets the gia ban of this dot khuyen mai chi tiet.
	*
	* @param giaBan the gia ban of this dot khuyen mai chi tiet
	*/
	@Override
	public void setGiaBan(int giaBan) {
		_dotKhuyenMaiChiTiet.setGiaBan(giaBan);
	}

	@Override
	public boolean isNew() {
		return _dotKhuyenMaiChiTiet.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_dotKhuyenMaiChiTiet.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _dotKhuyenMaiChiTiet.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dotKhuyenMaiChiTiet.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _dotKhuyenMaiChiTiet.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _dotKhuyenMaiChiTiet.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_dotKhuyenMaiChiTiet.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _dotKhuyenMaiChiTiet.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_dotKhuyenMaiChiTiet.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_dotKhuyenMaiChiTiet.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_dotKhuyenMaiChiTiet.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DotKhuyenMaiChiTietWrapper((DotKhuyenMaiChiTiet)_dotKhuyenMaiChiTiet.clone());
	}

	@Override
	public int compareTo(
		com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet) {
		return _dotKhuyenMaiChiTiet.compareTo(dotKhuyenMaiChiTiet);
	}

	@Override
	public int hashCode() {
		return _dotKhuyenMaiChiTiet.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet> toCacheModel() {
		return _dotKhuyenMaiChiTiet.toCacheModel();
	}

	@Override
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet toEscapedModel() {
		return new DotKhuyenMaiChiTietWrapper(_dotKhuyenMaiChiTiet.toEscapedModel());
	}

	@Override
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet toUnescapedModel() {
		return new DotKhuyenMaiChiTietWrapper(_dotKhuyenMaiChiTiet.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _dotKhuyenMaiChiTiet.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dotKhuyenMaiChiTiet.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_dotKhuyenMaiChiTiet.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DotKhuyenMaiChiTietWrapper)) {
			return false;
		}

		DotKhuyenMaiChiTietWrapper dotKhuyenMaiChiTietWrapper = (DotKhuyenMaiChiTietWrapper)obj;

		if (Validator.equals(_dotKhuyenMaiChiTiet,
					dotKhuyenMaiChiTietWrapper._dotKhuyenMaiChiTiet)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DotKhuyenMaiChiTiet getWrappedDotKhuyenMaiChiTiet() {
		return _dotKhuyenMaiChiTiet;
	}

	@Override
	public DotKhuyenMaiChiTiet getWrappedModel() {
		return _dotKhuyenMaiChiTiet;
	}

	@Override
	public void resetOriginalValues() {
		_dotKhuyenMaiChiTiet.resetOriginalValues();
	}

	private DotKhuyenMaiChiTiet _dotKhuyenMaiChiTiet;
}