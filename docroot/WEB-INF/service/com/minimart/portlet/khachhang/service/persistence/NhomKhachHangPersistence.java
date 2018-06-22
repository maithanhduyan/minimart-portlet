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

import com.liferay.portal.service.persistence.BasePersistence;

import com.minimart.portlet.khachhang.model.NhomKhachHang;

/**
 * The persistence interface for the nhom khach hang service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see NhomKhachHangPersistenceImpl
 * @see NhomKhachHangUtil
 * @generated
 */
public interface NhomKhachHangPersistence extends BasePersistence<NhomKhachHang> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NhomKhachHangUtil} to access the nhom khach hang persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the nhom khach hangs where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @return the matching nhom khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khachhang.model.NhomKhachHang> findByTEN_HD(
		java.lang.String ten, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the nhom khach hangs where ten = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.NhomKhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of nhom khach hangs
	* @param end the upper bound of the range of nhom khach hangs (not inclusive)
	* @return the range of matching nhom khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khachhang.model.NhomKhachHang> findByTEN_HD(
		java.lang.String ten, boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the nhom khach hangs where ten = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.NhomKhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of nhom khach hangs
	* @param end the upper bound of the range of nhom khach hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching nhom khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khachhang.model.NhomKhachHang> findByTEN_HD(
		java.lang.String ten, boolean hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first nhom khach hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhom khach hang
	* @throws com.minimart.portlet.khachhang.NoSuchNhomKhachHangException if a matching nhom khach hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khachhang.model.NhomKhachHang findByTEN_HD_First(
		java.lang.String ten, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khachhang.NoSuchNhomKhachHangException;

	/**
	* Returns the first nhom khach hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhom khach hang, or <code>null</code> if a matching nhom khach hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khachhang.model.NhomKhachHang fetchByTEN_HD_First(
		java.lang.String ten, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last nhom khach hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhom khach hang
	* @throws com.minimart.portlet.khachhang.NoSuchNhomKhachHangException if a matching nhom khach hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khachhang.model.NhomKhachHang findByTEN_HD_Last(
		java.lang.String ten, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khachhang.NoSuchNhomKhachHangException;

	/**
	* Returns the last nhom khach hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhom khach hang, or <code>null</code> if a matching nhom khach hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khachhang.model.NhomKhachHang fetchByTEN_HD_Last(
		java.lang.String ten, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the nhom khach hangs before and after the current nhom khach hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	*
	* @param nhomKhachHangId the primary key of the current nhom khach hang
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next nhom khach hang
	* @throws com.minimart.portlet.khachhang.NoSuchNhomKhachHangException if a nhom khach hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khachhang.model.NhomKhachHang[] findByTEN_HD_PrevAndNext(
		long nhomKhachHangId, java.lang.String ten, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khachhang.NoSuchNhomKhachHangException;

	/**
	* Removes all the nhom khach hangs where ten = &#63; and hoatDong = &#63; from the database.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTEN_HD(java.lang.String ten, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of nhom khach hangs where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @return the number of matching nhom khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public int countByTEN_HD(java.lang.String ten, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the nhom khach hang in the entity cache if it is enabled.
	*
	* @param nhomKhachHang the nhom khach hang
	*/
	public void cacheResult(
		com.minimart.portlet.khachhang.model.NhomKhachHang nhomKhachHang);

	/**
	* Caches the nhom khach hangs in the entity cache if it is enabled.
	*
	* @param nhomKhachHangs the nhom khach hangs
	*/
	public void cacheResult(
		java.util.List<com.minimart.portlet.khachhang.model.NhomKhachHang> nhomKhachHangs);

	/**
	* Creates a new nhom khach hang with the primary key. Does not add the nhom khach hang to the database.
	*
	* @param nhomKhachHangId the primary key for the new nhom khach hang
	* @return the new nhom khach hang
	*/
	public com.minimart.portlet.khachhang.model.NhomKhachHang create(
		long nhomKhachHangId);

	/**
	* Removes the nhom khach hang with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param nhomKhachHangId the primary key of the nhom khach hang
	* @return the nhom khach hang that was removed
	* @throws com.minimart.portlet.khachhang.NoSuchNhomKhachHangException if a nhom khach hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khachhang.model.NhomKhachHang remove(
		long nhomKhachHangId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khachhang.NoSuchNhomKhachHangException;

	public com.minimart.portlet.khachhang.model.NhomKhachHang updateImpl(
		com.minimart.portlet.khachhang.model.NhomKhachHang nhomKhachHang)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the nhom khach hang with the primary key or throws a {@link com.minimart.portlet.khachhang.NoSuchNhomKhachHangException} if it could not be found.
	*
	* @param nhomKhachHangId the primary key of the nhom khach hang
	* @return the nhom khach hang
	* @throws com.minimart.portlet.khachhang.NoSuchNhomKhachHangException if a nhom khach hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khachhang.model.NhomKhachHang findByPrimaryKey(
		long nhomKhachHangId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khachhang.NoSuchNhomKhachHangException;

	/**
	* Returns the nhom khach hang with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param nhomKhachHangId the primary key of the nhom khach hang
	* @return the nhom khach hang, or <code>null</code> if a nhom khach hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khachhang.model.NhomKhachHang fetchByPrimaryKey(
		long nhomKhachHangId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the nhom khach hangs.
	*
	* @return the nhom khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khachhang.model.NhomKhachHang> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the nhom khach hangs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.NhomKhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nhom khach hangs
	* @param end the upper bound of the range of nhom khach hangs (not inclusive)
	* @return the range of nhom khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khachhang.model.NhomKhachHang> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the nhom khach hangs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.NhomKhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nhom khach hangs
	* @param end the upper bound of the range of nhom khach hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of nhom khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khachhang.model.NhomKhachHang> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the nhom khach hangs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of nhom khach hangs.
	*
	* @return the number of nhom khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}