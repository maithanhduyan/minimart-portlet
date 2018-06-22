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

package com.minimart.portlet.dathang.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.minimart.portlet.dathang.service.ClpSerializer;
import com.minimart.portlet.dathang.service.DatHangChiTietLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mai Thành Duy An
 */
public class DatHangChiTietClp extends BaseModelImpl<DatHangChiTiet>
	implements DatHangChiTiet {
	public DatHangChiTietClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DatHangChiTiet.class;
	}

	@Override
	public String getModelClassName() {
		return DatHangChiTiet.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _datHangChiTietId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDatHangChiTietId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _datHangChiTietId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("datHangChiTietId", getDatHangChiTietId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("soLuong", getSoLuong());
		attributes.put("donGia", getDonGia());
		attributes.put("thanhTien", getThanhTien());
		attributes.put("tiLeGiamGia", getTiLeGiamGia());
		attributes.put("ghiChu", getGhiChu());
		attributes.put("trangThai", getTrangThai());
		attributes.put("baoHanh", getBaoHanh());
		attributes.put("donViTinhId", getDonViTinhId());
		attributes.put("datHangId", getDatHangId());
		attributes.put("maHangId", getMaHangId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long datHangChiTietId = (Long)attributes.get("datHangChiTietId");

		if (datHangChiTietId != null) {
			setDatHangChiTietId(datHangChiTietId);
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

		Integer soLuong = (Integer)attributes.get("soLuong");

		if (soLuong != null) {
			setSoLuong(soLuong);
		}

		Integer donGia = (Integer)attributes.get("donGia");

		if (donGia != null) {
			setDonGia(donGia);
		}

		Integer thanhTien = (Integer)attributes.get("thanhTien");

		if (thanhTien != null) {
			setThanhTien(thanhTien);
		}

		Double tiLeGiamGia = (Double)attributes.get("tiLeGiamGia");

		if (tiLeGiamGia != null) {
			setTiLeGiamGia(tiLeGiamGia);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}

		Boolean trangThai = (Boolean)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		String baoHanh = (String)attributes.get("baoHanh");

		if (baoHanh != null) {
			setBaoHanh(baoHanh);
		}

		Long donViTinhId = (Long)attributes.get("donViTinhId");

		if (donViTinhId != null) {
			setDonViTinhId(donViTinhId);
		}

		Long datHangId = (Long)attributes.get("datHangId");

		if (datHangId != null) {
			setDatHangId(datHangId);
		}

		Long maHangId = (Long)attributes.get("maHangId");

		if (maHangId != null) {
			setMaHangId(maHangId);
		}
	}

	@Override
	public long getDatHangChiTietId() {
		return _datHangChiTietId;
	}

	@Override
	public void setDatHangChiTietId(long datHangChiTietId) {
		_datHangChiTietId = datHangChiTietId;

		if (_datHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _datHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setDatHangChiTietId",
						long.class);

				method.invoke(_datHangChiTietRemoteModel, datHangChiTietId);
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

		if (_datHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _datHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_datHangChiTietRemoteModel, companyId);
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

		if (_datHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _datHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_datHangChiTietRemoteModel, userId);
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

		if (_datHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _datHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_datHangChiTietRemoteModel, userName);
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

		if (_datHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _datHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_datHangChiTietRemoteModel, createDate);
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

		if (_datHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _datHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_datHangChiTietRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSoLuong() {
		return _soLuong;
	}

	@Override
	public void setSoLuong(int soLuong) {
		_soLuong = soLuong;

		if (_datHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _datHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setSoLuong", int.class);

				method.invoke(_datHangChiTietRemoteModel, soLuong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDonGia() {
		return _donGia;
	}

	@Override
	public void setDonGia(int donGia) {
		_donGia = donGia;

		if (_datHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _datHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setDonGia", int.class);

				method.invoke(_datHangChiTietRemoteModel, donGia);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getThanhTien() {
		return _thanhTien;
	}

	@Override
	public void setThanhTien(int thanhTien) {
		_thanhTien = thanhTien;

		if (_datHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _datHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setThanhTien", int.class);

				method.invoke(_datHangChiTietRemoteModel, thanhTien);
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

		if (_datHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _datHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setTiLeGiamGia", double.class);

				method.invoke(_datHangChiTietRemoteModel, tiLeGiamGia);
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

		if (_datHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _datHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_datHangChiTietRemoteModel, ghiChu);
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

		if (_datHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _datHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThai", boolean.class);

				method.invoke(_datHangChiTietRemoteModel, trangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBaoHanh() {
		return _baoHanh;
	}

	@Override
	public void setBaoHanh(String baoHanh) {
		_baoHanh = baoHanh;

		if (_datHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _datHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setBaoHanh", String.class);

				method.invoke(_datHangChiTietRemoteModel, baoHanh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDonViTinhId() {
		return _donViTinhId;
	}

	@Override
	public void setDonViTinhId(long donViTinhId) {
		_donViTinhId = donViTinhId;

		if (_datHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _datHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setDonViTinhId", long.class);

				method.invoke(_datHangChiTietRemoteModel, donViTinhId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDatHangId() {
		return _datHangId;
	}

	@Override
	public void setDatHangId(long datHangId) {
		_datHangId = datHangId;

		if (_datHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _datHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setDatHangId", long.class);

				method.invoke(_datHangChiTietRemoteModel, datHangId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getMaHangId() {
		return _maHangId;
	}

	@Override
	public void setMaHangId(long maHangId) {
		_maHangId = maHangId;

		if (_datHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _datHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setMaHangId", long.class);

				method.invoke(_datHangChiTietRemoteModel, maHangId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDatHangChiTietRemoteModel() {
		return _datHangChiTietRemoteModel;
	}

	public void setDatHangChiTietRemoteModel(
		BaseModel<?> datHangChiTietRemoteModel) {
		_datHangChiTietRemoteModel = datHangChiTietRemoteModel;
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

		Class<?> remoteModelClass = _datHangChiTietRemoteModel.getClass();

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

		Object returnValue = method.invoke(_datHangChiTietRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DatHangChiTietLocalServiceUtil.addDatHangChiTiet(this);
		}
		else {
			DatHangChiTietLocalServiceUtil.updateDatHangChiTiet(this);
		}
	}

	@Override
	public DatHangChiTiet toEscapedModel() {
		return (DatHangChiTiet)ProxyUtil.newProxyInstance(DatHangChiTiet.class.getClassLoader(),
			new Class[] { DatHangChiTiet.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DatHangChiTietClp clone = new DatHangChiTietClp();

		clone.setDatHangChiTietId(getDatHangChiTietId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setSoLuong(getSoLuong());
		clone.setDonGia(getDonGia());
		clone.setThanhTien(getThanhTien());
		clone.setTiLeGiamGia(getTiLeGiamGia());
		clone.setGhiChu(getGhiChu());
		clone.setTrangThai(getTrangThai());
		clone.setBaoHanh(getBaoHanh());
		clone.setDonViTinhId(getDonViTinhId());
		clone.setDatHangId(getDatHangId());
		clone.setMaHangId(getMaHangId());

		return clone;
	}

	@Override
	public int compareTo(DatHangChiTiet datHangChiTiet) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(),
				datHangChiTiet.getCreateDate());

		value = value * -1;

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

		if (!(obj instanceof DatHangChiTietClp)) {
			return false;
		}

		DatHangChiTietClp datHangChiTiet = (DatHangChiTietClp)obj;

		long primaryKey = datHangChiTiet.getPrimaryKey();

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
		StringBundler sb = new StringBundler(33);

		sb.append("{datHangChiTietId=");
		sb.append(getDatHangChiTietId());
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
		sb.append(", soLuong=");
		sb.append(getSoLuong());
		sb.append(", donGia=");
		sb.append(getDonGia());
		sb.append(", thanhTien=");
		sb.append(getThanhTien());
		sb.append(", tiLeGiamGia=");
		sb.append(getTiLeGiamGia());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append(", trangThai=");
		sb.append(getTrangThai());
		sb.append(", baoHanh=");
		sb.append(getBaoHanh());
		sb.append(", donViTinhId=");
		sb.append(getDonViTinhId());
		sb.append(", datHangId=");
		sb.append(getDatHangId());
		sb.append(", maHangId=");
		sb.append(getMaHangId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append("com.minimart.portlet.dathang.model.DatHangChiTiet");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>datHangChiTietId</column-name><column-value><![CDATA[");
		sb.append(getDatHangChiTietId());
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
			"<column><column-name>soLuong</column-name><column-value><![CDATA[");
		sb.append(getSoLuong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>donGia</column-name><column-value><![CDATA[");
		sb.append(getDonGia());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thanhTien</column-name><column-value><![CDATA[");
		sb.append(getThanhTien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tiLeGiamGia</column-name><column-value><![CDATA[");
		sb.append(getTiLeGiamGia());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ghiChu</column-name><column-value><![CDATA[");
		sb.append(getGhiChu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThai</column-name><column-value><![CDATA[");
		sb.append(getTrangThai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>baoHanh</column-name><column-value><![CDATA[");
		sb.append(getBaoHanh());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>donViTinhId</column-name><column-value><![CDATA[");
		sb.append(getDonViTinhId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>datHangId</column-name><column-value><![CDATA[");
		sb.append(getDatHangId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maHangId</column-name><column-value><![CDATA[");
		sb.append(getMaHangId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _datHangChiTietId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _soLuong;
	private int _donGia;
	private int _thanhTien;
	private double _tiLeGiamGia;
	private String _ghiChu;
	private boolean _trangThai;
	private String _baoHanh;
	private long _donViTinhId;
	private long _datHangId;
	private long _maHangId;
	private BaseModel<?> _datHangChiTietRemoteModel;
	private Class<?> _clpSerializerClass = com.minimart.portlet.dathang.service.ClpSerializer.class;
}