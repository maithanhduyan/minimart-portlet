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
 * This class is used by SOAP remote services, specifically {@link com.minimart.portlet.khuyenmai.service.http.DotKhuyenMaiServiceSoap}.
 *
 * @author Mai Thành Duy An
 * @see com.minimart.portlet.khuyenmai.service.http.DotKhuyenMaiServiceSoap
 * @generated
 */
public class DotKhuyenMaiSoap implements Serializable {
	public static DotKhuyenMaiSoap toSoapModel(DotKhuyenMai model) {
		DotKhuyenMaiSoap soapModel = new DotKhuyenMaiSoap();

		soapModel.setDotKhuyenMaiId(model.getDotKhuyenMaiId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTen(model.getTen());
		soapModel.setTrangThai(model.getTrangThai());
		soapModel.setUserModifieldId(model.getUserModifieldId());
		soapModel.setNgayBatDau(model.getNgayBatDau());
		soapModel.setNgayHetHan(model.getNgayHetHan());
		soapModel.setNgungApDung(model.getNgungApDung());
		soapModel.setTiLeGiaGia(model.getTiLeGiaGia());
		soapModel.setGhiChu(model.getGhiChu());

		return soapModel;
	}

	public static DotKhuyenMaiSoap[] toSoapModels(DotKhuyenMai[] models) {
		DotKhuyenMaiSoap[] soapModels = new DotKhuyenMaiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DotKhuyenMaiSoap[][] toSoapModels(DotKhuyenMai[][] models) {
		DotKhuyenMaiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DotKhuyenMaiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DotKhuyenMaiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DotKhuyenMaiSoap[] toSoapModels(List<DotKhuyenMai> models) {
		List<DotKhuyenMaiSoap> soapModels = new ArrayList<DotKhuyenMaiSoap>(models.size());

		for (DotKhuyenMai model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DotKhuyenMaiSoap[soapModels.size()]);
	}

	public DotKhuyenMaiSoap() {
	}

	public long getPrimaryKey() {
		return _dotKhuyenMaiId;
	}

	public void setPrimaryKey(long pk) {
		setDotKhuyenMaiId(pk);
	}

	public long getDotKhuyenMaiId() {
		return _dotKhuyenMaiId;
	}

	public void setDotKhuyenMaiId(long dotKhuyenMaiId) {
		_dotKhuyenMaiId = dotKhuyenMaiId;
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

	public long getUserModifieldId() {
		return _userModifieldId;
	}

	public void setUserModifieldId(long userModifieldId) {
		_userModifieldId = userModifieldId;
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

	public boolean getNgungApDung() {
		return _ngungApDung;
	}

	public boolean isNgungApDung() {
		return _ngungApDung;
	}

	public void setNgungApDung(boolean ngungApDung) {
		_ngungApDung = ngungApDung;
	}

	public int getTiLeGiaGia() {
		return _tiLeGiaGia;
	}

	public void setTiLeGiaGia(int tiLeGiaGia) {
		_tiLeGiaGia = tiLeGiaGia;
	}

	public String getGhiChu() {
		return _ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;
	}

	private long _dotKhuyenMaiId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private boolean _trangThai;
	private long _userModifieldId;
	private Date _ngayBatDau;
	private Date _ngayHetHan;
	private boolean _ngungApDung;
	private int _tiLeGiaGia;
	private String _ghiChu;
}