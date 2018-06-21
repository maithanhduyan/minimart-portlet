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
 * Provides a wrapper for {@link DonViTinhLocalService}.
 *
 * @author Mai Thành Duy An
 * @see DonViTinhLocalService
 * @generated
 */
public class DonViTinhLocalServiceWrapper implements DonViTinhLocalService,
	ServiceWrapper<DonViTinhLocalService> {
	public DonViTinhLocalServiceWrapper(
		DonViTinhLocalService donViTinhLocalService) {
		_donViTinhLocalService = donViTinhLocalService;
	}

	/**
	* Adds the don vi tinh to the database. Also notifies the appropriate model listeners.
	*
	* @param donViTinh the don vi tinh
	* @return the don vi tinh that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.mathang.model.DonViTinh addDonViTinh(
		com.minimart.portlet.mathang.model.DonViTinh donViTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _donViTinhLocalService.addDonViTinh(donViTinh);
	}

	/**
	* Creates a new don vi tinh with the primary key. Does not add the don vi tinh to the database.
	*
	* @param donViTinhId the primary key for the new don vi tinh
	* @return the new don vi tinh
	*/
	@Override
	public com.minimart.portlet.mathang.model.DonViTinh createDonViTinh(
		long donViTinhId) {
		return _donViTinhLocalService.createDonViTinh(donViTinhId);
	}

	/**
	* Deletes the don vi tinh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param donViTinhId the primary key of the don vi tinh
	* @return the don vi tinh that was removed
	* @throws PortalException if a don vi tinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.mathang.model.DonViTinh deleteDonViTinh(
		long donViTinhId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _donViTinhLocalService.deleteDonViTinh(donViTinhId);
	}

	/**
	* Deletes the don vi tinh from the database. Also notifies the appropriate model listeners.
	*
	* @param donViTinh the don vi tinh
	* @return the don vi tinh that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.mathang.model.DonViTinh deleteDonViTinh(
		com.minimart.portlet.mathang.model.DonViTinh donViTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _donViTinhLocalService.deleteDonViTinh(donViTinh);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _donViTinhLocalService.dynamicQuery();
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
		return _donViTinhLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.DonViTinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _donViTinhLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.DonViTinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _donViTinhLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _donViTinhLocalService.dynamicQueryCount(dynamicQuery);
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
		return _donViTinhLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.minimart.portlet.mathang.model.DonViTinh fetchDonViTinh(
		long donViTinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _donViTinhLocalService.fetchDonViTinh(donViTinhId);
	}

	/**
	* Returns the don vi tinh with the primary key.
	*
	* @param donViTinhId the primary key of the don vi tinh
	* @return the don vi tinh
	* @throws PortalException if a don vi tinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.mathang.model.DonViTinh getDonViTinh(
		long donViTinhId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _donViTinhLocalService.getDonViTinh(donViTinhId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _donViTinhLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the don vi tinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.DonViTinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of don vi tinhs
	* @param end the upper bound of the range of don vi tinhs (not inclusive)
	* @return the range of don vi tinhs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.minimart.portlet.mathang.model.DonViTinh> getDonViTinhs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _donViTinhLocalService.getDonViTinhs(start, end);
	}

	/**
	* Returns the number of don vi tinhs.
	*
	* @return the number of don vi tinhs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDonViTinhsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _donViTinhLocalService.getDonViTinhsCount();
	}

	/**
	* Updates the don vi tinh in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param donViTinh the don vi tinh
	* @return the don vi tinh that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.mathang.model.DonViTinh updateDonViTinh(
		com.minimart.portlet.mathang.model.DonViTinh donViTinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _donViTinhLocalService.updateDonViTinh(donViTinh);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _donViTinhLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_donViTinhLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _donViTinhLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DonViTinhLocalService getWrappedDonViTinhLocalService() {
		return _donViTinhLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDonViTinhLocalService(
		DonViTinhLocalService donViTinhLocalService) {
		_donViTinhLocalService = donViTinhLocalService;
	}

	@Override
	public DonViTinhLocalService getWrappedService() {
		return _donViTinhLocalService;
	}

	@Override
	public void setWrappedService(DonViTinhLocalService donViTinhLocalService) {
		_donViTinhLocalService = donViTinhLocalService;
	}

	private DonViTinhLocalService _donViTinhLocalService;
}