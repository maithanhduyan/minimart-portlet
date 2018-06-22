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
import com.minimart.portlet.khuyenmai.service.DotKhuyenMaiChiTietLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mai Thành Duy An
 */
public class DotKhuyenMaiChiTietClp extends BaseModelImpl<DotKhuyenMaiChiTiet>
	implements DotKhuyenMaiChiTiet {
	public DotKhuyenMaiChiTietClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DotKhuyenMaiChiTiet.class;
	}

	@Override
	public String getModelClassName() {
		return DotKhuyenMaiChiTiet.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _dotKhuyenMaiChiTietId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDotKhuyenMaiChiTietId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dotKhuyenMaiChiTietId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("dotKhuyenMaiChiTietId", getDotKhuyenMaiChiTietId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dotKhuyenMaiId", getDotKhuyenMaiId());
		attributes.put("nhomMatHangId", getNhomMatHangId());
		attributes.put("matHangId", getMatHangId());
		attributes.put("matHangTangId", getMatHangTangId());
		attributes.put("tiLeGiamGia", getTiLeGiamGia());
		attributes.put("giaTriDonHang", getGiaTriDonHang());
		attributes.put("soLuongMua", getSoLuongMua());
		attributes.put("soLuongTang", getSoLuongTang());
		attributes.put("giaBan", getGiaBan());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long dotKhuyenMaiChiTietId = (Long)attributes.get(
				"dotKhuyenMaiChiTietId");

		if (dotKhuyenMaiChiTietId != null) {
			setDotKhuyenMaiChiTietId(dotKhuyenMaiChiTietId);
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

		Long dotKhuyenMaiId = (Long)attributes.get("dotKhuyenMaiId");

		if (dotKhuyenMaiId != null) {
			setDotKhuyenMaiId(dotKhuyenMaiId);
		}

		Long nhomMatHangId = (Long)attributes.get("nhomMatHangId");

		if (nhomMatHangId != null) {
			setNhomMatHangId(nhomMatHangId);
		}

		Long matHangId = (Long)attributes.get("matHangId");

		if (matHangId != null) {
			setMatHangId(matHangId);
		}

		Long matHangTangId = (Long)attributes.get("matHangTangId");

		if (matHangTangId != null) {
			setMatHangTangId(matHangTangId);
		}

		Double tiLeGiamGia = (Double)attributes.get("tiLeGiamGia");

		if (tiLeGiamGia != null) {
			setTiLeGiamGia(tiLeGiamGia);
		}

		Double giaTriDonHang = (Double)attributes.get("giaTriDonHang");

		if (giaTriDonHang != null) {
			setGiaTriDonHang(giaTriDonHang);
		}

		Integer soLuongMua = (Integer)attributes.get("soLuongMua");

		if (soLuongMua != null) {
			setSoLuongMua(soLuongMua);
		}

		Integer soLuongTang = (Integer)attributes.get("soLuongTang");

		if (soLuongTang != null) {
			setSoLuongTang(soLuongTang);
		}

		Integer giaBan = (Integer)attributes.get("giaBan");

		if (giaBan != null) {
			setGiaBan(giaBan);
		}
	}

	@Override
	public long getDotKhuyenMaiChiTietId() {
		return _dotKhuyenMaiChiTietId;
	}

	@Override
	public void setDotKhuyenMaiChiTietId(long dotKhuyenMaiChiTietId) {
		_dotKhuyenMaiChiTietId = dotKhuyenMaiChiTietId;

		if (_dotKhuyenMaiChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _dotKhuyenMaiChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setDotKhuyenMaiChiTietId",
						long.class);

				method.invoke(_dotKhuyenMaiChiTietRemoteModel,
					dotKhuyenMaiChiTietId);
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

		if (_dotKhuyenMaiChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _dotKhuyenMaiChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_dotKhuyenMaiChiTietRemoteModel, companyId);
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

		if (_dotKhuyenMaiChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _dotKhuyenMaiChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_dotKhuyenMaiChiTietRemoteModel, userId);
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

		if (_dotKhuyenMaiChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _dotKhuyenMaiChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_dotKhuyenMaiChiTietRemoteModel, userName);
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

		if (_dotKhuyenMaiChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _dotKhuyenMaiChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_dotKhuyenMaiChiTietRemoteModel, createDate);
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

		if (_dotKhuyenMaiChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _dotKhuyenMaiChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_dotKhuyenMaiChiTietRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDotKhuyenMaiId() {
		return _dotKhuyenMaiId;
	}

	@Override
	public void setDotKhuyenMaiId(long dotKhuyenMaiId) {
		_dotKhuyenMaiId = dotKhuyenMaiId;

		if (_dotKhuyenMaiChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _dotKhuyenMaiChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setDotKhuyenMaiId", long.class);

				method.invoke(_dotKhuyenMaiChiTietRemoteModel, dotKhuyenMaiId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNhomMatHangId() {
		return _nhomMatHangId;
	}

	@Override
	public void setNhomMatHangId(long nhomMatHangId) {
		_nhomMatHangId = nhomMatHangId;

		if (_dotKhuyenMaiChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _dotKhuyenMaiChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setNhomMatHangId", long.class);

				method.invoke(_dotKhuyenMaiChiTietRemoteModel, nhomMatHangId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getMatHangId() {
		return _matHangId;
	}

	@Override
	public void setMatHangId(long matHangId) {
		_matHangId = matHangId;

		if (_dotKhuyenMaiChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _dotKhuyenMaiChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setMatHangId", long.class);

				method.invoke(_dotKhuyenMaiChiTietRemoteModel, matHangId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getMatHangTangId() {
		return _matHangTangId;
	}

	@Override
	public void setMatHangTangId(long matHangTangId) {
		_matHangTangId = matHangTangId;

		if (_dotKhuyenMaiChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _dotKhuyenMaiChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setMatHangTangId", long.class);

				method.invoke(_dotKhuyenMaiChiTietRemoteModel, matHangTangId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getTiLeGiamGia() {
		return _tiLeGiamGia;
	}

	@Override
	public void setTiLeGiamGia(double tiLeGiamGia) {
		_tiLeGiamGia = tiLeGiamGia;

		if (_dotKhuyenMaiChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _dotKhuyenMaiChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setTiLeGiamGia", double.class);

				method.invoke(_dotKhuyenMaiChiTietRemoteModel, tiLeGiamGia);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getGiaTriDonHang() {
		return _giaTriDonHang;
	}

	@Override
	public void setGiaTriDonHang(double giaTriDonHang) {
		_giaTriDonHang = giaTriDonHang;

		if (_dotKhuyenMaiChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _dotKhuyenMaiChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setGiaTriDonHang", double.class);

				method.invoke(_dotKhuyenMaiChiTietRemoteModel, giaTriDonHang);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoLuongMua() {
		return _soLuongMua;
	}

	@Override
	public void setSoLuongMua(int soLuongMua) {
		_soLuongMua = soLuongMua;

		if (_dotKhuyenMaiChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _dotKhuyenMaiChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setSoLuongMua", int.class);

				method.invoke(_dotKhuyenMaiChiTietRemoteModel, soLuongMua);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoLuongTang() {
		return _soLuongTang;
	}

	@Override
	public void setSoLuongTang(int soLuongTang) {
		_soLuongTang = soLuongTang;

		if (_dotKhuyenMaiChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _dotKhuyenMaiChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setSoLuongTang", int.class);

				method.invoke(_dotKhuyenMaiChiTietRemoteModel, soLuongTang);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getGiaBan() {
		return _giaBan;
	}

	@Override
	public void setGiaBan(int giaBan) {
		_giaBan = giaBan;

		if (_dotKhuyenMaiChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _dotKhuyenMaiChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setGiaBan", int.class);

				method.invoke(_dotKhuyenMaiChiTietRemoteModel, giaBan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDotKhuyenMaiChiTietRemoteModel() {
		return _dotKhuyenMaiChiTietRemoteModel;
	}

	public void setDotKhuyenMaiChiTietRemoteModel(
		BaseModel<?> dotKhuyenMaiChiTietRemoteModel) {
		_dotKhuyenMaiChiTietRemoteModel = dotKhuyenMaiChiTietRemoteModel;
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

		Class<?> remoteModelClass = _dotKhuyenMaiChiTietRemoteModel.getClass();

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

		Object returnValue = method.invoke(_dotKhuyenMaiChiTietRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DotKhuyenMaiChiTietLocalServiceUtil.addDotKhuyenMaiChiTiet(this);
		}
		else {
			DotKhuyenMaiChiTietLocalServiceUtil.updateDotKhuyenMaiChiTiet(this);
		}
	}

	@Override
	public DotKhuyenMaiChiTiet toEscapedModel() {
		return (DotKhuyenMaiChiTiet)ProxyUtil.newProxyInstance(DotKhuyenMaiChiTiet.class.getClassLoader(),
			new Class[] { DotKhuyenMaiChiTiet.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DotKhuyenMaiChiTietClp clone = new DotKhuyenMaiChiTietClp();

		clone.setDotKhuyenMaiChiTietId(getDotKhuyenMaiChiTietId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setDotKhuyenMaiId(getDotKhuyenMaiId());
		clone.setNhomMatHangId(getNhomMatHangId());
		clone.setMatHangId(getMatHangId());
		clone.setMatHangTangId(getMatHangTangId());
		clone.setTiLeGiamGia(getTiLeGiamGia());
		clone.setGiaTriDonHang(getGiaTriDonHang());
		clone.setSoLuongMua(getSoLuongMua());
		clone.setSoLuongTang(getSoLuongTang());
		clone.setGiaBan(getGiaBan());

		return clone;
	}

	@Override
	public int compareTo(DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(),
				dotKhuyenMaiChiTiet.getCreateDate());

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

		if (!(obj instanceof DotKhuyenMaiChiTietClp)) {
			return false;
		}

		DotKhuyenMaiChiTietClp dotKhuyenMaiChiTiet = (DotKhuyenMaiChiTietClp)obj;

		long primaryKey = dotKhuyenMaiChiTiet.getPrimaryKey();

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
		StringBundler sb = new StringBundler(31);

		sb.append("{dotKhuyenMaiChiTietId=");
		sb.append(getDotKhuyenMaiChiTietId());
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
		sb.append(", dotKhuyenMaiId=");
		sb.append(getDotKhuyenMaiId());
		sb.append(", nhomMatHangId=");
		sb.append(getNhomMatHangId());
		sb.append(", matHangId=");
		sb.append(getMatHangId());
		sb.append(", matHangTangId=");
		sb.append(getMatHangTangId());
		sb.append(", tiLeGiamGia=");
		sb.append(getTiLeGiamGia());
		sb.append(", giaTriDonHang=");
		sb.append(getGiaTriDonHang());
		sb.append(", soLuongMua=");
		sb.append(getSoLuongMua());
		sb.append(", soLuongTang=");
		sb.append(getSoLuongTang());
		sb.append(", giaBan=");
		sb.append(getGiaBan());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>dotKhuyenMaiChiTietId</column-name><column-value><![CDATA[");
		sb.append(getDotKhuyenMaiChiTietId());
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
			"<column><column-name>dotKhuyenMaiId</column-name><column-value><![CDATA[");
		sb.append(getDotKhuyenMaiId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nhomMatHangId</column-name><column-value><![CDATA[");
		sb.append(getNhomMatHangId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>matHangId</column-name><column-value><![CDATA[");
		sb.append(getMatHangId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>matHangTangId</column-name><column-value><![CDATA[");
		sb.append(getMatHangTangId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tiLeGiamGia</column-name><column-value><![CDATA[");
		sb.append(getTiLeGiamGia());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>giaTriDonHang</column-name><column-value><![CDATA[");
		sb.append(getGiaTriDonHang());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soLuongMua</column-name><column-value><![CDATA[");
		sb.append(getSoLuongMua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soLuongTang</column-name><column-value><![CDATA[");
		sb.append(getSoLuongTang());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>giaBan</column-name><column-value><![CDATA[");
		sb.append(getGiaBan());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _dotKhuyenMaiChiTietId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _dotKhuyenMaiId;
	private long _nhomMatHangId;
	private long _matHangId;
	private long _matHangTangId;
	private double _tiLeGiamGia;
	private double _giaTriDonHang;
	private int _soLuongMua;
	private int _soLuongTang;
	private int _giaBan;
	private BaseModel<?> _dotKhuyenMaiChiTietRemoteModel;
	private Class<?> _clpSerializerClass = com.minimart.portlet.khuyenmai.service.ClpSerializer.class;
}