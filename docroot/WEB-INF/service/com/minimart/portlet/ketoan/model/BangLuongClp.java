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

package com.minimart.portlet.ketoan.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.minimart.portlet.ketoan.service.BangLuongLocalServiceUtil;
import com.minimart.portlet.ketoan.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mai Thành Duy An
 */
public class BangLuongClp extends BaseModelImpl<BangLuong> implements BangLuong {
	public BangLuongClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return BangLuong.class;
	}

	@Override
	public String getModelClassName() {
		return BangLuong.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _banLuongId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setBanLuongId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _banLuongId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("banLuongId", getBanLuongId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("trangThai", getTrangThai());
		attributes.put("thang", getThang());
		attributes.put("nam", getNam());
		attributes.put("ngay", getNgay());
		attributes.put("chiTiet", getChiTiet());
		attributes.put("ghiChu", getGhiChu());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long banLuongId = (Long)attributes.get("banLuongId");

		if (banLuongId != null) {
			setBanLuongId(banLuongId);
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

		Integer thang = (Integer)attributes.get("thang");

		if (thang != null) {
			setThang(thang);
		}

		Integer nam = (Integer)attributes.get("nam");

		if (nam != null) {
			setNam(nam);
		}

		Date ngay = (Date)attributes.get("ngay");

		if (ngay != null) {
			setNgay(ngay);
		}

		String chiTiet = (String)attributes.get("chiTiet");

		if (chiTiet != null) {
			setChiTiet(chiTiet);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}
	}

	@Override
	public long getBanLuongId() {
		return _banLuongId;
	}

	@Override
	public void setBanLuongId(long banLuongId) {
		_banLuongId = banLuongId;

		if (_bangLuongRemoteModel != null) {
			try {
				Class<?> clazz = _bangLuongRemoteModel.getClass();

				Method method = clazz.getMethod("setBanLuongId", long.class);

				method.invoke(_bangLuongRemoteModel, banLuongId);
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

		if (_bangLuongRemoteModel != null) {
			try {
				Class<?> clazz = _bangLuongRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_bangLuongRemoteModel, companyId);
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

		if (_bangLuongRemoteModel != null) {
			try {
				Class<?> clazz = _bangLuongRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_bangLuongRemoteModel, userId);
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

		if (_bangLuongRemoteModel != null) {
			try {
				Class<?> clazz = _bangLuongRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_bangLuongRemoteModel, userName);
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

		if (_bangLuongRemoteModel != null) {
			try {
				Class<?> clazz = _bangLuongRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_bangLuongRemoteModel, createDate);
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

		if (_bangLuongRemoteModel != null) {
			try {
				Class<?> clazz = _bangLuongRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_bangLuongRemoteModel, modifiedDate);
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

		if (_bangLuongRemoteModel != null) {
			try {
				Class<?> clazz = _bangLuongRemoteModel.getClass();

				Method method = clazz.getMethod("setTen", String.class);

				method.invoke(_bangLuongRemoteModel, ten);
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

		if (_bangLuongRemoteModel != null) {
			try {
				Class<?> clazz = _bangLuongRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThai", boolean.class);

				method.invoke(_bangLuongRemoteModel, trangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getThang() {
		return _thang;
	}

	@Override
	public void setThang(int thang) {
		_thang = thang;

		if (_bangLuongRemoteModel != null) {
			try {
				Class<?> clazz = _bangLuongRemoteModel.getClass();

				Method method = clazz.getMethod("setThang", int.class);

				method.invoke(_bangLuongRemoteModel, thang);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNam() {
		return _nam;
	}

	@Override
	public void setNam(int nam) {
		_nam = nam;

		if (_bangLuongRemoteModel != null) {
			try {
				Class<?> clazz = _bangLuongRemoteModel.getClass();

				Method method = clazz.getMethod("setNam", int.class);

				method.invoke(_bangLuongRemoteModel, nam);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgay() {
		return _ngay;
	}

	@Override
	public void setNgay(Date ngay) {
		_ngay = ngay;

		if (_bangLuongRemoteModel != null) {
			try {
				Class<?> clazz = _bangLuongRemoteModel.getClass();

				Method method = clazz.getMethod("setNgay", Date.class);

				method.invoke(_bangLuongRemoteModel, ngay);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getChiTiet() {
		return _chiTiet;
	}

	@Override
	public void setChiTiet(String chiTiet) {
		_chiTiet = chiTiet;

		if (_bangLuongRemoteModel != null) {
			try {
				Class<?> clazz = _bangLuongRemoteModel.getClass();

				Method method = clazz.getMethod("setChiTiet", String.class);

				method.invoke(_bangLuongRemoteModel, chiTiet);
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

		if (_bangLuongRemoteModel != null) {
			try {
				Class<?> clazz = _bangLuongRemoteModel.getClass();

				Method method = clazz.getMethod("setGhiChu", String.class);

				method.invoke(_bangLuongRemoteModel, ghiChu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getBangLuongRemoteModel() {
		return _bangLuongRemoteModel;
	}

	public void setBangLuongRemoteModel(BaseModel<?> bangLuongRemoteModel) {
		_bangLuongRemoteModel = bangLuongRemoteModel;
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

		Class<?> remoteModelClass = _bangLuongRemoteModel.getClass();

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

		Object returnValue = method.invoke(_bangLuongRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			BangLuongLocalServiceUtil.addBangLuong(this);
		}
		else {
			BangLuongLocalServiceUtil.updateBangLuong(this);
		}
	}

	@Override
	public BangLuong toEscapedModel() {
		return (BangLuong)ProxyUtil.newProxyInstance(BangLuong.class.getClassLoader(),
			new Class[] { BangLuong.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		BangLuongClp clone = new BangLuongClp();

		clone.setBanLuongId(getBanLuongId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setTen(getTen());
		clone.setTrangThai(getTrangThai());
		clone.setThang(getThang());
		clone.setNam(getNam());
		clone.setNgay(getNgay());
		clone.setChiTiet(getChiTiet());
		clone.setGhiChu(getGhiChu());

		return clone;
	}

	@Override
	public int compareTo(BangLuong bangLuong) {
		int value = 0;

		value = getTen().compareTo(bangLuong.getTen());

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

		if (!(obj instanceof BangLuongClp)) {
			return false;
		}

		BangLuongClp bangLuong = (BangLuongClp)obj;

		long primaryKey = bangLuong.getPrimaryKey();

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

		sb.append("{banLuongId=");
		sb.append(getBanLuongId());
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
		sb.append(", thang=");
		sb.append(getThang());
		sb.append(", nam=");
		sb.append(getNam());
		sb.append(", ngay=");
		sb.append(getNgay());
		sb.append(", chiTiet=");
		sb.append(getChiTiet());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.minimart.portlet.ketoan.model.BangLuong");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>banLuongId</column-name><column-value><![CDATA[");
		sb.append(getBanLuongId());
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
			"<column><column-name>thang</column-name><column-value><![CDATA[");
		sb.append(getThang());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nam</column-name><column-value><![CDATA[");
		sb.append(getNam());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngay</column-name><column-value><![CDATA[");
		sb.append(getNgay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chiTiet</column-name><column-value><![CDATA[");
		sb.append(getChiTiet());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ghiChu</column-name><column-value><![CDATA[");
		sb.append(getGhiChu());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _banLuongId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private boolean _trangThai;
	private int _thang;
	private int _nam;
	private Date _ngay;
	private String _chiTiet;
	private String _ghiChu;
	private BaseModel<?> _bangLuongRemoteModel;
	private Class<?> _clpSerializerClass = com.minimart.portlet.ketoan.service.ClpSerializer.class;
}