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

package com.minimart.portlet.banhang.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.minimart.portlet.banhang.model.DonHang;

/**
 * The persistence interface for the don hang service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see DonHangPersistenceImpl
 * @see DonHangUtil
 * @generated
 */
public interface DonHangPersistence extends BasePersistence<DonHang> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DonHangUtil} to access the don hang persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the don hangs where cuaHangId = &#63; and khachHangId = &#63; and hoatDong = &#63;.
	*
	* @param cuaHangId the cua hang ID
	* @param khachHangId the khach hang ID
	* @param hoatDong the hoat dong
	* @return the matching don hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.banhang.model.DonHang> findByCH_KH_HD(
		long cuaHangId, long khachHangId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the don hangs where cuaHangId = &#63; and khachHangId = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.DonHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param cuaHangId the cua hang ID
	* @param khachHangId the khach hang ID
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of don hangs
	* @param end the upper bound of the range of don hangs (not inclusive)
	* @return the range of matching don hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.banhang.model.DonHang> findByCH_KH_HD(
		long cuaHangId, long khachHangId, boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the don hangs where cuaHangId = &#63; and khachHangId = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.DonHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param cuaHangId the cua hang ID
	* @param khachHangId the khach hang ID
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of don hangs
	* @param end the upper bound of the range of don hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching don hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.banhang.model.DonHang> findByCH_KH_HD(
		long cuaHangId, long khachHangId, boolean hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first don hang in the ordered set where cuaHangId = &#63; and khachHangId = &#63; and hoatDong = &#63;.
	*
	* @param cuaHangId the cua hang ID
	* @param khachHangId the khach hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching don hang
	* @throws com.minimart.portlet.banhang.NoSuchDonHangException if a matching don hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.banhang.model.DonHang findByCH_KH_HD_First(
		long cuaHangId, long khachHangId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.banhang.NoSuchDonHangException;

	/**
	* Returns the first don hang in the ordered set where cuaHangId = &#63; and khachHangId = &#63; and hoatDong = &#63;.
	*
	* @param cuaHangId the cua hang ID
	* @param khachHangId the khach hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching don hang, or <code>null</code> if a matching don hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.banhang.model.DonHang fetchByCH_KH_HD_First(
		long cuaHangId, long khachHangId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last don hang in the ordered set where cuaHangId = &#63; and khachHangId = &#63; and hoatDong = &#63;.
	*
	* @param cuaHangId the cua hang ID
	* @param khachHangId the khach hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching don hang
	* @throws com.minimart.portlet.banhang.NoSuchDonHangException if a matching don hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.banhang.model.DonHang findByCH_KH_HD_Last(
		long cuaHangId, long khachHangId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.banhang.NoSuchDonHangException;

	/**
	* Returns the last don hang in the ordered set where cuaHangId = &#63; and khachHangId = &#63; and hoatDong = &#63;.
	*
	* @param cuaHangId the cua hang ID
	* @param khachHangId the khach hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching don hang, or <code>null</code> if a matching don hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.banhang.model.DonHang fetchByCH_KH_HD_Last(
		long cuaHangId, long khachHangId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the don hangs before and after the current don hang in the ordered set where cuaHangId = &#63; and khachHangId = &#63; and hoatDong = &#63;.
	*
	* @param donHangId the primary key of the current don hang
	* @param cuaHangId the cua hang ID
	* @param khachHangId the khach hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next don hang
	* @throws com.minimart.portlet.banhang.NoSuchDonHangException if a don hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.banhang.model.DonHang[] findByCH_KH_HD_PrevAndNext(
		long donHangId, long cuaHangId, long khachHangId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.banhang.NoSuchDonHangException;

	/**
	* Removes all the don hangs where cuaHangId = &#63; and khachHangId = &#63; and hoatDong = &#63; from the database.
	*
	* @param cuaHangId the cua hang ID
	* @param khachHangId the khach hang ID
	* @param hoatDong the hoat dong
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCH_KH_HD(long cuaHangId, long khachHangId,
		boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of don hangs where cuaHangId = &#63; and khachHangId = &#63; and hoatDong = &#63;.
	*
	* @param cuaHangId the cua hang ID
	* @param khachHangId the khach hang ID
	* @param hoatDong the hoat dong
	* @return the number of matching don hangs
	* @throws SystemException if a system exception occurred
	*/
	public int countByCH_KH_HD(long cuaHangId, long khachHangId,
		boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the don hangs where cuaHangId = &#63; and trangThaiDonHangId = &#63; and hoatDong = &#63;.
	*
	* @param cuaHangId the cua hang ID
	* @param trangThaiDonHangId the trang thai don hang ID
	* @param hoatDong the hoat dong
	* @return the matching don hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.banhang.model.DonHang> findByCH_TT_HD(
		long cuaHangId, long trangThaiDonHangId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the don hangs where cuaHangId = &#63; and trangThaiDonHangId = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.DonHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param cuaHangId the cua hang ID
	* @param trangThaiDonHangId the trang thai don hang ID
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of don hangs
	* @param end the upper bound of the range of don hangs (not inclusive)
	* @return the range of matching don hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.banhang.model.DonHang> findByCH_TT_HD(
		long cuaHangId, long trangThaiDonHangId, boolean hoatDong, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the don hangs where cuaHangId = &#63; and trangThaiDonHangId = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.DonHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param cuaHangId the cua hang ID
	* @param trangThaiDonHangId the trang thai don hang ID
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of don hangs
	* @param end the upper bound of the range of don hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching don hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.banhang.model.DonHang> findByCH_TT_HD(
		long cuaHangId, long trangThaiDonHangId, boolean hoatDong, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first don hang in the ordered set where cuaHangId = &#63; and trangThaiDonHangId = &#63; and hoatDong = &#63;.
	*
	* @param cuaHangId the cua hang ID
	* @param trangThaiDonHangId the trang thai don hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching don hang
	* @throws com.minimart.portlet.banhang.NoSuchDonHangException if a matching don hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.banhang.model.DonHang findByCH_TT_HD_First(
		long cuaHangId, long trangThaiDonHangId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.banhang.NoSuchDonHangException;

	/**
	* Returns the first don hang in the ordered set where cuaHangId = &#63; and trangThaiDonHangId = &#63; and hoatDong = &#63;.
	*
	* @param cuaHangId the cua hang ID
	* @param trangThaiDonHangId the trang thai don hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching don hang, or <code>null</code> if a matching don hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.banhang.model.DonHang fetchByCH_TT_HD_First(
		long cuaHangId, long trangThaiDonHangId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last don hang in the ordered set where cuaHangId = &#63; and trangThaiDonHangId = &#63; and hoatDong = &#63;.
	*
	* @param cuaHangId the cua hang ID
	* @param trangThaiDonHangId the trang thai don hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching don hang
	* @throws com.minimart.portlet.banhang.NoSuchDonHangException if a matching don hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.banhang.model.DonHang findByCH_TT_HD_Last(
		long cuaHangId, long trangThaiDonHangId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.banhang.NoSuchDonHangException;

	/**
	* Returns the last don hang in the ordered set where cuaHangId = &#63; and trangThaiDonHangId = &#63; and hoatDong = &#63;.
	*
	* @param cuaHangId the cua hang ID
	* @param trangThaiDonHangId the trang thai don hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching don hang, or <code>null</code> if a matching don hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.banhang.model.DonHang fetchByCH_TT_HD_Last(
		long cuaHangId, long trangThaiDonHangId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the don hangs before and after the current don hang in the ordered set where cuaHangId = &#63; and trangThaiDonHangId = &#63; and hoatDong = &#63;.
	*
	* @param donHangId the primary key of the current don hang
	* @param cuaHangId the cua hang ID
	* @param trangThaiDonHangId the trang thai don hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next don hang
	* @throws com.minimart.portlet.banhang.NoSuchDonHangException if a don hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.banhang.model.DonHang[] findByCH_TT_HD_PrevAndNext(
		long donHangId, long cuaHangId, long trangThaiDonHangId,
		boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.banhang.NoSuchDonHangException;

	/**
	* Removes all the don hangs where cuaHangId = &#63; and trangThaiDonHangId = &#63; and hoatDong = &#63; from the database.
	*
	* @param cuaHangId the cua hang ID
	* @param trangThaiDonHangId the trang thai don hang ID
	* @param hoatDong the hoat dong
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCH_TT_HD(long cuaHangId, long trangThaiDonHangId,
		boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of don hangs where cuaHangId = &#63; and trangThaiDonHangId = &#63; and hoatDong = &#63;.
	*
	* @param cuaHangId the cua hang ID
	* @param trangThaiDonHangId the trang thai don hang ID
	* @param hoatDong the hoat dong
	* @return the number of matching don hangs
	* @throws SystemException if a system exception occurred
	*/
	public int countByCH_TT_HD(long cuaHangId, long trangThaiDonHangId,
		boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the don hang in the entity cache if it is enabled.
	*
	* @param donHang the don hang
	*/
	public void cacheResult(com.minimart.portlet.banhang.model.DonHang donHang);

	/**
	* Caches the don hangs in the entity cache if it is enabled.
	*
	* @param donHangs the don hangs
	*/
	public void cacheResult(
		java.util.List<com.minimart.portlet.banhang.model.DonHang> donHangs);

	/**
	* Creates a new don hang with the primary key. Does not add the don hang to the database.
	*
	* @param donHangId the primary key for the new don hang
	* @return the new don hang
	*/
	public com.minimart.portlet.banhang.model.DonHang create(long donHangId);

	/**
	* Removes the don hang with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param donHangId the primary key of the don hang
	* @return the don hang that was removed
	* @throws com.minimart.portlet.banhang.NoSuchDonHangException if a don hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.banhang.model.DonHang remove(long donHangId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.banhang.NoSuchDonHangException;

	public com.minimart.portlet.banhang.model.DonHang updateImpl(
		com.minimart.portlet.banhang.model.DonHang donHang)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the don hang with the primary key or throws a {@link com.minimart.portlet.banhang.NoSuchDonHangException} if it could not be found.
	*
	* @param donHangId the primary key of the don hang
	* @return the don hang
	* @throws com.minimart.portlet.banhang.NoSuchDonHangException if a don hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.banhang.model.DonHang findByPrimaryKey(
		long donHangId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.banhang.NoSuchDonHangException;

	/**
	* Returns the don hang with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param donHangId the primary key of the don hang
	* @return the don hang, or <code>null</code> if a don hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.banhang.model.DonHang fetchByPrimaryKey(
		long donHangId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the don hangs.
	*
	* @return the don hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.banhang.model.DonHang> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the don hangs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.DonHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of don hangs
	* @param end the upper bound of the range of don hangs (not inclusive)
	* @return the range of don hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.banhang.model.DonHang> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the don hangs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.DonHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of don hangs
	* @param end the upper bound of the range of don hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of don hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.banhang.model.DonHang> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the don hangs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of don hangs.
	*
	* @return the number of don hangs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}