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

package com.minimart.portlet.nhacungcap.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.minimart.portlet.nhacungcap.model.NhomNhaCungCap;

import java.util.List;

/**
 * The persistence utility for the nhom nha cung cap service. This utility wraps {@link NhomNhaCungCapPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see NhomNhaCungCapPersistence
 * @see NhomNhaCungCapPersistenceImpl
 * @generated
 */
public class NhomNhaCungCapUtil {
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
	public static void clearCache(NhomNhaCungCap nhomNhaCungCap) {
		getPersistence().clearCache(nhomNhaCungCap);
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
	public static List<NhomNhaCungCap> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NhomNhaCungCap> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NhomNhaCungCap> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static NhomNhaCungCap update(NhomNhaCungCap nhomNhaCungCap)
		throws SystemException {
		return getPersistence().update(nhomNhaCungCap);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static NhomNhaCungCap update(NhomNhaCungCap nhomNhaCungCap,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(nhomNhaCungCap, serviceContext);
	}

	/**
	* Returns all the nhom nha cung caps where ten = &#63;.
	*
	* @param ten the ten
	* @return the matching nhom nha cung caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhacungcap.model.NhomNhaCungCap> findByTEN(
		java.lang.String ten)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTEN(ten);
	}

	/**
	* Returns a range of all the nhom nha cung caps where ten = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhomNhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param start the lower bound of the range of nhom nha cung caps
	* @param end the upper bound of the range of nhom nha cung caps (not inclusive)
	* @return the range of matching nhom nha cung caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhacungcap.model.NhomNhaCungCap> findByTEN(
		java.lang.String ten, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTEN(ten, start, end);
	}

	/**
	* Returns an ordered range of all the nhom nha cung caps where ten = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhomNhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param start the lower bound of the range of nhom nha cung caps
	* @param end the upper bound of the range of nhom nha cung caps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching nhom nha cung caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhacungcap.model.NhomNhaCungCap> findByTEN(
		java.lang.String ten, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTEN(ten, start, end, orderByComparator);
	}

	/**
	* Returns the first nhom nha cung cap in the ordered set where ten = &#63;.
	*
	* @param ten the ten
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhom nha cung cap
	* @throws com.minimart.portlet.nhacungcap.NoSuchNhomNhaCungCapException if a matching nhom nha cung cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhomNhaCungCap findByTEN_First(
		java.lang.String ten,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhacungcap.NoSuchNhomNhaCungCapException {
		return getPersistence().findByTEN_First(ten, orderByComparator);
	}

	/**
	* Returns the first nhom nha cung cap in the ordered set where ten = &#63;.
	*
	* @param ten the ten
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhom nha cung cap, or <code>null</code> if a matching nhom nha cung cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhomNhaCungCap fetchByTEN_First(
		java.lang.String ten,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTEN_First(ten, orderByComparator);
	}

	/**
	* Returns the last nhom nha cung cap in the ordered set where ten = &#63;.
	*
	* @param ten the ten
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhom nha cung cap
	* @throws com.minimart.portlet.nhacungcap.NoSuchNhomNhaCungCapException if a matching nhom nha cung cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhomNhaCungCap findByTEN_Last(
		java.lang.String ten,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhacungcap.NoSuchNhomNhaCungCapException {
		return getPersistence().findByTEN_Last(ten, orderByComparator);
	}

	/**
	* Returns the last nhom nha cung cap in the ordered set where ten = &#63;.
	*
	* @param ten the ten
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhom nha cung cap, or <code>null</code> if a matching nhom nha cung cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhomNhaCungCap fetchByTEN_Last(
		java.lang.String ten,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTEN_Last(ten, orderByComparator);
	}

	/**
	* Returns the nhom nha cung caps before and after the current nhom nha cung cap in the ordered set where ten = &#63;.
	*
	* @param nhomNhaCungCapId the primary key of the current nhom nha cung cap
	* @param ten the ten
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next nhom nha cung cap
	* @throws com.minimart.portlet.nhacungcap.NoSuchNhomNhaCungCapException if a nhom nha cung cap with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhomNhaCungCap[] findByTEN_PrevAndNext(
		long nhomNhaCungCapId, java.lang.String ten,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhacungcap.NoSuchNhomNhaCungCapException {
		return getPersistence()
				   .findByTEN_PrevAndNext(nhomNhaCungCapId, ten,
			orderByComparator);
	}

	/**
	* Removes all the nhom nha cung caps where ten = &#63; from the database.
	*
	* @param ten the ten
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTEN(java.lang.String ten)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTEN(ten);
	}

	/**
	* Returns the number of nhom nha cung caps where ten = &#63;.
	*
	* @param ten the ten
	* @return the number of matching nhom nha cung caps
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTEN(java.lang.String ten)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTEN(ten);
	}

	/**
	* Returns all the nhom nha cung caps where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @return the matching nhom nha cung caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhacungcap.model.NhomNhaCungCap> findByTEN_HD(
		java.lang.String ten, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTEN_HD(ten, hoatDong);
	}

	/**
	* Returns a range of all the nhom nha cung caps where ten = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhomNhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of nhom nha cung caps
	* @param end the upper bound of the range of nhom nha cung caps (not inclusive)
	* @return the range of matching nhom nha cung caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhacungcap.model.NhomNhaCungCap> findByTEN_HD(
		java.lang.String ten, boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTEN_HD(ten, hoatDong, start, end);
	}

	/**
	* Returns an ordered range of all the nhom nha cung caps where ten = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhomNhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of nhom nha cung caps
	* @param end the upper bound of the range of nhom nha cung caps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching nhom nha cung caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhacungcap.model.NhomNhaCungCap> findByTEN_HD(
		java.lang.String ten, boolean hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTEN_HD(ten, hoatDong, start, end, orderByComparator);
	}

	/**
	* Returns the first nhom nha cung cap in the ordered set where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhom nha cung cap
	* @throws com.minimart.portlet.nhacungcap.NoSuchNhomNhaCungCapException if a matching nhom nha cung cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhomNhaCungCap findByTEN_HD_First(
		java.lang.String ten, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhacungcap.NoSuchNhomNhaCungCapException {
		return getPersistence()
				   .findByTEN_HD_First(ten, hoatDong, orderByComparator);
	}

	/**
	* Returns the first nhom nha cung cap in the ordered set where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhom nha cung cap, or <code>null</code> if a matching nhom nha cung cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhomNhaCungCap fetchByTEN_HD_First(
		java.lang.String ten, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTEN_HD_First(ten, hoatDong, orderByComparator);
	}

	/**
	* Returns the last nhom nha cung cap in the ordered set where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhom nha cung cap
	* @throws com.minimart.portlet.nhacungcap.NoSuchNhomNhaCungCapException if a matching nhom nha cung cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhomNhaCungCap findByTEN_HD_Last(
		java.lang.String ten, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhacungcap.NoSuchNhomNhaCungCapException {
		return getPersistence()
				   .findByTEN_HD_Last(ten, hoatDong, orderByComparator);
	}

	/**
	* Returns the last nhom nha cung cap in the ordered set where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhom nha cung cap, or <code>null</code> if a matching nhom nha cung cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhomNhaCungCap fetchByTEN_HD_Last(
		java.lang.String ten, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTEN_HD_Last(ten, hoatDong, orderByComparator);
	}

	/**
	* Returns the nhom nha cung caps before and after the current nhom nha cung cap in the ordered set where ten = &#63; and hoatDong = &#63;.
	*
	* @param nhomNhaCungCapId the primary key of the current nhom nha cung cap
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next nhom nha cung cap
	* @throws com.minimart.portlet.nhacungcap.NoSuchNhomNhaCungCapException if a nhom nha cung cap with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhomNhaCungCap[] findByTEN_HD_PrevAndNext(
		long nhomNhaCungCapId, java.lang.String ten, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhacungcap.NoSuchNhomNhaCungCapException {
		return getPersistence()
				   .findByTEN_HD_PrevAndNext(nhomNhaCungCapId, ten, hoatDong,
			orderByComparator);
	}

	/**
	* Removes all the nhom nha cung caps where ten = &#63; and hoatDong = &#63; from the database.
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
	* Returns the number of nhom nha cung caps where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @return the number of matching nhom nha cung caps
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTEN_HD(java.lang.String ten, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTEN_HD(ten, hoatDong);
	}

	/**
	* Caches the nhom nha cung cap in the entity cache if it is enabled.
	*
	* @param nhomNhaCungCap the nhom nha cung cap
	*/
	public static void cacheResult(
		com.minimart.portlet.nhacungcap.model.NhomNhaCungCap nhomNhaCungCap) {
		getPersistence().cacheResult(nhomNhaCungCap);
	}

	/**
	* Caches the nhom nha cung caps in the entity cache if it is enabled.
	*
	* @param nhomNhaCungCaps the nhom nha cung caps
	*/
	public static void cacheResult(
		java.util.List<com.minimart.portlet.nhacungcap.model.NhomNhaCungCap> nhomNhaCungCaps) {
		getPersistence().cacheResult(nhomNhaCungCaps);
	}

	/**
	* Creates a new nhom nha cung cap with the primary key. Does not add the nhom nha cung cap to the database.
	*
	* @param nhomNhaCungCapId the primary key for the new nhom nha cung cap
	* @return the new nhom nha cung cap
	*/
	public static com.minimart.portlet.nhacungcap.model.NhomNhaCungCap create(
		long nhomNhaCungCapId) {
		return getPersistence().create(nhomNhaCungCapId);
	}

	/**
	* Removes the nhom nha cung cap with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param nhomNhaCungCapId the primary key of the nhom nha cung cap
	* @return the nhom nha cung cap that was removed
	* @throws com.minimart.portlet.nhacungcap.NoSuchNhomNhaCungCapException if a nhom nha cung cap with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhomNhaCungCap remove(
		long nhomNhaCungCapId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhacungcap.NoSuchNhomNhaCungCapException {
		return getPersistence().remove(nhomNhaCungCapId);
	}

	public static com.minimart.portlet.nhacungcap.model.NhomNhaCungCap updateImpl(
		com.minimart.portlet.nhacungcap.model.NhomNhaCungCap nhomNhaCungCap)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(nhomNhaCungCap);
	}

	/**
	* Returns the nhom nha cung cap with the primary key or throws a {@link com.minimart.portlet.nhacungcap.NoSuchNhomNhaCungCapException} if it could not be found.
	*
	* @param nhomNhaCungCapId the primary key of the nhom nha cung cap
	* @return the nhom nha cung cap
	* @throws com.minimart.portlet.nhacungcap.NoSuchNhomNhaCungCapException if a nhom nha cung cap with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhomNhaCungCap findByPrimaryKey(
		long nhomNhaCungCapId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhacungcap.NoSuchNhomNhaCungCapException {
		return getPersistence().findByPrimaryKey(nhomNhaCungCapId);
	}

	/**
	* Returns the nhom nha cung cap with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param nhomNhaCungCapId the primary key of the nhom nha cung cap
	* @return the nhom nha cung cap, or <code>null</code> if a nhom nha cung cap with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhomNhaCungCap fetchByPrimaryKey(
		long nhomNhaCungCapId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(nhomNhaCungCapId);
	}

	/**
	* Returns all the nhom nha cung caps.
	*
	* @return the nhom nha cung caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhacungcap.model.NhomNhaCungCap> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the nhom nha cung caps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhomNhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nhom nha cung caps
	* @param end the upper bound of the range of nhom nha cung caps (not inclusive)
	* @return the range of nhom nha cung caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhacungcap.model.NhomNhaCungCap> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the nhom nha cung caps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhomNhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nhom nha cung caps
	* @param end the upper bound of the range of nhom nha cung caps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of nhom nha cung caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhacungcap.model.NhomNhaCungCap> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the nhom nha cung caps from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of nhom nha cung caps.
	*
	* @return the number of nhom nha cung caps
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static NhomNhaCungCapPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (NhomNhaCungCapPersistence)PortletBeanLocatorUtil.locate(com.minimart.portlet.nhacungcap.service.ClpSerializer.getServletContextName(),
					NhomNhaCungCapPersistence.class.getName());

			ReferenceRegistry.registerReference(NhomNhaCungCapUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(NhomNhaCungCapPersistence persistence) {
	}

	private static NhomNhaCungCapPersistence _persistence;
}