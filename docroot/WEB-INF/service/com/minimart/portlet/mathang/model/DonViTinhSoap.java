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
 * This class is used by SOAP remote services, specifically {@link com.minimart.portlet.mathang.service.http.DonViTinhServiceSoap}.
 *
 * @author Mai Thành Duy An
 * @see com.minimart.portlet.mathang.service.http.DonViTinhServiceSoap
 * @generated
 */
public class DonViTinhSoap implements Serializable {
	public static DonViTinhSoap toSoapModel(DonViTinh model) {
		DonViTinhSoap soapModel = new DonViTinhSoap();

		soapModel.setDonViTinhId(model.getDonViTinhId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setStatus(model.getStatus());
		soapModel.setNote(model.getNote());

		return soapModel;
	}

	public static DonViTinhSoap[] toSoapModels(DonViTinh[] models) {
		DonViTinhSoap[] soapModels = new DonViTinhSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DonViTinhSoap[][] toSoapModels(DonViTinh[][] models) {
		DonViTinhSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DonViTinhSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DonViTinhSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DonViTinhSoap[] toSoapModels(List<DonViTinh> models) {
		List<DonViTinhSoap> soapModels = new ArrayList<DonViTinhSoap>(models.size());

		for (DonViTinh model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DonViTinhSoap[soapModels.size()]);
	}

	public DonViTinhSoap() {
	}

	public long getPrimaryKey() {
		return _donViTinhId;
	}

	public void setPrimaryKey(long pk) {
		setDonViTinhId(pk);
	}

	public long getDonViTinhId() {
		return _donViTinhId;
	}

	public void setDonViTinhId(long donViTinhId) {
		_donViTinhId = donViTinhId;
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

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public String getNote() {
		return _note;
	}

	public void setNote(String note) {
		_note = note;
	}

	private long _donViTinhId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private int _status;
	private String _note;
}