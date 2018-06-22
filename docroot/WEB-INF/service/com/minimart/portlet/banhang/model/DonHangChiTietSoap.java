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
 * This class is used by SOAP remote services, specifically {@link com.minimart.portlet.banhang.service.http.DonHangChiTietServiceSoap}.
 *
 * @author Mai Thành Duy An
 * @see com.minimart.portlet.banhang.service.http.DonHangChiTietServiceSoap
 * @generated
 */
public class DonHangChiTietSoap implements Serializable {
	public static DonHangChiTietSoap toSoapModel(DonHangChiTiet model) {
		DonHangChiTietSoap soapModel = new DonHangChiTietSoap();

		soapModel.setDonHangChiTietId(model.getDonHangChiTietId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDonHangId(model.getDonHangId());
		soapModel.setMatHangId(model.getMatHangId());
		soapModel.setSoLuong(model.getSoLuong());
		soapModel.setDonViTinhId(model.getDonViTinhId());
		soapModel.setThanhTien(model.getThanhTien());
		soapModel.setTiLeGiamGia(model.getTiLeGiamGia());
		soapModel.setKichThuoc(model.getKichThuoc());
		soapModel.setHanSuDung(model.getHanSuDung());
		soapModel.setHoatDong(model.getHoatDong());
		soapModel.setHuy(model.getHuy());

		return soapModel;
	}

	public static DonHangChiTietSoap[] toSoapModels(DonHangChiTiet[] models) {
		DonHangChiTietSoap[] soapModels = new DonHangChiTietSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DonHangChiTietSoap[][] toSoapModels(DonHangChiTiet[][] models) {
		DonHangChiTietSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DonHangChiTietSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DonHangChiTietSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DonHangChiTietSoap[] toSoapModels(List<DonHangChiTiet> models) {
		List<DonHangChiTietSoap> soapModels = new ArrayList<DonHangChiTietSoap>(models.size());

		for (DonHangChiTiet model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DonHangChiTietSoap[soapModels.size()]);
	}

	public DonHangChiTietSoap() {
	}

	public long getPrimaryKey() {
		return _donHangChiTietId;
	}

	public void setPrimaryKey(long pk) {
		setDonHangChiTietId(pk);
	}

	public long getDonHangChiTietId() {
		return _donHangChiTietId;
	}

	public void setDonHangChiTietId(long donHangChiTietId) {
		_donHangChiTietId = donHangChiTietId;
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

	public long getDonHangId() {
		return _donHangId;
	}

	public void setDonHangId(long donHangId) {
		_donHangId = donHangId;
	}

	public long getMatHangId() {
		return _matHangId;
	}

	public void setMatHangId(long matHangId) {
		_matHangId = matHangId;
	}

	public int getSoLuong() {
		return _soLuong;
	}

	public void setSoLuong(int soLuong) {
		_soLuong = soLuong;
	}

	public long getDonViTinhId() {
		return _donViTinhId;
	}

	public void setDonViTinhId(long donViTinhId) {
		_donViTinhId = donViTinhId;
	}

	public int getThanhTien() {
		return _thanhTien;
	}

	public void setThanhTien(int thanhTien) {
		_thanhTien = thanhTien;
	}

	public int getTiLeGiamGia() {
		return _tiLeGiamGia;
	}

	public void setTiLeGiamGia(int tiLeGiamGia) {
		_tiLeGiamGia = tiLeGiamGia;
	}

	public String getKichThuoc() {
		return _kichThuoc;
	}

	public void setKichThuoc(String kichThuoc) {
		_kichThuoc = kichThuoc;
	}

	public Date getHanSuDung() {
		return _hanSuDung;
	}

	public void setHanSuDung(Date hanSuDung) {
		_hanSuDung = hanSuDung;
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

	public boolean getHuy() {
		return _huy;
	}

	public boolean isHuy() {
		return _huy;
	}

	public void setHuy(boolean huy) {
		_huy = huy;
	}

	private long _donHangChiTietId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _donHangId;
	private long _matHangId;
	private int _soLuong;
	private long _donViTinhId;
	private int _thanhTien;
	private int _tiLeGiamGia;
	private String _kichThuoc;
	private Date _hanSuDung;
	private boolean _hoatDong;
	private boolean _huy;
}