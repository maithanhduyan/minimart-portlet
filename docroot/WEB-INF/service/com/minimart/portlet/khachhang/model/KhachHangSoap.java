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
 * This class is used by SOAP remote services, specifically {@link com.minimart.portlet.khachhang.service.http.KhachHangServiceSoap}.
 *
 * @author Mai Thành Duy An
 * @see com.minimart.portlet.khachhang.service.http.KhachHangServiceSoap
 * @generated
 */
public class KhachHangSoap implements Serializable {
	public static KhachHangSoap toSoapModel(KhachHang model) {
		KhachHangSoap soapModel = new KhachHangSoap();

		soapModel.setKhachHangId(model.getKhachHangId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTen(model.getTen());
		soapModel.setNhomKhachHangId(model.getNhomKhachHangId());
		soapModel.setMa(model.getMa());
		soapModel.setDiaChi(model.getDiaChi());
		soapModel.setDienThoai(model.getDienThoai());
		soapModel.setEmail(model.getEmail());
		soapModel.setFacebook(model.getFacebook());
		soapModel.setTwitter(model.getTwitter());
		soapModel.setSocialMedia1(model.getSocialMedia1());
		soapModel.setSocialMedia2(model.getSocialMedia2());
		soapModel.setSocialMedia3(model.getSocialMedia3());
		soapModel.setTrangThai(model.getTrangThai());
		soapModel.setDiemTichLuy(model.getDiemTichLuy());
		soapModel.setMaSoThue(model.getMaSoThue());
		soapModel.setHoatDong(model.getHoatDong());
		soapModel.setNgaySinh(model.getNgaySinh());

		return soapModel;
	}

	public static KhachHangSoap[] toSoapModels(KhachHang[] models) {
		KhachHangSoap[] soapModels = new KhachHangSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static KhachHangSoap[][] toSoapModels(KhachHang[][] models) {
		KhachHangSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new KhachHangSoap[models.length][models[0].length];
		}
		else {
			soapModels = new KhachHangSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static KhachHangSoap[] toSoapModels(List<KhachHang> models) {
		List<KhachHangSoap> soapModels = new ArrayList<KhachHangSoap>(models.size());

		for (KhachHang model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new KhachHangSoap[soapModels.size()]);
	}

	public KhachHangSoap() {
	}

	public long getPrimaryKey() {
		return _khachHangId;
	}

	public void setPrimaryKey(long pk) {
		setKhachHangId(pk);
	}

	public long getKhachHangId() {
		return _khachHangId;
	}

	public void setKhachHangId(long khachHangId) {
		_khachHangId = khachHangId;
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

	public long getNhomKhachHangId() {
		return _nhomKhachHangId;
	}

	public void setNhomKhachHangId(long nhomKhachHangId) {
		_nhomKhachHangId = nhomKhachHangId;
	}

	public String getMa() {
		return _ma;
	}

	public void setMa(String ma) {
		_ma = ma;
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

	public String getFacebook() {
		return _facebook;
	}

	public void setFacebook(String facebook) {
		_facebook = facebook;
	}

	public String getTwitter() {
		return _twitter;
	}

	public void setTwitter(String twitter) {
		_twitter = twitter;
	}

	public String getSocialMedia1() {
		return _socialMedia1;
	}

	public void setSocialMedia1(String socialMedia1) {
		_socialMedia1 = socialMedia1;
	}

	public String getSocialMedia2() {
		return _socialMedia2;
	}

	public void setSocialMedia2(String socialMedia2) {
		_socialMedia2 = socialMedia2;
	}

	public String getSocialMedia3() {
		return _socialMedia3;
	}

	public void setSocialMedia3(String socialMedia3) {
		_socialMedia3 = socialMedia3;
	}

	public int getTrangThai() {
		return _trangThai;
	}

	public void setTrangThai(int trangThai) {
		_trangThai = trangThai;
	}

	public int getDiemTichLuy() {
		return _diemTichLuy;
	}

	public void setDiemTichLuy(int diemTichLuy) {
		_diemTichLuy = diemTichLuy;
	}

	public String getMaSoThue() {
		return _maSoThue;
	}

	public void setMaSoThue(String maSoThue) {
		_maSoThue = maSoThue;
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

	public Date getNgaySinh() {
		return _ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		_ngaySinh = ngaySinh;
	}

	private long _khachHangId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private long _nhomKhachHangId;
	private String _ma;
	private String _diaChi;
	private String _dienThoai;
	private String _email;
	private String _facebook;
	private String _twitter;
	private String _socialMedia1;
	private String _socialMedia2;
	private String _socialMedia3;
	private int _trangThai;
	private int _diemTichLuy;
	private String _maSoThue;
	private boolean _hoatDong;
	private Date _ngaySinh;
}