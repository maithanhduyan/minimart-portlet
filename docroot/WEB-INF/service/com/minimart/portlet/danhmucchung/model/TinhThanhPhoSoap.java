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

package com.minimart.portlet.danhmucchung.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.minimart.portlet.danhmucchung.service.http.TinhThanhPhoServiceSoap}.
 *
 * @author Mai Thành Duy An
 * @see com.minimart.portlet.danhmucchung.service.http.TinhThanhPhoServiceSoap
 * @generated
 */
public class TinhThanhPhoSoap implements Serializable {
	public static TinhThanhPhoSoap toSoapModel(TinhThanhPho model) {
		TinhThanhPhoSoap soapModel = new TinhThanhPhoSoap();

		soapModel.setTinhThanhPhoId(model.getTinhThanhPhoId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTen(model.getTen());
		soapModel.setMa(model.getMa());
		soapModel.setTrangThai(model.getTrangThai());

		return soapModel;
	}

	public static TinhThanhPhoSoap[] toSoapModels(TinhThanhPho[] models) {
		TinhThanhPhoSoap[] soapModels = new TinhThanhPhoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TinhThanhPhoSoap[][] toSoapModels(TinhThanhPho[][] models) {
		TinhThanhPhoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TinhThanhPhoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TinhThanhPhoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TinhThanhPhoSoap[] toSoapModels(List<TinhThanhPho> models) {
		List<TinhThanhPhoSoap> soapModels = new ArrayList<TinhThanhPhoSoap>(models.size());

		for (TinhThanhPho model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TinhThanhPhoSoap[soapModels.size()]);
	}

	public TinhThanhPhoSoap() {
	}

	public long getPrimaryKey() {
		return _tinhThanhPhoId;
	}

	public void setPrimaryKey(long pk) {
		setTinhThanhPhoId(pk);
	}

	public long getTinhThanhPhoId() {
		return _tinhThanhPhoId;
	}

	public void setTinhThanhPhoId(long tinhThanhPhoId) {
		_tinhThanhPhoId = tinhThanhPhoId;
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

	public String getMa() {
		return _ma;
	}

	public void setMa(String ma) {
		_ma = ma;
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

	private long _tinhThanhPhoId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private String _ma;
	private boolean _trangThai;
}