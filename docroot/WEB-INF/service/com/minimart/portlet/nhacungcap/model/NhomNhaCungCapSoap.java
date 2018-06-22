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

package com.minimart.portlet.nhacungcap.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.minimart.portlet.nhacungcap.service.http.NhomNhaCungCapServiceSoap}.
 *
 * @author Mai Thành Duy An
 * @see com.minimart.portlet.nhacungcap.service.http.NhomNhaCungCapServiceSoap
 * @generated
 */
public class NhomNhaCungCapSoap implements Serializable {
	public static NhomNhaCungCapSoap toSoapModel(NhomNhaCungCap model) {
		NhomNhaCungCapSoap soapModel = new NhomNhaCungCapSoap();

		soapModel.setNhomNhaCungCapId(model.getNhomNhaCungCapId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTen(model.getTen());
		soapModel.setGhiChu(model.getGhiChu());
		soapModel.setHoatDong(model.getHoatDong());
		soapModel.setUuTien(model.getUuTien());
		soapModel.setImage(model.getImage());

		return soapModel;
	}

	public static NhomNhaCungCapSoap[] toSoapModels(NhomNhaCungCap[] models) {
		NhomNhaCungCapSoap[] soapModels = new NhomNhaCungCapSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static NhomNhaCungCapSoap[][] toSoapModels(NhomNhaCungCap[][] models) {
		NhomNhaCungCapSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new NhomNhaCungCapSoap[models.length][models[0].length];
		}
		else {
			soapModels = new NhomNhaCungCapSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static NhomNhaCungCapSoap[] toSoapModels(List<NhomNhaCungCap> models) {
		List<NhomNhaCungCapSoap> soapModels = new ArrayList<NhomNhaCungCapSoap>(models.size());

		for (NhomNhaCungCap model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new NhomNhaCungCapSoap[soapModels.size()]);
	}

	public NhomNhaCungCapSoap() {
	}

	public long getPrimaryKey() {
		return _nhomNhaCungCapId;
	}

	public void setPrimaryKey(long pk) {
		setNhomNhaCungCapId(pk);
	}

	public long getNhomNhaCungCapId() {
		return _nhomNhaCungCapId;
	}

	public void setNhomNhaCungCapId(long nhomNhaCungCapId) {
		_nhomNhaCungCapId = nhomNhaCungCapId;
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

	public String getGhiChu() {
		return _ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;
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

	public String getImage() {
		return _image;
	}

	public void setImage(String image) {
		_image = image;
	}

	private long _nhomNhaCungCapId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private String _ghiChu;
	private boolean _hoatDong;
	private int _uuTien;
	private String _image;
}