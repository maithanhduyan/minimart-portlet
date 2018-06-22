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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.minimart.portlet.banhang.model.DonHangChiTiet;

import java.util.List;

/**
 * The persistence utility for the don hang chi tiet service. This utility wraps {@link DonHangChiTietPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see DonHangChiTietPersistence
 * @see DonHangChiTietPersistenceImpl
 * @generated
 */
public class DonHangChiTietUtil {
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
	public static void clearCache(DonHangChiTiet donHangChiTiet) {
		getPersistence().clearCache(donHangChiTiet);
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
	public static List<DonHangChiTiet> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DonHangChiTiet> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DonHangChiTiet> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DonHangChiTiet update(DonHangChiTiet donHangChiTiet)
		throws SystemException {
		return getPersistence().update(donHangChiTiet);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DonHangChiTiet update(DonHangChiTiet donHangChiTiet,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(donHangChiTiet, serviceContext);
	}

	/**
	* Returns all the don hang chi tiets where donHangId = &#63; and matHangId = &#63; and hoatDong = &#63;.
	*
	* @param donHangId the don hang ID
	* @param matHangId the mat hang ID
	* @param hoatDong the hoat dong
	* @return the matching don hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.banhang.model.DonHangChiTiet> findByDH_MH_HD(
		long donHangId, long matHangId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDH_MH_HD(donHangId, matHangId, hoatDong);
	}

	/**
	* Returns a range of all the don hang chi tiets where donHangId = &#63; and matHangId = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.DonHangChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param donHangId the don hang ID
	* @param matHangId the mat hang ID
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of don hang chi tiets
	* @param end the upper bound of the range of don hang chi tiets (not inclusive)
	* @return the range of matching don hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.banhang.model.DonHangChiTiet> findByDH_MH_HD(
		long donHangId, long matHangId, boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDH_MH_HD(donHangId, matHangId, hoatDong, start, end);
	}

	/**
	* Returns an ordered range of all the don hang chi tiets where donHangId = &#63; and matHangId = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.DonHangChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param donHangId the don hang ID
	* @param matHangId the mat hang ID
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of don hang chi tiets
	* @param end the upper bound of the range of don hang chi tiets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching don hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.banhang.model.DonHangChiTiet> findByDH_MH_HD(
		long donHangId, long matHangId, boolean hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDH_MH_HD(donHangId, matHangId, hoatDong, start, end,
			orderByComparator);
	}

	/**
	* Returns the first don hang chi tiet in the ordered set where donHangId = &#63; and matHangId = &#63; and hoatDong = &#63;.
	*
	* @param donHangId the don hang ID
	* @param matHangId the mat hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching don hang chi tiet
	* @throws com.minimart.portlet.banhang.NoSuchDonHangChiTietException if a matching don hang chi tiet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.banhang.model.DonHangChiTiet findByDH_MH_HD_First(
		long donHangId, long matHangId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.banhang.NoSuchDonHangChiTietException {
		return getPersistence()
				   .findByDH_MH_HD_First(donHangId, matHangId, hoatDong,
			orderByComparator);
	}

	/**
	* Returns the first don hang chi tiet in the ordered set where donHangId = &#63; and matHangId = &#63; and hoatDong = &#63;.
	*
	* @param donHangId the don hang ID
	* @param matHangId the mat hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching don hang chi tiet, or <code>null</code> if a matching don hang chi tiet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.banhang.model.DonHangChiTiet fetchByDH_MH_HD_First(
		long donHangId, long matHangId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDH_MH_HD_First(donHangId, matHangId, hoatDong,
			orderByComparator);
	}

	/**
	* Returns the last don hang chi tiet in the ordered set where donHangId = &#63; and matHangId = &#63; and hoatDong = &#63;.
	*
	* @param donHangId the don hang ID
	* @param matHangId the mat hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching don hang chi tiet
	* @throws com.minimart.portlet.banhang.NoSuchDonHangChiTietException if a matching don hang chi tiet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.banhang.model.DonHangChiTiet findByDH_MH_HD_Last(
		long donHangId, long matHangId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.banhang.NoSuchDonHangChiTietException {
		return getPersistence()
				   .findByDH_MH_HD_Last(donHangId, matHangId, hoatDong,
			orderByComparator);
	}

	/**
	* Returns the last don hang chi tiet in the ordered set where donHangId = &#63; and matHangId = &#63; and hoatDong = &#63;.
	*
	* @param donHangId the don hang ID
	* @param matHangId the mat hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching don hang chi tiet, or <code>null</code> if a matching don hang chi tiet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.banhang.model.DonHangChiTiet fetchByDH_MH_HD_Last(
		long donHangId, long matHangId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDH_MH_HD_Last(donHangId, matHangId, hoatDong,
			orderByComparator);
	}

	/**
	* Returns the don hang chi tiets before and after the current don hang chi tiet in the ordered set where donHangId = &#63; and matHangId = &#63; and hoatDong = &#63;.
	*
	* @param donHangChiTietId the primary key of the current don hang chi tiet
	* @param donHangId the don hang ID
	* @param matHangId the mat hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next don hang chi tiet
	* @throws com.minimart.portlet.banhang.NoSuchDonHangChiTietException if a don hang chi tiet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.banhang.model.DonHangChiTiet[] findByDH_MH_HD_PrevAndNext(
		long donHangChiTietId, long donHangId, long matHangId,
		boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.banhang.NoSuchDonHangChiTietException {
		return getPersistence()
				   .findByDH_MH_HD_PrevAndNext(donHangChiTietId, donHangId,
			matHangId, hoatDong, orderByComparator);
	}

	/**
	* Removes all the don hang chi tiets where donHangId = &#63; and matHangId = &#63; and hoatDong = &#63; from the database.
	*
	* @param donHangId the don hang ID
	* @param matHangId the mat hang ID
	* @param hoatDong the hoat dong
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDH_MH_HD(long donHangId, long matHangId,
		boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDH_MH_HD(donHangId, matHangId, hoatDong);
	}

	/**
	* Returns the number of don hang chi tiets where donHangId = &#63; and matHangId = &#63; and hoatDong = &#63;.
	*
	* @param donHangId the don hang ID
	* @param matHangId the mat hang ID
	* @param hoatDong the hoat dong
	* @return the number of matching don hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDH_MH_HD(long donHangId, long matHangId,
		boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDH_MH_HD(donHangId, matHangId, hoatDong);
	}

	/**
	* Returns all the don hang chi tiets where donHangId = &#63; and hoatDong = &#63;.
	*
	* @param donHangId the don hang ID
	* @param hoatDong the hoat dong
	* @return the matching don hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.banhang.model.DonHangChiTiet> findByDH_HD(
		long donHangId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDH_HD(donHangId, hoatDong);
	}

	/**
	* Returns a range of all the don hang chi tiets where donHangId = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.DonHangChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param donHangId the don hang ID
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of don hang chi tiets
	* @param end the upper bound of the range of don hang chi tiets (not inclusive)
	* @return the range of matching don hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.banhang.model.DonHangChiTiet> findByDH_HD(
		long donHangId, boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDH_HD(donHangId, hoatDong, start, end);
	}

	/**
	* Returns an ordered range of all the don hang chi tiets where donHangId = &#63; and hoatDong = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.DonHangChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param donHangId the don hang ID
	* @param hoatDong the hoat dong
	* @param start the lower bound of the range of don hang chi tiets
	* @param end the upper bound of the range of don hang chi tiets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching don hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.banhang.model.DonHangChiTiet> findByDH_HD(
		long donHangId, boolean hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDH_HD(donHangId, hoatDong, start, end,
			orderByComparator);
	}

	/**
	* Returns the first don hang chi tiet in the ordered set where donHangId = &#63; and hoatDong = &#63;.
	*
	* @param donHangId the don hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching don hang chi tiet
	* @throws com.minimart.portlet.banhang.NoSuchDonHangChiTietException if a matching don hang chi tiet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.banhang.model.DonHangChiTiet findByDH_HD_First(
		long donHangId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.banhang.NoSuchDonHangChiTietException {
		return getPersistence()
				   .findByDH_HD_First(donHangId, hoatDong, orderByComparator);
	}

	/**
	* Returns the first don hang chi tiet in the ordered set where donHangId = &#63; and hoatDong = &#63;.
	*
	* @param donHangId the don hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching don hang chi tiet, or <code>null</code> if a matching don hang chi tiet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.banhang.model.DonHangChiTiet fetchByDH_HD_First(
		long donHangId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDH_HD_First(donHangId, hoatDong, orderByComparator);
	}

	/**
	* Returns the last don hang chi tiet in the ordered set where donHangId = &#63; and hoatDong = &#63;.
	*
	* @param donHangId the don hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching don hang chi tiet
	* @throws com.minimart.portlet.banhang.NoSuchDonHangChiTietException if a matching don hang chi tiet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.banhang.model.DonHangChiTiet findByDH_HD_Last(
		long donHangId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.banhang.NoSuchDonHangChiTietException {
		return getPersistence()
				   .findByDH_HD_Last(donHangId, hoatDong, orderByComparator);
	}

	/**
	* Returns the last don hang chi tiet in the ordered set where donHangId = &#63; and hoatDong = &#63;.
	*
	* @param donHangId the don hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching don hang chi tiet, or <code>null</code> if a matching don hang chi tiet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.banhang.model.DonHangChiTiet fetchByDH_HD_Last(
		long donHangId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDH_HD_Last(donHangId, hoatDong, orderByComparator);
	}

	/**
	* Returns the don hang chi tiets before and after the current don hang chi tiet in the ordered set where donHangId = &#63; and hoatDong = &#63;.
	*
	* @param donHangChiTietId the primary key of the current don hang chi tiet
	* @param donHangId the don hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next don hang chi tiet
	* @throws com.minimart.portlet.banhang.NoSuchDonHangChiTietException if a don hang chi tiet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.banhang.model.DonHangChiTiet[] findByDH_HD_PrevAndNext(
		long donHangChiTietId, long donHangId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.banhang.NoSuchDonHangChiTietException {
		return getPersistence()
				   .findByDH_HD_PrevAndNext(donHangChiTietId, donHangId,
			hoatDong, orderByComparator);
	}

	/**
	* Removes all the don hang chi tiets where donHangId = &#63; and hoatDong = &#63; from the database.
	*
	* @param donHangId the don hang ID
	* @param hoatDong the hoat dong
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDH_HD(long donHangId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDH_HD(donHangId, hoatDong);
	}

	/**
	* Returns the number of don hang chi tiets where donHangId = &#63; and hoatDong = &#63;.
	*
	* @param donHangId the don hang ID
	* @param hoatDong the hoat dong
	* @return the number of matching don hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDH_HD(long donHangId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDH_HD(donHangId, hoatDong);
	}

	/**
	* Caches the don hang chi tiet in the entity cache if it is enabled.
	*
	* @param donHangChiTiet the don hang chi tiet
	*/
	public static void cacheResult(
		com.minimart.portlet.banhang.model.DonHangChiTiet donHangChiTiet) {
		getPersistence().cacheResult(donHangChiTiet);
	}

	/**
	* Caches the don hang chi tiets in the entity cache if it is enabled.
	*
	* @param donHangChiTiets the don hang chi tiets
	*/
	public static void cacheResult(
		java.util.List<com.minimart.portlet.banhang.model.DonHangChiTiet> donHangChiTiets) {
		getPersistence().cacheResult(donHangChiTiets);
	}

	/**
	* Creates a new don hang chi tiet with the primary key. Does not add the don hang chi tiet to the database.
	*
	* @param donHangChiTietId the primary key for the new don hang chi tiet
	* @return the new don hang chi tiet
	*/
	public static com.minimart.portlet.banhang.model.DonHangChiTiet create(
		long donHangChiTietId) {
		return getPersistence().create(donHangChiTietId);
	}

	/**
	* Removes the don hang chi tiet with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param donHangChiTietId the primary key of the don hang chi tiet
	* @return the don hang chi tiet that was removed
	* @throws com.minimart.portlet.banhang.NoSuchDonHangChiTietException if a don hang chi tiet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.banhang.model.DonHangChiTiet remove(
		long donHangChiTietId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.banhang.NoSuchDonHangChiTietException {
		return getPersistence().remove(donHangChiTietId);
	}

	public static com.minimart.portlet.banhang.model.DonHangChiTiet updateImpl(
		com.minimart.portlet.banhang.model.DonHangChiTiet donHangChiTiet)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(donHangChiTiet);
	}

	/**
	* Returns the don hang chi tiet with the primary key or throws a {@link com.minimart.portlet.banhang.NoSuchDonHangChiTietException} if it could not be found.
	*
	* @param donHangChiTietId the primary key of the don hang chi tiet
	* @return the don hang chi tiet
	* @throws com.minimart.portlet.banhang.NoSuchDonHangChiTietException if a don hang chi tiet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.banhang.model.DonHangChiTiet findByPrimaryKey(
		long donHangChiTietId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.banhang.NoSuchDonHangChiTietException {
		return getPersistence().findByPrimaryKey(donHangChiTietId);
	}

	/**
	* Returns the don hang chi tiet with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param donHangChiTietId the primary key of the don hang chi tiet
	* @return the don hang chi tiet, or <code>null</code> if a don hang chi tiet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.banhang.model.DonHangChiTiet fetchByPrimaryKey(
		long donHangChiTietId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(donHangChiTietId);
	}

	/**
	* Returns all the don hang chi tiets.
	*
	* @return the don hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.banhang.model.DonHangChiTiet> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the don hang chi tiets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.DonHangChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of don hang chi tiets
	* @param end the upper bound of the range of don hang chi tiets (not inclusive)
	* @return the range of don hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.banhang.model.DonHangChiTiet> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the don hang chi tiets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.DonHangChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of don hang chi tiets
	* @param end the upper bound of the range of don hang chi tiets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of don hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.banhang.model.DonHangChiTiet> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the don hang chi tiets from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of don hang chi tiets.
	*
	* @return the number of don hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DonHangChiTietPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DonHangChiTietPersistence)PortletBeanLocatorUtil.locate(com.minimart.portlet.banhang.service.ClpSerializer.getServletContextName(),
					DonHangChiTietPersistence.class.getName());

			ReferenceRegistry.registerReference(DonHangChiTietUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DonHangChiTietPersistence persistence) {
	}

	private static DonHangChiTietPersistence _persistence;
}