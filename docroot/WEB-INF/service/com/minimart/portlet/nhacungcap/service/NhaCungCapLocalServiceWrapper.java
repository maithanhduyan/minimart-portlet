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

package com.minimart.portlet.nhacungcap.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NhaCungCapLocalService}.
 *
 * @author Mai Thành Duy An
 * @see NhaCungCapLocalService
 * @generated
 */
public class NhaCungCapLocalServiceWrapper implements NhaCungCapLocalService,
	ServiceWrapper<NhaCungCapLocalService> {
	public NhaCungCapLocalServiceWrapper(
		NhaCungCapLocalService nhaCungCapLocalService) {
		_nhaCungCapLocalService = nhaCungCapLocalService;
	}

	/**
	* Adds the nha cung cap to the database. Also notifies the appropriate model listeners.
	*
	* @param nhaCungCap the nha cung cap
	* @return the nha cung cap that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.nhacungcap.model.NhaCungCap addNhaCungCap(
		com.minimart.portlet.nhacungcap.model.NhaCungCap nhaCungCap)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhaCungCapLocalService.addNhaCungCap(nhaCungCap);
	}

	/**
	* Creates a new nha cung cap with the primary key. Does not add the nha cung cap to the database.
	*
	* @param nhaCungCapId the primary key for the new nha cung cap
	* @return the new nha cung cap
	*/
	@Override
	public com.minimart.portlet.nhacungcap.model.NhaCungCap createNhaCungCap(
		long nhaCungCapId) {
		return _nhaCungCapLocalService.createNhaCungCap(nhaCungCapId);
	}

	/**
	* Deletes the nha cung cap with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param nhaCungCapId the primary key of the nha cung cap
	* @return the nha cung cap that was removed
	* @throws PortalException if a nha cung cap with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.nhacungcap.model.NhaCungCap deleteNhaCungCap(
		long nhaCungCapId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _nhaCungCapLocalService.deleteNhaCungCap(nhaCungCapId);
	}

	/**
	* Deletes the nha cung cap from the database. Also notifies the appropriate model listeners.
	*
	* @param nhaCungCap the nha cung cap
	* @return the nha cung cap that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.nhacungcap.model.NhaCungCap deleteNhaCungCap(
		com.minimart.portlet.nhacungcap.model.NhaCungCap nhaCungCap)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhaCungCapLocalService.deleteNhaCungCap(nhaCungCap);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _nhaCungCapLocalService.dynamicQuery();
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
		return _nhaCungCapLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _nhaCungCapLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _nhaCungCapLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _nhaCungCapLocalService.dynamicQueryCount(dynamicQuery);
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
		return _nhaCungCapLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.minimart.portlet.nhacungcap.model.NhaCungCap fetchNhaCungCap(
		long nhaCungCapId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhaCungCapLocalService.fetchNhaCungCap(nhaCungCapId);
	}

	/**
	* Returns the nha cung cap with the primary key.
	*
	* @param nhaCungCapId the primary key of the nha cung cap
	* @return the nha cung cap
	* @throws PortalException if a nha cung cap with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.nhacungcap.model.NhaCungCap getNhaCungCap(
		long nhaCungCapId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _nhaCungCapLocalService.getNhaCungCap(nhaCungCapId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _nhaCungCapLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the nha cung caps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nha cung caps
	* @param end the upper bound of the range of nha cung caps (not inclusive)
	* @return the range of nha cung caps
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.minimart.portlet.nhacungcap.model.NhaCungCap> getNhaCungCaps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhaCungCapLocalService.getNhaCungCaps(start, end);
	}

	/**
	* Returns the number of nha cung caps.
	*
	* @return the number of nha cung caps
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getNhaCungCapsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhaCungCapLocalService.getNhaCungCapsCount();
	}

	/**
	* Updates the nha cung cap in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param nhaCungCap the nha cung cap
	* @return the nha cung cap that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.nhacungcap.model.NhaCungCap updateNhaCungCap(
		com.minimart.portlet.nhacungcap.model.NhaCungCap nhaCungCap)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhaCungCapLocalService.updateNhaCungCap(nhaCungCap);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _nhaCungCapLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_nhaCungCapLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _nhaCungCapLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public NhaCungCapLocalService getWrappedNhaCungCapLocalService() {
		return _nhaCungCapLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedNhaCungCapLocalService(
		NhaCungCapLocalService nhaCungCapLocalService) {
		_nhaCungCapLocalService = nhaCungCapLocalService;
	}

	@Override
	public NhaCungCapLocalService getWrappedService() {
		return _nhaCungCapLocalService;
	}

	@Override
	public void setWrappedService(NhaCungCapLocalService nhaCungCapLocalService) {
		_nhaCungCapLocalService = nhaCungCapLocalService;
	}

	private NhaCungCapLocalService _nhaCungCapLocalService;
}