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

package com.minimart.portlet.nhanvien.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.minimart.portlet.nhanvien.model.NhanVien;

import java.util.List;

/**
 * The persistence utility for the nhan vien service. This utility wraps {@link NhanVienPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see NhanVienPersistence
 * @see NhanVienPersistenceImpl
 * @generated
 */
public class NhanVienUtil {
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
	public static void clearCache(NhanVien nhanVien) {
		getPersistence().clearCache(nhanVien);
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
	public static List<NhanVien> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NhanVien> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NhanVien> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static NhanVien update(NhanVien nhanVien) throws SystemException {
		return getPersistence().update(nhanVien);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static NhanVien update(NhanVien nhanVien,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(nhanVien, serviceContext);
	}

	/**
	* Returns all the nhan viens where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhanvien.model.NhanVien> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the nhan viens where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of nhan viens
	* @param end the upper bound of the range of nhan viens (not inclusive)
	* @return the range of matching nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhanvien.model.NhanVien> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the nhan viens where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of nhan viens
	* @param end the upper bound of the range of nhan viens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhanvien.model.NhanVien> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns the first nhan vien in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhan vien
	* @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a matching nhan vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhanvien.NoSuchNhanVienException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first nhan vien in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last nhan vien in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhan vien
	* @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a matching nhan vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhanvien.NoSuchNhanVienException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last nhan vien in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the nhan viens before and after the current nhan vien in the ordered set where uuid = &#63;.
	*
	* @param nhanVienId the primary key of the current nhan vien
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next nhan vien
	* @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a nhan vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien[] findByUuid_PrevAndNext(
		long nhanVienId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhanvien.NoSuchNhanVienException {
		return getPersistence()
				   .findByUuid_PrevAndNext(nhanVienId, uuid, orderByComparator);
	}

	/**
	* Removes all the nhan viens where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of nhan viens where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns all the nhan viens where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhanvien.model.NhanVien> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the nhan viens where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of nhan viens
	* @param end the upper bound of the range of nhan viens (not inclusive)
	* @return the range of matching nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhanvien.model.NhanVien> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the nhan viens where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of nhan viens
	* @param end the upper bound of the range of nhan viens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhanvien.model.NhanVien> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first nhan vien in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhan vien
	* @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a matching nhan vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhanvien.NoSuchNhanVienException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first nhan vien in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last nhan vien in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhan vien
	* @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a matching nhan vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhanvien.NoSuchNhanVienException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last nhan vien in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the nhan viens before and after the current nhan vien in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param nhanVienId the primary key of the current nhan vien
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next nhan vien
	* @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a nhan vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien[] findByUuid_C_PrevAndNext(
		long nhanVienId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhanvien.NoSuchNhanVienException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(nhanVienId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the nhan viens where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of nhan viens where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the nhan viens where ten = &#63; and ho = &#63;.
	*
	* @param ten the ten
	* @param ho the ho
	* @return the matching nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhanvien.model.NhanVien> findByTEN_HO(
		java.lang.String ten, java.lang.String ho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTEN_HO(ten, ho);
	}

	/**
	* Returns a range of all the nhan viens where ten = &#63; and ho = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param ho the ho
	* @param start the lower bound of the range of nhan viens
	* @param end the upper bound of the range of nhan viens (not inclusive)
	* @return the range of matching nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhanvien.model.NhanVien> findByTEN_HO(
		java.lang.String ten, java.lang.String ho, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTEN_HO(ten, ho, start, end);
	}

	/**
	* Returns an ordered range of all the nhan viens where ten = &#63; and ho = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param ho the ho
	* @param start the lower bound of the range of nhan viens
	* @param end the upper bound of the range of nhan viens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhanvien.model.NhanVien> findByTEN_HO(
		java.lang.String ten, java.lang.String ho, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTEN_HO(ten, ho, start, end, orderByComparator);
	}

	/**
	* Returns the first nhan vien in the ordered set where ten = &#63; and ho = &#63;.
	*
	* @param ten the ten
	* @param ho the ho
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhan vien
	* @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a matching nhan vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien findByTEN_HO_First(
		java.lang.String ten, java.lang.String ho,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhanvien.NoSuchNhanVienException {
		return getPersistence().findByTEN_HO_First(ten, ho, orderByComparator);
	}

	/**
	* Returns the first nhan vien in the ordered set where ten = &#63; and ho = &#63;.
	*
	* @param ten the ten
	* @param ho the ho
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien fetchByTEN_HO_First(
		java.lang.String ten, java.lang.String ho,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTEN_HO_First(ten, ho, orderByComparator);
	}

	/**
	* Returns the last nhan vien in the ordered set where ten = &#63; and ho = &#63;.
	*
	* @param ten the ten
	* @param ho the ho
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhan vien
	* @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a matching nhan vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien findByTEN_HO_Last(
		java.lang.String ten, java.lang.String ho,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhanvien.NoSuchNhanVienException {
		return getPersistence().findByTEN_HO_Last(ten, ho, orderByComparator);
	}

	/**
	* Returns the last nhan vien in the ordered set where ten = &#63; and ho = &#63;.
	*
	* @param ten the ten
	* @param ho the ho
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien fetchByTEN_HO_Last(
		java.lang.String ten, java.lang.String ho,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTEN_HO_Last(ten, ho, orderByComparator);
	}

	/**
	* Returns the nhan viens before and after the current nhan vien in the ordered set where ten = &#63; and ho = &#63;.
	*
	* @param nhanVienId the primary key of the current nhan vien
	* @param ten the ten
	* @param ho the ho
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next nhan vien
	* @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a nhan vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien[] findByTEN_HO_PrevAndNext(
		long nhanVienId, java.lang.String ten, java.lang.String ho,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhanvien.NoSuchNhanVienException {
		return getPersistence()
				   .findByTEN_HO_PrevAndNext(nhanVienId, ten, ho,
			orderByComparator);
	}

	/**
	* Removes all the nhan viens where ten = &#63; and ho = &#63; from the database.
	*
	* @param ten the ten
	* @param ho the ho
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTEN_HO(java.lang.String ten, java.lang.String ho)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTEN_HO(ten, ho);
	}

	/**
	* Returns the number of nhan viens where ten = &#63; and ho = &#63;.
	*
	* @param ten the ten
	* @param ho the ho
	* @return the number of matching nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTEN_HO(java.lang.String ten, java.lang.String ho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTEN_HO(ten, ho);
	}

	/**
	* Returns all the nhan viens where ten = &#63; and ho = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param ho the ho
	* @param trangThai the trang thai
	* @return the matching nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhanvien.model.NhanVien> findByTEN_HO_TH(
		java.lang.String ten, java.lang.String ho, boolean trangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTEN_HO_TH(ten, ho, trangThai);
	}

	/**
	* Returns a range of all the nhan viens where ten = &#63; and ho = &#63; and trangThai = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param ho the ho
	* @param trangThai the trang thai
	* @param start the lower bound of the range of nhan viens
	* @param end the upper bound of the range of nhan viens (not inclusive)
	* @return the range of matching nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhanvien.model.NhanVien> findByTEN_HO_TH(
		java.lang.String ten, java.lang.String ho, boolean trangThai,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTEN_HO_TH(ten, ho, trangThai, start, end);
	}

	/**
	* Returns an ordered range of all the nhan viens where ten = &#63; and ho = &#63; and trangThai = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ten the ten
	* @param ho the ho
	* @param trangThai the trang thai
	* @param start the lower bound of the range of nhan viens
	* @param end the upper bound of the range of nhan viens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhanvien.model.NhanVien> findByTEN_HO_TH(
		java.lang.String ten, java.lang.String ho, boolean trangThai,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTEN_HO_TH(ten, ho, trangThai, start, end,
			orderByComparator);
	}

	/**
	* Returns the first nhan vien in the ordered set where ten = &#63; and ho = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param ho the ho
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhan vien
	* @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a matching nhan vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien findByTEN_HO_TH_First(
		java.lang.String ten, java.lang.String ho, boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhanvien.NoSuchNhanVienException {
		return getPersistence()
				   .findByTEN_HO_TH_First(ten, ho, trangThai, orderByComparator);
	}

	/**
	* Returns the first nhan vien in the ordered set where ten = &#63; and ho = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param ho the ho
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien fetchByTEN_HO_TH_First(
		java.lang.String ten, java.lang.String ho, boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTEN_HO_TH_First(ten, ho, trangThai, orderByComparator);
	}

	/**
	* Returns the last nhan vien in the ordered set where ten = &#63; and ho = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param ho the ho
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhan vien
	* @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a matching nhan vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien findByTEN_HO_TH_Last(
		java.lang.String ten, java.lang.String ho, boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhanvien.NoSuchNhanVienException {
		return getPersistence()
				   .findByTEN_HO_TH_Last(ten, ho, trangThai, orderByComparator);
	}

	/**
	* Returns the last nhan vien in the ordered set where ten = &#63; and ho = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param ho the ho
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien fetchByTEN_HO_TH_Last(
		java.lang.String ten, java.lang.String ho, boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTEN_HO_TH_Last(ten, ho, trangThai, orderByComparator);
	}

	/**
	* Returns the nhan viens before and after the current nhan vien in the ordered set where ten = &#63; and ho = &#63; and trangThai = &#63;.
	*
	* @param nhanVienId the primary key of the current nhan vien
	* @param ten the ten
	* @param ho the ho
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next nhan vien
	* @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a nhan vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien[] findByTEN_HO_TH_PrevAndNext(
		long nhanVienId, java.lang.String ten, java.lang.String ho,
		boolean trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhanvien.NoSuchNhanVienException {
		return getPersistence()
				   .findByTEN_HO_TH_PrevAndNext(nhanVienId, ten, ho, trangThai,
			orderByComparator);
	}

	/**
	* Removes all the nhan viens where ten = &#63; and ho = &#63; and trangThai = &#63; from the database.
	*
	* @param ten the ten
	* @param ho the ho
	* @param trangThai the trang thai
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTEN_HO_TH(java.lang.String ten,
		java.lang.String ho, boolean trangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTEN_HO_TH(ten, ho, trangThai);
	}

	/**
	* Returns the number of nhan viens where ten = &#63; and ho = &#63; and trangThai = &#63;.
	*
	* @param ten the ten
	* @param ho the ho
	* @param trangThai the trang thai
	* @return the number of matching nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTEN_HO_TH(java.lang.String ten,
		java.lang.String ho, boolean trangThai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTEN_HO_TH(ten, ho, trangThai);
	}

	/**
	* Returns all the nhan viens where nghiThu7 = &#63;.
	*
	* @param nghiThu7 the nghi thu7
	* @return the matching nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhanvien.model.NhanVien> findByNGHIT7(
		boolean nghiThu7)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByNGHIT7(nghiThu7);
	}

	/**
	* Returns a range of all the nhan viens where nghiThu7 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nghiThu7 the nghi thu7
	* @param start the lower bound of the range of nhan viens
	* @param end the upper bound of the range of nhan viens (not inclusive)
	* @return the range of matching nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhanvien.model.NhanVien> findByNGHIT7(
		boolean nghiThu7, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByNGHIT7(nghiThu7, start, end);
	}

	/**
	* Returns an ordered range of all the nhan viens where nghiThu7 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nghiThu7 the nghi thu7
	* @param start the lower bound of the range of nhan viens
	* @param end the upper bound of the range of nhan viens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhanvien.model.NhanVien> findByNGHIT7(
		boolean nghiThu7, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNGHIT7(nghiThu7, start, end, orderByComparator);
	}

	/**
	* Returns the first nhan vien in the ordered set where nghiThu7 = &#63;.
	*
	* @param nghiThu7 the nghi thu7
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhan vien
	* @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a matching nhan vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien findByNGHIT7_First(
		boolean nghiThu7,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhanvien.NoSuchNhanVienException {
		return getPersistence().findByNGHIT7_First(nghiThu7, orderByComparator);
	}

	/**
	* Returns the first nhan vien in the ordered set where nghiThu7 = &#63;.
	*
	* @param nghiThu7 the nghi thu7
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien fetchByNGHIT7_First(
		boolean nghiThu7,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByNGHIT7_First(nghiThu7, orderByComparator);
	}

	/**
	* Returns the last nhan vien in the ordered set where nghiThu7 = &#63;.
	*
	* @param nghiThu7 the nghi thu7
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhan vien
	* @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a matching nhan vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien findByNGHIT7_Last(
		boolean nghiThu7,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhanvien.NoSuchNhanVienException {
		return getPersistence().findByNGHIT7_Last(nghiThu7, orderByComparator);
	}

	/**
	* Returns the last nhan vien in the ordered set where nghiThu7 = &#63;.
	*
	* @param nghiThu7 the nghi thu7
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien fetchByNGHIT7_Last(
		boolean nghiThu7,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByNGHIT7_Last(nghiThu7, orderByComparator);
	}

	/**
	* Returns the nhan viens before and after the current nhan vien in the ordered set where nghiThu7 = &#63;.
	*
	* @param nhanVienId the primary key of the current nhan vien
	* @param nghiThu7 the nghi thu7
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next nhan vien
	* @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a nhan vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien[] findByNGHIT7_PrevAndNext(
		long nhanVienId, boolean nghiThu7,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhanvien.NoSuchNhanVienException {
		return getPersistence()
				   .findByNGHIT7_PrevAndNext(nhanVienId, nghiThu7,
			orderByComparator);
	}

	/**
	* Removes all the nhan viens where nghiThu7 = &#63; from the database.
	*
	* @param nghiThu7 the nghi thu7
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByNGHIT7(boolean nghiThu7)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByNGHIT7(nghiThu7);
	}

	/**
	* Returns the number of nhan viens where nghiThu7 = &#63;.
	*
	* @param nghiThu7 the nghi thu7
	* @return the number of matching nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public static int countByNGHIT7(boolean nghiThu7)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByNGHIT7(nghiThu7);
	}

	/**
	* Returns all the nhan viens where nghiThu7 = &#63; and nghiChuNhat = &#63;.
	*
	* @param nghiThu7 the nghi thu7
	* @param nghiChuNhat the nghi chu nhat
	* @return the matching nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhanvien.model.NhanVien> findByNGHIT7_CN(
		boolean nghiThu7, boolean nghiChuNhat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByNGHIT7_CN(nghiThu7, nghiChuNhat);
	}

	/**
	* Returns a range of all the nhan viens where nghiThu7 = &#63; and nghiChuNhat = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nghiThu7 the nghi thu7
	* @param nghiChuNhat the nghi chu nhat
	* @param start the lower bound of the range of nhan viens
	* @param end the upper bound of the range of nhan viens (not inclusive)
	* @return the range of matching nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhanvien.model.NhanVien> findByNGHIT7_CN(
		boolean nghiThu7, boolean nghiChuNhat, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNGHIT7_CN(nghiThu7, nghiChuNhat, start, end);
	}

	/**
	* Returns an ordered range of all the nhan viens where nghiThu7 = &#63; and nghiChuNhat = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nghiThu7 the nghi thu7
	* @param nghiChuNhat the nghi chu nhat
	* @param start the lower bound of the range of nhan viens
	* @param end the upper bound of the range of nhan viens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhanvien.model.NhanVien> findByNGHIT7_CN(
		boolean nghiThu7, boolean nghiChuNhat, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNGHIT7_CN(nghiThu7, nghiChuNhat, start, end,
			orderByComparator);
	}

	/**
	* Returns the first nhan vien in the ordered set where nghiThu7 = &#63; and nghiChuNhat = &#63;.
	*
	* @param nghiThu7 the nghi thu7
	* @param nghiChuNhat the nghi chu nhat
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhan vien
	* @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a matching nhan vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien findByNGHIT7_CN_First(
		boolean nghiThu7, boolean nghiChuNhat,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhanvien.NoSuchNhanVienException {
		return getPersistence()
				   .findByNGHIT7_CN_First(nghiThu7, nghiChuNhat,
			orderByComparator);
	}

	/**
	* Returns the first nhan vien in the ordered set where nghiThu7 = &#63; and nghiChuNhat = &#63;.
	*
	* @param nghiThu7 the nghi thu7
	* @param nghiChuNhat the nghi chu nhat
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien fetchByNGHIT7_CN_First(
		boolean nghiThu7, boolean nghiChuNhat,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNGHIT7_CN_First(nghiThu7, nghiChuNhat,
			orderByComparator);
	}

	/**
	* Returns the last nhan vien in the ordered set where nghiThu7 = &#63; and nghiChuNhat = &#63;.
	*
	* @param nghiThu7 the nghi thu7
	* @param nghiChuNhat the nghi chu nhat
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhan vien
	* @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a matching nhan vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien findByNGHIT7_CN_Last(
		boolean nghiThu7, boolean nghiChuNhat,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhanvien.NoSuchNhanVienException {
		return getPersistence()
				   .findByNGHIT7_CN_Last(nghiThu7, nghiChuNhat,
			orderByComparator);
	}

	/**
	* Returns the last nhan vien in the ordered set where nghiThu7 = &#63; and nghiChuNhat = &#63;.
	*
	* @param nghiThu7 the nghi thu7
	* @param nghiChuNhat the nghi chu nhat
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien fetchByNGHIT7_CN_Last(
		boolean nghiThu7, boolean nghiChuNhat,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNGHIT7_CN_Last(nghiThu7, nghiChuNhat,
			orderByComparator);
	}

	/**
	* Returns the nhan viens before and after the current nhan vien in the ordered set where nghiThu7 = &#63; and nghiChuNhat = &#63;.
	*
	* @param nhanVienId the primary key of the current nhan vien
	* @param nghiThu7 the nghi thu7
	* @param nghiChuNhat the nghi chu nhat
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next nhan vien
	* @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a nhan vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien[] findByNGHIT7_CN_PrevAndNext(
		long nhanVienId, boolean nghiThu7, boolean nghiChuNhat,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhanvien.NoSuchNhanVienException {
		return getPersistence()
				   .findByNGHIT7_CN_PrevAndNext(nhanVienId, nghiThu7,
			nghiChuNhat, orderByComparator);
	}

	/**
	* Removes all the nhan viens where nghiThu7 = &#63; and nghiChuNhat = &#63; from the database.
	*
	* @param nghiThu7 the nghi thu7
	* @param nghiChuNhat the nghi chu nhat
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByNGHIT7_CN(boolean nghiThu7, boolean nghiChuNhat)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByNGHIT7_CN(nghiThu7, nghiChuNhat);
	}

	/**
	* Returns the number of nhan viens where nghiThu7 = &#63; and nghiChuNhat = &#63;.
	*
	* @param nghiThu7 the nghi thu7
	* @param nghiChuNhat the nghi chu nhat
	* @return the number of matching nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public static int countByNGHIT7_CN(boolean nghiThu7, boolean nghiChuNhat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByNGHIT7_CN(nghiThu7, nghiChuNhat);
	}

	/**
	* Caches the nhan vien in the entity cache if it is enabled.
	*
	* @param nhanVien the nhan vien
	*/
	public static void cacheResult(
		com.minimart.portlet.nhanvien.model.NhanVien nhanVien) {
		getPersistence().cacheResult(nhanVien);
	}

	/**
	* Caches the nhan viens in the entity cache if it is enabled.
	*
	* @param nhanViens the nhan viens
	*/
	public static void cacheResult(
		java.util.List<com.minimart.portlet.nhanvien.model.NhanVien> nhanViens) {
		getPersistence().cacheResult(nhanViens);
	}

	/**
	* Creates a new nhan vien with the primary key. Does not add the nhan vien to the database.
	*
	* @param nhanVienId the primary key for the new nhan vien
	* @return the new nhan vien
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien create(
		long nhanVienId) {
		return getPersistence().create(nhanVienId);
	}

	/**
	* Removes the nhan vien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param nhanVienId the primary key of the nhan vien
	* @return the nhan vien that was removed
	* @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a nhan vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien remove(
		long nhanVienId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhanvien.NoSuchNhanVienException {
		return getPersistence().remove(nhanVienId);
	}

	public static com.minimart.portlet.nhanvien.model.NhanVien updateImpl(
		com.minimart.portlet.nhanvien.model.NhanVien nhanVien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(nhanVien);
	}

	/**
	* Returns the nhan vien with the primary key or throws a {@link com.minimart.portlet.nhanvien.NoSuchNhanVienException} if it could not be found.
	*
	* @param nhanVienId the primary key of the nhan vien
	* @return the nhan vien
	* @throws com.minimart.portlet.nhanvien.NoSuchNhanVienException if a nhan vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien findByPrimaryKey(
		long nhanVienId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.nhanvien.NoSuchNhanVienException {
		return getPersistence().findByPrimaryKey(nhanVienId);
	}

	/**
	* Returns the nhan vien with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param nhanVienId the primary key of the nhan vien
	* @return the nhan vien, or <code>null</code> if a nhan vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhanvien.model.NhanVien fetchByPrimaryKey(
		long nhanVienId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(nhanVienId);
	}

	/**
	* Returns all the nhan viens.
	*
	* @return the nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhanvien.model.NhanVien> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the nhan viens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nhan viens
	* @param end the upper bound of the range of nhan viens (not inclusive)
	* @return the range of nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhanvien.model.NhanVien> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the nhan viens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nhan viens
	* @param end the upper bound of the range of nhan viens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.nhanvien.model.NhanVien> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the nhan viens from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of nhan viens.
	*
	* @return the number of nhan viens
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static NhanVienPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (NhanVienPersistence)PortletBeanLocatorUtil.locate(com.minimart.portlet.nhanvien.service.ClpSerializer.getServletContextName(),
					NhanVienPersistence.class.getName());

			ReferenceRegistry.registerReference(NhanVienUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(NhanVienPersistence persistence) {
	}

	private static NhanVienPersistence _persistence;
}