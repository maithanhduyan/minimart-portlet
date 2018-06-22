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

package com.minimart.portlet.thethanhtoan.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.minimart.portlet.thethanhtoan.service.ClpSerializer;
import com.minimart.portlet.thethanhtoan.service.TheTraTruocLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mai Thành Duy An
 */
public class TheTraTruocClp extends BaseModelImpl<TheTraTruoc>
	implements TheTraTruoc {
	public TheTraTruocClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return TheTraTruoc.class;
	}

	@Override
	public String getModelClassName() {
		return TheTraTruoc.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _theTraTruocId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTheTraTruocId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _theTraTruocId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("theTraTruocId", getTheTraTruocId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("tenThe", getTenThe());
		attributes.put("nhomTheTraTruocId", getNhomTheTraTruocId());
		attributes.put("khoa", getKhoa());
		attributes.put("ngayHetHan", getNgayHetHan());
		attributes.put("trangThai", getTrangThai());
		attributes.put("userModifiledId", getUserModifiledId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long theTraTruocId = (Long)attributes.get("theTraTruocId");

		if (theTraTruocId != null) {
			setTheTraTruocId(theTraTruocId);
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

		String tenThe = (String)attributes.get("tenThe");

		if (tenThe != null) {
			setTenThe(tenThe);
		}

		Long nhomTheTraTruocId = (Long)attributes.get("nhomTheTraTruocId");

		if (nhomTheTraTruocId != null) {
			setNhomTheTraTruocId(nhomTheTraTruocId);
		}

		Boolean khoa = (Boolean)attributes.get("khoa");

		if (khoa != null) {
			setKhoa(khoa);
		}

		Date ngayHetHan = (Date)attributes.get("ngayHetHan");

		if (ngayHetHan != null) {
			setNgayHetHan(ngayHetHan);
		}

		String trangThai = (String)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		Long userModifiledId = (Long)attributes.get("userModifiledId");

		if (userModifiledId != null) {
			setUserModifiledId(userModifiledId);
		}
	}

	@Override
	public long getTheTraTruocId() {
		return _theTraTruocId;
	}

	@Override
	public void setTheTraTruocId(long theTraTruocId) {
		_theTraTruocId = theTraTruocId;

		if (_theTraTruocRemoteModel != null) {
			try {
				Class<?> clazz = _theTraTruocRemoteModel.getClass();

				Method method = clazz.getMethod("setTheTraTruocId", long.class);

				method.invoke(_theTraTruocRemoteModel, theTraTruocId);
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

		if (_theTraTruocRemoteModel != null) {
			try {
				Class<?> clazz = _theTraTruocRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_theTraTruocRemoteModel, companyId);
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

		if (_theTraTruocRemoteModel != null) {
			try {
				Class<?> clazz = _theTraTruocRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_theTraTruocRemoteModel, userId);
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

		if (_theTraTruocRemoteModel != null) {
			try {
				Class<?> clazz = _theTraTruocRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_theTraTruocRemoteModel, userName);
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

		if (_theTraTruocRemoteModel != null) {
			try {
				Class<?> clazz = _theTraTruocRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_theTraTruocRemoteModel, createDate);
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

		if (_theTraTruocRemoteModel != null) {
			try {
				Class<?> clazz = _theTraTruocRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_theTraTruocRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenThe() {
		return _tenThe;
	}

	@Override
	public void setTenThe(String tenThe) {
		_tenThe = tenThe;

		if (_theTraTruocRemoteModel != null) {
			try {
				Class<?> clazz = _theTraTruocRemoteModel.getClass();

				Method method = clazz.getMethod("setTenThe", String.class);

				method.invoke(_theTraTruocRemoteModel, tenThe);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNhomTheTraTruocId() {
		return _nhomTheTraTruocId;
	}

	@Override
	public void setNhomTheTraTruocId(long nhomTheTraTruocId) {
		_nhomTheTraTruocId = nhomTheTraTruocId;

		if (_theTraTruocRemoteModel != null) {
			try {
				Class<?> clazz = _theTraTruocRemoteModel.getClass();

				Method method = clazz.getMethod("setNhomTheTraTruocId",
						long.class);

				method.invoke(_theTraTruocRemoteModel, nhomTheTraTruocId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getKhoa() {
		return _khoa;
	}

	@Override
	public boolean isKhoa() {
		return _khoa;
	}

	@Override
	public void setKhoa(boolean khoa) {
		_khoa = khoa;

		if (_theTraTruocRemoteModel != null) {
			try {
				Class<?> clazz = _theTraTruocRemoteModel.getClass();

				Method method = clazz.getMethod("setKhoa", boolean.class);

				method.invoke(_theTraTruocRemoteModel, khoa);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayHetHan() {
		return _ngayHetHan;
	}

	@Override
	public void setNgayHetHan(Date ngayHetHan) {
		_ngayHetHan = ngayHetHan;

		if (_theTraTruocRemoteModel != null) {
			try {
				Class<?> clazz = _theTraTruocRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayHetHan", Date.class);

				method.invoke(_theTraTruocRemoteModel, ngayHetHan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTrangThai() {
		return _trangThai;
	}

	@Override
	public void setTrangThai(String trangThai) {
		_trangThai = trangThai;

		if (_theTraTruocRemoteModel != null) {
			try {
				Class<?> clazz = _theTraTruocRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThai", String.class);

				method.invoke(_theTraTruocRemoteModel, trangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserModifiledId() {
		return _userModifiledId;
	}

	@Override
	public void setUserModifiledId(long userModifiledId) {
		_userModifiledId = userModifiledId;

		if (_theTraTruocRemoteModel != null) {
			try {
				Class<?> clazz = _theTraTruocRemoteModel.getClass();

				Method method = clazz.getMethod("setUserModifiledId", long.class);

				method.invoke(_theTraTruocRemoteModel, userModifiledId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getTheTraTruocRemoteModel() {
		return _theTraTruocRemoteModel;
	}

	public void setTheTraTruocRemoteModel(BaseModel<?> theTraTruocRemoteModel) {
		_theTraTruocRemoteModel = theTraTruocRemoteModel;
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

		Class<?> remoteModelClass = _theTraTruocRemoteModel.getClass();

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

		Object returnValue = method.invoke(_theTraTruocRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			TheTraTruocLocalServiceUtil.addTheTraTruoc(this);
		}
		else {
			TheTraTruocLocalServiceUtil.updateTheTraTruoc(this);
		}
	}

	@Override
	public TheTraTruoc toEscapedModel() {
		return (TheTraTruoc)ProxyUtil.newProxyInstance(TheTraTruoc.class.getClassLoader(),
			new Class[] { TheTraTruoc.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TheTraTruocClp clone = new TheTraTruocClp();

		clone.setTheTraTruocId(getTheTraTruocId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setTenThe(getTenThe());
		clone.setNhomTheTraTruocId(getNhomTheTraTruocId());
		clone.setKhoa(getKhoa());
		clone.setNgayHetHan(getNgayHetHan());
		clone.setTrangThai(getTrangThai());
		clone.setUserModifiledId(getUserModifiledId());

		return clone;
	}

	@Override
	public int compareTo(TheTraTruoc theTraTruoc) {
		int value = 0;

		value = getTenThe().compareTo(theTraTruoc.getTenThe());

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

		if (!(obj instanceof TheTraTruocClp)) {
			return false;
		}

		TheTraTruocClp theTraTruoc = (TheTraTruocClp)obj;

		long primaryKey = theTraTruoc.getPrimaryKey();

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
		StringBundler sb = new StringBundler(25);

		sb.append("{theTraTruocId=");
		sb.append(getTheTraTruocId());
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
		sb.append(", tenThe=");
		sb.append(getTenThe());
		sb.append(", nhomTheTraTruocId=");
		sb.append(getNhomTheTraTruocId());
		sb.append(", khoa=");
		sb.append(getKhoa());
		sb.append(", ngayHetHan=");
		sb.append(getNgayHetHan());
		sb.append(", trangThai=");
		sb.append(getTrangThai());
		sb.append(", userModifiledId=");
		sb.append(getUserModifiledId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.minimart.portlet.thethanhtoan.model.TheTraTruoc");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>theTraTruocId</column-name><column-value><![CDATA[");
		sb.append(getTheTraTruocId());
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
			"<column><column-name>tenThe</column-name><column-value><![CDATA[");
		sb.append(getTenThe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nhomTheTraTruocId</column-name><column-value><![CDATA[");
		sb.append(getNhomTheTraTruocId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>khoa</column-name><column-value><![CDATA[");
		sb.append(getKhoa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayHetHan</column-name><column-value><![CDATA[");
		sb.append(getNgayHetHan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThai</column-name><column-value><![CDATA[");
		sb.append(getTrangThai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userModifiledId</column-name><column-value><![CDATA[");
		sb.append(getUserModifiledId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _theTraTruocId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _tenThe;
	private long _nhomTheTraTruocId;
	private boolean _khoa;
	private Date _ngayHetHan;
	private String _trangThai;
	private long _userModifiledId;
	private BaseModel<?> _theTraTruocRemoteModel;
	private Class<?> _clpSerializerClass = com.minimart.portlet.thethanhtoan.service.ClpSerializer.class;
}