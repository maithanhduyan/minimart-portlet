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

package com.minimart.portlet.khuyenmai.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.minimart.portlet.khuyenmai.model.DotKhuyenMai;

/**
 * The persistence interface for the dot khuyen mai service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see DotKhuyenMaiPersistenceImpl
 * @see DotKhuyenMaiUtil
 * @generated
 */
public interface DotKhuyenMaiPersistence extends BasePersistence<DotKhuyenMai> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DotKhuyenMaiUtil} to access the dot khuyen mai persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dot khuyen mais where ten = &#63;.
	*
	* @param ten the ten
	* @return the matching dot khuyen mais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khuyenmai.model.DotKhuyenMai> findByTEN_TH(
		java.lang.String ten)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dot khuyen mais where ten = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param start the lower bound of the range of dot khuyen mais
	* @param end the upper bound of the range of dot khuyen mais (not inclusive)
	* @return the range of matching dot khuyen mais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khuyenmai.model.DotKhuyenMai> findByTEN_TH(
		java.lang.String ten, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dot khuyen mais where ten = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param start the lower bound of the range of dot khuyen mais
	* @param end the upper bound of the range of dot khuyen mais (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dot khuyen mais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khuyenmai.model.DotKhuyenMai> findByTEN_TH(
		java.lang.String ten, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dot khuyen mai in the ordered set where ten = &#63;.
	*
	* @param ten the ten
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dot khuyen mai
	* @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException if a matching dot khuyen mai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMai findByTEN_TH_First(
		java.lang.String ten,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException;

	/**
	* Returns the first dot khuyen mai in the ordered set where ten = &#63;.
	*
	* @param ten the ten
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dot khuyen mai, or <code>null</code> if a matching dot khuyen mai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMai fetchByTEN_TH_First(
		java.lang.String ten,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dot khuyen mai in the ordered set where ten = &#63;.
	*
	* @param ten the ten
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dot khuyen mai
	* @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException if a matching dot khuyen mai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMai findByTEN_TH_Last(
		java.lang.String ten,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException;

	/**
	* Returns the last dot khuyen mai in the ordered set where ten = &#63;.
	*
	* @param ten the ten
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dot khuyen mai, or <code>null</code> if a matching dot khuyen mai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMai fetchByTEN_TH_Last(
		java.lang.String ten,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dot khuyen mais before and after the current dot khuyen mai in the ordered set where ten = &#63;.
	*
	* @param dotKhuyenMaiId the primary key of the current dot khuyen mai
	* @param ten the ten
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dot khuyen mai
	* @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException if a dot khuyen mai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMai[] findByTEN_TH_PrevAndNext(
		long dotKhuyenMaiId, java.lang.String ten,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException;

	/**
	* Removes all the dot khuyen mais where ten = &#63; from the database.
	*
	* @param ten the ten
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTEN_TH(java.lang.String ten)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dot khuyen mais where ten = &#63;.
	*
	* @param ten the ten
	* @return the number of matching dot khuyen mais
	* @throws SystemException if a system exception occurred
	*/
	public int countByTEN_TH(java.lang.String ten)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dot khuyen mais where ngayHetHan = &#63;.
	*
	* @param ngayHetHan the ngay het han
	* @return the matching dot khuyen mais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khuyenmai.model.DotKhuyenMai> findByNGAY_HH(
		java.util.Date ngayHetHan)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dot khuyen mais where ngayHetHan = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ngayHetHan the ngay het han
	* @param start the lower bound of the range of dot khuyen mais
	* @param end the upper bound of the range of dot khuyen mais (not inclusive)
	* @return the range of matching dot khuyen mais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khuyenmai.model.DotKhuyenMai> findByNGAY_HH(
		java.util.Date ngayHetHan, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dot khuyen mais where ngayHetHan = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ngayHetHan the ngay het han
	* @param start the lower bound of the range of dot khuyen mais
	* @param end the upper bound of the range of dot khuyen mais (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dot khuyen mais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khuyenmai.model.DotKhuyenMai> findByNGAY_HH(
		java.util.Date ngayHetHan, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dot khuyen mai in the ordered set where ngayHetHan = &#63;.
	*
	* @param ngayHetHan the ngay het han
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dot khuyen mai
	* @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException if a matching dot khuyen mai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMai findByNGAY_HH_First(
		java.util.Date ngayHetHan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException;

	/**
	* Returns the first dot khuyen mai in the ordered set where ngayHetHan = &#63;.
	*
	* @param ngayHetHan the ngay het han
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dot khuyen mai, or <code>null</code> if a matching dot khuyen mai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMai fetchByNGAY_HH_First(
		java.util.Date ngayHetHan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dot khuyen mai in the ordered set where ngayHetHan = &#63;.
	*
	* @param ngayHetHan the ngay het han
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dot khuyen mai
	* @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException if a matching dot khuyen mai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMai findByNGAY_HH_Last(
		java.util.Date ngayHetHan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException;

	/**
	* Returns the last dot khuyen mai in the ordered set where ngayHetHan = &#63;.
	*
	* @param ngayHetHan the ngay het han
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dot khuyen mai, or <code>null</code> if a matching dot khuyen mai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMai fetchByNGAY_HH_Last(
		java.util.Date ngayHetHan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dot khuyen mais before and after the current dot khuyen mai in the ordered set where ngayHetHan = &#63;.
	*
	* @param dotKhuyenMaiId the primary key of the current dot khuyen mai
	* @param ngayHetHan the ngay het han
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dot khuyen mai
	* @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException if a dot khuyen mai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMai[] findByNGAY_HH_PrevAndNext(
		long dotKhuyenMaiId, java.util.Date ngayHetHan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException;

	/**
	* Removes all the dot khuyen mais where ngayHetHan = &#63; from the database.
	*
	* @param ngayHetHan the ngay het han
	* @throws SystemException if a system exception occurred
	*/
	public void removeByNGAY_HH(java.util.Date ngayHetHan)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dot khuyen mais where ngayHetHan = &#63;.
	*
	* @param ngayHetHan the ngay het han
	* @return the number of matching dot khuyen mais
	* @throws SystemException if a system exception occurred
	*/
	public int countByNGAY_HH(java.util.Date ngayHetHan)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dot khuyen mais where ngayBatDau = &#63;.
	*
	* @param ngayBatDau the ngay bat dau
	* @return the matching dot khuyen mais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khuyenmai.model.DotKhuyenMai> findByNGAY_BD(
		java.util.Date ngayBatDau)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dot khuyen mais where ngayBatDau = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ngayBatDau the ngay bat dau
	* @param start the lower bound of the range of dot khuyen mais
	* @param end the upper bound of the range of dot khuyen mais (not inclusive)
	* @return the range of matching dot khuyen mais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khuyenmai.model.DotKhuyenMai> findByNGAY_BD(
		java.util.Date ngayBatDau, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dot khuyen mais where ngayBatDau = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ngayBatDau the ngay bat dau
	* @param start the lower bound of the range of dot khuyen mais
	* @param end the upper bound of the range of dot khuyen mais (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dot khuyen mais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khuyenmai.model.DotKhuyenMai> findByNGAY_BD(
		java.util.Date ngayBatDau, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dot khuyen mai in the ordered set where ngayBatDau = &#63;.
	*
	* @param ngayBatDau the ngay bat dau
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dot khuyen mai
	* @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException if a matching dot khuyen mai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMai findByNGAY_BD_First(
		java.util.Date ngayBatDau,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException;

	/**
	* Returns the first dot khuyen mai in the ordered set where ngayBatDau = &#63;.
	*
	* @param ngayBatDau the ngay bat dau
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dot khuyen mai, or <code>null</code> if a matching dot khuyen mai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMai fetchByNGAY_BD_First(
		java.util.Date ngayBatDau,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dot khuyen mai in the ordered set where ngayBatDau = &#63;.
	*
	* @param ngayBatDau the ngay bat dau
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dot khuyen mai
	* @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException if a matching dot khuyen mai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMai findByNGAY_BD_Last(
		java.util.Date ngayBatDau,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException;

	/**
	* Returns the last dot khuyen mai in the ordered set where ngayBatDau = &#63;.
	*
	* @param ngayBatDau the ngay bat dau
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dot khuyen mai, or <code>null</code> if a matching dot khuyen mai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMai fetchByNGAY_BD_Last(
		java.util.Date ngayBatDau,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dot khuyen mais before and after the current dot khuyen mai in the ordered set where ngayBatDau = &#63;.
	*
	* @param dotKhuyenMaiId the primary key of the current dot khuyen mai
	* @param ngayBatDau the ngay bat dau
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dot khuyen mai
	* @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException if a dot khuyen mai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMai[] findByNGAY_BD_PrevAndNext(
		long dotKhuyenMaiId, java.util.Date ngayBatDau,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException;

	/**
	* Removes all the dot khuyen mais where ngayBatDau = &#63; from the database.
	*
	* @param ngayBatDau the ngay bat dau
	* @throws SystemException if a system exception occurred
	*/
	public void removeByNGAY_BD(java.util.Date ngayBatDau)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dot khuyen mais where ngayBatDau = &#63;.
	*
	* @param ngayBatDau the ngay bat dau
	* @return the number of matching dot khuyen mais
	* @throws SystemException if a system exception occurred
	*/
	public int countByNGAY_BD(java.util.Date ngayBatDau)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dot khuyen mai in the entity cache if it is enabled.
	*
	* @param dotKhuyenMai the dot khuyen mai
	*/
	public void cacheResult(
		com.minimart.portlet.khuyenmai.model.DotKhuyenMai dotKhuyenMai);

	/**
	* Caches the dot khuyen mais in the entity cache if it is enabled.
	*
	* @param dotKhuyenMais the dot khuyen mais
	*/
	public void cacheResult(
		java.util.List<com.minimart.portlet.khuyenmai.model.DotKhuyenMai> dotKhuyenMais);

	/**
	* Creates a new dot khuyen mai with the primary key. Does not add the dot khuyen mai to the database.
	*
	* @param dotKhuyenMaiId the primary key for the new dot khuyen mai
	* @return the new dot khuyen mai
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMai create(
		long dotKhuyenMaiId);

	/**
	* Removes the dot khuyen mai with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dotKhuyenMaiId the primary key of the dot khuyen mai
	* @return the dot khuyen mai that was removed
	* @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException if a dot khuyen mai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMai remove(
		long dotKhuyenMaiId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException;

	public com.minimart.portlet.khuyenmai.model.DotKhuyenMai updateImpl(
		com.minimart.portlet.khuyenmai.model.DotKhuyenMai dotKhuyenMai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dot khuyen mai with the primary key or throws a {@link com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException} if it could not be found.
	*
	* @param dotKhuyenMaiId the primary key of the dot khuyen mai
	* @return the dot khuyen mai
	* @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException if a dot khuyen mai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMai findByPrimaryKey(
		long dotKhuyenMaiId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException;

	/**
	* Returns the dot khuyen mai with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dotKhuyenMaiId the primary key of the dot khuyen mai
	* @return the dot khuyen mai, or <code>null</code> if a dot khuyen mai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMai fetchByPrimaryKey(
		long dotKhuyenMaiId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dot khuyen mais.
	*
	* @return the dot khuyen mais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khuyenmai.model.DotKhuyenMai> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dot khuyen mais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dot khuyen mais
	* @param end the upper bound of the range of dot khuyen mais (not inclusive)
	* @return the range of dot khuyen mais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khuyenmai.model.DotKhuyenMai> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dot khuyen mais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dot khuyen mais
	* @param end the upper bound of the range of dot khuyen mais (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dot khuyen mais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khuyenmai.model.DotKhuyenMai> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dot khuyen mais from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dot khuyen mais.
	*
	* @return the number of dot khuyen mais
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}