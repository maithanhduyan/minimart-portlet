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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.minimart.portlet.banhang.service.http.DonHangServiceSoap}.
 *
 * @author Mai Thành Duy An
 * @see com.minimart.portlet.banhang.service.http.DonHangServiceSoap
 * @generated
 */
public class DonHangSoap implements Serializable {
	public static DonHangSoap toSoapModel(DonHang model) {
		DonHangSoap soapModel = new DonHangSoap();

		soapModel.setDonHangId(model.getDonHangId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCuaHangId(model.getCuaHangId());
		soapModel.setKhachHangId(model.getKhachHangId());
		soapModel.setHoatDong(model.getHoatDong());
		soapModel.setTongCong(model.getTongCong());
		soapModel.setDaThanhToan(model.getDaThanhToan());
		soapModel.setPhiVanChuyen(model.getPhiVanChuyen());
		soapModel.setTrangThaiDonHangId(model.getTrangThaiDonHangId());
		soapModel.setNgayThanhToan(model.getNgayThanhToan());
		soapModel.setKhachDua(model.getKhachDua());
		soapModel.setTraLai(model.getTraLai());
		soapModel.setThueVAT(model.getThueVAT());
		soapModel.setDiemTichLuy(model.getDiemTichLuy());
		soapModel.setThanhToanTienMat(model.getThanhToanTienMat());
		soapModel.setThanhToanThe(model.getThanhToanThe());
		soapModel.setThanhToanChuyenKhoan(model.getThanhToanChuyenKhoan());
		soapModel.setPhieuGiamGiaId(model.getPhieuGiamGiaId());
		soapModel.setTruTichLuy(model.getTruTichLuy());
		soapModel.setInHoaDonLan(model.getInHoaDonLan());
		soapModel.setMaDonHang(model.getMaDonHang());

		return soapModel;
	}

	public static DonHangSoap[] toSoapModels(DonHang[] models) {
		DonHangSoap[] soapModels = new DonHangSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DonHangSoap[][] toSoapModels(DonHang[][] models) {
		DonHangSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DonHangSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DonHangSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DonHangSoap[] toSoapModels(List<DonHang> models) {
		List<DonHangSoap> soapModels = new ArrayList<DonHangSoap>(models.size());

		for (DonHang model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DonHangSoap[soapModels.size()]);
	}

	public DonHangSoap() {
	}

	public long getPrimaryKey() {
		return _donHangId;
	}

	public void setPrimaryKey(long pk) {
		setDonHangId(pk);
	}

	public long getDonHangId() {
		return _donHangId;
	}

	public void setDonHangId(long donHangId) {
		_donHangId = donHangId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getCuaHangId() {
		return _cuaHangId;
	}

	public void setCuaHangId(long cuaHangId) {
		_cuaHangId = cuaHangId;
	}

	public long getKhachHangId() {
		return _khachHangId;
	}

	public void setKhachHangId(long khachHangId) {
		_khachHangId = khachHangId;
	}

	public boolean getHoatDong() {
		return _hoatDong;
	}

	public boolean isHoatDong() {
		return _hoatDong;
	}

	public void setHoatDong(boolean hoatDong) {
		_hoatDong = hoatDong;
	}

	public int getTongCong() {
		return _tongCong;
	}

	public void setTongCong(int tongCong) {
		_tongCong = tongCong;
	}

	public boolean getDaThanhToan() {
		return _daThanhToan;
	}

	public boolean isDaThanhToan() {
		return _daThanhToan;
	}

	public void setDaThanhToan(boolean daThanhToan) {
		_daThanhToan = daThanhToan;
	}

	public int getPhiVanChuyen() {
		return _phiVanChuyen;
	}

	public void setPhiVanChuyen(int phiVanChuyen) {
		_phiVanChuyen = phiVanChuyen;
	}

	public long getTrangThaiDonHangId() {
		return _trangThaiDonHangId;
	}

	public void setTrangThaiDonHangId(long trangThaiDonHangId) {
		_trangThaiDonHangId = trangThaiDonHangId;
	}

	public Date getNgayThanhToan() {
		return _ngayThanhToan;
	}

	public void setNgayThanhToan(Date ngayThanhToan) {
		_ngayThanhToan = ngayThanhToan;
	}

	public int getKhachDua() {
		return _khachDua;
	}

	public void setKhachDua(int khachDua) {
		_khachDua = khachDua;
	}

	public int getTraLai() {
		return _traLai;
	}

	public void setTraLai(int traLai) {
		_traLai = traLai;
	}

	public int getThueVAT() {
		return _thueVAT;
	}

	public void setThueVAT(int thueVAT) {
		_thueVAT = thueVAT;
	}

	public int getDiemTichLuy() {
		return _diemTichLuy;
	}

	public void setDiemTichLuy(int diemTichLuy) {
		_diemTichLuy = diemTichLuy;
	}

	public int getThanhToanTienMat() {
		return _thanhToanTienMat;
	}

	public void setThanhToanTienMat(int thanhToanTienMat) {
		_thanhToanTienMat = thanhToanTienMat;
	}

	public int getThanhToanThe() {
		return _thanhToanThe;
	}

	public void setThanhToanThe(int thanhToanThe) {
		_thanhToanThe = thanhToanThe;
	}

	public int getThanhToanChuyenKhoan() {
		return _thanhToanChuyenKhoan;
	}

	public void setThanhToanChuyenKhoan(int thanhToanChuyenKhoan) {
		_thanhToanChuyenKhoan = thanhToanChuyenKhoan;
	}

	public long getPhieuGiamGiaId() {
		return _phieuGiamGiaId;
	}

	public void setPhieuGiamGiaId(long phieuGiamGiaId) {
		_phieuGiamGiaId = phieuGiamGiaId;
	}

	public int getTruTichLuy() {
		return _truTichLuy;
	}

	public void setTruTichLuy(int truTichLuy) {
		_truTichLuy = truTichLuy;
	}

	public int getInHoaDonLan() {
		return _inHoaDonLan;
	}

	public void setInHoaDonLan(int inHoaDonLan) {
		_inHoaDonLan = inHoaDonLan;
	}

	public String getMaDonHang() {
		return _maDonHang;
	}

	public void setMaDonHang(String maDonHang) {
		_maDonHang = maDonHang;
	}

	private long _donHangId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _cuaHangId;
	private long _khachHangId;
	private boolean _hoatDong;
	private int _tongCong;
	private boolean _daThanhToan;
	private int _phiVanChuyen;
	private long _trangThaiDonHangId;
	private Date _ngayThanhToan;
	private int _khachDua;
	private int _traLai;
	private int _thueVAT;
	private int _diemTichLuy;
	private int _thanhToanTienMat;
	private int _thanhToanThe;
	private int _thanhToanChuyenKhoan;
	private long _phieuGiamGiaId;
	private int _truTichLuy;
	private int _inHoaDonLan;
	private String _maDonHang;
}