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

import com.minimart.portlet.banhang.model.TrangThaiDonHang;

/**
 * The persistence interface for the trang thai don hang service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see TrangThaiDonHangPersistenceImpl
 * @see TrangThaiDonHangUtil
 * @generated
 */
public interface TrangThaiDonHangPersistence extends BasePersistence<TrangThaiDonHang> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TrangThaiDonHangUtil} to access the trang thai don hang persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the trang thai don hangs where ten = &#63;.
	*
	* @param ten the ten
	* @return the matching trang thai don hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.banhang.model.TrangThaiDonHang> findByTEN(
		java.lang.String ten)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the trang thai don hangs where ten = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.TrangThaiDonHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param start the lower bound of the range of trang thai don hangs
	* @param end the upper bound of the range of trang thai don hangs (not inclusive)
	* @return the range of matching trang thai don hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.banhang.model.TrangThaiDonHang> findByTEN(
		java.lang.String ten, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the trang thai don hangs where ten = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.TrangThaiDonHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param start the lower bound of the range of trang thai don hangs
	* @param end the upper bound of the range of trang thai don hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching trang thai don hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.banhang.model.TrangThaiDonHang> findByTEN(
		java.lang.String ten, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first trang thai don hang in the ordered set where ten = &#63;.
	*
	* @param ten the ten
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching trang thai don hang
	* @throws com.minimart.portlet.banhang.NoSuchTrangThaiDonHangException if a matching trang thai don hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.banhang.model.TrangThaiDonHang findByTEN_First(
		java.lang.String ten,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.banhang.NoSuchTrangThaiDonHangException;

	/**
	* Returns the first trang thai don hang in the ordered set where ten = &#63;.
	*
	* @param ten the ten
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching trang thai don hang, or <code>null</code> if a matching trang thai don hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.banhang.model.TrangThaiDonHang fetchByTEN_First(
		java.lang.String ten,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last trang thai don hang in the ordered set where ten = &#63;.
	*
	* @param ten the ten
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching trang thai don hang
	* @throws com.minimart.portlet.banhang.NoSuchTrangThaiDonHangException if a matching trang thai don hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.banhang.model.TrangThaiDonHang findByTEN_Last(
		java.lang.String ten,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.banhang.NoSuchTrangThaiDonHangException;

	/**
	* Returns the last trang thai don hang in the ordered set where ten = &#63;.
	*
	* @param ten the ten
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching trang thai don hang, or <code>null</code> if a matching trang thai don hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.banhang.model.TrangThaiDonHang fetchByTEN_Last(
		java.lang.String ten,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the trang thai don hangs before and after the current trang thai don hang in the ordered set where ten = &#63;.
	*
	* @param trangThaiDonHangId the primary key of the current trang thai don hang
	* @param ten the ten
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next trang thai don hang
	* @throws com.minimart.portlet.banhang.NoSuchTrangThaiDonHangException if a trang thai don hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.banhang.model.TrangThaiDonHang[] findByTEN_PrevAndNext(
		long trangThaiDonHangId, java.lang.String ten,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.banhang.NoSuchTrangThaiDonHangException;

	/**
	* Removes all the trang thai don hangs where ten = &#63; from the database.
	*
	* @param ten the ten
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTEN(java.lang.String ten)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of trang thai don hangs where ten = &#63;.
	*
	* @param ten the ten
	* @return the number of matching trang thai don hangs
	* @throws SystemException if a system exception occurred
	*/
	public int countByTEN(java.lang.String ten)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the trang thai don hang in the entity cache if it is enabled.
	*
	* @param trangThaiDonHang the trang thai don hang
	*/
	public void cacheResult(
		com.minimart.portlet.banhang.model.TrangThaiDonHang trangThaiDonHang);

	/**
	* Caches the trang thai don hangs in the entity cache if it is enabled.
	*
	* @param trangThaiDonHangs the trang thai don hangs
	*/
	public void cacheResult(
		java.util.List<com.minimart.portlet.banhang.model.TrangThaiDonHang> trangThaiDonHangs);

	/**
	* Creates a new trang thai don hang with the primary key. Does not add the trang thai don hang to the database.
	*
	* @param trangThaiDonHangId the primary key for the new trang thai don hang
	* @return the new trang thai don hang
	*/
	public com.minimart.portlet.banhang.model.TrangThaiDonHang create(
		long trangThaiDonHangId);

	/**
	* Removes the trang thai don hang with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param trangThaiDonHangId the primary key of the trang thai don hang
	* @return the trang thai don hang that was removed
	* @throws com.minimart.portlet.banhang.NoSuchTrangThaiDonHangException if a trang thai don hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.banhang.model.TrangThaiDonHang remove(
		long trangThaiDonHangId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.banhang.NoSuchTrangThaiDonHangException;

	public com.minimart.portlet.banhang.model.TrangThaiDonHang updateImpl(
		com.minimart.portlet.banhang.model.TrangThaiDonHang trangThaiDonHang)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the trang thai don hang with the primary key or throws a {@link com.minimart.portlet.banhang.NoSuchTrangThaiDonHangException} if it could not be found.
	*
	* @param trangThaiDonHangId the primary key of the trang thai don hang
	* @return the trang thai don hang
	* @throws com.minimart.portlet.banhang.NoSuchTrangThaiDonHangException if a trang thai don hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.banhang.model.TrangThaiDonHang findByPrimaryKey(
		long trangThaiDonHangId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.banhang.NoSuchTrangThaiDonHangException;

	/**
	* Returns the trang thai don hang with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param trangThaiDonHangId the primary key of the trang thai don hang
	* @return the trang thai don hang, or <code>null</code> if a trang thai don hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.banhang.model.TrangThaiDonHang fetchByPrimaryKey(
		long trangThaiDonHangId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the trang thai don hangs.
	*
	* @return the trang thai don hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.banhang.model.TrangThaiDonHang> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the trang thai don hangs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.TrangThaiDonHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trang thai don hangs
	* @param end the upper bound of the range of trang thai don hangs (not inclusive)
	* @return the range of trang thai don hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.banhang.model.TrangThaiDonHang> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the trang thai don hangs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.TrangThaiDonHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trang thai don hangs
	* @param end the upper bound of the range of trang thai don hangs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of trang thai don hangs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.banhang.model.TrangThaiDonHang> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the trang thai don hangs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of trang thai don hangs.
	*
	* @return the number of trang thai don hangs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}