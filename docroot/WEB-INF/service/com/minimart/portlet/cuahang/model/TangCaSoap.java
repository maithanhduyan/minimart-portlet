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

package com.minimart.portlet.cuahang.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.minimart.portlet.cuahang.service.http.TangCaServiceSoap}.
 *
 * @author Mai Thành Duy An
 * @see com.minimart.portlet.cuahang.service.http.TangCaServiceSoap
 * @generated
 */
public class TangCaSoap implements Serializable {
	public static TangCaSoap toSoapModel(TangCa model) {
		TangCaSoap soapModel = new TangCaSoap();

		soapModel.setTangCaId(model.getTangCaId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTen(model.getTen());
		soapModel.setCuaHangId(model.getCuaHangId());
		soapModel.setCaLamViecId(model.getCaLamViecId());
		soapModel.setNhanVienId(model.getNhanVienId());
		soapModel.setTangCaTu(model.getTangCaTu());
		soapModel.setTangCaDen(model.getTangCaDen());
		soapModel.setHoatDong(model.getHoatDong());

		return soapModel;
	}

	public static TangCaSoap[] toSoapModels(TangCa[] models) {
		TangCaSoap[] soapModels = new TangCaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TangCaSoap[][] toSoapModels(TangCa[][] models) {
		TangCaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TangCaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TangCaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TangCaSoap[] toSoapModels(List<TangCa> models) {
		List<TangCaSoap> soapModels = new ArrayList<TangCaSoap>(models.size());

		for (TangCa model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TangCaSoap[soapModels.size()]);
	}

	public TangCaSoap() {
	}

	public long getPrimaryKey() {
		return _tangCaId;
	}

	public void setPrimaryKey(long pk) {
		setTangCaId(pk);
	}

	public long getTangCaId() {
		return _tangCaId;
	}

	public void setTangCaId(long tangCaId) {
		_tangCaId = tangCaId;
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

	public long getCuaHangId() {
		return _cuaHangId;
	}

	public void setCuaHangId(long cuaHangId) {
		_cuaHangId = cuaHangId;
	}

	public long getCaLamViecId() {
		return _caLamViecId;
	}

	public void setCaLamViecId(long caLamViecId) {
		_caLamViecId = caLamViecId;
	}

	public long getNhanVienId() {
		return _nhanVienId;
	}

	public void setNhanVienId(long nhanVienId) {
		_nhanVienId = nhanVienId;
	}

	public Date getTangCaTu() {
		return _tangCaTu;
	}

	public void setTangCaTu(Date tangCaTu) {
		_tangCaTu = tangCaTu;
	}

	public Date getTangCaDen() {
		return _tangCaDen;
	}

	public void setTangCaDen(Date tangCaDen) {
		_tangCaDen = tangCaDen;
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

	private long _tangCaId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private long _cuaHangId;
	private long _caLamViecId;
	private long _nhanVienId;
	private Date _tangCaTu;
	private Date _tangCaDen;
	private boolean _hoatDong;
}