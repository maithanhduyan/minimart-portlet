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
 * This class is used by SOAP remote services, specifically {@link com.minimart.portlet.danhmucchung.service.http.QuanHuyenServiceSoap}.
 *
 * @author Mai Thành Duy An
 * @see com.minimart.portlet.danhmucchung.service.http.QuanHuyenServiceSoap
 * @generated
 */
public class QuanHuyenSoap implements Serializable {
	public static QuanHuyenSoap toSoapModel(QuanHuyen model) {
		QuanHuyenSoap soapModel = new QuanHuyenSoap();

		soapModel.setQuanHuyenId(model.getQuanHuyenId());
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

	public static QuanHuyenSoap[] toSoapModels(QuanHuyen[] models) {
		QuanHuyenSoap[] soapModels = new QuanHuyenSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static QuanHuyenSoap[][] toSoapModels(QuanHuyen[][] models) {
		QuanHuyenSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new QuanHuyenSoap[models.length][models[0].length];
		}
		else {
			soapModels = new QuanHuyenSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static QuanHuyenSoap[] toSoapModels(List<QuanHuyen> models) {
		List<QuanHuyenSoap> soapModels = new ArrayList<QuanHuyenSoap>(models.size());

		for (QuanHuyen model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new QuanHuyenSoap[soapModels.size()]);
	}

	public QuanHuyenSoap() {
	}

	public long getPrimaryKey() {
		return _quanHuyenId;
	}

	public void setPrimaryKey(long pk) {
		setQuanHuyenId(pk);
	}

	public long getQuanHuyenId() {
		return _quanHuyenId;
	}

	public void setQuanHuyenId(long quanHuyenId) {
		_quanHuyenId = quanHuyenId;
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

	private long _quanHuyenId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private String _ma;
	private boolean _trangThai;
}