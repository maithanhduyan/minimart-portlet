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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.minimart.portlet.mathang.service.ClpSerializer;
import com.minimart.portlet.mathang.service.MatHangLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mai Thành Duy An
 */
public class MatHangClp extends BaseModelImpl<MatHang> implements MatHang {
	public MatHangClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return MatHang.class;
	}

	@Override
	public String getModelClassName() {
		return MatHang.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _matHangId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setMatHangId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _matHangId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("matHangId", getMatHangId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("code", getCode());
		attributes.put("giaNhap", getGiaNhap());
		attributes.put("status", getStatus());
		attributes.put("giaBan", getGiaBan());
		attributes.put("giaBan1", getGiaBan1());
		attributes.put("giaBan2", getGiaBan2());
		attributes.put("giaBan3", getGiaBan3());
		attributes.put("tonToiThieu", getTonToiThieu());
		attributes.put("tonToiDa", getTonToiDa());
		attributes.put("giaVon", getGiaVon());
		attributes.put("hoaHong", getHoaHong());
		attributes.put("nhomMatHangId", getNhomMatHangId());
		attributes.put("donViTinhId", getDonViTinhId());
		attributes.put("size", getSize());
		attributes.put("imageUrl", getImageUrl());
		attributes.put("hoatDong", getHoatDong());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long matHangId = (Long)attributes.get("matHangId");

		if (matHangId != null) {
			setMatHangId(matHangId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		Integer giaNhap = (Integer)attributes.get("giaNhap");

		if (giaNhap != null) {
			setGiaNhap(giaNhap);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Integer giaBan = (Integer)attributes.get("giaBan");

		if (giaBan != null) {
			setGiaBan(giaBan);
		}

		Integer giaBan1 = (Integer)attributes.get("giaBan1");

		if (giaBan1 != null) {
			setGiaBan1(giaBan1);
		}

		Integer giaBan2 = (Integer)attributes.get("giaBan2");

		if (giaBan2 != null) {
			setGiaBan2(giaBan2);
		}

		Integer giaBan3 = (Integer)attributes.get("giaBan3");

		if (giaBan3 != null) {
			setGiaBan3(giaBan3);
		}

		Integer tonToiThieu = (Integer)attributes.get("tonToiThieu");

		if (tonToiThieu != null) {
			setTonToiThieu(tonToiThieu);
		}

		Integer tonToiDa = (Integer)attributes.get("tonToiDa");

		if (tonToiDa != null) {
			setTonToiDa(tonToiDa);
		}

		Integer giaVon = (Integer)attributes.get("giaVon");

		if (giaVon != null) {
			setGiaVon(giaVon);
		}

		Integer hoaHong = (Integer)attributes.get("hoaHong");

		if (hoaHong != null) {
			setHoaHong(hoaHong);
		}

		Long nhomMatHangId = (Long)attributes.get("nhomMatHangId");

		if (nhomMatHangId != null) {
			setNhomMatHangId(nhomMatHangId);
		}

		Long donViTinhId = (Long)attributes.get("donViTinhId");

		if (donViTinhId != null) {
			setDonViTinhId(donViTinhId);
		}

		String size = (String)attributes.get("size");

		if (size != null) {
			setSize(size);
		}

		String imageUrl = (String)attributes.get("imageUrl");

		if (imageUrl != null) {
			setImageUrl(imageUrl);
		}

		Boolean hoatDong = (Boolean)attributes.get("hoatDong");

		if (hoatDong != null) {
			setHoatDong(hoatDong);
		}
	}

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_matHangRemoteModel != null) {
			try {
				Class<?> clazz = _matHangRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_matHangRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getMatHangId() {
		return _matHangId;
	}

	@Override
	public void setMatHangId(long matHangId) {
		_matHangId = matHangId;

		if (_matHangRemoteModel != null) {
			try {
				Class<?> clazz = _matHangRemoteModel.getClass();

				Method method = clazz.getMethod("setMatHangId", long.class);

				method.invoke(_matHangRemoteModel, matHangId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_matHangRemoteModel != null) {
			try {
				Class<?> clazz = _matHangRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_matHangRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_matHangRemoteModel != null) {
			try {
				Class<?> clazz = _matHangRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_matHangRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_matHangRemoteModel != null) {
			try {
				Class<?> clazz = _matHangRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_matHangRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_matHangRemoteModel != null) {
			try {
				Class<?> clazz = _matHangRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_matHangRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_matHangRemoteModel != null) {
			try {
				Class<?> clazz = _matHangRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_matHangRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_matHangRemoteModel != null) {
			try {
				Class<?> clazz = _matHangRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_matHangRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_matHangRemoteModel != null) {
			try {
				Class<?> clazz = _matHangRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_matHangRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCode() {
		return _code;
	}

	@Override
	public void setCode(String code) {
		_code = code;

		if (_matHangRemoteModel != null) {
			try {
				Class<?> clazz = _matHangRemoteModel.getClass();

				Method method = clazz.getMethod("setCode", String.class);

				method.invoke(_matHangRemoteModel, code);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getGiaNhap() {
		return _giaNhap;
	}

	@Override
	public void setGiaNhap(int giaNhap) {
		_giaNhap = giaNhap;

		if (_matHangRemoteModel != null) {
			try {
				Class<?> clazz = _matHangRemoteModel.getClass();

				Method method = clazz.getMethod("setGiaNhap", int.class);

				method.invoke(_matHangRemoteModel, giaNhap);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_status = status;

		if (_matHangRemoteModel != null) {
			try {
				Class<?> clazz = _matHangRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", int.class);

				method.invoke(_matHangRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getGiaBan() {
		return _giaBan;
	}

	@Override
	public void setGiaBan(int giaBan) {
		_giaBan = giaBan;

		if (_matHangRemoteModel != null) {
			try {
				Class<?> clazz = _matHangRemoteModel.getClass();

				Method method = clazz.getMethod("setGiaBan", int.class);

				method.invoke(_matHangRemoteModel, giaBan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getGiaBan1() {
		return _giaBan1;
	}

	@Override
	public void setGiaBan1(int giaBan1) {
		_giaBan1 = giaBan1;

		if (_matHangRemoteModel != null) {
			try {
				Class<?> clazz = _matHangRemoteModel.getClass();

				Method method = clazz.getMethod("setGiaBan1", int.class);

				method.invoke(_matHangRemoteModel, giaBan1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getGiaBan2() {
		return _giaBan2;
	}

	@Override
	public void setGiaBan2(int giaBan2) {
		_giaBan2 = giaBan2;

		if (_matHangRemoteModel != null) {
			try {
				Class<?> clazz = _matHangRemoteModel.getClass();

				Method method = clazz.getMethod("setGiaBan2", int.class);

				method.invoke(_matHangRemoteModel, giaBan2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getGiaBan3() {
		return _giaBan3;
	}

	@Override
	public void setGiaBan3(int giaBan3) {
		_giaBan3 = giaBan3;

		if (_matHangRemoteModel != null) {
			try {
				Class<?> clazz = _matHangRemoteModel.getClass();

				Method method = clazz.getMethod("setGiaBan3", int.class);

				method.invoke(_matHangRemoteModel, giaBan3);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTonToiThieu() {
		return _tonToiThieu;
	}

	@Override
	public void setTonToiThieu(int tonToiThieu) {
		_tonToiThieu = tonToiThieu;

		if (_matHangRemoteModel != null) {
			try {
				Class<?> clazz = _matHangRemoteModel.getClass();

				Method method = clazz.getMethod("setTonToiThieu", int.class);

				method.invoke(_matHangRemoteModel, tonToiThieu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTonToiDa() {
		return _tonToiDa;
	}

	@Override
	public void setTonToiDa(int tonToiDa) {
		_tonToiDa = tonToiDa;

		if (_matHangRemoteModel != null) {
			try {
				Class<?> clazz = _matHangRemoteModel.getClass();

				Method method = clazz.getMethod("setTonToiDa", int.class);

				method.invoke(_matHangRemoteModel, tonToiDa);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getGiaVon() {
		return _giaVon;
	}

	@Override
	public void setGiaVon(int giaVon) {
		_giaVon = giaVon;

		if (_matHangRemoteModel != null) {
			try {
				Class<?> clazz = _matHangRemoteModel.getClass();

				Method method = clazz.getMethod("setGiaVon", int.class);

				method.invoke(_matHangRemoteModel, giaVon);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getHoaHong() {
		return _hoaHong;
	}

	@Override
	public void setHoaHong(int hoaHong) {
		_hoaHong = hoaHong;

		if (_matHangRemoteModel != null) {
			try {
				Class<?> clazz = _matHangRemoteModel.getClass();

				Method method = clazz.getMethod("setHoaHong", int.class);

				method.invoke(_matHangRemoteModel, hoaHong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNhomMatHangId() {
		return _nhomMatHangId;
	}

	@Override
	public void setNhomMatHangId(long nhomMatHangId) {
		_nhomMatHangId = nhomMatHangId;

		if (_matHangRemoteModel != null) {
			try {
				Class<?> clazz = _matHangRemoteModel.getClass();

				Method method = clazz.getMethod("setNhomMatHangId", long.class);

				method.invoke(_matHangRemoteModel, nhomMatHangId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDonViTinhId() {
		return _donViTinhId;
	}

	@Override
	public void setDonViTinhId(long donViTinhId) {
		_donViTinhId = donViTinhId;

		if (_matHangRemoteModel != null) {
			try {
				Class<?> clazz = _matHangRemoteModel.getClass();

				Method method = clazz.getMethod("setDonViTinhId", long.class);

				method.invoke(_matHangRemoteModel, donViTinhId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSize() {
		return _size;
	}

	@Override
	public void setSize(String size) {
		_size = size;

		if (_matHangRemoteModel != null) {
			try {
				Class<?> clazz = _matHangRemoteModel.getClass();

				Method method = clazz.getMethod("setSize", String.class);

				method.invoke(_matHangRemoteModel, size);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImageUrl() {
		return _imageUrl;
	}

	@Override
	public void setImageUrl(String imageUrl) {
		_imageUrl = imageUrl;

		if (_matHangRemoteModel != null) {
			try {
				Class<?> clazz = _matHangRemoteModel.getClass();

				Method method = clazz.getMethod("setImageUrl", String.class);

				method.invoke(_matHangRemoteModel, imageUrl);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getHoatDong() {
		return _hoatDong;
	}

	@Override
	public boolean isHoatDong() {
		return _hoatDong;
	}

	@Override
	public void setHoatDong(boolean hoatDong) {
		_hoatDong = hoatDong;

		if (_matHangRemoteModel != null) {
			try {
				Class<?> clazz = _matHangRemoteModel.getClass();

				Method method = clazz.getMethod("setHoatDong", boolean.class);

				method.invoke(_matHangRemoteModel, hoatDong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				MatHang.class.getName()));
	}

	public BaseModel<?> getMatHangRemoteModel() {
		return _matHangRemoteModel;
	}

	public void setMatHangRemoteModel(BaseModel<?> matHangRemoteModel) {
		_matHangRemoteModel = matHangRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _matHangRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_matHangRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			MatHangLocalServiceUtil.addMatHang(this);
		}
		else {
			MatHangLocalServiceUtil.updateMatHang(this);
		}
	}

	@Override
	public MatHang toEscapedModel() {
		return (MatHang)ProxyUtil.newProxyInstance(MatHang.class.getClassLoader(),
			new Class[] { MatHang.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MatHangClp clone = new MatHangClp();

		clone.setUuid(getUuid());
		clone.setMatHangId(getMatHangId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setName(getName());
		clone.setCode(getCode());
		clone.setGiaNhap(getGiaNhap());
		clone.setStatus(getStatus());
		clone.setGiaBan(getGiaBan());
		clone.setGiaBan1(getGiaBan1());
		clone.setGiaBan2(getGiaBan2());
		clone.setGiaBan3(getGiaBan3());
		clone.setTonToiThieu(getTonToiThieu());
		clone.setTonToiDa(getTonToiDa());
		clone.setGiaVon(getGiaVon());
		clone.setHoaHong(getHoaHong());
		clone.setNhomMatHangId(getNhomMatHangId());
		clone.setDonViTinhId(getDonViTinhId());
		clone.setSize(getSize());
		clone.setImageUrl(getImageUrl());
		clone.setHoatDong(getHoatDong());

		return clone;
	}

	@Override
	public int compareTo(MatHang matHang) {
		int value = 0;

		value = getName().compareTo(matHang.getName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MatHangClp)) {
			return false;
		}

		MatHangClp matHang = (MatHangClp)obj;

		long primaryKey = matHang.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(51);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", matHangId=");
		sb.append(getMatHangId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", code=");
		sb.append(getCode());
		sb.append(", giaNhap=");
		sb.append(getGiaNhap());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", giaBan=");
		sb.append(getGiaBan());
		sb.append(", giaBan1=");
		sb.append(getGiaBan1());
		sb.append(", giaBan2=");
		sb.append(getGiaBan2());
		sb.append(", giaBan3=");
		sb.append(getGiaBan3());
		sb.append(", tonToiThieu=");
		sb.append(getTonToiThieu());
		sb.append(", tonToiDa=");
		sb.append(getTonToiDa());
		sb.append(", giaVon=");
		sb.append(getGiaVon());
		sb.append(", hoaHong=");
		sb.append(getHoaHong());
		sb.append(", nhomMatHangId=");
		sb.append(getNhomMatHangId());
		sb.append(", donViTinhId=");
		sb.append(getDonViTinhId());
		sb.append(", size=");
		sb.append(getSize());
		sb.append(", imageUrl=");
		sb.append(getImageUrl());
		sb.append(", hoatDong=");
		sb.append(getHoatDong());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(79);

		sb.append("<model><model-name>");
		sb.append("com.minimart.portlet.mathang.model.MatHang");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>matHangId</column-name><column-value><![CDATA[");
		sb.append(getMatHangId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>code</column-name><column-value><![CDATA[");
		sb.append(getCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>giaNhap</column-name><column-value><![CDATA[");
		sb.append(getGiaNhap());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>giaBan</column-name><column-value><![CDATA[");
		sb.append(getGiaBan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>giaBan1</column-name><column-value><![CDATA[");
		sb.append(getGiaBan1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>giaBan2</column-name><column-value><![CDATA[");
		sb.append(getGiaBan2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>giaBan3</column-name><column-value><![CDATA[");
		sb.append(getGiaBan3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tonToiThieu</column-name><column-value><![CDATA[");
		sb.append(getTonToiThieu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tonToiDa</column-name><column-value><![CDATA[");
		sb.append(getTonToiDa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>giaVon</column-name><column-value><![CDATA[");
		sb.append(getGiaVon());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoaHong</column-name><column-value><![CDATA[");
		sb.append(getHoaHong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nhomMatHangId</column-name><column-value><![CDATA[");
		sb.append(getNhomMatHangId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>donViTinhId</column-name><column-value><![CDATA[");
		sb.append(getDonViTinhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>size</column-name><column-value><![CDATA[");
		sb.append(getSize());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>imageUrl</column-name><column-value><![CDATA[");
		sb.append(getImageUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoatDong</column-name><column-value><![CDATA[");
		sb.append(getHoatDong());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _matHangId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
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
	private BaseModel<?> _matHangRemoteModel;
	private Class<?> _clpSerializerClass = com.minimart.portlet.mathang.service.ClpSerializer.class;
}