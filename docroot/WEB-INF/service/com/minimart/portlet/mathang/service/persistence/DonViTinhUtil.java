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

import com.minimart.portlet.mathang.model.DonViTinh;

import java.util.List;

/**
 * The persistence utility for the don vi tinh service. This utility wraps {@link DonViTinhPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see DonViTinhPersistence
 * @see DonViTinhPersistenceImpl
 * @generated
 */
public class DonViTinhUtil {
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
	public static void clearCache(DonViTinh donViTinh) {
		getPersistence().clearCache(donViTinh);
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
	public static List<DonViTinh> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DonViTinh> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DonViTinh> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DonViTinh update(DonViTinh donViTinh)
		throws SystemException {
		return getPersistence().update(donViTinh);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DonViTinh update(DonViTinh donViTinh,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(donViTinh, serviceContext);
	}

	/**
	* Returns all the don vi tinhs where name = &#63;.
	*
	* @param name the name
	* @return the matching don vi tinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.mathang.model.DonViTinh> findByName(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByName(name);
	}

	/**
	* Returns a range of all the don vi tinhs where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.DonViTinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of don vi tinhs
	* @param end the upper bound of the range of don vi tinhs (not inclusive)
	* @return the range of matching don vi tinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.mathang.model.DonViTinh> findByName(
		java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByName(name, start, end);
	}

	/**
	* Returns an ordered range of all the don vi tinhs where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.DonViTinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of don vi tinhs
	* @param end the upper bound of the range of don vi tinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching don vi tinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.mathang.model.DonViTinh> findByName(
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByName(name, start, end, orderByComparator);
	}

	/**
	* Returns the first don vi tinh in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching don vi tinh
	* @throws com.minimart.portlet.mathang.NoSuchDonViTinhException if a matching don vi tinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.DonViTinh findByName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchDonViTinhException {
		return getPersistence().findByName_First(name, orderByComparator);
	}

	/**
	* Returns the first don vi tinh in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching don vi tinh, or <code>null</code> if a matching don vi tinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.DonViTinh fetchByName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByName_First(name, orderByComparator);
	}

	/**
	* Returns the last don vi tinh in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching don vi tinh
	* @throws com.minimart.portlet.mathang.NoSuchDonViTinhException if a matching don vi tinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.DonViTinh findByName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchDonViTinhException {
		return getPersistence().findByName_Last(name, orderByComparator);
	}

	/**
	* Returns the last don vi tinh in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching don vi tinh, or <code>null</code> if a matching don vi tinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.DonViTinh fetchByName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByName_Last(name, orderByComparator);
	}

	/**
	* Returns the don vi tinhs before and after the current don vi tinh in the ordered set where name = &#63;.
	*
	* @param donViTinhId the primary key of the current don vi tinh
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next don vi tinh
	* @throws com.minimart.portlet.mathang.NoSuchDonViTinhException if a don vi tinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.DonViTinh[] findByName_PrevAndNext(
		long donViTinhId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchDonViTinhException {
		return getPersistence()
				   .findByName_PrevAndNext(donViTinhId, name, orderByComparator);
	}

	/**
	* Removes all the don vi tinhs where name = &#63; from the database.
	*
	* @param name the name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByName(java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByName(name);
	}

	/**
	* Returns the number of don vi tinhs where name = &#63;.
	*
	* @param name the name
	* @return the number of matching don vi tinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByName(java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByName(name);
	}

	/**
	* Caches the don vi tinh in the entity cache if it is enabled.
	*
	* @param donViTinh the don vi tinh
	*/
	public static void cacheResult(
		com.minimart.portlet.mathang.model.DonViTinh donViTinh) {
		getPersistence().cacheResult(donViTinh);
	}

	/**
	* Caches the don vi tinhs in the entity cache if it is enabled.
	*
	* @param donViTinhs the don vi tinhs
	*/
	public static void cacheResult(
		java.util.List<com.minimart.portlet.mathang.model.DonViTinh> donViTinhs) {
		getPersistence().cacheResult(donViTinhs);
	}

	/**
	* Creates a new don vi tinh with the primary key. Does not add the don vi tinh to the database.
	*
	* @param donViTinhId the primary key for the new don vi tinh
	* @return the new don vi tinh
	*/
	public static com.minimart.portlet.mathang.model.DonViTinh create(
		long donViTinhId) {
		return getPersistence().create(donViTinhId);
	}

	/**
	* Removes the don vi tinh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param donViTinhId the primary key of the don vi tinh
	* @return the don vi tinh that was removed
	* @throws com.minimart.portlet.mathang.NoSuchDonViTinhException if a don vi tinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.DonViTinh remove(
		long donViTinhId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchDonViTinhException {
		return getPersistence().remove(donViTinhId);
	}

	public static com.minimart.portlet.mathang.model.DonViTinh updateImpl(
		com.minimart.portlet.mathang.model.DonViTinh donViTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(donViTinh);
	}

	/**
	* Returns the don vi tinh with the primary key or throws a {@link com.minimart.portlet.mathang.NoSuchDonViTinhException} if it could not be found.
	*
	* @param donViTinhId the primary key of the don vi tinh
	* @return the don vi tinh
	* @throws com.minimart.portlet.mathang.NoSuchDonViTinhException if a don vi tinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.DonViTinh findByPrimaryKey(
		long donViTinhId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchDonViTinhException {
		return getPersistence().findByPrimaryKey(donViTinhId);
	}

	/**
	* Returns the don vi tinh with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param donViTinhId the primary key of the don vi tinh
	* @return the don vi tinh, or <code>null</code> if a don vi tinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.mathang.model.DonViTinh fetchByPrimaryKey(
		long donViTinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(donViTinhId);
	}

	/**
	* Returns all the don vi tinhs.
	*
	* @return the don vi tinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.mathang.model.DonViTinh> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the don vi tinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.DonViTinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of don vi tinhs
	* @param end the upper bound of the range of don vi tinhs (not inclusive)
	* @return the range of don vi tinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.mathang.model.DonViTinh> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the don vi tinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.DonViTinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of don vi tinhs
	* @param end the upper bound of the range of don vi tinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of don vi tinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.mathang.model.DonViTinh> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the don vi tinhs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of don vi tinhs.
	*
	* @return the number of don vi tinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DonViTinhPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DonViTinhPersistence)PortletBeanLocatorUtil.locate(com.minimart.portlet.mathang.service.ClpSerializer.getServletContextName(),
					DonViTinhPersistence.class.getName());

			ReferenceRegistry.registerReference(DonViTinhUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DonViTinhPersistence persistence) {
	}

	private static DonViTinhPersistence _persistence;
}