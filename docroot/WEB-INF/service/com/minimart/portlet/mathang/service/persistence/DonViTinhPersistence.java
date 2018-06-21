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

import com.liferay.portal.service.persistence.BasePersistence;

import com.minimart.portlet.mathang.model.DonViTinh;

/**
 * The persistence interface for the don vi tinh service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see DonViTinhPersistenceImpl
 * @see DonViTinhUtil
 * @generated
 */
public interface DonViTinhPersistence extends BasePersistence<DonViTinh> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DonViTinhUtil} to access the don vi tinh persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the don vi tinhs where name = &#63;.
	*
	* @param name the name
	* @return the matching don vi tinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.mathang.model.DonViTinh> findByName(
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.minimart.portlet.mathang.model.DonViTinh> findByName(
		java.lang.String name, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.minimart.portlet.mathang.model.DonViTinh> findByName(
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first don vi tinh in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching don vi tinh
	* @throws com.minimart.portlet.mathang.NoSuchDonViTinhException if a matching don vi tinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.DonViTinh findByName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchDonViTinhException;

	/**
	* Returns the first don vi tinh in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching don vi tinh, or <code>null</code> if a matching don vi tinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.DonViTinh fetchByName_First(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last don vi tinh in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching don vi tinh
	* @throws com.minimart.portlet.mathang.NoSuchDonViTinhException if a matching don vi tinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.DonViTinh findByName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchDonViTinhException;

	/**
	* Returns the last don vi tinh in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching don vi tinh, or <code>null</code> if a matching don vi tinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.DonViTinh fetchByName_Last(
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.minimart.portlet.mathang.model.DonViTinh[] findByName_PrevAndNext(
		long donViTinhId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchDonViTinhException;

	/**
	* Removes all the don vi tinhs where name = &#63; from the database.
	*
	* @param name the name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByName(java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of don vi tinhs where name = &#63;.
	*
	* @param name the name
	* @return the number of matching don vi tinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countByName(java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the don vi tinh in the entity cache if it is enabled.
	*
	* @param donViTinh the don vi tinh
	*/
	public void cacheResult(
		com.minimart.portlet.mathang.model.DonViTinh donViTinh);

	/**
	* Caches the don vi tinhs in the entity cache if it is enabled.
	*
	* @param donViTinhs the don vi tinhs
	*/
	public void cacheResult(
		java.util.List<com.minimart.portlet.mathang.model.DonViTinh> donViTinhs);

	/**
	* Creates a new don vi tinh with the primary key. Does not add the don vi tinh to the database.
	*
	* @param donViTinhId the primary key for the new don vi tinh
	* @return the new don vi tinh
	*/
	public com.minimart.portlet.mathang.model.DonViTinh create(long donViTinhId);

	/**
	* Removes the don vi tinh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param donViTinhId the primary key of the don vi tinh
	* @return the don vi tinh that was removed
	* @throws com.minimart.portlet.mathang.NoSuchDonViTinhException if a don vi tinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.DonViTinh remove(long donViTinhId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchDonViTinhException;

	public com.minimart.portlet.mathang.model.DonViTinh updateImpl(
		com.minimart.portlet.mathang.model.DonViTinh donViTinh)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the don vi tinh with the primary key or throws a {@link com.minimart.portlet.mathang.NoSuchDonViTinhException} if it could not be found.
	*
	* @param donViTinhId the primary key of the don vi tinh
	* @return the don vi tinh
	* @throws com.minimart.portlet.mathang.NoSuchDonViTinhException if a don vi tinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.DonViTinh findByPrimaryKey(
		long donViTinhId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.mathang.NoSuchDonViTinhException;

	/**
	* Returns the don vi tinh with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param donViTinhId the primary key of the don vi tinh
	* @return the don vi tinh, or <code>null</code> if a don vi tinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.mathang.model.DonViTinh fetchByPrimaryKey(
		long donViTinhId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the don vi tinhs.
	*
	* @return the don vi tinhs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.mathang.model.DonViTinh> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.minimart.portlet.mathang.model.DonViTinh> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.minimart.portlet.mathang.model.DonViTinh> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the don vi tinhs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of don vi tinhs.
	*
	* @return the number of don vi tinhs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}