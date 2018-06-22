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
import com.minimart.portlet.khuyenmai.service.LoaiHinhKhuyenMaiLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mai Thành Duy An
 */
public class LoaiHinhKhuyenMaiClp extends BaseModelImpl<LoaiHinhKhuyenMai>
	implements LoaiHinhKhuyenMai {
	public LoaiHinhKhuyenMaiClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return LoaiHinhKhuyenMai.class;
	}

	@Override
	public String getModelClassName() {
		return LoaiHinhKhuyenMai.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _loaiHinhKhuyenMaiId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setLoaiHinhKhuyenMaiId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _loaiHinhKhuyenMaiId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("loaiHinhKhuyenMaiId", getLoaiHinhKhuyenMaiId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("trangThai", getTrangThai());
		attributes.put("tileGiamGia", getTileGiamGia());
		attributes.put("ngayBatDau", getNgayBatDau());
		attributes.put("ngayHetHan", getNgayHetHan());
		attributes.put("imageid", getImageid());
		attributes.put("ghiChu", getGhiChu());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long loaiHinhKhuyenMaiId = (Long)attributes.get("loaiHinhKhuyenMaiId");

		if (loaiHinhKhuyenMaiId != null) {
			setLoaiHinhKhuyenMaiId(loaiHinhKhuyenMaiId);
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

		Integer tileGiamGia = (Integer)attributes.get("tileGiamGia");

		if (tileGiamGia != null) {
			setTileGiamGia(tileGiamGia);
		}

		Date ngayBatDau = (Date)attributes.get("ngayBatDau");

		if (ngayBatDau != null) {
			setNgayBatDau(ngayBatDau);
		}

		Date ngayHetHan = (Date)attributes.get("ngayHetHan");

		if (ngayHetHan != null) {
			setNgayHetHan(ngayHetHan);
		}

		String imageid = (String)attributes.get("imageid");

		if (imageid != null) {
			setImageid(imageid);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}
	}

	@Override
	public long getLoaiHinhKhuyenMaiId() {
		return _loaiHinhKhuyenMaiId;
	}

	@Override
	public void setLoaiHinhKhuyenMaiId(long loaiHinhKhuyenMaiId) {
		_loaiHinhKhuyenMaiId = loaiHinhKhuyenMaiId;

		if (_loaiHinhKhuyenMaiRemoteModel != null) {
			try {
				Class<?> clazz = _loaiHinhKhuyenMaiRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiHinhKhuyenMaiId",
						long.class);

				method.invoke(_loaiHinhKhuyenMaiRemoteModel, loaiHinhKhuyenMaiId);
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

		if (_loaiHinhKhuyenMaiRemoteModel != null) {
			try {
				Class<?> clazz = _loaiHinhKhuyenMaiRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_loaiHinhKhuyenMaiRemoteModel, companyId);
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

		if (_loaiHinhKhuyenMaiRemoteModel != null) {
			try {
				Class<?> clazz = _loaiHinhKhuyenMaiRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_loaiHinhKhuyenMaiRemoteModel, userId);
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

		if (_loaiHinhKhuyenMaiRemoteModel != null) {
			try {
				Class<?> clazz = _loaiHinhKhuyenMaiRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_loaiHinhKhuyenMaiRemoteModel, userName);
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

		if (_loaiHinhKhuyenMaiRemoteModel != null) {
			try {
				Class<?> clazz = _loaiHinhKhuyenMaiRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_loaiHinhKhuyenMaiRemoteModel, createDate);
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

		if (_loaiHinhKhuyenMaiRemoteModel != null) {
			try {
				Class<?> clazz = _loaiHinhKhuyenMaiRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_loaiHinhKhuyenMaiRemoteModel, modifiedDate);
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

		if (_loaiHinhKhuyenMaiRemoteModel != null) {
			try {
				Class<?> clazz = _loaiHinhKhuyenMaiRemoteModel.getClass();

				Method method = clazz.getMethod("setTen", String.class);

				method.invoke(_loaiHinhKhuyenMaiRemoteModel, ten);
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

		if (_loaiHinhKhuyenMaiRemoteModel != null) {
			try {
				Class<?> clazz = _loaiHinhKhuyenMaiRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThai", boolean.class);

				method.invoke(_loaiHinhKhuyenMaiRemoteModel, trangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTileGiamGia() {
		return _tileGiamGia;
	}

	@Override
	public void setTileGiamGia(int tileGiamGia) {
		_tileGiamGia = tileGiamGia;

		if (_loaiHinhKhuyenMaiRemoteModel != null) {
			try {
				Class<?> clazz = _loaiHinhKhuyenMaiRemoteModel.getClass();

				Method method = clazz.getMethod("setTileGiamGia", int.class);

				method.invoke(_loaiHinhKhuyenMaiRemoteModel, tileGiamGia);
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

		if (_loaiHinhKhuyenMaiRemoteModel != null) {
			try {
				Class<?> clazz = _loaiHinhKhuyenMaiRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayBatDau", Date.class);

				method.invoke(_loaiHinhKhuyenMaiRemoteModel, ngayBatDau);
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

		if (_loaiHinhKhuyenMaiRemoteModel != null) {
			try {
				Class<?> clazz = _loaiHinhKhuyenMaiRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayHetHan", Date.class);

				method.invoke(_loaiHinhKhuyenMaiRemoteModel, ngayHetHan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImageid() {
		return _imageid;
	}

	@Override
	public void setImageid(String imageid) {
		_imageid = imageid;

		if (_loaiHinhKhuyenMaiRemoteModel != null) {
			try {
				Class<?> clazz = _loaiHinhKhuyenMaiRemoteModel.getClass();

				Method method = clazz.getMethod("setImageid", String.class);

				method.invoke(_loaiHinhKhuyenMaiRemoteModel, imageid);
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

		if (_loaiHinhKhuyenMaiRemoteModel != null) {
			try {
				Class<?> clazz = _loaiHinhKhuyenMaiRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_loaiHinhKhuyenMaiRemoteModel, ghiChu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLoaiHinhKhuyenMaiRemoteModel() {
		return _loaiHinhKhuyenMaiRemoteModel;
	}

	public void setLoaiHinhKhuyenMaiRemoteModel(
		BaseModel<?> loaiHinhKhuyenMaiRemoteModel) {
		_loaiHinhKhuyenMaiRemoteModel = loaiHinhKhuyenMaiRemoteModel;
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

		Class<?> remoteModelClass = _loaiHinhKhuyenMaiRemoteModel.getClass();

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

		Object returnValue = method.invoke(_loaiHinhKhuyenMaiRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LoaiHinhKhuyenMaiLocalServiceUtil.addLoaiHinhKhuyenMai(this);
		}
		else {
			LoaiHinhKhuyenMaiLocalServiceUtil.updateLoaiHinhKhuyenMai(this);
		}
	}

	@Override
	public LoaiHinhKhuyenMai toEscapedModel() {
		return (LoaiHinhKhuyenMai)ProxyUtil.newProxyInstance(LoaiHinhKhuyenMai.class.getClassLoader(),
			new Class[] { LoaiHinhKhuyenMai.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LoaiHinhKhuyenMaiClp clone = new LoaiHinhKhuyenMaiClp();

		clone.setLoaiHinhKhuyenMaiId(getLoaiHinhKhuyenMaiId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setTen(getTen());
		clone.setTrangThai(getTrangThai());
		clone.setTileGiamGia(getTileGiamGia());
		clone.setNgayBatDau(getNgayBatDau());
		clone.setNgayHetHan(getNgayHetHan());
		clone.setImageid(getImageid());
		clone.setGhiChu(getGhiChu());

		return clone;
	}

	@Override
	public int compareTo(LoaiHinhKhuyenMai loaiHinhKhuyenMai) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(),
				loaiHinhKhuyenMai.getCreateDate());

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

		if (!(obj instanceof LoaiHinhKhuyenMaiClp)) {
			return false;
		}

		LoaiHinhKhuyenMaiClp loaiHinhKhuyenMai = (LoaiHinhKhuyenMaiClp)obj;

		long primaryKey = loaiHinhKhuyenMai.getPrimaryKey();

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

		sb.append("{loaiHinhKhuyenMaiId=");
		sb.append(getLoaiHinhKhuyenMaiId());
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
		sb.append(", tileGiamGia=");
		sb.append(getTileGiamGia());
		sb.append(", ngayBatDau=");
		sb.append(getNgayBatDau());
		sb.append(", ngayHetHan=");
		sb.append(getNgayHetHan());
		sb.append(", imageid=");
		sb.append(getImageid());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.minimart.portlet.khuyenmai.model.LoaiHinhKhuyenMai");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>loaiHinhKhuyenMaiId</column-name><column-value><![CDATA[");
		sb.append(getLoaiHinhKhuyenMaiId());
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
			"<column><column-name>tileGiamGia</column-name><column-value><![CDATA[");
		sb.append(getTileGiamGia());
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
			"<column><column-name>imageid</column-name><column-value><![CDATA[");
		sb.append(getImageid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ghiChu</column-name><column-value><![CDATA[");
		sb.append(getGhiChu());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _loaiHinhKhuyenMaiId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private boolean _trangThai;
	private int _tileGiamGia;
	private Date _ngayBatDau;
	private Date _ngayHetHan;
	private String _imageid;
	private String _ghiChu;
	private BaseModel<?> _loaiHinhKhuyenMaiRemoteModel;
	private Class<?> _clpSerializerClass = com.minimart.portlet.khuyenmai.service.ClpSerializer.class;
}