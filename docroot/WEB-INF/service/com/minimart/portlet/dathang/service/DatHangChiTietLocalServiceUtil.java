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

package com.minimart.portlet.dathang.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for DatHangChiTiet. This utility wraps
 * {@link com.minimart.portlet.dathang.service.impl.DatHangChiTietLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Mai Thành Duy An
 * @see DatHangChiTietLocalService
 * @see com.minimart.portlet.dathang.service.base.DatHangChiTietLocalServiceBaseImpl
 * @see com.minimart.portlet.dathang.service.impl.DatHangChiTietLocalServiceImpl
 * @generated
 */
public class DatHangChiTietLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.minimart.portlet.dathang.service.impl.DatHangChiTietLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dat hang chi tiet to the database. Also notifies the appropriate model listeners.
	*
	* @param datHangChiTiet the dat hang chi tiet
	* @return the dat hang chi tiet that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.dathang.model.DatHangChiTiet addDatHangChiTiet(
		com.minimart.portlet.dathang.model.DatHangChiTiet datHangChiTiet)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDatHangChiTiet(datHangChiTiet);
	}

	/**
	* Creates a new dat hang chi tiet with the primary key. Does not add the dat hang chi tiet to the database.
	*
	* @param datHangChiTietId the primary key for the new dat hang chi tiet
	* @return the new dat hang chi tiet
	*/
	public static com.minimart.portlet.dathang.model.DatHangChiTiet createDatHangChiTiet(
		long datHangChiTietId) {
		return getService().createDatHangChiTiet(datHangChiTietId);
	}

	/**
	* Deletes the dat hang chi tiet with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param datHangChiTietId the primary key of the dat hang chi tiet
	* @return the dat hang chi tiet that was removed
	* @throws PortalException if a dat hang chi tiet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.dathang.model.DatHangChiTiet deleteDatHangChiTiet(
		long datHangChiTietId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDatHangChiTiet(datHangChiTietId);
	}

	/**
	* Deletes the dat hang chi tiet from the database. Also notifies the appropriate model listeners.
	*
	* @param datHangChiTiet the dat hang chi tiet
	* @return the dat hang chi tiet that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.dathang.model.DatHangChiTiet deleteDatHangChiTiet(
		com.minimart.portlet.dathang.model.DatHangChiTiet datHangChiTiet)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDatHangChiTiet(datHangChiTiet);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.dathang.model.impl.DatHangChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.dathang.model.impl.DatHangChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.minimart.portlet.dathang.model.DatHangChiTiet fetchDatHangChiTiet(
		long datHangChiTietId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDatHangChiTiet(datHangChiTietId);
	}

	/**
	* Returns the dat hang chi tiet with the primary key.
	*
	* @param datHangChiTietId the primary key of the dat hang chi tiet
	* @return the dat hang chi tiet
	* @throws PortalException if a dat hang chi tiet with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.dathang.model.DatHangChiTiet getDatHangChiTiet(
		long datHangChiTietId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDatHangChiTiet(datHangChiTietId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dat hang chi tiets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.dathang.model.impl.DatHangChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dat hang chi tiets
	* @param end the upper bound of the range of dat hang chi tiets (not inclusive)
	* @return the range of dat hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.minimart.portlet.dathang.model.DatHangChiTiet> getDatHangChiTiets(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDatHangChiTiets(start, end);
	}

	/**
	* Returns the number of dat hang chi tiets.
	*
	* @return the number of dat hang chi tiets
	* @throws SystemException if a system exception occurred
	*/
	public static int getDatHangChiTietsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDatHangChiTietsCount();
	}

	/**
	* Updates the dat hang chi tiet in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param datHangChiTiet the dat hang chi tiet
	* @return the dat hang chi tiet that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.dathang.model.DatHangChiTiet updateDatHangChiTiet(
		com.minimart.portlet.dathang.model.DatHangChiTiet datHangChiTiet)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDatHangChiTiet(datHangChiTiet);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static void clearService() {
		_service = null;
	}

	public static DatHangChiTietLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DatHangChiTietLocalService.class.getName());

			if (invokableLocalService instanceof DatHangChiTietLocalService) {
				_service = (DatHangChiTietLocalService)invokableLocalService;
			}
			else {
				_service = new DatHangChiTietLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DatHangChiTietLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(DatHangChiTietLocalService service) {
	}

	private static DatHangChiTietLocalService _service;
}