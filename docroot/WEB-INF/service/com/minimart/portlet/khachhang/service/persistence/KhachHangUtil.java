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

package com.minimart.portlet.khachhang.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.minimart.portlet.khachhang.model.KhachHang;

import java.util.List;

/**
 * The persistence utility for the khach hang service. This utility wraps {@link KhachHangPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see KhachHangPersistence
 * @see KhachHangPersistenceImpl
 * @generated
 */
public class KhachHangUtil {
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
	public static void clearCache(KhachHang khachHang) {
		getPersistence().clearCache(khachHang);
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
	public static List<KhachHang> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<KhachHang> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<KhachHang> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static KhachHang update(KhachHang khachHang)
		throws SystemException {
		return getPersistence().update(khachHang);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static KhachHang update(KhachHang khachHang,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(khachHang, serviceContext);
	}

	/**
	* Returns all the khach hangs where ten = &#63; and ma = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @return the matching khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.khachhang.model.KhachHang> findByTEN_MA(
		java.lang.String ten, java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTEN_MA(ten, ma);
	}

	/**
	* Returns a range of all the khach hangs where ten = &#63; and ma = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.KhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param ma the ma
	* @param start the lower bound of the range of khach hangs
	* @param end the upper bound of the range of khach hangs (not inclusive)
	* @return the range of matching khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.khachhang.model.KhachHang> findByTEN_MA(
		java.lang.String ten, java.lang.String ma, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTEN_MA(ten, ma, start, end);
	}

	/**
	* Returns an ordered range of all the khach hangs where ten = &#63; and ma = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.KhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param ma the ma
	* @param start the lower bound of the range of khach hangs
	* @param end the upper bound of the range of khach hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.khachhang.model.KhachHang> findByTEN_MA(
		java.lang.String ten, java.lang.String ma, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTEN_MA(ten, ma, start, end, orderByComparator);
	}

	/**
	* Returns the first khach hang in the ordered set where ten = &#63; and ma = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching khach hang
	* @throws com.minimart.portlet.khachhang.NoSuchKhachHangException if a matching khach hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.khachhang.model.KhachHang findByTEN_MA_First(
		java.lang.String ten, java.lang.String ma,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khachhang.NoSuchKhachHangException {
		return getPersistence().findByTEN_MA_First(ten, ma, orderByComparator);
	}

	/**
	* Returns the first khach hang in the ordered set where ten = &#63; and ma = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching khach hang, or <code>null</code> if a matching khach hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.khachhang.model.KhachHang fetchByTEN_MA_First(
		java.lang.String ten, java.lang.String ma,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTEN_MA_First(ten, ma, orderByComparator);
	}

	/**
	* Returns the last khach hang in the ordered set where ten = &#63; and ma = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching khach hang
	* @throws com.minimart.portlet.khachhang.NoSuchKhachHangException if a matching khach hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.khachhang.model.KhachHang findByTEN_MA_Last(
		java.lang.String ten, java.lang.String ma,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khachhang.NoSuchKhachHangException {
		return getPersistence().findByTEN_MA_Last(ten, ma, orderByComparator);
	}

	/**
	* Returns the last khach hang in the ordered set where ten = &#63; and ma = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching khach hang, or <code>null</code> if a matching khach hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.khachhang.model.KhachHang fetchByTEN_MA_Last(
		java.lang.String ten, java.lang.String ma,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTEN_MA_Last(ten, ma, orderByComparator);
	}

	/**
	* Returns the khach hangs before and after the current khach hang in the ordered set where ten = &#63; and ma = &#63;.
	*
	* @param khachHangId the primary key of the current khach hang
	* @param ten the ten
	* @param ma the ma
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next khach hang
	* @throws com.minimart.portlet.khachhang.NoSuchKhachHangException if a khach hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.khachhang.model.KhachHang[] findByTEN_MA_PrevAndNext(
		long khachHangId, java.lang.String ten, java.lang.String ma,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khachhang.NoSuchKhachHangException {
		return getPersistence()
				   .findByTEN_MA_PrevAndNext(khachHangId, ten, ma,
			orderByComparator);
	}

	/**
	* Removes all the khach hangs where ten = &#63; and ma = &#63; from the database.
	*
	* @param ten the ten
	* @param ma the ma
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTEN_MA(java.lang.String ten, java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTEN_MA(ten, ma);
	}

	/**
	* Returns the number of khach hangs where ten = &#63; and ma = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @return the number of matching khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTEN_MA(java.lang.String ten, java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTEN_MA(ten, ma);
	}

	/**
	* Returns all the khach hangs where ten = &#63; and ma = &#63; and nhomKhachHangId = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param nhomKhachHangId the nhom khach hang ID
	* @param hoatDong the hoat dong
	* @return the matching khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.khachhang.model.KhachHang> findByTEN_MA_NHOM_HD(
		java.lang.String ten, java.lang.String ma, long nhomKhachHangId,
		boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTEN_MA_NHOM_HD(ten, ma, nhomKhachHangId, hoatDong);
	}

	/**
	* Returns a range of all the khach hangs where ten = &#63; and ma = &#63; and nhomKhachHangId = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.KhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param ma the ma
	* @param nhomKhachHangId the nhom khach hang ID
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of khach hangs
	* @param end the upper bound of the range of khach hangs (not inclusive)
	* @return the range of matching khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.khachhang.model.KhachHang> findByTEN_MA_NHOM_HD(
		java.lang.String ten, java.lang.String ma, long nhomKhachHangId,
		boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTEN_MA_NHOM_HD(ten, ma, nhomKhachHangId, hoatDong,
			start, end);
	}

	/**
	* Returns an ordered range of all the khach hangs where ten = &#63; and ma = &#63; and nhomKhachHangId = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.KhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param ma the ma
	* @param nhomKhachHangId the nhom khach hang ID
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of khach hangs
	* @param end the upper bound of the range of khach hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.khachhang.model.KhachHang> findByTEN_MA_NHOM_HD(
		java.lang.String ten, java.lang.String ma, long nhomKhachHangId,
		boolean hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTEN_MA_NHOM_HD(ten, ma, nhomKhachHangId, hoatDong,
			start, end, orderByComparator);
	}

	/**
	* Returns the first khach hang in the ordered set where ten = &#63; and ma = &#63; and nhomKhachHangId = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param nhomKhachHangId the nhom khach hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching khach hang
	* @throws com.minimart.portlet.khachhang.NoSuchKhachHangException if a matching khach hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.khachhang.model.KhachHang findByTEN_MA_NHOM_HD_First(
		java.lang.String ten, java.lang.String ma, long nhomKhachHangId,
		boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khachhang.NoSuchKhachHangException {
		return getPersistence()
				   .findByTEN_MA_NHOM_HD_First(ten, ma, nhomKhachHangId,
			hoatDong, orderByComparator);
	}

	/**
	* Returns the first khach hang in the ordered set where ten = &#63; and ma = &#63; and nhomKhachHangId = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param nhomKhachHangId the nhom khach hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching khach hang, or <code>null</code> if a matching khach hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.khachhang.model.KhachHang fetchByTEN_MA_NHOM_HD_First(
		java.lang.String ten, java.lang.String ma, long nhomKhachHangId,
		boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTEN_MA_NHOM_HD_First(ten, ma, nhomKhachHangId,
			hoatDong, orderByComparator);
	}

	/**
	* Returns the last khach hang in the ordered set where ten = &#63; and ma = &#63; and nhomKhachHangId = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param nhomKhachHangId the nhom khach hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching khach hang
	* @throws com.minimart.portlet.khachhang.NoSuchKhachHangException if a matching khach hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.khachhang.model.KhachHang findByTEN_MA_NHOM_HD_Last(
		java.lang.String ten, java.lang.String ma, long nhomKhachHangId,
		boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khachhang.NoSuchKhachHangException {
		return getPersistence()
				   .findByTEN_MA_NHOM_HD_Last(ten, ma, nhomKhachHangId,
			hoatDong, orderByComparator);
	}

	/**
	* Returns the last khach hang in the ordered set where ten = &#63; and ma = &#63; and nhomKhachHangId = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param nhomKhachHangId the nhom khach hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching khach hang, or <code>null</code> if a matching khach hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.khachhang.model.KhachHang fetchByTEN_MA_NHOM_HD_Last(
		java.lang.String ten, java.lang.String ma, long nhomKhachHangId,
		boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTEN_MA_NHOM_HD_Last(ten, ma, nhomKhachHangId,
			hoatDong, orderByComparator);
	}

	/**
	* Returns the khach hangs before and after the current khach hang in the ordered set where ten = &#63; and ma = &#63; and nhomKhachHangId = &#63; and hoatDong = &#63;.
	*
	* @param khachHangId the primary key of the current khach hang
	* @param ten the ten
	* @param ma the ma
	* @param nhomKhachHangId the nhom khach hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next khach hang
	* @throws com.minimart.portlet.khachhang.NoSuchKhachHangException if a khach hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.khachhang.model.KhachHang[] findByTEN_MA_NHOM_HD_PrevAndNext(
		long khachHangId, java.lang.String ten, java.lang.String ma,
		long nhomKhachHangId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khachhang.NoSuchKhachHangException {
		return getPersistence()
				   .findByTEN_MA_NHOM_HD_PrevAndNext(khachHangId, ten, ma,
			nhomKhachHangId, hoatDong, orderByComparator);
	}

	/**
	* Removes all the khach hangs where ten = &#63; and ma = &#63; and nhomKhachHangId = &#63; and hoatDong = &#63; from the database.
	*
	* @param ten the ten
	* @param ma the ma
	* @param nhomKhachHangId the nhom khach hang ID
	* @param hoatDong the hoat dong
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTEN_MA_NHOM_HD(java.lang.String ten,
		java.lang.String ma, long nhomKhachHangId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByTEN_MA_NHOM_HD(ten, ma, nhomKhachHangId, hoatDong);
	}

	/**
	* Returns the number of khach hangs where ten = &#63; and ma = &#63; and nhomKhachHangId = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param nhomKhachHangId the nhom khach hang ID
	* @param hoatDong the hoat dong
	* @return the number of matching khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTEN_MA_NHOM_HD(java.lang.String ten,
		java.lang.String ma, long nhomKhachHangId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByTEN_MA_NHOM_HD(ten, ma, nhomKhachHangId, hoatDong);
	}

	/**
	* Caches the khach hang in the entity cache if it is enabled.
	*
	* @param khachHang the khach hang
	*/
	public static void cacheResult(
		com.minimart.portlet.khachhang.model.KhachHang khachHang) {
		getPersistence().cacheResult(khachHang);
	}

	/**
	* Caches the khach hangs in the entity cache if it is enabled.
	*
	* @param khachHangs the khach hangs
	*/
	public static void cacheResult(
		java.util.List<com.minimart.portlet.khachhang.model.KhachHang> khachHangs) {
		getPersistence().cacheResult(khachHangs);
	}

	/**
	* Creates a new khach hang with the primary key. Does not add the khach hang to the database.
	*
	* @param khachHangId the primary key for the new khach hang
	* @return the new khach hang
	*/
	public static com.minimart.portlet.khachhang.model.KhachHang create(
		long khachHangId) {
		return getPersistence().create(khachHangId);
	}

	/**
	* Removes the khach hang with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param khachHangId the primary key of the khach hang
	* @return the khach hang that was removed
	* @throws com.minimart.portlet.khachhang.NoSuchKhachHangException if a khach hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.khachhang.model.KhachHang remove(
		long khachHangId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khachhang.NoSuchKhachHangException {
		return getPersistence().remove(khachHangId);
	}

	public static com.minimart.portlet.khachhang.model.KhachHang updateImpl(
		com.minimart.portlet.khachhang.model.KhachHang khachHang)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(khachHang);
	}

	/**
	* Returns the khach hang with the primary key or throws a {@link com.minimart.portlet.khachhang.NoSuchKhachHangException} if it could not be found.
	*
	* @param khachHangId the primary key of the khach hang
	* @return the khach hang
	* @throws com.minimart.portlet.khachhang.NoSuchKhachHangException if a khach hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.khachhang.model.KhachHang findByPrimaryKey(
		long khachHangId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khachhang.NoSuchKhachHangException {
		return getPersistence().findByPrimaryKey(khachHangId);
	}

	/**
	* Returns the khach hang with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param khachHangId the primary key of the khach hang
	* @return the khach hang, or <code>null</code> if a khach hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.khachhang.model.KhachHang fetchByPrimaryKey(
		long khachHangId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(khachHangId);
	}

	/**
	* Returns all the khach hangs.
	*
	* @return the khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.khachhang.model.KhachHang> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the khach hangs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.KhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of khach hangs
	* @param end the upper bound of the range of khach hangs (not inclusive)
	* @return the range of khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.khachhang.model.KhachHang> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the khach hangs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.KhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of khach hangs
	* @param end the upper bound of the range of khach hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.khachhang.model.KhachHang> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the khach hangs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of khach hangs.
	*
	* @return the number of khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static KhachHangPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (KhachHangPersistence)PortletBeanLocatorUtil.locate(com.minimart.portlet.khachhang.service.ClpSerializer.getServletContextName(),
					KhachHangPersistence.class.getName());

			ReferenceRegistry.registerReference(KhachHangUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(KhachHangPersistence persistence) {
	}

	private static KhachHangPersistence _persistence;
}