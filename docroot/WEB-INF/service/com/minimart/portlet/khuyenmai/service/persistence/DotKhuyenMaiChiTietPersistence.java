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

import com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet;

/**
 * The persistence interface for the dot khuyen mai chi tiet service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see DotKhuyenMaiChiTietPersistenceImpl
 * @see DotKhuyenMaiChiTietUtil
 * @generated
 */
public interface DotKhuyenMaiChiTietPersistence extends BasePersistence<DotKhuyenMaiChiTiet> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DotKhuyenMaiChiTietUtil} to access the dot khuyen mai chi tiet persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dot khuyen mai chi tiets where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63;.
	*
	* @param dotKhuyenMaiId the dot khuyen mai ID
	* @param nhomMatHangId the nhom mat hang ID
	* @return the matching dot khuyen mai chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet> findByDKMID_NMHID(
		long dotKhuyenMaiId, long nhomMatHangId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dot khuyen mai chi tiets where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dotKhuyenMaiId the dot khuyen mai ID
	* @param nhomMatHangId the nhom mat hang ID
	* @param start the lower bound of the range of dot khuyen mai chi tiets
	* @param end the upper bound of the range of dot khuyen mai chi tiets (not inclusive)
	* @return the range of matching dot khuyen mai chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet> findByDKMID_NMHID(
		long dotKhuyenMaiId, long nhomMatHangId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dot khuyen mai chi tiets where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dotKhuyenMaiId the dot khuyen mai ID
	* @param nhomMatHangId the nhom mat hang ID
	* @param start the lower bound of the range of dot khuyen mai chi tiets
	* @param end the upper bound of the range of dot khuyen mai chi tiets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dot khuyen mai chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet> findByDKMID_NMHID(
		long dotKhuyenMaiId, long nhomMatHangId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dot khuyen mai chi tiet in the ordered set where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63;.
	*
	* @param dotKhuyenMaiId the dot khuyen mai ID
	* @param nhomMatHangId the nhom mat hang ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dot khuyen mai chi tiet
	* @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiChiTietException if a matching dot khuyen mai chi tiet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet findByDKMID_NMHID_First(
		long dotKhuyenMaiId, long nhomMatHangId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiChiTietException;

	/**
	* Returns the first dot khuyen mai chi tiet in the ordered set where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63;.
	*
	* @param dotKhuyenMaiId the dot khuyen mai ID
	* @param nhomMatHangId the nhom mat hang ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dot khuyen mai chi tiet, or <code>null</code> if a matching dot khuyen mai chi tiet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet fetchByDKMID_NMHID_First(
		long dotKhuyenMaiId, long nhomMatHangId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dot khuyen mai chi tiet in the ordered set where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63;.
	*
	* @param dotKhuyenMaiId the dot khuyen mai ID
	* @param nhomMatHangId the nhom mat hang ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dot khuyen mai chi tiet
	* @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiChiTietException if a matching dot khuyen mai chi tiet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet findByDKMID_NMHID_Last(
		long dotKhuyenMaiId, long nhomMatHangId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiChiTietException;

	/**
	* Returns the last dot khuyen mai chi tiet in the ordered set where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63;.
	*
	* @param dotKhuyenMaiId the dot khuyen mai ID
	* @param nhomMatHangId the nhom mat hang ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dot khuyen mai chi tiet, or <code>null</code> if a matching dot khuyen mai chi tiet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet fetchByDKMID_NMHID_Last(
		long dotKhuyenMaiId, long nhomMatHangId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dot khuyen mai chi tiets before and after the current dot khuyen mai chi tiet in the ordered set where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63;.
	*
	* @param dotKhuyenMaiChiTietId the primary key of the current dot khuyen mai chi tiet
	* @param dotKhuyenMaiId the dot khuyen mai ID
	* @param nhomMatHangId the nhom mat hang ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dot khuyen mai chi tiet
	* @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiChiTietException if a dot khuyen mai chi tiet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet[] findByDKMID_NMHID_PrevAndNext(
		long dotKhuyenMaiChiTietId, long dotKhuyenMaiId, long nhomMatHangId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiChiTietException;

	/**
	* Removes all the dot khuyen mai chi tiets where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63; from the database.
	*
	* @param dotKhuyenMaiId the dot khuyen mai ID
	* @param nhomMatHangId the nhom mat hang ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDKMID_NMHID(long dotKhuyenMaiId, long nhomMatHangId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dot khuyen mai chi tiets where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63;.
	*
	* @param dotKhuyenMaiId the dot khuyen mai ID
	* @param nhomMatHangId the nhom mat hang ID
	* @return the number of matching dot khuyen mai chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public int countByDKMID_NMHID(long dotKhuyenMaiId, long nhomMatHangId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dot khuyen mai chi tiets where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63; and matHangId = &#63;.
	*
	* @param dotKhuyenMaiId the dot khuyen mai ID
	* @param nhomMatHangId the nhom mat hang ID
	* @param matHangId the mat hang ID
	* @return the matching dot khuyen mai chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet> findByDKMID_NMHID_MHID(
		long dotKhuyenMaiId, long nhomMatHangId, long matHangId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dot khuyen mai chi tiets where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63; and matHangId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dotKhuyenMaiId the dot khuyen mai ID
	* @param nhomMatHangId the nhom mat hang ID
	* @param matHangId the mat hang ID
	* @param start the lower bound of the range of dot khuyen mai chi tiets
	* @param end the upper bound of the range of dot khuyen mai chi tiets (not inclusive)
	* @return the range of matching dot khuyen mai chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet> findByDKMID_NMHID_MHID(
		long dotKhuyenMaiId, long nhomMatHangId, long matHangId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dot khuyen mai chi tiets where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63; and matHangId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dotKhuyenMaiId the dot khuyen mai ID
	* @param nhomMatHangId the nhom mat hang ID
	* @param matHangId the mat hang ID
	* @param start the lower bound of the range of dot khuyen mai chi tiets
	* @param end the upper bound of the range of dot khuyen mai chi tiets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dot khuyen mai chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet> findByDKMID_NMHID_MHID(
		long dotKhuyenMaiId, long nhomMatHangId, long matHangId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first dot khuyen mai chi tiet in the ordered set where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63; and matHangId = &#63;.
	*
	* @param dotKhuyenMaiId the dot khuyen mai ID
	* @param nhomMatHangId the nhom mat hang ID
	* @param matHangId the mat hang ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dot khuyen mai chi tiet
	* @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiChiTietException if a matching dot khuyen mai chi tiet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet findByDKMID_NMHID_MHID_First(
		long dotKhuyenMaiId, long nhomMatHangId, long matHangId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiChiTietException;

	/**
	* Returns the first dot khuyen mai chi tiet in the ordered set where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63; and matHangId = &#63;.
	*
	* @param dotKhuyenMaiId the dot khuyen mai ID
	* @param nhomMatHangId the nhom mat hang ID
	* @param matHangId the mat hang ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dot khuyen mai chi tiet, or <code>null</code> if a matching dot khuyen mai chi tiet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet fetchByDKMID_NMHID_MHID_First(
		long dotKhuyenMaiId, long nhomMatHangId, long matHangId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last dot khuyen mai chi tiet in the ordered set where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63; and matHangId = &#63;.
	*
	* @param dotKhuyenMaiId the dot khuyen mai ID
	* @param nhomMatHangId the nhom mat hang ID
	* @param matHangId the mat hang ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dot khuyen mai chi tiet
	* @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiChiTietException if a matching dot khuyen mai chi tiet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet findByDKMID_NMHID_MHID_Last(
		long dotKhuyenMaiId, long nhomMatHangId, long matHangId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiChiTietException;

	/**
	* Returns the last dot khuyen mai chi tiet in the ordered set where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63; and matHangId = &#63;.
	*
	* @param dotKhuyenMaiId the dot khuyen mai ID
	* @param nhomMatHangId the nhom mat hang ID
	* @param matHangId the mat hang ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dot khuyen mai chi tiet, or <code>null</code> if a matching dot khuyen mai chi tiet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet fetchByDKMID_NMHID_MHID_Last(
		long dotKhuyenMaiId, long nhomMatHangId, long matHangId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dot khuyen mai chi tiets before and after the current dot khuyen mai chi tiet in the ordered set where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63; and matHangId = &#63;.
	*
	* @param dotKhuyenMaiChiTietId the primary key of the current dot khuyen mai chi tiet
	* @param dotKhuyenMaiId the dot khuyen mai ID
	* @param nhomMatHangId the nhom mat hang ID
	* @param matHangId the mat hang ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dot khuyen mai chi tiet
	* @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiChiTietException if a dot khuyen mai chi tiet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet[] findByDKMID_NMHID_MHID_PrevAndNext(
		long dotKhuyenMaiChiTietId, long dotKhuyenMaiId, long nhomMatHangId,
		long matHangId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiChiTietException;

	/**
	* Removes all the dot khuyen mai chi tiets where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63; and matHangId = &#63; from the database.
	*
	* @param dotKhuyenMaiId the dot khuyen mai ID
	* @param nhomMatHangId the nhom mat hang ID
	* @param matHangId the mat hang ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDKMID_NMHID_MHID(long dotKhuyenMaiId,
		long nhomMatHangId, long matHangId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dot khuyen mai chi tiets where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63; and matHangId = &#63;.
	*
	* @param dotKhuyenMaiId the dot khuyen mai ID
	* @param nhomMatHangId the nhom mat hang ID
	* @param matHangId the mat hang ID
	* @return the number of matching dot khuyen mai chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public int countByDKMID_NMHID_MHID(long dotKhuyenMaiId, long nhomMatHangId,
		long matHangId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the dot khuyen mai chi tiet in the entity cache if it is enabled.
	*
	* @param dotKhuyenMaiChiTiet the dot khuyen mai chi tiet
	*/
	public void cacheResult(
		com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet);

	/**
	* Caches the dot khuyen mai chi tiets in the entity cache if it is enabled.
	*
	* @param dotKhuyenMaiChiTiets the dot khuyen mai chi tiets
	*/
	public void cacheResult(
		java.util.List<com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet> dotKhuyenMaiChiTiets);

	/**
	* Creates a new dot khuyen mai chi tiet with the primary key. Does not add the dot khuyen mai chi tiet to the database.
	*
	* @param dotKhuyenMaiChiTietId the primary key for the new dot khuyen mai chi tiet
	* @return the new dot khuyen mai chi tiet
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet create(
		long dotKhuyenMaiChiTietId);

	/**
	* Removes the dot khuyen mai chi tiet with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dotKhuyenMaiChiTietId the primary key of the dot khuyen mai chi tiet
	* @return the dot khuyen mai chi tiet that was removed
	* @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiChiTietException if a dot khuyen mai chi tiet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet remove(
		long dotKhuyenMaiChiTietId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiChiTietException;

	public com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet updateImpl(
		com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the dot khuyen mai chi tiet with the primary key or throws a {@link com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiChiTietException} if it could not be found.
	*
	* @param dotKhuyenMaiChiTietId the primary key of the dot khuyen mai chi tiet
	* @return the dot khuyen mai chi tiet
	* @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiChiTietException if a dot khuyen mai chi tiet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet findByPrimaryKey(
		long dotKhuyenMaiChiTietId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiChiTietException;

	/**
	* Returns the dot khuyen mai chi tiet with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param dotKhuyenMaiChiTietId the primary key of the dot khuyen mai chi tiet
	* @return the dot khuyen mai chi tiet, or <code>null</code> if a dot khuyen mai chi tiet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet fetchByPrimaryKey(
		long dotKhuyenMaiChiTietId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the dot khuyen mai chi tiets.
	*
	* @return the dot khuyen mai chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the dot khuyen mai chi tiets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dot khuyen mai chi tiets
	* @param end the upper bound of the range of dot khuyen mai chi tiets (not inclusive)
	* @return the range of dot khuyen mai chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the dot khuyen mai chi tiets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dot khuyen mai chi tiets
	* @param end the upper bound of the range of dot khuyen mai chi tiets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dot khuyen mai chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the dot khuyen mai chi tiets from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of dot khuyen mai chi tiets.
	*
	* @return the number of dot khuyen mai chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}