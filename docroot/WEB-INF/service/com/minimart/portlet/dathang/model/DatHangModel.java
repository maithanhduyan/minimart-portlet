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
 * The base model interface for the DatHang service. Represents a row in the &quot;minimart_dathang&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.minimart.portlet.dathang.model.impl.DatHangModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.minimart.portlet.dathang.model.impl.DatHangImpl}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see DatHang
 * @see com.minimart.portlet.dathang.model.impl.DatHangImpl
 * @see com.minimart.portlet.dathang.model.impl.DatHangModelImpl
 * @generated
 */
public interface DatHangModel extends AuditedModel, BaseModel<DatHang> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dat hang model instance should use the {@link DatHang} interface instead.
	 */

	/**
	 * Returns the primary key of this dat hang.
	 *
	 * @return the primary key of this dat hang
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this dat hang.
	 *
	 * @param primaryKey the primary key of this dat hang
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the dat hang ID of this dat hang.
	 *
	 * @return the dat hang ID of this dat hang
	 */
	public long getDatHangId();

	/**
	 * Sets the dat hang ID of this dat hang.
	 *
	 * @param datHangId the dat hang ID of this dat hang
	 */
	public void setDatHangId(long datHangId);

	/**
	 * Returns the company ID of this dat hang.
	 *
	 * @return the company ID of this dat hang
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this dat hang.
	 *
	 * @param companyId the company ID of this dat hang
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this dat hang.
	 *
	 * @return the user ID of this dat hang
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this dat hang.
	 *
	 * @param userId the user ID of this dat hang
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this dat hang.
	 *
	 * @return the user uuid of this dat hang
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this dat hang.
	 *
	 * @param userUuid the user uuid of this dat hang
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this dat hang.
	 *
	 * @return the user name of this dat hang
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this dat hang.
	 *
	 * @param userName the user name of this dat hang
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this dat hang.
	 *
	 * @return the create date of this dat hang
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this dat hang.
	 *
	 * @param createDate the create date of this dat hang
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this dat hang.
	 *
	 * @return the modified date of this dat hang
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this dat hang.
	 *
	 * @param modifiedDate the modified date of this dat hang
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the ten of this dat hang.
	 *
	 * @return the ten of this dat hang
	 */
	@AutoEscape
	public String getTen();

	/**
	 * Sets the ten of this dat hang.
	 *
	 * @param ten the ten of this dat hang
	 */
	public void setTen(String ten);

	/**
	 * Returns the khach hang ID of this dat hang.
	 *
	 * @return the khach hang ID of this dat hang
	 */
	public long getKhachHangId();

	/**
	 * Sets the khach hang ID of this dat hang.
	 *
	 * @param khachHangId the khach hang ID of this dat hang
	 */
	public void setKhachHangId(long khachHangId);

	/**
	 * Returns the dia chi ID of this dat hang.
	 *
	 * @return the dia chi ID of this dat hang
	 */
	public long getDiaChiId();

	/**
	 * Sets the dia chi ID of this dat hang.
	 *
	 * @param diaChiId the dia chi ID of this dat hang
	 */
	public void setDiaChiId(long diaChiId);

	/**
	 * Returns the tien hang of this dat hang.
	 *
	 * @return the tien hang of this dat hang
	 */
	public int getTienHang();

	/**
	 * Sets the tien hang of this dat hang.
	 *
	 * @param tienHang the tien hang of this dat hang
	 */
	public void setTienHang(int tienHang);

	/**
	 * Returns the ti le thue of this dat hang.
	 *
	 * @return the ti le thue of this dat hang
	 */
	public double getTiLeThue();

	/**
	 * Sets the ti le thue of this dat hang.
	 *
	 * @param tiLeThue the ti le thue of this dat hang
	 */
	public void setTiLeThue(double tiLeThue);

	/**
	 * Returns the ti le giam gia of this dat hang.
	 *
	 * @return the ti le giam gia of this dat hang
	 */
	public double getTiLeGiamGia();

	/**
	 * Sets the ti le giam gia of this dat hang.
	 *
	 * @param tiLeGiamGia the ti le giam gia of this dat hang
	 */
	public void setTiLeGiamGia(double tiLeGiamGia);

	/**
	 * Returns the tien giam gia of this dat hang.
	 *
	 * @return the tien giam gia of this dat hang
	 */
	public int getTienGiamGia();

	/**
	 * Sets the tien giam gia of this dat hang.
	 *
	 * @param tienGiamGia the tien giam gia of this dat hang
	 */
	public void setTienGiamGia(int tienGiamGia);

	/**
	 * Returns the phi van chuyen of this dat hang.
	 *
	 * @return the phi van chuyen of this dat hang
	 */
	public int getPhiVanChuyen();

	/**
	 * Sets the phi van chuyen of this dat hang.
	 *
	 * @param phiVanChuyen the phi van chuyen of this dat hang
	 */
	public void setPhiVanChuyen(int phiVanChuyen);

	/**
	 * Returns the tong cong of this dat hang.
	 *
	 * @return the tong cong of this dat hang
	 */
	public int getTongCong();

	/**
	 * Sets the tong cong of this dat hang.
	 *
	 * @param tongCong the tong cong of this dat hang
	 */
	public void setTongCong(int tongCong);

	/**
	 * Returns the loai of this dat hang.
	 *
	 * @return the loai of this dat hang
	 */
	public int getLoai();

	/**
	 * Sets the loai of this dat hang.
	 *
	 * @param loai the loai of this dat hang
	 */
	public void setLoai(int loai);

	/**
	 * Returns the giam theo tien of this dat hang.
	 *
	 * @return the giam theo tien of this dat hang
	 */
	public int getGiamTheoTien();

	/**
	 * Sets the giam theo tien of this dat hang.
	 *
	 * @param giamTheoTien the giam theo tien of this dat hang
	 */
	public void setGiamTheoTien(int giamTheoTien);

	/**
	 * Returns the trang thai of this dat hang.
	 *
	 * @return the trang thai of this dat hang
	 */
	public boolean getTrangThai();

	/**
	 * Returns <code>true</code> if this dat hang is trang thai.
	 *
	 * @return <code>true</code> if this dat hang is trang thai; <code>false</code> otherwise
	 */
	public boolean isTrangThai();

	/**
	 * Sets whether this dat hang is trang thai.
	 *
	 * @param trangThai the trang thai of this dat hang
	 */
	public void setTrangThai(boolean trangThai);

	/**
	 * Returns the user modified ID of this dat hang.
	 *
	 * @return the user modified ID of this dat hang
	 */
	public long getUserModifiedId();

	/**
	 * Sets the user modified ID of this dat hang.
	 *
	 * @param userModifiedId the user modified ID of this dat hang
	 */
	public void setUserModifiedId(long userModifiedId);

	/**
	 * Returns the time modified of this dat hang.
	 *
	 * @return the time modified of this dat hang
	 */
	public Date getTimeModified();

	/**
	 * Sets the time modified of this dat hang.
	 *
	 * @param timeModified the time modified of this dat hang
	 */
	public void setTimeModified(Date timeModified);

	/**
	 * Returns the user create ID of this dat hang.
	 *
	 * @return the user create ID of this dat hang
	 */
	public long getUserCreateId();

	/**
	 * Sets the user create ID of this dat hang.
	 *
	 * @param userCreateId the user create ID of this dat hang
	 */
	public void setUserCreateId(long userCreateId);

	/**
	 * Returns the loai gia of this dat hang.
	 *
	 * @return the loai gia of this dat hang
	 */
	public int getLoaiGia();

	/**
	 * Sets the loai gia of this dat hang.
	 *
	 * @param loaiGia the loai gia of this dat hang
	 */
	public void setLoaiGia(int loaiGia);

	/**
	 * Returns the hoat dong of this dat hang.
	 *
	 * @return the hoat dong of this dat hang
	 */
	public boolean getHoatDong();

	/**
	 * Returns <code>true</code> if this dat hang is hoat dong.
	 *
	 * @return <code>true</code> if this dat hang is hoat dong; <code>false</code> otherwise
	 */
	public boolean isHoatDong();

	/**
	 * Sets whether this dat hang is hoat dong.
	 *
	 * @param hoatDong the hoat dong of this dat hang
	 */
	public void setHoatDong(boolean hoatDong);

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
	public int compareTo(com.minimart.portlet.dathang.model.DatHang datHang);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.minimart.portlet.dathang.model.DatHang> toCacheModel();

	@Override
	public com.minimart.portlet.dathang.model.DatHang toEscapedModel();

	@Override
	public com.minimart.portlet.dathang.model.DatHang toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}