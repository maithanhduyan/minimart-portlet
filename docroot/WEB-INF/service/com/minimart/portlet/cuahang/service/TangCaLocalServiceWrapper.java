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
 * Provides a wrapper for {@link TangCaLocalService}.
 *
 * @author Mai Thành Duy An
 * @see TangCaLocalService
 * @generated
 */
public class TangCaLocalServiceWrapper implements TangCaLocalService,
	ServiceWrapper<TangCaLocalService> {
	public TangCaLocalServiceWrapper(TangCaLocalService tangCaLocalService) {
		_tangCaLocalService = tangCaLocalService;
	}

	/**
	* Adds the tang ca to the database. Also notifies the appropriate model listeners.
	*
	* @param tangCa the tang ca
	* @return the tang ca that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.cuahang.model.TangCa addTangCa(
		com.minimart.portlet.cuahang.model.TangCa tangCa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tangCaLocalService.addTangCa(tangCa);
	}

	/**
	* Creates a new tang ca with the primary key. Does not add the tang ca to the database.
	*
	* @param tangCaId the primary key for the new tang ca
	* @return the new tang ca
	*/
	@Override
	public com.minimart.portlet.cuahang.model.TangCa createTangCa(long tangCaId) {
		return _tangCaLocalService.createTangCa(tangCaId);
	}

	/**
	* Deletes the tang ca with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tangCaId the primary key of the tang ca
	* @return the tang ca that was removed
	* @throws PortalException if a tang ca with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.cuahang.model.TangCa deleteTangCa(long tangCaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tangCaLocalService.deleteTangCa(tangCaId);
	}

	/**
	* Deletes the tang ca from the database. Also notifies the appropriate model listeners.
	*
	* @param tangCa the tang ca
	* @return the tang ca that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.cuahang.model.TangCa deleteTangCa(
		com.minimart.portlet.cuahang.model.TangCa tangCa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tangCaLocalService.deleteTangCa(tangCa);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tangCaLocalService.dynamicQuery();
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
		return _tangCaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.TangCaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tangCaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.TangCaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tangCaLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _tangCaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tangCaLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.minimart.portlet.cuahang.model.TangCa fetchTangCa(long tangCaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tangCaLocalService.fetchTangCa(tangCaId);
	}

	/**
	* Returns the tang ca with the primary key.
	*
	* @param tangCaId the primary key of the tang ca
	* @return the tang ca
	* @throws PortalException if a tang ca with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.cuahang.model.TangCa getTangCa(long tangCaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tangCaLocalService.getTangCa(tangCaId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tangCaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the tang cas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.TangCaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tang cas
	* @param end the upper bound of the range of tang cas (not inclusive)
	* @return the range of tang cas
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.minimart.portlet.cuahang.model.TangCa> getTangCas(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tangCaLocalService.getTangCas(start, end);
	}

	/**
	* Returns the number of tang cas.
	*
	* @return the number of tang cas
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTangCasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tangCaLocalService.getTangCasCount();
	}

	/**
	* Updates the tang ca in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tangCa the tang ca
	* @return the tang ca that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.cuahang.model.TangCa updateTangCa(
		com.minimart.portlet.cuahang.model.TangCa tangCa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tangCaLocalService.updateTangCa(tangCa);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tangCaLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tangCaLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tangCaLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TangCaLocalService getWrappedTangCaLocalService() {
		return _tangCaLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTangCaLocalService(
		TangCaLocalService tangCaLocalService) {
		_tangCaLocalService = tangCaLocalService;
	}

	@Override
	public TangCaLocalService getWrappedService() {
		return _tangCaLocalService;
	}

	@Override
	public void setWrappedService(TangCaLocalService tangCaLocalService) {
		_tangCaLocalService = tangCaLocalService;
	}

	private TangCaLocalService _tangCaLocalService;
}