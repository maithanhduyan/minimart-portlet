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

package com.minimart.portlet.banhang.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.minimart.portlet.banhang.service.ClpSerializer;
import com.minimart.portlet.banhang.service.DonHangChiTietLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mai Thành Duy An
 */
public class DonHangChiTietClp extends BaseModelImpl<DonHangChiTiet>
	implements DonHangChiTiet {
	public DonHangChiTietClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DonHangChiTiet.class;
	}

	@Override
	public String getModelClassName() {
		return DonHangChiTiet.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _donHangChiTietId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDonHangChiTietId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _donHangChiTietId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("donHangChiTietId", getDonHangChiTietId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("donHangId", getDonHangId());
		attributes.put("matHangId", getMatHangId());
		attributes.put("soLuong", getSoLuong());
		attributes.put("donViTinhId", getDonViTinhId());
		attributes.put("thanhTien", getThanhTien());
		attributes.put("tiLeGiamGia", getTiLeGiamGia());
		attributes.put("kichThuoc", getKichThuoc());
		attributes.put("hanSuDung", getHanSuDung());
		attributes.put("hoatDong", getHoatDong());
		attributes.put("huy", getHuy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long donHangChiTietId = (Long)attributes.get("donHangChiTietId");

		if (donHangChiTietId != null) {
			setDonHangChiTietId(donHangChiTietId);
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

		Long donHangId = (Long)attributes.get("donHangId");

		if (donHangId != null) {
			setDonHangId(donHangId);
		}

		Long matHangId = (Long)attributes.get("matHangId");

		if (matHangId != null) {
			setMatHangId(matHangId);
		}

		Integer soLuong = (Integer)attributes.get("soLuong");

		if (soLuong != null) {
			setSoLuong(soLuong);
		}

		Long donViTinhId = (Long)attributes.get("donViTinhId");

		if (donViTinhId != null) {
			setDonViTinhId(donViTinhId);
		}

		Integer thanhTien = (Integer)attributes.get("thanhTien");

		if (thanhTien != null) {
			setThanhTien(thanhTien);
		}

		Integer tiLeGiamGia = (Integer)attributes.get("tiLeGiamGia");

		if (tiLeGiamGia != null) {
			setTiLeGiamGia(tiLeGiamGia);
		}

		String kichThuoc = (String)attributes.get("kichThuoc");

		if (kichThuoc != null) {
			setKichThuoc(kichThuoc);
		}

		Date hanSuDung = (Date)attributes.get("hanSuDung");

		if (hanSuDung != null) {
			setHanSuDung(hanSuDung);
		}

		Boolean hoatDong = (Boolean)attributes.get("hoatDong");

		if (hoatDong != null) {
			setHoatDong(hoatDong);
		}

		Boolean huy = (Boolean)attributes.get("huy");

		if (huy != null) {
			setHuy(huy);
		}
	}

	@Override
	public long getDonHangChiTietId() {
		return _donHangChiTietId;
	}

	@Override
	public void setDonHangChiTietId(long donHangChiTietId) {
		_donHangChiTietId = donHangChiTietId;

		if (_donHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _donHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setDonHangChiTietId",
						long.class);

				method.invoke(_donHangChiTietRemoteModel, donHangChiTietId);
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

		if (_donHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _donHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_donHangChiTietRemoteModel, companyId);
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

		if (_donHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _donHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_donHangChiTietRemoteModel, userId);
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

		if (_donHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _donHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_donHangChiTietRemoteModel, userName);
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

		if (_donHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _donHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_donHangChiTietRemoteModel, createDate);
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

		if (_donHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _donHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_donHangChiTietRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDonHangId() {
		return _donHangId;
	}

	@Override
	public void setDonHangId(long donHangId) {
		_donHangId = donHangId;

		if (_donHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _donHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setDonHangId", long.class);

				method.invoke(_donHangChiTietRemoteModel, donHangId);
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

		if (_donHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _donHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setMatHangId", long.class);

				method.invoke(_donHangChiTietRemoteModel, matHangId);
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

		if (_donHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _donHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setSoLuong", int.class);

				method.invoke(_donHangChiTietRemoteModel, soLuong);
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

		if (_donHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _donHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setDonViTinhId", long.class);

				method.invoke(_donHangChiTietRemoteModel, donViTinhId);
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

		if (_donHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _donHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setThanhTien", int.class);

				method.invoke(_donHangChiTietRemoteModel, thanhTien);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTiLeGiamGia() {
		return _tiLeGiamGia;
	}

	@Override
	public void setTiLeGiamGia(int tiLeGiamGia) {
		_tiLeGiamGia = tiLeGiamGia;

		if (_donHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _donHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setTiLeGiamGia", int.class);

				method.invoke(_donHangChiTietRemoteModel, tiLeGiamGia);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKichThuoc() {
		return _kichThuoc;
	}

	@Override
	public void setKichThuoc(String kichThuoc) {
		_kichThuoc = kichThuoc;

		if (_donHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _donHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setKichThuoc", String.class);

				method.invoke(_donHangChiTietRemoteModel, kichThuoc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getHanSuDung() {
		return _hanSuDung;
	}

	@Override
	public void setHanSuDung(Date hanSuDung) {
		_hanSuDung = hanSuDung;

		if (_donHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _donHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setHanSuDung", Date.class);

				method.invoke(_donHangChiTietRemoteModel, hanSuDung);
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

		if (_donHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _donHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setHoatDong", boolean.class);

				method.invoke(_donHangChiTietRemoteModel, hoatDong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getHuy() {
		return _huy;
	}

	@Override
	public boolean isHuy() {
		return _huy;
	}

	@Override
	public void setHuy(boolean huy) {
		_huy = huy;

		if (_donHangChiTietRemoteModel != null) {
			try {
				Class<?> clazz = _donHangChiTietRemoteModel.getClass();

				Method method = clazz.getMethod("setHuy", boolean.class);

				method.invoke(_donHangChiTietRemoteModel, huy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDonHangChiTietRemoteModel() {
		return _donHangChiTietRemoteModel;
	}

	public void setDonHangChiTietRemoteModel(
		BaseModel<?> donHangChiTietRemoteModel) {
		_donHangChiTietRemoteModel = donHangChiTietRemoteModel;
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

		Class<?> remoteModelClass = _donHangChiTietRemoteModel.getClass();

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

		Object returnValue = method.invoke(_donHangChiTietRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DonHangChiTietLocalServiceUtil.addDonHangChiTiet(this);
		}
		else {
			DonHangChiTietLocalServiceUtil.updateDonHangChiTiet(this);
		}
	}

	@Override
	public DonHangChiTiet toEscapedModel() {
		return (DonHangChiTiet)ProxyUtil.newProxyInstance(DonHangChiTiet.class.getClassLoader(),
			new Class[] { DonHangChiTiet.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DonHangChiTietClp clone = new DonHangChiTietClp();

		clone.setDonHangChiTietId(getDonHangChiTietId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setDonHangId(getDonHangId());
		clone.setMatHangId(getMatHangId());
		clone.setSoLuong(getSoLuong());
		clone.setDonViTinhId(getDonViTinhId());
		clone.setThanhTien(getThanhTien());
		clone.setTiLeGiamGia(getTiLeGiamGia());
		clone.setKichThuoc(getKichThuoc());
		clone.setHanSuDung(getHanSuDung());
		clone.setHoatDong(getHoatDong());
		clone.setHuy(getHuy());

		return clone;
	}

	@Override
	public int compareTo(DonHangChiTiet donHangChiTiet) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(),
				donHangChiTiet.getCreateDate());

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

		if (!(obj instanceof DonHangChiTietClp)) {
			return false;
		}

		DonHangChiTietClp donHangChiTiet = (DonHangChiTietClp)obj;

		long primaryKey = donHangChiTiet.getPrimaryKey();

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

		sb.append("{donHangChiTietId=");
		sb.append(getDonHangChiTietId());
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
		sb.append(", donHangId=");
		sb.append(getDonHangId());
		sb.append(", matHangId=");
		sb.append(getMatHangId());
		sb.append(", soLuong=");
		sb.append(getSoLuong());
		sb.append(", donViTinhId=");
		sb.append(getDonViTinhId());
		sb.append(", thanhTien=");
		sb.append(getThanhTien());
		sb.append(", tiLeGiamGia=");
		sb.append(getTiLeGiamGia());
		sb.append(", kichThuoc=");
		sb.append(getKichThuoc());
		sb.append(", hanSuDung=");
		sb.append(getHanSuDung());
		sb.append(", hoatDong=");
		sb.append(getHoatDong());
		sb.append(", huy=");
		sb.append(getHuy());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append("com.minimart.portlet.banhang.model.DonHangChiTiet");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>donHangChiTietId</column-name><column-value><![CDATA[");
		sb.append(getDonHangChiTietId());
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
			"<column><column-name>donHangId</column-name><column-value><![CDATA[");
		sb.append(getDonHangId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>matHangId</column-name><column-value><![CDATA[");
		sb.append(getMatHangId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soLuong</column-name><column-value><![CDATA[");
		sb.append(getSoLuong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>donViTinhId</column-name><column-value><![CDATA[");
		sb.append(getDonViTinhId());
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
			"<column><column-name>kichThuoc</column-name><column-value><![CDATA[");
		sb.append(getKichThuoc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hanSuDung</column-name><column-value><![CDATA[");
		sb.append(getHanSuDung());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoatDong</column-name><column-value><![CDATA[");
		sb.append(getHoatDong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>huy</column-name><column-value><![CDATA[");
		sb.append(getHuy());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _donHangChiTietId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _donHangId;
	private long _matHangId;
	private int _soLuong;
	private long _donViTinhId;
	private int _thanhTien;
	private int _tiLeGiamGia;
	private String _kichThuoc;
	private Date _hanSuDung;
	private boolean _hoatDong;
	private boolean _huy;
	private BaseModel<?> _donHangChiTietRemoteModel;
	private Class<?> _clpSerializerClass = com.minimart.portlet.banhang.service.ClpSerializer.class;
}