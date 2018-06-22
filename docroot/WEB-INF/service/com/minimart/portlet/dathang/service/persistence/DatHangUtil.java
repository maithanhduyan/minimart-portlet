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

package com.minimart.portlet.dathang.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.minimart.portlet.dathang.model.DatHang;

import java.util.List;

/**
 * The persistence utility for the dat hang service. This utility wraps {@link DatHangPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see DatHangPersistence
 * @see DatHangPersistenceImpl
 * @generated
 */
public class DatHangUtil {
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
	public static void clearCache(DatHang datHang) {
		getPersistence().clearCache(datHang);
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
	public static List<DatHang> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DatHang> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DatHang> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DatHang update(DatHang datHang) throws SystemException {
		return getPersistence().update(datHang);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DatHang update(DatHang datHang, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(datHang, serviceContext);
	}

	/**
	* Returns all the dat hangs where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @return the matching dat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.dathang.model.DatHang> findByTEN_HD(
		java.lang.String ten, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTEN_HD(ten, hoatDong);
	}

	/**
	* Returns a range of all the dat hangs where ten = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.dathang.model.impl.DatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of dat hangs
	* @param end the upper bound of the range of dat hangs (not inclusive)
	* @return the range of matching dat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.dathang.model.DatHang> findByTEN_HD(
		java.lang.String ten, boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTEN_HD(ten, hoatDong, start, end);
	}

	/**
	* Returns an ordered range of all the dat hangs where ten = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.dathang.model.impl.DatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of dat hangs
	* @param end the upper bound of the range of dat hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.dathang.model.DatHang> findByTEN_HD(
		java.lang.String ten, boolean hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTEN_HD(ten, hoatDong, start, end, orderByComparator);
	}

	/**
	* Returns the first dat hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dat hang
	* @throws com.minimart.portlet.dathang.NoSuchDatHangException if a matching dat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.dathang.model.DatHang findByTEN_HD_First(
		java.lang.String ten, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.dathang.NoSuchDatHangException {
		return getPersistence()
				   .findByTEN_HD_First(ten, hoatDong, orderByComparator);
	}

	/**
	* Returns the first dat hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dat hang, or <code>null</code> if a matching dat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.dathang.model.DatHang fetchByTEN_HD_First(
		java.lang.String ten, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTEN_HD_First(ten, hoatDong, orderByComparator);
	}

	/**
	* Returns the last dat hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dat hang
	* @throws com.minimart.portlet.dathang.NoSuchDatHangException if a matching dat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.dathang.model.DatHang findByTEN_HD_Last(
		java.lang.String ten, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.dathang.NoSuchDatHangException {
		return getPersistence()
				   .findByTEN_HD_Last(ten, hoatDong, orderByComparator);
	}

	/**
	* Returns the last dat hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dat hang, or <code>null</code> if a matching dat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.dathang.model.DatHang fetchByTEN_HD_Last(
		java.lang.String ten, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTEN_HD_Last(ten, hoatDong, orderByComparator);
	}

	/**
	* Returns the dat hangs before and after the current dat hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	*
	* @param datHangId the primary key of the current dat hang
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dat hang
	* @throws com.minimart.portlet.dathang.NoSuchDatHangException if a dat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.dathang.model.DatHang[] findByTEN_HD_PrevAndNext(
		long datHangId, java.lang.String ten, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.dathang.NoSuchDatHangException {
		return getPersistence()
				   .findByTEN_HD_PrevAndNext(datHangId, ten, hoatDong,
			orderByComparator);
	}

	/**
	* Removes all the dat hangs where ten = &#63; and hoatDong = &#63; from the database.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTEN_HD(java.lang.String ten, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTEN_HD(ten, hoatDong);
	}

	/**
	* Returns the number of dat hangs where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @return the number of matching dat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTEN_HD(java.lang.String ten, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTEN_HD(ten, hoatDong);
	}

	/**
	* Returns all the dat hangs where ten = &#63; and hoatDong = &#63; and khachHangId = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param khachHangId the khach hang ID
	* @return the matching dat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.dathang.model.DatHang> findByTEN_HD_KHID(
		java.lang.String ten, boolean hoatDong, long khachHangId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTEN_HD_KHID(ten, hoatDong, khachHangId);
	}

	/**
	* Returns a range of all the dat hangs where ten = &#63; and hoatDong = &#63; and khachHangId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.dathang.model.impl.DatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param khachHangId the khach hang ID
	* @param start the lower bound of the range of dat hangs
	* @param end the upper bound of the range of dat hangs (not inclusive)
	* @return the range of matching dat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.dathang.model.DatHang> findByTEN_HD_KHID(
		java.lang.String ten, boolean hoatDong, long khachHangId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTEN_HD_KHID(ten, hoatDong, khachHangId, start, end);
	}

	/**
	* Returns an ordered range of all the dat hangs where ten = &#63; and hoatDong = &#63; and khachHangId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.dathang.model.impl.DatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param khachHangId the khach hang ID
	* @param start the lower bound of the range of dat hangs
	* @param end the upper bound of the range of dat hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.dathang.model.DatHang> findByTEN_HD_KHID(
		java.lang.String ten, boolean hoatDong, long khachHangId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTEN_HD_KHID(ten, hoatDong, khachHangId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dat hang in the ordered set where ten = &#63; and hoatDong = &#63; and khachHangId = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param khachHangId the khach hang ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dat hang
	* @throws com.minimart.portlet.dathang.NoSuchDatHangException if a matching dat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.dathang.model.DatHang findByTEN_HD_KHID_First(
		java.lang.String ten, boolean hoatDong, long khachHangId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.dathang.NoSuchDatHangException {
		return getPersistence()
				   .findByTEN_HD_KHID_First(ten, hoatDong, khachHangId,
			orderByComparator);
	}

	/**
	* Returns the first dat hang in the ordered set where ten = &#63; and hoatDong = &#63; and khachHangId = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param khachHangId the khach hang ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dat hang, or <code>null</code> if a matching dat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.dathang.model.DatHang fetchByTEN_HD_KHID_First(
		java.lang.String ten, boolean hoatDong, long khachHangId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTEN_HD_KHID_First(ten, hoatDong, khachHangId,
			orderByComparator);
	}

	/**
	* Returns the last dat hang in the ordered set where ten = &#63; and hoatDong = &#63; and khachHangId = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param khachHangId the khach hang ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dat hang
	* @throws com.minimart.portlet.dathang.NoSuchDatHangException if a matching dat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.dathang.model.DatHang findByTEN_HD_KHID_Last(
		java.lang.String ten, boolean hoatDong, long khachHangId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.dathang.NoSuchDatHangException {
		return getPersistence()
				   .findByTEN_HD_KHID_Last(ten, hoatDong, khachHangId,
			orderByComparator);
	}

	/**
	* Returns the last dat hang in the ordered set where ten = &#63; and hoatDong = &#63; and khachHangId = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param khachHangId the khach hang ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dat hang, or <code>null</code> if a matching dat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.dathang.model.DatHang fetchByTEN_HD_KHID_Last(
		java.lang.String ten, boolean hoatDong, long khachHangId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTEN_HD_KHID_Last(ten, hoatDong, khachHangId,
			orderByComparator);
	}

	/**
	* Returns the dat hangs before and after the current dat hang in the ordered set where ten = &#63; and hoatDong = &#63; and khachHangId = &#63;.
	*
	* @param datHangId the primary key of the current dat hang
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param khachHangId the khach hang ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dat hang
	* @throws com.minimart.portlet.dathang.NoSuchDatHangException if a dat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.dathang.model.DatHang[] findByTEN_HD_KHID_PrevAndNext(
		long datHangId, java.lang.String ten, boolean hoatDong,
		long khachHangId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.dathang.NoSuchDatHangException {
		return getPersistence()
				   .findByTEN_HD_KHID_PrevAndNext(datHangId, ten, hoatDong,
			khachHangId, orderByComparator);
	}

	/**
	* Removes all the dat hangs where ten = &#63; and hoatDong = &#63; and khachHangId = &#63; from the database.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param khachHangId the khach hang ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTEN_HD_KHID(java.lang.String ten,
		boolean hoatDong, long khachHangId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTEN_HD_KHID(ten, hoatDong, khachHangId);
	}

	/**
	* Returns the number of dat hangs where ten = &#63; and hoatDong = &#63; and khachHangId = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param khachHangId the khach hang ID
	* @return the number of matching dat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTEN_HD_KHID(java.lang.String ten,
		boolean hoatDong, long khachHangId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTEN_HD_KHID(ten, hoatDong, khachHangId);
	}

	/**
	* Caches the dat hang in the entity cache if it is enabled.
	*
	* @param datHang the dat hang
	*/
	public static void cacheResult(
		com.minimart.portlet.dathang.model.DatHang datHang) {
		getPersistence().cacheResult(datHang);
	}

	/**
	* Caches the dat hangs in the entity cache if it is enabled.
	*
	* @param datHangs the dat hangs
	*/
	public static void cacheResult(
		java.util.List<com.minimart.portlet.dathang.model.DatHang> datHangs) {
		getPersistence().cacheResult(datHangs);
	}

	/**
	* Creates a new dat hang with the primary key. Does not add the dat hang to the database.
	*
	* @param datHangId the primary key for the new dat hang
	* @return the new dat hang
	*/
	public static com.minimart.portlet.dathang.model.DatHang create(
		long datHangId) {
		return getPersistence().create(datHangId);
	}

	/**
	* Removes the dat hang with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param datHangId the primary key of the dat hang
	* @return the dat hang that was removed
	* @throws com.minimart.portlet.dathang.NoSuchDatHangException if a dat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.dathang.model.DatHang remove(
		long datHangId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.dathang.NoSuchDatHangException {
		return getPersistence().remove(datHangId);
	}

	public static com.minimart.portlet.dathang.model.DatHang updateImpl(
		com.minimart.portlet.dathang.model.DatHang datHang)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(datHang);
	}

	/**
	* Returns the dat hang with the primary key or throws a {@link com.minimart.portlet.dathang.NoSuchDatHangException} if it could not be found.
	*
	* @param datHangId the primary key of the dat hang
	* @return the dat hang
	* @throws com.minimart.portlet.dathang.NoSuchDatHangException if a dat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.dathang.model.DatHang findByPrimaryKey(
		long datHangId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.dathang.NoSuchDatHangException {
		return getPersistence().findByPrimaryKey(datHangId);
	}

	/**
	* Returns the dat hang with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param datHangId the primary key of the dat hang
	* @return the dat hang, or <code>null</code> if a dat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.dathang.model.DatHang fetchByPrimaryKey(
		long datHangId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(datHangId);
	}

	/**
	* Returns all the dat hangs.
	*
	* @return the dat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.dathang.model.DatHang> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dat hangs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.dathang.model.impl.DatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dat hangs
	* @param end the upper bound of the range of dat hangs (not inclusive)
	* @return the range of dat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.dathang.model.DatHang> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dat hangs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.dathang.model.impl.DatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dat hangs
	* @param end the upper bound of the range of dat hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.dathang.model.DatHang> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dat hangs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dat hangs.
	*
	* @return the number of dat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DatHangPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DatHangPersistence)PortletBeanLocatorUtil.locate(com.minimart.portlet.dathang.service.ClpSerializer.getServletContextName(),
					DatHangPersistence.class.getName());

			ReferenceRegistry.registerReference(DatHangUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DatHangPersistence persistence) {
	}

	private static DatHangPersistence _persistence;
}