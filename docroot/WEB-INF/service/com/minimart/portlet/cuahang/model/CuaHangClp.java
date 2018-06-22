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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.minimart.portlet.cuahang.service.ClpSerializer;
import com.minimart.portlet.cuahang.service.CuaHangLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mai Thành Duy An
 */
public class CuaHangClp extends BaseModelImpl<CuaHang> implements CuaHang {
	public CuaHangClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CuaHang.class;
	}

	@Override
	public String getModelClassName() {
		return CuaHang.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _cuaHangId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCuaHangId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _cuaHangId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("cuaHangId", getCuaHangId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("gioMoCua", getGioMoCua());
		attributes.put("gioDongCua", getGioDongCua());
		attributes.put("hoatDong", getHoatDong());
		attributes.put("uuTien", getUuTien());
		attributes.put("diaChi", getDiaChi());
		attributes.put("dienThoai", getDienThoai());
		attributes.put("khoHangId", getKhoHangId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long cuaHangId = (Long)attributes.get("cuaHangId");

		if (cuaHangId != null) {
			setCuaHangId(cuaHangId);
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

		String ten = (String)attributes.get("ten");

		if (ten != null) {
			setTen(ten);
		}

		Date gioMoCua = (Date)attributes.get("gioMoCua");

		if (gioMoCua != null) {
			setGioMoCua(gioMoCua);
		}

		Date gioDongCua = (Date)attributes.get("gioDongCua");

		if (gioDongCua != null) {
			setGioDongCua(gioDongCua);
		}

		Boolean hoatDong = (Boolean)attributes.get("hoatDong");

		if (hoatDong != null) {
			setHoatDong(hoatDong);
		}

		Integer uuTien = (Integer)attributes.get("uuTien");

		if (uuTien != null) {
			setUuTien(uuTien);
		}

		String diaChi = (String)attributes.get("diaChi");

		if (diaChi != null) {
			setDiaChi(diaChi);
		}

		String dienThoai = (String)attributes.get("dienThoai");

		if (dienThoai != null) {
			setDienThoai(dienThoai);
		}

		Long khoHangId = (Long)attributes.get("khoHangId");

		if (khoHangId != null) {
			setKhoHangId(khoHangId);
		}
	}

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_cuaHangRemoteModel != null) {
			try {
				Class<?> clazz = _cuaHangRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_cuaHangRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCuaHangId() {
		return _cuaHangId;
	}

	@Override
	public void setCuaHangId(long cuaHangId) {
		_cuaHangId = cuaHangId;

		if (_cuaHangRemoteModel != null) {
			try {
				Class<?> clazz = _cuaHangRemoteModel.getClass();

				Method method = clazz.getMethod("setCuaHangId", long.class);

				method.invoke(_cuaHangRemoteModel, cuaHangId);
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

		if (_cuaHangRemoteModel != null) {
			try {
				Class<?> clazz = _cuaHangRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_cuaHangRemoteModel, companyId);
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

		if (_cuaHangRemoteModel != null) {
			try {
				Class<?> clazz = _cuaHangRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_cuaHangRemoteModel, userId);
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

		if (_cuaHangRemoteModel != null) {
			try {
				Class<?> clazz = _cuaHangRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_cuaHangRemoteModel, userName);
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

		if (_cuaHangRemoteModel != null) {
			try {
				Class<?> clazz = _cuaHangRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_cuaHangRemoteModel, createDate);
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

		if (_cuaHangRemoteModel != null) {
			try {
				Class<?> clazz = _cuaHangRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_cuaHangRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTen() {
		return _ten;
	}

	@Override
	public void setTen(String ten) {
		_ten = ten;

		if (_cuaHangRemoteModel != null) {
			try {
				Class<?> clazz = _cuaHangRemoteModel.getClass();

				Method method = clazz.getMethod("setTen", String.class);

				method.invoke(_cuaHangRemoteModel, ten);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getGioMoCua() {
		return _gioMoCua;
	}

	@Override
	public void setGioMoCua(Date gioMoCua) {
		_gioMoCua = gioMoCua;

		if (_cuaHangRemoteModel != null) {
			try {
				Class<?> clazz = _cuaHangRemoteModel.getClass();

				Method method = clazz.getMethod("setGioMoCua", Date.class);

				method.invoke(_cuaHangRemoteModel, gioMoCua);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getGioDongCua() {
		return _gioDongCua;
	}

	@Override
	public void setGioDongCua(Date gioDongCua) {
		_gioDongCua = gioDongCua;

		if (_cuaHangRemoteModel != null) {
			try {
				Class<?> clazz = _cuaHangRemoteModel.getClass();

				Method method = clazz.getMethod("setGioDongCua", Date.class);

				method.invoke(_cuaHangRemoteModel, gioDongCua);
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

		if (_cuaHangRemoteModel != null) {
			try {
				Class<?> clazz = _cuaHangRemoteModel.getClass();

				Method method = clazz.getMethod("setHoatDong", boolean.class);

				method.invoke(_cuaHangRemoteModel, hoatDong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getUuTien() {
		return _uuTien;
	}

	@Override
	public void setUuTien(int uuTien) {
		_uuTien = uuTien;

		if (_cuaHangRemoteModel != null) {
			try {
				Class<?> clazz = _cuaHangRemoteModel.getClass();

				Method method = clazz.getMethod("setUuTien", int.class);

				method.invoke(_cuaHangRemoteModel, uuTien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDiaChi() {
		return _diaChi;
	}

	@Override
	public void setDiaChi(String diaChi) {
		_diaChi = diaChi;

		if (_cuaHangRemoteModel != null) {
			try {
				Class<?> clazz = _cuaHangRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChi", String.class);

				method.invoke(_cuaHangRemoteModel, diaChi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDienThoai() {
		return _dienThoai;
	}

	@Override
	public void setDienThoai(String dienThoai) {
		_dienThoai = dienThoai;

		if (_cuaHangRemoteModel != null) {
			try {
				Class<?> clazz = _cuaHangRemoteModel.getClass();

				Method method = clazz.getMethod("setDienThoai", String.class);

				method.invoke(_cuaHangRemoteModel, dienThoai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getKhoHangId() {
		return _khoHangId;
	}

	@Override
	public void setKhoHangId(long khoHangId) {
		_khoHangId = khoHangId;

		if (_cuaHangRemoteModel != null) {
			try {
				Class<?> clazz = _cuaHangRemoteModel.getClass();

				Method method = clazz.getMethod("setKhoHangId", long.class);

				method.invoke(_cuaHangRemoteModel, khoHangId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				CuaHang.class.getName()));
	}

	public BaseModel<?> getCuaHangRemoteModel() {
		return _cuaHangRemoteModel;
	}

	public void setCuaHangRemoteModel(BaseModel<?> cuaHangRemoteModel) {
		_cuaHangRemoteModel = cuaHangRemoteModel;
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

		Class<?> remoteModelClass = _cuaHangRemoteModel.getClass();

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

		Object returnValue = method.invoke(_cuaHangRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CuaHangLocalServiceUtil.addCuaHang(this);
		}
		else {
			CuaHangLocalServiceUtil.updateCuaHang(this);
		}
	}

	@Override
	public CuaHang toEscapedModel() {
		return (CuaHang)ProxyUtil.newProxyInstance(CuaHang.class.getClassLoader(),
			new Class[] { CuaHang.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CuaHangClp clone = new CuaHangClp();

		clone.setUuid(getUuid());
		clone.setCuaHangId(getCuaHangId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setTen(getTen());
		clone.setGioMoCua(getGioMoCua());
		clone.setGioDongCua(getGioDongCua());
		clone.setHoatDong(getHoatDong());
		clone.setUuTien(getUuTien());
		clone.setDiaChi(getDiaChi());
		clone.setDienThoai(getDienThoai());
		clone.setKhoHangId(getKhoHangId());

		return clone;
	}

	@Override
	public int compareTo(CuaHang cuaHang) {
		int value = 0;

		value = getTen().compareTo(cuaHang.getTen());

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

		if (!(obj instanceof CuaHangClp)) {
			return false;
		}

		CuaHangClp cuaHang = (CuaHangClp)obj;

		long primaryKey = cuaHang.getPrimaryKey();

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
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", cuaHangId=");
		sb.append(getCuaHangId());
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
		sb.append(", ten=");
		sb.append(getTen());
		sb.append(", gioMoCua=");
		sb.append(getGioMoCua());
		sb.append(", gioDongCua=");
		sb.append(getGioDongCua());
		sb.append(", hoatDong=");
		sb.append(getHoatDong());
		sb.append(", uuTien=");
		sb.append(getUuTien());
		sb.append(", diaChi=");
		sb.append(getDiaChi());
		sb.append(", dienThoai=");
		sb.append(getDienThoai());
		sb.append(", khoHangId=");
		sb.append(getKhoHangId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("com.minimart.portlet.cuahang.model.CuaHang");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cuaHangId</column-name><column-value><![CDATA[");
		sb.append(getCuaHangId());
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
			"<column><column-name>ten</column-name><column-value><![CDATA[");
		sb.append(getTen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gioMoCua</column-name><column-value><![CDATA[");
		sb.append(getGioMoCua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gioDongCua</column-name><column-value><![CDATA[");
		sb.append(getGioDongCua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoatDong</column-name><column-value><![CDATA[");
		sb.append(getHoatDong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>uuTien</column-name><column-value><![CDATA[");
		sb.append(getUuTien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>diaChi</column-name><column-value><![CDATA[");
		sb.append(getDiaChi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dienThoai</column-name><column-value><![CDATA[");
		sb.append(getDienThoai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>khoHangId</column-name><column-value><![CDATA[");
		sb.append(getKhoHangId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _cuaHangId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private Date _gioMoCua;
	private Date _gioDongCua;
	private boolean _hoatDong;
	private int _uuTien;
	private String _diaChi;
	private String _dienThoai;
	private long _khoHangId;
	private BaseModel<?> _cuaHangRemoteModel;
	private Class<?> _clpSerializerClass = com.minimart.portlet.cuahang.service.ClpSerializer.class;
}