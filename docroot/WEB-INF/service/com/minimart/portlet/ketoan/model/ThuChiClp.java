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

import com.minimart.portlet.ketoan.service.ClpSerializer;
import com.minimart.portlet.ketoan.service.ThuChiLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mai Thành Duy An
 */
public class ThuChiClp extends BaseModelImpl<ThuChi> implements ThuChi {
	public ThuChiClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return ThuChi.class;
	}

	@Override
	public String getModelClassName() {
		return ThuChi.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _thuChiId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setThuChiId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _thuChiId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("thuChiId", getThuChiId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("tenDoiTuong", getTenDoiTuong());
		attributes.put("diaChiId", getDiaChiId());
		attributes.put("loai", getLoai());
		attributes.put("loaiDoiTuong", getLoaiDoiTuong());
		attributes.put("thu", getThu());
		attributes.put("chi", getChi());
		attributes.put("nhaCungCapId", getNhaCungCapId());
		attributes.put("khachHangId", getKhachHangId());
		attributes.put("nhanVienId", getNhanVienId());
		attributes.put("theTraTruocId", getTheTraTruocId());
		attributes.put("taiKhoanNganHangId", getTaiKhoanNganHangId());
		attributes.put("datHangId", getDatHangId());
		attributes.put("bangLuongId", getBangLuongId());
		attributes.put("lyDoThuChi", getLyDoThuChi());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long thuChiId = (Long)attributes.get("thuChiId");

		if (thuChiId != null) {
			setThuChiId(thuChiId);
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

		String tenDoiTuong = (String)attributes.get("tenDoiTuong");

		if (tenDoiTuong != null) {
			setTenDoiTuong(tenDoiTuong);
		}

		Long diaChiId = (Long)attributes.get("diaChiId");

		if (diaChiId != null) {
			setDiaChiId(diaChiId);
		}

		Integer loai = (Integer)attributes.get("loai");

		if (loai != null) {
			setLoai(loai);
		}

		Integer loaiDoiTuong = (Integer)attributes.get("loaiDoiTuong");

		if (loaiDoiTuong != null) {
			setLoaiDoiTuong(loaiDoiTuong);
		}

		Integer thu = (Integer)attributes.get("thu");

		if (thu != null) {
			setThu(thu);
		}

		Integer chi = (Integer)attributes.get("chi");

		if (chi != null) {
			setChi(chi);
		}

		Long nhaCungCapId = (Long)attributes.get("nhaCungCapId");

		if (nhaCungCapId != null) {
			setNhaCungCapId(nhaCungCapId);
		}

		Long khachHangId = (Long)attributes.get("khachHangId");

		if (khachHangId != null) {
			setKhachHangId(khachHangId);
		}

		Long nhanVienId = (Long)attributes.get("nhanVienId");

		if (nhanVienId != null) {
			setNhanVienId(nhanVienId);
		}

		Long theTraTruocId = (Long)attributes.get("theTraTruocId");

		if (theTraTruocId != null) {
			setTheTraTruocId(theTraTruocId);
		}

		Long taiKhoanNganHangId = (Long)attributes.get("taiKhoanNganHangId");

		if (taiKhoanNganHangId != null) {
			setTaiKhoanNganHangId(taiKhoanNganHangId);
		}

		Long datHangId = (Long)attributes.get("datHangId");

		if (datHangId != null) {
			setDatHangId(datHangId);
		}

		Long bangLuongId = (Long)attributes.get("bangLuongId");

		if (bangLuongId != null) {
			setBangLuongId(bangLuongId);
		}

		String lyDoThuChi = (String)attributes.get("lyDoThuChi");

		if (lyDoThuChi != null) {
			setLyDoThuChi(lyDoThuChi);
		}
	}

	@Override
	public long getThuChiId() {
		return _thuChiId;
	}

	@Override
	public void setThuChiId(long thuChiId) {
		_thuChiId = thuChiId;

		if (_thuChiRemoteModel != null) {
			try {
				Class<?> clazz = _thuChiRemoteModel.getClass();

				Method method = clazz.getMethod("setThuChiId", long.class);

				method.invoke(_thuChiRemoteModel, thuChiId);
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

		if (_thuChiRemoteModel != null) {
			try {
				Class<?> clazz = _thuChiRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_thuChiRemoteModel, companyId);
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

		if (_thuChiRemoteModel != null) {
			try {
				Class<?> clazz = _thuChiRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_thuChiRemoteModel, userId);
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

		if (_thuChiRemoteModel != null) {
			try {
				Class<?> clazz = _thuChiRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_thuChiRemoteModel, userName);
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

		if (_thuChiRemoteModel != null) {
			try {
				Class<?> clazz = _thuChiRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_thuChiRemoteModel, createDate);
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

		if (_thuChiRemoteModel != null) {
			try {
				Class<?> clazz = _thuChiRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_thuChiRemoteModel, modifiedDate);
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

		if (_thuChiRemoteModel != null) {
			try {
				Class<?> clazz = _thuChiRemoteModel.getClass();

				Method method = clazz.getMethod("setTen", String.class);

				method.invoke(_thuChiRemoteModel, ten);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenDoiTuong() {
		return _tenDoiTuong;
	}

	@Override
	public void setTenDoiTuong(String tenDoiTuong) {
		_tenDoiTuong = tenDoiTuong;

		if (_thuChiRemoteModel != null) {
			try {
				Class<?> clazz = _thuChiRemoteModel.getClass();

				Method method = clazz.getMethod("setTenDoiTuong", String.class);

				method.invoke(_thuChiRemoteModel, tenDoiTuong);
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

		if (_thuChiRemoteModel != null) {
			try {
				Class<?> clazz = _thuChiRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChiId", long.class);

				method.invoke(_thuChiRemoteModel, diaChiId);
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

		if (_thuChiRemoteModel != null) {
			try {
				Class<?> clazz = _thuChiRemoteModel.getClass();

				Method method = clazz.getMethod("setLoai", int.class);

				method.invoke(_thuChiRemoteModel, loai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getLoaiDoiTuong() {
		return _loaiDoiTuong;
	}

	@Override
	public void setLoaiDoiTuong(int loaiDoiTuong) {
		_loaiDoiTuong = loaiDoiTuong;

		if (_thuChiRemoteModel != null) {
			try {
				Class<?> clazz = _thuChiRemoteModel.getClass();

				Method method = clazz.getMethod("setLoaiDoiTuong", int.class);

				method.invoke(_thuChiRemoteModel, loaiDoiTuong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getThu() {
		return _thu;
	}

	@Override
	public void setThu(int thu) {
		_thu = thu;

		if (_thuChiRemoteModel != null) {
			try {
				Class<?> clazz = _thuChiRemoteModel.getClass();

				Method method = clazz.getMethod("setThu", int.class);

				method.invoke(_thuChiRemoteModel, thu);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getChi() {
		return _chi;
	}

	@Override
	public void setChi(int chi) {
		_chi = chi;

		if (_thuChiRemoteModel != null) {
			try {
				Class<?> clazz = _thuChiRemoteModel.getClass();

				Method method = clazz.getMethod("setChi", int.class);

				method.invoke(_thuChiRemoteModel, chi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNhaCungCapId() {
		return _nhaCungCapId;
	}

	@Override
	public void setNhaCungCapId(long nhaCungCapId) {
		_nhaCungCapId = nhaCungCapId;

		if (_thuChiRemoteModel != null) {
			try {
				Class<?> clazz = _thuChiRemoteModel.getClass();

				Method method = clazz.getMethod("setNhaCungCapId", long.class);

				method.invoke(_thuChiRemoteModel, nhaCungCapId);
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

		if (_thuChiRemoteModel != null) {
			try {
				Class<?> clazz = _thuChiRemoteModel.getClass();

				Method method = clazz.getMethod("setKhachHangId", long.class);

				method.invoke(_thuChiRemoteModel, khachHangId);
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

		if (_thuChiRemoteModel != null) {
			try {
				Class<?> clazz = _thuChiRemoteModel.getClass();

				Method method = clazz.getMethod("setNhanVienId", long.class);

				method.invoke(_thuChiRemoteModel, nhanVienId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTheTraTruocId() {
		return _theTraTruocId;
	}

	@Override
	public void setTheTraTruocId(long theTraTruocId) {
		_theTraTruocId = theTraTruocId;

		if (_thuChiRemoteModel != null) {
			try {
				Class<?> clazz = _thuChiRemoteModel.getClass();

				Method method = clazz.getMethod("setTheTraTruocId", long.class);

				method.invoke(_thuChiRemoteModel, theTraTruocId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTaiKhoanNganHangId() {
		return _taiKhoanNganHangId;
	}

	@Override
	public void setTaiKhoanNganHangId(long taiKhoanNganHangId) {
		_taiKhoanNganHangId = taiKhoanNganHangId;

		if (_thuChiRemoteModel != null) {
			try {
				Class<?> clazz = _thuChiRemoteModel.getClass();

				Method method = clazz.getMethod("setTaiKhoanNganHangId",
						long.class);

				method.invoke(_thuChiRemoteModel, taiKhoanNganHangId);
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

		if (_thuChiRemoteModel != null) {
			try {
				Class<?> clazz = _thuChiRemoteModel.getClass();

				Method method = clazz.getMethod("setDatHangId", long.class);

				method.invoke(_thuChiRemoteModel, datHangId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getBangLuongId() {
		return _bangLuongId;
	}

	@Override
	public void setBangLuongId(long bangLuongId) {
		_bangLuongId = bangLuongId;

		if (_thuChiRemoteModel != null) {
			try {
				Class<?> clazz = _thuChiRemoteModel.getClass();

				Method method = clazz.getMethod("setBangLuongId", long.class);

				method.invoke(_thuChiRemoteModel, bangLuongId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLyDoThuChi() {
		return _lyDoThuChi;
	}

	@Override
	public void setLyDoThuChi(String lyDoThuChi) {
		_lyDoThuChi = lyDoThuChi;

		if (_thuChiRemoteModel != null) {
			try {
				Class<?> clazz = _thuChiRemoteModel.getClass();

				Method method = clazz.getMethod("setLyDoThuChi", String.class);

				method.invoke(_thuChiRemoteModel, lyDoThuChi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getThuChiRemoteModel() {
		return _thuChiRemoteModel;
	}

	public void setThuChiRemoteModel(BaseModel<?> thuChiRemoteModel) {
		_thuChiRemoteModel = thuChiRemoteModel;
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

		Class<?> remoteModelClass = _thuChiRemoteModel.getClass();

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

		Object returnValue = method.invoke(_thuChiRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ThuChiLocalServiceUtil.addThuChi(this);
		}
		else {
			ThuChiLocalServiceUtil.updateThuChi(this);
		}
	}

	@Override
	public ThuChi toEscapedModel() {
		return (ThuChi)ProxyUtil.newProxyInstance(ThuChi.class.getClassLoader(),
			new Class[] { ThuChi.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ThuChiClp clone = new ThuChiClp();

		clone.setThuChiId(getThuChiId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setTen(getTen());
		clone.setTenDoiTuong(getTenDoiTuong());
		clone.setDiaChiId(getDiaChiId());
		clone.setLoai(getLoai());
		clone.setLoaiDoiTuong(getLoaiDoiTuong());
		clone.setThu(getThu());
		clone.setChi(getChi());
		clone.setNhaCungCapId(getNhaCungCapId());
		clone.setKhachHangId(getKhachHangId());
		clone.setNhanVienId(getNhanVienId());
		clone.setTheTraTruocId(getTheTraTruocId());
		clone.setTaiKhoanNganHangId(getTaiKhoanNganHangId());
		clone.setDatHangId(getDatHangId());
		clone.setBangLuongId(getBangLuongId());
		clone.setLyDoThuChi(getLyDoThuChi());

		return clone;
	}

	@Override
	public int compareTo(ThuChi thuChi) {
		int value = 0;

		value = getTen().compareTo(thuChi.getTen());

		if (value != 0) {
			return value;
		}

		value = getTenDoiTuong().compareTo(thuChi.getTenDoiTuong());

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

		if (!(obj instanceof ThuChiClp)) {
			return false;
		}

		ThuChiClp thuChi = (ThuChiClp)obj;

		long primaryKey = thuChi.getPrimaryKey();

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
		StringBundler sb = new StringBundler(43);

		sb.append("{thuChiId=");
		sb.append(getThuChiId());
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
		sb.append(", tenDoiTuong=");
		sb.append(getTenDoiTuong());
		sb.append(", diaChiId=");
		sb.append(getDiaChiId());
		sb.append(", loai=");
		sb.append(getLoai());
		sb.append(", loaiDoiTuong=");
		sb.append(getLoaiDoiTuong());
		sb.append(", thu=");
		sb.append(getThu());
		sb.append(", chi=");
		sb.append(getChi());
		sb.append(", nhaCungCapId=");
		sb.append(getNhaCungCapId());
		sb.append(", khachHangId=");
		sb.append(getKhachHangId());
		sb.append(", nhanVienId=");
		sb.append(getNhanVienId());
		sb.append(", theTraTruocId=");
		sb.append(getTheTraTruocId());
		sb.append(", taiKhoanNganHangId=");
		sb.append(getTaiKhoanNganHangId());
		sb.append(", datHangId=");
		sb.append(getDatHangId());
		sb.append(", bangLuongId=");
		sb.append(getBangLuongId());
		sb.append(", lyDoThuChi=");
		sb.append(getLyDoThuChi());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(67);

		sb.append("<model><model-name>");
		sb.append("com.minimart.portlet.ketoan.model.ThuChi");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>thuChiId</column-name><column-value><![CDATA[");
		sb.append(getThuChiId());
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
			"<column><column-name>tenDoiTuong</column-name><column-value><![CDATA[");
		sb.append(getTenDoiTuong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>diaChiId</column-name><column-value><![CDATA[");
		sb.append(getDiaChiId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loai</column-name><column-value><![CDATA[");
		sb.append(getLoai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loaiDoiTuong</column-name><column-value><![CDATA[");
		sb.append(getLoaiDoiTuong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>thu</column-name><column-value><![CDATA[");
		sb.append(getThu());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chi</column-name><column-value><![CDATA[");
		sb.append(getChi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nhaCungCapId</column-name><column-value><![CDATA[");
		sb.append(getNhaCungCapId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>khachHangId</column-name><column-value><![CDATA[");
		sb.append(getKhachHangId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nhanVienId</column-name><column-value><![CDATA[");
		sb.append(getNhanVienId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>theTraTruocId</column-name><column-value><![CDATA[");
		sb.append(getTheTraTruocId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taiKhoanNganHangId</column-name><column-value><![CDATA[");
		sb.append(getTaiKhoanNganHangId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>datHangId</column-name><column-value><![CDATA[");
		sb.append(getDatHangId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bangLuongId</column-name><column-value><![CDATA[");
		sb.append(getBangLuongId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lyDoThuChi</column-name><column-value><![CDATA[");
		sb.append(getLyDoThuChi());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _thuChiId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private String _tenDoiTuong;
	private long _diaChiId;
	private int _loai;
	private int _loaiDoiTuong;
	private int _thu;
	private int _chi;
	private long _nhaCungCapId;
	private long _khachHangId;
	private long _nhanVienId;
	private long _theTraTruocId;
	private long _taiKhoanNganHangId;
	private long _datHangId;
	private long _bangLuongId;
	private String _lyDoThuChi;
	private BaseModel<?> _thuChiRemoteModel;
	private Class<?> _clpSerializerClass = com.minimart.portlet.ketoan.service.ClpSerializer.class;
}