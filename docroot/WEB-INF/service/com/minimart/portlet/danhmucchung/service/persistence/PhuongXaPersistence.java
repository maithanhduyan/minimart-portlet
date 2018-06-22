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

import com.minimart.portlet.danhmucchung.model.PhuongXa;

/**
 * The persistence interface for the phuong xa service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see PhuongXaPersistenceImpl
 * @see PhuongXaUtil
 * @generated
 */
public interface PhuongXaPersistence extends BasePersistence<PhuongXa> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PhuongXaUtil} to access the phuong xa persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the phuong xa where ten = &#63; or throws a {@link com.minimart.portlet.danhmucchung.NoSuchPhuongXaException} if it could not be found.
	*
	* @param ten the ten
	* @return the matching phuong xa
	* @throws com.minimart.portlet.danhmucchung.NoSuchPhuongXaException if a matching phuong xa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.PhuongXa findByTEN(
		java.lang.String ten)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.danhmucchung.NoSuchPhuongXaException;

	/**
	* Returns the phuong xa where ten = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param ten the ten
	* @return the matching phuong xa, or <code>null</code> if a matching phuong xa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.PhuongXa fetchByTEN(
		java.lang.String ten)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the phuong xa where ten = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param ten the ten
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching phuong xa, or <code>null</code> if a matching phuong xa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.PhuongXa fetchByTEN(
		java.lang.String ten, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the phuong xa where ten = &#63; from the database.
	*
	* @param ten the ten
	* @return the phuong xa that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.PhuongXa removeByTEN(
		java.lang.String ten)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.danhmucchung.NoSuchPhuongXaException;

	/**
	* Returns the number of phuong xas where ten = &#63;.
	*
	* @param ten the ten
	* @return the number of matching phuong xas
	* @throws SystemException if a system exception occurred
	*/
	public int countByTEN(java.lang.String ten)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the phuong xa where ma = &#63; or throws a {@link com.minimart.portlet.danhmucchung.NoSuchPhuongXaException} if it could not be found.
	*
	* @param ma the ma
	* @return the matching phuong xa
	* @throws com.minimart.portlet.danhmucchung.NoSuchPhuongXaException if a matching phuong xa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.PhuongXa findByMA(
		java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.danhmucchung.NoSuchPhuongXaException;

	/**
	* Returns the phuong xa where ma = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param ma the ma
	* @return the matching phuong xa, or <code>null</code> if a matching phuong xa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.PhuongXa fetchByMA(
		java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the phuong xa where ma = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param ma the ma
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching phuong xa, or <code>null</code> if a matching phuong xa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.PhuongXa fetchByMA(
		java.lang.String ma, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the phuong xa where ma = &#63; from the database.
	*
	* @param ma the ma
	* @return the phuong xa that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.PhuongXa removeByMA(
		java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.danhmucchung.NoSuchPhuongXaException;

	/**
	* Returns the number of phuong xas where ma = &#63;.
	*
	* @param ma the ma
	* @return the number of matching phuong xas
	* @throws SystemException if a system exception occurred
	*/
	public int countByMA(java.lang.String ma)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the phuong xas where ten = &#63; and ma = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param trangThai the trang thai
	* @return the matching phuong xas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.danhmucchung.model.PhuongXa> findByTEN_MA_TT(
		java.lang.String ten, java.lang.String ma, boolean trangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the phuong xas where ten = &#63; and ma = &#63; and trangThai = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.PhuongXaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param ma the ma
	* @param trangThai the trang thai
	* @param start the lower bound of the range of phuong xas
	* @param end the upper bound of the range of phuong xas (not inclusive)
	* @return the range of matching phuong xas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.danhmucchung.model.PhuongXa> findByTEN_MA_TT(
		java.lang.String ten, java.lang.String ma, boolean trangThai,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the phuong xas where ten = &#63; and ma = &#63; and trangThai = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.PhuongXaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param ma the ma
	* @param trangThai the trang thai
	* @param start the lower bound of the range of phuong xas
	* @param end the upper bound of the range of phuong xas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching phuong xas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.danhmucchung.model.PhuongXa> findByTEN_MA_TT(
		java.lang.String ten, java.lang.String ma, boolean trangThai,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first phuong xa in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching phuong xa
	* @throws com.minimart.portlet.danhmucchung.NoSuchPhuongXaException if a matching phuong xa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.PhuongXa findByTEN_MA_TT_First(
		java.lang.String ten, java.lang.String ma, boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.danhmucchung.NoSuchPhuongXaException;

	/**
	* Returns the first phuong xa in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching phuong xa, or <code>null</code> if a matching phuong xa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.PhuongXa fetchByTEN_MA_TT_First(
		java.lang.String ten, java.lang.String ma, boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last phuong xa in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching phuong xa
	* @throws com.minimart.portlet.danhmucchung.NoSuchPhuongXaException if a matching phuong xa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.PhuongXa findByTEN_MA_TT_Last(
		java.lang.String ten, java.lang.String ma, boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.danhmucchung.NoSuchPhuongXaException;

	/**
	* Returns the last phuong xa in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching phuong xa, or <code>null</code> if a matching phuong xa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.PhuongXa fetchByTEN_MA_TT_Last(
		java.lang.String ten, java.lang.String ma, boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the phuong xas before and after the current phuong xa in the ordered set where ten = &#63; and ma = &#63; and trangThai = &#63;.
	*
	* @param phuongXaId the primary key of the current phuong xa
	* @param ten the ten
	* @param ma the ma
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next phuong xa
	* @throws com.minimart.portlet.danhmucchung.NoSuchPhuongXaException if a phuong xa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.PhuongXa[] findByTEN_MA_TT_PrevAndNext(
		long phuongXaId, java.lang.String ten, java.lang.String ma,
		boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.danhmucchung.NoSuchPhuongXaException;

	/**
	* Removes all the phuong xas where ten = &#63; and ma = &#63; and trangThai = &#63; from the database.
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
	* Returns the number of phuong xas where ten = &#63; and ma = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param ma the ma
	* @param trangThai the trang thai
	* @return the number of matching phuong xas
	* @throws SystemException if a system exception occurred
	*/
	public int countByTEN_MA_TT(java.lang.String ten, java.lang.String ma,
		boolean trangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the phuong xa in the entity cache if it is enabled.
	*
	* @param phuongXa the phuong xa
	*/
	public void cacheResult(
		com.minimart.portlet.danhmucchung.model.PhuongXa phuongXa);

	/**
	* Caches the phuong xas in the entity cache if it is enabled.
	*
	* @param phuongXas the phuong xas
	*/
	public void cacheResult(
		java.util.List<com.minimart.portlet.danhmucchung.model.PhuongXa> phuongXas);

	/**
	* Creates a new phuong xa with the primary key. Does not add the phuong xa to the database.
	*
	* @param phuongXaId the primary key for the new phuong xa
	* @return the new phuong xa
	*/
	public com.minimart.portlet.danhmucchung.model.PhuongXa create(
		long phuongXaId);

	/**
	* Removes the phuong xa with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param phuongXaId the primary key of the phuong xa
	* @return the phuong xa that was removed
	* @throws com.minimart.portlet.danhmucchung.NoSuchPhuongXaException if a phuong xa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.PhuongXa remove(
		long phuongXaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.danhmucchung.NoSuchPhuongXaException;

	public com.minimart.portlet.danhmucchung.model.PhuongXa updateImpl(
		com.minimart.portlet.danhmucchung.model.PhuongXa phuongXa)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the phuong xa with the primary key or throws a {@link com.minimart.portlet.danhmucchung.NoSuchPhuongXaException} if it could not be found.
	*
	* @param phuongXaId the primary key of the phuong xa
	* @return the phuong xa
	* @throws com.minimart.portlet.danhmucchung.NoSuchPhuongXaException if a phuong xa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.PhuongXa findByPrimaryKey(
		long phuongXaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.danhmucchung.NoSuchPhuongXaException;

	/**
	* Returns the phuong xa with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param phuongXaId the primary key of the phuong xa
	* @return the phuong xa, or <code>null</code> if a phuong xa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.danhmucchung.model.PhuongXa fetchByPrimaryKey(
		long phuongXaId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the phuong xas.
	*
	* @return the phuong xas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.danhmucchung.model.PhuongXa> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the phuong xas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.PhuongXaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of phuong xas
	* @param end the upper bound of the range of phuong xas (not inclusive)
	* @return the range of phuong xas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.danhmucchung.model.PhuongXa> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the phuong xas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.PhuongXaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of phuong xas
	* @param end the upper bound of the range of phuong xas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of phuong xas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.danhmucchung.model.PhuongXa> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the phuong xas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of phuong xas.
	*
	* @return the number of phuong xas
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}