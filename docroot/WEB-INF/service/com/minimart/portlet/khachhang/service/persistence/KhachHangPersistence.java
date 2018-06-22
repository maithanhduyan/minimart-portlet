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

import com.minimart.portlet.khachhang.model.KhachHang;

/**
 * The persistence interface for the khach hang service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see KhachHangPersistenceImpl
 * @see KhachHangUtil
 * @generated
 */
public interface KhachHangPersistence extends BasePersistence<KhachHang> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link KhachHangUtil} to access the khach hang persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the khach hangs where ten = &#63; and ma = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @return the matching khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khachhang.model.KhachHang> findByTEN_MA(
		java.lang.String ten, java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the khach hangs where ten = &#63; and ma = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.KhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param ma the ma
	* @param start the lower bound of the range of khach hangs
	* @param end the upper bound of the range of khach hangs (not inclusive)
	* @return the range of matching khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khachhang.model.KhachHang> findByTEN_MA(
		java.lang.String ten, java.lang.String ma, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the khach hangs where ten = &#63; and ma = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.KhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param ma the ma
	* @param start the lower bound of the range of khach hangs
	* @param end the upper bound of the range of khach hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khachhang.model.KhachHang> findByTEN_MA(
		java.lang.String ten, java.lang.String ma, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first khach hang in the ordered set where ten = &#63; and ma = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching khach hang
	* @throws com.minimart.portlet.khachhang.NoSuchKhachHangException if a matching khach hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khachhang.model.KhachHang findByTEN_MA_First(
		java.lang.String ten, java.lang.String ma,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khachhang.NoSuchKhachHangException;

	/**
	* Returns the first khach hang in the ordered set where ten = &#63; and ma = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching khach hang, or <code>null</code> if a matching khach hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khachhang.model.KhachHang fetchByTEN_MA_First(
		java.lang.String ten, java.lang.String ma,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last khach hang in the ordered set where ten = &#63; and ma = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching khach hang
	* @throws com.minimart.portlet.khachhang.NoSuchKhachHangException if a matching khach hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khachhang.model.KhachHang findByTEN_MA_Last(
		java.lang.String ten, java.lang.String ma,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khachhang.NoSuchKhachHangException;

	/**
	* Returns the last khach hang in the ordered set where ten = &#63; and ma = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching khach hang, or <code>null</code> if a matching khach hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khachhang.model.KhachHang fetchByTEN_MA_Last(
		java.lang.String ten, java.lang.String ma,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the khach hangs before and after the current khach hang in the ordered set where ten = &#63; and ma = &#63;.
	*
	* @param khachHangId the primary key of the current khach hang
	* @param ten the ten
	* @param ma the ma
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next khach hang
	* @throws com.minimart.portlet.khachhang.NoSuchKhachHangException if a khach hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khachhang.model.KhachHang[] findByTEN_MA_PrevAndNext(
		long khachHangId, java.lang.String ten, java.lang.String ma,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khachhang.NoSuchKhachHangException;

	/**
	* Removes all the khach hangs where ten = &#63; and ma = &#63; from the database.
	*
	* @param ten the ten
	* @param ma the ma
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTEN_MA(java.lang.String ten, java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of khach hangs where ten = &#63; and ma = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @return the number of matching khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public int countByTEN_MA(java.lang.String ten, java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the khach hangs where ten = &#63; and ma = &#63; and nhomKhachHangId = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param nhomKhachHangId the nhom khach hang ID
	* @param hoatDong the hoat dong
	* @return the matching khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khachhang.model.KhachHang> findByTEN_MA_NHOM_HD(
		java.lang.String ten, java.lang.String ma, long nhomKhachHangId,
		boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the khach hangs where ten = &#63; and ma = &#63; and nhomKhachHangId = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.KhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param ma the ma
	* @param nhomKhachHangId the nhom khach hang ID
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of khach hangs
	* @param end the upper bound of the range of khach hangs (not inclusive)
	* @return the range of matching khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khachhang.model.KhachHang> findByTEN_MA_NHOM_HD(
		java.lang.String ten, java.lang.String ma, long nhomKhachHangId,
		boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the khach hangs where ten = &#63; and ma = &#63; and nhomKhachHangId = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.KhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param ma the ma
	* @param nhomKhachHangId the nhom khach hang ID
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of khach hangs
	* @param end the upper bound of the range of khach hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khachhang.model.KhachHang> findByTEN_MA_NHOM_HD(
		java.lang.String ten, java.lang.String ma, long nhomKhachHangId,
		boolean hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first khach hang in the ordered set where ten = &#63; and ma = &#63; and nhomKhachHangId = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param nhomKhachHangId the nhom khach hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching khach hang
	* @throws com.minimart.portlet.khachhang.NoSuchKhachHangException if a matching khach hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khachhang.model.KhachHang findByTEN_MA_NHOM_HD_First(
		java.lang.String ten, java.lang.String ma, long nhomKhachHangId,
		boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khachhang.NoSuchKhachHangException;

	/**
	* Returns the first khach hang in the ordered set where ten = &#63; and ma = &#63; and nhomKhachHangId = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param nhomKhachHangId the nhom khach hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching khach hang, or <code>null</code> if a matching khach hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khachhang.model.KhachHang fetchByTEN_MA_NHOM_HD_First(
		java.lang.String ten, java.lang.String ma, long nhomKhachHangId,
		boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last khach hang in the ordered set where ten = &#63; and ma = &#63; and nhomKhachHangId = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param nhomKhachHangId the nhom khach hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching khach hang
	* @throws com.minimart.portlet.khachhang.NoSuchKhachHangException if a matching khach hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khachhang.model.KhachHang findByTEN_MA_NHOM_HD_Last(
		java.lang.String ten, java.lang.String ma, long nhomKhachHangId,
		boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khachhang.NoSuchKhachHangException;

	/**
	* Returns the last khach hang in the ordered set where ten = &#63; and ma = &#63; and nhomKhachHangId = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param nhomKhachHangId the nhom khach hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching khach hang, or <code>null</code> if a matching khach hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khachhang.model.KhachHang fetchByTEN_MA_NHOM_HD_Last(
		java.lang.String ten, java.lang.String ma, long nhomKhachHangId,
		boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the khach hangs before and after the current khach hang in the ordered set where ten = &#63; and ma = &#63; and nhomKhachHangId = &#63; and hoatDong = &#63;.
	*
	* @param khachHangId the primary key of the current khach hang
	* @param ten the ten
	* @param ma the ma
	* @param nhomKhachHangId the nhom khach hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next khach hang
	* @throws com.minimart.portlet.khachhang.NoSuchKhachHangException if a khach hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khachhang.model.KhachHang[] findByTEN_MA_NHOM_HD_PrevAndNext(
		long khachHangId, java.lang.String ten, java.lang.String ma,
		long nhomKhachHangId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khachhang.NoSuchKhachHangException;

	/**
	* Removes all the khach hangs where ten = &#63; and ma = &#63; and nhomKhachHangId = &#63; and hoatDong = &#63; from the database.
	*
	* @param ten the ten
	* @param ma the ma
	* @param nhomKhachHangId the nhom khach hang ID
	* @param hoatDong the hoat dong
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTEN_MA_NHOM_HD(java.lang.String ten,
		java.lang.String ma, long nhomKhachHangId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of khach hangs where ten = &#63; and ma = &#63; and nhomKhachHangId = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param nhomKhachHangId the nhom khach hang ID
	* @param hoatDong the hoat dong
	* @return the number of matching khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public int countByTEN_MA_NHOM_HD(java.lang.String ten, java.lang.String ma,
		long nhomKhachHangId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the khach hang in the entity cache if it is enabled.
	*
	* @param khachHang the khach hang
	*/
	public void cacheResult(
		com.minimart.portlet.khachhang.model.KhachHang khachHang);

	/**
	* Caches the khach hangs in the entity cache if it is enabled.
	*
	* @param khachHangs the khach hangs
	*/
	public void cacheResult(
		java.util.List<com.minimart.portlet.khachhang.model.KhachHang> khachHangs);

	/**
	* Creates a new khach hang with the primary key. Does not add the khach hang to the database.
	*
	* @param khachHangId the primary key for the new khach hang
	* @return the new khach hang
	*/
	public com.minimart.portlet.khachhang.model.KhachHang create(
		long khachHangId);

	/**
	* Removes the khach hang with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param khachHangId the primary key of the khach hang
	* @return the khach hang that was removed
	* @throws com.minimart.portlet.khachhang.NoSuchKhachHangException if a khach hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khachhang.model.KhachHang remove(
		long khachHangId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khachhang.NoSuchKhachHangException;

	public com.minimart.portlet.khachhang.model.KhachHang updateImpl(
		com.minimart.portlet.khachhang.model.KhachHang khachHang)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the khach hang with the primary key or throws a {@link com.minimart.portlet.khachhang.NoSuchKhachHangException} if it could not be found.
	*
	* @param khachHangId the primary key of the khach hang
	* @return the khach hang
	* @throws com.minimart.portlet.khachhang.NoSuchKhachHangException if a khach hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khachhang.model.KhachHang findByPrimaryKey(
		long khachHangId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khachhang.NoSuchKhachHangException;

	/**
	* Returns the khach hang with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param khachHangId the primary key of the khach hang
	* @return the khach hang, or <code>null</code> if a khach hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khachhang.model.KhachHang fetchByPrimaryKey(
		long khachHangId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the khach hangs.
	*
	* @return the khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khachhang.model.KhachHang> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the khach hangs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.KhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of khach hangs
	* @param end the upper bound of the range of khach hangs (not inclusive)
	* @return the range of khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khachhang.model.KhachHang> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the khach hangs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.KhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of khach hangs
	* @param end the upper bound of the range of khach hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khachhang.model.KhachHang> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the khach hangs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of khach hangs.
	*
	* @return the number of khach hangs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}