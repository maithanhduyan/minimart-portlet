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
 * This class is used by SOAP remote services, specifically {@link com.minimart.portlet.khuyenmai.service.http.LoaiHinhKhuyenMaiServiceSoap}.
 *
 * @author Mai Thành Duy An
 * @see com.minimart.portlet.khuyenmai.service.http.LoaiHinhKhuyenMaiServiceSoap
 * @generated
 */
public class LoaiHinhKhuyenMaiSoap implements Serializable {
	public static LoaiHinhKhuyenMaiSoap toSoapModel(LoaiHinhKhuyenMai model) {
		LoaiHinhKhuyenMaiSoap soapModel = new LoaiHinhKhuyenMaiSoap();

		soapModel.setLoaiHinhKhuyenMaiId(model.getLoaiHinhKhuyenMaiId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTen(model.getTen());
		soapModel.setTrangThai(model.getTrangThai());
		soapModel.setTileGiamGia(model.getTileGiamGia());
		soapModel.setNgayBatDau(model.getNgayBatDau());
		soapModel.setNgayHetHan(model.getNgayHetHan());
		soapModel.setImageid(model.getImageid());
		soapModel.setGhiChu(model.getGhiChu());

		return soapModel;
	}

	public static LoaiHinhKhuyenMaiSoap[] toSoapModels(
		LoaiHinhKhuyenMai[] models) {
		LoaiHinhKhuyenMaiSoap[] soapModels = new LoaiHinhKhuyenMaiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LoaiHinhKhuyenMaiSoap[][] toSoapModels(
		LoaiHinhKhuyenMai[][] models) {
		LoaiHinhKhuyenMaiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LoaiHinhKhuyenMaiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LoaiHinhKhuyenMaiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LoaiHinhKhuyenMaiSoap[] toSoapModels(
		List<LoaiHinhKhuyenMai> models) {
		List<LoaiHinhKhuyenMaiSoap> soapModels = new ArrayList<LoaiHinhKhuyenMaiSoap>(models.size());

		for (LoaiHinhKhuyenMai model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LoaiHinhKhuyenMaiSoap[soapModels.size()]);
	}

	public LoaiHinhKhuyenMaiSoap() {
	}

	public long getPrimaryKey() {
		return _loaiHinhKhuyenMaiId;
	}

	public void setPrimaryKey(long pk) {
		setLoaiHinhKhuyenMaiId(pk);
	}

	public long getLoaiHinhKhuyenMaiId() {
		return _loaiHinhKhuyenMaiId;
	}

	public void setLoaiHinhKhuyenMaiId(long loaiHinhKhuyenMaiId) {
		_loaiHinhKhuyenMaiId = loaiHinhKhuyenMaiId;
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

	public int getTileGiamGia() {
		return _tileGiamGia;
	}

	public void setTileGiamGia(int tileGiamGia) {
		_tileGiamGia = tileGiamGia;
	}

	public Date getNgayBatDau() {
		return _ngayBatDau;
	}

	public void setNgayBatDau(Date ngayBatDau) {
		_ngayBatDau = ngayBatDau;
	}

	public Date getNgayHetHan() {
		return _ngayHetHan;
	}

	public void setNgayHetHan(Date ngayHetHan) {
		_ngayHetHan = ngayHetHan;
	}

	public String getImageid() {
		return _imageid;
	}

	public void setImageid(String imageid) {
		_imageid = imageid;
	}

	public String getGhiChu() {
		return _ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;
	}

	private long _loaiHinhKhuyenMaiId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private boolean _trangThai;
	private int _tileGiamGia;
	private Date _ngayBatDau;
	private Date _ngayHetHan;
	private String _imageid;
	private String _ghiChu;
}