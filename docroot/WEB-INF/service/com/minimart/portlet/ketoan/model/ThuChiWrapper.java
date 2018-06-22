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
 * This class is a wrapper for {@link ThuChi}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see ThuChi
 * @generated
 */
public class ThuChiWrapper implements ThuChi, ModelWrapper<ThuChi> {
	public ThuChiWrapper(ThuChi thuChi) {
		_thuChi = thuChi;
	}

	@Override
	public Class<?> getModelClass() {
		return ThuChi.class;
	}

	@Override
	public String getModelClassName() {
		return ThuChi.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("thuChiId", getThuChiId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("tenDoiTuong", getTenDoiTuong());
		attributes.put("diaChiId", getDiaChiId());
		attributes.put("loai", getLoai());
		attributes.put("loaiDoiTuong", getLoaiDoiTuong());
		attributes.put("thu", getThu());
		attributes.put("chi", getChi());
		attributes.put("nhaCungCapId", getNhaCungCapId());
		attributes.put("khachHangId", getKhachHangId());
		attributes.put("nhanVienId", getNhanVienId());
		attributes.put("theTraTruocId", getTheTraTruocId());
		attributes.put("taiKhoanNganHangId", getTaiKhoanNganHangId());
		attributes.put("datHangId", getDatHangId());
		attributes.put("bangLuongId", getBangLuongId());
		attributes.put("lyDoThuChi", getLyDoThuChi());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long thuChiId = (Long)attributes.get("thuChiId");

		if (thuChiId != null) {
			setThuChiId(thuChiId);
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

		String tenDoiTuong = (String)attributes.get("tenDoiTuong");

		if (tenDoiTuong != null) {
			setTenDoiTuong(tenDoiTuong);
		}

		Long diaChiId = (Long)attributes.get("diaChiId");

		if (diaChiId != null) {
			setDiaChiId(diaChiId);
		}

		Integer loai = (Integer)attributes.get("loai");

		if (loai != null) {
			setLoai(loai);
		}

		Integer loaiDoiTuong = (Integer)attributes.get("loaiDoiTuong");

		if (loaiDoiTuong != null) {
			setLoaiDoiTuong(loaiDoiTuong);
		}

		Integer thu = (Integer)attributes.get("thu");

		if (thu != null) {
			setThu(thu);
		}

		Integer chi = (Integer)attributes.get("chi");

		if (chi != null) {
			setChi(chi);
		}

		Long nhaCungCapId = (Long)attributes.get("nhaCungCapId");

		if (nhaCungCapId != null) {
			setNhaCungCapId(nhaCungCapId);
		}

		Long khachHangId = (Long)attributes.get("khachHangId");

		if (khachHangId != null) {
			setKhachHangId(khachHangId);
		}

		Long nhanVienId = (Long)attributes.get("nhanVienId");

		if (nhanVienId != null) {
			setNhanVienId(nhanVienId);
		}

		Long theTraTruocId = (Long)attributes.get("theTraTruocId");

		if (theTraTruocId != null) {
			setTheTraTruocId(theTraTruocId);
		}

		Long taiKhoanNganHangId = (Long)attributes.get("taiKhoanNganHangId");

		if (taiKhoanNganHangId != null) {
			setTaiKhoanNganHangId(taiKhoanNganHangId);
		}

		Long datHangId = (Long)attributes.get("datHangId");

		if (datHangId != null) {
			setDatHangId(datHangId);
		}

		Long bangLuongId = (Long)attributes.get("bangLuongId");

		if (bangLuongId != null) {
			setBangLuongId(bangLuongId);
		}

		String lyDoThuChi = (String)attributes.get("lyDoThuChi");

		if (lyDoThuChi != null) {
			setLyDoThuChi(lyDoThuChi);
		}
	}

	/**
	* Returns the primary key of this thu chi.
	*
	* @return the primary key of this thu chi
	*/
	@Override
	public long getPrimaryKey() {
		return _thuChi.getPrimaryKey();
	}

	/**
	* Sets the primary key of this thu chi.
	*
	* @param primaryKey the primary key of this thu chi
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_thuChi.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the thu chi ID of this thu chi.
	*
	* @return the thu chi ID of this thu chi
	*/
	@Override
	public long getThuChiId() {
		return _thuChi.getThuChiId();
	}

	/**
	* Sets the thu chi ID of this thu chi.
	*
	* @param thuChiId the thu chi ID of this thu chi
	*/
	@Override
	public void setThuChiId(long thuChiId) {
		_thuChi.setThuChiId(thuChiId);
	}

	/**
	* Returns the company ID of this thu chi.
	*
	* @return the company ID of this thu chi
	*/
	@Override
	public long getCompanyId() {
		return _thuChi.getCompanyId();
	}

	/**
	* Sets the company ID of this thu chi.
	*
	* @param companyId the company ID of this thu chi
	*/
	@Override
	public void setCompanyId(long companyId) {
		_thuChi.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this thu chi.
	*
	* @return the user ID of this thu chi
	*/
	@Override
	public long getUserId() {
		return _thuChi.getUserId();
	}

	/**
	* Sets the user ID of this thu chi.
	*
	* @param userId the user ID of this thu chi
	*/
	@Override
	public void setUserId(long userId) {
		_thuChi.setUserId(userId);
	}

	/**
	* Returns the user uuid of this thu chi.
	*
	* @return the user uuid of this thu chi
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thuChi.getUserUuid();
	}

	/**
	* Sets the user uuid of this thu chi.
	*
	* @param userUuid the user uuid of this thu chi
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_thuChi.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this thu chi.
	*
	* @return the user name of this thu chi
	*/
	@Override
	public java.lang.String getUserName() {
		return _thuChi.getUserName();
	}

	/**
	* Sets the user name of this thu chi.
	*
	* @param userName the user name of this thu chi
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_thuChi.setUserName(userName);
	}

	/**
	* Returns the create date of this thu chi.
	*
	* @return the create date of this thu chi
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _thuChi.getCreateDate();
	}

	/**
	* Sets the create date of this thu chi.
	*
	* @param createDate the create date of this thu chi
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_thuChi.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this thu chi.
	*
	* @return the modified date of this thu chi
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _thuChi.getModifiedDate();
	}

	/**
	* Sets the modified date of this thu chi.
	*
	* @param modifiedDate the modified date of this thu chi
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_thuChi.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the ten of this thu chi.
	*
	* @return the ten of this thu chi
	*/
	@Override
	public java.lang.String getTen() {
		return _thuChi.getTen();
	}

	/**
	* Sets the ten of this thu chi.
	*
	* @param ten the ten of this thu chi
	*/
	@Override
	public void setTen(java.lang.String ten) {
		_thuChi.setTen(ten);
	}

	/**
	* Returns the ten doi tuong of this thu chi.
	*
	* @return the ten doi tuong of this thu chi
	*/
	@Override
	public java.lang.String getTenDoiTuong() {
		return _thuChi.getTenDoiTuong();
	}

	/**
	* Sets the ten doi tuong of this thu chi.
	*
	* @param tenDoiTuong the ten doi tuong of this thu chi
	*/
	@Override
	public void setTenDoiTuong(java.lang.String tenDoiTuong) {
		_thuChi.setTenDoiTuong(tenDoiTuong);
	}

	/**
	* Returns the dia chi ID of this thu chi.
	*
	* @return the dia chi ID of this thu chi
	*/
	@Override
	public long getDiaChiId() {
		return _thuChi.getDiaChiId();
	}

	/**
	* Sets the dia chi ID of this thu chi.
	*
	* @param diaChiId the dia chi ID of this thu chi
	*/
	@Override
	public void setDiaChiId(long diaChiId) {
		_thuChi.setDiaChiId(diaChiId);
	}

	/**
	* Returns the loai of this thu chi.
	*
	* @return the loai of this thu chi
	*/
	@Override
	public int getLoai() {
		return _thuChi.getLoai();
	}

	/**
	* Sets the loai of this thu chi.
	*
	* @param loai the loai of this thu chi
	*/
	@Override
	public void setLoai(int loai) {
		_thuChi.setLoai(loai);
	}

	/**
	* Returns the loai doi tuong of this thu chi.
	*
	* @return the loai doi tuong of this thu chi
	*/
	@Override
	public int getLoaiDoiTuong() {
		return _thuChi.getLoaiDoiTuong();
	}

	/**
	* Sets the loai doi tuong of this thu chi.
	*
	* @param loaiDoiTuong the loai doi tuong of this thu chi
	*/
	@Override
	public void setLoaiDoiTuong(int loaiDoiTuong) {
		_thuChi.setLoaiDoiTuong(loaiDoiTuong);
	}

	/**
	* Returns the thu of this thu chi.
	*
	* @return the thu of this thu chi
	*/
	@Override
	public int getThu() {
		return _thuChi.getThu();
	}

	/**
	* Sets the thu of this thu chi.
	*
	* @param thu the thu of this thu chi
	*/
	@Override
	public void setThu(int thu) {
		_thuChi.setThu(thu);
	}

	/**
	* Returns the chi of this thu chi.
	*
	* @return the chi of this thu chi
	*/
	@Override
	public int getChi() {
		return _thuChi.getChi();
	}

	/**
	* Sets the chi of this thu chi.
	*
	* @param chi the chi of this thu chi
	*/
	@Override
	public void setChi(int chi) {
		_thuChi.setChi(chi);
	}

	/**
	* Returns the nha cung cap ID of this thu chi.
	*
	* @return the nha cung cap ID of this thu chi
	*/
	@Override
	public long getNhaCungCapId() {
		return _thuChi.getNhaCungCapId();
	}

	/**
	* Sets the nha cung cap ID of this thu chi.
	*
	* @param nhaCungCapId the nha cung cap ID of this thu chi
	*/
	@Override
	public void setNhaCungCapId(long nhaCungCapId) {
		_thuChi.setNhaCungCapId(nhaCungCapId);
	}

	/**
	* Returns the khach hang ID of this thu chi.
	*
	* @return the khach hang ID of this thu chi
	*/
	@Override
	public long getKhachHangId() {
		return _thuChi.getKhachHangId();
	}

	/**
	* Sets the khach hang ID of this thu chi.
	*
	* @param khachHangId the khach hang ID of this thu chi
	*/
	@Override
	public void setKhachHangId(long khachHangId) {
		_thuChi.setKhachHangId(khachHangId);
	}

	/**
	* Returns the nhan vien ID of this thu chi.
	*
	* @return the nhan vien ID of this thu chi
	*/
	@Override
	public long getNhanVienId() {
		return _thuChi.getNhanVienId();
	}

	/**
	* Sets the nhan vien ID of this thu chi.
	*
	* @param nhanVienId the nhan vien ID of this thu chi
	*/
	@Override
	public void setNhanVienId(long nhanVienId) {
		_thuChi.setNhanVienId(nhanVienId);
	}

	/**
	* Returns the the tra truoc ID of this thu chi.
	*
	* @return the the tra truoc ID of this thu chi
	*/
	@Override
	public long getTheTraTruocId() {
		return _thuChi.getTheTraTruocId();
	}

	/**
	* Sets the the tra truoc ID of this thu chi.
	*
	* @param theTraTruocId the the tra truoc ID of this thu chi
	*/
	@Override
	public void setTheTraTruocId(long theTraTruocId) {
		_thuChi.setTheTraTruocId(theTraTruocId);
	}

	/**
	* Returns the tai khoan ngan hang ID of this thu chi.
	*
	* @return the tai khoan ngan hang ID of this thu chi
	*/
	@Override
	public long getTaiKhoanNganHangId() {
		return _thuChi.getTaiKhoanNganHangId();
	}

	/**
	* Sets the tai khoan ngan hang ID of this thu chi.
	*
	* @param taiKhoanNganHangId the tai khoan ngan hang ID of this thu chi
	*/
	@Override
	public void setTaiKhoanNganHangId(long taiKhoanNganHangId) {
		_thuChi.setTaiKhoanNganHangId(taiKhoanNganHangId);
	}

	/**
	* Returns the dat hang ID of this thu chi.
	*
	* @return the dat hang ID of this thu chi
	*/
	@Override
	public long getDatHangId() {
		return _thuChi.getDatHangId();
	}

	/**
	* Sets the dat hang ID of this thu chi.
	*
	* @param datHangId the dat hang ID of this thu chi
	*/
	@Override
	public void setDatHangId(long datHangId) {
		_thuChi.setDatHangId(datHangId);
	}

	/**
	* Returns the bang luong ID of this thu chi.
	*
	* @return the bang luong ID of this thu chi
	*/
	@Override
	public long getBangLuongId() {
		return _thuChi.getBangLuongId();
	}

	/**
	* Sets the bang luong ID of this thu chi.
	*
	* @param bangLuongId the bang luong ID of this thu chi
	*/
	@Override
	public void setBangLuongId(long bangLuongId) {
		_thuChi.setBangLuongId(bangLuongId);
	}

	/**
	* Returns the ly do thu chi of this thu chi.
	*
	* @return the ly do thu chi of this thu chi
	*/
	@Override
	public java.lang.String getLyDoThuChi() {
		return _thuChi.getLyDoThuChi();
	}

	/**
	* Sets the ly do thu chi of this thu chi.
	*
	* @param lyDoThuChi the ly do thu chi of this thu chi
	*/
	@Override
	public void setLyDoThuChi(java.lang.String lyDoThuChi) {
		_thuChi.setLyDoThuChi(lyDoThuChi);
	}

	@Override
	public boolean isNew() {
		return _thuChi.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_thuChi.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _thuChi.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_thuChi.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _thuChi.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _thuChi.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_thuChi.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _thuChi.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_thuChi.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_thuChi.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_thuChi.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ThuChiWrapper((ThuChi)_thuChi.clone());
	}

	@Override
	public int compareTo(com.minimart.portlet.ketoan.model.ThuChi thuChi) {
		return _thuChi.compareTo(thuChi);
	}

	@Override
	public int hashCode() {
		return _thuChi.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.minimart.portlet.ketoan.model.ThuChi> toCacheModel() {
		return _thuChi.toCacheModel();
	}

	@Override
	public com.minimart.portlet.ketoan.model.ThuChi toEscapedModel() {
		return new ThuChiWrapper(_thuChi.toEscapedModel());
	}

	@Override
	public com.minimart.portlet.ketoan.model.ThuChi toUnescapedModel() {
		return new ThuChiWrapper(_thuChi.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _thuChi.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _thuChi.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_thuChi.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ThuChiWrapper)) {
			return false;
		}

		ThuChiWrapper thuChiWrapper = (ThuChiWrapper)obj;

		if (Validator.equals(_thuChi, thuChiWrapper._thuChi)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ThuChi getWrappedThuChi() {
		return _thuChi;
	}

	@Override
	public ThuChi getWrappedModel() {
		return _thuChi;
	}

	@Override
	public void resetOriginalValues() {
		_thuChi.resetOriginalValues();
	}

	private ThuChi _thuChi;
}