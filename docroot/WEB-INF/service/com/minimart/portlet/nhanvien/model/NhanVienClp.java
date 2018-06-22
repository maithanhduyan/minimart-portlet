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

package com.minimart.portlet.nhanvien.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.minimart.portlet.nhanvien.service.ClpSerializer;
import com.minimart.portlet.nhanvien.service.NhanVienLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mai Thành Duy An
 */
public class NhanVienClp extends BaseModelImpl<NhanVien> implements NhanVien {
	public NhanVienClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return NhanVien.class;
	}

	@Override
	public String getModelClassName() {
		return NhanVien.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _nhanVienId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setNhanVienId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _nhanVienId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("nhanVienId", getNhanVienId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("ho", getHo());
		attributes.put("trangThai", getTrangThai());
		attributes.put("nghiThu7", getNghiThu7());
		attributes.put("nghiChuNhat", getNghiChuNhat());
		attributes.put("cachTinhLuong", getCachTinhLuong());
		attributes.put("luongCa", getLuongCa());
		attributes.put("luongThang", getLuongThang());
		attributes.put("image", getImage());
		attributes.put("diaChiId", getDiaChiId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long nhanVienId = (Long)attributes.get("nhanVienId");

		if (nhanVienId != null) {
			setNhanVienId(nhanVienId);
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

		String ho = (String)attributes.get("ho");

		if (ho != null) {
			setHo(ho);
		}

		Boolean trangThai = (Boolean)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		Boolean nghiThu7 = (Boolean)attributes.get("nghiThu7");

		if (nghiThu7 != null) {
			setNghiThu7(nghiThu7);
		}

		Boolean nghiChuNhat = (Boolean)attributes.get("nghiChuNhat");

		if (nghiChuNhat != null) {
			setNghiChuNhat(nghiChuNhat);
		}

		Integer cachTinhLuong = (Integer)attributes.get("cachTinhLuong");

		if (cachTinhLuong != null) {
			setCachTinhLuong(cachTinhLuong);
		}

		Integer luongCa = (Integer)attributes.get("luongCa");

		if (luongCa != null) {
			setLuongCa(luongCa);
		}

		Integer luongThang = (Integer)attributes.get("luongThang");

		if (luongThang != null) {
			setLuongThang(luongThang);
		}

		String image = (String)attributes.get("image");

		if (image != null) {
			setImage(image);
		}

		Long diaChiId = (Long)attributes.get("diaChiId");

		if (diaChiId != null) {
			setDiaChiId(diaChiId);
		}
	}

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_nhanVienRemoteModel != null) {
			try {
				Class<?> clazz = _nhanVienRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_nhanVienRemoteModel, uuid);
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

		if (_nhanVienRemoteModel != null) {
			try {
				Class<?> clazz = _nhanVienRemoteModel.getClass();

				Method method = clazz.getMethod("setNhanVienId", long.class);

				method.invoke(_nhanVienRemoteModel, nhanVienId);
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

		if (_nhanVienRemoteModel != null) {
			try {
				Class<?> clazz = _nhanVienRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_nhanVienRemoteModel, companyId);
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

		if (_nhanVienRemoteModel != null) {
			try {
				Class<?> clazz = _nhanVienRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_nhanVienRemoteModel, userId);
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

		if (_nhanVienRemoteModel != null) {
			try {
				Class<?> clazz = _nhanVienRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_nhanVienRemoteModel, userName);
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

		if (_nhanVienRemoteModel != null) {
			try {
				Class<?> clazz = _nhanVienRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_nhanVienRemoteModel, createDate);
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

		if (_nhanVienRemoteModel != null) {
			try {
				Class<?> clazz = _nhanVienRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_nhanVienRemoteModel, modifiedDate);
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

		if (_nhanVienRemoteModel != null) {
			try {
				Class<?> clazz = _nhanVienRemoteModel.getClass();

				Method method = clazz.getMethod("setTen", String.class);

				method.invoke(_nhanVienRemoteModel, ten);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getHo() {
		return _ho;
	}

	@Override
	public void setHo(String ho) {
		_ho = ho;

		if (_nhanVienRemoteModel != null) {
			try {
				Class<?> clazz = _nhanVienRemoteModel.getClass();

				Method method = clazz.getMethod("setHo", String.class);

				method.invoke(_nhanVienRemoteModel, ho);
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

		if (_nhanVienRemoteModel != null) {
			try {
				Class<?> clazz = _nhanVienRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThai", boolean.class);

				method.invoke(_nhanVienRemoteModel, trangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getNghiThu7() {
		return _nghiThu7;
	}

	@Override
	public boolean isNghiThu7() {
		return _nghiThu7;
	}

	@Override
	public void setNghiThu7(boolean nghiThu7) {
		_nghiThu7 = nghiThu7;

		if (_nhanVienRemoteModel != null) {
			try {
				Class<?> clazz = _nhanVienRemoteModel.getClass();

				Method method = clazz.getMethod("setNghiThu7", boolean.class);

				method.invoke(_nhanVienRemoteModel, nghiThu7);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getNghiChuNhat() {
		return _nghiChuNhat;
	}

	@Override
	public boolean isNghiChuNhat() {
		return _nghiChuNhat;
	}

	@Override
	public void setNghiChuNhat(boolean nghiChuNhat) {
		_nghiChuNhat = nghiChuNhat;

		if (_nhanVienRemoteModel != null) {
			try {
				Class<?> clazz = _nhanVienRemoteModel.getClass();

				Method method = clazz.getMethod("setNghiChuNhat", boolean.class);

				method.invoke(_nhanVienRemoteModel, nghiChuNhat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCachTinhLuong() {
		return _cachTinhLuong;
	}

	@Override
	public void setCachTinhLuong(int cachTinhLuong) {
		_cachTinhLuong = cachTinhLuong;

		if (_nhanVienRemoteModel != null) {
			try {
				Class<?> clazz = _nhanVienRemoteModel.getClass();

				Method method = clazz.getMethod("setCachTinhLuong", int.class);

				method.invoke(_nhanVienRemoteModel, cachTinhLuong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLuongCa() {
		return _luongCa;
	}

	@Override
	public void setLuongCa(int luongCa) {
		_luongCa = luongCa;

		if (_nhanVienRemoteModel != null) {
			try {
				Class<?> clazz = _nhanVienRemoteModel.getClass();

				Method method = clazz.getMethod("setLuongCa", int.class);

				method.invoke(_nhanVienRemoteModel, luongCa);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLuongThang() {
		return _luongThang;
	}

	@Override
	public void setLuongThang(int luongThang) {
		_luongThang = luongThang;

		if (_nhanVienRemoteModel != null) {
			try {
				Class<?> clazz = _nhanVienRemoteModel.getClass();

				Method method = clazz.getMethod("setLuongThang", int.class);

				method.invoke(_nhanVienRemoteModel, luongThang);
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

		if (_nhanVienRemoteModel != null) {
			try {
				Class<?> clazz = _nhanVienRemoteModel.getClass();

				Method method = clazz.getMethod("setImage", String.class);

				method.invoke(_nhanVienRemoteModel, image);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDiaChiId() {
		return _diaChiId;
	}

	@Override
	public void setDiaChiId(long diaChiId) {
		_diaChiId = diaChiId;

		if (_nhanVienRemoteModel != null) {
			try {
				Class<?> clazz = _nhanVienRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChiId", long.class);

				method.invoke(_nhanVienRemoteModel, diaChiId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				NhanVien.class.getName()));
	}

	public BaseModel<?> getNhanVienRemoteModel() {
		return _nhanVienRemoteModel;
	}

	public void setNhanVienRemoteModel(BaseModel<?> nhanVienRemoteModel) {
		_nhanVienRemoteModel = nhanVienRemoteModel;
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

		Class<?> remoteModelClass = _nhanVienRemoteModel.getClass();

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

		Object returnValue = method.invoke(_nhanVienRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			NhanVienLocalServiceUtil.addNhanVien(this);
		}
		else {
			NhanVienLocalServiceUtil.updateNhanVien(this);
		}
	}

	@Override
	public NhanVien toEscapedModel() {
		return (NhanVien)ProxyUtil.newProxyInstance(NhanVien.class.getClassLoader(),
			new Class[] { NhanVien.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		NhanVienClp clone = new NhanVienClp();

		clone.setUuid(getUuid());
		clone.setNhanVienId(getNhanVienId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setTen(getTen());
		clone.setHo(getHo());
		clone.setTrangThai(getTrangThai());
		clone.setNghiThu7(getNghiThu7());
		clone.setNghiChuNhat(getNghiChuNhat());
		clone.setCachTinhLuong(getCachTinhLuong());
		clone.setLuongCa(getLuongCa());
		clone.setLuongThang(getLuongThang());
		clone.setImage(getImage());
		clone.setDiaChiId(getDiaChiId());

		return clone;
	}

	@Override
	public int compareTo(NhanVien nhanVien) {
		int value = 0;

		value = getTen().compareTo(nhanVien.getTen());

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

		if (!(obj instanceof NhanVienClp)) {
			return false;
		}

		NhanVienClp nhanVien = (NhanVienClp)obj;

		long primaryKey = nhanVien.getPrimaryKey();

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

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", nhanVienId=");
		sb.append(getNhanVienId());
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
		sb.append(", ho=");
		sb.append(getHo());
		sb.append(", trangThai=");
		sb.append(getTrangThai());
		sb.append(", nghiThu7=");
		sb.append(getNghiThu7());
		sb.append(", nghiChuNhat=");
		sb.append(getNghiChuNhat());
		sb.append(", cachTinhLuong=");
		sb.append(getCachTinhLuong());
		sb.append(", luongCa=");
		sb.append(getLuongCa());
		sb.append(", luongThang=");
		sb.append(getLuongThang());
		sb.append(", image=");
		sb.append(getImage());
		sb.append(", diaChiId=");
		sb.append(getDiaChiId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("com.minimart.portlet.nhanvien.model.NhanVien");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nhanVienId</column-name><column-value><![CDATA[");
		sb.append(getNhanVienId());
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
			"<column><column-name>ho</column-name><column-value><![CDATA[");
		sb.append(getHo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThai</column-name><column-value><![CDATA[");
		sb.append(getTrangThai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nghiThu7</column-name><column-value><![CDATA[");
		sb.append(getNghiThu7());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nghiChuNhat</column-name><column-value><![CDATA[");
		sb.append(getNghiChuNhat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cachTinhLuong</column-name><column-value><![CDATA[");
		sb.append(getCachTinhLuong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>luongCa</column-name><column-value><![CDATA[");
		sb.append(getLuongCa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>luongThang</column-name><column-value><![CDATA[");
		sb.append(getLuongThang());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>image</column-name><column-value><![CDATA[");
		sb.append(getImage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>diaChiId</column-name><column-value><![CDATA[");
		sb.append(getDiaChiId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _nhanVienId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private String _ho;
	private boolean _trangThai;
	private boolean _nghiThu7;
	private boolean _nghiChuNhat;
	private int _cachTinhLuong;
	private int _luongCa;
	private int _luongThang;
	private String _image;
	private long _diaChiId;
	private BaseModel<?> _nhanVienRemoteModel;
	private Class<?> _clpSerializerClass = com.minimart.portlet.nhanvien.service.ClpSerializer.class;
}