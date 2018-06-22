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

package com.minimart.portlet.khachhang.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.minimart.portlet.khachhang.model.NhomKhachHang;
import com.minimart.portlet.khachhang.service.NhomKhachHangLocalService;
import com.minimart.portlet.khachhang.service.persistence.KhachHangPersistence;
import com.minimart.portlet.khachhang.service.persistence.NhomKhachHangPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the nhom khach hang local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.minimart.portlet.khachhang.service.impl.NhomKhachHangLocalServiceImpl}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see com.minimart.portlet.khachhang.service.impl.NhomKhachHangLocalServiceImpl
 * @see com.minimart.portlet.khachhang.service.NhomKhachHangLocalServiceUtil
 * @generated
 */
public abstract class NhomKhachHangLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements NhomKhachHangLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.minimart.portlet.khachhang.service.NhomKhachHangLocalServiceUtil} to access the nhom khach hang local service.
	 */

	/**
	 * Adds the nhom khach hang to the database. Also notifies the appropriate model listeners.
	 *
	 * @param nhomKhachHang the nhom khach hang
	 * @return the nhom khach hang that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public NhomKhachHang addNhomKhachHang(NhomKhachHang nhomKhachHang)
		throws SystemException {
		nhomKhachHang.setNew(true);

		return nhomKhachHangPersistence.update(nhomKhachHang);
	}

	/**
	 * Creates a new nhom khach hang with the primary key. Does not add the nhom khach hang to the database.
	 *
	 * @param nhomKhachHangId the primary key for the new nhom khach hang
	 * @return the new nhom khach hang
	 */
	@Override
	public NhomKhachHang createNhomKhachHang(long nhomKhachHangId) {
		return nhomKhachHangPersistence.create(nhomKhachHangId);
	}

	/**
	 * Deletes the nhom khach hang with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param nhomKhachHangId the primary key of the nhom khach hang
	 * @return the nhom khach hang that was removed
	 * @throws PortalException if a nhom khach hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public NhomKhachHang deleteNhomKhachHang(long nhomKhachHangId)
		throws PortalException, SystemException {
		return nhomKhachHangPersistence.remove(nhomKhachHangId);
	}

	/**
	 * Deletes the nhom khach hang from the database. Also notifies the appropriate model listeners.
	 *
	 * @param nhomKhachHang the nhom khach hang
	 * @return the nhom khach hang that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public NhomKhachHang deleteNhomKhachHang(NhomKhachHang nhomKhachHang)
		throws SystemException {
		return nhomKhachHangPersistence.remove(nhomKhachHang);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(NhomKhachHang.class,
			clazz.getClassLoader());
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
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return nhomKhachHangPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.NhomKhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return nhomKhachHangPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.NhomKhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return nhomKhachHangPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return nhomKhachHangPersistence.countWithDynamicQuery(dynamicQuery);
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return nhomKhachHangPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public NhomKhachHang fetchNhomKhachHang(long nhomKhachHangId)
		throws SystemException {
		return nhomKhachHangPersistence.fetchByPrimaryKey(nhomKhachHangId);
	}

	/**
	 * Returns the nhom khach hang with the primary key.
	 *
	 * @param nhomKhachHangId the primary key of the nhom khach hang
	 * @return the nhom khach hang
	 * @throws PortalException if a nhom khach hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomKhachHang getNhomKhachHang(long nhomKhachHangId)
		throws PortalException, SystemException {
		return nhomKhachHangPersistence.findByPrimaryKey(nhomKhachHangId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return nhomKhachHangPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the nhom khach hangs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.NhomKhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nhom khach hangs
	 * @param end the upper bound of the range of nhom khach hangs (not inclusive)
	 * @return the range of nhom khach hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhomKhachHang> getNhomKhachHangs(int start, int end)
		throws SystemException {
		return nhomKhachHangPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of nhom khach hangs.
	 *
	 * @return the number of nhom khach hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getNhomKhachHangsCount() throws SystemException {
		return nhomKhachHangPersistence.countAll();
	}

	/**
	 * Updates the nhom khach hang in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param nhomKhachHang the nhom khach hang
	 * @return the nhom khach hang that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public NhomKhachHang updateNhomKhachHang(NhomKhachHang nhomKhachHang)
		throws SystemException {
		return nhomKhachHangPersistence.update(nhomKhachHang);
	}

	/**
	 * Returns the khach hang local service.
	 *
	 * @return the khach hang local service
	 */
	public com.minimart.portlet.khachhang.service.KhachHangLocalService getKhachHangLocalService() {
		return khachHangLocalService;
	}

	/**
	 * Sets the khach hang local service.
	 *
	 * @param khachHangLocalService the khach hang local service
	 */
	public void setKhachHangLocalService(
		com.minimart.portlet.khachhang.service.KhachHangLocalService khachHangLocalService) {
		this.khachHangLocalService = khachHangLocalService;
	}

	/**
	 * Returns the khach hang remote service.
	 *
	 * @return the khach hang remote service
	 */
	public com.minimart.portlet.khachhang.service.KhachHangService getKhachHangService() {
		return khachHangService;
	}

	/**
	 * Sets the khach hang remote service.
	 *
	 * @param khachHangService the khach hang remote service
	 */
	public void setKhachHangService(
		com.minimart.portlet.khachhang.service.KhachHangService khachHangService) {
		this.khachHangService = khachHangService;
	}

	/**
	 * Returns the khach hang persistence.
	 *
	 * @return the khach hang persistence
	 */
	public KhachHangPersistence getKhachHangPersistence() {
		return khachHangPersistence;
	}

	/**
	 * Sets the khach hang persistence.
	 *
	 * @param khachHangPersistence the khach hang persistence
	 */
	public void setKhachHangPersistence(
		KhachHangPersistence khachHangPersistence) {
		this.khachHangPersistence = khachHangPersistence;
	}

	/**
	 * Returns the nhom khach hang local service.
	 *
	 * @return the nhom khach hang local service
	 */
	public com.minimart.portlet.khachhang.service.NhomKhachHangLocalService getNhomKhachHangLocalService() {
		return nhomKhachHangLocalService;
	}

	/**
	 * Sets the nhom khach hang local service.
	 *
	 * @param nhomKhachHangLocalService the nhom khach hang local service
	 */
	public void setNhomKhachHangLocalService(
		com.minimart.portlet.khachhang.service.NhomKhachHangLocalService nhomKhachHangLocalService) {
		this.nhomKhachHangLocalService = nhomKhachHangLocalService;
	}

	/**
	 * Returns the nhom khach hang remote service.
	 *
	 * @return the nhom khach hang remote service
	 */
	public com.minimart.portlet.khachhang.service.NhomKhachHangService getNhomKhachHangService() {
		return nhomKhachHangService;
	}

	/**
	 * Sets the nhom khach hang remote service.
	 *
	 * @param nhomKhachHangService the nhom khach hang remote service
	 */
	public void setNhomKhachHangService(
		com.minimart.portlet.khachhang.service.NhomKhachHangService nhomKhachHangService) {
		this.nhomKhachHangService = nhomKhachHangService;
	}

	/**
	 * Returns the nhom khach hang persistence.
	 *
	 * @return the nhom khach hang persistence
	 */
	public NhomKhachHangPersistence getNhomKhachHangPersistence() {
		return nhomKhachHangPersistence;
	}

	/**
	 * Sets the nhom khach hang persistence.
	 *
	 * @param nhomKhachHangPersistence the nhom khach hang persistence
	 */
	public void setNhomKhachHangPersistence(
		NhomKhachHangPersistence nhomKhachHangPersistence) {
		this.nhomKhachHangPersistence = nhomKhachHangPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("com.minimart.portlet.khachhang.model.NhomKhachHang",
			nhomKhachHangLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.minimart.portlet.khachhang.model.NhomKhachHang");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return NhomKhachHang.class;
	}

	protected String getModelClassName() {
		return NhomKhachHang.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = nhomKhachHangPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.minimart.portlet.khachhang.service.KhachHangLocalService.class)
	protected com.minimart.portlet.khachhang.service.KhachHangLocalService khachHangLocalService;
	@BeanReference(type = com.minimart.portlet.khachhang.service.KhachHangService.class)
	protected com.minimart.portlet.khachhang.service.KhachHangService khachHangService;
	@BeanReference(type = KhachHangPersistence.class)
	protected KhachHangPersistence khachHangPersistence;
	@BeanReference(type = com.minimart.portlet.khachhang.service.NhomKhachHangLocalService.class)
	protected com.minimart.portlet.khachhang.service.NhomKhachHangLocalService nhomKhachHangLocalService;
	@BeanReference(type = com.minimart.portlet.khachhang.service.NhomKhachHangService.class)
	protected com.minimart.portlet.khachhang.service.NhomKhachHangService nhomKhachHangService;
	@BeanReference(type = NhomKhachHangPersistence.class)
	protected NhomKhachHangPersistence nhomKhachHangPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private NhomKhachHangLocalServiceClpInvoker _clpInvoker = new NhomKhachHangLocalServiceClpInvoker();
}