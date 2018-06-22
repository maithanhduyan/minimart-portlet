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
 * This class is used by SOAP remote services, specifically {@link com.minimart.portlet.cuahang.service.http.CaLamViecServiceSoap}.
 *
 * @author Mai Thành Duy An
 * @see com.minimart.portlet.cuahang.service.http.CaLamViecServiceSoap
 * @generated
 */
public class CaLamViecSoap implements Serializable {
	public static CaLamViecSoap toSoapModel(CaLamViec model) {
		CaLamViecSoap soapModel = new CaLamViecSoap();

		soapModel.setCaLamViecId(model.getCaLamViecId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTen(model.getTen());
		soapModel.setCuaHangId(model.getCuaHangId());
		soapModel.setGioVaoLam(model.getGioVaoLam());
		soapModel.setGioRaVe(model.getGioRaVe());
		soapModel.setGioNghiGiuaCaTu(model.getGioNghiGiuaCaTu());
		soapModel.setGioNghiGiuaCaDen(model.getGioNghiGiuaCaDen());
		soapModel.setTiLeLuong(model.getTiLeLuong());
		soapModel.setHoatDong(model.getHoatDong());

		return soapModel;
	}

	public static CaLamViecSoap[] toSoapModels(CaLamViec[] models) {
		CaLamViecSoap[] soapModels = new CaLamViecSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CaLamViecSoap[][] toSoapModels(CaLamViec[][] models) {
		CaLamViecSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CaLamViecSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CaLamViecSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CaLamViecSoap[] toSoapModels(List<CaLamViec> models) {
		List<CaLamViecSoap> soapModels = new ArrayList<CaLamViecSoap>(models.size());

		for (CaLamViec model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CaLamViecSoap[soapModels.size()]);
	}

	public CaLamViecSoap() {
	}

	public long getPrimaryKey() {
		return _caLamViecId;
	}

	public void setPrimaryKey(long pk) {
		setCaLamViecId(pk);
	}

	public long getCaLamViecId() {
		return _caLamViecId;
	}

	public void setCaLamViecId(long caLamViecId) {
		_caLamViecId = caLamViecId;
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

	public long getCuaHangId() {
		return _cuaHangId;
	}

	public void setCuaHangId(long cuaHangId) {
		_cuaHangId = cuaHangId;
	}

	public Date getGioVaoLam() {
		return _gioVaoLam;
	}

	public void setGioVaoLam(Date gioVaoLam) {
		_gioVaoLam = gioVaoLam;
	}

	public Date getGioRaVe() {
		return _gioRaVe;
	}

	public void setGioRaVe(Date gioRaVe) {
		_gioRaVe = gioRaVe;
	}

	public Date getGioNghiGiuaCaTu() {
		return _gioNghiGiuaCaTu;
	}

	public void setGioNghiGiuaCaTu(Date gioNghiGiuaCaTu) {
		_gioNghiGiuaCaTu = gioNghiGiuaCaTu;
	}

	public Date getGioNghiGiuaCaDen() {
		return _gioNghiGiuaCaDen;
	}

	public void setGioNghiGiuaCaDen(Date gioNghiGiuaCaDen) {
		_gioNghiGiuaCaDen = gioNghiGiuaCaDen;
	}

	public int getTiLeLuong() {
		return _tiLeLuong;
	}

	public void setTiLeLuong(int tiLeLuong) {
		_tiLeLuong = tiLeLuong;
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

	private long _caLamViecId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private long _cuaHangId;
	private Date _gioVaoLam;
	private Date _gioRaVe;
	private Date _gioNghiGiuaCaTu;
	private Date _gioNghiGiuaCaDen;
	private int _tiLeLuong;
	private boolean _hoatDong;
}