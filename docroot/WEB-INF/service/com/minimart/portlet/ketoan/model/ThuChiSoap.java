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
 * This class is used by SOAP remote services, specifically {@link com.minimart.portlet.ketoan.service.http.ThuChiServiceSoap}.
 *
 * @author Mai Thành Duy An
 * @see com.minimart.portlet.ketoan.service.http.ThuChiServiceSoap
 * @generated
 */
public class ThuChiSoap implements Serializable {
	public static ThuChiSoap toSoapModel(ThuChi model) {
		ThuChiSoap soapModel = new ThuChiSoap();

		soapModel.setThuChiId(model.getThuChiId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTen(model.getTen());
		soapModel.setTenDoiTuong(model.getTenDoiTuong());
		soapModel.setDiaChiId(model.getDiaChiId());
		soapModel.setLoai(model.getLoai());
		soapModel.setLoaiDoiTuong(model.getLoaiDoiTuong());
		soapModel.setThu(model.getThu());
		soapModel.setChi(model.getChi());
		soapModel.setNhaCungCapId(model.getNhaCungCapId());
		soapModel.setKhachHangId(model.getKhachHangId());
		soapModel.setNhanVienId(model.getNhanVienId());
		soapModel.setTheTraTruocId(model.getTheTraTruocId());
		soapModel.setTaiKhoanNganHangId(model.getTaiKhoanNganHangId());
		soapModel.setDatHangId(model.getDatHangId());
		soapModel.setBangLuongId(model.getBangLuongId());
		soapModel.setLyDoThuChi(model.getLyDoThuChi());

		return soapModel;
	}

	public static ThuChiSoap[] toSoapModels(ThuChi[] models) {
		ThuChiSoap[] soapModels = new ThuChiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ThuChiSoap[][] toSoapModels(ThuChi[][] models) {
		ThuChiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ThuChiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ThuChiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ThuChiSoap[] toSoapModels(List<ThuChi> models) {
		List<ThuChiSoap> soapModels = new ArrayList<ThuChiSoap>(models.size());

		for (ThuChi model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ThuChiSoap[soapModels.size()]);
	}

	public ThuChiSoap() {
	}

	public long getPrimaryKey() {
		return _thuChiId;
	}

	public void setPrimaryKey(long pk) {
		setThuChiId(pk);
	}

	public long getThuChiId() {
		return _thuChiId;
	}

	public void setThuChiId(long thuChiId) {
		_thuChiId = thuChiId;
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

	public String getTenDoiTuong() {
		return _tenDoiTuong;
	}

	public void setTenDoiTuong(String tenDoiTuong) {
		_tenDoiTuong = tenDoiTuong;
	}

	public long getDiaChiId() {
		return _diaChiId;
	}

	public void setDiaChiId(long diaChiId) {
		_diaChiId = diaChiId;
	}

	public int getLoai() {
		return _loai;
	}

	public void setLoai(int loai) {
		_loai = loai;
	}

	public int getLoaiDoiTuong() {
		return _loaiDoiTuong;
	}

	public void setLoaiDoiTuong(int loaiDoiTuong) {
		_loaiDoiTuong = loaiDoiTuong;
	}

	public int getThu() {
		return _thu;
	}

	public void setThu(int thu) {
		_thu = thu;
	}

	public int getChi() {
		return _chi;
	}

	public void setChi(int chi) {
		_chi = chi;
	}

	public long getNhaCungCapId() {
		return _nhaCungCapId;
	}

	public void setNhaCungCapId(long nhaCungCapId) {
		_nhaCungCapId = nhaCungCapId;
	}

	public long getKhachHangId() {
		return _khachHangId;
	}

	public void setKhachHangId(long khachHangId) {
		_khachHangId = khachHangId;
	}

	public long getNhanVienId() {
		return _nhanVienId;
	}

	public void setNhanVienId(long nhanVienId) {
		_nhanVienId = nhanVienId;
	}

	public long getTheTraTruocId() {
		return _theTraTruocId;
	}

	public void setTheTraTruocId(long theTraTruocId) {
		_theTraTruocId = theTraTruocId;
	}

	public long getTaiKhoanNganHangId() {
		return _taiKhoanNganHangId;
	}

	public void setTaiKhoanNganHangId(long taiKhoanNganHangId) {
		_taiKhoanNganHangId = taiKhoanNganHangId;
	}

	public long getDatHangId() {
		return _datHangId;
	}

	public void setDatHangId(long datHangId) {
		_datHangId = datHangId;
	}

	public long getBangLuongId() {
		return _bangLuongId;
	}

	public void setBangLuongId(long bangLuongId) {
		_bangLuongId = bangLuongId;
	}

	public String getLyDoThuChi() {
		return _lyDoThuChi;
	}

	public void setLyDoThuChi(String lyDoThuChi) {
		_lyDoThuChi = lyDoThuChi;
	}

	private long _thuChiId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private String _tenDoiTuong;
	private long _diaChiId;
	private int _loai;
	private int _loaiDoiTuong;
	private int _thu;
	private int _chi;
	private long _nhaCungCapId;
	private long _khachHangId;
	private long _nhanVienId;
	private long _theTraTruocId;
	private long _taiKhoanNganHangId;
	private long _datHangId;
	private long _bangLuongId;
	private String _lyDoThuChi;
}