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
 * This class is used by SOAP remote services, specifically {@link com.minimart.portlet.banhang.service.http.TrangThaiDonHangServiceSoap}.
 *
 * @author Mai Thành Duy An
 * @see com.minimart.portlet.banhang.service.http.TrangThaiDonHangServiceSoap
 * @generated
 */
public class TrangThaiDonHangSoap implements Serializable {
	public static TrangThaiDonHangSoap toSoapModel(TrangThaiDonHang model) {
		TrangThaiDonHangSoap soapModel = new TrangThaiDonHangSoap();

		soapModel.setTrangThaiDonHangId(model.getTrangThaiDonHangId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTen(model.getTen());
		soapModel.setHoatDong(model.getHoatDong());
		soapModel.setGhiChu(model.getGhiChu());

		return soapModel;
	}

	public static TrangThaiDonHangSoap[] toSoapModels(TrangThaiDonHang[] models) {
		TrangThaiDonHangSoap[] soapModels = new TrangThaiDonHangSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TrangThaiDonHangSoap[][] toSoapModels(
		TrangThaiDonHang[][] models) {
		TrangThaiDonHangSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TrangThaiDonHangSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TrangThaiDonHangSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TrangThaiDonHangSoap[] toSoapModels(
		List<TrangThaiDonHang> models) {
		List<TrangThaiDonHangSoap> soapModels = new ArrayList<TrangThaiDonHangSoap>(models.size());

		for (TrangThaiDonHang model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TrangThaiDonHangSoap[soapModels.size()]);
	}

	public TrangThaiDonHangSoap() {
	}

	public long getPrimaryKey() {
		return _trangThaiDonHangId;
	}

	public void setPrimaryKey(long pk) {
		setTrangThaiDonHangId(pk);
	}

	public long getTrangThaiDonHangId() {
		return _trangThaiDonHangId;
	}

	public void setTrangThaiDonHangId(long trangThaiDonHangId) {
		_trangThaiDonHangId = trangThaiDonHangId;
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

	public boolean getHoatDong() {
		return _hoatDong;
	}

	public boolean isHoatDong() {
		return _hoatDong;
	}

	public void setHoatDong(boolean hoatDong) {
		_hoatDong = hoatDong;
	}

	public String getGhiChu() {
		return _ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;
	}

	private long _trangThaiDonHangId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private boolean _hoatDong;
	private String _ghiChu;
}