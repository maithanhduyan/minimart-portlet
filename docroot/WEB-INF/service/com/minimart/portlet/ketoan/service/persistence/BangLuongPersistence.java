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

import com.liferay.portal.service.persistence.BasePersistence;

import com.minimart.portlet.ketoan.model.BangLuong;

/**
 * The persistence interface for the bang luong service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see BangLuongPersistenceImpl
 * @see BangLuongUtil
 * @generated
 */
public interface BangLuongPersistence extends BasePersistence<BangLuong> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BangLuongUtil} to access the bang luong persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the bang luongs where ten = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param trangThai the trang thai
	* @return the matching bang luongs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.ketoan.model.BangLuong> findByTEN_TT(
		java.lang.String ten, boolean trangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.minimart.portlet.ketoan.model.BangLuong> findByTEN_TT(
		java.lang.String ten, boolean trangThai, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.minimart.portlet.ketoan.model.BangLuong> findByTEN_TT(
		java.lang.String ten, boolean trangThai, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.minimart.portlet.ketoan.model.BangLuong findByTEN_TT_First(
		java.lang.String ten, boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.ketoan.NoSuchBangLuongException;

	/**
	* Returns the first bang luong in the ordered set where ten = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bang luong, or <code>null</code> if a matching bang luong could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.ketoan.model.BangLuong fetchByTEN_TT_First(
		java.lang.String ten, boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.minimart.portlet.ketoan.model.BangLuong findByTEN_TT_Last(
		java.lang.String ten, boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.ketoan.NoSuchBangLuongException;

	/**
	* Returns the last bang luong in the ordered set where ten = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bang luong, or <code>null</code> if a matching bang luong could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.ketoan.model.BangLuong fetchByTEN_TT_Last(
		java.lang.String ten, boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.minimart.portlet.ketoan.model.BangLuong[] findByTEN_TT_PrevAndNext(
		long banLuongId, java.lang.String ten, boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.ketoan.NoSuchBangLuongException;

	/**
	* Removes all the bang luongs where ten = &#63; and trangThai = &#63; from the database.
	*
	* @param ten the ten
	* @param trangThai the trang thai
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTEN_TT(java.lang.String ten, boolean trangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of bang luongs where ten = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param trangThai the trang thai
	* @return the number of matching bang luongs
	* @throws SystemException if a system exception occurred
	*/
	public int countByTEN_TT(java.lang.String ten, boolean trangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the bang luong in the entity cache if it is enabled.
	*
	* @param bangLuong the bang luong
	*/
	public void cacheResult(
		com.minimart.portlet.ketoan.model.BangLuong bangLuong);

	/**
	* Caches the bang luongs in the entity cache if it is enabled.
	*
	* @param bangLuongs the bang luongs
	*/
	public void cacheResult(
		java.util.List<com.minimart.portlet.ketoan.model.BangLuong> bangLuongs);

	/**
	* Creates a new bang luong with the primary key. Does not add the bang luong to the database.
	*
	* @param banLuongId the primary key for the new bang luong
	* @return the new bang luong
	*/
	public com.minimart.portlet.ketoan.model.BangLuong create(long banLuongId);

	/**
	* Removes the bang luong with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param banLuongId the primary key of the bang luong
	* @return the bang luong that was removed
	* @throws com.minimart.portlet.ketoan.NoSuchBangLuongException if a bang luong with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.ketoan.model.BangLuong remove(long banLuongId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.ketoan.NoSuchBangLuongException;

	public com.minimart.portlet.ketoan.model.BangLuong updateImpl(
		com.minimart.portlet.ketoan.model.BangLuong bangLuong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the bang luong with the primary key or throws a {@link com.minimart.portlet.ketoan.NoSuchBangLuongException} if it could not be found.
	*
	* @param banLuongId the primary key of the bang luong
	* @return the bang luong
	* @throws com.minimart.portlet.ketoan.NoSuchBangLuongException if a bang luong with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.ketoan.model.BangLuong findByPrimaryKey(
		long banLuongId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.ketoan.NoSuchBangLuongException;

	/**
	* Returns the bang luong with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param banLuongId the primary key of the bang luong
	* @return the bang luong, or <code>null</code> if a bang luong with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.ketoan.model.BangLuong fetchByPrimaryKey(
		long banLuongId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the bang luongs.
	*
	* @return the bang luongs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.ketoan.model.BangLuong> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.minimart.portlet.ketoan.model.BangLuong> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.minimart.portlet.ketoan.model.BangLuong> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the bang luongs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of bang luongs.
	*
	* @return the number of bang luongs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}