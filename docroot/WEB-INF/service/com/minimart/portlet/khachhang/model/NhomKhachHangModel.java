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
 * The base model interface for the NhomKhachHang service. Represents a row in the &quot;minimart_nhomkhachhang&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.minimart.portlet.khachhang.model.impl.NhomKhachHangModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.minimart.portlet.khachhang.model.impl.NhomKhachHangImpl}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see NhomKhachHang
 * @see com.minimart.portlet.khachhang.model.impl.NhomKhachHangImpl
 * @see com.minimart.portlet.khachhang.model.impl.NhomKhachHangModelImpl
 * @generated
 */
public interface NhomKhachHangModel extends AuditedModel,
	BaseModel<NhomKhachHang> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a nhom khach hang model instance should use the {@link NhomKhachHang} interface instead.
	 */

	/**
	 * Returns the primary key of this nhom khach hang.
	 *
	 * @return the primary key of this nhom khach hang
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this nhom khach hang.
	 *
	 * @param primaryKey the primary key of this nhom khach hang
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the nhom khach hang ID of this nhom khach hang.
	 *
	 * @return the nhom khach hang ID of this nhom khach hang
	 */
	public long getNhomKhachHangId();

	/**
	 * Sets the nhom khach hang ID of this nhom khach hang.
	 *
	 * @param nhomKhachHangId the nhom khach hang ID of this nhom khach hang
	 */
	public void setNhomKhachHangId(long nhomKhachHangId);

	/**
	 * Returns the company ID of this nhom khach hang.
	 *
	 * @return the company ID of this nhom khach hang
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this nhom khach hang.
	 *
	 * @param companyId the company ID of this nhom khach hang
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this nhom khach hang.
	 *
	 * @return the user ID of this nhom khach hang
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this nhom khach hang.
	 *
	 * @param userId the user ID of this nhom khach hang
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this nhom khach hang.
	 *
	 * @return the user uuid of this nhom khach hang
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this nhom khach hang.
	 *
	 * @param userUuid the user uuid of this nhom khach hang
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this nhom khach hang.
	 *
	 * @return the user name of this nhom khach hang
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this nhom khach hang.
	 *
	 * @param userName the user name of this nhom khach hang
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this nhom khach hang.
	 *
	 * @return the create date of this nhom khach hang
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this nhom khach hang.
	 *
	 * @param createDate the create date of this nhom khach hang
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this nhom khach hang.
	 *
	 * @return the modified date of this nhom khach hang
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this nhom khach hang.
	 *
	 * @param modifiedDate the modified date of this nhom khach hang
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the ten of this nhom khach hang.
	 *
	 * @return the ten of this nhom khach hang
	 */
	@AutoEscape
	public String getTen();

	/**
	 * Sets the ten of this nhom khach hang.
	 *
	 * @param ten the ten of this nhom khach hang
	 */
	public void setTen(String ten);

	/**
	 * Returns the hoat dong of this nhom khach hang.
	 *
	 * @return the hoat dong of this nhom khach hang
	 */
	public boolean getHoatDong();

	/**
	 * Returns <code>true</code> if this nhom khach hang is hoat dong.
	 *
	 * @return <code>true</code> if this nhom khach hang is hoat dong; <code>false</code> otherwise
	 */
	public boolean isHoatDong();

	/**
	 * Sets whether this nhom khach hang is hoat dong.
	 *
	 * @param hoatDong the hoat dong of this nhom khach hang
	 */
	public void setHoatDong(boolean hoatDong);

	/**
	 * Returns the diem tich luy of this nhom khach hang.
	 *
	 * @return the diem tich luy of this nhom khach hang
	 */
	public int getDiemTichLuy();

	/**
	 * Sets the diem tich luy of this nhom khach hang.
	 *
	 * @param diemTichLuy the diem tich luy of this nhom khach hang
	 */
	public void setDiemTichLuy(int diemTichLuy);

	/**
	 * Returns the ti le giam gia of this nhom khach hang.
	 *
	 * @return the ti le giam gia of this nhom khach hang
	 */
	public int getTiLeGiamGia();

	/**
	 * Sets the ti le giam gia of this nhom khach hang.
	 *
	 * @param tiLeGiamGia the ti le giam gia of this nhom khach hang
	 */
	public void setTiLeGiamGia(int tiLeGiamGia);

	/**
	 * Returns the uu tien of this nhom khach hang.
	 *
	 * @return the uu tien of this nhom khach hang
	 */
	public int getUuTien();

	/**
	 * Sets the uu tien of this nhom khach hang.
	 *
	 * @param uuTien the uu tien of this nhom khach hang
	 */
	public void setUuTien(int uuTien);

	/**
	 * Returns the image of this nhom khach hang.
	 *
	 * @return the image of this nhom khach hang
	 */
	@AutoEscape
	public String getImage();

	/**
	 * Sets the image of this nhom khach hang.
	 *
	 * @param image the image of this nhom khach hang
	 */
	public void setImage(String image);

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
		com.minimart.portlet.khachhang.model.NhomKhachHang nhomKhachHang);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.minimart.portlet.khachhang.model.NhomKhachHang> toCacheModel();

	@Override
	public com.minimart.portlet.khachhang.model.NhomKhachHang toEscapedModel();

	@Override
	public com.minimart.portlet.khachhang.model.NhomKhachHang toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}