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

package com.minimart.portlet.danhmucchung.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.minimart.portlet.danhmucchung.model.Duong;

import java.util.List;

/**
 * The persistence utility for the duong service. This utility wraps {@link DuongPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see DuongPersistence
 * @see DuongPersistenceImpl
 * @generated
 */
public class DuongUtil {
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
	public static void clearCache(Duong duong) {
		getPersistence().clearCache(duong);
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
	public static List<Duong> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Duong> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Duong> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Duong update(Duong duong) throws SystemException {
		return getPersistence().update(duong);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Duong update(Duong duong, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(duong, serviceContext);
	}

	/**
	* Returns the duong where ten = &#63; or throws a {@link com.minimart.portlet.danhmucchung.NoSuchDuongException} if it could not be found.
	*
	* @param ten the ten
	* @return the matching duong
	* @throws com.minimart.portlet.danhmucchung.NoSuchDuongException if a matching duong could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.danhmucchung.model.Duong findByTEN(
		java.lang.String ten)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.danhmucchung.NoSuchDuongException {
		return getPersistence().findByTEN(ten);
	}

	/**
	* Returns the duong where ten = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param ten the ten
	* @return the matching duong, or <code>null</code> if a matching duong could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.danhmucchung.model.Duong fetchByTEN(
		java.lang.String ten)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTEN(ten);
	}

	/**
	* Returns the duong where ten = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param ten the ten
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching duong, or <code>null</code> if a matching duong could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.danhmucchung.model.Duong fetchByTEN(
		java.lang.String ten, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTEN(ten, retrieveFromCache);
	}

	/**
	* Removes the duong where ten = &#63; from the database.
	*
	* @param ten the ten
	* @return the duong that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.danhmucchung.model.Duong removeByTEN(
		java.lang.String ten)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.danhmucchung.NoSuchDuongException {
		return getPersistence().removeByTEN(ten);
	}

	/**
	* Returns the number of duongs where ten = &#63;.
	*
	* @param ten the ten
	* @return the number of matching duongs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTEN(java.lang.String ten)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTEN(ten);
	}

	/**
	* Returns the duong where ma = &#63; or throws a {@link com.minimart.portlet.danhmucchung.NoSuchDuongException} if it could not be found.
	*
	* @param ma the ma
	* @return the matching duong
	* @throws com.minimart.portlet.danhmucchung.NoSuchDuongException if a matching duong could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.danhmucchung.model.Duong findByMA(
		java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.danhmucchung.NoSuchDuongException {
		return getPersistence().findByMA(ma);
	}

	/**
	* Returns the duong where ma = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param ma the ma
	* @return the matching duong, or <code>null</code> if a matching duong could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.danhmucchung.model.Duong fetchByMA(
		java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByMA(ma);
	}

	/**
	* Returns the duong where ma = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param ma the ma
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching duong, or <code>null</code> if a matching duong could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.danhmucchung.model.Duong fetchByMA(
		java.lang.String ma, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByMA(ma, retrieveFromCache);
	}

	/**
	* Removes the duong where ma = &#63; from the database.
	*
	* @param ma the ma
	* @return the duong that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.danhmucchung.model.Duong removeByMA(
		java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.danhmucchung.NoSuchDuongException {
		return getPersistence().removeByMA(ma);
	}

	/**
	* Returns the number of duongs where ma = &#63;.
	*
	* @param ma the ma
	* @return the number of matching duongs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMA(java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByMA(ma);
	}

	/**
	* Returns all the duongs where ten = &#63; and ma = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param trangThai the trang thai
	* @return the matching duongs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.danhmucchung.model.Duong> findByTEN_MA_TT(
		java.lang.String ten, java.lang.String ma, boolean trangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTEN_MA_TT(ten, ma, trangThai);
	}

	/**
	* Returns a range of all the duongs where ten = &#63; and ma = &#63; and trangThai = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.DuongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param ma the ma
	* @param trangThai the trang thai
	* @param start the lower bound of the range of duongs
	* @param end the upper bound of the range of duongs (not inclusive)
	* @return the range of matching duongs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.danhmucchung.model.Duong> findByTEN_MA_TT(
		java.lang.String ten, java.lang.String ma, boolean trangThai,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTEN_MA_TT(ten, ma, trangThai, start, end);
	}

	/**
	* Returns an ordered range of all the duongs where ten = &#63; and ma = &#63; and trangThai = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.DuongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param ma the ma
	* @param trangThai the trang thai
	* @param start the lower bound of the range of duongs
	* @param end the upper bound of the range of duongs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching duongs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.danhmucchung.model.Duong> findByTEN_MA_TT(
		java.lang.String ten, java.lang.String ma, boolean trangThai,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTEN_MA_TT(ten, ma, trangThai, start, end,
			orderByComparator);
	}

	/**
	* Returns the first duong in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching duong
	* @throws com.minimart.portlet.danhmucchung.NoSuchDuongException if a matching duong could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.danhmucchung.model.Duong findByTEN_MA_TT_First(
		java.lang.String ten, java.lang.String ma, boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.danhmucchung.NoSuchDuongException {
		return getPersistence()
				   .findByTEN_MA_TT_First(ten, ma, trangThai, orderByComparator);
	}

	/**
	* Returns the first duong in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching duong, or <code>null</code> if a matching duong could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.danhmucchung.model.Duong fetchByTEN_MA_TT_First(
		java.lang.String ten, java.lang.String ma, boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTEN_MA_TT_First(ten, ma, trangThai, orderByComparator);
	}

	/**
	* Returns the last duong in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching duong
	* @throws com.minimart.portlet.danhmucchung.NoSuchDuongException if a matching duong could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.danhmucchung.model.Duong findByTEN_MA_TT_Last(
		java.lang.String ten, java.lang.String ma, boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.danhmucchung.NoSuchDuongException {
		return getPersistence()
				   .findByTEN_MA_TT_Last(ten, ma, trangThai, orderByComparator);
	}

	/**
	* Returns the last duong in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching duong, or <code>null</code> if a matching duong could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.danhmucchung.model.Duong fetchByTEN_MA_TT_Last(
		java.lang.String ten, java.lang.String ma, boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTEN_MA_TT_Last(ten, ma, trangThai, orderByComparator);
	}

	/**
	* Returns the duongs before and after the current duong in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	*
	* @param duongId the primary key of the current duong
	* @param ten the ten
	* @param ma the ma
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next duong
	* @throws com.minimart.portlet.danhmucchung.NoSuchDuongException if a duong with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.danhmucchung.model.Duong[] findByTEN_MA_TT_PrevAndNext(
		long duongId, java.lang.String ten, java.lang.String ma,
		boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.danhmucchung.NoSuchDuongException {
		return getPersistence()
				   .findByTEN_MA_TT_PrevAndNext(duongId, ten, ma, trangThai,
			orderByComparator);
	}

	/**
	* Removes all the duongs where ten = &#63; and ma = &#63; and trangThai = &#63; from the database.
	*
	* @param ten the ten
	* @param ma the ma
	* @param trangThai the trang thai
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTEN_MA_TT(java.lang.String ten,
		java.lang.String ma, boolean trangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTEN_MA_TT(ten, ma, trangThai);
	}

	/**
	* Returns the number of duongs where ten = &#63; and ma = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param trangThai the trang thai
	* @return the number of matching duongs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTEN_MA_TT(java.lang.String ten,
		java.lang.String ma, boolean trangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTEN_MA_TT(ten, ma, trangThai);
	}

	/**
	* Caches the duong in the entity cache if it is enabled.
	*
	* @param duong the duong
	*/
	public static void cacheResult(
		com.minimart.portlet.danhmucchung.model.Duong duong) {
		getPersistence().cacheResult(duong);
	}

	/**
	* Caches the duongs in the entity cache if it is enabled.
	*
	* @param duongs the duongs
	*/
	public static void cacheResult(
		java.util.List<com.minimart.portlet.danhmucchung.model.Duong> duongs) {
		getPersistence().cacheResult(duongs);
	}

	/**
	* Creates a new duong with the primary key. Does not add the duong to the database.
	*
	* @param duongId the primary key for the new duong
	* @return the new duong
	*/
	public static com.minimart.portlet.danhmucchung.model.Duong create(
		long duongId) {
		return getPersistence().create(duongId);
	}

	/**
	* Removes the duong with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param duongId the primary key of the duong
	* @return the duong that was removed
	* @throws com.minimart.portlet.danhmucchung.NoSuchDuongException if a duong with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.danhmucchung.model.Duong remove(
		long duongId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.danhmucchung.NoSuchDuongException {
		return getPersistence().remove(duongId);
	}

	public static com.minimart.portlet.danhmucchung.model.Duong updateImpl(
		com.minimart.portlet.danhmucchung.model.Duong duong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(duong);
	}

	/**
	* Returns the duong with the primary key or throws a {@link com.minimart.portlet.danhmucchung.NoSuchDuongException} if it could not be found.
	*
	* @param duongId the primary key of the duong
	* @return the duong
	* @throws com.minimart.portlet.danhmucchung.NoSuchDuongException if a duong with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.danhmucchung.model.Duong findByPrimaryKey(
		long duongId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.danhmucchung.NoSuchDuongException {
		return getPersistence().findByPrimaryKey(duongId);
	}

	/**
	* Returns the duong with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param duongId the primary key of the duong
	* @return the duong, or <code>null</code> if a duong with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.danhmucchung.model.Duong fetchByPrimaryKey(
		long duongId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(duongId);
	}

	/**
	* Returns all the duongs.
	*
	* @return the duongs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.danhmucchung.model.Duong> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the duongs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.DuongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of duongs
	* @param end the upper bound of the range of duongs (not inclusive)
	* @return the range of duongs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.danhmucchung.model.Duong> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the duongs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.DuongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of duongs
	* @param end the upper bound of the range of duongs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of duongs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.danhmucchung.model.Duong> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the duongs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of duongs.
	*
	* @return the number of duongs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DuongPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DuongPersistence)PortletBeanLocatorUtil.locate(com.minimart.portlet.danhmucchung.service.ClpSerializer.getServletContextName(),
					DuongPersistence.class.getName());

			ReferenceRegistry.registerReference(DuongUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DuongPersistence persistence) {
	}

	private static DuongPersistence _persistence;
}