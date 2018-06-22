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

import com.liferay.portal.service.persistence.BasePersistence;

import com.minimart.portlet.dathang.model.DatHangChiTiet;

/**
 * The persistence interface for the dat hang chi tiet service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see DatHangChiTietPersistenceImpl
 * @see DatHangChiTietUtil
 * @generated
 */
public interface DatHangChiTietPersistence extends BasePersistence<DatHangChiTiet> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DatHangChiTietUtil} to access the dat hang chi tiet persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dat hang chi tiets where datHangId = &#63; and maHangId = &#63;.
	*
	* @param datHangId the dat hang ID
	* @param maHangId the ma hang ID
	* @return the matching dat hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.dathang.model.DatHangChiTiet> findByDHID_MHID(
		long datHangId, long maHangId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.minimart.portlet.dathang.model.DatHangChiTiet> findByDHID_MHID(
		long datHangId, long maHangId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.minimart.portlet.dathang.model.DatHangChiTiet> findByDHID_MHID(
		long datHangId, long maHangId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.minimart.portlet.dathang.model.DatHangChiTiet findByDHID_MHID_First(
		long datHangId, long maHangId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.dathang.NoSuchDatHangChiTietException;

	/**
	* Returns the first dat hang chi tiet in the ordered set where datHangId = &#63; and maHangId = &#63;.
	*
	* @param datHangId the dat hang ID
	* @param maHangId the ma hang ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dat hang chi tiet, or <code>null</code> if a matching dat hang chi tiet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.dathang.model.DatHangChiTiet fetchByDHID_MHID_First(
		long datHangId, long maHangId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.minimart.portlet.dathang.model.DatHangChiTiet findByDHID_MHID_Last(
		long datHangId, long maHangId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.dathang.NoSuchDatHangChiTietException;

	/**
	* Returns the last dat hang chi tiet in the ordered set where datHangId = &#63; and maHangId = &#63;.
	*
	* @param datHangId the dat hang ID
	* @param maHangId the ma hang ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dat hang chi tiet, or <code>null</code> if a matching dat hang chi tiet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.dathang.model.DatHangChiTiet fetchByDHID_MHID_Last(
		long datHangId, long maHangId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.minimart.portlet.dathang.model.DatHangChiTiet[] findByDHID_MHID_PrevAndNext(
		long datHangChiTietId, long datHangId, long maHangId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.dathang.NoSuchDatHangChiTietException;

	/**
	* Removes all the dat hang chi tiets where datHangId = &#63; and maHangId = &#63; from the database.
	*
	* @param datHangId the dat hang ID
	* @param maHangId the ma hang ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDHID_MHID(long datHangId, long maHangId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dat hang chi tiets where datHangId = &#63; and maHangId = &#63;.
	*
	* @param datHangId the dat hang ID
	* @param maHangId the ma hang ID
	* @return the number of matching dat hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public int countByDHID_MHID(long datHangId, long maHangId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dat hang chi tiet in the entity cache if it is enabled.
	*
	* @param datHangChiTiet the dat hang chi tiet
	*/
	public void cacheResult(
		com.minimart.portlet.dathang.model.DatHangChiTiet datHangChiTiet);

	/**
	* Caches the dat hang chi tiets in the entity cache if it is enabled.
	*
	* @param datHangChiTiets the dat hang chi tiets
	*/
	public void cacheResult(
		java.util.List<com.minimart.portlet.dathang.model.DatHangChiTiet> datHangChiTiets);

	/**
	* Creates a new dat hang chi tiet with the primary key. Does not add the dat hang chi tiet to the database.
	*
	* @param datHangChiTietId the primary key for the new dat hang chi tiet
	* @return the new dat hang chi tiet
	*/
	public com.minimart.portlet.dathang.model.DatHangChiTiet create(
		long datHangChiTietId);

	/**
	* Removes the dat hang chi tiet with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param datHangChiTietId the primary key of the dat hang chi tiet
	* @return the dat hang chi tiet that was removed
	* @throws com.minimart.portlet.dathang.NoSuchDatHangChiTietException if a dat hang chi tiet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.dathang.model.DatHangChiTiet remove(
		long datHangChiTietId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.dathang.NoSuchDatHangChiTietException;

	public com.minimart.portlet.dathang.model.DatHangChiTiet updateImpl(
		com.minimart.portlet.dathang.model.DatHangChiTiet datHangChiTiet)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dat hang chi tiet with the primary key or throws a {@link com.minimart.portlet.dathang.NoSuchDatHangChiTietException} if it could not be found.
	*
	* @param datHangChiTietId the primary key of the dat hang chi tiet
	* @return the dat hang chi tiet
	* @throws com.minimart.portlet.dathang.NoSuchDatHangChiTietException if a dat hang chi tiet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.dathang.model.DatHangChiTiet findByPrimaryKey(
		long datHangChiTietId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.dathang.NoSuchDatHangChiTietException;

	/**
	* Returns the dat hang chi tiet with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param datHangChiTietId the primary key of the dat hang chi tiet
	* @return the dat hang chi tiet, or <code>null</code> if a dat hang chi tiet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.dathang.model.DatHangChiTiet fetchByPrimaryKey(
		long datHangChiTietId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dat hang chi tiets.
	*
	* @return the dat hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.dathang.model.DatHangChiTiet> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.minimart.portlet.dathang.model.DatHangChiTiet> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.minimart.portlet.dathang.model.DatHangChiTiet> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dat hang chi tiets from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dat hang chi tiets.
	*
	* @return the number of dat hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}