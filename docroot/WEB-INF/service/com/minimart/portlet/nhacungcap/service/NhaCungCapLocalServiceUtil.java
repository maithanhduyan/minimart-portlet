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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for NhaCungCap. This utility wraps
 * {@link com.minimart.portlet.nhacungcap.service.impl.NhaCungCapLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Mai Thành Duy An
 * @see NhaCungCapLocalService
 * @see com.minimart.portlet.nhacungcap.service.base.NhaCungCapLocalServiceBaseImpl
 * @see com.minimart.portlet.nhacungcap.service.impl.NhaCungCapLocalServiceImpl
 * @generated
 */
public class NhaCungCapLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.minimart.portlet.nhacungcap.service.impl.NhaCungCapLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the nha cung cap to the database. Also notifies the appropriate model listeners.
	*
	* @param nhaCungCap the nha cung cap
	* @return the nha cung cap that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhaCungCap addNhaCungCap(
		com.minimart.portlet.nhacungcap.model.NhaCungCap nhaCungCap)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addNhaCungCap(nhaCungCap);
	}

	/**
	* Creates a new nha cung cap with the primary key. Does not add the nha cung cap to the database.
	*
	* @param nhaCungCapId the primary key for the new nha cung cap
	* @return the new nha cung cap
	*/
	public static com.minimart.portlet.nhacungcap.model.NhaCungCap createNhaCungCap(
		long nhaCungCapId) {
		return getService().createNhaCungCap(nhaCungCapId);
	}

	/**
	* Deletes the nha cung cap with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param nhaCungCapId the primary key of the nha cung cap
	* @return the nha cung cap that was removed
	* @throws PortalException if a nha cung cap with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhaCungCap deleteNhaCungCap(
		long nhaCungCapId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteNhaCungCap(nhaCungCapId);
	}

	/**
	* Deletes the nha cung cap from the database. Also notifies the appropriate model listeners.
	*
	* @param nhaCungCap the nha cung cap
	* @return the nha cung cap that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhaCungCap deleteNhaCungCap(
		com.minimart.portlet.nhacungcap.model.NhaCungCap nhaCungCap)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteNhaCungCap(nhaCungCap);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.minimart.portlet.nhacungcap.model.NhaCungCap fetchNhaCungCap(
		long nhaCungCapId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchNhaCungCap(nhaCungCapId);
	}

	/**
	* Returns the nha cung cap with the primary key.
	*
	* @param nhaCungCapId the primary key of the nha cung cap
	* @return the nha cung cap
	* @throws PortalException if a nha cung cap with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhaCungCap getNhaCungCap(
		long nhaCungCapId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getNhaCungCap(nhaCungCapId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.minimart.portlet.nhacungcap.model.NhaCungCap> getNhaCungCaps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getNhaCungCaps(start, end);
	}

	/**
	* Returns the number of nha cung caps.
	*
	* @return the number of nha cung caps
	* @throws SystemException if a system exception occurred
	*/
	public static int getNhaCungCapsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getNhaCungCapsCount();
	}

	/**
	* Updates the nha cung cap in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param nhaCungCap the nha cung cap
	* @return the nha cung cap that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.minimart.portlet.nhacungcap.model.NhaCungCap updateNhaCungCap(
		com.minimart.portlet.nhacungcap.model.NhaCungCap nhaCungCap)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateNhaCungCap(nhaCungCap);
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

	public static NhaCungCapLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					NhaCungCapLocalService.class.getName());

			if (invokableLocalService instanceof NhaCungCapLocalService) {
				_service = (NhaCungCapLocalService)invokableLocalService;
			}
			else {
				_service = new NhaCungCapLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(NhaCungCapLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(NhaCungCapLocalService service) {
	}

	private static NhaCungCapLocalService _service;
}