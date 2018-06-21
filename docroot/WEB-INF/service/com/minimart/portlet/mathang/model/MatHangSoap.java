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

package com.minimart.portlet.mathang.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.minimart.portlet.mathang.service.http.MatHangServiceSoap}.
 *
 * @author Mai Thành Duy An
 * @see com.minimart.portlet.mathang.service.http.MatHangServiceSoap
 * @generated
 */
public class MatHangSoap implements Serializable {
	public static MatHangSoap toSoapModel(MatHang model) {
		MatHangSoap soapModel = new MatHangSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setMatHangId(model.getMatHangId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setCode(model.getCode());
		soapModel.setGiaNhap(model.getGiaNhap());
		soapModel.setStatus(model.getStatus());
		soapModel.setGiaBan(model.getGiaBan());
		soapModel.setGiaBan1(model.getGiaBan1());
		soapModel.setGiaBan2(model.getGiaBan2());
		soapModel.setGiaBan3(model.getGiaBan3());
		soapModel.setTonToiThieu(model.getTonToiThieu());
		soapModel.setTonToiDa(model.getTonToiDa());
		soapModel.setGiaVon(model.getGiaVon());
		soapModel.setHoaHong(model.getHoaHong());
		soapModel.setNhomMatHangId(model.getNhomMatHangId());
		soapModel.setDonViTinhId(model.getDonViTinhId());
		soapModel.setSize(model.getSize());
		soapModel.setImageUrl(model.getImageUrl());
		soapModel.setHoatDong(model.getHoatDong());

		return soapModel;
	}

	public static MatHangSoap[] toSoapModels(MatHang[] models) {
		MatHangSoap[] soapModels = new MatHangSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MatHangSoap[][] toSoapModels(MatHang[][] models) {
		MatHangSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MatHangSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MatHangSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MatHangSoap[] toSoapModels(List<MatHang> models) {
		List<MatHangSoap> soapModels = new ArrayList<MatHangSoap>(models.size());

		for (MatHang model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MatHangSoap[soapModels.size()]);
	}

	public MatHangSoap() {
	}

	public long getPrimaryKey() {
		return _matHangId;
	}

	public void setPrimaryKey(long pk) {
		setMatHangId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getMatHangId() {
		return _matHangId;
	}

	public void setMatHangId(long matHangId) {
		_matHangId = matHangId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
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

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getCode() {
		return _code;
	}

	public void setCode(String code) {
		_code = code;
	}

	public int getGiaNhap() {
		return _giaNhap;
	}

	public void setGiaNhap(int giaNhap) {
		_giaNhap = giaNhap;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public int getGiaBan() {
		return _giaBan;
	}

	public void setGiaBan(int giaBan) {
		_giaBan = giaBan;
	}

	public int getGiaBan1() {
		return _giaBan1;
	}

	public void setGiaBan1(int giaBan1) {
		_giaBan1 = giaBan1;
	}

	public int getGiaBan2() {
		return _giaBan2;
	}

	public void setGiaBan2(int giaBan2) {
		_giaBan2 = giaBan2;
	}

	public int getGiaBan3() {
		return _giaBan3;
	}

	public void setGiaBan3(int giaBan3) {
		_giaBan3 = giaBan3;
	}

	public int getTonToiThieu() {
		return _tonToiThieu;
	}

	public void setTonToiThieu(int tonToiThieu) {
		_tonToiThieu = tonToiThieu;
	}

	public int getTonToiDa() {
		return _tonToiDa;
	}

	public void setTonToiDa(int tonToiDa) {
		_tonToiDa = tonToiDa;
	}

	public int getGiaVon() {
		return _giaVon;
	}

	public void setGiaVon(int giaVon) {
		_giaVon = giaVon;
	}

	public int getHoaHong() {
		return _hoaHong;
	}

	public void setHoaHong(int hoaHong) {
		_hoaHong = hoaHong;
	}

	public long getNhomMatHangId() {
		return _nhomMatHangId;
	}

	public void setNhomMatHangId(long nhomMatHangId) {
		_nhomMatHangId = nhomMatHangId;
	}

	public long getDonViTinhId() {
		return _donViTinhId;
	}

	public void setDonViTinhId(long donViTinhId) {
		_donViTinhId = donViTinhId;
	}

	public String getSize() {
		return _size;
	}

	public void setSize(String size) {
		_size = size;
	}

	public String getImageUrl() {
		return _imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		_imageUrl = imageUrl;
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

	private String _uuid;
	private long _matHangId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _code;
	private int _giaNhap;
	private int _status;
	private int _giaBan;
	private int _giaBan1;
	private int _giaBan2;
	private int _giaBan3;
	private int _tonToiThieu;
	private int _tonToiDa;
	private int _giaVon;
	private int _hoaHong;
	private long _nhomMatHangId;
	private long _donViTinhId;
	private String _size;
	private String _imageUrl;
	private boolean _hoatDong;
}