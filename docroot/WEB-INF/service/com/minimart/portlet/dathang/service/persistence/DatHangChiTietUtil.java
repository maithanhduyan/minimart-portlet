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

import com.minimart.portlet.dathang.model.DatHangChiTiet;

import java.util.List;

/**
 * The persistence utility for the dat hang chi tiet service. This utility wraps {@link DatHangChiTietPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see DatHangChiTietPersistence
 * @see DatHangChiTietPersistenceImpl
 * @generated
 */
public class DatHangChiTietUtil {
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
	public static void clearCache(DatHangChiTiet datHangChiTiet) {
		getPersistence().clearCache(datHangChiTiet);
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
	public static List<DatHangChiTiet> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DatHangChiTiet> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DatHangChiTiet> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DatHangChiTiet update(DatHangChiTiet datHangChiTiet)
		throws SystemException {
		return getPersistence().update(datHangChiTiet);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DatHangChiTiet update(DatHangChiTiet datHangChiTiet,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(datHangChiTiet, serviceContext);
	}

	/**
	* Returns all the dat hang chi tiets where datHangId = &#63; and maHangId = &#63;.
	*
	* @param datHangId the dat hang ID
	* @param maHangId the ma hang ID
	* @return the matching dat hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.dathang.model.DatHangChiTiet> findByDHID_MHID(
		long datHangId, long maHangId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDHID_MHID(datHangId, maHangId);
	}

	/**
	* Returns a range of all the dat hang chi tiets where datHangId = &#63; and maHangId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.dathang.model.impl.DatHangChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param datHangId the dat hang ID
	* @param maHangId the ma hang ID
	* @param start the lower bound of the range of dat hang chi tiets
	* @param end the upper bound of the range of dat hang chi tiets (not inclusive)
	* @return the range of matching dat hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.dathang.model.DatHangChiTiet> findByDHID_MHID(
		long datHangId, long maHangId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDHID_MHID(datHangId, maHangId, start, end);
	}

	/**
	* Returns an ordered range of all the dat hang chi tiets where datHangId = &#63; and maHangId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.dathang.model.impl.DatHangChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param datHangId the dat hang ID
	* @param maHangId the ma hang ID
	* @param start the lower bound of the range of dat hang chi tiets
	* @param end the upper bound of the range of dat hang chi tiets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dat hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.dathang.model.DatHangChiTiet> findByDHID_MHID(
		long datHangId, long maHangId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDHID_MHID(datHangId, maHangId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first dat hang chi tiet in the ordered set where datHangId = &#63; and maHangId = &#63;.
	*
	* @param datHangId the dat hang ID
	* @param maHangId the ma hang ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dat hang chi tiet
	* @throws com.minimart.portlet.dathang.NoSuchDatHangChiTietException if a matching dat hang chi tiet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.dathang.model.DatHangChiTiet findByDHID_MHID_First(
		long datHangId, long maHangId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.dathang.NoSuchDatHangChiTietException {
		return getPersistence()
				   .findByDHID_MHID_First(datHangId, maHangId, orderByComparator);
	}

	/**
	* Returns the first dat hang chi tiet in the ordered set where datHangId = &#63; and maHangId = &#63;.
	*
	* @param datHangId the dat hang ID
	* @param maHangId the ma hang ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dat hang chi tiet, or <code>null</code> if a matching dat hang chi tiet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.dathang.model.DatHangChiTiet fetchByDHID_MHID_First(
		long datHangId, long maHangId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDHID_MHID_First(datHangId, maHangId,
			orderByComparator);
	}

	/**
	* Returns the last dat hang chi tiet in the ordered set where datHangId = &#63; and maHangId = &#63;.
	*
	* @param datHangId the dat hang ID
	* @param maHangId the ma hang ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dat hang chi tiet
	* @throws com.minimart.portlet.dathang.NoSuchDatHangChiTietException if a matching dat hang chi tiet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.dathang.model.DatHangChiTiet findByDHID_MHID_Last(
		long datHangId, long maHangId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.dathang.NoSuchDatHangChiTietException {
		return getPersistence()
				   .findByDHID_MHID_Last(datHangId, maHangId, orderByComparator);
	}

	/**
	* Returns the last dat hang chi tiet in the ordered set where datHangId = &#63; and maHangId = &#63;.
	*
	* @param datHangId the dat hang ID
	* @param maHangId the ma hang ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dat hang chi tiet, or <code>null</code> if a matching dat hang chi tiet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.dathang.model.DatHangChiTiet fetchByDHID_MHID_Last(
		long datHangId, long maHangId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDHID_MHID_Last(datHangId, maHangId, orderByComparator);
	}

	/**
	* Returns the dat hang chi tiets before and after the current dat hang chi tiet in the ordered set where datHangId = &#63; and maHangId = &#63;.
	*
	* @param datHangChiTietId the primary key of the current dat hang chi tiet
	* @param datHangId the dat hang ID
	* @param maHangId the ma hang ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dat hang chi tiet
	* @throws com.minimart.portlet.dathang.NoSuchDatHangChiTietException if a dat hang chi tiet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.dathang.model.DatHangChiTiet[] findByDHID_MHID_PrevAndNext(
		long datHangChiTietId, long datHangId, long maHangId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.dathang.NoSuchDatHangChiTietException {
		return getPersistence()
				   .findByDHID_MHID_PrevAndNext(datHangChiTietId, datHangId,
			maHangId, orderByComparator);
	}

	/**
	* Removes all the dat hang chi tiets where datHangId = &#63; and maHangId = &#63; from the database.
	*
	* @param datHangId the dat hang ID
	* @param maHangId the ma hang ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDHID_MHID(long datHangId, long maHangId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDHID_MHID(datHangId, maHangId);
	}

	/**
	* Returns the number of dat hang chi tiets where datHangId = &#63; and maHangId = &#63;.
	*
	* @param datHangId the dat hang ID
	* @param maHangId the ma hang ID
	* @return the number of matching dat hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDHID_MHID(long datHangId, long maHangId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDHID_MHID(datHangId, maHangId);
	}

	/**
	* Caches the dat hang chi tiet in the entity cache if it is enabled.
	*
	* @param datHangChiTiet the dat hang chi tiet
	*/
	public static void cacheResult(
		com.minimart.portlet.dathang.model.DatHangChiTiet datHangChiTiet) {
		getPersistence().cacheResult(datHangChiTiet);
	}

	/**
	* Caches the dat hang chi tiets in the entity cache if it is enabled.
	*
	* @param datHangChiTiets the dat hang chi tiets
	*/
	public static void cacheResult(
		java.util.List<com.minimart.portlet.dathang.model.DatHangChiTiet> datHangChiTiets) {
		getPersistence().cacheResult(datHangChiTiets);
	}

	/**
	* Creates a new dat hang chi tiet with the primary key. Does not add the dat hang chi tiet to the database.
	*
	* @param datHangChiTietId the primary key for the new dat hang chi tiet
	* @return the new dat hang chi tiet
	*/
	public static com.minimart.portlet.dathang.model.DatHangChiTiet create(
		long datHangChiTietId) {
		return getPersistence().create(datHangChiTietId);
	}

	/**
	* Removes the dat hang chi tiet with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param datHangChiTietId the primary key of the dat hang chi tiet
	* @return the dat hang chi tiet that was removed
	* @throws com.minimart.portlet.dathang.NoSuchDatHangChiTietException if a dat hang chi tiet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.dathang.model.DatHangChiTiet remove(
		long datHangChiTietId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.dathang.NoSuchDatHangChiTietException {
		return getPersistence().remove(datHangChiTietId);
	}

	public static com.minimart.portlet.dathang.model.DatHangChiTiet updateImpl(
		com.minimart.portlet.dathang.model.DatHangChiTiet datHangChiTiet)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(datHangChiTiet);
	}

	/**
	* Returns the dat hang chi tiet with the primary key or throws a {@link com.minimart.portlet.dathang.NoSuchDatHangChiTietException} if it could not be found.
	*
	* @param datHangChiTietId the primary key of the dat hang chi tiet
	* @return the dat hang chi tiet
	* @throws com.minimart.portlet.dathang.NoSuchDatHangChiTietException if a dat hang chi tiet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.dathang.model.DatHangChiTiet findByPrimaryKey(
		long datHangChiTietId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.dathang.NoSuchDatHangChiTietException {
		return getPersistence().findByPrimaryKey(datHangChiTietId);
	}

	/**
	* Returns the dat hang chi tiet with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param datHangChiTietId the primary key of the dat hang chi tiet
	* @return the dat hang chi tiet, or <code>null</code> if a dat hang chi tiet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.dathang.model.DatHangChiTiet fetchByPrimaryKey(
		long datHangChiTietId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(datHangChiTietId);
	}

	/**
	* Returns all the dat hang chi tiets.
	*
	* @return the dat hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.dathang.model.DatHangChiTiet> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dat hang chi tiets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.dathang.model.impl.DatHangChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dat hang chi tiets
	* @param end the upper bound of the range of dat hang chi tiets (not inclusive)
	* @return the range of dat hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.dathang.model.DatHangChiTiet> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dat hang chi tiets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.dathang.model.impl.DatHangChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dat hang chi tiets
	* @param end the upper bound of the range of dat hang chi tiets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dat hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.dathang.model.DatHangChiTiet> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the dat hang chi tiets from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dat hang chi tiets.
	*
	* @return the number of dat hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DatHangChiTietPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DatHangChiTietPersistence)PortletBeanLocatorUtil.locate(com.minimart.portlet.dathang.service.ClpSerializer.getServletContextName(),
					DatHangChiTietPersistence.class.getName());

			ReferenceRegistry.registerReference(DatHangChiTietUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DatHangChiTietPersistence persistence) {
	}

	private static DatHangChiTietPersistence _persistence;
}