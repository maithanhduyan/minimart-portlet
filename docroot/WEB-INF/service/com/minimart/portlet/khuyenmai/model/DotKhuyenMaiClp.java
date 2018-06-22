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

package com.minimart.portlet.khuyenmai.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.minimart.portlet.khuyenmai.service.ClpSerializer;
import com.minimart.portlet.khuyenmai.service.DotKhuyenMaiLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mai Thành Duy An
 */
public class DotKhuyenMaiClp extends BaseModelImpl<DotKhuyenMai>
	implements DotKhuyenMai {
	public DotKhuyenMaiClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DotKhuyenMai.class;
	}

	@Override
	public String getModelClassName() {
		return DotKhuyenMai.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _dotKhuyenMaiId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDotKhuyenMaiId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dotKhuyenMaiId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dotKhuyenMaiId", getDotKhuyenMaiId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("trangThai", getTrangThai());
		attributes.put("userModifieldId", getUserModifieldId());
		attributes.put("ngayBatDau", getNgayBatDau());
		attributes.put("ngayHetHan", getNgayHetHan());
		attributes.put("ngungApDung", getNgungApDung());
		attributes.put("tiLeGiaGia", getTiLeGiaGia());
		attributes.put("ghiChu", getGhiChu());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dotKhuyenMaiId = (Long)attributes.get("dotKhuyenMaiId");

		if (dotKhuyenMaiId != null) {
			setDotKhuyenMaiId(dotKhuyenMaiId);
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

		Long userModifieldId = (Long)attributes.get("userModifieldId");

		if (userModifieldId != null) {
			setUserModifieldId(userModifieldId);
		}

		Date ngayBatDau = (Date)attributes.get("ngayBatDau");

		if (ngayBatDau != null) {
			setNgayBatDau(ngayBatDau);
		}

		Date ngayHetHan = (Date)attributes.get("ngayHetHan");

		if (ngayHetHan != null) {
			setNgayHetHan(ngayHetHan);
		}

		Boolean ngungApDung = (Boolean)attributes.get("ngungApDung");

		if (ngungApDung != null) {
			setNgungApDung(ngungApDung);
		}

		Integer tiLeGiaGia = (Integer)attributes.get("tiLeGiaGia");

		if (tiLeGiaGia != null) {
			setTiLeGiaGia(tiLeGiaGia);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}
	}

	@Override
	public long getDotKhuyenMaiId() {
		return _dotKhuyenMaiId;
	}

	@Override
	public void setDotKhuyenMaiId(long dotKhuyenMaiId) {
		_dotKhuyenMaiId = dotKhuyenMaiId;

		if (_dotKhuyenMaiRemoteModel != null) {
			try {
				Class<?> clazz = _dotKhuyenMaiRemoteModel.getClass();

				Method method = clazz.getMethod("setDotKhuyenMaiId", long.class);

				method.invoke(_dotKhuyenMaiRemoteModel, dotKhuyenMaiId);
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

		if (_dotKhuyenMaiRemoteModel != null) {
			try {
				Class<?> clazz = _dotKhuyenMaiRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_dotKhuyenMaiRemoteModel, companyId);
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

		if (_dotKhuyenMaiRemoteModel != null) {
			try {
				Class<?> clazz = _dotKhuyenMaiRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_dotKhuyenMaiRemoteModel, userId);
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

		if (_dotKhuyenMaiRemoteModel != null) {
			try {
				Class<?> clazz = _dotKhuyenMaiRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_dotKhuyenMaiRemoteModel, userName);
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

		if (_dotKhuyenMaiRemoteModel != null) {
			try {
				Class<?> clazz = _dotKhuyenMaiRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_dotKhuyenMaiRemoteModel, createDate);
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

		if (_dotKhuyenMaiRemoteModel != null) {
			try {
				Class<?> clazz = _dotKhuyenMaiRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dotKhuyenMaiRemoteModel, modifiedDate);
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

		if (_dotKhuyenMaiRemoteModel != null) {
			try {
				Class<?> clazz = _dotKhuyenMaiRemoteModel.getClass();

				Method method = clazz.getMethod("setTen", String.class);

				method.invoke(_dotKhuyenMaiRemoteModel, ten);
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

		if (_dotKhuyenMaiRemoteModel != null) {
			try {
				Class<?> clazz = _dotKhuyenMaiRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThai", boolean.class);

				method.invoke(_dotKhuyenMaiRemoteModel, trangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserModifieldId() {
		return _userModifieldId;
	}

	@Override
	public void setUserModifieldId(long userModifieldId) {
		_userModifieldId = userModifieldId;

		if (_dotKhuyenMaiRemoteModel != null) {
			try {
				Class<?> clazz = _dotKhuyenMaiRemoteModel.getClass();

				Method method = clazz.getMethod("setUserModifieldId", long.class);

				method.invoke(_dotKhuyenMaiRemoteModel, userModifieldId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayBatDau() {
		return _ngayBatDau;
	}

	@Override
	public void setNgayBatDau(Date ngayBatDau) {
		_ngayBatDau = ngayBatDau;

		if (_dotKhuyenMaiRemoteModel != null) {
			try {
				Class<?> clazz = _dotKhuyenMaiRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayBatDau", Date.class);

				method.invoke(_dotKhuyenMaiRemoteModel, ngayBatDau);
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

		if (_dotKhuyenMaiRemoteModel != null) {
			try {
				Class<?> clazz = _dotKhuyenMaiRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayHetHan", Date.class);

				method.invoke(_dotKhuyenMaiRemoteModel, ngayHetHan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getNgungApDung() {
		return _ngungApDung;
	}

	@Override
	public boolean isNgungApDung() {
		return _ngungApDung;
	}

	@Override
	public void setNgungApDung(boolean ngungApDung) {
		_ngungApDung = ngungApDung;

		if (_dotKhuyenMaiRemoteModel != null) {
			try {
				Class<?> clazz = _dotKhuyenMaiRemoteModel.getClass();

				Method method = clazz.getMethod("setNgungApDung", boolean.class);

				method.invoke(_dotKhuyenMaiRemoteModel, ngungApDung);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTiLeGiaGia() {
		return _tiLeGiaGia;
	}

	@Override
	public void setTiLeGiaGia(int tiLeGiaGia) {
		_tiLeGiaGia = tiLeGiaGia;

		if (_dotKhuyenMaiRemoteModel != null) {
			try {
				Class<?> clazz = _dotKhuyenMaiRemoteModel.getClass();

				Method method = clazz.getMethod("setTiLeGiaGia", int.class);

				method.invoke(_dotKhuyenMaiRemoteModel, tiLeGiaGia);
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

		if (_dotKhuyenMaiRemoteModel != null) {
			try {
				Class<?> clazz = _dotKhuyenMaiRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_dotKhuyenMaiRemoteModel, ghiChu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDotKhuyenMaiRemoteModel() {
		return _dotKhuyenMaiRemoteModel;
	}

	public void setDotKhuyenMaiRemoteModel(BaseModel<?> dotKhuyenMaiRemoteModel) {
		_dotKhuyenMaiRemoteModel = dotKhuyenMaiRemoteModel;
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

		Class<?> remoteModelClass = _dotKhuyenMaiRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dotKhuyenMaiRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DotKhuyenMaiLocalServiceUtil.addDotKhuyenMai(this);
		}
		else {
			DotKhuyenMaiLocalServiceUtil.updateDotKhuyenMai(this);
		}
	}

	@Override
	public DotKhuyenMai toEscapedModel() {
		return (DotKhuyenMai)ProxyUtil.newProxyInstance(DotKhuyenMai.class.getClassLoader(),
			new Class[] { DotKhuyenMai.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DotKhuyenMaiClp clone = new DotKhuyenMaiClp();

		clone.setDotKhuyenMaiId(getDotKhuyenMaiId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setTen(getTen());
		clone.setTrangThai(getTrangThai());
		clone.setUserModifieldId(getUserModifieldId());
		clone.setNgayBatDau(getNgayBatDau());
		clone.setNgayHetHan(getNgayHetHan());
		clone.setNgungApDung(getNgungApDung());
		clone.setTiLeGiaGia(getTiLeGiaGia());
		clone.setGhiChu(getGhiChu());

		return clone;
	}

	@Override
	public int compareTo(DotKhuyenMai dotKhuyenMai) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), dotKhuyenMai.getCreateDate());

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

		if (!(obj instanceof DotKhuyenMaiClp)) {
			return false;
		}

		DotKhuyenMaiClp dotKhuyenMai = (DotKhuyenMaiClp)obj;

		long primaryKey = dotKhuyenMai.getPrimaryKey();

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

		sb.append("{dotKhuyenMaiId=");
		sb.append(getDotKhuyenMaiId());
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
		sb.append(", userModifieldId=");
		sb.append(getUserModifieldId());
		sb.append(", ngayBatDau=");
		sb.append(getNgayBatDau());
		sb.append(", ngayHetHan=");
		sb.append(getNgayHetHan());
		sb.append(", ngungApDung=");
		sb.append(getNgungApDung());
		sb.append(", tiLeGiaGia=");
		sb.append(getTiLeGiaGia());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("com.minimart.portlet.khuyenmai.model.DotKhuyenMai");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>dotKhuyenMaiId</column-name><column-value><![CDATA[");
		sb.append(getDotKhuyenMaiId());
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
			"<column><column-name>userModifieldId</column-name><column-value><![CDATA[");
		sb.append(getUserModifieldId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayBatDau</column-name><column-value><![CDATA[");
		sb.append(getNgayBatDau());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayHetHan</column-name><column-value><![CDATA[");
		sb.append(getNgayHetHan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngungApDung</column-name><column-value><![CDATA[");
		sb.append(getNgungApDung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tiLeGiaGia</column-name><column-value><![CDATA[");
		sb.append(getTiLeGiaGia());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ghiChu</column-name><column-value><![CDATA[");
		sb.append(getGhiChu());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _dotKhuyenMaiId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private boolean _trangThai;
	private long _userModifieldId;
	private Date _ngayBatDau;
	private Date _ngayHetHan;
	private boolean _ngungApDung;
	private int _tiLeGiaGia;
	private String _ghiChu;
	private BaseModel<?> _dotKhuyenMaiRemoteModel;
	private Class<?> _clpSerializerClass = com.minimart.portlet.khuyenmai.service.ClpSerializer.class;
}