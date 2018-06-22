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
 * This class is a wrapper for {@link DonHang}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see DonHang
 * @generated
 */
public class DonHangWrapper implements DonHang, ModelWrapper<DonHang> {
	public DonHangWrapper(DonHang donHang) {
		_donHang = donHang;
	}

	@Override
	public Class<?> getModelClass() {
		return DonHang.class;
	}

	@Override
	public String getModelClassName() {
		return DonHang.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("donHangId", getDonHangId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("cuaHangId", getCuaHangId());
		attributes.put("khachHangId", getKhachHangId());
		attributes.put("hoatDong", getHoatDong());
		attributes.put("tongCong", getTongCong());
		attributes.put("daThanhToan", getDaThanhToan());
		attributes.put("phiVanChuyen", getPhiVanChuyen());
		attributes.put("trangThaiDonHangId", getTrangThaiDonHangId());
		attributes.put("ngayThanhToan", getNgayThanhToan());
		attributes.put("khachDua", getKhachDua());
		attributes.put("traLai", getTraLai());
		attributes.put("thueVAT", getThueVAT());
		attributes.put("diemTichLuy", getDiemTichLuy());
		attributes.put("thanhToanTienMat", getThanhToanTienMat());
		attributes.put("thanhToanThe", getThanhToanThe());
		attributes.put("thanhToanChuyenKhoan", getThanhToanChuyenKhoan());
		attributes.put("phieuGiamGiaId", getPhieuGiamGiaId());
		attributes.put("truTichLuy", getTruTichLuy());
		attributes.put("inHoaDonLan", getInHoaDonLan());
		attributes.put("maDonHang", getMaDonHang());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long donHangId = (Long)attributes.get("donHangId");

		if (donHangId != null) {
			setDonHangId(donHangId);
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

		Long cuaHangId = (Long)attributes.get("cuaHangId");

		if (cuaHangId != null) {
			setCuaHangId(cuaHangId);
		}

		Long khachHangId = (Long)attributes.get("khachHangId");

		if (khachHangId != null) {
			setKhachHangId(khachHangId);
		}

		Boolean hoatDong = (Boolean)attributes.get("hoatDong");

		if (hoatDong != null) {
			setHoatDong(hoatDong);
		}

		Integer tongCong = (Integer)attributes.get("tongCong");

		if (tongCong != null) {
			setTongCong(tongCong);
		}

		Boolean daThanhToan = (Boolean)attributes.get("daThanhToan");

		if (daThanhToan != null) {
			setDaThanhToan(daThanhToan);
		}

		Integer phiVanChuyen = (Integer)attributes.get("phiVanChuyen");

		if (phiVanChuyen != null) {
			setPhiVanChuyen(phiVanChuyen);
		}

		Long trangThaiDonHangId = (Long)attributes.get("trangThaiDonHangId");

		if (trangThaiDonHangId != null) {
			setTrangThaiDonHangId(trangThaiDonHangId);
		}

		Date ngayThanhToan = (Date)attributes.get("ngayThanhToan");

		if (ngayThanhToan != null) {
			setNgayThanhToan(ngayThanhToan);
		}

		Integer khachDua = (Integer)attributes.get("khachDua");

		if (khachDua != null) {
			setKhachDua(khachDua);
		}

		Integer traLai = (Integer)attributes.get("traLai");

		if (traLai != null) {
			setTraLai(traLai);
		}

		Integer thueVAT = (Integer)attributes.get("thueVAT");

		if (thueVAT != null) {
			setThueVAT(thueVAT);
		}

		Integer diemTichLuy = (Integer)attributes.get("diemTichLuy");

		if (diemTichLuy != null) {
			setDiemTichLuy(diemTichLuy);
		}

		Integer thanhToanTienMat = (Integer)attributes.get("thanhToanTienMat");

		if (thanhToanTienMat != null) {
			setThanhToanTienMat(thanhToanTienMat);
		}

		Integer thanhToanThe = (Integer)attributes.get("thanhToanThe");

		if (thanhToanThe != null) {
			setThanhToanThe(thanhToanThe);
		}

		Integer thanhToanChuyenKhoan = (Integer)attributes.get(
				"thanhToanChuyenKhoan");

		if (thanhToanChuyenKhoan != null) {
			setThanhToanChuyenKhoan(thanhToanChuyenKhoan);
		}

		Long phieuGiamGiaId = (Long)attributes.get("phieuGiamGiaId");

		if (phieuGiamGiaId != null) {
			setPhieuGiamGiaId(phieuGiamGiaId);
		}

		Integer truTichLuy = (Integer)attributes.get("truTichLuy");

		if (truTichLuy != null) {
			setTruTichLuy(truTichLuy);
		}

		Integer inHoaDonLan = (Integer)attributes.get("inHoaDonLan");

		if (inHoaDonLan != null) {
			setInHoaDonLan(inHoaDonLan);
		}

		String maDonHang = (String)attributes.get("maDonHang");

		if (maDonHang != null) {
			setMaDonHang(maDonHang);
		}
	}

	/**
	* Returns the primary key of this don hang.
	*
	* @return the primary key of this don hang
	*/
	@Override
	public long getPrimaryKey() {
		return _donHang.getPrimaryKey();
	}

	/**
	* Sets the primary key of this don hang.
	*
	* @param primaryKey the primary key of this don hang
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_donHang.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the don hang ID of this don hang.
	*
	* @return the don hang ID of this don hang
	*/
	@Override
	public long getDonHangId() {
		return _donHang.getDonHangId();
	}

	/**
	* Sets the don hang ID of this don hang.
	*
	* @param donHangId the don hang ID of this don hang
	*/
	@Override
	public void setDonHangId(long donHangId) {
		_donHang.setDonHangId(donHangId);
	}

	/**
	* Returns the company ID of this don hang.
	*
	* @return the company ID of this don hang
	*/
	@Override
	public long getCompanyId() {
		return _donHang.getCompanyId();
	}

	/**
	* Sets the company ID of this don hang.
	*
	* @param companyId the company ID of this don hang
	*/
	@Override
	public void setCompanyId(long companyId) {
		_donHang.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this don hang.
	*
	* @return the user ID of this don hang
	*/
	@Override
	public long getUserId() {
		return _donHang.getUserId();
	}

	/**
	* Sets the user ID of this don hang.
	*
	* @param userId the user ID of this don hang
	*/
	@Override
	public void setUserId(long userId) {
		_donHang.setUserId(userId);
	}

	/**
	* Returns the user uuid of this don hang.
	*
	* @return the user uuid of this don hang
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _donHang.getUserUuid();
	}

	/**
	* Sets the user uuid of this don hang.
	*
	* @param userUuid the user uuid of this don hang
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_donHang.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this don hang.
	*
	* @return the user name of this don hang
	*/
	@Override
	public java.lang.String getUserName() {
		return _donHang.getUserName();
	}

	/**
	* Sets the user name of this don hang.
	*
	* @param userName the user name of this don hang
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_donHang.setUserName(userName);
	}

	/**
	* Returns the create date of this don hang.
	*
	* @return the create date of this don hang
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _donHang.getCreateDate();
	}

	/**
	* Sets the create date of this don hang.
	*
	* @param createDate the create date of this don hang
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_donHang.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this don hang.
	*
	* @return the modified date of this don hang
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _donHang.getModifiedDate();
	}

	/**
	* Sets the modified date of this don hang.
	*
	* @param modifiedDate the modified date of this don hang
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_donHang.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the cua hang ID of this don hang.
	*
	* @return the cua hang ID of this don hang
	*/
	@Override
	public long getCuaHangId() {
		return _donHang.getCuaHangId();
	}

	/**
	* Sets the cua hang ID of this don hang.
	*
	* @param cuaHangId the cua hang ID of this don hang
	*/
	@Override
	public void setCuaHangId(long cuaHangId) {
		_donHang.setCuaHangId(cuaHangId);
	}

	/**
	* Returns the khach hang ID of this don hang.
	*
	* @return the khach hang ID of this don hang
	*/
	@Override
	public long getKhachHangId() {
		return _donHang.getKhachHangId();
	}

	/**
	* Sets the khach hang ID of this don hang.
	*
	* @param khachHangId the khach hang ID of this don hang
	*/
	@Override
	public void setKhachHangId(long khachHangId) {
		_donHang.setKhachHangId(khachHangId);
	}

	/**
	* Returns the hoat dong of this don hang.
	*
	* @return the hoat dong of this don hang
	*/
	@Override
	public boolean getHoatDong() {
		return _donHang.getHoatDong();
	}

	/**
	* Returns <code>true</code> if this don hang is hoat dong.
	*
	* @return <code>true</code> if this don hang is hoat dong; <code>false</code> otherwise
	*/
	@Override
	public boolean isHoatDong() {
		return _donHang.isHoatDong();
	}

	/**
	* Sets whether this don hang is hoat dong.
	*
	* @param hoatDong the hoat dong of this don hang
	*/
	@Override
	public void setHoatDong(boolean hoatDong) {
		_donHang.setHoatDong(hoatDong);
	}

	/**
	* Returns the tong cong of this don hang.
	*
	* @return the tong cong of this don hang
	*/
	@Override
	public int getTongCong() {
		return _donHang.getTongCong();
	}

	/**
	* Sets the tong cong of this don hang.
	*
	* @param tongCong the tong cong of this don hang
	*/
	@Override
	public void setTongCong(int tongCong) {
		_donHang.setTongCong(tongCong);
	}

	/**
	* Returns the da thanh toan of this don hang.
	*
	* @return the da thanh toan of this don hang
	*/
	@Override
	public boolean getDaThanhToan() {
		return _donHang.getDaThanhToan();
	}

	/**
	* Returns <code>true</code> if this don hang is da thanh toan.
	*
	* @return <code>true</code> if this don hang is da thanh toan; <code>false</code> otherwise
	*/
	@Override
	public boolean isDaThanhToan() {
		return _donHang.isDaThanhToan();
	}

	/**
	* Sets whether this don hang is da thanh toan.
	*
	* @param daThanhToan the da thanh toan of this don hang
	*/
	@Override
	public void setDaThanhToan(boolean daThanhToan) {
		_donHang.setDaThanhToan(daThanhToan);
	}

	/**
	* Returns the phi van chuyen of this don hang.
	*
	* @return the phi van chuyen of this don hang
	*/
	@Override
	public int getPhiVanChuyen() {
		return _donHang.getPhiVanChuyen();
	}

	/**
	* Sets the phi van chuyen of this don hang.
	*
	* @param phiVanChuyen the phi van chuyen of this don hang
	*/
	@Override
	public void setPhiVanChuyen(int phiVanChuyen) {
		_donHang.setPhiVanChuyen(phiVanChuyen);
	}

	/**
	* Returns the trang thai don hang ID of this don hang.
	*
	* @return the trang thai don hang ID of this don hang
	*/
	@Override
	public long getTrangThaiDonHangId() {
		return _donHang.getTrangThaiDonHangId();
	}

	/**
	* Sets the trang thai don hang ID of this don hang.
	*
	* @param trangThaiDonHangId the trang thai don hang ID of this don hang
	*/
	@Override
	public void setTrangThaiDonHangId(long trangThaiDonHangId) {
		_donHang.setTrangThaiDonHangId(trangThaiDonHangId);
	}

	/**
	* Returns the ngay thanh toan of this don hang.
	*
	* @return the ngay thanh toan of this don hang
	*/
	@Override
	public java.util.Date getNgayThanhToan() {
		return _donHang.getNgayThanhToan();
	}

	/**
	* Sets the ngay thanh toan of this don hang.
	*
	* @param ngayThanhToan the ngay thanh toan of this don hang
	*/
	@Override
	public void setNgayThanhToan(java.util.Date ngayThanhToan) {
		_donHang.setNgayThanhToan(ngayThanhToan);
	}

	/**
	* Returns the khach dua of this don hang.
	*
	* @return the khach dua of this don hang
	*/
	@Override
	public int getKhachDua() {
		return _donHang.getKhachDua();
	}

	/**
	* Sets the khach dua of this don hang.
	*
	* @param khachDua the khach dua of this don hang
	*/
	@Override
	public void setKhachDua(int khachDua) {
		_donHang.setKhachDua(khachDua);
	}

	/**
	* Returns the tra lai of this don hang.
	*
	* @return the tra lai of this don hang
	*/
	@Override
	public int getTraLai() {
		return _donHang.getTraLai();
	}

	/**
	* Sets the tra lai of this don hang.
	*
	* @param traLai the tra lai of this don hang
	*/
	@Override
	public void setTraLai(int traLai) {
		_donHang.setTraLai(traLai);
	}

	/**
	* Returns the thue v a t of this don hang.
	*
	* @return the thue v a t of this don hang
	*/
	@Override
	public int getThueVAT() {
		return _donHang.getThueVAT();
	}

	/**
	* Sets the thue v a t of this don hang.
	*
	* @param thueVAT the thue v a t of this don hang
	*/
	@Override
	public void setThueVAT(int thueVAT) {
		_donHang.setThueVAT(thueVAT);
	}

	/**
	* Returns the diem tich luy of this don hang.
	*
	* @return the diem tich luy of this don hang
	*/
	@Override
	public int getDiemTichLuy() {
		return _donHang.getDiemTichLuy();
	}

	/**
	* Sets the diem tich luy of this don hang.
	*
	* @param diemTichLuy the diem tich luy of this don hang
	*/
	@Override
	public void setDiemTichLuy(int diemTichLuy) {
		_donHang.setDiemTichLuy(diemTichLuy);
	}

	/**
	* Returns the thanh toan tien mat of this don hang.
	*
	* @return the thanh toan tien mat of this don hang
	*/
	@Override
	public int getThanhToanTienMat() {
		return _donHang.getThanhToanTienMat();
	}

	/**
	* Sets the thanh toan tien mat of this don hang.
	*
	* @param thanhToanTienMat the thanh toan tien mat of this don hang
	*/
	@Override
	public void setThanhToanTienMat(int thanhToanTienMat) {
		_donHang.setThanhToanTienMat(thanhToanTienMat);
	}

	/**
	* Returns the thanh toan the of this don hang.
	*
	* @return the thanh toan the of this don hang
	*/
	@Override
	public int getThanhToanThe() {
		return _donHang.getThanhToanThe();
	}

	/**
	* Sets the thanh toan the of this don hang.
	*
	* @param thanhToanThe the thanh toan the of this don hang
	*/
	@Override
	public void setThanhToanThe(int thanhToanThe) {
		_donHang.setThanhToanThe(thanhToanThe);
	}

	/**
	* Returns the thanh toan chuyen khoan of this don hang.
	*
	* @return the thanh toan chuyen khoan of this don hang
	*/
	@Override
	public int getThanhToanChuyenKhoan() {
		return _donHang.getThanhToanChuyenKhoan();
	}

	/**
	* Sets the thanh toan chuyen khoan of this don hang.
	*
	* @param thanhToanChuyenKhoan the thanh toan chuyen khoan of this don hang
	*/
	@Override
	public void setThanhToanChuyenKhoan(int thanhToanChuyenKhoan) {
		_donHang.setThanhToanChuyenKhoan(thanhToanChuyenKhoan);
	}

	/**
	* Returns the phieu giam gia ID of this don hang.
	*
	* @return the phieu giam gia ID of this don hang
	*/
	@Override
	public long getPhieuGiamGiaId() {
		return _donHang.getPhieuGiamGiaId();
	}

	/**
	* Sets the phieu giam gia ID of this don hang.
	*
	* @param phieuGiamGiaId the phieu giam gia ID of this don hang
	*/
	@Override
	public void setPhieuGiamGiaId(long phieuGiamGiaId) {
		_donHang.setPhieuGiamGiaId(phieuGiamGiaId);
	}

	/**
	* Returns the tru tich luy of this don hang.
	*
	* @return the tru tich luy of this don hang
	*/
	@Override
	public int getTruTichLuy() {
		return _donHang.getTruTichLuy();
	}

	/**
	* Sets the tru tich luy of this don hang.
	*
	* @param truTichLuy the tru tich luy of this don hang
	*/
	@Override
	public void setTruTichLuy(int truTichLuy) {
		_donHang.setTruTichLuy(truTichLuy);
	}

	/**
	* Returns the in hoa don lan of this don hang.
	*
	* @return the in hoa don lan of this don hang
	*/
	@Override
	public int getInHoaDonLan() {
		return _donHang.getInHoaDonLan();
	}

	/**
	* Sets the in hoa don lan of this don hang.
	*
	* @param inHoaDonLan the in hoa don lan of this don hang
	*/
	@Override
	public void setInHoaDonLan(int inHoaDonLan) {
		_donHang.setInHoaDonLan(inHoaDonLan);
	}

	/**
	* Returns the ma don hang of this don hang.
	*
	* @return the ma don hang of this don hang
	*/
	@Override
	public java.lang.String getMaDonHang() {
		return _donHang.getMaDonHang();
	}

	/**
	* Sets the ma don hang of this don hang.
	*
	* @param maDonHang the ma don hang of this don hang
	*/
	@Override
	public void setMaDonHang(java.lang.String maDonHang) {
		_donHang.setMaDonHang(maDonHang);
	}

	@Override
	public boolean isNew() {
		return _donHang.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_donHang.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _donHang.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_donHang.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _donHang.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _donHang.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_donHang.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _donHang.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_donHang.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_donHang.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_donHang.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DonHangWrapper((DonHang)_donHang.clone());
	}

	@Override
	public int compareTo(com.minimart.portlet.banhang.model.DonHang donHang) {
		return _donHang.compareTo(donHang);
	}

	@Override
	public int hashCode() {
		return _donHang.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.minimart.portlet.banhang.model.DonHang> toCacheModel() {
		return _donHang.toCacheModel();
	}

	@Override
	public com.minimart.portlet.banhang.model.DonHang toEscapedModel() {
		return new DonHangWrapper(_donHang.toEscapedModel());
	}

	@Override
	public com.minimart.portlet.banhang.model.DonHang toUnescapedModel() {
		return new DonHangWrapper(_donHang.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _donHang.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _donHang.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_donHang.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DonHangWrapper)) {
			return false;
		}

		DonHangWrapper donHangWrapper = (DonHangWrapper)obj;

		if (Validator.equals(_donHang, donHangWrapper._donHang)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public DonHang getWrappedDonHang() {
		return _donHang;
	}

	@Override
	public DonHang getWrappedModel() {
		return _donHang;
	}

	@Override
	public void resetOriginalValues() {
		_donHang.resetOriginalValues();
	}

	private DonHang _donHang;
}