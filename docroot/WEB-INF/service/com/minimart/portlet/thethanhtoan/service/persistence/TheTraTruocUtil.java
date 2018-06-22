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

package com.minimart.portlet.thethanhtoan.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.minimart.portlet.thethanhtoan.model.TheTraTruoc;

import java.util.List;

/**
 * The persistence utility for the the tra truoc service. This utility wraps {@link TheTraTruocPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see TheTraTruocPersistence
 * @see TheTraTruocPersistenceImpl
 * @generated
 */
public class TheTraTruocUtil {
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
	public static void clearCache(TheTraTruoc theTraTruoc) {
		getPersistence().clearCache(theTraTruoc);
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
	public static List<TheTraTruoc> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TheTraTruoc> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TheTraTruoc> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static TheTraTruoc update(TheTraTruoc theTraTruoc)
		throws SystemException {
		return getPersistence().update(theTraTruoc);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static TheTraTruoc update(TheTraTruoc theTraTruoc,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(theTraTruoc, serviceContext);
	}

	/**
	* Returns all the the tra truocs where ngayHetHan = &#63;.
	*
	* @param ngayHetHan the ngay het han
	* @return the matching the tra truocs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.thethanhtoan.model.TheTraTruoc> findByNGAYHH(
		java.util.Date ngayHetHan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByNGAYHH(ngayHetHan);
	}

	/**
	* Returns a range of all the the tra truocs where ngayHetHan = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.thethanhtoan.model.impl.TheTraTruocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ngayHetHan the ngay het han
	* @param start the lower bound of the range of the tra truocs
	* @param end the upper bound of the range of the tra truocs (not inclusive)
	* @return the range of matching the tra truocs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.thethanhtoan.model.TheTraTruoc> findByNGAYHH(
		java.util.Date ngayHetHan, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByNGAYHH(ngayHetHan, start, end);
	}

	/**
	* Returns an ordered range of all the the tra truocs where ngayHetHan = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.thethanhtoan.model.impl.TheTraTruocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ngayHetHan the ngay het han
	* @param start the lower bound of the range of the tra truocs
	* @param end the upper bound of the range of the tra truocs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching the tra truocs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.thethanhtoan.model.TheTraTruoc> findByNGAYHH(
		java.util.Date ngayHetHan, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNGAYHH(ngayHetHan, start, end, orderByComparator);
	}

	/**
	* Returns the first the tra truoc in the ordered set where ngayHetHan = &#63;.
	*
	* @param ngayHetHan the ngay het han
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching the tra truoc
	* @throws com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException if a matching the tra truoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.thethanhtoan.model.TheTraTruoc findByNGAYHH_First(
		java.util.Date ngayHetHan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException {
		return getPersistence().findByNGAYHH_First(ngayHetHan, orderByComparator);
	}

	/**
	* Returns the first the tra truoc in the ordered set where ngayHetHan = &#63;.
	*
	* @param ngayHetHan the ngay het han
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching the tra truoc, or <code>null</code> if a matching the tra truoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.thethanhtoan.model.TheTraTruoc fetchByNGAYHH_First(
		java.util.Date ngayHetHan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNGAYHH_First(ngayHetHan, orderByComparator);
	}

	/**
	* Returns the last the tra truoc in the ordered set where ngayHetHan = &#63;.
	*
	* @param ngayHetHan the ngay het han
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching the tra truoc
	* @throws com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException if a matching the tra truoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.thethanhtoan.model.TheTraTruoc findByNGAYHH_Last(
		java.util.Date ngayHetHan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException {
		return getPersistence().findByNGAYHH_Last(ngayHetHan, orderByComparator);
	}

	/**
	* Returns the last the tra truoc in the ordered set where ngayHetHan = &#63;.
	*
	* @param ngayHetHan the ngay het han
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching the tra truoc, or <code>null</code> if a matching the tra truoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.thethanhtoan.model.TheTraTruoc fetchByNGAYHH_Last(
		java.util.Date ngayHetHan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByNGAYHH_Last(ngayHetHan, orderByComparator);
	}

	/**
	* Returns the the tra truocs before and after the current the tra truoc in the ordered set where ngayHetHan = &#63;.
	*
	* @param theTraTruocId the primary key of the current the tra truoc
	* @param ngayHetHan the ngay het han
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next the tra truoc
	* @throws com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException if a the tra truoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.thethanhtoan.model.TheTraTruoc[] findByNGAYHH_PrevAndNext(
		long theTraTruocId, java.util.Date ngayHetHan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException {
		return getPersistence()
				   .findByNGAYHH_PrevAndNext(theTraTruocId, ngayHetHan,
			orderByComparator);
	}

	/**
	* Removes all the the tra truocs where ngayHetHan = &#63; from the database.
	*
	* @param ngayHetHan the ngay het han
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByNGAYHH(java.util.Date ngayHetHan)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByNGAYHH(ngayHetHan);
	}

	/**
	* Returns the number of the tra truocs where ngayHetHan = &#63;.
	*
	* @param ngayHetHan the ngay het han
	* @return the number of matching the tra truocs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByNGAYHH(java.util.Date ngayHetHan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByNGAYHH(ngayHetHan);
	}

	/**
	* Returns all the the tra truocs where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @return the matching the tra truocs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.thethanhtoan.model.TheTraTruoc> findByTT(
		java.lang.String trangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTT(trangThai);
	}

	/**
	* Returns a range of all the the tra truocs where trangThai = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.thethanhtoan.model.impl.TheTraTruocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param trangThai the trang thai
	* @param start the lower bound of the range of the tra truocs
	* @param end the upper bound of the range of the tra truocs (not inclusive)
	* @return the range of matching the tra truocs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.thethanhtoan.model.TheTraTruoc> findByTT(
		java.lang.String trangThai, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTT(trangThai, start, end);
	}

	/**
	* Returns an ordered range of all the the tra truocs where trangThai = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.thethanhtoan.model.impl.TheTraTruocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param trangThai the trang thai
	* @param start the lower bound of the range of the tra truocs
	* @param end the upper bound of the range of the tra truocs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching the tra truocs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.thethanhtoan.model.TheTraTruoc> findByTT(
		java.lang.String trangThai, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTT(trangThai, start, end, orderByComparator);
	}

	/**
	* Returns the first the tra truoc in the ordered set where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching the tra truoc
	* @throws com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException if a matching the tra truoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.thethanhtoan.model.TheTraTruoc findByTT_First(
		java.lang.String trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException {
		return getPersistence().findByTT_First(trangThai, orderByComparator);
	}

	/**
	* Returns the first the tra truoc in the ordered set where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching the tra truoc, or <code>null</code> if a matching the tra truoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.thethanhtoan.model.TheTraTruoc fetchByTT_First(
		java.lang.String trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTT_First(trangThai, orderByComparator);
	}

	/**
	* Returns the last the tra truoc in the ordered set where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching the tra truoc
	* @throws com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException if a matching the tra truoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.thethanhtoan.model.TheTraTruoc findByTT_Last(
		java.lang.String trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException {
		return getPersistence().findByTT_Last(trangThai, orderByComparator);
	}

	/**
	* Returns the last the tra truoc in the ordered set where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching the tra truoc, or <code>null</code> if a matching the tra truoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.thethanhtoan.model.TheTraTruoc fetchByTT_Last(
		java.lang.String trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTT_Last(trangThai, orderByComparator);
	}

	/**
	* Returns the the tra truocs before and after the current the tra truoc in the ordered set where trangThai = &#63;.
	*
	* @param theTraTruocId the primary key of the current the tra truoc
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next the tra truoc
	* @throws com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException if a the tra truoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.thethanhtoan.model.TheTraTruoc[] findByTT_PrevAndNext(
		long theTraTruocId, java.lang.String trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException {
		return getPersistence()
				   .findByTT_PrevAndNext(theTraTruocId, trangThai,
			orderByComparator);
	}

	/**
	* Removes all the the tra truocs where trangThai = &#63; from the database.
	*
	* @param trangThai the trang thai
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTT(java.lang.String trangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTT(trangThai);
	}

	/**
	* Returns the number of the tra truocs where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @return the number of matching the tra truocs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTT(java.lang.String trangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTT(trangThai);
	}

	/**
	* Returns all the the tra truocs where ngayHetHan = &#63; and khoa = &#63;.
	*
	* @param ngayHetHan the ngay het han
	* @param khoa the khoa
	* @return the matching the tra truocs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.thethanhtoan.model.TheTraTruoc> findByNGAYHH_KHOA(
		java.util.Date ngayHetHan, boolean khoa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByNGAYHH_KHOA(ngayHetHan, khoa);
	}

	/**
	* Returns a range of all the the tra truocs where ngayHetHan = &#63; and khoa = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.thethanhtoan.model.impl.TheTraTruocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ngayHetHan the ngay het han
	* @param khoa the khoa
	* @param start the lower bound of the range of the tra truocs
	* @param end the upper bound of the range of the tra truocs (not inclusive)
	* @return the range of matching the tra truocs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.thethanhtoan.model.TheTraTruoc> findByNGAYHH_KHOA(
		java.util.Date ngayHetHan, boolean khoa, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByNGAYHH_KHOA(ngayHetHan, khoa, start, end);
	}

	/**
	* Returns an ordered range of all the the tra truocs where ngayHetHan = &#63; and khoa = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.thethanhtoan.model.impl.TheTraTruocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ngayHetHan the ngay het han
	* @param khoa the khoa
	* @param start the lower bound of the range of the tra truocs
	* @param end the upper bound of the range of the tra truocs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching the tra truocs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.thethanhtoan.model.TheTraTruoc> findByNGAYHH_KHOA(
		java.util.Date ngayHetHan, boolean khoa, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNGAYHH_KHOA(ngayHetHan, khoa, start, end,
			orderByComparator);
	}

	/**
	* Returns the first the tra truoc in the ordered set where ngayHetHan = &#63; and khoa = &#63;.
	*
	* @param ngayHetHan the ngay het han
	* @param khoa the khoa
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching the tra truoc
	* @throws com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException if a matching the tra truoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.thethanhtoan.model.TheTraTruoc findByNGAYHH_KHOA_First(
		java.util.Date ngayHetHan, boolean khoa,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException {
		return getPersistence()
				   .findByNGAYHH_KHOA_First(ngayHetHan, khoa, orderByComparator);
	}

	/**
	* Returns the first the tra truoc in the ordered set where ngayHetHan = &#63; and khoa = &#63;.
	*
	* @param ngayHetHan the ngay het han
	* @param khoa the khoa
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching the tra truoc, or <code>null</code> if a matching the tra truoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.thethanhtoan.model.TheTraTruoc fetchByNGAYHH_KHOA_First(
		java.util.Date ngayHetHan, boolean khoa,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNGAYHH_KHOA_First(ngayHetHan, khoa, orderByComparator);
	}

	/**
	* Returns the last the tra truoc in the ordered set where ngayHetHan = &#63; and khoa = &#63;.
	*
	* @param ngayHetHan the ngay het han
	* @param khoa the khoa
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching the tra truoc
	* @throws com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException if a matching the tra truoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.thethanhtoan.model.TheTraTruoc findByNGAYHH_KHOA_Last(
		java.util.Date ngayHetHan, boolean khoa,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException {
		return getPersistence()
				   .findByNGAYHH_KHOA_Last(ngayHetHan, khoa, orderByComparator);
	}

	/**
	* Returns the last the tra truoc in the ordered set where ngayHetHan = &#63; and khoa = &#63;.
	*
	* @param ngayHetHan the ngay het han
	* @param khoa the khoa
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching the tra truoc, or <code>null</code> if a matching the tra truoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.thethanhtoan.model.TheTraTruoc fetchByNGAYHH_KHOA_Last(
		java.util.Date ngayHetHan, boolean khoa,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNGAYHH_KHOA_Last(ngayHetHan, khoa, orderByComparator);
	}

	/**
	* Returns the the tra truocs before and after the current the tra truoc in the ordered set where ngayHetHan = &#63; and khoa = &#63;.
	*
	* @param theTraTruocId the primary key of the current the tra truoc
	* @param ngayHetHan the ngay het han
	* @param khoa the khoa
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next the tra truoc
	* @throws com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException if a the tra truoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.thethanhtoan.model.TheTraTruoc[] findByNGAYHH_KHOA_PrevAndNext(
		long theTraTruocId, java.util.Date ngayHetHan, boolean khoa,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException {
		return getPersistence()
				   .findByNGAYHH_KHOA_PrevAndNext(theTraTruocId, ngayHetHan,
			khoa, orderByComparator);
	}

	/**
	* Removes all the the tra truocs where ngayHetHan = &#63; and khoa = &#63; from the database.
	*
	* @param ngayHetHan the ngay het han
	* @param khoa the khoa
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByNGAYHH_KHOA(java.util.Date ngayHetHan,
		boolean khoa)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByNGAYHH_KHOA(ngayHetHan, khoa);
	}

	/**
	* Returns the number of the tra truocs where ngayHetHan = &#63; and khoa = &#63;.
	*
	* @param ngayHetHan the ngay het han
	* @param khoa the khoa
	* @return the number of matching the tra truocs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByNGAYHH_KHOA(java.util.Date ngayHetHan, boolean khoa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByNGAYHH_KHOA(ngayHetHan, khoa);
	}

	/**
	* Caches the the tra truoc in the entity cache if it is enabled.
	*
	* @param theTraTruoc the the tra truoc
	*/
	public static void cacheResult(
		com.minimart.portlet.thethanhtoan.model.TheTraTruoc theTraTruoc) {
		getPersistence().cacheResult(theTraTruoc);
	}

	/**
	* Caches the the tra truocs in the entity cache if it is enabled.
	*
	* @param theTraTruocs the the tra truocs
	*/
	public static void cacheResult(
		java.util.List<com.minimart.portlet.thethanhtoan.model.TheTraTruoc> theTraTruocs) {
		getPersistence().cacheResult(theTraTruocs);
	}

	/**
	* Creates a new the tra truoc with the primary key. Does not add the the tra truoc to the database.
	*
	* @param theTraTruocId the primary key for the new the tra truoc
	* @return the new the tra truoc
	*/
	public static com.minimart.portlet.thethanhtoan.model.TheTraTruoc create(
		long theTraTruocId) {
		return getPersistence().create(theTraTruocId);
	}

	/**
	* Removes the the tra truoc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param theTraTruocId the primary key of the the tra truoc
	* @return the the tra truoc that was removed
	* @throws com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException if a the tra truoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.thethanhtoan.model.TheTraTruoc remove(
		long theTraTruocId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException {
		return getPersistence().remove(theTraTruocId);
	}

	public static com.minimart.portlet.thethanhtoan.model.TheTraTruoc updateImpl(
		com.minimart.portlet.thethanhtoan.model.TheTraTruoc theTraTruoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(theTraTruoc);
	}

	/**
	* Returns the the tra truoc with the primary key or throws a {@link com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException} if it could not be found.
	*
	* @param theTraTruocId the primary key of the the tra truoc
	* @return the the tra truoc
	* @throws com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException if a the tra truoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.thethanhtoan.model.TheTraTruoc findByPrimaryKey(
		long theTraTruocId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException {
		return getPersistence().findByPrimaryKey(theTraTruocId);
	}

	/**
	* Returns the the tra truoc with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param theTraTruocId the primary key of the the tra truoc
	* @return the the tra truoc, or <code>null</code> if a the tra truoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.thethanhtoan.model.TheTraTruoc fetchByPrimaryKey(
		long theTraTruocId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(theTraTruocId);
	}

	/**
	* Returns all the the tra truocs.
	*
	* @return the the tra truocs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.thethanhtoan.model.TheTraTruoc> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the the tra truocs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.thethanhtoan.model.impl.TheTraTruocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of the tra truocs
	* @param end the upper bound of the range of the tra truocs (not inclusive)
	* @return the range of the tra truocs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.thethanhtoan.model.TheTraTruoc> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the the tra truocs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.thethanhtoan.model.impl.TheTraTruocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of the tra truocs
	* @param end the upper bound of the range of the tra truocs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of the tra truocs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.thethanhtoan.model.TheTraTruoc> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the the tra truocs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of the tra truocs.
	*
	* @return the number of the tra truocs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TheTraTruocPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TheTraTruocPersistence)PortletBeanLocatorUtil.locate(com.minimart.portlet.thethanhtoan.service.ClpSerializer.getServletContextName(),
					TheTraTruocPersistence.class.getName());

			ReferenceRegistry.registerReference(TheTraTruocUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TheTraTruocPersistence persistence) {
	}

	private static TheTraTruocPersistence _persistence;
}