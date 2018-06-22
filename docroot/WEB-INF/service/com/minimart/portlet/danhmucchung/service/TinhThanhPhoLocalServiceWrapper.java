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
 * Provides a wrapper for {@link TinhThanhPhoLocalService}.
 *
 * @author Mai Thành Duy An
 * @see TinhThanhPhoLocalService
 * @generated
 */
public class TinhThanhPhoLocalServiceWrapper implements TinhThanhPhoLocalService,
	ServiceWrapper<TinhThanhPhoLocalService> {
	public TinhThanhPhoLocalServiceWrapper(
		TinhThanhPhoLocalService tinhThanhPhoLocalService) {
		_tinhThanhPhoLocalService = tinhThanhPhoLocalService;
	}

	/**
	* Adds the tinh thanh pho to the database. Also notifies the appropriate model listeners.
	*
	* @param tinhThanhPho the tinh thanh pho
	* @return the tinh thanh pho that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.danhmucchung.model.TinhThanhPho addTinhThanhPho(
		com.minimart.portlet.danhmucchung.model.TinhThanhPho tinhThanhPho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tinhThanhPhoLocalService.addTinhThanhPho(tinhThanhPho);
	}

	/**
	* Creates a new tinh thanh pho with the primary key. Does not add the tinh thanh pho to the database.
	*
	* @param tinhThanhPhoId the primary key for the new tinh thanh pho
	* @return the new tinh thanh pho
	*/
	@Override
	public com.minimart.portlet.danhmucchung.model.TinhThanhPho createTinhThanhPho(
		long tinhThanhPhoId) {
		return _tinhThanhPhoLocalService.createTinhThanhPho(tinhThanhPhoId);
	}

	/**
	* Deletes the tinh thanh pho with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tinhThanhPhoId the primary key of the tinh thanh pho
	* @return the tinh thanh pho that was removed
	* @throws PortalException if a tinh thanh pho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.danhmucchung.model.TinhThanhPho deleteTinhThanhPho(
		long tinhThanhPhoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tinhThanhPhoLocalService.deleteTinhThanhPho(tinhThanhPhoId);
	}

	/**
	* Deletes the tinh thanh pho from the database. Also notifies the appropriate model listeners.
	*
	* @param tinhThanhPho the tinh thanh pho
	* @return the tinh thanh pho that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.danhmucchung.model.TinhThanhPho deleteTinhThanhPho(
		com.minimart.portlet.danhmucchung.model.TinhThanhPho tinhThanhPho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tinhThanhPhoLocalService.deleteTinhThanhPho(tinhThanhPho);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tinhThanhPhoLocalService.dynamicQuery();
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
		return _tinhThanhPhoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.TinhThanhPhoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tinhThanhPhoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.TinhThanhPhoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tinhThanhPhoLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _tinhThanhPhoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tinhThanhPhoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.minimart.portlet.danhmucchung.model.TinhThanhPho fetchTinhThanhPho(
		long tinhThanhPhoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tinhThanhPhoLocalService.fetchTinhThanhPho(tinhThanhPhoId);
	}

	/**
	* Returns the tinh thanh pho with the primary key.
	*
	* @param tinhThanhPhoId the primary key of the tinh thanh pho
	* @return the tinh thanh pho
	* @throws PortalException if a tinh thanh pho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.danhmucchung.model.TinhThanhPho getTinhThanhPho(
		long tinhThanhPhoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tinhThanhPhoLocalService.getTinhThanhPho(tinhThanhPhoId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tinhThanhPhoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the tinh thanh phos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.TinhThanhPhoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tinh thanh phos
	* @param end the upper bound of the range of tinh thanh phos (not inclusive)
	* @return the range of tinh thanh phos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.minimart.portlet.danhmucchung.model.TinhThanhPho> getTinhThanhPhos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tinhThanhPhoLocalService.getTinhThanhPhos(start, end);
	}

	/**
	* Returns the number of tinh thanh phos.
	*
	* @return the number of tinh thanh phos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTinhThanhPhosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tinhThanhPhoLocalService.getTinhThanhPhosCount();
	}

	/**
	* Updates the tinh thanh pho in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tinhThanhPho the tinh thanh pho
	* @return the tinh thanh pho that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.danhmucchung.model.TinhThanhPho updateTinhThanhPho(
		com.minimart.portlet.danhmucchung.model.TinhThanhPho tinhThanhPho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tinhThanhPhoLocalService.updateTinhThanhPho(tinhThanhPho);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tinhThanhPhoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tinhThanhPhoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tinhThanhPhoLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TinhThanhPhoLocalService getWrappedTinhThanhPhoLocalService() {
		return _tinhThanhPhoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTinhThanhPhoLocalService(
		TinhThanhPhoLocalService tinhThanhPhoLocalService) {
		_tinhThanhPhoLocalService = tinhThanhPhoLocalService;
	}

	@Override
	public TinhThanhPhoLocalService getWrappedService() {
		return _tinhThanhPhoLocalService;
	}

	@Override
	public void setWrappedService(
		TinhThanhPhoLocalService tinhThanhPhoLocalService) {
		_tinhThanhPhoLocalService = tinhThanhPhoLocalService;
	}

	private TinhThanhPhoLocalService _tinhThanhPhoLocalService;
}