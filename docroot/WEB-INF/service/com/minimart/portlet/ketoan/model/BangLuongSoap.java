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

package com.minimart.portlet.ketoan.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.minimart.portlet.ketoan.service.http.BangLuongServiceSoap}.
 *
 * @author Mai Thành Duy An
 * @see com.minimart.portlet.ketoan.service.http.BangLuongServiceSoap
 * @generated
 */
public class BangLuongSoap implements Serializable {
	public static BangLuongSoap toSoapModel(BangLuong model) {
		BangLuongSoap soapModel = new BangLuongSoap();

		soapModel.setBanLuongId(model.getBanLuongId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTen(model.getTen());
		soapModel.setTrangThai(model.getTrangThai());
		soapModel.setThang(model.getThang());
		soapModel.setNam(model.getNam());
		soapModel.setNgay(model.getNgay());
		soapModel.setChiTiet(model.getChiTiet());
		soapModel.setGhiChu(model.getGhiChu());

		return soapModel;
	}

	public static BangLuongSoap[] toSoapModels(BangLuong[] models) {
		BangLuongSoap[] soapModels = new BangLuongSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BangLuongSoap[][] toSoapModels(BangLuong[][] models) {
		BangLuongSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BangLuongSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BangLuongSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BangLuongSoap[] toSoapModels(List<BangLuong> models) {
		List<BangLuongSoap> soapModels = new ArrayList<BangLuongSoap>(models.size());

		for (BangLuong model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BangLuongSoap[soapModels.size()]);
	}

	public BangLuongSoap() {
	}

	public long getPrimaryKey() {
		return _banLuongId;
	}

	public void setPrimaryKey(long pk) {
		setBanLuongId(pk);
	}

	public long getBanLuongId() {
		return _banLuongId;
	}

	public void setBanLuongId(long banLuongId) {
		_banLuongId = banLuongId;
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

	public int getThang() {
		return _thang;
	}

	public void setThang(int thang) {
		_thang = thang;
	}

	public int getNam() {
		return _nam;
	}

	public void setNam(int nam) {
		_nam = nam;
	}

	public Date getNgay() {
		return _ngay;
	}

	public void setNgay(Date ngay) {
		_ngay = ngay;
	}

	public String getChiTiet() {
		return _chiTiet;
	}

	public void setChiTiet(String chiTiet) {
		_chiTiet = chiTiet;
	}

	public String getGhiChu() {
		return _ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;
	}

	private long _banLuongId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private boolean _trangThai;
	private int _thang;
	private int _nam;
	private Date _ngay;
	private String _chiTiet;
	private String _ghiChu;
}