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
 * This class is used by SOAP remote services, specifically {@link com.minimart.portlet.nhacungcap.service.http.NhaCungCapServiceSoap}.
 *
 * @author Mai Thành Duy An
 * @see com.minimart.portlet.nhacungcap.service.http.NhaCungCapServiceSoap
 * @generated
 */
public class NhaCungCapSoap implements Serializable {
	public static NhaCungCapSoap toSoapModel(NhaCungCap model) {
		NhaCungCapSoap soapModel = new NhaCungCapSoap();

		soapModel.setNhaCungCapId(model.getNhaCungCapId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTenNhaCungCap(model.getTenNhaCungCap());
		soapModel.setNhomNhaCungCapId(model.getNhomNhaCungCapId());
		soapModel.setMaNhaCungCap(model.getMaNhaCungCap());
		soapModel.setDiaChi(model.getDiaChi());
		soapModel.setDienThoai(model.getDienThoai());
		soapModel.setEmail(model.getEmail());
		soapModel.setWebsite(model.getWebsite());
		soapModel.setGhiChu(model.getGhiChu());
		soapModel.setHoatDong(model.getHoatDong());
		soapModel.setDoUuTien(model.getDoUuTien());
		soapModel.setLogoURL(model.getLogoURL());

		return soapModel;
	}

	public static NhaCungCapSoap[] toSoapModels(NhaCungCap[] models) {
		NhaCungCapSoap[] soapModels = new NhaCungCapSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static NhaCungCapSoap[][] toSoapModels(NhaCungCap[][] models) {
		NhaCungCapSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new NhaCungCapSoap[models.length][models[0].length];
		}
		else {
			soapModels = new NhaCungCapSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static NhaCungCapSoap[] toSoapModels(List<NhaCungCap> models) {
		List<NhaCungCapSoap> soapModels = new ArrayList<NhaCungCapSoap>(models.size());

		for (NhaCungCap model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new NhaCungCapSoap[soapModels.size()]);
	}

	public NhaCungCapSoap() {
	}

	public long getPrimaryKey() {
		return _nhaCungCapId;
	}

	public void setPrimaryKey(long pk) {
		setNhaCungCapId(pk);
	}

	public long getNhaCungCapId() {
		return _nhaCungCapId;
	}

	public void setNhaCungCapId(long nhaCungCapId) {
		_nhaCungCapId = nhaCungCapId;
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

	public String getTenNhaCungCap() {
		return _tenNhaCungCap;
	}

	public void setTenNhaCungCap(String tenNhaCungCap) {
		_tenNhaCungCap = tenNhaCungCap;
	}

	public long getNhomNhaCungCapId() {
		return _nhomNhaCungCapId;
	}

	public void setNhomNhaCungCapId(long nhomNhaCungCapId) {
		_nhomNhaCungCapId = nhomNhaCungCapId;
	}

	public String getMaNhaCungCap() {
		return _maNhaCungCap;
	}

	public void setMaNhaCungCap(String maNhaCungCap) {
		_maNhaCungCap = maNhaCungCap;
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

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getWebsite() {
		return _website;
	}

	public void setWebsite(String website) {
		_website = website;
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

	public int getDoUuTien() {
		return _doUuTien;
	}

	public void setDoUuTien(int doUuTien) {
		_doUuTien = doUuTien;
	}

	public String getLogoURL() {
		return _logoURL;
	}

	public void setLogoURL(String logoURL) {
		_logoURL = logoURL;
	}

	private long _nhaCungCapId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _tenNhaCungCap;
	private long _nhomNhaCungCapId;
	private String _maNhaCungCap;
	private String _diaChi;
	private String _dienThoai;
	private String _email;
	private String _website;
	private String _ghiChu;
	private boolean _hoatDong;
	private int _doUuTien;
	private String _logoURL;
}