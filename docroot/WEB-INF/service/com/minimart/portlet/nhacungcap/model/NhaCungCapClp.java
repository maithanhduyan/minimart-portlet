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
import com.minimart.portlet.nhacungcap.service.NhaCungCapLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mai Thành Duy An
 */
public class NhaCungCapClp extends BaseModelImpl<NhaCungCap>
	implements NhaCungCap {
	public NhaCungCapClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return NhaCungCap.class;
	}

	@Override
	public String getModelClassName() {
		return NhaCungCap.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _nhaCungCapId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setNhaCungCapId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _nhaCungCapId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("nhaCungCapId", getNhaCungCapId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("tenNhaCungCap", getTenNhaCungCap());
		attributes.put("nhomNhaCungCapId", getNhomNhaCungCapId());
		attributes.put("maNhaCungCap", getMaNhaCungCap());
		attributes.put("diaChi", getDiaChi());
		attributes.put("dienThoai", getDienThoai());
		attributes.put("email", getEmail());
		attributes.put("website", getWebsite());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("hoatDong", getHoatDong());
		attributes.put("doUuTien", getDoUuTien());
		attributes.put("logoURL", getLogoURL());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long nhaCungCapId = (Long)attributes.get("nhaCungCapId");

		if (nhaCungCapId != null) {
			setNhaCungCapId(nhaCungCapId);
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

		String tenNhaCungCap = (String)attributes.get("tenNhaCungCap");

		if (tenNhaCungCap != null) {
			setTenNhaCungCap(tenNhaCungCap);
		}

		Long nhomNhaCungCapId = (Long)attributes.get("nhomNhaCungCapId");

		if (nhomNhaCungCapId != null) {
			setNhomNhaCungCapId(nhomNhaCungCapId);
		}

		String maNhaCungCap = (String)attributes.get("maNhaCungCap");

		if (maNhaCungCap != null) {
			setMaNhaCungCap(maNhaCungCap);
		}

		String diaChi = (String)attributes.get("diaChi");

		if (diaChi != null) {
			setDiaChi(diaChi);
		}

		String dienThoai = (String)attributes.get("dienThoai");

		if (dienThoai != null) {
			setDienThoai(dienThoai);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String website = (String)attributes.get("website");

		if (website != null) {
			setWebsite(website);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		Boolean hoatDong = (Boolean)attributes.get("hoatDong");

		if (hoatDong != null) {
			setHoatDong(hoatDong);
		}

		Integer doUuTien = (Integer)attributes.get("doUuTien");

		if (doUuTien != null) {
			setDoUuTien(doUuTien);
		}

		String logoURL = (String)attributes.get("logoURL");

		if (logoURL != null) {
			setLogoURL(logoURL);
		}
	}

	@Override
	public long getNhaCungCapId() {
		return _nhaCungCapId;
	}

	@Override
	public void setNhaCungCapId(long nhaCungCapId) {
		_nhaCungCapId = nhaCungCapId;

		if (_nhaCungCapRemoteModel != null) {
			try {
				Class<?> clazz = _nhaCungCapRemoteModel.getClass();

				Method method = clazz.getMethod("setNhaCungCapId", long.class);

				method.invoke(_nhaCungCapRemoteModel, nhaCungCapId);
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

		if (_nhaCungCapRemoteModel != null) {
			try {
				Class<?> clazz = _nhaCungCapRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_nhaCungCapRemoteModel, companyId);
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

		if (_nhaCungCapRemoteModel != null) {
			try {
				Class<?> clazz = _nhaCungCapRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_nhaCungCapRemoteModel, userId);
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

		if (_nhaCungCapRemoteModel != null) {
			try {
				Class<?> clazz = _nhaCungCapRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_nhaCungCapRemoteModel, userName);
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

		if (_nhaCungCapRemoteModel != null) {
			try {
				Class<?> clazz = _nhaCungCapRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_nhaCungCapRemoteModel, createDate);
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

		if (_nhaCungCapRemoteModel != null) {
			try {
				Class<?> clazz = _nhaCungCapRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_nhaCungCapRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenNhaCungCap() {
		return _tenNhaCungCap;
	}

	@Override
	public void setTenNhaCungCap(String tenNhaCungCap) {
		_tenNhaCungCap = tenNhaCungCap;

		if (_nhaCungCapRemoteModel != null) {
			try {
				Class<?> clazz = _nhaCungCapRemoteModel.getClass();

				Method method = clazz.getMethod("setTenNhaCungCap", String.class);

				method.invoke(_nhaCungCapRemoteModel, tenNhaCungCap);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNhomNhaCungCapId() {
		return _nhomNhaCungCapId;
	}

	@Override
	public void setNhomNhaCungCapId(long nhomNhaCungCapId) {
		_nhomNhaCungCapId = nhomNhaCungCapId;

		if (_nhaCungCapRemoteModel != null) {
			try {
				Class<?> clazz = _nhaCungCapRemoteModel.getClass();

				Method method = clazz.getMethod("setNhomNhaCungCapId",
						long.class);

				method.invoke(_nhaCungCapRemoteModel, nhomNhaCungCapId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaNhaCungCap() {
		return _maNhaCungCap;
	}

	@Override
	public void setMaNhaCungCap(String maNhaCungCap) {
		_maNhaCungCap = maNhaCungCap;

		if (_nhaCungCapRemoteModel != null) {
			try {
				Class<?> clazz = _nhaCungCapRemoteModel.getClass();

				Method method = clazz.getMethod("setMaNhaCungCap", String.class);

				method.invoke(_nhaCungCapRemoteModel, maNhaCungCap);
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

		if (_nhaCungCapRemoteModel != null) {
			try {
				Class<?> clazz = _nhaCungCapRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChi", String.class);

				method.invoke(_nhaCungCapRemoteModel, diaChi);
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

		if (_nhaCungCapRemoteModel != null) {
			try {
				Class<?> clazz = _nhaCungCapRemoteModel.getClass();

				Method method = clazz.getMethod("setDienThoai", String.class);

				method.invoke(_nhaCungCapRemoteModel, dienThoai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmail() {
		return _email;
	}

	@Override
	public void setEmail(String email) {
		_email = email;

		if (_nhaCungCapRemoteModel != null) {
			try {
				Class<?> clazz = _nhaCungCapRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_nhaCungCapRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getWebsite() {
		return _website;
	}

	@Override
	public void setWebsite(String website) {
		_website = website;

		if (_nhaCungCapRemoteModel != null) {
			try {
				Class<?> clazz = _nhaCungCapRemoteModel.getClass();

				Method method = clazz.getMethod("setWebsite", String.class);

				method.invoke(_nhaCungCapRemoteModel, website);
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

		if (_nhaCungCapRemoteModel != null) {
			try {
				Class<?> clazz = _nhaCungCapRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_nhaCungCapRemoteModel, ghiChu);
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

		if (_nhaCungCapRemoteModel != null) {
			try {
				Class<?> clazz = _nhaCungCapRemoteModel.getClass();

				Method method = clazz.getMethod("setHoatDong", boolean.class);

				method.invoke(_nhaCungCapRemoteModel, hoatDong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDoUuTien() {
		return _doUuTien;
	}

	@Override
	public void setDoUuTien(int doUuTien) {
		_doUuTien = doUuTien;

		if (_nhaCungCapRemoteModel != null) {
			try {
				Class<?> clazz = _nhaCungCapRemoteModel.getClass();

				Method method = clazz.getMethod("setDoUuTien", int.class);

				method.invoke(_nhaCungCapRemoteModel, doUuTien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLogoURL() {
		return _logoURL;
	}

	@Override
	public void setLogoURL(String logoURL) {
		_logoURL = logoURL;

		if (_nhaCungCapRemoteModel != null) {
			try {
				Class<?> clazz = _nhaCungCapRemoteModel.getClass();

				Method method = clazz.getMethod("setLogoURL", String.class);

				method.invoke(_nhaCungCapRemoteModel, logoURL);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getNhaCungCapRemoteModel() {
		return _nhaCungCapRemoteModel;
	}

	public void setNhaCungCapRemoteModel(BaseModel<?> nhaCungCapRemoteModel) {
		_nhaCungCapRemoteModel = nhaCungCapRemoteModel;
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

		Class<?> remoteModelClass = _nhaCungCapRemoteModel.getClass();

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

		Object returnValue = method.invoke(_nhaCungCapRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			NhaCungCapLocalServiceUtil.addNhaCungCap(this);
		}
		else {
			NhaCungCapLocalServiceUtil.updateNhaCungCap(this);
		}
	}

	@Override
	public NhaCungCap toEscapedModel() {
		return (NhaCungCap)ProxyUtil.newProxyInstance(NhaCungCap.class.getClassLoader(),
			new Class[] { NhaCungCap.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		NhaCungCapClp clone = new NhaCungCapClp();

		clone.setNhaCungCapId(getNhaCungCapId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setTenNhaCungCap(getTenNhaCungCap());
		clone.setNhomNhaCungCapId(getNhomNhaCungCapId());
		clone.setMaNhaCungCap(getMaNhaCungCap());
		clone.setDiaChi(getDiaChi());
		clone.setDienThoai(getDienThoai());
		clone.setEmail(getEmail());
		clone.setWebsite(getWebsite());
		clone.setGhiChu(getGhiChu());
		clone.setHoatDong(getHoatDong());
		clone.setDoUuTien(getDoUuTien());
		clone.setLogoURL(getLogoURL());

		return clone;
	}

	@Override
	public int compareTo(NhaCungCap nhaCungCap) {
		int value = 0;

		value = getTenNhaCungCap().compareTo(nhaCungCap.getTenNhaCungCap());

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

		if (!(obj instanceof NhaCungCapClp)) {
			return false;
		}

		NhaCungCapClp nhaCungCap = (NhaCungCapClp)obj;

		long primaryKey = nhaCungCap.getPrimaryKey();

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
		StringBundler sb = new StringBundler(35);

		sb.append("{nhaCungCapId=");
		sb.append(getNhaCungCapId());
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
		sb.append(", tenNhaCungCap=");
		sb.append(getTenNhaCungCap());
		sb.append(", nhomNhaCungCapId=");
		sb.append(getNhomNhaCungCapId());
		sb.append(", maNhaCungCap=");
		sb.append(getMaNhaCungCap());
		sb.append(", diaChi=");
		sb.append(getDiaChi());
		sb.append(", dienThoai=");
		sb.append(getDienThoai());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", website=");
		sb.append(getWebsite());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append(", hoatDong=");
		sb.append(getHoatDong());
		sb.append(", doUuTien=");
		sb.append(getDoUuTien());
		sb.append(", logoURL=");
		sb.append(getLogoURL());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("com.minimart.portlet.nhacungcap.model.NhaCungCap");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>nhaCungCapId</column-name><column-value><![CDATA[");
		sb.append(getNhaCungCapId());
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
			"<column><column-name>tenNhaCungCap</column-name><column-value><![CDATA[");
		sb.append(getTenNhaCungCap());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nhomNhaCungCapId</column-name><column-value><![CDATA[");
		sb.append(getNhomNhaCungCapId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maNhaCungCap</column-name><column-value><![CDATA[");
		sb.append(getMaNhaCungCap());
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
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>website</column-name><column-value><![CDATA[");
		sb.append(getWebsite());
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
			"<column><column-name>doUuTien</column-name><column-value><![CDATA[");
		sb.append(getDoUuTien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>logoURL</column-name><column-value><![CDATA[");
		sb.append(getLogoURL());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _nhaCungCapId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _tenNhaCungCap;
	private long _nhomNhaCungCapId;
	private String _maNhaCungCap;
	private String _diaChi;
	private String _dienThoai;
	private String _email;
	private String _website;
	private String _ghiChu;
	private boolean _hoatDong;
	private int _doUuTien;
	private String _logoURL;
	private BaseModel<?> _nhaCungCapRemoteModel;
	private Class<?> _clpSerializerClass = com.minimart.portlet.nhacungcap.service.ClpSerializer.class;
}