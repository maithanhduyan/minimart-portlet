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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.minimart.portlet.dathang.service.http.DatHangServiceSoap}.
 *
 * @author Mai Thành Duy An
 * @see com.minimart.portlet.dathang.service.http.DatHangServiceSoap
 * @generated
 */
public class DatHangSoap implements Serializable {
	public static DatHangSoap toSoapModel(DatHang model) {
		DatHangSoap soapModel = new DatHangSoap();

		soapModel.setDatHangId(model.getDatHangId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTen(model.getTen());
		soapModel.setKhachHangId(model.getKhachHangId());
		soapModel.setDiaChiId(model.getDiaChiId());
		soapModel.setTienHang(model.getTienHang());
		soapModel.setTiLeThue(model.getTiLeThue());
		soapModel.setTiLeGiamGia(model.getTiLeGiamGia());
		soapModel.setTienGiamGia(model.getTienGiamGia());
		soapModel.setPhiVanChuyen(model.getPhiVanChuyen());
		soapModel.setTongCong(model.getTongCong());
		soapModel.setLoai(model.getLoai());
		soapModel.setGiamTheoTien(model.getGiamTheoTien());
		soapModel.setTrangThai(model.getTrangThai());
		soapModel.setUserModifiedId(model.getUserModifiedId());
		soapModel.setTimeModified(model.getTimeModified());
		soapModel.setUserCreateId(model.getUserCreateId());
		soapModel.setLoaiGia(model.getLoaiGia());
		soapModel.setHoatDong(model.getHoatDong());

		return soapModel;
	}

	public static DatHangSoap[] toSoapModels(DatHang[] models) {
		DatHangSoap[] soapModels = new DatHangSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DatHangSoap[][] toSoapModels(DatHang[][] models) {
		DatHangSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DatHangSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DatHangSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DatHangSoap[] toSoapModels(List<DatHang> models) {
		List<DatHangSoap> soapModels = new ArrayList<DatHangSoap>(models.size());

		for (DatHang model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DatHangSoap[soapModels.size()]);
	}

	public DatHangSoap() {
	}

	public long getPrimaryKey() {
		return _datHangId;
	}

	public void setPrimaryKey(long pk) {
		setDatHangId(pk);
	}

	public long getDatHangId() {
		return _datHangId;
	}

	public void setDatHangId(long datHangId) {
		_datHangId = datHangId;
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

	public String getTen() {
		return _ten;
	}

	public void setTen(String ten) {
		_ten = ten;
	}

	public long getKhachHangId() {
		return _khachHangId;
	}

	public void setKhachHangId(long khachHangId) {
		_khachHangId = khachHangId;
	}

	public long getDiaChiId() {
		return _diaChiId;
	}

	public void setDiaChiId(long diaChiId) {
		_diaChiId = diaChiId;
	}

	public int getTienHang() {
		return _tienHang;
	}

	public void setTienHang(int tienHang) {
		_tienHang = tienHang;
	}

	public double getTiLeThue() {
		return _tiLeThue;
	}

	public void setTiLeThue(double tiLeThue) {
		_tiLeThue = tiLeThue;
	}

	public double getTiLeGiamGia() {
		return _tiLeGiamGia;
	}

	public void setTiLeGiamGia(double tiLeGiamGia) {
		_tiLeGiamGia = tiLeGiamGia;
	}

	public int getTienGiamGia() {
		return _tienGiamGia;
	}

	public void setTienGiamGia(int tienGiamGia) {
		_tienGiamGia = tienGiamGia;
	}

	public int getPhiVanChuyen() {
		return _phiVanChuyen;
	}

	public void setPhiVanChuyen(int phiVanChuyen) {
		_phiVanChuyen = phiVanChuyen;
	}

	public int getTongCong() {
		return _tongCong;
	}

	public void setTongCong(int tongCong) {
		_tongCong = tongCong;
	}

	public int getLoai() {
		return _loai;
	}

	public void setLoai(int loai) {
		_loai = loai;
	}

	public int getGiamTheoTien() {
		return _giamTheoTien;
	}

	public void setGiamTheoTien(int giamTheoTien) {
		_giamTheoTien = giamTheoTien;
	}

	public boolean getTrangThai() {
		return _trangThai;
	}

	public boolean isTrangThai() {
		return _trangThai;
	}

	public void setTrangThai(boolean trangThai) {
		_trangThai = trangThai;
	}

	public long getUserModifiedId() {
		return _userModifiedId;
	}

	public void setUserModifiedId(long userModifiedId) {
		_userModifiedId = userModifiedId;
	}

	public Date getTimeModified() {
		return _timeModified;
	}

	public void setTimeModified(Date timeModified) {
		_timeModified = timeModified;
	}

	public long getUserCreateId() {
		return _userCreateId;
	}

	public void setUserCreateId(long userCreateId) {
		_userCreateId = userCreateId;
	}

	public int getLoaiGia() {
		return _loaiGia;
	}

	public void setLoaiGia(int loaiGia) {
		_loaiGia = loaiGia;
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

	private long _datHangId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private long _khachHangId;
	private long _diaChiId;
	private int _tienHang;
	private double _tiLeThue;
	private double _tiLeGiamGia;
	private int _tienGiamGia;
	private int _phiVanChuyen;
	private int _tongCong;
	private int _loai;
	private int _giamTheoTien;
	private boolean _trangThai;
	private long _userModifiedId;
	private Date _timeModified;
	private long _userCreateId;
	private int _loaiGia;
	private boolean _hoatDong;
}