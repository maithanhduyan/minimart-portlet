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

package com.minimart.portlet.mathang.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.minimart.portlet.mathang.model.MatHang;

/**
 * The persistence interface for the mat hang service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see MatHangPersistenceImpl
 * @see MatHangUtil
 * @generated
 */
public interface MatHangPersistence extends BasePersistence<MatHang> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MatHangUtil} to access the mat hang persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the mat hangs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.mathang.model.MatHang> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mat hangs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.MatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of mat hangs
	* @param end the upper bound of the range of mat hangs (not inclusive)
	* @return the range of matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.mathang.model.MatHang> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mat hangs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.MatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of mat hangs
	* @param end the upper bound of the range of mat hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.mathang.model.MatHang> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mat hang in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mat hang
	* @throws com.minimart.portlet.mathang.NoSuchMatHangException if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException;

	/**
	* Returns the first mat hang in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mat hang, or <code>null</code> if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mat hang in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mat hang
	* @throws com.minimart.portlet.mathang.NoSuchMatHangException if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException;

	/**
	* Returns the last mat hang in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mat hang, or <code>null</code> if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mat hangs before and after the current mat hang in the ordered set where uuid = &#63;.
	*
	* @param matHangId the primary key of the current mat hang
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mat hang
	* @throws com.minimart.portlet.mathang.NoSuchMatHangException if a mat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang[] findByUuid_PrevAndNext(
		long matHangId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException;

	/**
	* Removes all the mat hangs where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mat hangs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mat hang where uuid = &#63; and groupId = &#63; or throws a {@link com.minimart.portlet.mathang.NoSuchMatHangException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching mat hang
	* @throws com.minimart.portlet.mathang.NoSuchMatHangException if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException;

	/**
	* Returns the mat hang where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching mat hang, or <code>null</code> if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mat hang where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching mat hang, or <code>null</code> if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the mat hang where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the mat hang that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException;

	/**
	* Returns the number of mat hangs where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mat hangs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.mathang.model.MatHang> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mat hangs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.MatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of mat hangs
	* @param end the upper bound of the range of mat hangs (not inclusive)
	* @return the range of matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.mathang.model.MatHang> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mat hangs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.MatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of mat hangs
	* @param end the upper bound of the range of mat hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.mathang.model.MatHang> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mat hang in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mat hang
	* @throws com.minimart.portlet.mathang.NoSuchMatHangException if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException;

	/**
	* Returns the first mat hang in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mat hang, or <code>null</code> if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mat hang in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mat hang
	* @throws com.minimart.portlet.mathang.NoSuchMatHangException if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException;

	/**
	* Returns the last mat hang in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mat hang, or <code>null</code> if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mat hangs before and after the current mat hang in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param matHangId the primary key of the current mat hang
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mat hang
	* @throws com.minimart.portlet.mathang.NoSuchMatHangException if a mat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang[] findByUuid_C_PrevAndNext(
		long matHangId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException;

	/**
	* Removes all the mat hangs where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mat hangs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mat hangs where name = &#63;.
	*
	* @param name the name
	* @return the matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.mathang.model.MatHang> findByName(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mat hangs where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.MatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of mat hangs
	* @param end the upper bound of the range of mat hangs (not inclusive)
	* @return the range of matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.mathang.model.MatHang> findByName(
		java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mat hangs where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.MatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of mat hangs
	* @param end the upper bound of the range of mat hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.mathang.model.MatHang> findByName(
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mat hang in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mat hang
	* @throws com.minimart.portlet.mathang.NoSuchMatHangException if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang findByName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException;

	/**
	* Returns the first mat hang in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mat hang, or <code>null</code> if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang fetchByName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mat hang in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mat hang
	* @throws com.minimart.portlet.mathang.NoSuchMatHangException if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang findByName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException;

	/**
	* Returns the last mat hang in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mat hang, or <code>null</code> if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang fetchByName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mat hangs before and after the current mat hang in the ordered set where name = &#63;.
	*
	* @param matHangId the primary key of the current mat hang
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mat hang
	* @throws com.minimart.portlet.mathang.NoSuchMatHangException if a mat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang[] findByName_PrevAndNext(
		long matHangId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException;

	/**
	* Removes all the mat hangs where name = &#63; from the database.
	*
	* @param name the name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByName(java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mat hangs where name = &#63;.
	*
	* @param name the name
	* @return the number of matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public int countByName(java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mat hangs where companyId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @return the matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.mathang.model.MatHang> findByC_U(
		long companyId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mat hangs where companyId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.MatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param start the lower bound of the range of mat hangs
	* @param end the upper bound of the range of mat hangs (not inclusive)
	* @return the range of matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.mathang.model.MatHang> findByC_U(
		long companyId, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mat hangs where companyId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.MatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param start the lower bound of the range of mat hangs
	* @param end the upper bound of the range of mat hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.mathang.model.MatHang> findByC_U(
		long companyId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mat hang in the ordered set where companyId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mat hang
	* @throws com.minimart.portlet.mathang.NoSuchMatHangException if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang findByC_U_First(
		long companyId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException;

	/**
	* Returns the first mat hang in the ordered set where companyId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mat hang, or <code>null</code> if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang fetchByC_U_First(
		long companyId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mat hang in the ordered set where companyId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mat hang
	* @throws com.minimart.portlet.mathang.NoSuchMatHangException if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang findByC_U_Last(
		long companyId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException;

	/**
	* Returns the last mat hang in the ordered set where companyId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mat hang, or <code>null</code> if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang fetchByC_U_Last(
		long companyId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mat hangs before and after the current mat hang in the ordered set where companyId = &#63; and userId = &#63;.
	*
	* @param matHangId the primary key of the current mat hang
	* @param companyId the company ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mat hang
	* @throws com.minimart.portlet.mathang.NoSuchMatHangException if a mat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang[] findByC_U_PrevAndNext(
		long matHangId, long companyId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException;

	/**
	* Removes all the mat hangs where companyId = &#63; and userId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_U(long companyId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mat hangs where companyId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @return the number of matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_U(long companyId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mat hangs where companyId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param status the status
	* @return the matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.mathang.model.MatHang> findByC_S(
		long companyId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mat hangs where companyId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.MatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param status the status
	* @param start the lower bound of the range of mat hangs
	* @param end the upper bound of the range of mat hangs (not inclusive)
	* @return the range of matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.mathang.model.MatHang> findByC_S(
		long companyId, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mat hangs where companyId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.MatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param status the status
	* @param start the lower bound of the range of mat hangs
	* @param end the upper bound of the range of mat hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.mathang.model.MatHang> findByC_S(
		long companyId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first mat hang in the ordered set where companyId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mat hang
	* @throws com.minimart.portlet.mathang.NoSuchMatHangException if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang findByC_S_First(
		long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException;

	/**
	* Returns the first mat hang in the ordered set where companyId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mat hang, or <code>null</code> if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang fetchByC_S_First(
		long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last mat hang in the ordered set where companyId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mat hang
	* @throws com.minimart.portlet.mathang.NoSuchMatHangException if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang findByC_S_Last(
		long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException;

	/**
	* Returns the last mat hang in the ordered set where companyId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mat hang, or <code>null</code> if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang fetchByC_S_Last(
		long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mat hangs before and after the current mat hang in the ordered set where companyId = &#63; and status = &#63;.
	*
	* @param matHangId the primary key of the current mat hang
	* @param companyId the company ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mat hang
	* @throws com.minimart.portlet.mathang.NoSuchMatHangException if a mat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang[] findByC_S_PrevAndNext(
		long matHangId, long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException;

	/**
	* Removes all the mat hangs where companyId = &#63; and status = &#63; from the database.
	*
	* @param companyId the company ID
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_S(long companyId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mat hangs where companyId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param status the status
	* @return the number of matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_S(long companyId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mat hang where code = &#63; and hoatDong = &#63; or throws a {@link com.minimart.portlet.mathang.NoSuchMatHangException} if it could not be found.
	*
	* @param code the code
	* @param hoatDong the hoat dong
	* @return the matching mat hang
	* @throws com.minimart.portlet.mathang.NoSuchMatHangException if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang findByBCODE_HD(
		java.lang.String code, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException;

	/**
	* Returns the mat hang where code = &#63; and hoatDong = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param code the code
	* @param hoatDong the hoat dong
	* @return the matching mat hang, or <code>null</code> if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang fetchByBCODE_HD(
		java.lang.String code, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mat hang where code = &#63; and hoatDong = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param code the code
	* @param hoatDong the hoat dong
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching mat hang, or <code>null</code> if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang fetchByBCODE_HD(
		java.lang.String code, boolean hoatDong, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the mat hang where code = &#63; and hoatDong = &#63; from the database.
	*
	* @param code the code
	* @param hoatDong the hoat dong
	* @return the mat hang that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang removeByBCODE_HD(
		java.lang.String code, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException;

	/**
	* Returns the number of mat hangs where code = &#63; and hoatDong = &#63;.
	*
	* @param code the code
	* @param hoatDong the hoat dong
	* @return the number of matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public int countByBCODE_HD(java.lang.String code, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the mat hang in the entity cache if it is enabled.
	*
	* @param matHang the mat hang
	*/
	public void cacheResult(com.minimart.portlet.mathang.model.MatHang matHang);

	/**
	* Caches the mat hangs in the entity cache if it is enabled.
	*
	* @param matHangs the mat hangs
	*/
	public void cacheResult(
		java.util.List<com.minimart.portlet.mathang.model.MatHang> matHangs);

	/**
	* Creates a new mat hang with the primary key. Does not add the mat hang to the database.
	*
	* @param matHangId the primary key for the new mat hang
	* @return the new mat hang
	*/
	public com.minimart.portlet.mathang.model.MatHang create(long matHangId);

	/**
	* Removes the mat hang with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param matHangId the primary key of the mat hang
	* @return the mat hang that was removed
	* @throws com.minimart.portlet.mathang.NoSuchMatHangException if a mat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang remove(long matHangId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException;

	public com.minimart.portlet.mathang.model.MatHang updateImpl(
		com.minimart.portlet.mathang.model.MatHang matHang)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the mat hang with the primary key or throws a {@link com.minimart.portlet.mathang.NoSuchMatHangException} if it could not be found.
	*
	* @param matHangId the primary key of the mat hang
	* @return the mat hang
	* @throws com.minimart.portlet.mathang.NoSuchMatHangException if a mat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang findByPrimaryKey(
		long matHangId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException;

	/**
	* Returns the mat hang with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param matHangId the primary key of the mat hang
	* @return the mat hang, or <code>null</code> if a mat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.MatHang fetchByPrimaryKey(
		long matHangId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the mat hangs.
	*
	* @return the mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.mathang.model.MatHang> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the mat hangs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.MatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mat hangs
	* @param end the upper bound of the range of mat hangs (not inclusive)
	* @return the range of mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.mathang.model.MatHang> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the mat hangs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.MatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mat hangs
	* @param end the upper bound of the range of mat hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.mathang.model.MatHang> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the mat hangs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of mat hangs.
	*
	* @return the number of mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}