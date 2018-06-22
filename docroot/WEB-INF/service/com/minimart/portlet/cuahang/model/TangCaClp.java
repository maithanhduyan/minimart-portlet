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

import com.minimart.portlet.cuahang.service.ClpSerializer;
import com.minimart.portlet.cuahang.service.TangCaLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mai Thành Duy An
 */
public class TangCaClp extends BaseModelImpl<TangCa> implements TangCa {
	public TangCaClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TangCa.class;
	}

	@Override
	public String getModelClassName() {
		return TangCa.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _tangCaId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTangCaId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tangCaId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tangCaId", getTangCaId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("cuaHangId", getCuaHangId());
		attributes.put("caLamViecId", getCaLamViecId());
		attributes.put("nhanVienId", getNhanVienId());
		attributes.put("tangCaTu", getTangCaTu());
		attributes.put("tangCaDen", getTangCaDen());
		attributes.put("hoatDong", getHoatDong());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tangCaId = (Long)attributes.get("tangCaId");

		if (tangCaId != null) {
			setTangCaId(tangCaId);
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

		Long caLamViecId = (Long)attributes.get("caLamViecId");

		if (caLamViecId != null) {
			setCaLamViecId(caLamViecId);
		}

		Long nhanVienId = (Long)attributes.get("nhanVienId");

		if (nhanVienId != null) {
			setNhanVienId(nhanVienId);
		}

		Date tangCaTu = (Date)attributes.get("tangCaTu");

		if (tangCaTu != null) {
			setTangCaTu(tangCaTu);
		}

		Date tangCaDen = (Date)attributes.get("tangCaDen");

		if (tangCaDen != null) {
			setTangCaDen(tangCaDen);
		}

		Boolean hoatDong = (Boolean)attributes.get("hoatDong");

		if (hoatDong != null) {
			setHoatDong(hoatDong);
		}
	}

	@Override
	public long getTangCaId() {
		return _tangCaId;
	}

	@Override
	public void setTangCaId(long tangCaId) {
		_tangCaId = tangCaId;

		if (_tangCaRemoteModel != null) {
			try {
				Class<?> clazz = _tangCaRemoteModel.getClass();

				Method method = clazz.getMethod("setTangCaId", long.class);

				method.invoke(_tangCaRemoteModel, tangCaId);
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

		if (_tangCaRemoteModel != null) {
			try {
				Class<?> clazz = _tangCaRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_tangCaRemoteModel, companyId);
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

		if (_tangCaRemoteModel != null) {
			try {
				Class<?> clazz = _tangCaRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_tangCaRemoteModel, userId);
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

		if (_tangCaRemoteModel != null) {
			try {
				Class<?> clazz = _tangCaRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_tangCaRemoteModel, userName);
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

		if (_tangCaRemoteModel != null) {
			try {
				Class<?> clazz = _tangCaRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_tangCaRemoteModel, createDate);
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

		if (_tangCaRemoteModel != null) {
			try {
				Class<?> clazz = _tangCaRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_tangCaRemoteModel, modifiedDate);
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

		if (_tangCaRemoteModel != null) {
			try {
				Class<?> clazz = _tangCaRemoteModel.getClass();

				Method method = clazz.getMethod("setTen", String.class);

				method.invoke(_tangCaRemoteModel, ten);
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

		if (_tangCaRemoteModel != null) {
			try {
				Class<?> clazz = _tangCaRemoteModel.getClass();

				Method method = clazz.getMethod("setCuaHangId", long.class);

				method.invoke(_tangCaRemoteModel, cuaHangId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCaLamViecId() {
		return _caLamViecId;
	}

	@Override
	public void setCaLamViecId(long caLamViecId) {
		_caLamViecId = caLamViecId;

		if (_tangCaRemoteModel != null) {
			try {
				Class<?> clazz = _tangCaRemoteModel.getClass();

				Method method = clazz.getMethod("setCaLamViecId", long.class);

				method.invoke(_tangCaRemoteModel, caLamViecId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNhanVienId() {
		return _nhanVienId;
	}

	@Override
	public void setNhanVienId(long nhanVienId) {
		_nhanVienId = nhanVienId;

		if (_tangCaRemoteModel != null) {
			try {
				Class<?> clazz = _tangCaRemoteModel.getClass();

				Method method = clazz.getMethod("setNhanVienId", long.class);

				method.invoke(_tangCaRemoteModel, nhanVienId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getTangCaTu() {
		return _tangCaTu;
	}

	@Override
	public void setTangCaTu(Date tangCaTu) {
		_tangCaTu = tangCaTu;

		if (_tangCaRemoteModel != null) {
			try {
				Class<?> clazz = _tangCaRemoteModel.getClass();

				Method method = clazz.getMethod("setTangCaTu", Date.class);

				method.invoke(_tangCaRemoteModel, tangCaTu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getTangCaDen() {
		return _tangCaDen;
	}

	@Override
	public void setTangCaDen(Date tangCaDen) {
		_tangCaDen = tangCaDen;

		if (_tangCaRemoteModel != null) {
			try {
				Class<?> clazz = _tangCaRemoteModel.getClass();

				Method method = clazz.getMethod("setTangCaDen", Date.class);

				method.invoke(_tangCaRemoteModel, tangCaDen);
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

		if (_tangCaRemoteModel != null) {
			try {
				Class<?> clazz = _tangCaRemoteModel.getClass();

				Method method = clazz.getMethod("setHoatDong", boolean.class);

				method.invoke(_tangCaRemoteModel, hoatDong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTangCaRemoteModel() {
		return _tangCaRemoteModel;
	}

	public void setTangCaRemoteModel(BaseModel<?> tangCaRemoteModel) {
		_tangCaRemoteModel = tangCaRemoteModel;
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

		Class<?> remoteModelClass = _tangCaRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tangCaRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TangCaLocalServiceUtil.addTangCa(this);
		}
		else {
			TangCaLocalServiceUtil.updateTangCa(this);
		}
	}

	@Override
	public TangCa toEscapedModel() {
		return (TangCa)ProxyUtil.newProxyInstance(TangCa.class.getClassLoader(),
			new Class[] { TangCa.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TangCaClp clone = new TangCaClp();

		clone.setTangCaId(getTangCaId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setTen(getTen());
		clone.setCuaHangId(getCuaHangId());
		clone.setCaLamViecId(getCaLamViecId());
		clone.setNhanVienId(getNhanVienId());
		clone.setTangCaTu(getTangCaTu());
		clone.setTangCaDen(getTangCaDen());
		clone.setHoatDong(getHoatDong());

		return clone;
	}

	@Override
	public int compareTo(TangCa tangCa) {
		int value = 0;

		value = getTen().compareTo(tangCa.getTen());

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

		if (!(obj instanceof TangCaClp)) {
			return false;
		}

		TangCaClp tangCa = (TangCaClp)obj;

		long primaryKey = tangCa.getPrimaryKey();

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
		StringBundler sb = new StringBundler(27);

		sb.append("{tangCaId=");
		sb.append(getTangCaId());
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
		sb.append(", caLamViecId=");
		sb.append(getCaLamViecId());
		sb.append(", nhanVienId=");
		sb.append(getNhanVienId());
		sb.append(", tangCaTu=");
		sb.append(getTangCaTu());
		sb.append(", tangCaDen=");
		sb.append(getTangCaDen());
		sb.append(", hoatDong=");
		sb.append(getHoatDong());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.minimart.portlet.cuahang.model.TangCa");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>tangCaId</column-name><column-value><![CDATA[");
		sb.append(getTangCaId());
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
			"<column><column-name>caLamViecId</column-name><column-value><![CDATA[");
		sb.append(getCaLamViecId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nhanVienId</column-name><column-value><![CDATA[");
		sb.append(getNhanVienId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tangCaTu</column-name><column-value><![CDATA[");
		sb.append(getTangCaTu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tangCaDen</column-name><column-value><![CDATA[");
		sb.append(getTangCaDen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoatDong</column-name><column-value><![CDATA[");
		sb.append(getHoatDong());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _tangCaId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
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
	private BaseModel<?> _tangCaRemoteModel;
	private Class<?> _clpSerializerClass = com.minimart.portlet.cuahang.service.ClpSerializer.class;
}