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
 * This class is used by SOAP remote services, specifically {@link com.minimart.portlet.dathang.service.http.DatHangChiTietServiceSoap}.
 *
 * @author Mai Thành Duy An
 * @see com.minimart.portlet.dathang.service.http.DatHangChiTietServiceSoap
 * @generated
 */
public class DatHangChiTietSoap implements Serializable {
	public static DatHangChiTietSoap toSoapModel(DatHangChiTiet model) {
		DatHangChiTietSoap soapModel = new DatHangChiTietSoap();

		soapModel.setDatHangChiTietId(model.getDatHangChiTietId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setSoLuong(model.getSoLuong());
		soapModel.setDonGia(model.getDonGia());
		soapModel.setThanhTien(model.getThanhTien());
		soapModel.setTiLeGiamGia(model.getTiLeGiamGia());
		soapModel.setGhiChu(model.getGhiChu());
		soapModel.setTrangThai(model.getTrangThai());
		soapModel.setBaoHanh(model.getBaoHanh());
		soapModel.setDonViTinhId(model.getDonViTinhId());
		soapModel.setDatHangId(model.getDatHangId());
		soapModel.setMaHangId(model.getMaHangId());

		return soapModel;
	}

	public static DatHangChiTietSoap[] toSoapModels(DatHangChiTiet[] models) {
		DatHangChiTietSoap[] soapModels = new DatHangChiTietSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DatHangChiTietSoap[][] toSoapModels(DatHangChiTiet[][] models) {
		DatHangChiTietSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DatHangChiTietSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DatHangChiTietSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DatHangChiTietSoap[] toSoapModels(List<DatHangChiTiet> models) {
		List<DatHangChiTietSoap> soapModels = new ArrayList<DatHangChiTietSoap>(models.size());

		for (DatHangChiTiet model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DatHangChiTietSoap[soapModels.size()]);
	}

	public DatHangChiTietSoap() {
	}

	public long getPrimaryKey() {
		return _datHangChiTietId;
	}

	public void setPrimaryKey(long pk) {
		setDatHangChiTietId(pk);
	}

	public long getDatHangChiTietId() {
		return _datHangChiTietId;
	}

	public void setDatHangChiTietId(long datHangChiTietId) {
		_datHangChiTietId = datHangChiTietId;
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

	public int getSoLuong() {
		return _soLuong;
	}

	public void setSoLuong(int soLuong) {
		_soLuong = soLuong;
	}

	public int getDonGia() {
		return _donGia;
	}

	public void setDonGia(int donGia) {
		_donGia = donGia;
	}

	public int getThanhTien() {
		return _thanhTien;
	}

	public void setThanhTien(int thanhTien) {
		_thanhTien = thanhTien;
	}

	public double getTiLeGiamGia() {
		return _tiLeGiamGia;
	}

	public void setTiLeGiamGia(double tiLeGiamGia) {
		_tiLeGiamGia = tiLeGiamGia;
	}

	public String getGhiChu() {
		return _ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;
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

	public String getBaoHanh() {
		return _baoHanh;
	}

	public void setBaoHanh(String baoHanh) {
		_baoHanh = baoHanh;
	}

	public long getDonViTinhId() {
		return _donViTinhId;
	}

	public void setDonViTinhId(long donViTinhId) {
		_donViTinhId = donViTinhId;
	}

	public long getDatHangId() {
		return _datHangId;
	}

	public void setDatHangId(long datHangId) {
		_datHangId = datHangId;
	}

	public long getMaHangId() {
		return _maHangId;
	}

	public void setMaHangId(long maHangId) {
		_maHangId = maHangId;
	}

	private long _datHangChiTietId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _soLuong;
	private int _donGia;
	private int _thanhTien;
	private double _tiLeGiamGia;
	private String _ghiChu;
	private boolean _trangThai;
	private String _baoHanh;
	private long _donViTinhId;
	private long _datHangId;
	private long _maHangId;
}