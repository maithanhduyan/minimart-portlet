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

package com.minimart.portlet.danhmucchung.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.minimart.portlet.danhmucchung.service.ClpSerializer;
import com.minimart.portlet.danhmucchung.service.TinhThanhPhoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mai Thành Duy An
 */
public class TinhThanhPhoClp extends BaseModelImpl<TinhThanhPho>
	implements TinhThanhPho {
	public TinhThanhPhoClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TinhThanhPho.class;
	}

	@Override
	public String getModelClassName() {
		return TinhThanhPho.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _tinhThanhPhoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTinhThanhPhoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tinhThanhPhoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tinhThanhPhoId", getTinhThanhPhoId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("ma", getMa());
		attributes.put("trangThai", getTrangThai());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tinhThanhPhoId = (Long)attributes.get("tinhThanhPhoId");

		if (tinhThanhPhoId != null) {
			setTinhThanhPhoId(tinhThanhPhoId);
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

		String ma = (String)attributes.get("ma");

		if (ma != null) {
			setMa(ma);
		}

		Boolean trangThai = (Boolean)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}
	}

	@Override
	public long getTinhThanhPhoId() {
		return _tinhThanhPhoId;
	}

	@Override
	public void setTinhThanhPhoId(long tinhThanhPhoId) {
		_tinhThanhPhoId = tinhThanhPhoId;

		if (_tinhThanhPhoRemoteModel != null) {
			try {
				Class<?> clazz = _tinhThanhPhoRemoteModel.getClass();

				Method method = clazz.getMethod("setTinhThanhPhoId", long.class);

				method.invoke(_tinhThanhPhoRemoteModel, tinhThanhPhoId);
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

		if (_tinhThanhPhoRemoteModel != null) {
			try {
				Class<?> clazz = _tinhThanhPhoRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_tinhThanhPhoRemoteModel, companyId);
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

		if (_tinhThanhPhoRemoteModel != null) {
			try {
				Class<?> clazz = _tinhThanhPhoRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_tinhThanhPhoRemoteModel, userId);
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

		if (_tinhThanhPhoRemoteModel != null) {
			try {
				Class<?> clazz = _tinhThanhPhoRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_tinhThanhPhoRemoteModel, userName);
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

		if (_tinhThanhPhoRemoteModel != null) {
			try {
				Class<?> clazz = _tinhThanhPhoRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_tinhThanhPhoRemoteModel, createDate);
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

		if (_tinhThanhPhoRemoteModel != null) {
			try {
				Class<?> clazz = _tinhThanhPhoRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_tinhThanhPhoRemoteModel, modifiedDate);
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

		if (_tinhThanhPhoRemoteModel != null) {
			try {
				Class<?> clazz = _tinhThanhPhoRemoteModel.getClass();

				Method method = clazz.getMethod("setTen", String.class);

				method.invoke(_tinhThanhPhoRemoteModel, ten);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMa() {
		return _ma;
	}

	@Override
	public void setMa(String ma) {
		_ma = ma;

		if (_tinhThanhPhoRemoteModel != null) {
			try {
				Class<?> clazz = _tinhThanhPhoRemoteModel.getClass();

				Method method = clazz.getMethod("setMa", String.class);

				method.invoke(_tinhThanhPhoRemoteModel, ma);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getTrangThai() {
		return _trangThai;
	}

	@Override
	public boolean isTrangThai() {
		return _trangThai;
	}

	@Override
	public void setTrangThai(boolean trangThai) {
		_trangThai = trangThai;

		if (_tinhThanhPhoRemoteModel != null) {
			try {
				Class<?> clazz = _tinhThanhPhoRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThai", boolean.class);

				method.invoke(_tinhThanhPhoRemoteModel, trangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTinhThanhPhoRemoteModel() {
		return _tinhThanhPhoRemoteModel;
	}

	public void setTinhThanhPhoRemoteModel(BaseModel<?> tinhThanhPhoRemoteModel) {
		_tinhThanhPhoRemoteModel = tinhThanhPhoRemoteModel;
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

		Class<?> remoteModelClass = _tinhThanhPhoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_tinhThanhPhoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TinhThanhPhoLocalServiceUtil.addTinhThanhPho(this);
		}
		else {
			TinhThanhPhoLocalServiceUtil.updateTinhThanhPho(this);
		}
	}

	@Override
	public TinhThanhPho toEscapedModel() {
		return (TinhThanhPho)ProxyUtil.newProxyInstance(TinhThanhPho.class.getClassLoader(),
			new Class[] { TinhThanhPho.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TinhThanhPhoClp clone = new TinhThanhPhoClp();

		clone.setTinhThanhPhoId(getTinhThanhPhoId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setTen(getTen());
		clone.setMa(getMa());
		clone.setTrangThai(getTrangThai());

		return clone;
	}

	@Override
	public int compareTo(TinhThanhPho tinhThanhPho) {
		int value = 0;

		value = getTen().compareTo(tinhThanhPho.getTen());

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

		if (!(obj instanceof TinhThanhPhoClp)) {
			return false;
		}

		TinhThanhPhoClp tinhThanhPho = (TinhThanhPhoClp)obj;

		long primaryKey = tinhThanhPho.getPrimaryKey();

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
		StringBundler sb = new StringBundler(19);

		sb.append("{tinhThanhPhoId=");
		sb.append(getTinhThanhPhoId());
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
		sb.append(", ma=");
		sb.append(getMa());
		sb.append(", trangThai=");
		sb.append(getTrangThai());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.minimart.portlet.danhmucchung.model.TinhThanhPho");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>tinhThanhPhoId</column-name><column-value><![CDATA[");
		sb.append(getTinhThanhPhoId());
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
			"<column><column-name>ma</column-name><column-value><![CDATA[");
		sb.append(getMa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThai</column-name><column-value><![CDATA[");
		sb.append(getTrangThai());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _tinhThanhPhoId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private String _ma;
	private boolean _trangThai;
	private BaseModel<?> _tinhThanhPhoRemoteModel;
	private Class<?> _clpSerializerClass = com.minimart.portlet.danhmucchung.service.ClpSerializer.class;
}