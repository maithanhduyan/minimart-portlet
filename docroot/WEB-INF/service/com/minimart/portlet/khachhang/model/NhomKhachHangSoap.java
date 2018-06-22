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

package com.minimart.portlet.khachhang.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.minimart.portlet.khachhang.service.http.NhomKhachHangServiceSoap}.
 *
 * @author Mai Thành Duy An
 * @see com.minimart.portlet.khachhang.service.http.NhomKhachHangServiceSoap
 * @generated
 */
public class NhomKhachHangSoap implements Serializable {
	public static NhomKhachHangSoap toSoapModel(NhomKhachHang model) {
		NhomKhachHangSoap soapModel = new NhomKhachHangSoap();

		soapModel.setNhomKhachHangId(model.getNhomKhachHangId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTen(model.getTen());
		soapModel.setHoatDong(model.getHoatDong());
		soapModel.setDiemTichLuy(model.getDiemTichLuy());
		soapModel.setTiLeGiamGia(model.getTiLeGiamGia());
		soapModel.setUuTien(model.getUuTien());
		soapModel.setImage(model.getImage());

		return soapModel;
	}

	public static NhomKhachHangSoap[] toSoapModels(NhomKhachHang[] models) {
		NhomKhachHangSoap[] soapModels = new NhomKhachHangSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static NhomKhachHangSoap[][] toSoapModels(NhomKhachHang[][] models) {
		NhomKhachHangSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new NhomKhachHangSoap[models.length][models[0].length];
		}
		else {
			soapModels = new NhomKhachHangSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static NhomKhachHangSoap[] toSoapModels(List<NhomKhachHang> models) {
		List<NhomKhachHangSoap> soapModels = new ArrayList<NhomKhachHangSoap>(models.size());

		for (NhomKhachHang model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new NhomKhachHangSoap[soapModels.size()]);
	}

	public NhomKhachHangSoap() {
	}

	public long getPrimaryKey() {
		return _nhomKhachHangId;
	}

	public void setPrimaryKey(long pk) {
		setNhomKhachHangId(pk);
	}

	public long getNhomKhachHangId() {
		return _nhomKhachHangId;
	}

	public void setNhomKhachHangId(long nhomKhachHangId) {
		_nhomKhachHangId = nhomKhachHangId;
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

	public int getDiemTichLuy() {
		return _diemTichLuy;
	}

	public void setDiemTichLuy(int diemTichLuy) {
		_diemTichLuy = diemTichLuy;
	}

	public int getTiLeGiamGia() {
		return _tiLeGiamGia;
	}

	public void setTiLeGiamGia(int tiLeGiamGia) {
		_tiLeGiamGia = tiLeGiamGia;
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

	private long _nhomKhachHangId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private boolean _hoatDong;
	private int _diemTichLuy;
	private int _tiLeGiamGia;
	private int _uuTien;
	private String _image;
}