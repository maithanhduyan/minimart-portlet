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

package com.minimart.portlet.cuahang.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.minimart.portlet.cuahang.model.CaLamViec;

/**
 * The persistence interface for the ca lam viec service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see CaLamViecPersistenceImpl
 * @see CaLamViecUtil
 * @generated
 */
public interface CaLamViecPersistence extends BasePersistence<CaLamViec> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CaLamViecUtil} to access the ca lam viec persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the ca lam viecs where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @return the matching ca lam viecs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.cuahang.model.CaLamViec> findByTEN_HD(
		java.lang.String ten, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the ca lam viecs where ten = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.CaLamViecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of ca lam viecs
	* @param end the upper bound of the range of ca lam viecs (not inclusive)
	* @return the range of matching ca lam viecs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.cuahang.model.CaLamViec> findByTEN_HD(
		java.lang.String ten, boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the ca lam viecs where ten = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.CaLamViecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of ca lam viecs
	* @param end the upper bound of the range of ca lam viecs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ca lam viecs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.cuahang.model.CaLamViec> findByTEN_HD(
		java.lang.String ten, boolean hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first ca lam viec in the ordered set where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ca lam viec
	* @throws com.minimart.portlet.cuahang.NoSuchCaLamViecException if a matching ca lam viec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.CaLamViec findByTEN_HD_First(
		java.lang.String ten, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.cuahang.NoSuchCaLamViecException;

	/**
	* Returns the first ca lam viec in the ordered set where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ca lam viec, or <code>null</code> if a matching ca lam viec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.CaLamViec fetchByTEN_HD_First(
		java.lang.String ten, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last ca lam viec in the ordered set where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ca lam viec
	* @throws com.minimart.portlet.cuahang.NoSuchCaLamViecException if a matching ca lam viec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.CaLamViec findByTEN_HD_Last(
		java.lang.String ten, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.cuahang.NoSuchCaLamViecException;

	/**
	* Returns the last ca lam viec in the ordered set where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ca lam viec, or <code>null</code> if a matching ca lam viec could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.CaLamViec fetchByTEN_HD_Last(
		java.lang.String ten, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the ca lam viecs before and after the current ca lam viec in the ordered set where ten = &#63; and hoatDong = &#63;.
	*
	* @param caLamViecId the primary key of the current ca lam viec
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ca lam viec
	* @throws com.minimart.portlet.cuahang.NoSuchCaLamViecException if a ca lam viec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.CaLamViec[] findByTEN_HD_PrevAndNext(
		long caLamViecId, java.lang.String ten, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.cuahang.NoSuchCaLamViecException;

	/**
	* Removes all the ca lam viecs where ten = &#63; and hoatDong = &#63; from the database.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTEN_HD(java.lang.String ten, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of ca lam viecs where ten = &#63; and hoatDong = &#63;.
	*
	* @param ten the ten
	* @param hoatDong the hoat dong
	* @return the number of matching ca lam viecs
	* @throws SystemException if a system exception occurred
	*/
	public int countByTEN_HD(java.lang.String ten, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the ca lam viec in the entity cache if it is enabled.
	*
	* @param caLamViec the ca lam viec
	*/
	public void cacheResult(
		com.minimart.portlet.cuahang.model.CaLamViec caLamViec);

	/**
	* Caches the ca lam viecs in the entity cache if it is enabled.
	*
	* @param caLamViecs the ca lam viecs
	*/
	public void cacheResult(
		java.util.List<com.minimart.portlet.cuahang.model.CaLamViec> caLamViecs);

	/**
	* Creates a new ca lam viec with the primary key. Does not add the ca lam viec to the database.
	*
	* @param caLamViecId the primary key for the new ca lam viec
	* @return the new ca lam viec
	*/
	public com.minimart.portlet.cuahang.model.CaLamViec create(long caLamViecId);

	/**
	* Removes the ca lam viec with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param caLamViecId the primary key of the ca lam viec
	* @return the ca lam viec that was removed
	* @throws com.minimart.portlet.cuahang.NoSuchCaLamViecException if a ca lam viec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.CaLamViec remove(long caLamViecId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.cuahang.NoSuchCaLamViecException;

	public com.minimart.portlet.cuahang.model.CaLamViec updateImpl(
		com.minimart.portlet.cuahang.model.CaLamViec caLamViec)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the ca lam viec with the primary key or throws a {@link com.minimart.portlet.cuahang.NoSuchCaLamViecException} if it could not be found.
	*
	* @param caLamViecId the primary key of the ca lam viec
	* @return the ca lam viec
	* @throws com.minimart.portlet.cuahang.NoSuchCaLamViecException if a ca lam viec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.CaLamViec findByPrimaryKey(
		long caLamViecId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.cuahang.NoSuchCaLamViecException;

	/**
	* Returns the ca lam viec with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param caLamViecId the primary key of the ca lam viec
	* @return the ca lam viec, or <code>null</code> if a ca lam viec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.CaLamViec fetchByPrimaryKey(
		long caLamViecId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the ca lam viecs.
	*
	* @return the ca lam viecs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.cuahang.model.CaLamViec> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the ca lam viecs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.CaLamViecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ca lam viecs
	* @param end the upper bound of the range of ca lam viecs (not inclusive)
	* @return the range of ca lam viecs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.cuahang.model.CaLamViec> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the ca lam viecs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.CaLamViecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ca lam viecs
	* @param end the upper bound of the range of ca lam viecs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ca lam viecs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.cuahang.model.CaLamViec> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the ca lam viecs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of ca lam viecs.
	*
	* @return the number of ca lam viecs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}