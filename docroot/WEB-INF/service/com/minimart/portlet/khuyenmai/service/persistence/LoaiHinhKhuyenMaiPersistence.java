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

import com.minimart.portlet.khuyenmai.model.LoaiHinhKhuyenMai;

/**
 * The persistence interface for the loai hinh khuyen mai service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see LoaiHinhKhuyenMaiPersistenceImpl
 * @see LoaiHinhKhuyenMaiUtil
 * @generated
 */
public interface LoaiHinhKhuyenMaiPersistence extends BasePersistence<LoaiHinhKhuyenMai> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LoaiHinhKhuyenMaiUtil} to access the loai hinh khuyen mai persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the loai hinh khuyen mais where ten = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param trangThai the trang thai
	* @return the matching loai hinh khuyen mais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khuyenmai.model.LoaiHinhKhuyenMai> findByTEN_TH(
		java.lang.String ten, boolean trangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the loai hinh khuyen mais where ten = &#63; and trangThai = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.LoaiHinhKhuyenMaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param trangThai the trang thai
	* @param start the lower bound of the range of loai hinh khuyen mais
	* @param end the upper bound of the range of loai hinh khuyen mais (not inclusive)
	* @return the range of matching loai hinh khuyen mais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khuyenmai.model.LoaiHinhKhuyenMai> findByTEN_TH(
		java.lang.String ten, boolean trangThai, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the loai hinh khuyen mais where ten = &#63; and trangThai = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.LoaiHinhKhuyenMaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param trangThai the trang thai
	* @param start the lower bound of the range of loai hinh khuyen mais
	* @param end the upper bound of the range of loai hinh khuyen mais (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching loai hinh khuyen mais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khuyenmai.model.LoaiHinhKhuyenMai> findByTEN_TH(
		java.lang.String ten, boolean trangThai, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first loai hinh khuyen mai in the ordered set where ten = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching loai hinh khuyen mai
	* @throws com.minimart.portlet.khuyenmai.NoSuchLoaiHinhKhuyenMaiException if a matching loai hinh khuyen mai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.LoaiHinhKhuyenMai findByTEN_TH_First(
		java.lang.String ten, boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khuyenmai.NoSuchLoaiHinhKhuyenMaiException;

	/**
	* Returns the first loai hinh khuyen mai in the ordered set where ten = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching loai hinh khuyen mai, or <code>null</code> if a matching loai hinh khuyen mai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.LoaiHinhKhuyenMai fetchByTEN_TH_First(
		java.lang.String ten, boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last loai hinh khuyen mai in the ordered set where ten = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching loai hinh khuyen mai
	* @throws com.minimart.portlet.khuyenmai.NoSuchLoaiHinhKhuyenMaiException if a matching loai hinh khuyen mai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.LoaiHinhKhuyenMai findByTEN_TH_Last(
		java.lang.String ten, boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khuyenmai.NoSuchLoaiHinhKhuyenMaiException;

	/**
	* Returns the last loai hinh khuyen mai in the ordered set where ten = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching loai hinh khuyen mai, or <code>null</code> if a matching loai hinh khuyen mai could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.LoaiHinhKhuyenMai fetchByTEN_TH_Last(
		java.lang.String ten, boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the loai hinh khuyen mais before and after the current loai hinh khuyen mai in the ordered set where ten = &#63; and trangThai = &#63;.
	*
	* @param loaiHinhKhuyenMaiId the primary key of the current loai hinh khuyen mai
	* @param ten the ten
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next loai hinh khuyen mai
	* @throws com.minimart.portlet.khuyenmai.NoSuchLoaiHinhKhuyenMaiException if a loai hinh khuyen mai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.LoaiHinhKhuyenMai[] findByTEN_TH_PrevAndNext(
		long loaiHinhKhuyenMaiId, java.lang.String ten, boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khuyenmai.NoSuchLoaiHinhKhuyenMaiException;

	/**
	* Removes all the loai hinh khuyen mais where ten = &#63; and trangThai = &#63; from the database.
	*
	* @param ten the ten
	* @param trangThai the trang thai
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTEN_TH(java.lang.String ten, boolean trangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of loai hinh khuyen mais where ten = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param trangThai the trang thai
	* @return the number of matching loai hinh khuyen mais
	* @throws SystemException if a system exception occurred
	*/
	public int countByTEN_TH(java.lang.String ten, boolean trangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the loai hinh khuyen mai in the entity cache if it is enabled.
	*
	* @param loaiHinhKhuyenMai the loai hinh khuyen mai
	*/
	public void cacheResult(
		com.minimart.portlet.khuyenmai.model.LoaiHinhKhuyenMai loaiHinhKhuyenMai);

	/**
	* Caches the loai hinh khuyen mais in the entity cache if it is enabled.
	*
	* @param loaiHinhKhuyenMais the loai hinh khuyen mais
	*/
	public void cacheResult(
		java.util.List<com.minimart.portlet.khuyenmai.model.LoaiHinhKhuyenMai> loaiHinhKhuyenMais);

	/**
	* Creates a new loai hinh khuyen mai with the primary key. Does not add the loai hinh khuyen mai to the database.
	*
	* @param loaiHinhKhuyenMaiId the primary key for the new loai hinh khuyen mai
	* @return the new loai hinh khuyen mai
	*/
	public com.minimart.portlet.khuyenmai.model.LoaiHinhKhuyenMai create(
		long loaiHinhKhuyenMaiId);

	/**
	* Removes the loai hinh khuyen mai with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param loaiHinhKhuyenMaiId the primary key of the loai hinh khuyen mai
	* @return the loai hinh khuyen mai that was removed
	* @throws com.minimart.portlet.khuyenmai.NoSuchLoaiHinhKhuyenMaiException if a loai hinh khuyen mai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.LoaiHinhKhuyenMai remove(
		long loaiHinhKhuyenMaiId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khuyenmai.NoSuchLoaiHinhKhuyenMaiException;

	public com.minimart.portlet.khuyenmai.model.LoaiHinhKhuyenMai updateImpl(
		com.minimart.portlet.khuyenmai.model.LoaiHinhKhuyenMai loaiHinhKhuyenMai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the loai hinh khuyen mai with the primary key or throws a {@link com.minimart.portlet.khuyenmai.NoSuchLoaiHinhKhuyenMaiException} if it could not be found.
	*
	* @param loaiHinhKhuyenMaiId the primary key of the loai hinh khuyen mai
	* @return the loai hinh khuyen mai
	* @throws com.minimart.portlet.khuyenmai.NoSuchLoaiHinhKhuyenMaiException if a loai hinh khuyen mai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.LoaiHinhKhuyenMai findByPrimaryKey(
		long loaiHinhKhuyenMaiId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.khuyenmai.NoSuchLoaiHinhKhuyenMaiException;

	/**
	* Returns the loai hinh khuyen mai with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param loaiHinhKhuyenMaiId the primary key of the loai hinh khuyen mai
	* @return the loai hinh khuyen mai, or <code>null</code> if a loai hinh khuyen mai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.khuyenmai.model.LoaiHinhKhuyenMai fetchByPrimaryKey(
		long loaiHinhKhuyenMaiId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the loai hinh khuyen mais.
	*
	* @return the loai hinh khuyen mais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khuyenmai.model.LoaiHinhKhuyenMai> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the loai hinh khuyen mais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.LoaiHinhKhuyenMaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of loai hinh khuyen mais
	* @param end the upper bound of the range of loai hinh khuyen mais (not inclusive)
	* @return the range of loai hinh khuyen mais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khuyenmai.model.LoaiHinhKhuyenMai> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the loai hinh khuyen mais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.LoaiHinhKhuyenMaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of loai hinh khuyen mais
	* @param end the upper bound of the range of loai hinh khuyen mais (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of loai hinh khuyen mais
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.khuyenmai.model.LoaiHinhKhuyenMai> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the loai hinh khuyen mais from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of loai hinh khuyen mais.
	*
	* @return the number of loai hinh khuyen mais
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}