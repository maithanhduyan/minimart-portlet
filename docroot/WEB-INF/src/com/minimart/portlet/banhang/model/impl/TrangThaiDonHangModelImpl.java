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

package com.minimart.portlet.banhang.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.minimart.portlet.banhang.model.TrangThaiDonHang;
import com.minimart.portlet.banhang.model.TrangThaiDonHangModel;
import com.minimart.portlet.banhang.model.TrangThaiDonHangSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the TrangThaiDonHang service. Represents a row in the &quot;minimart_trangthaidonhang&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.minimart.portlet.banhang.model.TrangThaiDonHangModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TrangThaiDonHangImpl}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see TrangThaiDonHangImpl
 * @see com.minimart.portlet.banhang.model.TrangThaiDonHang
 * @see com.minimart.portlet.banhang.model.TrangThaiDonHangModel
 * @generated
 */
@JSON(strict = true)
public class TrangThaiDonHangModelImpl extends BaseModelImpl<TrangThaiDonHang>
	implements TrangThaiDonHangModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a trang thai don hang model instance should use the {@link com.minimart.portlet.banhang.model.TrangThaiDonHang} interface instead.
	 */
	public static final String TABLE_NAME = "minimart_trangthaidonhang";
	public static final Object[][] TABLE_COLUMNS = {
			{ "trangThaiDonHangId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "ten", Types.VARCHAR },
			{ "hoatDong", Types.BOOLEAN },
			{ "ghiChu", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table minimart_trangthaidonhang (trangThaiDonHangId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,ten VARCHAR(75) null,hoatDong BOOLEAN,ghiChu VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table minimart_trangthaidonhang";
	public static final String ORDER_BY_JPQL = " ORDER BY trangThaiDonHang.ten ASC";
	public static final String ORDER_BY_SQL = " ORDER BY minimart_trangthaidonhang.ten ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.minimart.portlet.banhang.model.TrangThaiDonHang"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.minimart.portlet.banhang.model.TrangThaiDonHang"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.minimart.portlet.banhang.model.TrangThaiDonHang"),
			true);
	public static long TEN_COLUMN_BITMASK = 1L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static TrangThaiDonHang toModel(TrangThaiDonHangSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		TrangThaiDonHang model = new TrangThaiDonHangImpl();

		model.setTrangThaiDonHangId(soapModel.getTrangThaiDonHangId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setTen(soapModel.getTen());
		model.setHoatDong(soapModel.getHoatDong());
		model.setGhiChu(soapModel.getGhiChu());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<TrangThaiDonHang> toModels(
		TrangThaiDonHangSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<TrangThaiDonHang> models = new ArrayList<TrangThaiDonHang>(soapModels.length);

		for (TrangThaiDonHangSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.minimart.portlet.banhang.model.TrangThaiDonHang"));

	public TrangThaiDonHangModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _trangThaiDonHangId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTrangThaiDonHangId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _trangThaiDonHangId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return TrangThaiDonHang.class;
	}

	@Override
	public String getModelClassName() {
		return TrangThaiDonHang.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("trangThaiDonHangId", getTrangThaiDonHangId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("ten", getTen());
		attributes.put("hoatDong", getHoatDong());
		attributes.put("ghiChu", getGhiChu());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long trangThaiDonHangId = (Long)attributes.get("trangThaiDonHangId");

		if (trangThaiDonHangId != null) {
			setTrangThaiDonHangId(trangThaiDonHangId);
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

		Boolean hoatDong = (Boolean)attributes.get("hoatDong");

		if (hoatDong != null) {
			setHoatDong(hoatDong);
		}

		String ghiChu = (String)attributes.get("ghiChu");

		if (ghiChu != null) {
			setGhiChu(ghiChu);
		}
	}

	@JSON
	@Override
	public long getTrangThaiDonHangId() {
		return _trangThaiDonHangId;
	}

	@Override
	public void setTrangThaiDonHangId(long trangThaiDonHangId) {
		_trangThaiDonHangId = trangThaiDonHangId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getTen() {
		if (_ten == null) {
			return StringPool.BLANK;
		}
		else {
			return _ten;
		}
	}

	@Override
	public void setTen(String ten) {
		_columnBitmask = -1L;

		if (_originalTen == null) {
			_originalTen = _ten;
		}

		_ten = ten;
	}

	public String getOriginalTen() {
		return GetterUtil.getString(_originalTen);
	}

	@JSON
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
	}

	@JSON
	@Override
	public String getGhiChu() {
		if (_ghiChu == null) {
			return StringPool.BLANK;
		}
		else {
			return _ghiChu;
		}
	}

	@Override
	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			TrangThaiDonHang.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TrangThaiDonHang toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TrangThaiDonHang)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TrangThaiDonHangImpl trangThaiDonHangImpl = new TrangThaiDonHangImpl();

		trangThaiDonHangImpl.setTrangThaiDonHangId(getTrangThaiDonHangId());
		trangThaiDonHangImpl.setCompanyId(getCompanyId());
		trangThaiDonHangImpl.setUserId(getUserId());
		trangThaiDonHangImpl.setUserName(getUserName());
		trangThaiDonHangImpl.setCreateDate(getCreateDate());
		trangThaiDonHangImpl.setModifiedDate(getModifiedDate());
		trangThaiDonHangImpl.setTen(getTen());
		trangThaiDonHangImpl.setHoatDong(getHoatDong());
		trangThaiDonHangImpl.setGhiChu(getGhiChu());

		trangThaiDonHangImpl.resetOriginalValues();

		return trangThaiDonHangImpl;
	}

	@Override
	public int compareTo(TrangThaiDonHang trangThaiDonHang) {
		int value = 0;

		value = getTen().compareTo(trangThaiDonHang.getTen());

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

		if (!(obj instanceof TrangThaiDonHang)) {
			return false;
		}

		TrangThaiDonHang trangThaiDonHang = (TrangThaiDonHang)obj;

		long primaryKey = trangThaiDonHang.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		TrangThaiDonHangModelImpl trangThaiDonHangModelImpl = this;

		trangThaiDonHangModelImpl._originalTen = trangThaiDonHangModelImpl._ten;

		trangThaiDonHangModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TrangThaiDonHang> toCacheModel() {
		TrangThaiDonHangCacheModel trangThaiDonHangCacheModel = new TrangThaiDonHangCacheModel();

		trangThaiDonHangCacheModel.trangThaiDonHangId = getTrangThaiDonHangId();

		trangThaiDonHangCacheModel.companyId = getCompanyId();

		trangThaiDonHangCacheModel.userId = getUserId();

		trangThaiDonHangCacheModel.userName = getUserName();

		String userName = trangThaiDonHangCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			trangThaiDonHangCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			trangThaiDonHangCacheModel.createDate = createDate.getTime();
		}
		else {
			trangThaiDonHangCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			trangThaiDonHangCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			trangThaiDonHangCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		trangThaiDonHangCacheModel.ten = getTen();

		String ten = trangThaiDonHangCacheModel.ten;

		if ((ten != null) && (ten.length() == 0)) {
			trangThaiDonHangCacheModel.ten = null;
		}

		trangThaiDonHangCacheModel.hoatDong = getHoatDong();

		trangThaiDonHangCacheModel.ghiChu = getGhiChu();

		String ghiChu = trangThaiDonHangCacheModel.ghiChu;

		if ((ghiChu != null) && (ghiChu.length() == 0)) {
			trangThaiDonHangCacheModel.ghiChu = null;
		}

		return trangThaiDonHangCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{trangThaiDonHangId=");
		sb.append(getTrangThaiDonHangId());
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
		sb.append(", hoatDong=");
		sb.append(getHoatDong());
		sb.append(", ghiChu=");
		sb.append(getGhiChu());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.minimart.portlet.banhang.model.TrangThaiDonHang");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>trangThaiDonHangId</column-name><column-value><![CDATA[");
		sb.append(getTrangThaiDonHangId());
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
			"<column><column-name>hoatDong</column-name><column-value><![CDATA[");
		sb.append(getHoatDong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ghiChu</column-name><column-value><![CDATA[");
		sb.append(getGhiChu());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = TrangThaiDonHang.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			TrangThaiDonHang.class
		};
	private long _trangThaiDonHangId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _ten;
	private String _originalTen;
	private boolean _hoatDong;
	private String _ghiChu;
	private long _columnBitmask;
	private TrangThaiDonHang _escapedModel;
}