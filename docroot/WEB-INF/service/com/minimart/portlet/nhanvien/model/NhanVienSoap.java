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

package com.minimart.portlet.nhanvien.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.minimart.portlet.nhanvien.service.http.NhanVienServiceSoap}.
 *
 * @author Mai Thành Duy An
 * @see com.minimart.portlet.nhanvien.service.http.NhanVienServiceSoap
 * @generated
 */
public class NhanVienSoap implements Serializable {
	public static NhanVienSoap toSoapModel(NhanVien model) {
		NhanVienSoap soapModel = new NhanVienSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setNhanVienId(model.getNhanVienId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTen(model.getTen());
		soapModel.setHo(model.getHo());
		soapModel.setTrangThai(model.getTrangThai());
		soapModel.setNghiThu7(model.getNghiThu7());
		soapModel.setNghiChuNhat(model.getNghiChuNhat());
		soapModel.setCachTinhLuong(model.getCachTinhLuong());
		soapModel.setLuongCa(model.getLuongCa());
		soapModel.setLuongThang(model.getLuongThang());
		soapModel.setImage(model.getImage());
		soapModel.setDiaChiId(model.getDiaChiId());

		return soapModel;
	}

	public static NhanVienSoap[] toSoapModels(NhanVien[] models) {
		NhanVienSoap[] soapModels = new NhanVienSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static NhanVienSoap[][] toSoapModels(NhanVien[][] models) {
		NhanVienSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new NhanVienSoap[models.length][models[0].length];
		}
		else {
			soapModels = new NhanVienSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static NhanVienSoap[] toSoapModels(List<NhanVien> models) {
		List<NhanVienSoap> soapModels = new ArrayList<NhanVienSoap>(models.size());

		for (NhanVien model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new NhanVienSoap[soapModels.size()]);
	}

	public NhanVienSoap() {
	}

	public long getPrimaryKey() {
		return _nhanVienId;
	}

	public void setPrimaryKey(long pk) {
		setNhanVienId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getNhanVienId() {
		return _nhanVienId;
	}

	public void setNhanVienId(long nhanVienId) {
		_nhanVienId = nhanVienId;
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

	public String getHo() {
		return _ho;
	}

	public void setHo(String ho) {
		_ho = ho;
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

	public boolean getNghiThu7() {
		return _nghiThu7;
	}

	public boolean isNghiThu7() {
		return _nghiThu7;
	}

	public void setNghiThu7(boolean nghiThu7) {
		_nghiThu7 = nghiThu7;
	}

	public boolean getNghiChuNhat() {
		return _nghiChuNhat;
	}

	public boolean isNghiChuNhat() {
		return _nghiChuNhat;
	}

	public void setNghiChuNhat(boolean nghiChuNhat) {
		_nghiChuNhat = nghiChuNhat;
	}

	public int getCachTinhLuong() {
		return _cachTinhLuong;
	}

	public void setCachTinhLuong(int cachTinhLuong) {
		_cachTinhLuong = cachTinhLuong;
	}

	public int getLuongCa() {
		return _luongCa;
	}

	public void setLuongCa(int luongCa) {
		_luongCa = luongCa;
	}

	public int getLuongThang() {
		return _luongThang;
	}

	public void setLuongThang(int luongThang) {
		_luongThang = luongThang;
	}

	public String getImage() {
		return _image;
	}

	public void setImage(String image) {
		_image = image;
	}

	public long getDiaChiId() {
		return _diaChiId;
	}

	public void setDiaChiId(long diaChiId) {
		_diaChiId = diaChiId;
	}

	private String _uuid;
	private long _nhanVienId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private String _ho;
	private boolean _trangThai;
	private boolean _nghiThu7;
	private boolean _nghiChuNhat;
	private int _cachTinhLuong;
	private int _luongCa;
	private int _luongThang;
	private String _image;
	private long _diaChiId;
}