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

package com.minimart.portlet.nhanvien.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NhanVienLocalService}.
 *
 * @author Mai Thành Duy An
 * @see NhanVienLocalService
 * @generated
 */
public class NhanVienLocalServiceWrapper implements NhanVienLocalService,
	ServiceWrapper<NhanVienLocalService> {
	public NhanVienLocalServiceWrapper(
		NhanVienLocalService nhanVienLocalService) {
		_nhanVienLocalService = nhanVienLocalService;
	}

	/**
	* Adds the nhan vien to the database. Also notifies the appropriate model listeners.
	*
	* @param nhanVien the nhan vien
	* @return the nhan vien that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.nhanvien.model.NhanVien addNhanVien(
		com.minimart.portlet.nhanvien.model.NhanVien nhanVien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhanVienLocalService.addNhanVien(nhanVien);
	}

	/**
	* Creates a new nhan vien with the primary key. Does not add the nhan vien to the database.
	*
	* @param nhanVienId the primary key for the new nhan vien
	* @return the new nhan vien
	*/
	@Override
	public com.minimart.portlet.nhanvien.model.NhanVien createNhanVien(
		long nhanVienId) {
		return _nhanVienLocalService.createNhanVien(nhanVienId);
	}

	/**
	* Deletes the nhan vien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param nhanVienId the primary key of the nhan vien
	* @return the nhan vien that was removed
	* @throws PortalException if a nhan vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.nhanvien.model.NhanVien deleteNhanVien(
		long nhanVienId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _nhanVienLocalService.deleteNhanVien(nhanVienId);
	}

	/**
	* Deletes the nhan vien from the database. Also notifies the appropriate model listeners.
	*
	* @param nhanVien the nhan vien
	* @return the nhan vien that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.nhanvien.model.NhanVien deleteNhanVien(
		com.minimart.portlet.nhanvien.model.NhanVien nhanVien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhanVienLocalService.deleteNhanVien(nhanVien);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _nhanVienLocalService.dynamicQuery();
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
		return _nhanVienLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _nhanVienLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _nhanVienLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _nhanVienLocalService.dynamicQueryCount(dynamicQuery);
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
		return _nhanVienLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.minimart.portlet.nhanvien.model.NhanVien fetchNhanVien(
		long nhanVienId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhanVienLocalService.fetchNhanVien(nhanVienId);
	}

	/**
	* Returns the nhan vien with the matching UUID and company.
	*
	* @param uuid the nhan vien's UUID
	* @param companyId the primary key of the company
	* @return the matching nhan vien, or <code>null</code> if a matching nhan vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.nhanvien.model.NhanVien fetchNhanVienByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhanVienLocalService.fetchNhanVienByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the nhan vien with the primary key.
	*
	* @param nhanVienId the primary key of the nhan vien
	* @return the nhan vien
	* @throws PortalException if a nhan vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.nhanvien.model.NhanVien getNhanVien(
		long nhanVienId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _nhanVienLocalService.getNhanVien(nhanVienId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _nhanVienLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the nhan vien with the matching UUID and company.
	*
	* @param uuid the nhan vien's UUID
	* @param companyId the primary key of the company
	* @return the matching nhan vien
	* @throws PortalException if a matching nhan vien could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.nhanvien.model.NhanVien getNhanVienByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _nhanVienLocalService.getNhanVienByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of all the nhan viens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhanvien.model.impl.NhanVienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of nhan viens
	* @param end the upper bound of the range of nhan viens (not inclusive)
	* @return the range of nhan viens
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.minimart.portlet.nhanvien.model.NhanVien> getNhanViens(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhanVienLocalService.getNhanViens(start, end);
	}

	/**
	* Returns the number of nhan viens.
	*
	* @return the number of nhan viens
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getNhanViensCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhanVienLocalService.getNhanViensCount();
	}

	/**
	* Updates the nhan vien in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param nhanVien the nhan vien
	* @return the nhan vien that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.minimart.portlet.nhanvien.model.NhanVien updateNhanVien(
		com.minimart.portlet.nhanvien.model.NhanVien nhanVien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _nhanVienLocalService.updateNhanVien(nhanVien);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _nhanVienLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_nhanVienLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _nhanVienLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public NhanVienLocalService getWrappedNhanVienLocalService() {
		return _nhanVienLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedNhanVienLocalService(
		NhanVienLocalService nhanVienLocalService) {
		_nhanVienLocalService = nhanVienLocalService;
	}

	@Override
	public NhanVienLocalService getWrappedService() {
		return _nhanVienLocalService;
	}

	@Override
	public void setWrappedService(NhanVienLocalService nhanVienLocalService) {
		_nhanVienLocalService = nhanVienLocalService;
	}

	private NhanVienLocalService _nhanVienLocalService;
}