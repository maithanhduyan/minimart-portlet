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

package com.minimart.portlet.mathang.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the NhomMatHang service. Represents a row in the &quot;minimart_nhommathang&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.minimart.portlet.mathang.model.impl.NhomMatHangModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.minimart.portlet.mathang.model.impl.NhomMatHangImpl}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see NhomMatHang
 * @see com.minimart.portlet.mathang.model.impl.NhomMatHangImpl
 * @see com.minimart.portlet.mathang.model.impl.NhomMatHangModelImpl
 * @generated
 */
public interface NhomMatHangModel extends BaseModel<NhomMatHang>, GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a nhom mat hang model instance should use the {@link NhomMatHang} interface instead.
	 */

	/**
	 * Returns the primary key of this nhom mat hang.
	 *
	 * @return the primary key of this nhom mat hang
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this nhom mat hang.
	 *
	 * @param primaryKey the primary key of this nhom mat hang
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the nhom mat hang ID of this nhom mat hang.
	 *
	 * @return the nhom mat hang ID of this nhom mat hang
	 */
	public long getNhomMatHangId();

	/**
	 * Sets the nhom mat hang ID of this nhom mat hang.
	 *
	 * @param nhomMatHangId the nhom mat hang ID of this nhom mat hang
	 */
	public void setNhomMatHangId(long nhomMatHangId);

	/**
	 * Returns the group ID of this nhom mat hang.
	 *
	 * @return the group ID of this nhom mat hang
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this nhom mat hang.
	 *
	 * @param groupId the group ID of this nhom mat hang
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this nhom mat hang.
	 *
	 * @return the company ID of this nhom mat hang
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this nhom mat hang.
	 *
	 * @param companyId the company ID of this nhom mat hang
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this nhom mat hang.
	 *
	 * @return the user ID of this nhom mat hang
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this nhom mat hang.
	 *
	 * @param userId the user ID of this nhom mat hang
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this nhom mat hang.
	 *
	 * @return the user uuid of this nhom mat hang
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this nhom mat hang.
	 *
	 * @param userUuid the user uuid of this nhom mat hang
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this nhom mat hang.
	 *
	 * @return the user name of this nhom mat hang
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this nhom mat hang.
	 *
	 * @param userName the user name of this nhom mat hang
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this nhom mat hang.
	 *
	 * @return the create date of this nhom mat hang
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this nhom mat hang.
	 *
	 * @param createDate the create date of this nhom mat hang
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this nhom mat hang.
	 *
	 * @return the modified date of this nhom mat hang
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this nhom mat hang.
	 *
	 * @param modifiedDate the modified date of this nhom mat hang
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this nhom mat hang.
	 *
	 * @return the name of this nhom mat hang
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this nhom mat hang.
	 *
	 * @param name the name of this nhom mat hang
	 */
	public void setName(String name);

	/**
	 * Returns the code of this nhom mat hang.
	 *
	 * @return the code of this nhom mat hang
	 */
	@AutoEscape
	public String getCode();

	/**
	 * Sets the code of this nhom mat hang.
	 *
	 * @param code the code of this nhom mat hang
	 */
	public void setCode(String code);

	/**
	 * Returns the status of this nhom mat hang.
	 *
	 * @return the status of this nhom mat hang
	 */
	public int getStatus();

	/**
	 * Sets the status of this nhom mat hang.
	 *
	 * @param status the status of this nhom mat hang
	 */
	public void setStatus(int status);

	/**
	 * Returns the note of this nhom mat hang.
	 *
	 * @return the note of this nhom mat hang
	 */
	@AutoEscape
	public String getNote();

	/**
	 * Sets the note of this nhom mat hang.
	 *
	 * @param note the note of this nhom mat hang
	 */
	public void setNote(String note);

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
		com.minimart.portlet.mathang.model.NhomMatHang nhomMatHang);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.minimart.portlet.mathang.model.NhomMatHang> toCacheModel();

	@Override
	public com.minimart.portlet.mathang.model.NhomMatHang toEscapedModel();

	@Override
	public com.minimart.portlet.mathang.model.NhomMatHang toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}