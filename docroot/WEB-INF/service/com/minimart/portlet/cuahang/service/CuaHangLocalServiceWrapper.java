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

package com.minimart.portlet.cuahang.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CuaHangLocalService}.
 *
 * @author Mai Thành Duy An
 * @see CuaHangLocalService
 * @generated
 */
public class CuaHangLocalServiceWrapper implements CuaHangLocalService,
	ServiceWrapper<CuaHangLocalService> {
	public CuaHangLocalServiceWrapper(CuaHangLocalService cuaHangLocalService) {
		_cuaHangLocalService = cuaHangLocalService;
	}

	/**
	* Adds the cua hang to the database. Also notifies the appropriate model listeners.
	*
	* @param cuaHang the cua hang
	* @return the cua hang that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.cuahang.model.CuaHang addCuaHang(
		com.minimart.portlet.cuahang.model.CuaHang cuaHang)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cuaHangLocalService.addCuaHang(cuaHang);
	}

	/**
	* Creates a new cua hang with the primary key. Does not add the cua hang to the database.
	*
	* @param cuaHangId the primary key for the new cua hang
	* @return the new cua hang
	*/
	@Override
	public com.minimart.portlet.cuahang.model.CuaHang createCuaHang(
		long cuaHangId) {
		return _cuaHangLocalService.createCuaHang(cuaHangId);
	}

	/**
	* Deletes the cua hang with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cuaHangId the primary key of the cua hang
	* @return the cua hang that was removed
	* @throws PortalException if a cua hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.cuahang.model.CuaHang deleteCuaHang(
		long cuaHangId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cuaHangLocalService.deleteCuaHang(cuaHangId);
	}

	/**
	* Deletes the cua hang from the database. Also notifies the appropriate model listeners.
	*
	* @param cuaHang the cua hang
	* @return the cua hang that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.cuahang.model.CuaHang deleteCuaHang(
		com.minimart.portlet.cuahang.model.CuaHang cuaHang)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cuaHangLocalService.deleteCuaHang(cuaHang);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cuaHangLocalService.dynamicQuery();
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
		return _cuaHangLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.CuaHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cuaHangLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.CuaHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _cuaHangLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _cuaHangLocalService.dynamicQueryCount(dynamicQuery);
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
		return _cuaHangLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.minimart.portlet.cuahang.model.CuaHang fetchCuaHang(
		long cuaHangId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cuaHangLocalService.fetchCuaHang(cuaHangId);
	}

	/**
	* Returns the cua hang with the matching UUID and company.
	*
	* @param uuid the cua hang's UUID
	* @param companyId the primary key of the company
	* @return the matching cua hang, or <code>null</code> if a matching cua hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.cuahang.model.CuaHang fetchCuaHangByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cuaHangLocalService.fetchCuaHangByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the cua hang with the primary key.
	*
	* @param cuaHangId the primary key of the cua hang
	* @return the cua hang
	* @throws PortalException if a cua hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.cuahang.model.CuaHang getCuaHang(long cuaHangId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cuaHangLocalService.getCuaHang(cuaHangId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cuaHangLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the cua hang with the matching UUID and company.
	*
	* @param uuid the cua hang's UUID
	* @param companyId the primary key of the company
	* @return the matching cua hang
	* @throws PortalException if a matching cua hang could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.cuahang.model.CuaHang getCuaHangByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _cuaHangLocalService.getCuaHangByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of all the cua hangs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.CuaHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cua hangs
	* @param end the upper bound of the range of cua hangs (not inclusive)
	* @return the range of cua hangs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.minimart.portlet.cuahang.model.CuaHang> getCuaHangs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cuaHangLocalService.getCuaHangs(start, end);
	}

	/**
	* Returns the number of cua hangs.
	*
	* @return the number of cua hangs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCuaHangsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cuaHangLocalService.getCuaHangsCount();
	}

	/**
	* Updates the cua hang in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param cuaHang the cua hang
	* @return the cua hang that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.cuahang.model.CuaHang updateCuaHang(
		com.minimart.portlet.cuahang.model.CuaHang cuaHang)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _cuaHangLocalService.updateCuaHang(cuaHang);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _cuaHangLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_cuaHangLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _cuaHangLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CuaHangLocalService getWrappedCuaHangLocalService() {
		return _cuaHangLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCuaHangLocalService(
		CuaHangLocalService cuaHangLocalService) {
		_cuaHangLocalService = cuaHangLocalService;
	}

	@Override
	public CuaHangLocalService getWrappedService() {
		return _cuaHangLocalService;
	}

	@Override
	public void setWrappedService(CuaHangLocalService cuaHangLocalService) {
		_cuaHangLocalService = cuaHangLocalService;
	}

	private CuaHangLocalService _cuaHangLocalService;
}