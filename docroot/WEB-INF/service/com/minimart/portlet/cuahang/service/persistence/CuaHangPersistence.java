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

package com.minimart.portlet.cuahang.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.minimart.portlet.cuahang.model.CuaHang;

/**
 * The persistence interface for the cua hang service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see CuaHangPersistenceImpl
 * @see CuaHangUtil
 * @generated
 */
public interface CuaHangPersistence extends BasePersistence<CuaHang> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CuaHangUtil} to access the cua hang persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the cua hangs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching cua hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.cuahang.model.CuaHang> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the cua hangs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.CuaHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of cua hangs
	* @param end the upper bound of the range of cua hangs (not inclusive)
	* @return the range of matching cua hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.cuahang.model.CuaHang> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the cua hangs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.CuaHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of cua hangs
	* @param end the upper bound of the range of cua hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching cua hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.cuahang.model.CuaHang> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cua hang in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cua hang
	* @throws com.minimart.portlet.cuahang.NoSuchCuaHangException if a matching cua hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.CuaHang findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.cuahang.NoSuchCuaHangException;

	/**
	* Returns the first cua hang in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cua hang, or <code>null</code> if a matching cua hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.CuaHang fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cua hang in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cua hang
	* @throws com.minimart.portlet.cuahang.NoSuchCuaHangException if a matching cua hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.CuaHang findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.cuahang.NoSuchCuaHangException;

	/**
	* Returns the last cua hang in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cua hang, or <code>null</code> if a matching cua hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.CuaHang fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cua hangs before and after the current cua hang in the ordered set where uuid = &#63;.
	*
	* @param cuaHangId the primary key of the current cua hang
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cua hang
	* @throws com.minimart.portlet.cuahang.NoSuchCuaHangException if a cua hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.CuaHang[] findByUuid_PrevAndNext(
		long cuaHangId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.cuahang.NoSuchCuaHangException;

	/**
	* Removes all the cua hangs where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of cua hangs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching cua hangs
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the cua hangs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching cua hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.cuahang.model.CuaHang> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the cua hangs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.CuaHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of cua hangs
	* @param end the upper bound of the range of cua hangs (not inclusive)
	* @return the range of matching cua hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.cuahang.model.CuaHang> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the cua hangs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.CuaHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of cua hangs
	* @param end the upper bound of the range of cua hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching cua hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.cuahang.model.CuaHang> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cua hang in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cua hang
	* @throws com.minimart.portlet.cuahang.NoSuchCuaHangException if a matching cua hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.CuaHang findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.cuahang.NoSuchCuaHangException;

	/**
	* Returns the first cua hang in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cua hang, or <code>null</code> if a matching cua hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.CuaHang fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cua hang in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cua hang
	* @throws com.minimart.portlet.cuahang.NoSuchCuaHangException if a matching cua hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.CuaHang findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.cuahang.NoSuchCuaHangException;

	/**
	* Returns the last cua hang in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cua hang, or <code>null</code> if a matching cua hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.CuaHang fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cua hangs before and after the current cua hang in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param cuaHangId the primary key of the current cua hang
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cua hang
	* @throws com.minimart.portlet.cuahang.NoSuchCuaHangException if a cua hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.CuaHang[] findByUuid_C_PrevAndNext(
		long cuaHangId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.cuahang.NoSuchCuaHangException;

	/**
	* Removes all the cua hangs where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of cua hangs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching cua hangs
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the cua hangs where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @return the matching cua hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.cuahang.model.CuaHang> findByTEN_HD(
		java.lang.String ten, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the cua hangs where ten = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.CuaHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of cua hangs
	* @param end the upper bound of the range of cua hangs (not inclusive)
	* @return the range of matching cua hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.cuahang.model.CuaHang> findByTEN_HD(
		java.lang.String ten, boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the cua hangs where ten = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.CuaHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of cua hangs
	* @param end the upper bound of the range of cua hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching cua hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.cuahang.model.CuaHang> findByTEN_HD(
		java.lang.String ten, boolean hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first cua hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cua hang
	* @throws com.minimart.portlet.cuahang.NoSuchCuaHangException if a matching cua hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.CuaHang findByTEN_HD_First(
		java.lang.String ten, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.cuahang.NoSuchCuaHangException;

	/**
	* Returns the first cua hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cua hang, or <code>null</code> if a matching cua hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.CuaHang fetchByTEN_HD_First(
		java.lang.String ten, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last cua hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cua hang
	* @throws com.minimart.portlet.cuahang.NoSuchCuaHangException if a matching cua hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.CuaHang findByTEN_HD_Last(
		java.lang.String ten, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.cuahang.NoSuchCuaHangException;

	/**
	* Returns the last cua hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cua hang, or <code>null</code> if a matching cua hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.CuaHang fetchByTEN_HD_Last(
		java.lang.String ten, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cua hangs before and after the current cua hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	*
	* @param cuaHangId the primary key of the current cua hang
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cua hang
	* @throws com.minimart.portlet.cuahang.NoSuchCuaHangException if a cua hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.CuaHang[] findByTEN_HD_PrevAndNext(
		long cuaHangId, java.lang.String ten, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.cuahang.NoSuchCuaHangException;

	/**
	* Removes all the cua hangs where ten = &#63; and hoatDong = &#63; from the database.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTEN_HD(java.lang.String ten, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of cua hangs where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @return the number of matching cua hangs
	* @throws SystemException if a system exception occurred
	*/
	public int countByTEN_HD(java.lang.String ten, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the cua hang in the entity cache if it is enabled.
	*
	* @param cuaHang the cua hang
	*/
	public void cacheResult(com.minimart.portlet.cuahang.model.CuaHang cuaHang);

	/**
	* Caches the cua hangs in the entity cache if it is enabled.
	*
	* @param cuaHangs the cua hangs
	*/
	public void cacheResult(
		java.util.List<com.minimart.portlet.cuahang.model.CuaHang> cuaHangs);

	/**
	* Creates a new cua hang with the primary key. Does not add the cua hang to the database.
	*
	* @param cuaHangId the primary key for the new cua hang
	* @return the new cua hang
	*/
	public com.minimart.portlet.cuahang.model.CuaHang create(long cuaHangId);

	/**
	* Removes the cua hang with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cuaHangId the primary key of the cua hang
	* @return the cua hang that was removed
	* @throws com.minimart.portlet.cuahang.NoSuchCuaHangException if a cua hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.CuaHang remove(long cuaHangId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.cuahang.NoSuchCuaHangException;

	public com.minimart.portlet.cuahang.model.CuaHang updateImpl(
		com.minimart.portlet.cuahang.model.CuaHang cuaHang)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the cua hang with the primary key or throws a {@link com.minimart.portlet.cuahang.NoSuchCuaHangException} if it could not be found.
	*
	* @param cuaHangId the primary key of the cua hang
	* @return the cua hang
	* @throws com.minimart.portlet.cuahang.NoSuchCuaHangException if a cua hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.CuaHang findByPrimaryKey(
		long cuaHangId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.cuahang.NoSuchCuaHangException;

	/**
	* Returns the cua hang with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cuaHangId the primary key of the cua hang
	* @return the cua hang, or <code>null</code> if a cua hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.CuaHang fetchByPrimaryKey(
		long cuaHangId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the cua hangs.
	*
	* @return the cua hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.cuahang.model.CuaHang> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the cua hangs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.CuaHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cua hangs
	* @param end the upper bound of the range of cua hangs (not inclusive)
	* @return the range of cua hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.cuahang.model.CuaHang> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the cua hangs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.CuaHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cua hangs
	* @param end the upper bound of the range of cua hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of cua hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.cuahang.model.CuaHang> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the cua hangs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of cua hangs.
	*
	* @return the number of cua hangs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}