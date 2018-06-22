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

package com.minimart.portlet.khuyenmai.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DotKhuyenMaiLocalService}.
 *
 * @author Mai Thành Duy An
 * @see DotKhuyenMaiLocalService
 * @generated
 */
public class DotKhuyenMaiLocalServiceWrapper implements DotKhuyenMaiLocalService,
	ServiceWrapper<DotKhuyenMaiLocalService> {
	public DotKhuyenMaiLocalServiceWrapper(
		DotKhuyenMaiLocalService dotKhuyenMaiLocalService) {
		_dotKhuyenMaiLocalService = dotKhuyenMaiLocalService;
	}

	/**
	* Adds the dot khuyen mai to the database. Also notifies the appropriate model listeners.
	*
	* @param dotKhuyenMai the dot khuyen mai
	* @return the dot khuyen mai that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMai addDotKhuyenMai(
		com.minimart.portlet.khuyenmai.model.DotKhuyenMai dotKhuyenMai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dotKhuyenMaiLocalService.addDotKhuyenMai(dotKhuyenMai);
	}

	/**
	* Creates a new dot khuyen mai with the primary key. Does not add the dot khuyen mai to the database.
	*
	* @param dotKhuyenMaiId the primary key for the new dot khuyen mai
	* @return the new dot khuyen mai
	*/
	@Override
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMai createDotKhuyenMai(
		long dotKhuyenMaiId) {
		return _dotKhuyenMaiLocalService.createDotKhuyenMai(dotKhuyenMaiId);
	}

	/**
	* Deletes the dot khuyen mai with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dotKhuyenMaiId the primary key of the dot khuyen mai
	* @return the dot khuyen mai that was removed
	* @throws PortalException if a dot khuyen mai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMai deleteDotKhuyenMai(
		long dotKhuyenMaiId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dotKhuyenMaiLocalService.deleteDotKhuyenMai(dotKhuyenMaiId);
	}

	/**
	* Deletes the dot khuyen mai from the database. Also notifies the appropriate model listeners.
	*
	* @param dotKhuyenMai the dot khuyen mai
	* @return the dot khuyen mai that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMai deleteDotKhuyenMai(
		com.minimart.portlet.khuyenmai.model.DotKhuyenMai dotKhuyenMai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dotKhuyenMaiLocalService.deleteDotKhuyenMai(dotKhuyenMai);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dotKhuyenMaiLocalService.dynamicQuery();
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
		return _dotKhuyenMaiLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dotKhuyenMaiLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _dotKhuyenMaiLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _dotKhuyenMaiLocalService.dynamicQueryCount(dynamicQuery);
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
		return _dotKhuyenMaiLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMai fetchDotKhuyenMai(
		long dotKhuyenMaiId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dotKhuyenMaiLocalService.fetchDotKhuyenMai(dotKhuyenMaiId);
	}

	/**
	* Returns the dot khuyen mai with the primary key.
	*
	* @param dotKhuyenMaiId the primary key of the dot khuyen mai
	* @return the dot khuyen mai
	* @throws PortalException if a dot khuyen mai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMai getDotKhuyenMai(
		long dotKhuyenMaiId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dotKhuyenMaiLocalService.getDotKhuyenMai(dotKhuyenMaiId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dotKhuyenMaiLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dot khuyen mais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dot khuyen mais
	* @param end the upper bound of the range of dot khuyen mais (not inclusive)
	* @return the range of dot khuyen mais
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.minimart.portlet.khuyenmai.model.DotKhuyenMai> getDotKhuyenMais(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dotKhuyenMaiLocalService.getDotKhuyenMais(start, end);
	}

	/**
	* Returns the number of dot khuyen mais.
	*
	* @return the number of dot khuyen mais
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDotKhuyenMaisCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dotKhuyenMaiLocalService.getDotKhuyenMaisCount();
	}

	/**
	* Updates the dot khuyen mai in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dotKhuyenMai the dot khuyen mai
	* @return the dot khuyen mai that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.khuyenmai.model.DotKhuyenMai updateDotKhuyenMai(
		com.minimart.portlet.khuyenmai.model.DotKhuyenMai dotKhuyenMai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dotKhuyenMaiLocalService.updateDotKhuyenMai(dotKhuyenMai);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _dotKhuyenMaiLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_dotKhuyenMaiLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _dotKhuyenMaiLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DotKhuyenMaiLocalService getWrappedDotKhuyenMaiLocalService() {
		return _dotKhuyenMaiLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDotKhuyenMaiLocalService(
		DotKhuyenMaiLocalService dotKhuyenMaiLocalService) {
		_dotKhuyenMaiLocalService = dotKhuyenMaiLocalService;
	}

	@Override
	public DotKhuyenMaiLocalService getWrappedService() {
		return _dotKhuyenMaiLocalService;
	}

	@Override
	public void setWrappedService(
		DotKhuyenMaiLocalService dotKhuyenMaiLocalService) {
		_dotKhuyenMaiLocalService = dotKhuyenMaiLocalService;
	}

	private DotKhuyenMaiLocalService _dotKhuyenMaiLocalService;
}