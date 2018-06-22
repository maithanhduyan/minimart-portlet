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

package com.minimart.portlet.thethanhtoan.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.minimart.portlet.thethanhtoan.service.http.TheTraTruocServiceSoap}.
 *
 * @author Mai Thành Duy An
 * @see com.minimart.portlet.thethanhtoan.service.http.TheTraTruocServiceSoap
 * @generated
 */
public class TheTraTruocSoap implements Serializable {
	public static TheTraTruocSoap toSoapModel(TheTraTruoc model) {
		TheTraTruocSoap soapModel = new TheTraTruocSoap();

		soapModel.setTheTraTruocId(model.getTheTraTruocId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTenThe(model.getTenThe());
		soapModel.setNhomTheTraTruocId(model.getNhomTheTraTruocId());
		soapModel.setKhoa(model.getKhoa());
		soapModel.setNgayHetHan(model.getNgayHetHan());
		soapModel.setTrangThai(model.getTrangThai());
		soapModel.setUserModifiledId(model.getUserModifiledId());

		return soapModel;
	}

	public static TheTraTruocSoap[] toSoapModels(TheTraTruoc[] models) {
		TheTraTruocSoap[] soapModels = new TheTraTruocSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TheTraTruocSoap[][] toSoapModels(TheTraTruoc[][] models) {
		TheTraTruocSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TheTraTruocSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TheTraTruocSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TheTraTruocSoap[] toSoapModels(List<TheTraTruoc> models) {
		List<TheTraTruocSoap> soapModels = new ArrayList<TheTraTruocSoap>(models.size());

		for (TheTraTruoc model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TheTraTruocSoap[soapModels.size()]);
	}

	public TheTraTruocSoap() {
	}

	public long getPrimaryKey() {
		return _theTraTruocId;
	}

	public void setPrimaryKey(long pk) {
		setTheTraTruocId(pk);
	}

	public long getTheTraTruocId() {
		return _theTraTruocId;
	}

	public void setTheTraTruocId(long theTraTruocId) {
		_theTraTruocId = theTraTruocId;
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

	public String getTenThe() {
		return _tenThe;
	}

	public void setTenThe(String tenThe) {
		_tenThe = tenThe;
	}

	public long getNhomTheTraTruocId() {
		return _nhomTheTraTruocId;
	}

	public void setNhomTheTraTruocId(long nhomTheTraTruocId) {
		_nhomTheTraTruocId = nhomTheTraTruocId;
	}

	public boolean getKhoa() {
		return _khoa;
	}

	public boolean isKhoa() {
		return _khoa;
	}

	public void setKhoa(boolean khoa) {
		_khoa = khoa;
	}

	public Date getNgayHetHan() {
		return _ngayHetHan;
	}

	public void setNgayHetHan(Date ngayHetHan) {
		_ngayHetHan = ngayHetHan;
	}

	public String getTrangThai() {
		return _trangThai;
	}

	public void setTrangThai(String trangThai) {
		_trangThai = trangThai;
	}

	public long getUserModifiledId() {
		return _userModifiledId;
	}

	public void setUserModifiledId(long userModifiledId) {
		_userModifiledId = userModifiledId;
	}

	private long _theTraTruocId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _tenThe;
	private long _nhomTheTraTruocId;
	private boolean _khoa;
	private Date _ngayHetHan;
	private String _trangThai;
	private long _userModifiledId;
}