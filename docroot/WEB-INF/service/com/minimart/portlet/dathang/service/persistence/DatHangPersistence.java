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

import com.minimart.portlet.dathang.model.DatHang;

/**
 * The persistence interface for the dat hang service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see DatHangPersistenceImpl
 * @see DatHangUtil
 * @generated
 */
public interface DatHangPersistence extends BasePersistence<DatHang> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DatHangUtil} to access the dat hang persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dat hangs where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @return the matching dat hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.dathang.model.DatHang> findByTEN_HD(
		java.lang.String ten, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dat hangs where ten = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.dathang.model.impl.DatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of dat hangs
	* @param end the upper bound of the range of dat hangs (not inclusive)
	* @return the range of matching dat hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.dathang.model.DatHang> findByTEN_HD(
		java.lang.String ten, boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dat hangs where ten = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.dathang.model.impl.DatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of dat hangs
	* @param end the upper bound of the range of dat hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dat hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.dathang.model.DatHang> findByTEN_HD(
		java.lang.String ten, boolean hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dat hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dat hang
	* @throws com.minimart.portlet.dathang.NoSuchDatHangException if a matching dat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.dathang.model.DatHang findByTEN_HD_First(
		java.lang.String ten, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.dathang.NoSuchDatHangException;

	/**
	* Returns the first dat hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dat hang, or <code>null</code> if a matching dat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.dathang.model.DatHang fetchByTEN_HD_First(
		java.lang.String ten, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dat hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dat hang
	* @throws com.minimart.portlet.dathang.NoSuchDatHangException if a matching dat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.dathang.model.DatHang findByTEN_HD_Last(
		java.lang.String ten, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.dathang.NoSuchDatHangException;

	/**
	* Returns the last dat hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dat hang, or <code>null</code> if a matching dat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.dathang.model.DatHang fetchByTEN_HD_Last(
		java.lang.String ten, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dat hangs before and after the current dat hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	*
	* @param datHangId the primary key of the current dat hang
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dat hang
	* @throws com.minimart.portlet.dathang.NoSuchDatHangException if a dat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.dathang.model.DatHang[] findByTEN_HD_PrevAndNext(
		long datHangId, java.lang.String ten, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.dathang.NoSuchDatHangException;

	/**
	* Removes all the dat hangs where ten = &#63; and hoatDong = &#63; from the database.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTEN_HD(java.lang.String ten, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dat hangs where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @return the number of matching dat hangs
	* @throws SystemException if a system exception occurred
	*/
	public int countByTEN_HD(java.lang.String ten, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dat hangs where ten = &#63; and hoatDong = &#63; and khachHangId = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param khachHangId the khach hang ID
	* @return the matching dat hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.dathang.model.DatHang> findByTEN_HD_KHID(
		java.lang.String ten, boolean hoatDong, long khachHangId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dat hangs where ten = &#63; and hoatDong = &#63; and khachHangId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.dathang.model.impl.DatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param khachHangId the khach hang ID
	* @param start the lower bound of the range of dat hangs
	* @param end the upper bound of the range of dat hangs (not inclusive)
	* @return the range of matching dat hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.dathang.model.DatHang> findByTEN_HD_KHID(
		java.lang.String ten, boolean hoatDong, long khachHangId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dat hangs where ten = &#63; and hoatDong = &#63; and khachHangId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.dathang.model.impl.DatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param khachHangId the khach hang ID
	* @param start the lower bound of the range of dat hangs
	* @param end the upper bound of the range of dat hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dat hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.dathang.model.DatHang> findByTEN_HD_KHID(
		java.lang.String ten, boolean hoatDong, long khachHangId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dat hang in the ordered set where ten = &#63; and hoatDong = &#63; and khachHangId = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param khachHangId the khach hang ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dat hang
	* @throws com.minimart.portlet.dathang.NoSuchDatHangException if a matching dat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.dathang.model.DatHang findByTEN_HD_KHID_First(
		java.lang.String ten, boolean hoatDong, long khachHangId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.dathang.NoSuchDatHangException;

	/**
	* Returns the first dat hang in the ordered set where ten = &#63; and hoatDong = &#63; and khachHangId = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param khachHangId the khach hang ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dat hang, or <code>null</code> if a matching dat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.dathang.model.DatHang fetchByTEN_HD_KHID_First(
		java.lang.String ten, boolean hoatDong, long khachHangId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dat hang in the ordered set where ten = &#63; and hoatDong = &#63; and khachHangId = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param khachHangId the khach hang ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dat hang
	* @throws com.minimart.portlet.dathang.NoSuchDatHangException if a matching dat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.dathang.model.DatHang findByTEN_HD_KHID_Last(
		java.lang.String ten, boolean hoatDong, long khachHangId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.dathang.NoSuchDatHangException;

	/**
	* Returns the last dat hang in the ordered set where ten = &#63; and hoatDong = &#63; and khachHangId = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param khachHangId the khach hang ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dat hang, or <code>null</code> if a matching dat hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.dathang.model.DatHang fetchByTEN_HD_KHID_Last(
		java.lang.String ten, boolean hoatDong, long khachHangId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dat hangs before and after the current dat hang in the ordered set where ten = &#63; and hoatDong = &#63; and khachHangId = &#63;.
	*
	* @param datHangId the primary key of the current dat hang
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param khachHangId the khach hang ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dat hang
	* @throws com.minimart.portlet.dathang.NoSuchDatHangException if a dat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.dathang.model.DatHang[] findByTEN_HD_KHID_PrevAndNext(
		long datHangId, java.lang.String ten, boolean hoatDong,
		long khachHangId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.dathang.NoSuchDatHangException;

	/**
	* Removes all the dat hangs where ten = &#63; and hoatDong = &#63; and khachHangId = &#63; from the database.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param khachHangId the khach hang ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTEN_HD_KHID(java.lang.String ten, boolean hoatDong,
		long khachHangId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dat hangs where ten = &#63; and hoatDong = &#63; and khachHangId = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param khachHangId the khach hang ID
	* @return the number of matching dat hangs
	* @throws SystemException if a system exception occurred
	*/
	public int countByTEN_HD_KHID(java.lang.String ten, boolean hoatDong,
		long khachHangId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dat hang in the entity cache if it is enabled.
	*
	* @param datHang the dat hang
	*/
	public void cacheResult(com.minimart.portlet.dathang.model.DatHang datHang);

	/**
	* Caches the dat hangs in the entity cache if it is enabled.
	*
	* @param datHangs the dat hangs
	*/
	public void cacheResult(
		java.util.List<com.minimart.portlet.dathang.model.DatHang> datHangs);

	/**
	* Creates a new dat hang with the primary key. Does not add the dat hang to the database.
	*
	* @param datHangId the primary key for the new dat hang
	* @return the new dat hang
	*/
	public com.minimart.portlet.dathang.model.DatHang create(long datHangId);

	/**
	* Removes the dat hang with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param datHangId the primary key of the dat hang
	* @return the dat hang that was removed
	* @throws com.minimart.portlet.dathang.NoSuchDatHangException if a dat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.dathang.model.DatHang remove(long datHangId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.dathang.NoSuchDatHangException;

	public com.minimart.portlet.dathang.model.DatHang updateImpl(
		com.minimart.portlet.dathang.model.DatHang datHang)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dat hang with the primary key or throws a {@link com.minimart.portlet.dathang.NoSuchDatHangException} if it could not be found.
	*
	* @param datHangId the primary key of the dat hang
	* @return the dat hang
	* @throws com.minimart.portlet.dathang.NoSuchDatHangException if a dat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.dathang.model.DatHang findByPrimaryKey(
		long datHangId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.dathang.NoSuchDatHangException;

	/**
	* Returns the dat hang with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param datHangId the primary key of the dat hang
	* @return the dat hang, or <code>null</code> if a dat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.dathang.model.DatHang fetchByPrimaryKey(
		long datHangId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dat hangs.
	*
	* @return the dat hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.dathang.model.DatHang> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dat hangs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.dathang.model.impl.DatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dat hangs
	* @param end the upper bound of the range of dat hangs (not inclusive)
	* @return the range of dat hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.dathang.model.DatHang> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dat hangs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.dathang.model.impl.DatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dat hangs
	* @param end the upper bound of the range of dat hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dat hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.dathang.model.DatHang> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dat hangs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dat hangs.
	*
	* @return the number of dat hangs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}