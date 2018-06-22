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

package com.minimart.portlet.khohang.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.minimart.portlet.khohang.service.http.KhoHangServiceSoap}.
 *
 * @author Mai Thành Duy An
 * @see com.minimart.portlet.khohang.service.http.KhoHangServiceSoap
 * @generated
 */
public class KhoHangSoap implements Serializable {
	public static KhoHangSoap toSoapModel(KhoHang model) {
		KhoHangSoap soapModel = new KhoHangSoap();

		soapModel.setKhoHangId(model.getKhoHangId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTen(model.getTen());
		soapModel.setTrangThai(model.getTrangThai());
		soapModel.setItemType(model.getItemType());
		soapModel.setChoPhepNhapKho(model.getChoPhepNhapKho());
		soapModel.setCuaHangId(model.getCuaHangId());
		soapModel.setAutoId(model.getAutoId());
		soapModel.setSigmaId(model.getSigmaId());
		soapModel.setGhiChu(model.getGhiChu());

		return soapModel;
	}

	public static KhoHangSoap[] toSoapModels(KhoHang[] models) {
		KhoHangSoap[] soapModels = new KhoHangSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static KhoHangSoap[][] toSoapModels(KhoHang[][] models) {
		KhoHangSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new KhoHangSoap[models.length][models[0].length];
		}
		else {
			soapModels = new KhoHangSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static KhoHangSoap[] toSoapModels(List<KhoHang> models) {
		List<KhoHangSoap> soapModels = new ArrayList<KhoHangSoap>(models.size());

		for (KhoHang model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new KhoHangSoap[soapModels.size()]);
	}

	public KhoHangSoap() {
	}

	public long getPrimaryKey() {
		return _khoHangId;
	}

	public void setPrimaryKey(long pk) {
		setKhoHangId(pk);
	}

	public long getKhoHangId() {
		return _khoHangId;
	}

	public void setKhoHangId(long khoHangId) {
		_khoHangId = khoHangId;
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

	public boolean getTrangThai() {
		return _trangThai;
	}

	public boolean isTrangThai() {
		return _trangThai;
	}

	public void setTrangThai(boolean trangThai) {
		_trangThai = trangThai;
	}

	public int getItemType() {
		return _itemType;
	}

	public void setItemType(int itemType) {
		_itemType = itemType;
	}

	public boolean getChoPhepNhapKho() {
		return _choPhepNhapKho;
	}

	public boolean isChoPhepNhapKho() {
		return _choPhepNhapKho;
	}

	public void setChoPhepNhapKho(boolean choPhepNhapKho) {
		_choPhepNhapKho = choPhepNhapKho;
	}

	public long getCuaHangId() {
		return _cuaHangId;
	}

	public void setCuaHangId(long cuaHangId) {
		_cuaHangId = cuaHangId;
	}

	public long getAutoId() {
		return _autoId;
	}

	public void setAutoId(long autoId) {
		_autoId = autoId;
	}

	public long getSigmaId() {
		return _sigmaId;
	}

	public void setSigmaId(long sigmaId) {
		_sigmaId = sigmaId;
	}

	public String getGhiChu() {
		return _ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;
	}

	private long _khoHangId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private boolean _trangThai;
	private int _itemType;
	private boolean _choPhepNhapKho;
	private long _cuaHangId;
	private long _autoId;
	private long _sigmaId;
	private String _ghiChu;
}