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

import com.liferay.portal.service.persistence.BasePersistence;

import com.minimart.portlet.banhang.model.DonHangChiTiet;

/**
 * The persistence interface for the don hang chi tiet service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see DonHangChiTietPersistenceImpl
 * @see DonHangChiTietUtil
 * @generated
 */
public interface DonHangChiTietPersistence extends BasePersistence<DonHangChiTiet> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DonHangChiTietUtil} to access the don hang chi tiet persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the don hang chi tiets where donHangId = &#63; and matHangId = &#63; and hoatDong = &#63;.
	*
	* @param donHangId the don hang ID
	* @param matHangId the mat hang ID
	* @param hoatDong the hoat dong
	* @return the matching don hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.banhang.model.DonHangChiTiet> findByDH_MH_HD(
		long donHangId, long matHangId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.minimart.portlet.banhang.model.DonHangChiTiet> findByDH_MH_HD(
		long donHangId, long matHangId, boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.minimart.portlet.banhang.model.DonHangChiTiet> findByDH_MH_HD(
		long donHangId, long matHangId, boolean hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.minimart.portlet.banhang.model.DonHangChiTiet findByDH_MH_HD_First(
		long donHangId, long matHangId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.banhang.NoSuchDonHangChiTietException;

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
	public com.minimart.portlet.banhang.model.DonHangChiTiet fetchByDH_MH_HD_First(
		long donHangId, long matHangId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.minimart.portlet.banhang.model.DonHangChiTiet findByDH_MH_HD_Last(
		long donHangId, long matHangId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.banhang.NoSuchDonHangChiTietException;

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
	public com.minimart.portlet.banhang.model.DonHangChiTiet fetchByDH_MH_HD_Last(
		long donHangId, long matHangId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.minimart.portlet.banhang.model.DonHangChiTiet[] findByDH_MH_HD_PrevAndNext(
		long donHangChiTietId, long donHangId, long matHangId,
		boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.banhang.NoSuchDonHangChiTietException;

	/**
	* Removes all the don hang chi tiets where donHangId = &#63; and matHangId = &#63; and hoatDong = &#63; from the database.
	*
	* @param donHangId the don hang ID
	* @param matHangId the mat hang ID
	* @param hoatDong the hoat dong
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDH_MH_HD(long donHangId, long matHangId,
		boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of don hang chi tiets where donHangId = &#63; and matHangId = &#63; and hoatDong = &#63;.
	*
	* @param donHangId the don hang ID
	* @param matHangId the mat hang ID
	* @param hoatDong the hoat dong
	* @return the number of matching don hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public int countByDH_MH_HD(long donHangId, long matHangId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the don hang chi tiets where donHangId = &#63; and hoatDong = &#63;.
	*
	* @param donHangId the don hang ID
	* @param hoatDong the hoat dong
	* @return the matching don hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.banhang.model.DonHangChiTiet> findByDH_HD(
		long donHangId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.minimart.portlet.banhang.model.DonHangChiTiet> findByDH_HD(
		long donHangId, boolean hoatDong, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.minimart.portlet.banhang.model.DonHangChiTiet> findByDH_HD(
		long donHangId, boolean hoatDong, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.minimart.portlet.banhang.model.DonHangChiTiet findByDH_HD_First(
		long donHangId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.banhang.NoSuchDonHangChiTietException;

	/**
	* Returns the first don hang chi tiet in the ordered set where donHangId = &#63; and hoatDong = &#63;.
	*
	* @param donHangId the don hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching don hang chi tiet, or <code>null</code> if a matching don hang chi tiet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.banhang.model.DonHangChiTiet fetchByDH_HD_First(
		long donHangId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.minimart.portlet.banhang.model.DonHangChiTiet findByDH_HD_Last(
		long donHangId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.banhang.NoSuchDonHangChiTietException;

	/**
	* Returns the last don hang chi tiet in the ordered set where donHangId = &#63; and hoatDong = &#63;.
	*
	* @param donHangId the don hang ID
	* @param hoatDong the hoat dong
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching don hang chi tiet, or <code>null</code> if a matching don hang chi tiet could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.banhang.model.DonHangChiTiet fetchByDH_HD_Last(
		long donHangId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.minimart.portlet.banhang.model.DonHangChiTiet[] findByDH_HD_PrevAndNext(
		long donHangChiTietId, long donHangId, boolean hoatDong,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.banhang.NoSuchDonHangChiTietException;

	/**
	* Removes all the don hang chi tiets where donHangId = &#63; and hoatDong = &#63; from the database.
	*
	* @param donHangId the don hang ID
	* @param hoatDong the hoat dong
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDH_HD(long donHangId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of don hang chi tiets where donHangId = &#63; and hoatDong = &#63;.
	*
	* @param donHangId the don hang ID
	* @param hoatDong the hoat dong
	* @return the number of matching don hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public int countByDH_HD(long donHangId, boolean hoatDong)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the don hang chi tiet in the entity cache if it is enabled.
	*
	* @param donHangChiTiet the don hang chi tiet
	*/
	public void cacheResult(
		com.minimart.portlet.banhang.model.DonHangChiTiet donHangChiTiet);

	/**
	* Caches the don hang chi tiets in the entity cache if it is enabled.
	*
	* @param donHangChiTiets the don hang chi tiets
	*/
	public void cacheResult(
		java.util.List<com.minimart.portlet.banhang.model.DonHangChiTiet> donHangChiTiets);

	/**
	* Creates a new don hang chi tiet with the primary key. Does not add the don hang chi tiet to the database.
	*
	* @param donHangChiTietId the primary key for the new don hang chi tiet
	* @return the new don hang chi tiet
	*/
	public com.minimart.portlet.banhang.model.DonHangChiTiet create(
		long donHangChiTietId);

	/**
	* Removes the don hang chi tiet with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param donHangChiTietId the primary key of the don hang chi tiet
	* @return the don hang chi tiet that was removed
	* @throws com.minimart.portlet.banhang.NoSuchDonHangChiTietException if a don hang chi tiet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.banhang.model.DonHangChiTiet remove(
		long donHangChiTietId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.banhang.NoSuchDonHangChiTietException;

	public com.minimart.portlet.banhang.model.DonHangChiTiet updateImpl(
		com.minimart.portlet.banhang.model.DonHangChiTiet donHangChiTiet)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the don hang chi tiet with the primary key or throws a {@link com.minimart.portlet.banhang.NoSuchDonHangChiTietException} if it could not be found.
	*
	* @param donHangChiTietId the primary key of the don hang chi tiet
	* @return the don hang chi tiet
	* @throws com.minimart.portlet.banhang.NoSuchDonHangChiTietException if a don hang chi tiet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.banhang.model.DonHangChiTiet findByPrimaryKey(
		long donHangChiTietId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.banhang.NoSuchDonHangChiTietException;

	/**
	* Returns the don hang chi tiet with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param donHangChiTietId the primary key of the don hang chi tiet
	* @return the don hang chi tiet, or <code>null</code> if a don hang chi tiet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.banhang.model.DonHangChiTiet fetchByPrimaryKey(
		long donHangChiTietId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the don hang chi tiets.
	*
	* @return the don hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.banhang.model.DonHangChiTiet> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.minimart.portlet.banhang.model.DonHangChiTiet> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.minimart.portlet.banhang.model.DonHangChiTiet> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the don hang chi tiets from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of don hang chi tiets.
	*
	* @return the number of don hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}