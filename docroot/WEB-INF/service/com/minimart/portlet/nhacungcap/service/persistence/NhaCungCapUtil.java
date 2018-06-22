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

import com.minimart.portlet.nhacungcap.model.NhaCungCap;

import java.util.List;

/**
 * The persistence utility for the nha cung cap service. This utility wraps {@link NhaCungCapPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see NhaCungCapPersistence
 * @see NhaCungCapPersistenceImpl
 * @generated
 */
public class NhaCungCapUtil {
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
	public static void clearCache(NhaCungCap nhaCungCap) {
		getPersistence().clearCache(nhaCungCap);
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
	public static List<NhaCungCap> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NhaCungCap> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NhaCungCap> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static NhaCungCap update(NhaCungCap nhaCungCap)
		throws SystemException {
		return getPersistence().update(nhaCungCap);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static NhaCungCap update(NhaCungCap nhaCungCap,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(nhaCungCap, serviceContext);
	}

	/**
	* Returns all the nha cung caps where tenNhaCungCap = &#63; and maNhaCungCap = &#63;.
	*
	* @param tenNhaCungCap the ten nha cung cap
	* @param maNhaCungCap the ma nha cung cap
	* @return the matching nha cung caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhacungcap.model.NhaCungCap> findByTEN_MA(
		java.lang.String tenNhaCungCap, java.lang.String maNhaCungCap)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTEN_MA(tenNhaCungCap, maNhaCungCap);
	}

	/**
	* Returns a range of all the nha cung caps where tenNhaCungCap = &#63; and maNhaCungCap = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tenNhaCungCap the ten nha cung cap
	* @param maNhaCungCap the ma nha cung cap
	* @param start the lower bound of the range of nha cung caps
	* @param end the upper bound of the range of nha cung caps (not inclusive)
	* @return the range of matching nha cung caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhacungcap.model.NhaCungCap> findByTEN_MA(
		java.lang.String tenNhaCungCap, java.lang.String maNhaCungCap,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTEN_MA(tenNhaCungCap, maNhaCungCap, start, end);
	}

	/**
	* Returns an ordered range of all the nha cung caps where tenNhaCungCap = &#63; and maNhaCungCap = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tenNhaCungCap the ten nha cung cap
	* @param maNhaCungCap the ma nha cung cap
	* @param start the lower bound of the range of nha cung caps
	* @param end the upper bound of the range of nha cung caps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching nha cung caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhacungcap.model.NhaCungCap> findByTEN_MA(
		java.lang.String tenNhaCungCap, java.lang.String maNhaCungCap,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTEN_MA(tenNhaCungCap, maNhaCungCap, start, end,
			orderByComparator);
	}

	/**
	* Returns the first nha cung cap in the ordered set where tenNhaCungCap = &#63; and maNhaCungCap = &#63;.
	*
	* @param tenNhaCungCap the ten nha cung cap
	* @param maNhaCungCap the ma nha cung cap
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nha cung cap
	* @throws com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException if a matching nha cung cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhaCungCap findByTEN_MA_First(
		java.lang.String tenNhaCungCap, java.lang.String maNhaCungCap,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException {
		return getPersistence()
				   .findByTEN_MA_First(tenNhaCungCap, maNhaCungCap,
			orderByComparator);
	}

	/**
	* Returns the first nha cung cap in the ordered set where tenNhaCungCap = &#63; and maNhaCungCap = &#63;.
	*
	* @param tenNhaCungCap the ten nha cung cap
	* @param maNhaCungCap the ma nha cung cap
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nha cung cap, or <code>null</code> if a matching nha cung cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhaCungCap fetchByTEN_MA_First(
		java.lang.String tenNhaCungCap, java.lang.String maNhaCungCap,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTEN_MA_First(tenNhaCungCap, maNhaCungCap,
			orderByComparator);
	}

	/**
	* Returns the last nha cung cap in the ordered set where tenNhaCungCap = &#63; and maNhaCungCap = &#63;.
	*
	* @param tenNhaCungCap the ten nha cung cap
	* @param maNhaCungCap the ma nha cung cap
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nha cung cap
	* @throws com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException if a matching nha cung cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhaCungCap findByTEN_MA_Last(
		java.lang.String tenNhaCungCap, java.lang.String maNhaCungCap,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException {
		return getPersistence()
				   .findByTEN_MA_Last(tenNhaCungCap, maNhaCungCap,
			orderByComparator);
	}

	/**
	* Returns the last nha cung cap in the ordered set where tenNhaCungCap = &#63; and maNhaCungCap = &#63;.
	*
	* @param tenNhaCungCap the ten nha cung cap
	* @param maNhaCungCap the ma nha cung cap
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nha cung cap, or <code>null</code> if a matching nha cung cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhaCungCap fetchByTEN_MA_Last(
		java.lang.String tenNhaCungCap, java.lang.String maNhaCungCap,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTEN_MA_Last(tenNhaCungCap, maNhaCungCap,
			orderByComparator);
	}

	/**
	* Returns the nha cung caps before and after the current nha cung cap in the ordered set where tenNhaCungCap = &#63; and maNhaCungCap = &#63;.
	*
	* @param nhaCungCapId the primary key of the current nha cung cap
	* @param tenNhaCungCap the ten nha cung cap
	* @param maNhaCungCap the ma nha cung cap
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next nha cung cap
	* @throws com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException if a nha cung cap with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhaCungCap[] findByTEN_MA_PrevAndNext(
		long nhaCungCapId, java.lang.String tenNhaCungCap,
		java.lang.String maNhaCungCap,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException {
		return getPersistence()
				   .findByTEN_MA_PrevAndNext(nhaCungCapId, tenNhaCungCap,
			maNhaCungCap, orderByComparator);
	}

	/**
	* Removes all the nha cung caps where tenNhaCungCap = &#63; and maNhaCungCap = &#63; from the database.
	*
	* @param tenNhaCungCap the ten nha cung cap
	* @param maNhaCungCap the ma nha cung cap
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTEN_MA(java.lang.String tenNhaCungCap,
		java.lang.String maNhaCungCap)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTEN_MA(tenNhaCungCap, maNhaCungCap);
	}

	/**
	* Returns the number of nha cung caps where tenNhaCungCap = &#63; and maNhaCungCap = &#63;.
	*
	* @param tenNhaCungCap the ten nha cung cap
	* @param maNhaCungCap the ma nha cung cap
	* @return the number of matching nha cung caps
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTEN_MA(java.lang.String tenNhaCungCap,
		java.lang.String maNhaCungCap)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTEN_MA(tenNhaCungCap, maNhaCungCap);
	}

	/**
	* Returns all the nha cung caps where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63;.
	*
	* @param tenNhaCungCap the ten nha cung cap
	* @param maNhaCungCap the ma nha cung cap
	* @param nhomNhaCungCapId the nhom nha cung cap ID
	* @return the matching nha cung caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhacungcap.model.NhaCungCap> findByTEN_MA_NHOM(
		java.lang.String tenNhaCungCap, java.lang.String maNhaCungCap,
		long nhomNhaCungCapId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTEN_MA_NHOM(tenNhaCungCap, maNhaCungCap,
			nhomNhaCungCapId);
	}

	/**
	* Returns a range of all the nha cung caps where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tenNhaCungCap the ten nha cung cap
	* @param maNhaCungCap the ma nha cung cap
	* @param nhomNhaCungCapId the nhom nha cung cap ID
	* @param start the lower bound of the range of nha cung caps
	* @param end the upper bound of the range of nha cung caps (not inclusive)
	* @return the range of matching nha cung caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhacungcap.model.NhaCungCap> findByTEN_MA_NHOM(
		java.lang.String tenNhaCungCap, java.lang.String maNhaCungCap,
		long nhomNhaCungCapId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTEN_MA_NHOM(tenNhaCungCap, maNhaCungCap,
			nhomNhaCungCapId, start, end);
	}

	/**
	* Returns an ordered range of all the nha cung caps where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tenNhaCungCap the ten nha cung cap
	* @param maNhaCungCap the ma nha cung cap
	* @param nhomNhaCungCapId the nhom nha cung cap ID
	* @param start the lower bound of the range of nha cung caps
	* @param end the upper bound of the range of nha cung caps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching nha cung caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhacungcap.model.NhaCungCap> findByTEN_MA_NHOM(
		java.lang.String tenNhaCungCap, java.lang.String maNhaCungCap,
		long nhomNhaCungCapId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTEN_MA_NHOM(tenNhaCungCap, maNhaCungCap,
			nhomNhaCungCapId, start, end, orderByComparator);
	}

	/**
	* Returns the first nha cung cap in the ordered set where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63;.
	*
	* @param tenNhaCungCap the ten nha cung cap
	* @param maNhaCungCap the ma nha cung cap
	* @param nhomNhaCungCapId the nhom nha cung cap ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nha cung cap
	* @throws com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException if a matching nha cung cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhaCungCap findByTEN_MA_NHOM_First(
		java.lang.String tenNhaCungCap, java.lang.String maNhaCungCap,
		long nhomNhaCungCapId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException {
		return getPersistence()
				   .findByTEN_MA_NHOM_First(tenNhaCungCap, maNhaCungCap,
			nhomNhaCungCapId, orderByComparator);
	}

	/**
	* Returns the first nha cung cap in the ordered set where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63;.
	*
	* @param tenNhaCungCap the ten nha cung cap
	* @param maNhaCungCap the ma nha cung cap
	* @param nhomNhaCungCapId the nhom nha cung cap ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nha cung cap, or <code>null</code> if a matching nha cung cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhaCungCap fetchByTEN_MA_NHOM_First(
		java.lang.String tenNhaCungCap, java.lang.String maNhaCungCap,
		long nhomNhaCungCapId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTEN_MA_NHOM_First(tenNhaCungCap, maNhaCungCap,
			nhomNhaCungCapId, orderByComparator);
	}

	/**
	* Returns the last nha cung cap in the ordered set where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63;.
	*
	* @param tenNhaCungCap the ten nha cung cap
	* @param maNhaCungCap the ma nha cung cap
	* @param nhomNhaCungCapId the nhom nha cung cap ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nha cung cap
	* @throws com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException if a matching nha cung cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhaCungCap findByTEN_MA_NHOM_Last(
		java.lang.String tenNhaCungCap, java.lang.String maNhaCungCap,
		long nhomNhaCungCapId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException {
		return getPersistence()
				   .findByTEN_MA_NHOM_Last(tenNhaCungCap, maNhaCungCap,
			nhomNhaCungCapId, orderByComparator);
	}

	/**
	* Returns the last nha cung cap in the ordered set where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63;.
	*
	* @param tenNhaCungCap the ten nha cung cap
	* @param maNhaCungCap the ma nha cung cap
	* @param nhomNhaCungCapId the nhom nha cung cap ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nha cung cap, or <code>null</code> if a matching nha cung cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhaCungCap fetchByTEN_MA_NHOM_Last(
		java.lang.String tenNhaCungCap, java.lang.String maNhaCungCap,
		long nhomNhaCungCapId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTEN_MA_NHOM_Last(tenNhaCungCap, maNhaCungCap,
			nhomNhaCungCapId, orderByComparator);
	}

	/**
	* Returns the nha cung caps before and after the current nha cung cap in the ordered set where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63;.
	*
	* @param nhaCungCapId the primary key of the current nha cung cap
	* @param tenNhaCungCap the ten nha cung cap
	* @param maNhaCungCap the ma nha cung cap
	* @param nhomNhaCungCapId the nhom nha cung cap ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next nha cung cap
	* @throws com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException if a nha cung cap with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhaCungCap[] findByTEN_MA_NHOM_PrevAndNext(
		long nhaCungCapId, java.lang.String tenNhaCungCap,
		java.lang.String maNhaCungCap, long nhomNhaCungCapId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException {
		return getPersistence()
				   .findByTEN_MA_NHOM_PrevAndNext(nhaCungCapId, tenNhaCungCap,
			maNhaCungCap, nhomNhaCungCapId, orderByComparator);
	}

	/**
	* Removes all the nha cung caps where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63; from the database.
	*
	* @param tenNhaCungCap the ten nha cung cap
	* @param maNhaCungCap the ma nha cung cap
	* @param nhomNhaCungCapId the nhom nha cung cap ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTEN_MA_NHOM(java.lang.String tenNhaCungCap,
		java.lang.String maNhaCungCap, long nhomNhaCungCapId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByTEN_MA_NHOM(tenNhaCungCap, maNhaCungCap, nhomNhaCungCapId);
	}

	/**
	* Returns the number of nha cung caps where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63;.
	*
	* @param tenNhaCungCap the ten nha cung cap
	* @param maNhaCungCap the ma nha cung cap
	* @param nhomNhaCungCapId the nhom nha cung cap ID
	* @return the number of matching nha cung caps
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTEN_MA_NHOM(java.lang.String tenNhaCungCap,
		java.lang.String maNhaCungCap, long nhomNhaCungCapId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByTEN_MA_NHOM(tenNhaCungCap, maNhaCungCap,
			nhomNhaCungCapId);
	}

	/**
	* Returns all the nha cung caps where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63; and hoatDong = &#63;.
	*
	* @param tenNhaCungCap the ten nha cung cap
	* @param maNhaCungCap the ma nha cung cap
	* @param nhomNhaCungCapId the nhom nha cung cap ID
	* @param hoatDong the hoat dong
	* @return the matching nha cung caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhacungcap.model.NhaCungCap> findByTEN_MA_NHOM_HD(
		java.lang.String tenNhaCungCap, java.lang.String maNhaCungCap,
		long nhomNhaCungCapId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTEN_MA_NHOM_HD(tenNhaCungCap, maNhaCungCap,
			nhomNhaCungCapId, hoatDong);
	}

	/**
	* Returns a range of all the nha cung caps where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tenNhaCungCap the ten nha cung cap
	* @param maNhaCungCap the ma nha cung cap
	* @param nhomNhaCungCapId the nhom nha cung cap ID
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of nha cung caps
	* @param end the upper bound of the range of nha cung caps (not inclusive)
	* @return the range of matching nha cung caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhacungcap.model.NhaCungCap> findByTEN_MA_NHOM_HD(
		java.lang.String tenNhaCungCap, java.lang.String maNhaCungCap,
		long nhomNhaCungCapId, boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTEN_MA_NHOM_HD(tenNhaCungCap, maNhaCungCap,
			nhomNhaCungCapId, hoatDong, start, end);
	}

	/**
	* Returns an ordered range of all the nha cung caps where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tenNhaCungCap the ten nha cung cap
	* @param maNhaCungCap the ma nha cung cap
	* @param nhomNhaCungCapId the nhom nha cung cap ID
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of nha cung caps
	* @param end the upper bound of the range of nha cung caps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching nha cung caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhacungcap.model.NhaCungCap> findByTEN_MA_NHOM_HD(
		java.lang.String tenNhaCungCap, java.lang.String maNhaCungCap,
		long nhomNhaCungCapId, boolean hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTEN_MA_NHOM_HD(tenNhaCungCap, maNhaCungCap,
			nhomNhaCungCapId, hoatDong, start, end, orderByComparator);
	}

	/**
	* Returns the first nha cung cap in the ordered set where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63; and hoatDong = &#63;.
	*
	* @param tenNhaCungCap the ten nha cung cap
	* @param maNhaCungCap the ma nha cung cap
	* @param nhomNhaCungCapId the nhom nha cung cap ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nha cung cap
	* @throws com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException if a matching nha cung cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhaCungCap findByTEN_MA_NHOM_HD_First(
		java.lang.String tenNhaCungCap, java.lang.String maNhaCungCap,
		long nhomNhaCungCapId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException {
		return getPersistence()
				   .findByTEN_MA_NHOM_HD_First(tenNhaCungCap, maNhaCungCap,
			nhomNhaCungCapId, hoatDong, orderByComparator);
	}

	/**
	* Returns the first nha cung cap in the ordered set where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63; and hoatDong = &#63;.
	*
	* @param tenNhaCungCap the ten nha cung cap
	* @param maNhaCungCap the ma nha cung cap
	* @param nhomNhaCungCapId the nhom nha cung cap ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nha cung cap, or <code>null</code> if a matching nha cung cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhaCungCap fetchByTEN_MA_NHOM_HD_First(
		java.lang.String tenNhaCungCap, java.lang.String maNhaCungCap,
		long nhomNhaCungCapId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTEN_MA_NHOM_HD_First(tenNhaCungCap, maNhaCungCap,
			nhomNhaCungCapId, hoatDong, orderByComparator);
	}

	/**
	* Returns the last nha cung cap in the ordered set where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63; and hoatDong = &#63;.
	*
	* @param tenNhaCungCap the ten nha cung cap
	* @param maNhaCungCap the ma nha cung cap
	* @param nhomNhaCungCapId the nhom nha cung cap ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nha cung cap
	* @throws com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException if a matching nha cung cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhaCungCap findByTEN_MA_NHOM_HD_Last(
		java.lang.String tenNhaCungCap, java.lang.String maNhaCungCap,
		long nhomNhaCungCapId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException {
		return getPersistence()
				   .findByTEN_MA_NHOM_HD_Last(tenNhaCungCap, maNhaCungCap,
			nhomNhaCungCapId, hoatDong, orderByComparator);
	}

	/**
	* Returns the last nha cung cap in the ordered set where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63; and hoatDong = &#63;.
	*
	* @param tenNhaCungCap the ten nha cung cap
	* @param maNhaCungCap the ma nha cung cap
	* @param nhomNhaCungCapId the nhom nha cung cap ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nha cung cap, or <code>null</code> if a matching nha cung cap could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhaCungCap fetchByTEN_MA_NHOM_HD_Last(
		java.lang.String tenNhaCungCap, java.lang.String maNhaCungCap,
		long nhomNhaCungCapId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTEN_MA_NHOM_HD_Last(tenNhaCungCap, maNhaCungCap,
			nhomNhaCungCapId, hoatDong, orderByComparator);
	}

	/**
	* Returns the nha cung caps before and after the current nha cung cap in the ordered set where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63; and hoatDong = &#63;.
	*
	* @param nhaCungCapId the primary key of the current nha cung cap
	* @param tenNhaCungCap the ten nha cung cap
	* @param maNhaCungCap the ma nha cung cap
	* @param nhomNhaCungCapId the nhom nha cung cap ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next nha cung cap
	* @throws com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException if a nha cung cap with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhaCungCap[] findByTEN_MA_NHOM_HD_PrevAndNext(
		long nhaCungCapId, java.lang.String tenNhaCungCap,
		java.lang.String maNhaCungCap, long nhomNhaCungCapId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException {
		return getPersistence()
				   .findByTEN_MA_NHOM_HD_PrevAndNext(nhaCungCapId,
			tenNhaCungCap, maNhaCungCap, nhomNhaCungCapId, hoatDong,
			orderByComparator);
	}

	/**
	* Removes all the nha cung caps where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63; and hoatDong = &#63; from the database.
	*
	* @param tenNhaCungCap the ten nha cung cap
	* @param maNhaCungCap the ma nha cung cap
	* @param nhomNhaCungCapId the nhom nha cung cap ID
	* @param hoatDong the hoat dong
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTEN_MA_NHOM_HD(java.lang.String tenNhaCungCap,
		java.lang.String maNhaCungCap, long nhomNhaCungCapId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByTEN_MA_NHOM_HD(tenNhaCungCap, maNhaCungCap,
			nhomNhaCungCapId, hoatDong);
	}

	/**
	* Returns the number of nha cung caps where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63; and hoatDong = &#63;.
	*
	* @param tenNhaCungCap the ten nha cung cap
	* @param maNhaCungCap the ma nha cung cap
	* @param nhomNhaCungCapId the nhom nha cung cap ID
	* @param hoatDong the hoat dong
	* @return the number of matching nha cung caps
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTEN_MA_NHOM_HD(java.lang.String tenNhaCungCap,
		java.lang.String maNhaCungCap, long nhomNhaCungCapId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByTEN_MA_NHOM_HD(tenNhaCungCap, maNhaCungCap,
			nhomNhaCungCapId, hoatDong);
	}

	/**
	* Caches the nha cung cap in the entity cache if it is enabled.
	*
	* @param nhaCungCap the nha cung cap
	*/
	public static void cacheResult(
		com.minimart.portlet.nhacungcap.model.NhaCungCap nhaCungCap) {
		getPersistence().cacheResult(nhaCungCap);
	}

	/**
	* Caches the nha cung caps in the entity cache if it is enabled.
	*
	* @param nhaCungCaps the nha cung caps
	*/
	public static void cacheResult(
		java.util.List<com.minimart.portlet.nhacungcap.model.NhaCungCap> nhaCungCaps) {
		getPersistence().cacheResult(nhaCungCaps);
	}

	/**
	* Creates a new nha cung cap with the primary key. Does not add the nha cung cap to the database.
	*
	* @param nhaCungCapId the primary key for the new nha cung cap
	* @return the new nha cung cap
	*/
	public static com.minimart.portlet.nhacungcap.model.NhaCungCap create(
		long nhaCungCapId) {
		return getPersistence().create(nhaCungCapId);
	}

	/**
	* Removes the nha cung cap with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param nhaCungCapId the primary key of the nha cung cap
	* @return the nha cung cap that was removed
	* @throws com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException if a nha cung cap with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhaCungCap remove(
		long nhaCungCapId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException {
		return getPersistence().remove(nhaCungCapId);
	}

	public static com.minimart.portlet.nhacungcap.model.NhaCungCap updateImpl(
		com.minimart.portlet.nhacungcap.model.NhaCungCap nhaCungCap)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(nhaCungCap);
	}

	/**
	* Returns the nha cung cap with the primary key or throws a {@link com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException} if it could not be found.
	*
	* @param nhaCungCapId the primary key of the nha cung cap
	* @return the nha cung cap
	* @throws com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException if a nha cung cap with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhaCungCap findByPrimaryKey(
		long nhaCungCapId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException {
		return getPersistence().findByPrimaryKey(nhaCungCapId);
	}

	/**
	* Returns the nha cung cap with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param nhaCungCapId the primary key of the nha cung cap
	* @return the nha cung cap, or <code>null</code> if a nha cung cap with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhaCungCap fetchByPrimaryKey(
		long nhaCungCapId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(nhaCungCapId);
	}

	/**
	* Returns all the nha cung caps.
	*
	* @return the nha cung caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhacungcap.model.NhaCungCap> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the nha cung caps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nha cung caps
	* @param end the upper bound of the range of nha cung caps (not inclusive)
	* @return the range of nha cung caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhacungcap.model.NhaCungCap> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the nha cung caps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nha cung caps
	* @param end the upper bound of the range of nha cung caps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of nha cung caps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhacungcap.model.NhaCungCap> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the nha cung caps from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of nha cung caps.
	*
	* @return the number of nha cung caps
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static NhaCungCapPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (NhaCungCapPersistence)PortletBeanLocatorUtil.locate(com.minimart.portlet.nhacungcap.service.ClpSerializer.getServletContextName(),
					NhaCungCapPersistence.class.getName());

			ReferenceRegistry.registerReference(NhaCungCapUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(NhaCungCapPersistence persistence) {
	}

	private static NhaCungCapPersistence _persistence;
}