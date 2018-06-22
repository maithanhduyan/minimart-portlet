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
 * Provides a wrapper for {@link DuongLocalService}.
 *
 * @author Mai Thành Duy An
 * @see DuongLocalService
 * @generated
 */
public class DuongLocalServiceWrapper implements DuongLocalService,
	ServiceWrapper<DuongLocalService> {
	public DuongLocalServiceWrapper(DuongLocalService duongLocalService) {
		_duongLocalService = duongLocalService;
	}

	/**
	* Adds the duong to the database. Also notifies the appropriate model listeners.
	*
	* @param duong the duong
	* @return the duong that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.danhmucchung.model.Duong addDuong(
		com.minimart.portlet.danhmucchung.model.Duong duong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _duongLocalService.addDuong(duong);
	}

	/**
	* Creates a new duong with the primary key. Does not add the duong to the database.
	*
	* @param duongId the primary key for the new duong
	* @return the new duong
	*/
	@Override
	public com.minimart.portlet.danhmucchung.model.Duong createDuong(
		long duongId) {
		return _duongLocalService.createDuong(duongId);
	}

	/**
	* Deletes the duong with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param duongId the primary key of the duong
	* @return the duong that was removed
	* @throws PortalException if a duong with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.danhmucchung.model.Duong deleteDuong(
		long duongId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _duongLocalService.deleteDuong(duongId);
	}

	/**
	* Deletes the duong from the database. Also notifies the appropriate model listeners.
	*
	* @param duong the duong
	* @return the duong that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.danhmucchung.model.Duong deleteDuong(
		com.minimart.portlet.danhmucchung.model.Duong duong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _duongLocalService.deleteDuong(duong);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _duongLocalService.dynamicQuery();
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
		return _duongLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.DuongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _duongLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.DuongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _duongLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _duongLocalService.dynamicQueryCount(dynamicQuery);
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
		return _duongLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.minimart.portlet.danhmucchung.model.Duong fetchDuong(
		long duongId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _duongLocalService.fetchDuong(duongId);
	}

	/**
	* Returns the duong with the primary key.
	*
	* @param duongId the primary key of the duong
	* @return the duong
	* @throws PortalException if a duong with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.danhmucchung.model.Duong getDuong(long duongId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _duongLocalService.getDuong(duongId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _duongLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the duongs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.danhmucchung.model.impl.DuongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of duongs
	* @param end the upper bound of the range of duongs (not inclusive)
	* @return the range of duongs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.minimart.portlet.danhmucchung.model.Duong> getDuongs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _duongLocalService.getDuongs(start, end);
	}

	/**
	* Returns the number of duongs.
	*
	* @return the number of duongs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDuongsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _duongLocalService.getDuongsCount();
	}

	/**
	* Updates the duong in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param duong the duong
	* @return the duong that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.danhmucchung.model.Duong updateDuong(
		com.minimart.portlet.danhmucchung.model.Duong duong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _duongLocalService.updateDuong(duong);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _duongLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_duongLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _duongLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DuongLocalService getWrappedDuongLocalService() {
		return _duongLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDuongLocalService(DuongLocalService duongLocalService) {
		_duongLocalService = duongLocalService;
	}

	@Override
	public DuongLocalService getWrappedService() {
		return _duongLocalService;
	}

	@Override
	public void setWrappedService(DuongLocalService duongLocalService) {
		_duongLocalService = duongLocalService;
	}

	private DuongLocalService _duongLocalService;
}