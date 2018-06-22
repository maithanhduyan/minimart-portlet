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

package com.minimart.portlet.khachhang.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.minimart.portlet.khachhang.service.ClpSerializer;
import com.minimart.portlet.khachhang.service.KhachHangLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mai Thành Duy An
 */
public class KhachHangClp extends BaseModelImpl<KhachHang> implements KhachHang {
	public KhachHangClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return KhachHang.class;
	}

	@Override
	public String getModelClassName() {
		return KhachHang.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _khachHangId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setKhachHangId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _khachHangId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("khachHangId", getKhachHangId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("nhomKhachHangId", getNhomKhachHangId());
		attributes.put("ma", getMa());
		attributes.put("diaChi", getDiaChi());
		attributes.put("dienThoai", getDienThoai());
		attributes.put("email", getEmail());
		attributes.put("facebook", getFacebook());
		attributes.put("twitter", getTwitter());
		attributes.put("socialMedia1", getSocialMedia1());
		attributes.put("socialMedia2", getSocialMedia2());
		attributes.put("socialMedia3", getSocialMedia3());
		attributes.put("trangThai", getTrangThai());
		attributes.put("diemTichLuy", getDiemTichLuy());
		attributes.put("maSoThue", getMaSoThue());
		attributes.put("hoatDong", getHoatDong());
		attributes.put("ngaySinh", getNgaySinh());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long khachHangId = (Long)attributes.get("khachHangId");

		if (khachHangId != null) {
			setKhachHangId(khachHangId);
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

		Long nhomKhachHangId = (Long)attributes.get("nhomKhachHangId");

		if (nhomKhachHangId != null) {
			setNhomKhachHangId(nhomKhachHangId);
		}

		String ma = (String)attributes.get("ma");

		if (ma != null) {
			setMa(ma);
		}

		String diaChi = (String)attributes.get("diaChi");

		if (diaChi != null) {
			setDiaChi(diaChi);
		}

		String dienThoai = (String)attributes.get("dienThoai");

		if (dienThoai != null) {
			setDienThoai(dienThoai);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String facebook = (String)attributes.get("facebook");

		if (facebook != null) {
			setFacebook(facebook);
		}

		String twitter = (String)attributes.get("twitter");

		if (twitter != null) {
			setTwitter(twitter);
		}

		String socialMedia1 = (String)attributes.get("socialMedia1");

		if (socialMedia1 != null) {
			setSocialMedia1(socialMedia1);
		}

		String socialMedia2 = (String)attributes.get("socialMedia2");

		if (socialMedia2 != null) {
			setSocialMedia2(socialMedia2);
		}

		String socialMedia3 = (String)attributes.get("socialMedia3");

		if (socialMedia3 != null) {
			setSocialMedia3(socialMedia3);
		}

		Integer trangThai = (Integer)attributes.get("trangThai");

		if (trangThai != null) {
			setTrangThai(trangThai);
		}

		Integer diemTichLuy = (Integer)attributes.get("diemTichLuy");

		if (diemTichLuy != null) {
			setDiemTichLuy(diemTichLuy);
		}

		String maSoThue = (String)attributes.get("maSoThue");

		if (maSoThue != null) {
			setMaSoThue(maSoThue);
		}

		Boolean hoatDong = (Boolean)attributes.get("hoatDong");

		if (hoatDong != null) {
			setHoatDong(hoatDong);
		}

		Date ngaySinh = (Date)attributes.get("ngaySinh");

		if (ngaySinh != null) {
			setNgaySinh(ngaySinh);
		}
	}

	@Override
	public long getKhachHangId() {
		return _khachHangId;
	}

	@Override
	public void setKhachHangId(long khachHangId) {
		_khachHangId = khachHangId;

		if (_khachHangRemoteModel != null) {
			try {
				Class<?> clazz = _khachHangRemoteModel.getClass();

				Method method = clazz.getMethod("setKhachHangId", long.class);

				method.invoke(_khachHangRemoteModel, khachHangId);
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

		if (_khachHangRemoteModel != null) {
			try {
				Class<?> clazz = _khachHangRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_khachHangRemoteModel, companyId);
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

		if (_khachHangRemoteModel != null) {
			try {
				Class<?> clazz = _khachHangRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_khachHangRemoteModel, userId);
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

		if (_khachHangRemoteModel != null) {
			try {
				Class<?> clazz = _khachHangRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_khachHangRemoteModel, userName);
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

		if (_khachHangRemoteModel != null) {
			try {
				Class<?> clazz = _khachHangRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_khachHangRemoteModel, createDate);
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

		if (_khachHangRemoteModel != null) {
			try {
				Class<?> clazz = _khachHangRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_khachHangRemoteModel, modifiedDate);
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

		if (_khachHangRemoteModel != null) {
			try {
				Class<?> clazz = _khachHangRemoteModel.getClass();

				Method method = clazz.getMethod("setTen", String.class);

				method.invoke(_khachHangRemoteModel, ten);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNhomKhachHangId() {
		return _nhomKhachHangId;
	}

	@Override
	public void setNhomKhachHangId(long nhomKhachHangId) {
		_nhomKhachHangId = nhomKhachHangId;

		if (_khachHangRemoteModel != null) {
			try {
				Class<?> clazz = _khachHangRemoteModel.getClass();

				Method method = clazz.getMethod("setNhomKhachHangId", long.class);

				method.invoke(_khachHangRemoteModel, nhomKhachHangId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMa() {
		return _ma;
	}

	@Override
	public void setMa(String ma) {
		_ma = ma;

		if (_khachHangRemoteModel != null) {
			try {
				Class<?> clazz = _khachHangRemoteModel.getClass();

				Method method = clazz.getMethod("setMa", String.class);

				method.invoke(_khachHangRemoteModel, ma);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDiaChi() {
		return _diaChi;
	}

	@Override
	public void setDiaChi(String diaChi) {
		_diaChi = diaChi;

		if (_khachHangRemoteModel != null) {
			try {
				Class<?> clazz = _khachHangRemoteModel.getClass();

				Method method = clazz.getMethod("setDiaChi", String.class);

				method.invoke(_khachHangRemoteModel, diaChi);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDienThoai() {
		return _dienThoai;
	}

	@Override
	public void setDienThoai(String dienThoai) {
		_dienThoai = dienThoai;

		if (_khachHangRemoteModel != null) {
			try {
				Class<?> clazz = _khachHangRemoteModel.getClass();

				Method method = clazz.getMethod("setDienThoai", String.class);

				method.invoke(_khachHangRemoteModel, dienThoai);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmail() {
		return _email;
	}

	@Override
	public void setEmail(String email) {
		_email = email;

		if (_khachHangRemoteModel != null) {
			try {
				Class<?> clazz = _khachHangRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_khachHangRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFacebook() {
		return _facebook;
	}

	@Override
	public void setFacebook(String facebook) {
		_facebook = facebook;

		if (_khachHangRemoteModel != null) {
			try {
				Class<?> clazz = _khachHangRemoteModel.getClass();

				Method method = clazz.getMethod("setFacebook", String.class);

				method.invoke(_khachHangRemoteModel, facebook);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTwitter() {
		return _twitter;
	}

	@Override
	public void setTwitter(String twitter) {
		_twitter = twitter;

		if (_khachHangRemoteModel != null) {
			try {
				Class<?> clazz = _khachHangRemoteModel.getClass();

				Method method = clazz.getMethod("setTwitter", String.class);

				method.invoke(_khachHangRemoteModel, twitter);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSocialMedia1() {
		return _socialMedia1;
	}

	@Override
	public void setSocialMedia1(String socialMedia1) {
		_socialMedia1 = socialMedia1;

		if (_khachHangRemoteModel != null) {
			try {
				Class<?> clazz = _khachHangRemoteModel.getClass();

				Method method = clazz.getMethod("setSocialMedia1", String.class);

				method.invoke(_khachHangRemoteModel, socialMedia1);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSocialMedia2() {
		return _socialMedia2;
	}

	@Override
	public void setSocialMedia2(String socialMedia2) {
		_socialMedia2 = socialMedia2;

		if (_khachHangRemoteModel != null) {
			try {
				Class<?> clazz = _khachHangRemoteModel.getClass();

				Method method = clazz.getMethod("setSocialMedia2", String.class);

				method.invoke(_khachHangRemoteModel, socialMedia2);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSocialMedia3() {
		return _socialMedia3;
	}

	@Override
	public void setSocialMedia3(String socialMedia3) {
		_socialMedia3 = socialMedia3;

		if (_khachHangRemoteModel != null) {
			try {
				Class<?> clazz = _khachHangRemoteModel.getClass();

				Method method = clazz.getMethod("setSocialMedia3", String.class);

				method.invoke(_khachHangRemoteModel, socialMedia3);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTrangThai() {
		return _trangThai;
	}

	@Override
	public void setTrangThai(int trangThai) {
		_trangThai = trangThai;

		if (_khachHangRemoteModel != null) {
			try {
				Class<?> clazz = _khachHangRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangThai", int.class);

				method.invoke(_khachHangRemoteModel, trangThai);
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

		if (_khachHangRemoteModel != null) {
			try {
				Class<?> clazz = _khachHangRemoteModel.getClass();

				Method method = clazz.getMethod("setDiemTichLuy", int.class);

				method.invoke(_khachHangRemoteModel, diemTichLuy);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaSoThue() {
		return _maSoThue;
	}

	@Override
	public void setMaSoThue(String maSoThue) {
		_maSoThue = maSoThue;

		if (_khachHangRemoteModel != null) {
			try {
				Class<?> clazz = _khachHangRemoteModel.getClass();

				Method method = clazz.getMethod("setMaSoThue", String.class);

				method.invoke(_khachHangRemoteModel, maSoThue);
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

		if (_khachHangRemoteModel != null) {
			try {
				Class<?> clazz = _khachHangRemoteModel.getClass();

				Method method = clazz.getMethod("setHoatDong", boolean.class);

				method.invoke(_khachHangRemoteModel, hoatDong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgaySinh() {
		return _ngaySinh;
	}

	@Override
	public void setNgaySinh(Date ngaySinh) {
		_ngaySinh = ngaySinh;

		if (_khachHangRemoteModel != null) {
			try {
				Class<?> clazz = _khachHangRemoteModel.getClass();

				Method method = clazz.getMethod("setNgaySinh", Date.class);

				method.invoke(_khachHangRemoteModel, ngaySinh);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getKhachHangRemoteModel() {
		return _khachHangRemoteModel;
	}

	public void setKhachHangRemoteModel(BaseModel<?> khachHangRemoteModel) {
		_khachHangRemoteModel = khachHangRemoteModel;
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

		Class<?> remoteModelClass = _khachHangRemoteModel.getClass();

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

		Object returnValue = method.invoke(_khachHangRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			KhachHangLocalServiceUtil.addKhachHang(this);
		}
		else {
			KhachHangLocalServiceUtil.updateKhachHang(this);
		}
	}

	@Override
	public KhachHang toEscapedModel() {
		return (KhachHang)ProxyUtil.newProxyInstance(KhachHang.class.getClassLoader(),
			new Class[] { KhachHang.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		KhachHangClp clone = new KhachHangClp();

		clone.setKhachHangId(getKhachHangId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setTen(getTen());
		clone.setNhomKhachHangId(getNhomKhachHangId());
		clone.setMa(getMa());
		clone.setDiaChi(getDiaChi());
		clone.setDienThoai(getDienThoai());
		clone.setEmail(getEmail());
		clone.setFacebook(getFacebook());
		clone.setTwitter(getTwitter());
		clone.setSocialMedia1(getSocialMedia1());
		clone.setSocialMedia2(getSocialMedia2());
		clone.setSocialMedia3(getSocialMedia3());
		clone.setTrangThai(getTrangThai());
		clone.setDiemTichLuy(getDiemTichLuy());
		clone.setMaSoThue(getMaSoThue());
		clone.setHoatDong(getHoatDong());
		clone.setNgaySinh(getNgaySinh());

		return clone;
	}

	@Override
	public int compareTo(KhachHang khachHang) {
		int value = 0;

		value = getTen().compareTo(khachHang.getTen());

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

		if (!(obj instanceof KhachHangClp)) {
			return false;
		}

		KhachHangClp khachHang = (KhachHangClp)obj;

		long primaryKey = khachHang.getPrimaryKey();

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
		StringBundler sb = new StringBundler(45);

		sb.append("{khachHangId=");
		sb.append(getKhachHangId());
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
		sb.append(", nhomKhachHangId=");
		sb.append(getNhomKhachHangId());
		sb.append(", ma=");
		sb.append(getMa());
		sb.append(", diaChi=");
		sb.append(getDiaChi());
		sb.append(", dienThoai=");
		sb.append(getDienThoai());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", facebook=");
		sb.append(getFacebook());
		sb.append(", twitter=");
		sb.append(getTwitter());
		sb.append(", socialMedia1=");
		sb.append(getSocialMedia1());
		sb.append(", socialMedia2=");
		sb.append(getSocialMedia2());
		sb.append(", socialMedia3=");
		sb.append(getSocialMedia3());
		sb.append(", trangThai=");
		sb.append(getTrangThai());
		sb.append(", diemTichLuy=");
		sb.append(getDiemTichLuy());
		sb.append(", maSoThue=");
		sb.append(getMaSoThue());
		sb.append(", hoatDong=");
		sb.append(getHoatDong());
		sb.append(", ngaySinh=");
		sb.append(getNgaySinh());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(70);

		sb.append("<model><model-name>");
		sb.append("com.minimart.portlet.khachhang.model.KhachHang");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>khachHangId</column-name><column-value><![CDATA[");
		sb.append(getKhachHangId());
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
			"<column><column-name>nhomKhachHangId</column-name><column-value><![CDATA[");
		sb.append(getNhomKhachHangId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ma</column-name><column-value><![CDATA[");
		sb.append(getMa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>diaChi</column-name><column-value><![CDATA[");
		sb.append(getDiaChi());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dienThoai</column-name><column-value><![CDATA[");
		sb.append(getDienThoai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>facebook</column-name><column-value><![CDATA[");
		sb.append(getFacebook());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>twitter</column-name><column-value><![CDATA[");
		sb.append(getTwitter());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>socialMedia1</column-name><column-value><![CDATA[");
		sb.append(getSocialMedia1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>socialMedia2</column-name><column-value><![CDATA[");
		sb.append(getSocialMedia2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>socialMedia3</column-name><column-value><![CDATA[");
		sb.append(getSocialMedia3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangThai</column-name><column-value><![CDATA[");
		sb.append(getTrangThai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>diemTichLuy</column-name><column-value><![CDATA[");
		sb.append(getDiemTichLuy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maSoThue</column-name><column-value><![CDATA[");
		sb.append(getMaSoThue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoatDong</column-name><column-value><![CDATA[");
		sb.append(getHoatDong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngaySinh</column-name><column-value><![CDATA[");
		sb.append(getNgaySinh());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _khachHangId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private long _nhomKhachHangId;
	private String _ma;
	private String _diaChi;
	private String _dienThoai;
	private String _email;
	private String _facebook;
	private String _twitter;
	private String _socialMedia1;
	private String _socialMedia2;
	private String _socialMedia3;
	private int _trangThai;
	private int _diemTichLuy;
	private String _maSoThue;
	private boolean _hoatDong;
	private Date _ngaySinh;
	private BaseModel<?> _khachHangRemoteModel;
	private Class<?> _clpSerializerClass = com.minimart.portlet.khachhang.service.ClpSerializer.class;
}