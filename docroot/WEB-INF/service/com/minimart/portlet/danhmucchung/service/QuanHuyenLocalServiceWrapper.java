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

package com.minimart.portlet.danhmucchung.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QuanHuyenLocalService}.
 *
 * @author Mai Thành Duy An
 * @see QuanHuyenLocalService
 * @generated
 */
public class QuanHuyenLocalServiceWrapper implements QuanHuyenLocalService,
	ServiceWrapper<QuanHuyenLocalService> {
	public QuanHuyenLocalServiceWrapper(
		QuanHuyenLocalService quanHuyenLocalService) {
		_quanHuyenLocalService = quanHuyenLocalService;
	}

	/**
	* Adds the quan huyen to the database. Also notifies the appropriate model listeners.
	*
	* @param quanHuyen the quan huyen
	* @return the quan huyen that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.danhmucchung.model.QuanHuyen addQuanHuyen(
		com.minimart.portlet.danhmucchung.model.QuanHuyen quanHuyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _quanHuyenLocalService.addQuanHuyen(quanHuyen);
	}

	/**
	* Creates a new quan huyen with the primary key. Does not add the quan huyen to the database.
	*
	* @param quanHuyenId the primary key for the new quan huyen
	* @return the new quan huyen
	*/
	@Override
	public com.minimart.portlet.danhmucchung.model.QuanHuyen createQuanHuyen(
		long quanHuyenId) {
		return _quanHuyenLocalService.createQuanHuyen(quanHuyenId);
	}

	/**
	* Deletes the quan huyen with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param quanHuyenId the primary key of the quan huyen
	* @return the quan huyen that was removed
	* @throws PortalException if a quan huyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.danhmucchung.model.QuanHuyen deleteQuanHuyen(
		long quanHuyenId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _quanHuyenLocalService.deleteQuanHuyen(quanHuyenId);
	}

	/**
	* Deletes the quan huyen from the database. Also notifies the appropriate model listeners.
	*
	* @param quanHuyen the quan huyen
	* @return the quan huyen that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.danhmucchung.model.QuanHuyen deleteQuanHuyen(
		com.minimart.portlet.danhmucchung.model.QuanHuyen quanHuyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _quanHuyenLocalService.deleteQuanHuyen(quanHuyen);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _quanHuyenLocalService.dynamicQuery();
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
		return _quanHuyenLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.QuanHuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _quanHuyenLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.QuanHuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _quanHuyenLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _quanHuyenLocalService.dynamicQueryCount(dynamicQuery);
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
		return _quanHuyenLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.minimart.portlet.danhmucchung.model.QuanHuyen fetchQuanHuyen(
		long quanHuyenId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _quanHuyenLocalService.fetchQuanHuyen(quanHuyenId);
	}

	/**
	* Returns the quan huyen with the primary key.
	*
	* @param quanHuyenId the primary key of the quan huyen
	* @return the quan huyen
	* @throws PortalException if a quan huyen with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.danhmucchung.model.QuanHuyen getQuanHuyen(
		long quanHuyenId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _quanHuyenLocalService.getQuanHuyen(quanHuyenId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _quanHuyenLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the quan huyens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.QuanHuyenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of quan huyens
	* @param end the upper bound of the range of quan huyens (not inclusive)
	* @return the range of quan huyens
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.minimart.portlet.danhmucchung.model.QuanHuyen> getQuanHuyens(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _quanHuyenLocalService.getQuanHuyens(start, end);
	}

	/**
	* Returns the number of quan huyens.
	*
	* @return the number of quan huyens
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getQuanHuyensCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _quanHuyenLocalService.getQuanHuyensCount();
	}

	/**
	* Updates the quan huyen in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param quanHuyen the quan huyen
	* @return the quan huyen that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.danhmucchung.model.QuanHuyen updateQuanHuyen(
		com.minimart.portlet.danhmucchung.model.QuanHuyen quanHuyen)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _quanHuyenLocalService.updateQuanHuyen(quanHuyen);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _quanHuyenLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_quanHuyenLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _quanHuyenLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public QuanHuyenLocalService getWrappedQuanHuyenLocalService() {
		return _quanHuyenLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedQuanHuyenLocalService(
		QuanHuyenLocalService quanHuyenLocalService) {
		_quanHuyenLocalService = quanHuyenLocalService;
	}

	@Override
	public QuanHuyenLocalService getWrappedService() {
		return _quanHuyenLocalService;
	}

	@Override
	public void setWrappedService(QuanHuyenLocalService quanHuyenLocalService) {
		_quanHuyenLocalService = quanHuyenLocalService;
	}

	private QuanHuyenLocalService _quanHuyenLocalService;
}