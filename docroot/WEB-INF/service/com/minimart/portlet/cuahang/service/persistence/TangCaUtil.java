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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.minimart.portlet.cuahang.model.TangCa;

import java.util.List;

/**
 * The persistence utility for the tang ca service. This utility wraps {@link TangCaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see TangCaPersistence
 * @see TangCaPersistenceImpl
 * @generated
 */
public class TangCaUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(TangCa tangCa) {
		getPersistence().clearCache(tangCa);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TangCa> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TangCa> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TangCa> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static TangCa update(TangCa tangCa) throws SystemException {
		return getPersistence().update(tangCa);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static TangCa update(TangCa tangCa, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(tangCa, serviceContext);
	}

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
	public static java.util.List<com.minimart.portlet.cuahang.model.TangCa> findByUID_CH_CLV_HD(
		long userId, long cuaHangId, long caLamViecId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUID_CH_CLV_HD(userId, cuaHangId, caLamViecId, hoatDong);
	}

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
	public static java.util.List<com.minimart.portlet.cuahang.model.TangCa> findByUID_CH_CLV_HD(
		long userId, long cuaHangId, long caLamViecId, boolean hoatDong,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUID_CH_CLV_HD(userId, cuaHangId, caLamViecId,
			hoatDong, start, end);
	}

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
	public static java.util.List<com.minimart.portlet.cuahang.model.TangCa> findByUID_CH_CLV_HD(
		long userId, long cuaHangId, long caLamViecId, boolean hoatDong,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUID_CH_CLV_HD(userId, cuaHangId, caLamViecId,
			hoatDong, start, end, orderByComparator);
	}

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
	public static com.minimart.portlet.cuahang.model.TangCa findByUID_CH_CLV_HD_First(
		long userId, long cuaHangId, long caLamViecId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.cuahang.NoSuchTangCaException {
		return getPersistence()
				   .findByUID_CH_CLV_HD_First(userId, cuaHangId, caLamViecId,
			hoatDong, orderByComparator);
	}

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
	public static com.minimart.portlet.cuahang.model.TangCa fetchByUID_CH_CLV_HD_First(
		long userId, long cuaHangId, long caLamViecId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUID_CH_CLV_HD_First(userId, cuaHangId, caLamViecId,
			hoatDong, orderByComparator);
	}

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
	public static com.minimart.portlet.cuahang.model.TangCa findByUID_CH_CLV_HD_Last(
		long userId, long cuaHangId, long caLamViecId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.cuahang.NoSuchTangCaException {
		return getPersistence()
				   .findByUID_CH_CLV_HD_Last(userId, cuaHangId, caLamViecId,
			hoatDong, orderByComparator);
	}

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
	public static com.minimart.portlet.cuahang.model.TangCa fetchByUID_CH_CLV_HD_Last(
		long userId, long cuaHangId, long caLamViecId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUID_CH_CLV_HD_Last(userId, cuaHangId, caLamViecId,
			hoatDong, orderByComparator);
	}

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
	public static com.minimart.portlet.cuahang.model.TangCa[] findByUID_CH_CLV_HD_PrevAndNext(
		long tangCaId, long userId, long cuaHangId, long caLamViecId,
		boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.cuahang.NoSuchTangCaException {
		return getPersistence()
				   .findByUID_CH_CLV_HD_PrevAndNext(tangCaId, userId,
			cuaHangId, caLamViecId, hoatDong, orderByComparator);
	}

	/**
	* Removes all the tang cas where userId = &#63; and cuaHangId = &#63; and caLamViecId = &#63; and hoatDong = &#63; from the database.
	*
	* @param userId the user ID
	* @param cuaHangId the cua hang ID
	* @param caLamViecId the ca lam viec ID
	* @param hoatDong the hoat dong
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUID_CH_CLV_HD(long userId, long cuaHangId,
		long caLamViecId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByUID_CH_CLV_HD(userId, cuaHangId, caLamViecId, hoatDong);
	}

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
	public static int countByUID_CH_CLV_HD(long userId, long cuaHangId,
		long caLamViecId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByUID_CH_CLV_HD(userId, cuaHangId, caLamViecId,
			hoatDong);
	}

	/**
	* Caches the tang ca in the entity cache if it is enabled.
	*
	* @param tangCa the tang ca
	*/
	public static void cacheResult(
		com.minimart.portlet.cuahang.model.TangCa tangCa) {
		getPersistence().cacheResult(tangCa);
	}

	/**
	* Caches the tang cas in the entity cache if it is enabled.
	*
	* @param tangCas the tang cas
	*/
	public static void cacheResult(
		java.util.List<com.minimart.portlet.cuahang.model.TangCa> tangCas) {
		getPersistence().cacheResult(tangCas);
	}

	/**
	* Creates a new tang ca with the primary key. Does not add the tang ca to the database.
	*
	* @param tangCaId the primary key for the new tang ca
	* @return the new tang ca
	*/
	public static com.minimart.portlet.cuahang.model.TangCa create(
		long tangCaId) {
		return getPersistence().create(tangCaId);
	}

	/**
	* Removes the tang ca with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tangCaId the primary key of the tang ca
	* @return the tang ca that was removed
	* @throws com.minimart.portlet.cuahang.NoSuchTangCaException if a tang ca with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.cuahang.model.TangCa remove(
		long tangCaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.cuahang.NoSuchTangCaException {
		return getPersistence().remove(tangCaId);
	}

	public static com.minimart.portlet.cuahang.model.TangCa updateImpl(
		com.minimart.portlet.cuahang.model.TangCa tangCa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tangCa);
	}

	/**
	* Returns the tang ca with the primary key or throws a {@link com.minimart.portlet.cuahang.NoSuchTangCaException} if it could not be found.
	*
	* @param tangCaId the primary key of the tang ca
	* @return the tang ca
	* @throws com.minimart.portlet.cuahang.NoSuchTangCaException if a tang ca with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.cuahang.model.TangCa findByPrimaryKey(
		long tangCaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.cuahang.NoSuchTangCaException {
		return getPersistence().findByPrimaryKey(tangCaId);
	}

	/**
	* Returns the tang ca with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tangCaId the primary key of the tang ca
	* @return the tang ca, or <code>null</code> if a tang ca with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.cuahang.model.TangCa fetchByPrimaryKey(
		long tangCaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(tangCaId);
	}

	/**
	* Returns all the tang cas.
	*
	* @return the tang cas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.cuahang.model.TangCa> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.minimart.portlet.cuahang.model.TangCa> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.minimart.portlet.cuahang.model.TangCa> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the tang cas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tang cas.
	*
	* @return the number of tang cas
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TangCaPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TangCaPersistence)PortletBeanLocatorUtil.locate(com.minimart.portlet.cuahang.service.ClpSerializer.getServletContextName(),
					TangCaPersistence.class.getName());

			ReferenceRegistry.registerReference(TangCaUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TangCaPersistence persistence) {
	}

	private static TangCaPersistence _persistence;
}