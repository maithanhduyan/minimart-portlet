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

package com.minimart.portlet.cuahang.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.minimart.portlet.cuahang.service.http.CuaHangServiceSoap}.
 *
 * @author Mai Thành Duy An
 * @see com.minimart.portlet.cuahang.service.http.CuaHangServiceSoap
 * @generated
 */
public class CuaHangSoap implements Serializable {
	public static CuaHangSoap toSoapModel(CuaHang model) {
		CuaHangSoap soapModel = new CuaHangSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setCuaHangId(model.getCuaHangId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTen(model.getTen());
		soapModel.setGioMoCua(model.getGioMoCua());
		soapModel.setGioDongCua(model.getGioDongCua());
		soapModel.setHoatDong(model.getHoatDong());
		soapModel.setUuTien(model.getUuTien());
		soapModel.setDiaChi(model.getDiaChi());
		soapModel.setDienThoai(model.getDienThoai());
		soapModel.setKhoHangId(model.getKhoHangId());

		return soapModel;
	}

	public static CuaHangSoap[] toSoapModels(CuaHang[] models) {
		CuaHangSoap[] soapModels = new CuaHangSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CuaHangSoap[][] toSoapModels(CuaHang[][] models) {
		CuaHangSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CuaHangSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CuaHangSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CuaHangSoap[] toSoapModels(List<CuaHang> models) {
		List<CuaHangSoap> soapModels = new ArrayList<CuaHangSoap>(models.size());

		for (CuaHang model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CuaHangSoap[soapModels.size()]);
	}

	public CuaHangSoap() {
	}

	public long getPrimaryKey() {
		return _cuaHangId;
	}

	public void setPrimaryKey(long pk) {
		setCuaHangId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getCuaHangId() {
		return _cuaHangId;
	}

	public void setCuaHangId(long cuaHangId) {
		_cuaHangId = cuaHangId;
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

	public Date getGioMoCua() {
		return _gioMoCua;
	}

	public void setGioMoCua(Date gioMoCua) {
		_gioMoCua = gioMoCua;
	}

	public Date getGioDongCua() {
		return _gioDongCua;
	}

	public void setGioDongCua(Date gioDongCua) {
		_gioDongCua = gioDongCua;
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

	public int getUuTien() {
		return _uuTien;
	}

	public void setUuTien(int uuTien) {
		_uuTien = uuTien;
	}

	public String getDiaChi() {
		return _diaChi;
	}

	public void setDiaChi(String diaChi) {
		_diaChi = diaChi;
	}

	public String getDienThoai() {
		return _dienThoai;
	}

	public void setDienThoai(String dienThoai) {
		_dienThoai = dienThoai;
	}

	public long getKhoHangId() {
		return _khoHangId;
	}

	public void setKhoHangId(long khoHangId) {
		_khoHangId = khoHangId;
	}

	private String _uuid;
	private long _cuaHangId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private Date _gioMoCua;
	private Date _gioDongCua;
	private boolean _hoatDong;
	private int _uuTien;
	private String _diaChi;
	private String _dienThoai;
	private long _khoHangId;
}