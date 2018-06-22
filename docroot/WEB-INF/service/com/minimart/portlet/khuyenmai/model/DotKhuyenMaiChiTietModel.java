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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.AuditedModel;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the DotKhuyenMaiChiTiet service. Represents a row in the &quot;minimart_dotkhuyenmaichitiet&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiChiTietModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiChiTietImpl}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see DotKhuyenMaiChiTiet
 * @see com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiChiTietImpl
 * @see com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiChiTietModelImpl
 * @generated
 */
public interface DotKhuyenMaiChiTietModel extends AuditedModel,
	BaseModel<DotKhuyenMaiChiTiet> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dot khuyen mai chi tiet model instance should use the {@link DotKhuyenMaiChiTiet} interface instead.
	 */

	/**
	 * Returns the primary key of this dot khuyen mai chi tiet.
	 *
	 * @return the primary key of this dot khuyen mai chi tiet
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this dot khuyen mai chi tiet.
	 *
	 * @param primaryKey the primary key of this dot khuyen mai chi tiet
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the dot khuyen mai chi tiet ID of this dot khuyen mai chi tiet.
	 *
	 * @return the dot khuyen mai chi tiet ID of this dot khuyen mai chi tiet
	 */
	public long getDotKhuyenMaiChiTietId();

	/**
	 * Sets the dot khuyen mai chi tiet ID of this dot khuyen mai chi tiet.
	 *
	 * @param dotKhuyenMaiChiTietId the dot khuyen mai chi tiet ID of this dot khuyen mai chi tiet
	 */
	public void setDotKhuyenMaiChiTietId(long dotKhuyenMaiChiTietId);

	/**
	 * Returns the company ID of this dot khuyen mai chi tiet.
	 *
	 * @return the company ID of this dot khuyen mai chi tiet
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this dot khuyen mai chi tiet.
	 *
	 * @param companyId the company ID of this dot khuyen mai chi tiet
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this dot khuyen mai chi tiet.
	 *
	 * @return the user ID of this dot khuyen mai chi tiet
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this dot khuyen mai chi tiet.
	 *
	 * @param userId the user ID of this dot khuyen mai chi tiet
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this dot khuyen mai chi tiet.
	 *
	 * @return the user uuid of this dot khuyen mai chi tiet
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this dot khuyen mai chi tiet.
	 *
	 * @param userUuid the user uuid of this dot khuyen mai chi tiet
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this dot khuyen mai chi tiet.
	 *
	 * @return the user name of this dot khuyen mai chi tiet
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this dot khuyen mai chi tiet.
	 *
	 * @param userName the user name of this dot khuyen mai chi tiet
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this dot khuyen mai chi tiet.
	 *
	 * @return the create date of this dot khuyen mai chi tiet
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this dot khuyen mai chi tiet.
	 *
	 * @param createDate the create date of this dot khuyen mai chi tiet
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this dot khuyen mai chi tiet.
	 *
	 * @return the modified date of this dot khuyen mai chi tiet
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this dot khuyen mai chi tiet.
	 *
	 * @param modifiedDate the modified date of this dot khuyen mai chi tiet
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the dot khuyen mai ID of this dot khuyen mai chi tiet.
	 *
	 * @return the dot khuyen mai ID of this dot khuyen mai chi tiet
	 */
	public long getDotKhuyenMaiId();

	/**
	 * Sets the dot khuyen mai ID of this dot khuyen mai chi tiet.
	 *
	 * @param dotKhuyenMaiId the dot khuyen mai ID of this dot khuyen mai chi tiet
	 */
	public void setDotKhuyenMaiId(long dotKhuyenMaiId);

	/**
	 * Returns the nhom mat hang ID of this dot khuyen mai chi tiet.
	 *
	 * @return the nhom mat hang ID of this dot khuyen mai chi tiet
	 */
	public long getNhomMatHangId();

	/**
	 * Sets the nhom mat hang ID of this dot khuyen mai chi tiet.
	 *
	 * @param nhomMatHangId the nhom mat hang ID of this dot khuyen mai chi tiet
	 */
	public void setNhomMatHangId(long nhomMatHangId);

	/**
	 * Returns the mat hang ID of this dot khuyen mai chi tiet.
	 *
	 * @return the mat hang ID of this dot khuyen mai chi tiet
	 */
	public long getMatHangId();

	/**
	 * Sets the mat hang ID of this dot khuyen mai chi tiet.
	 *
	 * @param matHangId the mat hang ID of this dot khuyen mai chi tiet
	 */
	public void setMatHangId(long matHangId);

	/**
	 * Returns the mat hang tang ID of this dot khuyen mai chi tiet.
	 *
	 * @return the mat hang tang ID of this dot khuyen mai chi tiet
	 */
	public long getMatHangTangId();

	/**
	 * Sets the mat hang tang ID of this dot khuyen mai chi tiet.
	 *
	 * @param matHangTangId the mat hang tang ID of this dot khuyen mai chi tiet
	 */
	public void setMatHangTangId(long matHangTangId);

	/**
	 * Returns the ti le giam gia of this dot khuyen mai chi tiet.
	 *
	 * @return the ti le giam gia of this dot khuyen mai chi tiet
	 */
	public double getTiLeGiamGia();

	/**
	 * Sets the ti le giam gia of this dot khuyen mai chi tiet.
	 *
	 * @param tiLeGiamGia the ti le giam gia of this dot khuyen mai chi tiet
	 */
	public void setTiLeGiamGia(double tiLeGiamGia);

	/**
	 * Returns the gia tri don hang of this dot khuyen mai chi tiet.
	 *
	 * @return the gia tri don hang of this dot khuyen mai chi tiet
	 */
	public double getGiaTriDonHang();

	/**
	 * Sets the gia tri don hang of this dot khuyen mai chi tiet.
	 *
	 * @param giaTriDonHang the gia tri don hang of this dot khuyen mai chi tiet
	 */
	public void setGiaTriDonHang(double giaTriDonHang);

	/**
	 * Returns the so luong mua of this dot khuyen mai chi tiet.
	 *
	 * @return the so luong mua of this dot khuyen mai chi tiet
	 */
	public int getSoLuongMua();

	/**
	 * Sets the so luong mua of this dot khuyen mai chi tiet.
	 *
	 * @param soLuongMua the so luong mua of this dot khuyen mai chi tiet
	 */
	public void setSoLuongMua(int soLuongMua);

	/**
	 * Returns the so luong tang of this dot khuyen mai chi tiet.
	 *
	 * @return the so luong tang of this dot khuyen mai chi tiet
	 */
	public int getSoLuongTang();

	/**
	 * Sets the so luong tang of this dot khuyen mai chi tiet.
	 *
	 * @param soLuongTang the so luong tang of this dot khuyen mai chi tiet
	 */
	public void setSoLuongTang(int soLuongTang);

	/**
	 * Returns the gia ban of this dot khuyen mai chi tiet.
	 *
	 * @return the gia ban of this dot khuyen mai chi tiet
	 */
	public int getGiaBan();

	/**
	 * Sets the gia ban of this dot khuyen mai chi tiet.
	 *
	 * @param giaBan the gia ban of this dot khuyen mai chi tiet
	 */
	public void setGiaBan(int giaBan);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet> toCacheModel();

	@Override
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet toEscapedModel();

	@Override
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}