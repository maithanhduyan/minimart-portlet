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
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.minimart.portlet.cuahang.service.CaLamViecLocalServiceUtil;
import com.minimart.portlet.cuahang.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mai Thành Duy An
 */
public class CaLamViecClp extends BaseModelImpl<CaLamViec> implements CaLamViec {
	public CaLamViecClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CaLamViec.class;
	}

	@Override
	public String getModelClassName() {
		return CaLamViec.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _caLamViecId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCaLamViecId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _caLamViecId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("caLamViecId", getCaLamViecId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("cuaHangId", getCuaHangId());
		attributes.put("gioVaoLam", getGioVaoLam());
		attributes.put("gioRaVe", getGioRaVe());
		attributes.put("gioNghiGiuaCaTu", getGioNghiGiuaCaTu());
		attributes.put("gioNghiGiuaCaDen", getGioNghiGiuaCaDen());
		attributes.put("tiLeLuong", getTiLeLuong());
		attributes.put("hoatDong", getHoatDong());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long caLamViecId = (Long)attributes.get("caLamViecId");

		if (caLamViecId != null) {
			setCaLamViecId(caLamViecId);
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

		Long cuaHangId = (Long)attributes.get("cuaHangId");

		if (cuaHangId != null) {
			setCuaHangId(cuaHangId);
		}

		Date gioVaoLam = (Date)attributes.get("gioVaoLam");

		if (gioVaoLam != null) {
			setGioVaoLam(gioVaoLam);
		}

		Date gioRaVe = (Date)attributes.get("gioRaVe");

		if (gioRaVe != null) {
			setGioRaVe(gioRaVe);
		}

		Date gioNghiGiuaCaTu = (Date)attributes.get("gioNghiGiuaCaTu");

		if (gioNghiGiuaCaTu != null) {
			setGioNghiGiuaCaTu(gioNghiGiuaCaTu);
		}

		Date gioNghiGiuaCaDen = (Date)attributes.get("gioNghiGiuaCaDen");

		if (gioNghiGiuaCaDen != null) {
			setGioNghiGiuaCaDen(gioNghiGiuaCaDen);
		}

		Integer tiLeLuong = (Integer)attributes.get("tiLeLuong");

		if (tiLeLuong != null) {
			setTiLeLuong(tiLeLuong);
		}

		Boolean hoatDong = (Boolean)attributes.get("hoatDong");

		if (hoatDong != null) {
			setHoatDong(hoatDong);
		}
	}

	@Override
	public long getCaLamViecId() {
		return _caLamViecId;
	}

	@Override
	public void setCaLamViecId(long caLamViecId) {
		_caLamViecId = caLamViecId;

		if (_caLamViecRemoteModel != null) {
			try {
				Class<?> clazz = _caLamViecRemoteModel.getClass();

				Method method = clazz.getMethod("setCaLamViecId", long.class);

				method.invoke(_caLamViecRemoteModel, caLamViecId);
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

		if (_caLamViecRemoteModel != null) {
			try {
				Class<?> clazz = _caLamViecRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_caLamViecRemoteModel, companyId);
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

		if (_caLamViecRemoteModel != null) {
			try {
				Class<?> clazz = _caLamViecRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_caLamViecRemoteModel, userId);
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

		if (_caLamViecRemoteModel != null) {
			try {
				Class<?> clazz = _caLamViecRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_caLamViecRemoteModel, userName);
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

		if (_caLamViecRemoteModel != null) {
			try {
				Class<?> clazz = _caLamViecRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_caLamViecRemoteModel, createDate);
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

		if (_caLamViecRemoteModel != null) {
			try {
				Class<?> clazz = _caLamViecRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_caLamViecRemoteModel, modifiedDate);
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

		if (_caLamViecRemoteModel != null) {
			try {
				Class<?> clazz = _caLamViecRemoteModel.getClass();

				Method method = clazz.getMethod("setTen", String.class);

				method.invoke(_caLamViecRemoteModel, ten);
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

		if (_caLamViecRemoteModel != null) {
			try {
				Class<?> clazz = _caLamViecRemoteModel.getClass();

				Method method = clazz.getMethod("setCuaHangId", long.class);

				method.invoke(_caLamViecRemoteModel, cuaHangId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getGioVaoLam() {
		return _gioVaoLam;
	}

	@Override
	public void setGioVaoLam(Date gioVaoLam) {
		_gioVaoLam = gioVaoLam;

		if (_caLamViecRemoteModel != null) {
			try {
				Class<?> clazz = _caLamViecRemoteModel.getClass();

				Method method = clazz.getMethod("setGioVaoLam", Date.class);

				method.invoke(_caLamViecRemoteModel, gioVaoLam);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getGioRaVe() {
		return _gioRaVe;
	}

	@Override
	public void setGioRaVe(Date gioRaVe) {
		_gioRaVe = gioRaVe;

		if (_caLamViecRemoteModel != null) {
			try {
				Class<?> clazz = _caLamViecRemoteModel.getClass();

				Method method = clazz.getMethod("setGioRaVe", Date.class);

				method.invoke(_caLamViecRemoteModel, gioRaVe);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getGioNghiGiuaCaTu() {
		return _gioNghiGiuaCaTu;
	}

	@Override
	public void setGioNghiGiuaCaTu(Date gioNghiGiuaCaTu) {
		_gioNghiGiuaCaTu = gioNghiGiuaCaTu;

		if (_caLamViecRemoteModel != null) {
			try {
				Class<?> clazz = _caLamViecRemoteModel.getClass();

				Method method = clazz.getMethod("setGioNghiGiuaCaTu", Date.class);

				method.invoke(_caLamViecRemoteModel, gioNghiGiuaCaTu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getGioNghiGiuaCaDen() {
		return _gioNghiGiuaCaDen;
	}

	@Override
	public void setGioNghiGiuaCaDen(Date gioNghiGiuaCaDen) {
		_gioNghiGiuaCaDen = gioNghiGiuaCaDen;

		if (_caLamViecRemoteModel != null) {
			try {
				Class<?> clazz = _caLamViecRemoteModel.getClass();

				Method method = clazz.getMethod("setGioNghiGiuaCaDen",
						Date.class);

				method.invoke(_caLamViecRemoteModel, gioNghiGiuaCaDen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTiLeLuong() {
		return _tiLeLuong;
	}

	@Override
	public void setTiLeLuong(int tiLeLuong) {
		_tiLeLuong = tiLeLuong;

		if (_caLamViecRemoteModel != null) {
			try {
				Class<?> clazz = _caLamViecRemoteModel.getClass();

				Method method = clazz.getMethod("setTiLeLuong", int.class);

				method.invoke(_caLamViecRemoteModel, tiLeLuong);
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

		if (_caLamViecRemoteModel != null) {
			try {
				Class<?> clazz = _caLamViecRemoteModel.getClass();

				Method method = clazz.getMethod("setHoatDong", boolean.class);

				method.invoke(_caLamViecRemoteModel, hoatDong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCaLamViecRemoteModel() {
		return _caLamViecRemoteModel;
	}

	public void setCaLamViecRemoteModel(BaseModel<?> caLamViecRemoteModel) {
		_caLamViecRemoteModel = caLamViecRemoteModel;
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

		Class<?> remoteModelClass = _caLamViecRemoteModel.getClass();

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

		Object returnValue = method.invoke(_caLamViecRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CaLamViecLocalServiceUtil.addCaLamViec(this);
		}
		else {
			CaLamViecLocalServiceUtil.updateCaLamViec(this);
		}
	}

	@Override
	public CaLamViec toEscapedModel() {
		return (CaLamViec)ProxyUtil.newProxyInstance(CaLamViec.class.getClassLoader(),
			new Class[] { CaLamViec.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CaLamViecClp clone = new CaLamViecClp();

		clone.setCaLamViecId(getCaLamViecId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setTen(getTen());
		clone.setCuaHangId(getCuaHangId());
		clone.setGioVaoLam(getGioVaoLam());
		clone.setGioRaVe(getGioRaVe());
		clone.setGioNghiGiuaCaTu(getGioNghiGiuaCaTu());
		clone.setGioNghiGiuaCaDen(getGioNghiGiuaCaDen());
		clone.setTiLeLuong(getTiLeLuong());
		clone.setHoatDong(getHoatDong());

		return clone;
	}

	@Override
	public int compareTo(CaLamViec caLamViec) {
		int value = 0;

		value = getTen().compareTo(caLamViec.getTen());

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

		if (!(obj instanceof CaLamViecClp)) {
			return false;
		}

		CaLamViecClp caLamViec = (CaLamViecClp)obj;

		long primaryKey = caLamViec.getPrimaryKey();

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
		StringBundler sb = new StringBundler(29);

		sb.append("{caLamViecId=");
		sb.append(getCaLamViecId());
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
		sb.append(", cuaHangId=");
		sb.append(getCuaHangId());
		sb.append(", gioVaoLam=");
		sb.append(getGioVaoLam());
		sb.append(", gioRaVe=");
		sb.append(getGioRaVe());
		sb.append(", gioNghiGiuaCaTu=");
		sb.append(getGioNghiGiuaCaTu());
		sb.append(", gioNghiGiuaCaDen=");
		sb.append(getGioNghiGiuaCaDen());
		sb.append(", tiLeLuong=");
		sb.append(getTiLeLuong());
		sb.append(", hoatDong=");
		sb.append(getHoatDong());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("com.minimart.portlet.cuahang.model.CaLamViec");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>caLamViecId</column-name><column-value><![CDATA[");
		sb.append(getCaLamViecId());
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
			"<column><column-name>cuaHangId</column-name><column-value><![CDATA[");
		sb.append(getCuaHangId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gioVaoLam</column-name><column-value><![CDATA[");
		sb.append(getGioVaoLam());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gioRaVe</column-name><column-value><![CDATA[");
		sb.append(getGioRaVe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gioNghiGiuaCaTu</column-name><column-value><![CDATA[");
		sb.append(getGioNghiGiuaCaTu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gioNghiGiuaCaDen</column-name><column-value><![CDATA[");
		sb.append(getGioNghiGiuaCaDen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tiLeLuong</column-name><column-value><![CDATA[");
		sb.append(getTiLeLuong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoatDong</column-name><column-value><![CDATA[");
		sb.append(getHoatDong());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _caLamViecId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private long _cuaHangId;
	private Date _gioVaoLam;
	private Date _gioRaVe;
	private Date _gioNghiGiuaCaTu;
	private Date _gioNghiGiuaCaDen;
	private int _tiLeLuong;
	private boolean _hoatDong;
	private BaseModel<?> _caLamViecRemoteModel;
	private Class<?> _clpSerializerClass = com.minimart.portlet.cuahang.service.ClpSerializer.class;
}