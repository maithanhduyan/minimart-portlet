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

package com.minimart.portlet.khohang.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.minimart.portlet.khohang.service.ClpSerializer;
import com.minimart.portlet.khohang.service.KhoHangLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mai Thành Duy An
 */
public class KhoHangClp extends BaseModelImpl<KhoHang> implements KhoHang {
	public KhoHangClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return KhoHang.class;
	}

	@Override
	public String getModelClassName() {
		return KhoHang.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _khoHangId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setKhoHangId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _khoHangId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("khoHangId", getKhoHangId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("trangThai", getTrangThai());
		attributes.put("itemType", getItemType());
		attributes.put("choPhepNhapKho", getChoPhepNhapKho());
		attributes.put("cuaHangId", getCuaHangId());
		attributes.put("autoId", getAutoId());
		attributes.put("sigmaId", getSigmaId());
		attributes.put("ghiChu", getGhiChu());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long khoHangId = (Long)attributes.get("khoHangId");

		if (khoHangId != null) {
			setKhoHangId(khoHangId);
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

		Boolean trangThai = (Boolean)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		Integer itemType = (Integer)attributes.get("itemType");

		if (itemType != null) {
			setItemType(itemType);
		}

		Boolean choPhepNhapKho = (Boolean)attributes.get("choPhepNhapKho");

		if (choPhepNhapKho != null) {
			setChoPhepNhapKho(choPhepNhapKho);
		}

		Long cuaHangId = (Long)attributes.get("cuaHangId");

		if (cuaHangId != null) {
			setCuaHangId(cuaHangId);
		}

		Long autoId = (Long)attributes.get("autoId");

		if (autoId != null) {
			setAutoId(autoId);
		}

		Long sigmaId = (Long)attributes.get("sigmaId");

		if (sigmaId != null) {
			setSigmaId(sigmaId);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}
	}

	@Override
	public long getKhoHangId() {
		return _khoHangId;
	}

	@Override
	public void setKhoHangId(long khoHangId) {
		_khoHangId = khoHangId;

		if (_khoHangRemoteModel != null) {
			try {
				Class<?> clazz = _khoHangRemoteModel.getClass();

				Method method = clazz.getMethod("setKhoHangId", long.class);

				method.invoke(_khoHangRemoteModel, khoHangId);
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

		if (_khoHangRemoteModel != null) {
			try {
				Class<?> clazz = _khoHangRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_khoHangRemoteModel, companyId);
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

		if (_khoHangRemoteModel != null) {
			try {
				Class<?> clazz = _khoHangRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_khoHangRemoteModel, userId);
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

		if (_khoHangRemoteModel != null) {
			try {
				Class<?> clazz = _khoHangRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_khoHangRemoteModel, userName);
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

		if (_khoHangRemoteModel != null) {
			try {
				Class<?> clazz = _khoHangRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_khoHangRemoteModel, createDate);
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

		if (_khoHangRemoteModel != null) {
			try {
				Class<?> clazz = _khoHangRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_khoHangRemoteModel, modifiedDate);
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

		if (_khoHangRemoteModel != null) {
			try {
				Class<?> clazz = _khoHangRemoteModel.getClass();

				Method method = clazz.getMethod("setTen", String.class);

				method.invoke(_khoHangRemoteModel, ten);
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

		if (_khoHangRemoteModel != null) {
			try {
				Class<?> clazz = _khoHangRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThai", boolean.class);

				method.invoke(_khoHangRemoteModel, trangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getItemType() {
		return _itemType;
	}

	@Override
	public void setItemType(int itemType) {
		_itemType = itemType;

		if (_khoHangRemoteModel != null) {
			try {
				Class<?> clazz = _khoHangRemoteModel.getClass();

				Method method = clazz.getMethod("setItemType", int.class);

				method.invoke(_khoHangRemoteModel, itemType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getChoPhepNhapKho() {
		return _choPhepNhapKho;
	}

	@Override
	public boolean isChoPhepNhapKho() {
		return _choPhepNhapKho;
	}

	@Override
	public void setChoPhepNhapKho(boolean choPhepNhapKho) {
		_choPhepNhapKho = choPhepNhapKho;

		if (_khoHangRemoteModel != null) {
			try {
				Class<?> clazz = _khoHangRemoteModel.getClass();

				Method method = clazz.getMethod("setChoPhepNhapKho",
						boolean.class);

				method.invoke(_khoHangRemoteModel, choPhepNhapKho);
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

		if (_khoHangRemoteModel != null) {
			try {
				Class<?> clazz = _khoHangRemoteModel.getClass();

				Method method = clazz.getMethod("setCuaHangId", long.class);

				method.invoke(_khoHangRemoteModel, cuaHangId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getAutoId() {
		return _autoId;
	}

	@Override
	public void setAutoId(long autoId) {
		_autoId = autoId;

		if (_khoHangRemoteModel != null) {
			try {
				Class<?> clazz = _khoHangRemoteModel.getClass();

				Method method = clazz.getMethod("setAutoId", long.class);

				method.invoke(_khoHangRemoteModel, autoId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSigmaId() {
		return _sigmaId;
	}

	@Override
	public void setSigmaId(long sigmaId) {
		_sigmaId = sigmaId;

		if (_khoHangRemoteModel != null) {
			try {
				Class<?> clazz = _khoHangRemoteModel.getClass();

				Method method = clazz.getMethod("setSigmaId", long.class);

				method.invoke(_khoHangRemoteModel, sigmaId);
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

		if (_khoHangRemoteModel != null) {
			try {
				Class<?> clazz = _khoHangRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_khoHangRemoteModel, ghiChu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getKhoHangRemoteModel() {
		return _khoHangRemoteModel;
	}

	public void setKhoHangRemoteModel(BaseModel<?> khoHangRemoteModel) {
		_khoHangRemoteModel = khoHangRemoteModel;
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

		Class<?> remoteModelClass = _khoHangRemoteModel.getClass();

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

		Object returnValue = method.invoke(_khoHangRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			KhoHangLocalServiceUtil.addKhoHang(this);
		}
		else {
			KhoHangLocalServiceUtil.updateKhoHang(this);
		}
	}

	@Override
	public KhoHang toEscapedModel() {
		return (KhoHang)ProxyUtil.newProxyInstance(KhoHang.class.getClassLoader(),
			new Class[] { KhoHang.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		KhoHangClp clone = new KhoHangClp();

		clone.setKhoHangId(getKhoHangId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setTen(getTen());
		clone.setTrangThai(getTrangThai());
		clone.setItemType(getItemType());
		clone.setChoPhepNhapKho(getChoPhepNhapKho());
		clone.setCuaHangId(getCuaHangId());
		clone.setAutoId(getAutoId());
		clone.setSigmaId(getSigmaId());
		clone.setGhiChu(getGhiChu());

		return clone;
	}

	@Override
	public int compareTo(KhoHang khoHang) {
		int value = 0;

		value = getTen().compareTo(khoHang.getTen());

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

		if (!(obj instanceof KhoHangClp)) {
			return false;
		}

		KhoHangClp khoHang = (KhoHangClp)obj;

		long primaryKey = khoHang.getPrimaryKey();

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

		sb.append("{khoHangId=");
		sb.append(getKhoHangId());
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
		sb.append(", trangThai=");
		sb.append(getTrangThai());
		sb.append(", itemType=");
		sb.append(getItemType());
		sb.append(", choPhepNhapKho=");
		sb.append(getChoPhepNhapKho());
		sb.append(", cuaHangId=");
		sb.append(getCuaHangId());
		sb.append(", autoId=");
		sb.append(getAutoId());
		sb.append(", sigmaId=");
		sb.append(getSigmaId());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("com.minimart.portlet.khohang.model.KhoHang");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>khoHangId</column-name><column-value><![CDATA[");
		sb.append(getKhoHangId());
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
			"<column><column-name>trangThai</column-name><column-value><![CDATA[");
		sb.append(getTrangThai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>itemType</column-name><column-value><![CDATA[");
		sb.append(getItemType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>choPhepNhapKho</column-name><column-value><![CDATA[");
		sb.append(getChoPhepNhapKho());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cuaHangId</column-name><column-value><![CDATA[");
		sb.append(getCuaHangId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>autoId</column-name><column-value><![CDATA[");
		sb.append(getAutoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sigmaId</column-name><column-value><![CDATA[");
		sb.append(getSigmaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ghiChu</column-name><column-value><![CDATA[");
		sb.append(getGhiChu());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _khoHangId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private boolean _trangThai;
	private int _itemType;
	private boolean _choPhepNhapKho;
	private long _cuaHangId;
	private long _autoId;
	private long _sigmaId;
	private String _ghiChu;
	private BaseModel<?> _khoHangRemoteModel;
	private Class<?> _clpSerializerClass = com.minimart.portlet.khohang.service.ClpSerializer.class;
}