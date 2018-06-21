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

import com.minimart.portlet.mathang.model.NhomMatHang;

import java.util.List;

/**
 * The persistence utility for the nhom mat hang service. This utility wraps {@link NhomMatHangPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see NhomMatHangPersistence
 * @see NhomMatHangPersistenceImpl
 * @generated
 */
public class NhomMatHangUtil {
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
	public static void clearCache(NhomMatHang nhomMatHang) {
		getPersistence().clearCache(nhomMatHang);
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
	public static List<NhomMatHang> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NhomMatHang> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NhomMatHang> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static NhomMatHang update(NhomMatHang nhomMatHang)
		throws SystemException {
		return getPersistence().update(nhomMatHang);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static NhomMatHang update(NhomMatHang nhomMatHang,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(nhomMatHang, serviceContext);
	}

	/**
	* Returns all the nhom mat hangs where name = &#63;.
	*
	* @param name the name
	* @return the matching nhom mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.mathang.model.NhomMatHang> findByName(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByName(name);
	}

	/**
	* Returns a range of all the nhom mat hangs where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.NhomMatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of nhom mat hangs
	* @param end the upper bound of the range of nhom mat hangs (not inclusive)
	* @return the range of matching nhom mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.mathang.model.NhomMatHang> findByName(
		java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByName(name, start, end);
	}

	/**
	* Returns an ordered range of all the nhom mat hangs where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.NhomMatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of nhom mat hangs
	* @param end the upper bound of the range of nhom mat hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching nhom mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.mathang.model.NhomMatHang> findByName(
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByName(name, start, end, orderByComparator);
	}

	/**
	* Returns the first nhom mat hang in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhom mat hang
	* @throws com.minimart.portlet.mathang.NoSuchNhomMatHangException if a matching nhom mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.NhomMatHang findByName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchNhomMatHangException {
		return getPersistence().findByName_First(name, orderByComparator);
	}

	/**
	* Returns the first nhom mat hang in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhom mat hang, or <code>null</code> if a matching nhom mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.NhomMatHang fetchByName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByName_First(name, orderByComparator);
	}

	/**
	* Returns the last nhom mat hang in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhom mat hang
	* @throws com.minimart.portlet.mathang.NoSuchNhomMatHangException if a matching nhom mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.NhomMatHang findByName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchNhomMatHangException {
		return getPersistence().findByName_Last(name, orderByComparator);
	}

	/**
	* Returns the last nhom mat hang in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhom mat hang, or <code>null</code> if a matching nhom mat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.NhomMatHang fetchByName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByName_Last(name, orderByComparator);
	}

	/**
	* Returns the nhom mat hangs before and after the current nhom mat hang in the ordered set where name = &#63;.
	*
	* @param nhomMatHangId the primary key of the current nhom mat hang
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next nhom mat hang
	* @throws com.minimart.portlet.mathang.NoSuchNhomMatHangException if a nhom mat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.NhomMatHang[] findByName_PrevAndNext(
		long nhomMatHangId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchNhomMatHangException {
		return getPersistence()
				   .findByName_PrevAndNext(nhomMatHangId, name,
			orderByComparator);
	}

	/**
	* Removes all the nhom mat hangs where name = &#63; from the database.
	*
	* @param name the name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByName(java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByName(name);
	}

	/**
	* Returns the number of nhom mat hangs where name = &#63;.
	*
	* @param name the name
	* @return the number of matching nhom mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByName(java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByName(name);
	}

	/**
	* Caches the nhom mat hang in the entity cache if it is enabled.
	*
	* @param nhomMatHang the nhom mat hang
	*/
	public static void cacheResult(
		com.minimart.portlet.mathang.model.NhomMatHang nhomMatHang) {
		getPersistence().cacheResult(nhomMatHang);
	}

	/**
	* Caches the nhom mat hangs in the entity cache if it is enabled.
	*
	* @param nhomMatHangs the nhom mat hangs
	*/
	public static void cacheResult(
		java.util.List<com.minimart.portlet.mathang.model.NhomMatHang> nhomMatHangs) {
		getPersistence().cacheResult(nhomMatHangs);
	}

	/**
	* Creates a new nhom mat hang with the primary key. Does not add the nhom mat hang to the database.
	*
	* @param nhomMatHangId the primary key for the new nhom mat hang
	* @return the new nhom mat hang
	*/
	public static com.minimart.portlet.mathang.model.NhomMatHang create(
		long nhomMatHangId) {
		return getPersistence().create(nhomMatHangId);
	}

	/**
	* Removes the nhom mat hang with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param nhomMatHangId the primary key of the nhom mat hang
	* @return the nhom mat hang that was removed
	* @throws com.minimart.portlet.mathang.NoSuchNhomMatHangException if a nhom mat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.NhomMatHang remove(
		long nhomMatHangId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchNhomMatHangException {
		return getPersistence().remove(nhomMatHangId);
	}

	public static com.minimart.portlet.mathang.model.NhomMatHang updateImpl(
		com.minimart.portlet.mathang.model.NhomMatHang nhomMatHang)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(nhomMatHang);
	}

	/**
	* Returns the nhom mat hang with the primary key or throws a {@link com.minimart.portlet.mathang.NoSuchNhomMatHangException} if it could not be found.
	*
	* @param nhomMatHangId the primary key of the nhom mat hang
	* @return the nhom mat hang
	* @throws com.minimart.portlet.mathang.NoSuchNhomMatHangException if a nhom mat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.NhomMatHang findByPrimaryKey(
		long nhomMatHangId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchNhomMatHangException {
		return getPersistence().findByPrimaryKey(nhomMatHangId);
	}

	/**
	* Returns the nhom mat hang with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param nhomMatHangId the primary key of the nhom mat hang
	* @return the nhom mat hang, or <code>null</code> if a nhom mat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.NhomMatHang fetchByPrimaryKey(
		long nhomMatHangId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(nhomMatHangId);
	}

	/**
	* Returns all the nhom mat hangs.
	*
	* @return the nhom mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.mathang.model.NhomMatHang> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the nhom mat hangs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.NhomMatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nhom mat hangs
	* @param end the upper bound of the range of nhom mat hangs (not inclusive)
	* @return the range of nhom mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.mathang.model.NhomMatHang> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the nhom mat hangs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.NhomMatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nhom mat hangs
	* @param end the upper bound of the range of nhom mat hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of nhom mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.mathang.model.NhomMatHang> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the nhom mat hangs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of nhom mat hangs.
	*
	* @return the number of nhom mat hangs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static NhomMatHangPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (NhomMatHangPersistence)PortletBeanLocatorUtil.locate(com.minimart.portlet.mathang.service.ClpSerializer.getServletContextName(),
					NhomMatHangPersistence.class.getName());

			ReferenceRegistry.registerReference(NhomMatHangUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(NhomMatHangPersistence persistence) {
	}

	private static NhomMatHangPersistence _persistence;
}