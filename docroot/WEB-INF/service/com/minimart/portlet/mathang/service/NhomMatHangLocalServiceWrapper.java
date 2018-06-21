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

package com.minimart.portlet.mathang.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NhomMatHangLocalService}.
 *
 * @author Mai Thành Duy An
 * @see NhomMatHangLocalService
 * @generated
 */
public class NhomMatHangLocalServiceWrapper implements NhomMatHangLocalService,
	ServiceWrapper<NhomMatHangLocalService> {
	public NhomMatHangLocalServiceWrapper(
		NhomMatHangLocalService nhomMatHangLocalService) {
		_nhomMatHangLocalService = nhomMatHangLocalService;
	}

	/**
	* Adds the nhom mat hang to the database. Also notifies the appropriate model listeners.
	*
	* @param nhomMatHang the nhom mat hang
	* @return the nhom mat hang that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.mathang.model.NhomMatHang addNhomMatHang(
		com.minimart.portlet.mathang.model.NhomMatHang nhomMatHang)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhomMatHangLocalService.addNhomMatHang(nhomMatHang);
	}

	/**
	* Creates a new nhom mat hang with the primary key. Does not add the nhom mat hang to the database.
	*
	* @param nhomMatHangId the primary key for the new nhom mat hang
	* @return the new nhom mat hang
	*/
	@Override
	public com.minimart.portlet.mathang.model.NhomMatHang createNhomMatHang(
		long nhomMatHangId) {
		return _nhomMatHangLocalService.createNhomMatHang(nhomMatHangId);
	}

	/**
	* Deletes the nhom mat hang with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param nhomMatHangId the primary key of the nhom mat hang
	* @return the nhom mat hang that was removed
	* @throws PortalException if a nhom mat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.mathang.model.NhomMatHang deleteNhomMatHang(
		long nhomMatHangId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _nhomMatHangLocalService.deleteNhomMatHang(nhomMatHangId);
	}

	/**
	* Deletes the nhom mat hang from the database. Also notifies the appropriate model listeners.
	*
	* @param nhomMatHang the nhom mat hang
	* @return the nhom mat hang that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.mathang.model.NhomMatHang deleteNhomMatHang(
		com.minimart.portlet.mathang.model.NhomMatHang nhomMatHang)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhomMatHangLocalService.deleteNhomMatHang(nhomMatHang);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _nhomMatHangLocalService.dynamicQuery();
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
		return _nhomMatHangLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.NhomMatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _nhomMatHangLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.NhomMatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _nhomMatHangLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _nhomMatHangLocalService.dynamicQueryCount(dynamicQuery);
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
		return _nhomMatHangLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.minimart.portlet.mathang.model.NhomMatHang fetchNhomMatHang(
		long nhomMatHangId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhomMatHangLocalService.fetchNhomMatHang(nhomMatHangId);
	}

	/**
	* Returns the nhom mat hang with the primary key.
	*
	* @param nhomMatHangId the primary key of the nhom mat hang
	* @return the nhom mat hang
	* @throws PortalException if a nhom mat hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.mathang.model.NhomMatHang getNhomMatHang(
		long nhomMatHangId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _nhomMatHangLocalService.getNhomMatHang(nhomMatHangId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _nhomMatHangLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the nhom mat hangs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.NhomMatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nhom mat hangs
	* @param end the upper bound of the range of nhom mat hangs (not inclusive)
	* @return the range of nhom mat hangs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.minimart.portlet.mathang.model.NhomMatHang> getNhomMatHangs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhomMatHangLocalService.getNhomMatHangs(start, end);
	}

	/**
	* Returns the number of nhom mat hangs.
	*
	* @return the number of nhom mat hangs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getNhomMatHangsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhomMatHangLocalService.getNhomMatHangsCount();
	}

	/**
	* Updates the nhom mat hang in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param nhomMatHang the nhom mat hang
	* @return the nhom mat hang that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.mathang.model.NhomMatHang updateNhomMatHang(
		com.minimart.portlet.mathang.model.NhomMatHang nhomMatHang)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhomMatHangLocalService.updateNhomMatHang(nhomMatHang);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _nhomMatHangLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_nhomMatHangLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _nhomMatHangLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public NhomMatHangLocalService getWrappedNhomMatHangLocalService() {
		return _nhomMatHangLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedNhomMatHangLocalService(
		NhomMatHangLocalService nhomMatHangLocalService) {
		_nhomMatHangLocalService = nhomMatHangLocalService;
	}

	@Override
	public NhomMatHangLocalService getWrappedService() {
		return _nhomMatHangLocalService;
	}

	@Override
	public void setWrappedService(
		NhomMatHangLocalService nhomMatHangLocalService) {
		_nhomMatHangLocalService = nhomMatHangLocalService;
	}

	private NhomMatHangLocalService _nhomMatHangLocalService;
}