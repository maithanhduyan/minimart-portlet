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

package com.minimart.portlet.banhang.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DonHangLocalService}.
 *
 * @author Mai Thành Duy An
 * @see DonHangLocalService
 * @generated
 */
public class DonHangLocalServiceWrapper implements DonHangLocalService,
	ServiceWrapper<DonHangLocalService> {
	public DonHangLocalServiceWrapper(DonHangLocalService donHangLocalService) {
		_donHangLocalService = donHangLocalService;
	}

	/**
	* Adds the don hang to the database. Also notifies the appropriate model listeners.
	*
	* @param donHang the don hang
	* @return the don hang that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.banhang.model.DonHang addDonHang(
		com.minimart.portlet.banhang.model.DonHang donHang)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _donHangLocalService.addDonHang(donHang);
	}

	/**
	* Creates a new don hang with the primary key. Does not add the don hang to the database.
	*
	* @param donHangId the primary key for the new don hang
	* @return the new don hang
	*/
	@Override
	public com.minimart.portlet.banhang.model.DonHang createDonHang(
		long donHangId) {
		return _donHangLocalService.createDonHang(donHangId);
	}

	/**
	* Deletes the don hang with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param donHangId the primary key of the don hang
	* @return the don hang that was removed
	* @throws PortalException if a don hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.banhang.model.DonHang deleteDonHang(
		long donHangId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _donHangLocalService.deleteDonHang(donHangId);
	}

	/**
	* Deletes the don hang from the database. Also notifies the appropriate model listeners.
	*
	* @param donHang the don hang
	* @return the don hang that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.banhang.model.DonHang deleteDonHang(
		com.minimart.portlet.banhang.model.DonHang donHang)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _donHangLocalService.deleteDonHang(donHang);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _donHangLocalService.dynamicQuery();
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
		return _donHangLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.DonHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _donHangLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.DonHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _donHangLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _donHangLocalService.dynamicQueryCount(dynamicQuery);
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
		return _donHangLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.minimart.portlet.banhang.model.DonHang fetchDonHang(
		long donHangId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _donHangLocalService.fetchDonHang(donHangId);
	}

	/**
	* Returns the don hang with the primary key.
	*
	* @param donHangId the primary key of the don hang
	* @return the don hang
	* @throws PortalException if a don hang with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.banhang.model.DonHang getDonHang(long donHangId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _donHangLocalService.getDonHang(donHangId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _donHangLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the don hangs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.DonHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of don hangs
	* @param end the upper bound of the range of don hangs (not inclusive)
	* @return the range of don hangs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.minimart.portlet.banhang.model.DonHang> getDonHangs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _donHangLocalService.getDonHangs(start, end);
	}

	/**
	* Returns the number of don hangs.
	*
	* @return the number of don hangs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getDonHangsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _donHangLocalService.getDonHangsCount();
	}

	/**
	* Updates the don hang in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param donHang the don hang
	* @return the don hang that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.banhang.model.DonHang updateDonHang(
		com.minimart.portlet.banhang.model.DonHang donHang)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _donHangLocalService.updateDonHang(donHang);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _donHangLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_donHangLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _donHangLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DonHangLocalService getWrappedDonHangLocalService() {
		return _donHangLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDonHangLocalService(
		DonHangLocalService donHangLocalService) {
		_donHangLocalService = donHangLocalService;
	}

	@Override
	public DonHangLocalService getWrappedService() {
		return _donHangLocalService;
	}

	@Override
	public void setWrappedService(DonHangLocalService donHangLocalService) {
		_donHangLocalService = donHangLocalService;
	}

	private DonHangLocalService _donHangLocalService;
}