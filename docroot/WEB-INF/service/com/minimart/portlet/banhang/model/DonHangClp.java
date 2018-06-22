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
import com.minimart.portlet.banhang.service.DonHangLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mai Thành Duy An
 */
public class DonHangClp extends BaseModelImpl<DonHang> implements DonHang {
	public DonHangClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return DonHang.class;
	}

	@Override
	public String getModelClassName() {
		return DonHang.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _donHangId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDonHangId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _donHangId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("donHangId", getDonHangId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("cuaHangId", getCuaHangId());
		attributes.put("khachHangId", getKhachHangId());
		attributes.put("hoatDong", getHoatDong());
		attributes.put("tongCong", getTongCong());
		attributes.put("daThanhToan", getDaThanhToan());
		attributes.put("phiVanChuyen", getPhiVanChuyen());
		attributes.put("trangThaiDonHangId", getTrangThaiDonHangId());
		attributes.put("ngayThanhToan", getNgayThanhToan());
		attributes.put("khachDua", getKhachDua());
		attributes.put("traLai", getTraLai());
		attributes.put("thueVAT", getThueVAT());
		attributes.put("diemTichLuy", getDiemTichLuy());
		attributes.put("thanhToanTienMat", getThanhToanTienMat());
		attributes.put("thanhToanThe", getThanhToanThe());
		attributes.put("thanhToanChuyenKhoan", getThanhToanChuyenKhoan());
		attributes.put("phieuGiamGiaId", getPhieuGiamGiaId());
		attributes.put("truTichLuy", getTruTichLuy());
		attributes.put("inHoaDonLan", getInHoaDonLan());
		attributes.put("maDonHang", getMaDonHang());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long donHangId = (Long)attributes.get("donHangId");

		if (donHangId != null) {
			setDonHangId(donHangId);
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

		Long cuaHangId = (Long)attributes.get("cuaHangId");

		if (cuaHangId != null) {
			setCuaHangId(cuaHangId);
		}

		Long khachHangId = (Long)attributes.get("khachHangId");

		if (khachHangId != null) {
			setKhachHangId(khachHangId);
		}

		Boolean hoatDong = (Boolean)attributes.get("hoatDong");

		if (hoatDong != null) {
			setHoatDong(hoatDong);
		}

		Integer tongCong = (Integer)attributes.get("tongCong");

		if (tongCong != null) {
			setTongCong(tongCong);
		}

		Boolean daThanhToan = (Boolean)attributes.get("daThanhToan");

		if (daThanhToan != null) {
			setDaThanhToan(daThanhToan);
		}

		Integer phiVanChuyen = (Integer)attributes.get("phiVanChuyen");

		if (phiVanChuyen != null) {
			setPhiVanChuyen(phiVanChuyen);
		}

		Long trangThaiDonHangId = (Long)attributes.get("trangThaiDonHangId");

		if (trangThaiDonHangId != null) {
			setTrangThaiDonHangId(trangThaiDonHangId);
		}

		Date ngayThanhToan = (Date)attributes.get("ngayThanhToan");

		if (ngayThanhToan != null) {
			setNgayThanhToan(ngayThanhToan);
		}

		Integer khachDua = (Integer)attributes.get("khachDua");

		if (khachDua != null) {
			setKhachDua(khachDua);
		}

		Integer traLai = (Integer)attributes.get("traLai");

		if (traLai != null) {
			setTraLai(traLai);
		}

		Integer thueVAT = (Integer)attributes.get("thueVAT");

		if (thueVAT != null) {
			setThueVAT(thueVAT);
		}

		Integer diemTichLuy = (Integer)attributes.get("diemTichLuy");

		if (diemTichLuy != null) {
			setDiemTichLuy(diemTichLuy);
		}

		Integer thanhToanTienMat = (Integer)attributes.get("thanhToanTienMat");

		if (thanhToanTienMat != null) {
			setThanhToanTienMat(thanhToanTienMat);
		}

		Integer thanhToanThe = (Integer)attributes.get("thanhToanThe");

		if (thanhToanThe != null) {
			setThanhToanThe(thanhToanThe);
		}

		Integer thanhToanChuyenKhoan = (Integer)attributes.get(
				"thanhToanChuyenKhoan");

		if (thanhToanChuyenKhoan != null) {
			setThanhToanChuyenKhoan(thanhToanChuyenKhoan);
		}

		Long phieuGiamGiaId = (Long)attributes.get("phieuGiamGiaId");

		if (phieuGiamGiaId != null) {
			setPhieuGiamGiaId(phieuGiamGiaId);
		}

		Integer truTichLuy = (Integer)attributes.get("truTichLuy");

		if (truTichLuy != null) {
			setTruTichLuy(truTichLuy);
		}

		Integer inHoaDonLan = (Integer)attributes.get("inHoaDonLan");

		if (inHoaDonLan != null) {
			setInHoaDonLan(inHoaDonLan);
		}

		String maDonHang = (String)attributes.get("maDonHang");

		if (maDonHang != null) {
			setMaDonHang(maDonHang);
		}
	}

	@Override
	public long getDonHangId() {
		return _donHangId;
	}

	@Override
	public void setDonHangId(long donHangId) {
		_donHangId = donHangId;

		if (_donHangRemoteModel != null) {
			try {
				Class<?> clazz = _donHangRemoteModel.getClass();

				Method method = clazz.getMethod("setDonHangId", long.class);

				method.invoke(_donHangRemoteModel, donHangId);
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

		if (_donHangRemoteModel != null) {
			try {
				Class<?> clazz = _donHangRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_donHangRemoteModel, companyId);
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

		if (_donHangRemoteModel != null) {
			try {
				Class<?> clazz = _donHangRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_donHangRemoteModel, userId);
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

		if (_donHangRemoteModel != null) {
			try {
				Class<?> clazz = _donHangRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_donHangRemoteModel, userName);
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

		if (_donHangRemoteModel != null) {
			try {
				Class<?> clazz = _donHangRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_donHangRemoteModel, createDate);
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

		if (_donHangRemoteModel != null) {
			try {
				Class<?> clazz = _donHangRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_donHangRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCuaHangId() {
		return _cuaHangId;
	}

	@Override
	public void setCuaHangId(long cuaHangId) {
		_cuaHangId = cuaHangId;

		if (_donHangRemoteModel != null) {
			try {
				Class<?> clazz = _donHangRemoteModel.getClass();

				Method method = clazz.getMethod("setCuaHangId", long.class);

				method.invoke(_donHangRemoteModel, cuaHangId);
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

		if (_donHangRemoteModel != null) {
			try {
				Class<?> clazz = _donHangRemoteModel.getClass();

				Method method = clazz.getMethod("setKhachHangId", long.class);

				method.invoke(_donHangRemoteModel, khachHangId);
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

		if (_donHangRemoteModel != null) {
			try {
				Class<?> clazz = _donHangRemoteModel.getClass();

				Method method = clazz.getMethod("setHoatDong", boolean.class);

				method.invoke(_donHangRemoteModel, hoatDong);
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

		if (_donHangRemoteModel != null) {
			try {
				Class<?> clazz = _donHangRemoteModel.getClass();

				Method method = clazz.getMethod("setTongCong", int.class);

				method.invoke(_donHangRemoteModel, tongCong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getDaThanhToan() {
		return _daThanhToan;
	}

	@Override
	public boolean isDaThanhToan() {
		return _daThanhToan;
	}

	@Override
	public void setDaThanhToan(boolean daThanhToan) {
		_daThanhToan = daThanhToan;

		if (_donHangRemoteModel != null) {
			try {
				Class<?> clazz = _donHangRemoteModel.getClass();

				Method method = clazz.getMethod("setDaThanhToan", boolean.class);

				method.invoke(_donHangRemoteModel, daThanhToan);
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

		if (_donHangRemoteModel != null) {
			try {
				Class<?> clazz = _donHangRemoteModel.getClass();

				Method method = clazz.getMethod("setPhiVanChuyen", int.class);

				method.invoke(_donHangRemoteModel, phiVanChuyen);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTrangThaiDonHangId() {
		return _trangThaiDonHangId;
	}

	@Override
	public void setTrangThaiDonHangId(long trangThaiDonHangId) {
		_trangThaiDonHangId = trangThaiDonHangId;

		if (_donHangRemoteModel != null) {
			try {
				Class<?> clazz = _donHangRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThaiDonHangId",
						long.class);

				method.invoke(_donHangRemoteModel, trangThaiDonHangId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgayThanhToan() {
		return _ngayThanhToan;
	}

	@Override
	public void setNgayThanhToan(Date ngayThanhToan) {
		_ngayThanhToan = ngayThanhToan;

		if (_donHangRemoteModel != null) {
			try {
				Class<?> clazz = _donHangRemoteModel.getClass();

				Method method = clazz.getMethod("setNgayThanhToan", Date.class);

				method.invoke(_donHangRemoteModel, ngayThanhToan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getKhachDua() {
		return _khachDua;
	}

	@Override
	public void setKhachDua(int khachDua) {
		_khachDua = khachDua;

		if (_donHangRemoteModel != null) {
			try {
				Class<?> clazz = _donHangRemoteModel.getClass();

				Method method = clazz.getMethod("setKhachDua", int.class);

				method.invoke(_donHangRemoteModel, khachDua);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTraLai() {
		return _traLai;
	}

	@Override
	public void setTraLai(int traLai) {
		_traLai = traLai;

		if (_donHangRemoteModel != null) {
			try {
				Class<?> clazz = _donHangRemoteModel.getClass();

				Method method = clazz.getMethod("setTraLai", int.class);

				method.invoke(_donHangRemoteModel, traLai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getThueVAT() {
		return _thueVAT;
	}

	@Override
	public void setThueVAT(int thueVAT) {
		_thueVAT = thueVAT;

		if (_donHangRemoteModel != null) {
			try {
				Class<?> clazz = _donHangRemoteModel.getClass();

				Method method = clazz.getMethod("setThueVAT", int.class);

				method.invoke(_donHangRemoteModel, thueVAT);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDiemTichLuy() {
		return _diemTichLuy;
	}

	@Override
	public void setDiemTichLuy(int diemTichLuy) {
		_diemTichLuy = diemTichLuy;

		if (_donHangRemoteModel != null) {
			try {
				Class<?> clazz = _donHangRemoteModel.getClass();

				Method method = clazz.getMethod("setDiemTichLuy", int.class);

				method.invoke(_donHangRemoteModel, diemTichLuy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getThanhToanTienMat() {
		return _thanhToanTienMat;
	}

	@Override
	public void setThanhToanTienMat(int thanhToanTienMat) {
		_thanhToanTienMat = thanhToanTienMat;

		if (_donHangRemoteModel != null) {
			try {
				Class<?> clazz = _donHangRemoteModel.getClass();

				Method method = clazz.getMethod("setThanhToanTienMat", int.class);

				method.invoke(_donHangRemoteModel, thanhToanTienMat);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getThanhToanThe() {
		return _thanhToanThe;
	}

	@Override
	public void setThanhToanThe(int thanhToanThe) {
		_thanhToanThe = thanhToanThe;

		if (_donHangRemoteModel != null) {
			try {
				Class<?> clazz = _donHangRemoteModel.getClass();

				Method method = clazz.getMethod("setThanhToanThe", int.class);

				method.invoke(_donHangRemoteModel, thanhToanThe);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getThanhToanChuyenKhoan() {
		return _thanhToanChuyenKhoan;
	}

	@Override
	public void setThanhToanChuyenKhoan(int thanhToanChuyenKhoan) {
		_thanhToanChuyenKhoan = thanhToanChuyenKhoan;

		if (_donHangRemoteModel != null) {
			try {
				Class<?> clazz = _donHangRemoteModel.getClass();

				Method method = clazz.getMethod("setThanhToanChuyenKhoan",
						int.class);

				method.invoke(_donHangRemoteModel, thanhToanChuyenKhoan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPhieuGiamGiaId() {
		return _phieuGiamGiaId;
	}

	@Override
	public void setPhieuGiamGiaId(long phieuGiamGiaId) {
		_phieuGiamGiaId = phieuGiamGiaId;

		if (_donHangRemoteModel != null) {
			try {
				Class<?> clazz = _donHangRemoteModel.getClass();

				Method method = clazz.getMethod("setPhieuGiamGiaId", long.class);

				method.invoke(_donHangRemoteModel, phieuGiamGiaId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTruTichLuy() {
		return _truTichLuy;
	}

	@Override
	public void setTruTichLuy(int truTichLuy) {
		_truTichLuy = truTichLuy;

		if (_donHangRemoteModel != null) {
			try {
				Class<?> clazz = _donHangRemoteModel.getClass();

				Method method = clazz.getMethod("setTruTichLuy", int.class);

				method.invoke(_donHangRemoteModel, truTichLuy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getInHoaDonLan() {
		return _inHoaDonLan;
	}

	@Override
	public void setInHoaDonLan(int inHoaDonLan) {
		_inHoaDonLan = inHoaDonLan;

		if (_donHangRemoteModel != null) {
			try {
				Class<?> clazz = _donHangRemoteModel.getClass();

				Method method = clazz.getMethod("setInHoaDonLan", int.class);

				method.invoke(_donHangRemoteModel, inHoaDonLan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaDonHang() {
		return _maDonHang;
	}

	@Override
	public void setMaDonHang(String maDonHang) {
		_maDonHang = maDonHang;

		if (_donHangRemoteModel != null) {
			try {
				Class<?> clazz = _donHangRemoteModel.getClass();

				Method method = clazz.getMethod("setMaDonHang", String.class);

				method.invoke(_donHangRemoteModel, maDonHang);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getDonHangRemoteModel() {
		return _donHangRemoteModel;
	}

	public void setDonHangRemoteModel(BaseModel<?> donHangRemoteModel) {
		_donHangRemoteModel = donHangRemoteModel;
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

		Class<?> remoteModelClass = _donHangRemoteModel.getClass();

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

		Object returnValue = method.invoke(_donHangRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DonHangLocalServiceUtil.addDonHang(this);
		}
		else {
			DonHangLocalServiceUtil.updateDonHang(this);
		}
	}

	@Override
	public DonHang toEscapedModel() {
		return (DonHang)ProxyUtil.newProxyInstance(DonHang.class.getClassLoader(),
			new Class[] { DonHang.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DonHangClp clone = new DonHangClp();

		clone.setDonHangId(getDonHangId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCuaHangId(getCuaHangId());
		clone.setKhachHangId(getKhachHangId());
		clone.setHoatDong(getHoatDong());
		clone.setTongCong(getTongCong());
		clone.setDaThanhToan(getDaThanhToan());
		clone.setPhiVanChuyen(getPhiVanChuyen());
		clone.setTrangThaiDonHangId(getTrangThaiDonHangId());
		clone.setNgayThanhToan(getNgayThanhToan());
		clone.setKhachDua(getKhachDua());
		clone.setTraLai(getTraLai());
		clone.setThueVAT(getThueVAT());
		clone.setDiemTichLuy(getDiemTichLuy());
		clone.setThanhToanTienMat(getThanhToanTienMat());
		clone.setThanhToanThe(getThanhToanThe());
		clone.setThanhToanChuyenKhoan(getThanhToanChuyenKhoan());
		clone.setPhieuGiamGiaId(getPhieuGiamGiaId());
		clone.setTruTichLuy(getTruTichLuy());
		clone.setInHoaDonLan(getInHoaDonLan());
		clone.setMaDonHang(getMaDonHang());

		return clone;
	}

	@Override
	public int compareTo(DonHang donHang) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), donHang.getCreateDate());

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

		if (!(obj instanceof DonHangClp)) {
			return false;
		}

		DonHangClp donHang = (DonHangClp)obj;

		long primaryKey = donHang.getPrimaryKey();

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
		StringBundler sb = new StringBundler(51);

		sb.append("{donHangId=");
		sb.append(getDonHangId());
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
		sb.append(", cuaHangId=");
		sb.append(getCuaHangId());
		sb.append(", khachHangId=");
		sb.append(getKhachHangId());
		sb.append(", hoatDong=");
		sb.append(getHoatDong());
		sb.append(", tongCong=");
		sb.append(getTongCong());
		sb.append(", daThanhToan=");
		sb.append(getDaThanhToan());
		sb.append(", phiVanChuyen=");
		sb.append(getPhiVanChuyen());
		sb.append(", trangThaiDonHangId=");
		sb.append(getTrangThaiDonHangId());
		sb.append(", ngayThanhToan=");
		sb.append(getNgayThanhToan());
		sb.append(", khachDua=");
		sb.append(getKhachDua());
		sb.append(", traLai=");
		sb.append(getTraLai());
		sb.append(", thueVAT=");
		sb.append(getThueVAT());
		sb.append(", diemTichLuy=");
		sb.append(getDiemTichLuy());
		sb.append(", thanhToanTienMat=");
		sb.append(getThanhToanTienMat());
		sb.append(", thanhToanThe=");
		sb.append(getThanhToanThe());
		sb.append(", thanhToanChuyenKhoan=");
		sb.append(getThanhToanChuyenKhoan());
		sb.append(", phieuGiamGiaId=");
		sb.append(getPhieuGiamGiaId());
		sb.append(", truTichLuy=");
		sb.append(getTruTichLuy());
		sb.append(", inHoaDonLan=");
		sb.append(getInHoaDonLan());
		sb.append(", maDonHang=");
		sb.append(getMaDonHang());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(79);

		sb.append("<model><model-name>");
		sb.append("com.minimart.portlet.banhang.model.DonHang");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>donHangId</column-name><column-value><![CDATA[");
		sb.append(getDonHangId());
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
			"<column><column-name>cuaHangId</column-name><column-value><![CDATA[");
		sb.append(getCuaHangId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>khachHangId</column-name><column-value><![CDATA[");
		sb.append(getKhachHangId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoatDong</column-name><column-value><![CDATA[");
		sb.append(getHoatDong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tongCong</column-name><column-value><![CDATA[");
		sb.append(getTongCong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>daThanhToan</column-name><column-value><![CDATA[");
		sb.append(getDaThanhToan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phiVanChuyen</column-name><column-value><![CDATA[");
		sb.append(getPhiVanChuyen());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThaiDonHangId</column-name><column-value><![CDATA[");
		sb.append(getTrangThaiDonHangId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngayThanhToan</column-name><column-value><![CDATA[");
		sb.append(getNgayThanhToan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>khachDua</column-name><column-value><![CDATA[");
		sb.append(getKhachDua());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>traLai</column-name><column-value><![CDATA[");
		sb.append(getTraLai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thueVAT</column-name><column-value><![CDATA[");
		sb.append(getThueVAT());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>diemTichLuy</column-name><column-value><![CDATA[");
		sb.append(getDiemTichLuy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thanhToanTienMat</column-name><column-value><![CDATA[");
		sb.append(getThanhToanTienMat());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thanhToanThe</column-name><column-value><![CDATA[");
		sb.append(getThanhToanThe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thanhToanChuyenKhoan</column-name><column-value><![CDATA[");
		sb.append(getThanhToanChuyenKhoan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phieuGiamGiaId</column-name><column-value><![CDATA[");
		sb.append(getPhieuGiamGiaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>truTichLuy</column-name><column-value><![CDATA[");
		sb.append(getTruTichLuy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inHoaDonLan</column-name><column-value><![CDATA[");
		sb.append(getInHoaDonLan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maDonHang</column-name><column-value><![CDATA[");
		sb.append(getMaDonHang());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _donHangId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _cuaHangId;
	private long _khachHangId;
	private boolean _hoatDong;
	private int _tongCong;
	private boolean _daThanhToan;
	private int _phiVanChuyen;
	private long _trangThaiDonHangId;
	private Date _ngayThanhToan;
	private int _khachDua;
	private int _traLai;
	private int _thueVAT;
	private int _diemTichLuy;
	private int _thanhToanTienMat;
	private int _thanhToanThe;
	private int _thanhToanChuyenKhoan;
	private long _phieuGiamGiaId;
	private int _truTichLuy;
	private int _inHoaDonLan;
	private String _maDonHang;
	private BaseModel<?> _donHangRemoteModel;
	private Class<?> _clpSerializerClass = com.minimart.portlet.banhang.service.ClpSerializer.class;
}