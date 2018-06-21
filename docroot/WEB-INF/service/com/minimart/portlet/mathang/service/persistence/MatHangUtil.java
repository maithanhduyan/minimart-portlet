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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.minimart.portlet.mathang.model.MatHang;

import java.util.List;

/**
 * The persistence utility for the mat hang service. This utility wraps {@link MatHangPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see MatHangPersistence
 * @see MatHangPersistenceImpl
 * @generated
 */
public class MatHangUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(MatHang matHang) {
		getPersistence().clearCache(matHang);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MatHang> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MatHang> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MatHang> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static MatHang update(MatHang matHang) throws SystemException {
		return getPersistence().update(matHang);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static MatHang update(MatHang matHang, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(matHang, serviceContext);
	}

	/**
	* Returns all the mat hangs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.mathang.model.MatHang> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

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
	public static java.util.List<com.minimart.portlet.mathang.model.MatHang> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static java.util.List<com.minimart.portlet.mathang.model.MatHang> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns the first mat hang in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mat hang
	* @throws com.minimart.portlet.mathang.NoSuchMatHangException if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.MatHang findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first mat hang in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mat hang, or <code>null</code> if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.MatHang fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last mat hang in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mat hang
	* @throws com.minimart.portlet.mathang.NoSuchMatHangException if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.MatHang findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last mat hang in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mat hang, or <code>null</code> if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.MatHang fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

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
	public static com.minimart.portlet.mathang.model.MatHang[] findByUuid_PrevAndNext(
		long matHangId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException {
		return getPersistence()
				   .findByUuid_PrevAndNext(matHangId, uuid, orderByComparator);
	}

	/**
	* Removes all the mat hangs where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of mat hangs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the mat hang where uuid = &#63; and groupId = &#63; or throws a {@link com.minimart.portlet.mathang.NoSuchMatHangException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching mat hang
	* @throws com.minimart.portlet.mathang.NoSuchMatHangException if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.MatHang findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the mat hang where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching mat hang, or <code>null</code> if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.MatHang fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the mat hang where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching mat hang, or <code>null</code> if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.MatHang fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the mat hang where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the mat hang that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.MatHang removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of mat hangs where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the mat hangs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.mathang.model.MatHang> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static java.util.List<com.minimart.portlet.mathang.model.MatHang> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static java.util.List<com.minimart.portlet.mathang.model.MatHang> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

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
	public static com.minimart.portlet.mathang.model.MatHang findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first mat hang in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mat hang, or <code>null</code> if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.MatHang fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

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
	public static com.minimart.portlet.mathang.model.MatHang findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last mat hang in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mat hang, or <code>null</code> if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.MatHang fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

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
	public static com.minimart.portlet.mathang.model.MatHang[] findByUuid_C_PrevAndNext(
		long matHangId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(matHangId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the mat hangs where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of mat hangs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the mat hangs where name = &#63;.
	*
	* @param name the name
	* @return the matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.mathang.model.MatHang> findByName(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByName(name);
	}

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
	public static java.util.List<com.minimart.portlet.mathang.model.MatHang> findByName(
		java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByName(name, start, end);
	}

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
	public static java.util.List<com.minimart.portlet.mathang.model.MatHang> findByName(
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByName(name, start, end, orderByComparator);
	}

	/**
	* Returns the first mat hang in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mat hang
	* @throws com.minimart.portlet.mathang.NoSuchMatHangException if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.MatHang findByName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException {
		return getPersistence().findByName_First(name, orderByComparator);
	}

	/**
	* Returns the first mat hang in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mat hang, or <code>null</code> if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.MatHang fetchByName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByName_First(name, orderByComparator);
	}

	/**
	* Returns the last mat hang in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mat hang
	* @throws com.minimart.portlet.mathang.NoSuchMatHangException if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.MatHang findByName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException {
		return getPersistence().findByName_Last(name, orderByComparator);
	}

	/**
	* Returns the last mat hang in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mat hang, or <code>null</code> if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.MatHang fetchByName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByName_Last(name, orderByComparator);
	}

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
	public static com.minimart.portlet.mathang.model.MatHang[] findByName_PrevAndNext(
		long matHangId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException {
		return getPersistence()
				   .findByName_PrevAndNext(matHangId, name, orderByComparator);
	}

	/**
	* Removes all the mat hangs where name = &#63; from the database.
	*
	* @param name the name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByName(java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByName(name);
	}

	/**
	* Returns the number of mat hangs where name = &#63;.
	*
	* @param name the name
	* @return the number of matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByName(java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByName(name);
	}

	/**
	* Returns all the mat hangs where companyId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @return the matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.mathang.model.MatHang> findByC_U(
		long companyId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_U(companyId, userId);
	}

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
	public static java.util.List<com.minimart.portlet.mathang.model.MatHang> findByC_U(
		long companyId, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_U(companyId, userId, start, end);
	}

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
	public static java.util.List<com.minimart.portlet.mathang.model.MatHang> findByC_U(
		long companyId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_U(companyId, userId, start, end, orderByComparator);
	}

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
	public static com.minimart.portlet.mathang.model.MatHang findByC_U_First(
		long companyId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException {
		return getPersistence()
				   .findByC_U_First(companyId, userId, orderByComparator);
	}

	/**
	* Returns the first mat hang in the ordered set where companyId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mat hang, or <code>null</code> if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.MatHang fetchByC_U_First(
		long companyId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_U_First(companyId, userId, orderByComparator);
	}

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
	public static com.minimart.portlet.mathang.model.MatHang findByC_U_Last(
		long companyId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException {
		return getPersistence()
				   .findByC_U_Last(companyId, userId, orderByComparator);
	}

	/**
	* Returns the last mat hang in the ordered set where companyId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mat hang, or <code>null</code> if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.MatHang fetchByC_U_Last(
		long companyId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_U_Last(companyId, userId, orderByComparator);
	}

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
	public static com.minimart.portlet.mathang.model.MatHang[] findByC_U_PrevAndNext(
		long matHangId, long companyId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException {
		return getPersistence()
				   .findByC_U_PrevAndNext(matHangId, companyId, userId,
			orderByComparator);
	}

	/**
	* Removes all the mat hangs where companyId = &#63; and userId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_U(long companyId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_U(companyId, userId);
	}

	/**
	* Returns the number of mat hangs where companyId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param userId the user ID
	* @return the number of matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_U(long companyId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_U(companyId, userId);
	}

	/**
	* Returns all the mat hangs where companyId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param status the status
	* @return the matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.mathang.model.MatHang> findByC_S(
		long companyId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_S(companyId, status);
	}

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
	public static java.util.List<com.minimart.portlet.mathang.model.MatHang> findByC_S(
		long companyId, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_S(companyId, status, start, end);
	}

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
	public static java.util.List<com.minimart.portlet.mathang.model.MatHang> findByC_S(
		long companyId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_S(companyId, status, start, end, orderByComparator);
	}

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
	public static com.minimart.portlet.mathang.model.MatHang findByC_S_First(
		long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException {
		return getPersistence()
				   .findByC_S_First(companyId, status, orderByComparator);
	}

	/**
	* Returns the first mat hang in the ordered set where companyId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mat hang, or <code>null</code> if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.MatHang fetchByC_S_First(
		long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_S_First(companyId, status, orderByComparator);
	}

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
	public static com.minimart.portlet.mathang.model.MatHang findByC_S_Last(
		long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException {
		return getPersistence()
				   .findByC_S_Last(companyId, status, orderByComparator);
	}

	/**
	* Returns the last mat hang in the ordered set where companyId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mat hang, or <code>null</code> if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.MatHang fetchByC_S_Last(
		long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_S_Last(companyId, status, orderByComparator);
	}

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
	public static com.minimart.portlet.mathang.model.MatHang[] findByC_S_PrevAndNext(
		long matHangId, long companyId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException {
		return getPersistence()
				   .findByC_S_PrevAndNext(matHangId, companyId, status,
			orderByComparator);
	}

	/**
	* Removes all the mat hangs where companyId = &#63; and status = &#63; from the database.
	*
	* @param companyId the company ID
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_S(long companyId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_S(companyId, status);
	}

	/**
	* Returns the number of mat hangs where companyId = &#63; and status = &#63;.
	*
	* @param companyId the company ID
	* @param status the status
	* @return the number of matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_S(long companyId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_S(companyId, status);
	}

	/**
	* Returns the mat hang where code = &#63; and hoatDong = &#63; or throws a {@link com.minimart.portlet.mathang.NoSuchMatHangException} if it could not be found.
	*
	* @param code the code
	* @param hoatDong the hoat dong
	* @return the matching mat hang
	* @throws com.minimart.portlet.mathang.NoSuchMatHangException if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.MatHang findByBCODE_HD(
		java.lang.String code, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException {
		return getPersistence().findByBCODE_HD(code, hoatDong);
	}

	/**
	* Returns the mat hang where code = &#63; and hoatDong = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param code the code
	* @param hoatDong the hoat dong
	* @return the matching mat hang, or <code>null</code> if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.MatHang fetchByBCODE_HD(
		java.lang.String code, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByBCODE_HD(code, hoatDong);
	}

	/**
	* Returns the mat hang where code = &#63; and hoatDong = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param code the code
	* @param hoatDong the hoat dong
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching mat hang, or <code>null</code> if a matching mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.MatHang fetchByBCODE_HD(
		java.lang.String code, boolean hoatDong, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByBCODE_HD(code, hoatDong, retrieveFromCache);
	}

	/**
	* Removes the mat hang where code = &#63; and hoatDong = &#63; from the database.
	*
	* @param code the code
	* @param hoatDong the hoat dong
	* @return the mat hang that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.MatHang removeByBCODE_HD(
		java.lang.String code, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException {
		return getPersistence().removeByBCODE_HD(code, hoatDong);
	}

	/**
	* Returns the number of mat hangs where code = &#63; and hoatDong = &#63;.
	*
	* @param code the code
	* @param hoatDong the hoat dong
	* @return the number of matching mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByBCODE_HD(java.lang.String code, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByBCODE_HD(code, hoatDong);
	}

	/**
	* Caches the mat hang in the entity cache if it is enabled.
	*
	* @param matHang the mat hang
	*/
	public static void cacheResult(
		com.minimart.portlet.mathang.model.MatHang matHang) {
		getPersistence().cacheResult(matHang);
	}

	/**
	* Caches the mat hangs in the entity cache if it is enabled.
	*
	* @param matHangs the mat hangs
	*/
	public static void cacheResult(
		java.util.List<com.minimart.portlet.mathang.model.MatHang> matHangs) {
		getPersistence().cacheResult(matHangs);
	}

	/**
	* Creates a new mat hang with the primary key. Does not add the mat hang to the database.
	*
	* @param matHangId the primary key for the new mat hang
	* @return the new mat hang
	*/
	public static com.minimart.portlet.mathang.model.MatHang create(
		long matHangId) {
		return getPersistence().create(matHangId);
	}

	/**
	* Removes the mat hang with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param matHangId the primary key of the mat hang
	* @return the mat hang that was removed
	* @throws com.minimart.portlet.mathang.NoSuchMatHangException if a mat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.MatHang remove(
		long matHangId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException {
		return getPersistence().remove(matHangId);
	}

	public static com.minimart.portlet.mathang.model.MatHang updateImpl(
		com.minimart.portlet.mathang.model.MatHang matHang)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(matHang);
	}

	/**
	* Returns the mat hang with the primary key or throws a {@link com.minimart.portlet.mathang.NoSuchMatHangException} if it could not be found.
	*
	* @param matHangId the primary key of the mat hang
	* @return the mat hang
	* @throws com.minimart.portlet.mathang.NoSuchMatHangException if a mat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.MatHang findByPrimaryKey(
		long matHangId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchMatHangException {
		return getPersistence().findByPrimaryKey(matHangId);
	}

	/**
	* Returns the mat hang with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param matHangId the primary key of the mat hang
	* @return the mat hang, or <code>null</code> if a mat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.MatHang fetchByPrimaryKey(
		long matHangId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(matHangId);
	}

	/**
	* Returns all the mat hangs.
	*
	* @return the mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.mathang.model.MatHang> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.minimart.portlet.mathang.model.MatHang> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.minimart.portlet.mathang.model.MatHang> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the mat hangs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of mat hangs.
	*
	* @return the number of mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MatHangPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MatHangPersistence)PortletBeanLocatorUtil.locate(com.minimart.portlet.mathang.service.ClpSerializer.getServletContextName(),
					MatHangPersistence.class.getName());

			ReferenceRegistry.registerReference(MatHangUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(MatHangPersistence persistence) {
	}

	private static MatHangPersistence _persistence;
}