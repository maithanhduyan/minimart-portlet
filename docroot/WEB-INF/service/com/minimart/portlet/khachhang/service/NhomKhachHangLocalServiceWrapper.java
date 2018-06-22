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

package com.minimart.portlet.khachhang.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NhomKhachHangLocalService}.
 *
 * @author Mai Thành Duy An
 * @see NhomKhachHangLocalService
 * @generated
 */
public class NhomKhachHangLocalServiceWrapper
	implements NhomKhachHangLocalService,
		ServiceWrapper<NhomKhachHangLocalService> {
	public NhomKhachHangLocalServiceWrapper(
		NhomKhachHangLocalService nhomKhachHangLocalService) {
		_nhomKhachHangLocalService = nhomKhachHangLocalService;
	}

	/**
	* Adds the nhom khach hang to the database. Also notifies the appropriate model listeners.
	*
	* @param nhomKhachHang the nhom khach hang
	* @return the nhom khach hang that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.khachhang.model.NhomKhachHang addNhomKhachHang(
		com.minimart.portlet.khachhang.model.NhomKhachHang nhomKhachHang)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhomKhachHangLocalService.addNhomKhachHang(nhomKhachHang);
	}

	/**
	* Creates a new nhom khach hang with the primary key. Does not add the nhom khach hang to the database.
	*
	* @param nhomKhachHangId the primary key for the new nhom khach hang
	* @return the new nhom khach hang
	*/
	@Override
	public com.minimart.portlet.khachhang.model.NhomKhachHang createNhomKhachHang(
		long nhomKhachHangId) {
		return _nhomKhachHangLocalService.createNhomKhachHang(nhomKhachHangId);
	}

	/**
	* Deletes the nhom khach hang with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param nhomKhachHangId the primary key of the nhom khach hang
	* @return the nhom khach hang that was removed
	* @throws PortalException if a nhom khach hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.khachhang.model.NhomKhachHang deleteNhomKhachHang(
		long nhomKhachHangId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _nhomKhachHangLocalService.deleteNhomKhachHang(nhomKhachHangId);
	}

	/**
	* Deletes the nhom khach hang from the database. Also notifies the appropriate model listeners.
	*
	* @param nhomKhachHang the nhom khach hang
	* @return the nhom khach hang that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.khachhang.model.NhomKhachHang deleteNhomKhachHang(
		com.minimart.portlet.khachhang.model.NhomKhachHang nhomKhachHang)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhomKhachHangLocalService.deleteNhomKhachHang(nhomKhachHang);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _nhomKhachHangLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhomKhachHangLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.NhomKhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _nhomKhachHangLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.NhomKhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhomKhachHangLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhomKhachHangLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhomKhachHangLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.minimart.portlet.khachhang.model.NhomKhachHang fetchNhomKhachHang(
		long nhomKhachHangId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhomKhachHangLocalService.fetchNhomKhachHang(nhomKhachHangId);
	}

	/**
	* Returns the nhom khach hang with the primary key.
	*
	* @param nhomKhachHangId the primary key of the nhom khach hang
	* @return the nhom khach hang
	* @throws PortalException if a nhom khach hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.khachhang.model.NhomKhachHang getNhomKhachHang(
		long nhomKhachHangId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _nhomKhachHangLocalService.getNhomKhachHang(nhomKhachHangId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _nhomKhachHangLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the nhom khach hangs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.NhomKhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nhom khach hangs
	* @param end the upper bound of the range of nhom khach hangs (not inclusive)
	* @return the range of nhom khach hangs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.minimart.portlet.khachhang.model.NhomKhachHang> getNhomKhachHangs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhomKhachHangLocalService.getNhomKhachHangs(start, end);
	}

	/**
	* Returns the number of nhom khach hangs.
	*
	* @return the number of nhom khach hangs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getNhomKhachHangsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhomKhachHangLocalService.getNhomKhachHangsCount();
	}

	/**
	* Updates the nhom khach hang in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param nhomKhachHang the nhom khach hang
	* @return the nhom khach hang that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.khachhang.model.NhomKhachHang updateNhomKhachHang(
		com.minimart.portlet.khachhang.model.NhomKhachHang nhomKhachHang)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhomKhachHangLocalService.updateNhomKhachHang(nhomKhachHang);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _nhomKhachHangLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_nhomKhachHangLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _nhomKhachHangLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public NhomKhachHangLocalService getWrappedNhomKhachHangLocalService() {
		return _nhomKhachHangLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedNhomKhachHangLocalService(
		NhomKhachHangLocalService nhomKhachHangLocalService) {
		_nhomKhachHangLocalService = nhomKhachHangLocalService;
	}

	@Override
	public NhomKhachHangLocalService getWrappedService() {
		return _nhomKhachHangLocalService;
	}

	@Override
	public void setWrappedService(
		NhomKhachHangLocalService nhomKhachHangLocalService) {
		_nhomKhachHangLocalService = nhomKhachHangLocalService;
	}

	private NhomKhachHangLocalService _nhomKhachHangLocalService;
}