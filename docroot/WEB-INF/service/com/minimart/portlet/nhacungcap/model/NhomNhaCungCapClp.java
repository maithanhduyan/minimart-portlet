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

package com.minimart.portlet.nhacungcap.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.minimart.portlet.nhacungcap.service.ClpSerializer;
import com.minimart.portlet.nhacungcap.service.NhomNhaCungCapLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mai Thành Duy An
 */
public class NhomNhaCungCapClp extends BaseModelImpl<NhomNhaCungCap>
	implements NhomNhaCungCap {
	public NhomNhaCungCapClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return NhomNhaCungCap.class;
	}

	@Override
	public String getModelClassName() {
		return NhomNhaCungCap.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _nhomNhaCungCapId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setNhomNhaCungCapId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _nhomNhaCungCapId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("nhomNhaCungCapId", getNhomNhaCungCapId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("hoatDong", getHoatDong());
		attributes.put("uuTien", getUuTien());
		attributes.put("image", getImage());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long nhomNhaCungCapId = (Long)attributes.get("nhomNhaCungCapId");

		if (nhomNhaCungCapId != null) {
			setNhomNhaCungCapId(nhomNhaCungCapId);
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

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		Boolean hoatDong = (Boolean)attributes.get("hoatDong");

		if (hoatDong != null) {
			setHoatDong(hoatDong);
		}

		Integer uuTien = (Integer)attributes.get("uuTien");

		if (uuTien != null) {
			setUuTien(uuTien);
		}

		String image = (String)attributes.get("image");

		if (image != null) {
			setImage(image);
		}
	}

	@Override
	public long getNhomNhaCungCapId() {
		return _nhomNhaCungCapId;
	}

	@Override
	public void setNhomNhaCungCapId(long nhomNhaCungCapId) {
		_nhomNhaCungCapId = nhomNhaCungCapId;

		if (_nhomNhaCungCapRemoteModel != null) {
			try {
				Class<?> clazz = _nhomNhaCungCapRemoteModel.getClass();

				Method method = clazz.getMethod("setNhomNhaCungCapId",
						long.class);

				method.invoke(_nhomNhaCungCapRemoteModel, nhomNhaCungCapId);
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

		if (_nhomNhaCungCapRemoteModel != null) {
			try {
				Class<?> clazz = _nhomNhaCungCapRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_nhomNhaCungCapRemoteModel, companyId);
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

		if (_nhomNhaCungCapRemoteModel != null) {
			try {
				Class<?> clazz = _nhomNhaCungCapRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_nhomNhaCungCapRemoteModel, userId);
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

		if (_nhomNhaCungCapRemoteModel != null) {
			try {
				Class<?> clazz = _nhomNhaCungCapRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_nhomNhaCungCapRemoteModel, userName);
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

		if (_nhomNhaCungCapRemoteModel != null) {
			try {
				Class<?> clazz = _nhomNhaCungCapRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_nhomNhaCungCapRemoteModel, createDate);
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

		if (_nhomNhaCungCapRemoteModel != null) {
			try {
				Class<?> clazz = _nhomNhaCungCapRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_nhomNhaCungCapRemoteModel, modifiedDate);
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

		if (_nhomNhaCungCapRemoteModel != null) {
			try {
				Class<?> clazz = _nhomNhaCungCapRemoteModel.getClass();

				Method method = clazz.getMethod("setTen", String.class);

				method.invoke(_nhomNhaCungCapRemoteModel, ten);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGhiChu() {
		return _ghiChu;
	}

	@Override
	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;

		if (_nhomNhaCungCapRemoteModel != null) {
			try {
				Class<?> clazz = _nhomNhaCungCapRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_nhomNhaCungCapRemoteModel, ghiChu);
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

		if (_nhomNhaCungCapRemoteModel != null) {
			try {
				Class<?> clazz = _nhomNhaCungCapRemoteModel.getClass();

				Method method = clazz.getMethod("setHoatDong", boolean.class);

				method.invoke(_nhomNhaCungCapRemoteModel, hoatDong);
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

		if (_nhomNhaCungCapRemoteModel != null) {
			try {
				Class<?> clazz = _nhomNhaCungCapRemoteModel.getClass();

				Method method = clazz.getMethod("setUuTien", int.class);

				method.invoke(_nhomNhaCungCapRemoteModel, uuTien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImage() {
		return _image;
	}

	@Override
	public void setImage(String image) {
		_image = image;

		if (_nhomNhaCungCapRemoteModel != null) {
			try {
				Class<?> clazz = _nhomNhaCungCapRemoteModel.getClass();

				Method method = clazz.getMethod("setImage", String.class);

				method.invoke(_nhomNhaCungCapRemoteModel, image);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getNhomNhaCungCapRemoteModel() {
		return _nhomNhaCungCapRemoteModel;
	}

	public void setNhomNhaCungCapRemoteModel(
		BaseModel<?> nhomNhaCungCapRemoteModel) {
		_nhomNhaCungCapRemoteModel = nhomNhaCungCapRemoteModel;
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

		Class<?> remoteModelClass = _nhomNhaCungCapRemoteModel.getClass();

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

		Object returnValue = method.invoke(_nhomNhaCungCapRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			NhomNhaCungCapLocalServiceUtil.addNhomNhaCungCap(this);
		}
		else {
			NhomNhaCungCapLocalServiceUtil.updateNhomNhaCungCap(this);
		}
	}

	@Override
	public NhomNhaCungCap toEscapedModel() {
		return (NhomNhaCungCap)ProxyUtil.newProxyInstance(NhomNhaCungCap.class.getClassLoader(),
			new Class[] { NhomNhaCungCap.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		NhomNhaCungCapClp clone = new NhomNhaCungCapClp();

		clone.setNhomNhaCungCapId(getNhomNhaCungCapId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setTen(getTen());
		clone.setGhiChu(getGhiChu());
		clone.setHoatDong(getHoatDong());
		clone.setUuTien(getUuTien());
		clone.setImage(getImage());

		return clone;
	}

	@Override
	public int compareTo(NhomNhaCungCap nhomNhaCungCap) {
		int value = 0;

		value = getTen().compareTo(nhomNhaCungCap.getTen());

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

		if (!(obj instanceof NhomNhaCungCapClp)) {
			return false;
		}

		NhomNhaCungCapClp nhomNhaCungCap = (NhomNhaCungCapClp)obj;

		long primaryKey = nhomNhaCungCap.getPrimaryKey();

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

		sb.append("{nhomNhaCungCapId=");
		sb.append(getNhomNhaCungCapId());
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
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append(", hoatDong=");
		sb.append(getHoatDong());
		sb.append(", uuTien=");
		sb.append(getUuTien());
		sb.append(", image=");
		sb.append(getImage());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.minimart.portlet.nhacungcap.model.NhomNhaCungCap");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>nhomNhaCungCapId</column-name><column-value><![CDATA[");
		sb.append(getNhomNhaCungCapId());
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
			"<column><column-name>ghiChu</column-name><column-value><![CDATA[");
		sb.append(getGhiChu());
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
			"<column><column-name>image</column-name><column-value><![CDATA[");
		sb.append(getImage());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _nhomNhaCungCapId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private String _ghiChu;
	private boolean _hoatDong;
	private int _uuTien;
	private String _image;
	private BaseModel<?> _nhomNhaCungCapRemoteModel;
	private Class<?> _clpSerializerClass = com.minimart.portlet.nhacungcap.service.ClpSerializer.class;
}