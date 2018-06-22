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

import com.minimart.portlet.cuahang.model.TangCa;

/**
 * The persistence interface for the tang ca service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see TangCaPersistenceImpl
 * @see TangCaUtil
 * @generated
 */
public interface TangCaPersistence extends BasePersistence<TangCa> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TangCaUtil} to access the tang ca persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the tang cas where userId = &#63; and cuaHangId = &#63; and caLamViecId = &#63; and hoatDong = &#63;.
	*
	* @param userId the user ID
	* @param cuaHangId the cua hang ID
	* @param caLamViecId the ca lam viec ID
	* @param hoatDong the hoat dong
	* @return the matching tang cas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.cuahang.model.TangCa> findByUID_CH_CLV_HD(
		long userId, long cuaHangId, long caLamViecId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tang cas where userId = &#63; and cuaHangId = &#63; and caLamViecId = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.TangCaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param cuaHangId the cua hang ID
	* @param caLamViecId the ca lam viec ID
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of tang cas
	* @param end the upper bound of the range of tang cas (not inclusive)
	* @return the range of matching tang cas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.cuahang.model.TangCa> findByUID_CH_CLV_HD(
		long userId, long cuaHangId, long caLamViecId, boolean hoatDong,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tang cas where userId = &#63; and cuaHangId = &#63; and caLamViecId = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.TangCaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param cuaHangId the cua hang ID
	* @param caLamViecId the ca lam viec ID
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of tang cas
	* @param end the upper bound of the range of tang cas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tang cas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.cuahang.model.TangCa> findByUID_CH_CLV_HD(
		long userId, long cuaHangId, long caLamViecId, boolean hoatDong,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first tang ca in the ordered set where userId = &#63; and cuaHangId = &#63; and caLamViecId = &#63; and hoatDong = &#63;.
	*
	* @param userId the user ID
	* @param cuaHangId the cua hang ID
	* @param caLamViecId the ca lam viec ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tang ca
	* @throws com.minimart.portlet.cuahang.NoSuchTangCaException if a matching tang ca could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.TangCa findByUID_CH_CLV_HD_First(
		long userId, long cuaHangId, long caLamViecId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.cuahang.NoSuchTangCaException;

	/**
	* Returns the first tang ca in the ordered set where userId = &#63; and cuaHangId = &#63; and caLamViecId = &#63; and hoatDong = &#63;.
	*
	* @param userId the user ID
	* @param cuaHangId the cua hang ID
	* @param caLamViecId the ca lam viec ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tang ca, or <code>null</code> if a matching tang ca could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.TangCa fetchByUID_CH_CLV_HD_First(
		long userId, long cuaHangId, long caLamViecId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last tang ca in the ordered set where userId = &#63; and cuaHangId = &#63; and caLamViecId = &#63; and hoatDong = &#63;.
	*
	* @param userId the user ID
	* @param cuaHangId the cua hang ID
	* @param caLamViecId the ca lam viec ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tang ca
	* @throws com.minimart.portlet.cuahang.NoSuchTangCaException if a matching tang ca could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.TangCa findByUID_CH_CLV_HD_Last(
		long userId, long cuaHangId, long caLamViecId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.cuahang.NoSuchTangCaException;

	/**
	* Returns the last tang ca in the ordered set where userId = &#63; and cuaHangId = &#63; and caLamViecId = &#63; and hoatDong = &#63;.
	*
	* @param userId the user ID
	* @param cuaHangId the cua hang ID
	* @param caLamViecId the ca lam viec ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tang ca, or <code>null</code> if a matching tang ca could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.TangCa fetchByUID_CH_CLV_HD_Last(
		long userId, long cuaHangId, long caLamViecId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tang cas before and after the current tang ca in the ordered set where userId = &#63; and cuaHangId = &#63; and caLamViecId = &#63; and hoatDong = &#63;.
	*
	* @param tangCaId the primary key of the current tang ca
	* @param userId the user ID
	* @param cuaHangId the cua hang ID
	* @param caLamViecId the ca lam viec ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tang ca
	* @throws com.minimart.portlet.cuahang.NoSuchTangCaException if a tang ca with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.TangCa[] findByUID_CH_CLV_HD_PrevAndNext(
		long tangCaId, long userId, long cuaHangId, long caLamViecId,
		boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.cuahang.NoSuchTangCaException;

	/**
	* Removes all the tang cas where userId = &#63; and cuaHangId = &#63; and caLamViecId = &#63; and hoatDong = &#63; from the database.
	*
	* @param userId the user ID
	* @param cuaHangId the cua hang ID
	* @param caLamViecId the ca lam viec ID
	* @param hoatDong the hoat dong
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUID_CH_CLV_HD(long userId, long cuaHangId,
		long caLamViecId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tang cas where userId = &#63; and cuaHangId = &#63; and caLamViecId = &#63; and hoatDong = &#63;.
	*
	* @param userId the user ID
	* @param cuaHangId the cua hang ID
	* @param caLamViecId the ca lam viec ID
	* @param hoatDong the hoat dong
	* @return the number of matching tang cas
	* @throws SystemException if a system exception occurred
	*/
	public int countByUID_CH_CLV_HD(long userId, long cuaHangId,
		long caLamViecId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the tang ca in the entity cache if it is enabled.
	*
	* @param tangCa the tang ca
	*/
	public void cacheResult(com.minimart.portlet.cuahang.model.TangCa tangCa);

	/**
	* Caches the tang cas in the entity cache if it is enabled.
	*
	* @param tangCas the tang cas
	*/
	public void cacheResult(
		java.util.List<com.minimart.portlet.cuahang.model.TangCa> tangCas);

	/**
	* Creates a new tang ca with the primary key. Does not add the tang ca to the database.
	*
	* @param tangCaId the primary key for the new tang ca
	* @return the new tang ca
	*/
	public com.minimart.portlet.cuahang.model.TangCa create(long tangCaId);

	/**
	* Removes the tang ca with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tangCaId the primary key of the tang ca
	* @return the tang ca that was removed
	* @throws com.minimart.portlet.cuahang.NoSuchTangCaException if a tang ca with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.TangCa remove(long tangCaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.cuahang.NoSuchTangCaException;

	public com.minimart.portlet.cuahang.model.TangCa updateImpl(
		com.minimart.portlet.cuahang.model.TangCa tangCa)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the tang ca with the primary key or throws a {@link com.minimart.portlet.cuahang.NoSuchTangCaException} if it could not be found.
	*
	* @param tangCaId the primary key of the tang ca
	* @return the tang ca
	* @throws com.minimart.portlet.cuahang.NoSuchTangCaException if a tang ca with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.TangCa findByPrimaryKey(
		long tangCaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.cuahang.NoSuchTangCaException;

	/**
	* Returns the tang ca with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tangCaId the primary key of the tang ca
	* @return the tang ca, or <code>null</code> if a tang ca with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.cuahang.model.TangCa fetchByPrimaryKey(
		long tangCaId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tang cas.
	*
	* @return the tang cas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.cuahang.model.TangCa> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tang cas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.TangCaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tang cas
	* @param end the upper bound of the range of tang cas (not inclusive)
	* @return the range of tang cas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.cuahang.model.TangCa> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tang cas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.TangCaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tang cas
	* @param end the upper bound of the range of tang cas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tang cas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.cuahang.model.TangCa> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tang cas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tang cas.
	*
	* @return the number of tang cas
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}