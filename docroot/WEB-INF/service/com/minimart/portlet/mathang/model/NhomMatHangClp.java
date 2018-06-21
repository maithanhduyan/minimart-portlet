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
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.minimart.portlet.mathang.service.ClpSerializer;
import com.minimart.portlet.mathang.service.NhomMatHangLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mai Thành Duy An
 */
public class NhomMatHangClp extends BaseModelImpl<NhomMatHang>
	implements NhomMatHang {
	public NhomMatHangClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return NhomMatHang.class;
	}

	@Override
	public String getModelClassName() {
		return NhomMatHang.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _nhomMatHangId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setNhomMatHangId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _nhomMatHangId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("nhomMatHangId", getNhomMatHangId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("code", getCode());
		attributes.put("status", getStatus());
		attributes.put("note", getNote());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long nhomMatHangId = (Long)attributes.get("nhomMatHangId");

		if (nhomMatHangId != null) {
			setNhomMatHangId(nhomMatHangId);
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

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String note = (String)attributes.get("note");

		if (note != null) {
			setNote(note);
		}
	}

	@Override
	public long getNhomMatHangId() {
		return _nhomMatHangId;
	}

	@Override
	public void setNhomMatHangId(long nhomMatHangId) {
		_nhomMatHangId = nhomMatHangId;

		if (_nhomMatHangRemoteModel != null) {
			try {
				Class<?> clazz = _nhomMatHangRemoteModel.getClass();

				Method method = clazz.getMethod("setNhomMatHangId", long.class);

				method.invoke(_nhomMatHangRemoteModel, nhomMatHangId);
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

		if (_nhomMatHangRemoteModel != null) {
			try {
				Class<?> clazz = _nhomMatHangRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_nhomMatHangRemoteModel, groupId);
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

		if (_nhomMatHangRemoteModel != null) {
			try {
				Class<?> clazz = _nhomMatHangRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_nhomMatHangRemoteModel, companyId);
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

		if (_nhomMatHangRemoteModel != null) {
			try {
				Class<?> clazz = _nhomMatHangRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_nhomMatHangRemoteModel, userId);
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

		if (_nhomMatHangRemoteModel != null) {
			try {
				Class<?> clazz = _nhomMatHangRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_nhomMatHangRemoteModel, userName);
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

		if (_nhomMatHangRemoteModel != null) {
			try {
				Class<?> clazz = _nhomMatHangRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_nhomMatHangRemoteModel, createDate);
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

		if (_nhomMatHangRemoteModel != null) {
			try {
				Class<?> clazz = _nhomMatHangRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_nhomMatHangRemoteModel, modifiedDate);
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

		if (_nhomMatHangRemoteModel != null) {
			try {
				Class<?> clazz = _nhomMatHangRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_nhomMatHangRemoteModel, name);
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

		if (_nhomMatHangRemoteModel != null) {
			try {
				Class<?> clazz = _nhomMatHangRemoteModel.getClass();

				Method method = clazz.getMethod("setCode", String.class);

				method.invoke(_nhomMatHangRemoteModel, code);
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

		if (_nhomMatHangRemoteModel != null) {
			try {
				Class<?> clazz = _nhomMatHangRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", int.class);

				method.invoke(_nhomMatHangRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNote() {
		return _note;
	}

	@Override
	public void setNote(String note) {
		_note = note;

		if (_nhomMatHangRemoteModel != null) {
			try {
				Class<?> clazz = _nhomMatHangRemoteModel.getClass();

				Method method = clazz.getMethod("setNote", String.class);

				method.invoke(_nhomMatHangRemoteModel, note);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getNhomMatHangRemoteModel() {
		return _nhomMatHangRemoteModel;
	}

	public void setNhomMatHangRemoteModel(BaseModel<?> nhomMatHangRemoteModel) {
		_nhomMatHangRemoteModel = nhomMatHangRemoteModel;
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

		Class<?> remoteModelClass = _nhomMatHangRemoteModel.getClass();

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

		Object returnValue = method.invoke(_nhomMatHangRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			NhomMatHangLocalServiceUtil.addNhomMatHang(this);
		}
		else {
			NhomMatHangLocalServiceUtil.updateNhomMatHang(this);
		}
	}

	@Override
	public NhomMatHang toEscapedModel() {
		return (NhomMatHang)ProxyUtil.newProxyInstance(NhomMatHang.class.getClassLoader(),
			new Class[] { NhomMatHang.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		NhomMatHangClp clone = new NhomMatHangClp();

		clone.setNhomMatHangId(getNhomMatHangId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setName(getName());
		clone.setCode(getCode());
		clone.setStatus(getStatus());
		clone.setNote(getNote());

		return clone;
	}

	@Override
	public int compareTo(NhomMatHang nhomMatHang) {
		int value = 0;

		value = getName().compareTo(nhomMatHang.getName());

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

		if (!(obj instanceof NhomMatHangClp)) {
			return false;
		}

		NhomMatHangClp nhomMatHang = (NhomMatHangClp)obj;

		long primaryKey = nhomMatHang.getPrimaryKey();

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
		StringBundler sb = new StringBundler(23);

		sb.append("{nhomMatHangId=");
		sb.append(getNhomMatHangId());
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
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", note=");
		sb.append(getNote());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.minimart.portlet.mathang.model.NhomMatHang");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>nhomMatHangId</column-name><column-value><![CDATA[");
		sb.append(getNhomMatHangId());
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
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>note</column-name><column-value><![CDATA[");
		sb.append(getNote());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _nhomMatHangId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _code;
	private int _status;
	private String _note;
	private BaseModel<?> _nhomMatHangRemoteModel;
	private Class<?> _clpSerializerClass = com.minimart.portlet.mathang.service.ClpSerializer.class;
}