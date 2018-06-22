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
 * Provides a wrapper for {@link PhuongXaLocalService}.
 *
 * @author Mai Thành Duy An
 * @see PhuongXaLocalService
 * @generated
 */
public class PhuongXaLocalServiceWrapper implements PhuongXaLocalService,
	ServiceWrapper<PhuongXaLocalService> {
	public PhuongXaLocalServiceWrapper(
		PhuongXaLocalService phuongXaLocalService) {
		_phuongXaLocalService = phuongXaLocalService;
	}

	/**
	* Adds the phuong xa to the database. Also notifies the appropriate model listeners.
	*
	* @param phuongXa the phuong xa
	* @return the phuong xa that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.danhmucchung.model.PhuongXa addPhuongXa(
		com.minimart.portlet.danhmucchung.model.PhuongXa phuongXa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phuongXaLocalService.addPhuongXa(phuongXa);
	}

	/**
	* Creates a new phuong xa with the primary key. Does not add the phuong xa to the database.
	*
	* @param phuongXaId the primary key for the new phuong xa
	* @return the new phuong xa
	*/
	@Override
	public com.minimart.portlet.danhmucchung.model.PhuongXa createPhuongXa(
		long phuongXaId) {
		return _phuongXaLocalService.createPhuongXa(phuongXaId);
	}

	/**
	* Deletes the phuong xa with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param phuongXaId the primary key of the phuong xa
	* @return the phuong xa that was removed
	* @throws PortalException if a phuong xa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.danhmucchung.model.PhuongXa deletePhuongXa(
		long phuongXaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _phuongXaLocalService.deletePhuongXa(phuongXaId);
	}

	/**
	* Deletes the phuong xa from the database. Also notifies the appropriate model listeners.
	*
	* @param phuongXa the phuong xa
	* @return the phuong xa that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.danhmucchung.model.PhuongXa deletePhuongXa(
		com.minimart.portlet.danhmucchung.model.PhuongXa phuongXa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phuongXaLocalService.deletePhuongXa(phuongXa);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _phuongXaLocalService.dynamicQuery();
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
		return _phuongXaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.PhuongXaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _phuongXaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.PhuongXaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _phuongXaLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _phuongXaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _phuongXaLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.minimart.portlet.danhmucchung.model.PhuongXa fetchPhuongXa(
		long phuongXaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phuongXaLocalService.fetchPhuongXa(phuongXaId);
	}

	/**
	* Returns the phuong xa with the primary key.
	*
	* @param phuongXaId the primary key of the phuong xa
	* @return the phuong xa
	* @throws PortalException if a phuong xa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.danhmucchung.model.PhuongXa getPhuongXa(
		long phuongXaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _phuongXaLocalService.getPhuongXa(phuongXaId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _phuongXaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the phuong xas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.PhuongXaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of phuong xas
	* @param end the upper bound of the range of phuong xas (not inclusive)
	* @return the range of phuong xas
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.minimart.portlet.danhmucchung.model.PhuongXa> getPhuongXas(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phuongXaLocalService.getPhuongXas(start, end);
	}

	/**
	* Returns the number of phuong xas.
	*
	* @return the number of phuong xas
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPhuongXasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phuongXaLocalService.getPhuongXasCount();
	}

	/**
	* Updates the phuong xa in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param phuongXa the phuong xa
	* @return the phuong xa that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.danhmucchung.model.PhuongXa updatePhuongXa(
		com.minimart.portlet.danhmucchung.model.PhuongXa phuongXa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phuongXaLocalService.updatePhuongXa(phuongXa);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _phuongXaLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_phuongXaLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _phuongXaLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PhuongXaLocalService getWrappedPhuongXaLocalService() {
		return _phuongXaLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPhuongXaLocalService(
		PhuongXaLocalService phuongXaLocalService) {
		_phuongXaLocalService = phuongXaLocalService;
	}

	@Override
	public PhuongXaLocalService getWrappedService() {
		return _phuongXaLocalService;
	}

	@Override
	public void setWrappedService(PhuongXaLocalService phuongXaLocalService) {
		_phuongXaLocalService = phuongXaLocalService;
	}

	private PhuongXaLocalService _phuongXaLocalService;
}