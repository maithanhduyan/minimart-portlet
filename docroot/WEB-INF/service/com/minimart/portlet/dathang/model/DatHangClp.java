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
import com.minimart.portlet.dathang.service.DatHangLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mai Thành Duy An
 */
public class DatHangClp extends BaseModelImpl<DatHang> implements DatHang {
	public DatHangClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DatHang.class;
	}

	@Override
	public String getModelClassName() {
		return DatHang.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _datHangId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDatHangId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _datHangId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("datHangId", getDatHangId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("khachHangId", getKhachHangId());
		attributes.put("diaChiId", getDiaChiId());
		attributes.put("tienHang", getTienHang());
		attributes.put("tiLeThue", getTiLeThue());
		attributes.put("tiLeGiamGia", getTiLeGiamGia());
		attributes.put("tienGiamGia", getTienGiamGia());
		attributes.put("phiVanChuyen", getPhiVanChuyen());
		attributes.put("tongCong", getTongCong());
		attributes.put("loai", getLoai());
		attributes.put("giamTheoTien", getGiamTheoTien());
		attributes.put("trangThai", getTrangThai());
		attributes.put("userModifiedId", getUserModifiedId());
		attributes.put("timeModified", getTimeModified());
		attributes.put("userCreateId", getUserCreateId());
		attributes.put("loaiGia", getLoaiGia());
		attributes.put("hoatDong", getHoatDong());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long datHangId = (Long)attributes.get("datHangId");

		if (datHangId != null) {
			setDatHangId(datHangId);
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

		Long khachHangId = (Long)attributes.get("khachHangId");

		if (khachHangId != null) {
			setKhachHangId(khachHangId);
		}

		Long diaChiId = (Long)attributes.get("diaChiId");

		if (diaChiId != null) {
			setDiaChiId(diaChiId);
		}

		Integer tienHang = (Integer)attributes.get("tienHang");

		if (tienHang != null) {
			setTienHang(tienHang);
		}

		Double tiLeThue = (Double)attributes.get("tiLeThue");

		if (tiLeThue != null) {
			setTiLeThue(tiLeThue);
		}

		Double tiLeGiamGia = (Double)attributes.get("tiLeGiamGia");

		if (tiLeGiamGia != null) {
			setTiLeGiamGia(tiLeGiamGia);
		}

		Integer tienGiamGia = (Integer)attributes.get("tienGiamGia");

		if (tienGiamGia != null) {
			setTienGiamGia(tienGiamGia);
		}

		Integer phiVanChuyen = (Integer)attributes.get("phiVanChuyen");

		if (phiVanChuyen != null) {
			setPhiVanChuyen(phiVanChuyen);
		}

		Integer tongCong = (Integer)attributes.get("tongCong");

		if (tongCong != null) {
			setTongCong(tongCong);
		}

		Integer loai = (Integer)attributes.get("loai");

		if (loai != null) {
			setLoai(loai);
		}

		Integer giamTheoTien = (Integer)attributes.get("giamTheoTien");

		if (giamTheoTien != null) {
			setGiamTheoTien(giamTheoTien);
		}

		Boolean trangThai = (Boolean)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		Long userModifiedId = (Long)attributes.get("userModifiedId");

		if (userModifiedId != null) {
			setUserModifiedId(userModifiedId);
		}

		Date timeModified = (Date)attributes.get("timeModified");

		if (timeModified != null) {
			setTimeModified(timeModified);
		}

		Long userCreateId = (Long)attributes.get("userCreateId");

		if (userCreateId != null) {
			setUserCreateId(userCreateId);
		}

		Integer loaiGia = (Integer)attributes.get("loaiGia");

		if (loaiGia != null) {
			setLoaiGia(loaiGia);
		}

		Boolean hoatDong = (Boolean)attributes.get("hoatDong");

		if (hoatDong != null) {
			setHoatDong(hoatDong);
		}
	}

	@Override
	public long getDatHangId() {
		return _datHangId;
	}

	@Override
	public void setDatHangId(long datHangId) {
		_datHangId = datHangId;

		if (_datHangRemoteModel != null) {
			try {
				Class<?> clazz = _datHangRemoteModel.getClass();

				Method method = clazz.getMethod("setDatHangId", long.class);

				method.invoke(_datHangRemoteModel, datHangId);
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

		if (_datHangRemoteModel != null) {
			try {
				Class<?> clazz = _datHangRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_datHangRemoteModel, companyId);
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

		if (_datHangRemoteModel != null) {
			try {
				Class<?> clazz = _datHangRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_datHangRemoteModel, userId);
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

		if (_datHangRemoteModel != null) {
			try {
				Class<?> clazz = _datHangRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_datHangRemoteModel, userName);
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

		if (_datHangRemoteModel != null) {
			try {
				Class<?> clazz = _datHangRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_datHangRemoteModel, createDate);
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

		if (_datHangRemoteModel != null) {
			try {
				Class<?> clazz = _datHangRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_datHangRemoteModel, modifiedDate);
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

		if (_datHangRemoteModel != null) {
			try {
				Class<?> clazz = _datHangRemoteModel.getClass();

				Method method = clazz.getMethod("setTen", String.class);

				method.invoke(_datHangRemoteModel, ten);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getKhachHangId() {
		return _khachHangId;
	}

	@Override
	public void setKhachHangId(long khachHangId) {
		_khachHangId = khachHangId;

		if (_datHangRemoteModel != null) {
			try {
				Class<?> clazz = _datHangRemoteModel.getClass();

				Method method = clazz.getMethod("setKhachHangId", long.class);

				method.invoke(_datHangRemoteModel, khachHangId);
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

		if (_datHangRemoteModel != null) {
			try {
				Class<?> clazz = _datHangRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChiId", long.class);

				method.invoke(_datHangRemoteModel, diaChiId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTienHang() {
		return _tienHang;
	}

	@Override
	public void setTienHang(int tienHang) {
		_tienHang = tienHang;

		if (_datHangRemoteModel != null) {
			try {
				Class<?> clazz = _datHangRemoteModel.getClass();

				Method method = clazz.getMethod("setTienHang", int.class);

				method.invoke(_datHangRemoteModel, tienHang);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getTiLeThue() {
		return _tiLeThue;
	}

	@Override
	public void setTiLeThue(double tiLeThue) {
		_tiLeThue = tiLeThue;

		if (_datHangRemoteModel != null) {
			try {
				Class<?> clazz = _datHangRemoteModel.getClass();

				Method method = clazz.getMethod("setTiLeThue", double.class);

				method.invoke(_datHangRemoteModel, tiLeThue);
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

		if (_datHangRemoteModel != null) {
			try {
				Class<?> clazz = _datHangRemoteModel.getClass();

				Method method = clazz.getMethod("setTiLeGiamGia", double.class);

				method.invoke(_datHangRemoteModel, tiLeGiamGia);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTienGiamGia() {
		return _tienGiamGia;
	}

	@Override
	public void setTienGiamGia(int tienGiamGia) {
		_tienGiamGia = tienGiamGia;

		if (_datHangRemoteModel != null) {
			try {
				Class<?> clazz = _datHangRemoteModel.getClass();

				Method method = clazz.getMethod("setTienGiamGia", int.class);

				method.invoke(_datHangRemoteModel, tienGiamGia);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPhiVanChuyen() {
		return _phiVanChuyen;
	}

	@Override
	public void setPhiVanChuyen(int phiVanChuyen) {
		_phiVanChuyen = phiVanChuyen;

		if (_datHangRemoteModel != null) {
			try {
				Class<?> clazz = _datHangRemoteModel.getClass();

				Method method = clazz.getMethod("setPhiVanChuyen", int.class);

				method.invoke(_datHangRemoteModel, phiVanChuyen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTongCong() {
		return _tongCong;
	}

	@Override
	public void setTongCong(int tongCong) {
		_tongCong = tongCong;

		if (_datHangRemoteModel != null) {
			try {
				Class<?> clazz = _datHangRemoteModel.getClass();

				Method method = clazz.getMethod("setTongCong", int.class);

				method.invoke(_datHangRemoteModel, tongCong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLoai() {
		return _loai;
	}

	@Override
	public void setLoai(int loai) {
		_loai = loai;

		if (_datHangRemoteModel != null) {
			try {
				Class<?> clazz = _datHangRemoteModel.getClass();

				Method method = clazz.getMethod("setLoai", int.class);

				method.invoke(_datHangRemoteModel, loai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getGiamTheoTien() {
		return _giamTheoTien;
	}

	@Override
	public void setGiamTheoTien(int giamTheoTien) {
		_giamTheoTien = giamTheoTien;

		if (_datHangRemoteModel != null) {
			try {
				Class<?> clazz = _datHangRemoteModel.getClass();

				Method method = clazz.getMethod("setGiamTheoTien", int.class);

				method.invoke(_datHangRemoteModel, giamTheoTien);
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

		if (_datHangRemoteModel != null) {
			try {
				Class<?> clazz = _datHangRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThai", boolean.class);

				method.invoke(_datHangRemoteModel, trangThai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserModifiedId() {
		return _userModifiedId;
	}

	@Override
	public void setUserModifiedId(long userModifiedId) {
		_userModifiedId = userModifiedId;

		if (_datHangRemoteModel != null) {
			try {
				Class<?> clazz = _datHangRemoteModel.getClass();

				Method method = clazz.getMethod("setUserModifiedId", long.class);

				method.invoke(_datHangRemoteModel, userModifiedId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getTimeModified() {
		return _timeModified;
	}

	@Override
	public void setTimeModified(Date timeModified) {
		_timeModified = timeModified;

		if (_datHangRemoteModel != null) {
			try {
				Class<?> clazz = _datHangRemoteModel.getClass();

				Method method = clazz.getMethod("setTimeModified", Date.class);

				method.invoke(_datHangRemoteModel, timeModified);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserCreateId() {
		return _userCreateId;
	}

	@Override
	public void setUserCreateId(long userCreateId) {
		_userCreateId = userCreateId;

		if (_datHangRemoteModel != null) {
			try {
				Class<?> clazz = _datHangRemoteModel.getClass();

				Method method = clazz.getMethod("setUserCreateId", long.class);

				method.invoke(_datHangRemoteModel, userCreateId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLoaiGia() {
		return _loaiGia;
	}

	@Override
	public void setLoaiGia(int loaiGia) {
		_loaiGia = loaiGia;

		if (_datHangRemoteModel != null) {
			try {
				Class<?> clazz = _datHangRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiGia", int.class);

				method.invoke(_datHangRemoteModel, loaiGia);
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

		if (_datHangRemoteModel != null) {
			try {
				Class<?> clazz = _datHangRemoteModel.getClass();

				Method method = clazz.getMethod("setHoatDong", boolean.class);

				method.invoke(_datHangRemoteModel, hoatDong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDatHangRemoteModel() {
		return _datHangRemoteModel;
	}

	public void setDatHangRemoteModel(BaseModel<?> datHangRemoteModel) {
		_datHangRemoteModel = datHangRemoteModel;
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

		Class<?> remoteModelClass = _datHangRemoteModel.getClass();

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

		Object returnValue = method.invoke(_datHangRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DatHangLocalServiceUtil.addDatHang(this);
		}
		else {
			DatHangLocalServiceUtil.updateDatHang(this);
		}
	}

	@Override
	public DatHang toEscapedModel() {
		return (DatHang)ProxyUtil.newProxyInstance(DatHang.class.getClassLoader(),
			new Class[] { DatHang.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DatHangClp clone = new DatHangClp();

		clone.setDatHangId(getDatHangId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setTen(getTen());
		clone.setKhachHangId(getKhachHangId());
		clone.setDiaChiId(getDiaChiId());
		clone.setTienHang(getTienHang());
		clone.setTiLeThue(getTiLeThue());
		clone.setTiLeGiamGia(getTiLeGiamGia());
		clone.setTienGiamGia(getTienGiamGia());
		clone.setPhiVanChuyen(getPhiVanChuyen());
		clone.setTongCong(getTongCong());
		clone.setLoai(getLoai());
		clone.setGiamTheoTien(getGiamTheoTien());
		clone.setTrangThai(getTrangThai());
		clone.setUserModifiedId(getUserModifiedId());
		clone.setTimeModified(getTimeModified());
		clone.setUserCreateId(getUserCreateId());
		clone.setLoaiGia(getLoaiGia());
		clone.setHoatDong(getHoatDong());

		return clone;
	}

	@Override
	public int compareTo(DatHang datHang) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), datHang.getCreateDate());

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

		if (!(obj instanceof DatHangClp)) {
			return false;
		}

		DatHangClp datHang = (DatHangClp)obj;

		long primaryKey = datHang.getPrimaryKey();

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
		StringBundler sb = new StringBundler(47);

		sb.append("{datHangId=");
		sb.append(getDatHangId());
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
		sb.append(", khachHangId=");
		sb.append(getKhachHangId());
		sb.append(", diaChiId=");
		sb.append(getDiaChiId());
		sb.append(", tienHang=");
		sb.append(getTienHang());
		sb.append(", tiLeThue=");
		sb.append(getTiLeThue());
		sb.append(", tiLeGiamGia=");
		sb.append(getTiLeGiamGia());
		sb.append(", tienGiamGia=");
		sb.append(getTienGiamGia());
		sb.append(", phiVanChuyen=");
		sb.append(getPhiVanChuyen());
		sb.append(", tongCong=");
		sb.append(getTongCong());
		sb.append(", loai=");
		sb.append(getLoai());
		sb.append(", giamTheoTien=");
		sb.append(getGiamTheoTien());
		sb.append(", trangThai=");
		sb.append(getTrangThai());
		sb.append(", userModifiedId=");
		sb.append(getUserModifiedId());
		sb.append(", timeModified=");
		sb.append(getTimeModified());
		sb.append(", userCreateId=");
		sb.append(getUserCreateId());
		sb.append(", loaiGia=");
		sb.append(getLoaiGia());
		sb.append(", hoatDong=");
		sb.append(getHoatDong());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(73);

		sb.append("<model><model-name>");
		sb.append("com.minimart.portlet.dathang.model.DatHang");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>datHangId</column-name><column-value><![CDATA[");
		sb.append(getDatHangId());
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
			"<column><column-name>khachHangId</column-name><column-value><![CDATA[");
		sb.append(getKhachHangId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>diaChiId</column-name><column-value><![CDATA[");
		sb.append(getDiaChiId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tienHang</column-name><column-value><![CDATA[");
		sb.append(getTienHang());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tiLeThue</column-name><column-value><![CDATA[");
		sb.append(getTiLeThue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tiLeGiamGia</column-name><column-value><![CDATA[");
		sb.append(getTiLeGiamGia());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tienGiamGia</column-name><column-value><![CDATA[");
		sb.append(getTienGiamGia());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phiVanChuyen</column-name><column-value><![CDATA[");
		sb.append(getPhiVanChuyen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tongCong</column-name><column-value><![CDATA[");
		sb.append(getTongCong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loai</column-name><column-value><![CDATA[");
		sb.append(getLoai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>giamTheoTien</column-name><column-value><![CDATA[");
		sb.append(getGiamTheoTien());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThai</column-name><column-value><![CDATA[");
		sb.append(getTrangThai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userModifiedId</column-name><column-value><![CDATA[");
		sb.append(getUserModifiedId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>timeModified</column-name><column-value><![CDATA[");
		sb.append(getTimeModified());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userCreateId</column-name><column-value><![CDATA[");
		sb.append(getUserCreateId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiGia</column-name><column-value><![CDATA[");
		sb.append(getLoaiGia());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoatDong</column-name><column-value><![CDATA[");
		sb.append(getHoatDong());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _datHangId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private long _khachHangId;
	private long _diaChiId;
	private int _tienHang;
	private double _tiLeThue;
	private double _tiLeGiamGia;
	private int _tienGiamGia;
	private int _phiVanChuyen;
	private int _tongCong;
	private int _loai;
	private int _giamTheoTien;
	private boolean _trangThai;
	private long _userModifiedId;
	private Date _timeModified;
	private long _userCreateId;
	private int _loaiGia;
	private boolean _hoatDong;
	private BaseModel<?> _datHangRemoteModel;
	private Class<?> _clpSerializerClass = com.minimart.portlet.dathang.service.ClpSerializer.class;
}