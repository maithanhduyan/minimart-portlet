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

package com.minimart.portlet.khuyenmai.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.minimart.portlet.khuyenmai.service.http.DotKhuyenMaiChiTietServiceSoap}.
 *
 * @author Mai Thành Duy An
 * @see com.minimart.portlet.khuyenmai.service.http.DotKhuyenMaiChiTietServiceSoap
 * @generated
 */
public class DotKhuyenMaiChiTietSoap implements Serializable {
	public static DotKhuyenMaiChiTietSoap toSoapModel(DotKhuyenMaiChiTiet model) {
		DotKhuyenMaiChiTietSoap soapModel = new DotKhuyenMaiChiTietSoap();

		soapModel.setDotKhuyenMaiChiTietId(model.getDotKhuyenMaiChiTietId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDotKhuyenMaiId(model.getDotKhuyenMaiId());
		soapModel.setNhomMatHangId(model.getNhomMatHangId());
		soapModel.setMatHangId(model.getMatHangId());
		soapModel.setMatHangTangId(model.getMatHangTangId());
		soapModel.setTiLeGiamGia(model.getTiLeGiamGia());
		soapModel.setGiaTriDonHang(model.getGiaTriDonHang());
		soapModel.setSoLuongMua(model.getSoLuongMua());
		soapModel.setSoLuongTang(model.getSoLuongTang());
		soapModel.setGiaBan(model.getGiaBan());

		return soapModel;
	}

	public static DotKhuyenMaiChiTietSoap[] toSoapModels(
		DotKhuyenMaiChiTiet[] models) {
		DotKhuyenMaiChiTietSoap[] soapModels = new DotKhuyenMaiChiTietSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DotKhuyenMaiChiTietSoap[][] toSoapModels(
		DotKhuyenMaiChiTiet[][] models) {
		DotKhuyenMaiChiTietSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DotKhuyenMaiChiTietSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DotKhuyenMaiChiTietSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DotKhuyenMaiChiTietSoap[] toSoapModels(
		List<DotKhuyenMaiChiTiet> models) {
		List<DotKhuyenMaiChiTietSoap> soapModels = new ArrayList<DotKhuyenMaiChiTietSoap>(models.size());

		for (DotKhuyenMaiChiTiet model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DotKhuyenMaiChiTietSoap[soapModels.size()]);
	}

	public DotKhuyenMaiChiTietSoap() {
	}

	public long getPrimaryKey() {
		return _dotKhuyenMaiChiTietId;
	}

	public void setPrimaryKey(long pk) {
		setDotKhuyenMaiChiTietId(pk);
	}

	public long getDotKhuyenMaiChiTietId() {
		return _dotKhuyenMaiChiTietId;
	}

	public void setDotKhuyenMaiChiTietId(long dotKhuyenMaiChiTietId) {
		_dotKhuyenMaiChiTietId = dotKhuyenMaiChiTietId;
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

	public long getDotKhuyenMaiId() {
		return _dotKhuyenMaiId;
	}

	public void setDotKhuyenMaiId(long dotKhuyenMaiId) {
		_dotKhuyenMaiId = dotKhuyenMaiId;
	}

	public long getNhomMatHangId() {
		return _nhomMatHangId;
	}

	public void setNhomMatHangId(long nhomMatHangId) {
		_nhomMatHangId = nhomMatHangId;
	}

	public long getMatHangId() {
		return _matHangId;
	}

	public void setMatHangId(long matHangId) {
		_matHangId = matHangId;
	}

	public long getMatHangTangId() {
		return _matHangTangId;
	}

	public void setMatHangTangId(long matHangTangId) {
		_matHangTangId = matHangTangId;
	}

	public double getTiLeGiamGia() {
		return _tiLeGiamGia;
	}

	public void setTiLeGiamGia(double tiLeGiamGia) {
		_tiLeGiamGia = tiLeGiamGia;
	}

	public double getGiaTriDonHang() {
		return _giaTriDonHang;
	}

	public void setGiaTriDonHang(double giaTriDonHang) {
		_giaTriDonHang = giaTriDonHang;
	}

	public int getSoLuongMua() {
		return _soLuongMua;
	}

	public void setSoLuongMua(int soLuongMua) {
		_soLuongMua = soLuongMua;
	}

	public int getSoLuongTang() {
		return _soLuongTang;
	}

	public void setSoLuongTang(int soLuongTang) {
		_soLuongTang = soLuongTang;
	}

	public int getGiaBan() {
		return _giaBan;
	}

	public void setGiaBan(int giaBan) {
		_giaBan = giaBan;
	}

	private long _dotKhuyenMaiChiTietId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _dotKhuyenMaiId;
	private long _nhomMatHangId;
	private long _matHangId;
	private long _matHangTangId;
	private double _tiLeGiamGia;
	private double _giaTriDonHang;
	private int _soLuongMua;
	private int _soLuongTang;
	private int _giaBan;
}