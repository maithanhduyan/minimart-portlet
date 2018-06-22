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

import com.liferay.portal.service.persistence.BasePersistence;

import com.minimart.portlet.thethanhtoan.model.TheTraTruoc;

/**
 * The persistence interface for the the tra truoc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see TheTraTruocPersistenceImpl
 * @see TheTraTruocUtil
 * @generated
 */
public interface TheTraTruocPersistence extends BasePersistence<TheTraTruoc> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TheTraTruocUtil} to access the the tra truoc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the the tra truocs where ngayHetHan = &#63;.
	*
	* @param ngayHetHan the ngay het han
	* @return the matching the tra truocs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.thethanhtoan.model.TheTraTruoc> findByNGAYHH(
		java.util.Date ngayHetHan)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.minimart.portlet.thethanhtoan.model.TheTraTruoc> findByNGAYHH(
		java.util.Date ngayHetHan, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.minimart.portlet.thethanhtoan.model.TheTraTruoc> findByNGAYHH(
		java.util.Date ngayHetHan, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first the tra truoc in the ordered set where ngayHetHan = &#63;.
	*
	* @param ngayHetHan the ngay het han
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching the tra truoc
	* @throws com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException if a matching the tra truoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.thethanhtoan.model.TheTraTruoc findByNGAYHH_First(
		java.util.Date ngayHetHan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException;

	/**
	* Returns the first the tra truoc in the ordered set where ngayHetHan = &#63;.
	*
	* @param ngayHetHan the ngay het han
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching the tra truoc, or <code>null</code> if a matching the tra truoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.thethanhtoan.model.TheTraTruoc fetchByNGAYHH_First(
		java.util.Date ngayHetHan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last the tra truoc in the ordered set where ngayHetHan = &#63;.
	*
	* @param ngayHetHan the ngay het han
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching the tra truoc
	* @throws com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException if a matching the tra truoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.thethanhtoan.model.TheTraTruoc findByNGAYHH_Last(
		java.util.Date ngayHetHan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException;

	/**
	* Returns the last the tra truoc in the ordered set where ngayHetHan = &#63;.
	*
	* @param ngayHetHan the ngay het han
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching the tra truoc, or <code>null</code> if a matching the tra truoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.thethanhtoan.model.TheTraTruoc fetchByNGAYHH_Last(
		java.util.Date ngayHetHan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.minimart.portlet.thethanhtoan.model.TheTraTruoc[] findByNGAYHH_PrevAndNext(
		long theTraTruocId, java.util.Date ngayHetHan,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException;

	/**
	* Removes all the the tra truocs where ngayHetHan = &#63; from the database.
	*
	* @param ngayHetHan the ngay het han
	* @throws SystemException if a system exception occurred
	*/
	public void removeByNGAYHH(java.util.Date ngayHetHan)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of the tra truocs where ngayHetHan = &#63;.
	*
	* @param ngayHetHan the ngay het han
	* @return the number of matching the tra truocs
	* @throws SystemException if a system exception occurred
	*/
	public int countByNGAYHH(java.util.Date ngayHetHan)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the the tra truocs where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @return the matching the tra truocs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.thethanhtoan.model.TheTraTruoc> findByTT(
		java.lang.String trangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.minimart.portlet.thethanhtoan.model.TheTraTruoc> findByTT(
		java.lang.String trangThai, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.minimart.portlet.thethanhtoan.model.TheTraTruoc> findByTT(
		java.lang.String trangThai, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first the tra truoc in the ordered set where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching the tra truoc
	* @throws com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException if a matching the tra truoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.thethanhtoan.model.TheTraTruoc findByTT_First(
		java.lang.String trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException;

	/**
	* Returns the first the tra truoc in the ordered set where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching the tra truoc, or <code>null</code> if a matching the tra truoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.thethanhtoan.model.TheTraTruoc fetchByTT_First(
		java.lang.String trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last the tra truoc in the ordered set where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching the tra truoc
	* @throws com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException if a matching the tra truoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.thethanhtoan.model.TheTraTruoc findByTT_Last(
		java.lang.String trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException;

	/**
	* Returns the last the tra truoc in the ordered set where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching the tra truoc, or <code>null</code> if a matching the tra truoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.thethanhtoan.model.TheTraTruoc fetchByTT_Last(
		java.lang.String trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.minimart.portlet.thethanhtoan.model.TheTraTruoc[] findByTT_PrevAndNext(
		long theTraTruocId, java.lang.String trangThai,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException;

	/**
	* Removes all the the tra truocs where trangThai = &#63; from the database.
	*
	* @param trangThai the trang thai
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTT(java.lang.String trangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of the tra truocs where trangThai = &#63;.
	*
	* @param trangThai the trang thai
	* @return the number of matching the tra truocs
	* @throws SystemException if a system exception occurred
	*/
	public int countByTT(java.lang.String trangThai)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the the tra truocs where ngayHetHan = &#63; and khoa = &#63;.
	*
	* @param ngayHetHan the ngay het han
	* @param khoa the khoa
	* @return the matching the tra truocs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.thethanhtoan.model.TheTraTruoc> findByNGAYHH_KHOA(
		java.util.Date ngayHetHan, boolean khoa)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.minimart.portlet.thethanhtoan.model.TheTraTruoc> findByNGAYHH_KHOA(
		java.util.Date ngayHetHan, boolean khoa, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.minimart.portlet.thethanhtoan.model.TheTraTruoc> findByNGAYHH_KHOA(
		java.util.Date ngayHetHan, boolean khoa, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.minimart.portlet.thethanhtoan.model.TheTraTruoc findByNGAYHH_KHOA_First(
		java.util.Date ngayHetHan, boolean khoa,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException;

	/**
	* Returns the first the tra truoc in the ordered set where ngayHetHan = &#63; and khoa = &#63;.
	*
	* @param ngayHetHan the ngay het han
	* @param khoa the khoa
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching the tra truoc, or <code>null</code> if a matching the tra truoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.thethanhtoan.model.TheTraTruoc fetchByNGAYHH_KHOA_First(
		java.util.Date ngayHetHan, boolean khoa,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.minimart.portlet.thethanhtoan.model.TheTraTruoc findByNGAYHH_KHOA_Last(
		java.util.Date ngayHetHan, boolean khoa,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException;

	/**
	* Returns the last the tra truoc in the ordered set where ngayHetHan = &#63; and khoa = &#63;.
	*
	* @param ngayHetHan the ngay het han
	* @param khoa the khoa
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching the tra truoc, or <code>null</code> if a matching the tra truoc could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.thethanhtoan.model.TheTraTruoc fetchByNGAYHH_KHOA_Last(
		java.util.Date ngayHetHan, boolean khoa,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.minimart.portlet.thethanhtoan.model.TheTraTruoc[] findByNGAYHH_KHOA_PrevAndNext(
		long theTraTruocId, java.util.Date ngayHetHan, boolean khoa,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException;

	/**
	* Removes all the the tra truocs where ngayHetHan = &#63; and khoa = &#63; from the database.
	*
	* @param ngayHetHan the ngay het han
	* @param khoa the khoa
	* @throws SystemException if a system exception occurred
	*/
	public void removeByNGAYHH_KHOA(java.util.Date ngayHetHan, boolean khoa)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of the tra truocs where ngayHetHan = &#63; and khoa = &#63;.
	*
	* @param ngayHetHan the ngay het han
	* @param khoa the khoa
	* @return the number of matching the tra truocs
	* @throws SystemException if a system exception occurred
	*/
	public int countByNGAYHH_KHOA(java.util.Date ngayHetHan, boolean khoa)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the the tra truoc in the entity cache if it is enabled.
	*
	* @param theTraTruoc the the tra truoc
	*/
	public void cacheResult(
		com.minimart.portlet.thethanhtoan.model.TheTraTruoc theTraTruoc);

	/**
	* Caches the the tra truocs in the entity cache if it is enabled.
	*
	* @param theTraTruocs the the tra truocs
	*/
	public void cacheResult(
		java.util.List<com.minimart.portlet.thethanhtoan.model.TheTraTruoc> theTraTruocs);

	/**
	* Creates a new the tra truoc with the primary key. Does not add the the tra truoc to the database.
	*
	* @param theTraTruocId the primary key for the new the tra truoc
	* @return the new the tra truoc
	*/
	public com.minimart.portlet.thethanhtoan.model.TheTraTruoc create(
		long theTraTruocId);

	/**
	* Removes the the tra truoc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param theTraTruocId the primary key of the the tra truoc
	* @return the the tra truoc that was removed
	* @throws com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException if a the tra truoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.thethanhtoan.model.TheTraTruoc remove(
		long theTraTruocId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException;

	public com.minimart.portlet.thethanhtoan.model.TheTraTruoc updateImpl(
		com.minimart.portlet.thethanhtoan.model.TheTraTruoc theTraTruoc)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the the tra truoc with the primary key or throws a {@link com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException} if it could not be found.
	*
	* @param theTraTruocId the primary key of the the tra truoc
	* @return the the tra truoc
	* @throws com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException if a the tra truoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.thethanhtoan.model.TheTraTruoc findByPrimaryKey(
		long theTraTruocId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.minimart.portlet.thethanhtoan.NoSuchTheTraTruocException;

	/**
	* Returns the the tra truoc with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param theTraTruocId the primary key of the the tra truoc
	* @return the the tra truoc, or <code>null</code> if a the tra truoc with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.minimart.portlet.thethanhtoan.model.TheTraTruoc fetchByPrimaryKey(
		long theTraTruocId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the the tra truocs.
	*
	* @return the the tra truocs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.minimart.portlet.thethanhtoan.model.TheTraTruoc> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.minimart.portlet.thethanhtoan.model.TheTraTruoc> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.minimart.portlet.thethanhtoan.model.TheTraTruoc> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the the tra truocs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of the tra truocs.
	*
	* @return the number of the tra truocs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}