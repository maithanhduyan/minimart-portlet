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

package com.minimart.portlet.danhmucchung.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.minimart.portlet.danhmucchung.model.TinhThanhPho;

/**
 * The persistence interface for the tinh thanh pho service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see TinhThanhPhoPersistenceImpl
 * @see TinhThanhPhoUtil
 * @generated
 */
public interface TinhThanhPhoPersistence extends BasePersistence<TinhThanhPho> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TinhThanhPhoUtil} to access the tinh thanh pho persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the tinh thanh pho where ten = &#63; or throws a {@link com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException} if it could not be found.
	*
	* @param ten the ten
	* @return the matching tinh thanh pho
	* @throws com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException if a matching tinh thanh pho could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.TinhThanhPho findByTEN(
		java.lang.String ten)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException;

	/**
	* Returns the tinh thanh pho where ten = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param ten the ten
	* @return the matching tinh thanh pho, or <code>null</code> if a matching tinh thanh pho could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.TinhThanhPho fetchByTEN(
		java.lang.String ten)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tinh thanh pho where ten = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param ten the ten
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tinh thanh pho, or <code>null</code> if a matching tinh thanh pho could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.TinhThanhPho fetchByTEN(
		java.lang.String ten, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the tinh thanh pho where ten = &#63; from the database.
	*
	* @param ten the ten
	* @return the tinh thanh pho that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.TinhThanhPho removeByTEN(
		java.lang.String ten)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException;

	/**
	* Returns the number of tinh thanh phos where ten = &#63;.
	*
	* @param ten the ten
	* @return the number of matching tinh thanh phos
	* @throws SystemException if a system exception occurred
	*/
	public int countByTEN(java.lang.String ten)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tinh thanh pho where ma = &#63; or throws a {@link com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException} if it could not be found.
	*
	* @param ma the ma
	* @return the matching tinh thanh pho
	* @throws com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException if a matching tinh thanh pho could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.TinhThanhPho findByMA(
		java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException;

	/**
	* Returns the tinh thanh pho where ma = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param ma the ma
	* @return the matching tinh thanh pho, or <code>null</code> if a matching tinh thanh pho could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.TinhThanhPho fetchByMA(
		java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tinh thanh pho where ma = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param ma the ma
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tinh thanh pho, or <code>null</code> if a matching tinh thanh pho could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.TinhThanhPho fetchByMA(
		java.lang.String ma, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the tinh thanh pho where ma = &#63; from the database.
	*
	* @param ma the ma
	* @return the tinh thanh pho that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.TinhThanhPho removeByMA(
		java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException;

	/**
	* Returns the number of tinh thanh phos where ma = &#63;.
	*
	* @param ma the ma
	* @return the number of matching tinh thanh phos
	* @throws SystemException if a system exception occurred
	*/
	public int countByMA(java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tinh thanh phos where ten = &#63; and ma = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param trangThai the trang thai
	* @return the matching tinh thanh phos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.danhmucchung.model.TinhThanhPho> findByTEN_MA_TT(
		java.lang.String ten, java.lang.String ma, boolean trangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tinh thanh phos where ten = &#63; and ma = &#63; and trangThai = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.TinhThanhPhoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param ma the ma
	* @param trangThai the trang thai
	* @param start the lower bound of the range of tinh thanh phos
	* @param end the upper bound of the range of tinh thanh phos (not inclusive)
	* @return the range of matching tinh thanh phos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.danhmucchung.model.TinhThanhPho> findByTEN_MA_TT(
		java.lang.String ten, java.lang.String ma, boolean trangThai,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tinh thanh phos where ten = &#63; and ma = &#63; and trangThai = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.TinhThanhPhoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param ma the ma
	* @param trangThai the trang thai
	* @param start the lower bound of the range of tinh thanh phos
	* @param end the upper bound of the range of tinh thanh phos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tinh thanh phos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.danhmucchung.model.TinhThanhPho> findByTEN_MA_TT(
		java.lang.String ten, java.lang.String ma, boolean trangThai,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tinh thanh pho in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tinh thanh pho
	* @throws com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException if a matching tinh thanh pho could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.TinhThanhPho findByTEN_MA_TT_First(
		java.lang.String ten, java.lang.String ma, boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException;

	/**
	* Returns the first tinh thanh pho in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tinh thanh pho, or <code>null</code> if a matching tinh thanh pho could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.TinhThanhPho fetchByTEN_MA_TT_First(
		java.lang.String ten, java.lang.String ma, boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tinh thanh pho in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tinh thanh pho
	* @throws com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException if a matching tinh thanh pho could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.TinhThanhPho findByTEN_MA_TT_Last(
		java.lang.String ten, java.lang.String ma, boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException;

	/**
	* Returns the last tinh thanh pho in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tinh thanh pho, or <code>null</code> if a matching tinh thanh pho could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.TinhThanhPho fetchByTEN_MA_TT_Last(
		java.lang.String ten, java.lang.String ma, boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tinh thanh phos before and after the current tinh thanh pho in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	*
	* @param tinhThanhPhoId the primary key of the current tinh thanh pho
	* @param ten the ten
	* @param ma the ma
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tinh thanh pho
	* @throws com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException if a tinh thanh pho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.TinhThanhPho[] findByTEN_MA_TT_PrevAndNext(
		long tinhThanhPhoId, java.lang.String ten, java.lang.String ma,
		boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException;

	/**
	* Removes all the tinh thanh phos where ten = &#63; and ma = &#63; and trangThai = &#63; from the database.
	*
	* @param ten the ten
	* @param ma the ma
	* @param trangThai the trang thai
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTEN_MA_TT(java.lang.String ten, java.lang.String ma,
		boolean trangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tinh thanh phos where ten = &#63; and ma = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param trangThai the trang thai
	* @return the number of matching tinh thanh phos
	* @throws SystemException if a system exception occurred
	*/
	public int countByTEN_MA_TT(java.lang.String ten, java.lang.String ma,
		boolean trangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the tinh thanh pho in the entity cache if it is enabled.
	*
	* @param tinhThanhPho the tinh thanh pho
	*/
	public void cacheResult(
		com.minimart.portlet.danhmucchung.model.TinhThanhPho tinhThanhPho);

	/**
	* Caches the tinh thanh phos in the entity cache if it is enabled.
	*
	* @param tinhThanhPhos the tinh thanh phos
	*/
	public void cacheResult(
		java.util.List<com.minimart.portlet.danhmucchung.model.TinhThanhPho> tinhThanhPhos);

	/**
	* Creates a new tinh thanh pho with the primary key. Does not add the tinh thanh pho to the database.
	*
	* @param tinhThanhPhoId the primary key for the new tinh thanh pho
	* @return the new tinh thanh pho
	*/
	public com.minimart.portlet.danhmucchung.model.TinhThanhPho create(
		long tinhThanhPhoId);

	/**
	* Removes the tinh thanh pho with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tinhThanhPhoId the primary key of the tinh thanh pho
	* @return the tinh thanh pho that was removed
	* @throws com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException if a tinh thanh pho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.TinhThanhPho remove(
		long tinhThanhPhoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException;

	public com.minimart.portlet.danhmucchung.model.TinhThanhPho updateImpl(
		com.minimart.portlet.danhmucchung.model.TinhThanhPho tinhThanhPho)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tinh thanh pho with the primary key or throws a {@link com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException} if it could not be found.
	*
	* @param tinhThanhPhoId the primary key of the tinh thanh pho
	* @return the tinh thanh pho
	* @throws com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException if a tinh thanh pho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.TinhThanhPho findByPrimaryKey(
		long tinhThanhPhoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.danhmucchung.NoSuchTinhThanhPhoException;

	/**
	* Returns the tinh thanh pho with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tinhThanhPhoId the primary key of the tinh thanh pho
	* @return the tinh thanh pho, or <code>null</code> if a tinh thanh pho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.TinhThanhPho fetchByPrimaryKey(
		long tinhThanhPhoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tinh thanh phos.
	*
	* @return the tinh thanh phos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.danhmucchung.model.TinhThanhPho> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tinh thanh phos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.TinhThanhPhoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tinh thanh phos
	* @param end the upper bound of the range of tinh thanh phos (not inclusive)
	* @return the range of tinh thanh phos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.danhmucchung.model.TinhThanhPho> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tinh thanh phos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.TinhThanhPhoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tinh thanh phos
	* @param end the upper bound of the range of tinh thanh phos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tinh thanh phos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.danhmucchung.model.TinhThanhPho> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tinh thanh phos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tinh thanh phos.
	*
	* @return the number of tinh thanh phos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}