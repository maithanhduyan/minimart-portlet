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

package com.minimart.portlet.ketoan.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.minimart.portlet.ketoan.model.ThuChi;

import java.util.List;

/**
 * The persistence utility for the thu chi service. This utility wraps {@link ThuChiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see ThuChiPersistence
 * @see ThuChiPersistenceImpl
 * @generated
 */
public class ThuChiUtil {
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
	public static void clearCache(ThuChi thuChi) {
		getPersistence().clearCache(thuChi);
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
	public static List<ThuChi> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ThuChi> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ThuChi> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ThuChi update(ThuChi thuChi) throws SystemException {
		return getPersistence().update(thuChi);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ThuChi update(ThuChi thuChi, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(thuChi, serviceContext);
	}

	/**
	* Returns all the thu chis where ten = &#63;.
	*
	* @param ten the ten
	* @return the matching thu chis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.ketoan.model.ThuChi> findByTEN(
		java.lang.String ten)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTEN(ten);
	}

	/**
	* Returns a range of all the thu chis where ten = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.ketoan.model.impl.ThuChiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param start the lower bound of the range of thu chis
	* @param end the upper bound of the range of thu chis (not inclusive)
	* @return the range of matching thu chis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.ketoan.model.ThuChi> findByTEN(
		java.lang.String ten, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTEN(ten, start, end);
	}

	/**
	* Returns an ordered range of all the thu chis where ten = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.ketoan.model.impl.ThuChiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param start the lower bound of the range of thu chis
	* @param end the upper bound of the range of thu chis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching thu chis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.ketoan.model.ThuChi> findByTEN(
		java.lang.String ten, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTEN(ten, start, end, orderByComparator);
	}

	/**
	* Returns the first thu chi in the ordered set where ten = &#63;.
	*
	* @param ten the ten
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thu chi
	* @throws com.minimart.portlet.ketoan.NoSuchThuChiException if a matching thu chi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.ketoan.model.ThuChi findByTEN_First(
		java.lang.String ten,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.ketoan.NoSuchThuChiException {
		return getPersistence().findByTEN_First(ten, orderByComparator);
	}

	/**
	* Returns the first thu chi in the ordered set where ten = &#63;.
	*
	* @param ten the ten
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thu chi, or <code>null</code> if a matching thu chi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.ketoan.model.ThuChi fetchByTEN_First(
		java.lang.String ten,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTEN_First(ten, orderByComparator);
	}

	/**
	* Returns the last thu chi in the ordered set where ten = &#63;.
	*
	* @param ten the ten
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thu chi
	* @throws com.minimart.portlet.ketoan.NoSuchThuChiException if a matching thu chi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.ketoan.model.ThuChi findByTEN_Last(
		java.lang.String ten,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.ketoan.NoSuchThuChiException {
		return getPersistence().findByTEN_Last(ten, orderByComparator);
	}

	/**
	* Returns the last thu chi in the ordered set where ten = &#63;.
	*
	* @param ten the ten
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thu chi, or <code>null</code> if a matching thu chi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.ketoan.model.ThuChi fetchByTEN_Last(
		java.lang.String ten,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTEN_Last(ten, orderByComparator);
	}

	/**
	* Returns the thu chis before and after the current thu chi in the ordered set where ten = &#63;.
	*
	* @param thuChiId the primary key of the current thu chi
	* @param ten the ten
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next thu chi
	* @throws com.minimart.portlet.ketoan.NoSuchThuChiException if a thu chi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.ketoan.model.ThuChi[] findByTEN_PrevAndNext(
		long thuChiId, java.lang.String ten,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.ketoan.NoSuchThuChiException {
		return getPersistence()
				   .findByTEN_PrevAndNext(thuChiId, ten, orderByComparator);
	}

	/**
	* Removes all the thu chis where ten = &#63; from the database.
	*
	* @param ten the ten
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTEN(java.lang.String ten)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTEN(ten);
	}

	/**
	* Returns the number of thu chis where ten = &#63;.
	*
	* @param ten the ten
	* @return the number of matching thu chis
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTEN(java.lang.String ten)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTEN(ten);
	}

	/**
	* Returns all the thu chis where lyDoThuChi = &#63;.
	*
	* @param lyDoThuChi the ly do thu chi
	* @return the matching thu chis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.ketoan.model.ThuChi> findByLYDO(
		java.lang.String lyDoThuChi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLYDO(lyDoThuChi);
	}

	/**
	* Returns a range of all the thu chis where lyDoThuChi = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.ketoan.model.impl.ThuChiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lyDoThuChi the ly do thu chi
	* @param start the lower bound of the range of thu chis
	* @param end the upper bound of the range of thu chis (not inclusive)
	* @return the range of matching thu chis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.ketoan.model.ThuChi> findByLYDO(
		java.lang.String lyDoThuChi, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLYDO(lyDoThuChi, start, end);
	}

	/**
	* Returns an ordered range of all the thu chis where lyDoThuChi = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.ketoan.model.impl.ThuChiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lyDoThuChi the ly do thu chi
	* @param start the lower bound of the range of thu chis
	* @param end the upper bound of the range of thu chis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching thu chis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.ketoan.model.ThuChi> findByLYDO(
		java.lang.String lyDoThuChi, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByLYDO(lyDoThuChi, start, end, orderByComparator);
	}

	/**
	* Returns the first thu chi in the ordered set where lyDoThuChi = &#63;.
	*
	* @param lyDoThuChi the ly do thu chi
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thu chi
	* @throws com.minimart.portlet.ketoan.NoSuchThuChiException if a matching thu chi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.ketoan.model.ThuChi findByLYDO_First(
		java.lang.String lyDoThuChi,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.ketoan.NoSuchThuChiException {
		return getPersistence().findByLYDO_First(lyDoThuChi, orderByComparator);
	}

	/**
	* Returns the first thu chi in the ordered set where lyDoThuChi = &#63;.
	*
	* @param lyDoThuChi the ly do thu chi
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thu chi, or <code>null</code> if a matching thu chi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.ketoan.model.ThuChi fetchByLYDO_First(
		java.lang.String lyDoThuChi,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByLYDO_First(lyDoThuChi, orderByComparator);
	}

	/**
	* Returns the last thu chi in the ordered set where lyDoThuChi = &#63;.
	*
	* @param lyDoThuChi the ly do thu chi
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thu chi
	* @throws com.minimart.portlet.ketoan.NoSuchThuChiException if a matching thu chi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.ketoan.model.ThuChi findByLYDO_Last(
		java.lang.String lyDoThuChi,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.ketoan.NoSuchThuChiException {
		return getPersistence().findByLYDO_Last(lyDoThuChi, orderByComparator);
	}

	/**
	* Returns the last thu chi in the ordered set where lyDoThuChi = &#63;.
	*
	* @param lyDoThuChi the ly do thu chi
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thu chi, or <code>null</code> if a matching thu chi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.ketoan.model.ThuChi fetchByLYDO_Last(
		java.lang.String lyDoThuChi,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByLYDO_Last(lyDoThuChi, orderByComparator);
	}

	/**
	* Returns the thu chis before and after the current thu chi in the ordered set where lyDoThuChi = &#63;.
	*
	* @param thuChiId the primary key of the current thu chi
	* @param lyDoThuChi the ly do thu chi
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next thu chi
	* @throws com.minimart.portlet.ketoan.NoSuchThuChiException if a thu chi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.ketoan.model.ThuChi[] findByLYDO_PrevAndNext(
		long thuChiId, java.lang.String lyDoThuChi,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.ketoan.NoSuchThuChiException {
		return getPersistence()
				   .findByLYDO_PrevAndNext(thuChiId, lyDoThuChi,
			orderByComparator);
	}

	/**
	* Removes all the thu chis where lyDoThuChi = &#63; from the database.
	*
	* @param lyDoThuChi the ly do thu chi
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByLYDO(java.lang.String lyDoThuChi)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByLYDO(lyDoThuChi);
	}

	/**
	* Returns the number of thu chis where lyDoThuChi = &#63;.
	*
	* @param lyDoThuChi the ly do thu chi
	* @return the number of matching thu chis
	* @throws SystemException if a system exception occurred
	*/
	public static int countByLYDO(java.lang.String lyDoThuChi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByLYDO(lyDoThuChi);
	}

	/**
	* Returns all the thu chis where nhanVienId = &#63;.
	*
	* @param nhanVienId the nhan vien ID
	* @return the matching thu chis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.ketoan.model.ThuChi> findByNVID(
		long nhanVienId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByNVID(nhanVienId);
	}

	/**
	* Returns a range of all the thu chis where nhanVienId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.ketoan.model.impl.ThuChiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nhanVienId the nhan vien ID
	* @param start the lower bound of the range of thu chis
	* @param end the upper bound of the range of thu chis (not inclusive)
	* @return the range of matching thu chis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.ketoan.model.ThuChi> findByNVID(
		long nhanVienId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByNVID(nhanVienId, start, end);
	}

	/**
	* Returns an ordered range of all the thu chis where nhanVienId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.ketoan.model.impl.ThuChiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nhanVienId the nhan vien ID
	* @param start the lower bound of the range of thu chis
	* @param end the upper bound of the range of thu chis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching thu chis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.ketoan.model.ThuChi> findByNVID(
		long nhanVienId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNVID(nhanVienId, start, end, orderByComparator);
	}

	/**
	* Returns the first thu chi in the ordered set where nhanVienId = &#63;.
	*
	* @param nhanVienId the nhan vien ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thu chi
	* @throws com.minimart.portlet.ketoan.NoSuchThuChiException if a matching thu chi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.ketoan.model.ThuChi findByNVID_First(
		long nhanVienId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.ketoan.NoSuchThuChiException {
		return getPersistence().findByNVID_First(nhanVienId, orderByComparator);
	}

	/**
	* Returns the first thu chi in the ordered set where nhanVienId = &#63;.
	*
	* @param nhanVienId the nhan vien ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching thu chi, or <code>null</code> if a matching thu chi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.ketoan.model.ThuChi fetchByNVID_First(
		long nhanVienId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByNVID_First(nhanVienId, orderByComparator);
	}

	/**
	* Returns the last thu chi in the ordered set where nhanVienId = &#63;.
	*
	* @param nhanVienId the nhan vien ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thu chi
	* @throws com.minimart.portlet.ketoan.NoSuchThuChiException if a matching thu chi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.ketoan.model.ThuChi findByNVID_Last(
		long nhanVienId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.ketoan.NoSuchThuChiException {
		return getPersistence().findByNVID_Last(nhanVienId, orderByComparator);
	}

	/**
	* Returns the last thu chi in the ordered set where nhanVienId = &#63;.
	*
	* @param nhanVienId the nhan vien ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching thu chi, or <code>null</code> if a matching thu chi could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.ketoan.model.ThuChi fetchByNVID_Last(
		long nhanVienId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByNVID_Last(nhanVienId, orderByComparator);
	}

	/**
	* Returns the thu chis before and after the current thu chi in the ordered set where nhanVienId = &#63;.
	*
	* @param thuChiId the primary key of the current thu chi
	* @param nhanVienId the nhan vien ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next thu chi
	* @throws com.minimart.portlet.ketoan.NoSuchThuChiException if a thu chi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.ketoan.model.ThuChi[] findByNVID_PrevAndNext(
		long thuChiId, long nhanVienId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.ketoan.NoSuchThuChiException {
		return getPersistence()
				   .findByNVID_PrevAndNext(thuChiId, nhanVienId,
			orderByComparator);
	}

	/**
	* Removes all the thu chis where nhanVienId = &#63; from the database.
	*
	* @param nhanVienId the nhan vien ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByNVID(long nhanVienId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByNVID(nhanVienId);
	}

	/**
	* Returns the number of thu chis where nhanVienId = &#63;.
	*
	* @param nhanVienId the nhan vien ID
	* @return the number of matching thu chis
	* @throws SystemException if a system exception occurred
	*/
	public static int countByNVID(long nhanVienId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByNVID(nhanVienId);
	}

	/**
	* Caches the thu chi in the entity cache if it is enabled.
	*
	* @param thuChi the thu chi
	*/
	public static void cacheResult(
		com.minimart.portlet.ketoan.model.ThuChi thuChi) {
		getPersistence().cacheResult(thuChi);
	}

	/**
	* Caches the thu chis in the entity cache if it is enabled.
	*
	* @param thuChis the thu chis
	*/
	public static void cacheResult(
		java.util.List<com.minimart.portlet.ketoan.model.ThuChi> thuChis) {
		getPersistence().cacheResult(thuChis);
	}

	/**
	* Creates a new thu chi with the primary key. Does not add the thu chi to the database.
	*
	* @param thuChiId the primary key for the new thu chi
	* @return the new thu chi
	*/
	public static com.minimart.portlet.ketoan.model.ThuChi create(long thuChiId) {
		return getPersistence().create(thuChiId);
	}

	/**
	* Removes the thu chi with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param thuChiId the primary key of the thu chi
	* @return the thu chi that was removed
	* @throws com.minimart.portlet.ketoan.NoSuchThuChiException if a thu chi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.ketoan.model.ThuChi remove(long thuChiId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.ketoan.NoSuchThuChiException {
		return getPersistence().remove(thuChiId);
	}

	public static com.minimart.portlet.ketoan.model.ThuChi updateImpl(
		com.minimart.portlet.ketoan.model.ThuChi thuChi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(thuChi);
	}

	/**
	* Returns the thu chi with the primary key or throws a {@link com.minimart.portlet.ketoan.NoSuchThuChiException} if it could not be found.
	*
	* @param thuChiId the primary key of the thu chi
	* @return the thu chi
	* @throws com.minimart.portlet.ketoan.NoSuchThuChiException if a thu chi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.ketoan.model.ThuChi findByPrimaryKey(
		long thuChiId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.ketoan.NoSuchThuChiException {
		return getPersistence().findByPrimaryKey(thuChiId);
	}

	/**
	* Returns the thu chi with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param thuChiId the primary key of the thu chi
	* @return the thu chi, or <code>null</code> if a thu chi with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.ketoan.model.ThuChi fetchByPrimaryKey(
		long thuChiId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(thuChiId);
	}

	/**
	* Returns all the thu chis.
	*
	* @return the thu chis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.ketoan.model.ThuChi> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the thu chis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.ketoan.model.impl.ThuChiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of thu chis
	* @param end the upper bound of the range of thu chis (not inclusive)
	* @return the range of thu chis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.ketoan.model.ThuChi> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the thu chis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.ketoan.model.impl.ThuChiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of thu chis
	* @param end the upper bound of the range of thu chis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of thu chis
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.ketoan.model.ThuChi> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the thu chis from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of thu chis.
	*
	* @return the number of thu chis
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ThuChiPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ThuChiPersistence)PortletBeanLocatorUtil.locate(com.minimart.portlet.ketoan.service.ClpSerializer.getServletContextName(),
					ThuChiPersistence.class.getName());

			ReferenceRegistry.registerReference(ThuChiUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ThuChiPersistence persistence) {
	}

	private static ThuChiPersistence _persistence;
}