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

package com.minimart.portlet.ketoan.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.minimart.portlet.ketoan.model.BangLuong;

import java.util.List;

/**
 * The persistence utility for the bang luong service. This utility wraps {@link BangLuongPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see BangLuongPersistence
 * @see BangLuongPersistenceImpl
 * @generated
 */
public class BangLuongUtil {
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
	public static void clearCache(BangLuong bangLuong) {
		getPersistence().clearCache(bangLuong);
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
	public static List<BangLuong> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BangLuong> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BangLuong> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static BangLuong update(BangLuong bangLuong)
		throws SystemException {
		return getPersistence().update(bangLuong);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static BangLuong update(BangLuong bangLuong,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(bangLuong, serviceContext);
	}

	/**
	* Returns all the bang luongs where ten = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param trangThai the trang thai
	* @return the matching bang luongs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.ketoan.model.BangLuong> findByTEN_TT(
		java.lang.String ten, boolean trangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTEN_TT(ten, trangThai);
	}

	/**
	* Returns a range of all the bang luongs where ten = &#63; and trangThai = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.ketoan.model.impl.BangLuongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param trangThai the trang thai
	* @param start the lower bound of the range of bang luongs
	* @param end the upper bound of the range of bang luongs (not inclusive)
	* @return the range of matching bang luongs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.ketoan.model.BangLuong> findByTEN_TT(
		java.lang.String ten, boolean trangThai, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTEN_TT(ten, trangThai, start, end);
	}

	/**
	* Returns an ordered range of all the bang luongs where ten = &#63; and trangThai = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.ketoan.model.impl.BangLuongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param trangThai the trang thai
	* @param start the lower bound of the range of bang luongs
	* @param end the upper bound of the range of bang luongs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bang luongs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.ketoan.model.BangLuong> findByTEN_TT(
		java.lang.String ten, boolean trangThai, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTEN_TT(ten, trangThai, start, end, orderByComparator);
	}

	/**
	* Returns the first bang luong in the ordered set where ten = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bang luong
	* @throws com.minimart.portlet.ketoan.NoSuchBangLuongException if a matching bang luong could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.ketoan.model.BangLuong findByTEN_TT_First(
		java.lang.String ten, boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.ketoan.NoSuchBangLuongException {
		return getPersistence()
				   .findByTEN_TT_First(ten, trangThai, orderByComparator);
	}

	/**
	* Returns the first bang luong in the ordered set where ten = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bang luong, or <code>null</code> if a matching bang luong could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.ketoan.model.BangLuong fetchByTEN_TT_First(
		java.lang.String ten, boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTEN_TT_First(ten, trangThai, orderByComparator);
	}

	/**
	* Returns the last bang luong in the ordered set where ten = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bang luong
	* @throws com.minimart.portlet.ketoan.NoSuchBangLuongException if a matching bang luong could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.ketoan.model.BangLuong findByTEN_TT_Last(
		java.lang.String ten, boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.ketoan.NoSuchBangLuongException {
		return getPersistence()
				   .findByTEN_TT_Last(ten, trangThai, orderByComparator);
	}

	/**
	* Returns the last bang luong in the ordered set where ten = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bang luong, or <code>null</code> if a matching bang luong could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.ketoan.model.BangLuong fetchByTEN_TT_Last(
		java.lang.String ten, boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTEN_TT_Last(ten, trangThai, orderByComparator);
	}

	/**
	* Returns the bang luongs before and after the current bang luong in the ordered set where ten = &#63; and trangThai = &#63;.
	*
	* @param banLuongId the primary key of the current bang luong
	* @param ten the ten
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bang luong
	* @throws com.minimart.portlet.ketoan.NoSuchBangLuongException if a bang luong with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.ketoan.model.BangLuong[] findByTEN_TT_PrevAndNext(
		long banLuongId, java.lang.String ten, boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.ketoan.NoSuchBangLuongException {
		return getPersistence()
				   .findByTEN_TT_PrevAndNext(banLuongId, ten, trangThai,
			orderByComparator);
	}

	/**
	* Removes all the bang luongs where ten = &#63; and trangThai = &#63; from the database.
	*
	* @param ten the ten
	* @param trangThai the trang thai
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTEN_TT(java.lang.String ten, boolean trangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTEN_TT(ten, trangThai);
	}

	/**
	* Returns the number of bang luongs where ten = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param trangThai the trang thai
	* @return the number of matching bang luongs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTEN_TT(java.lang.String ten, boolean trangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTEN_TT(ten, trangThai);
	}

	/**
	* Caches the bang luong in the entity cache if it is enabled.
	*
	* @param bangLuong the bang luong
	*/
	public static void cacheResult(
		com.minimart.portlet.ketoan.model.BangLuong bangLuong) {
		getPersistence().cacheResult(bangLuong);
	}

	/**
	* Caches the bang luongs in the entity cache if it is enabled.
	*
	* @param bangLuongs the bang luongs
	*/
	public static void cacheResult(
		java.util.List<com.minimart.portlet.ketoan.model.BangLuong> bangLuongs) {
		getPersistence().cacheResult(bangLuongs);
	}

	/**
	* Creates a new bang luong with the primary key. Does not add the bang luong to the database.
	*
	* @param banLuongId the primary key for the new bang luong
	* @return the new bang luong
	*/
	public static com.minimart.portlet.ketoan.model.BangLuong create(
		long banLuongId) {
		return getPersistence().create(banLuongId);
	}

	/**
	* Removes the bang luong with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param banLuongId the primary key of the bang luong
	* @return the bang luong that was removed
	* @throws com.minimart.portlet.ketoan.NoSuchBangLuongException if a bang luong with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.ketoan.model.BangLuong remove(
		long banLuongId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.ketoan.NoSuchBangLuongException {
		return getPersistence().remove(banLuongId);
	}

	public static com.minimart.portlet.ketoan.model.BangLuong updateImpl(
		com.minimart.portlet.ketoan.model.BangLuong bangLuong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(bangLuong);
	}

	/**
	* Returns the bang luong with the primary key or throws a {@link com.minimart.portlet.ketoan.NoSuchBangLuongException} if it could not be found.
	*
	* @param banLuongId the primary key of the bang luong
	* @return the bang luong
	* @throws com.minimart.portlet.ketoan.NoSuchBangLuongException if a bang luong with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.ketoan.model.BangLuong findByPrimaryKey(
		long banLuongId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.ketoan.NoSuchBangLuongException {
		return getPersistence().findByPrimaryKey(banLuongId);
	}

	/**
	* Returns the bang luong with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param banLuongId the primary key of the bang luong
	* @return the bang luong, or <code>null</code> if a bang luong with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.ketoan.model.BangLuong fetchByPrimaryKey(
		long banLuongId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(banLuongId);
	}

	/**
	* Returns all the bang luongs.
	*
	* @return the bang luongs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.ketoan.model.BangLuong> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the bang luongs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.ketoan.model.impl.BangLuongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bang luongs
	* @param end the upper bound of the range of bang luongs (not inclusive)
	* @return the range of bang luongs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.ketoan.model.BangLuong> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the bang luongs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.ketoan.model.impl.BangLuongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bang luongs
	* @param end the upper bound of the range of bang luongs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of bang luongs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.ketoan.model.BangLuong> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the bang luongs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of bang luongs.
	*
	* @return the number of bang luongs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static BangLuongPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (BangLuongPersistence)PortletBeanLocatorUtil.locate(com.minimart.portlet.ketoan.service.ClpSerializer.getServletContextName(),
					BangLuongPersistence.class.getName());

			ReferenceRegistry.registerReference(BangLuongUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(BangLuongPersistence persistence) {
	}

	private static BangLuongPersistence _persistence;
}