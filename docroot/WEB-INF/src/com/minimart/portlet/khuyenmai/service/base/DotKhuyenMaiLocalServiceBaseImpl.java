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

package com.minimart.portlet.khuyenmai.service.base;

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

import com.minimart.portlet.khuyenmai.model.DotKhuyenMai;
import com.minimart.portlet.khuyenmai.service.DotKhuyenMaiLocalService;
import com.minimart.portlet.khuyenmai.service.persistence.DotKhuyenMaiChiTietPersistence;
import com.minimart.portlet.khuyenmai.service.persistence.DotKhuyenMaiPersistence;
import com.minimart.portlet.khuyenmai.service.persistence.LoaiHinhKhuyenMaiPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the dot khuyen mai local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.minimart.portlet.khuyenmai.service.impl.DotKhuyenMaiLocalServiceImpl}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see com.minimart.portlet.khuyenmai.service.impl.DotKhuyenMaiLocalServiceImpl
 * @see com.minimart.portlet.khuyenmai.service.DotKhuyenMaiLocalServiceUtil
 * @generated
 */
public abstract class DotKhuyenMaiLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements DotKhuyenMaiLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.minimart.portlet.khuyenmai.service.DotKhuyenMaiLocalServiceUtil} to access the dot khuyen mai local service.
	 */

	/**
	 * Adds the dot khuyen mai to the database. Also notifies the appropriate model listeners.
	 *
	 * @param dotKhuyenMai the dot khuyen mai
	 * @return the dot khuyen mai that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public DotKhuyenMai addDotKhuyenMai(DotKhuyenMai dotKhuyenMai)
		throws SystemException {
		dotKhuyenMai.setNew(true);

		return dotKhuyenMaiPersistence.update(dotKhuyenMai);
	}

	/**
	 * Creates a new dot khuyen mai with the primary key. Does not add the dot khuyen mai to the database.
	 *
	 * @param dotKhuyenMaiId the primary key for the new dot khuyen mai
	 * @return the new dot khuyen mai
	 */
	@Override
	public DotKhuyenMai createDotKhuyenMai(long dotKhuyenMaiId) {
		return dotKhuyenMaiPersistence.create(dotKhuyenMaiId);
	}

	/**
	 * Deletes the dot khuyen mai with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dotKhuyenMaiId the primary key of the dot khuyen mai
	 * @return the dot khuyen mai that was removed
	 * @throws PortalException if a dot khuyen mai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public DotKhuyenMai deleteDotKhuyenMai(long dotKhuyenMaiId)
		throws PortalException, SystemException {
		return dotKhuyenMaiPersistence.remove(dotKhuyenMaiId);
	}

	/**
	 * Deletes the dot khuyen mai from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dotKhuyenMai the dot khuyen mai
	 * @return the dot khuyen mai that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public DotKhuyenMai deleteDotKhuyenMai(DotKhuyenMai dotKhuyenMai)
		throws SystemException {
		return dotKhuyenMaiPersistence.remove(dotKhuyenMai);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(DotKhuyenMai.class,
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
		return dotKhuyenMaiPersistence.findWithDynamicQuery(dynamicQuery);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return dotKhuyenMaiPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return dotKhuyenMaiPersistence.findWithDynamicQuery(dynamicQuery,
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
		return dotKhuyenMaiPersistence.countWithDynamicQuery(dynamicQuery);
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
		return dotKhuyenMaiPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public DotKhuyenMai fetchDotKhuyenMai(long dotKhuyenMaiId)
		throws SystemException {
		return dotKhuyenMaiPersistence.fetchByPrimaryKey(dotKhuyenMaiId);
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
	public DotKhuyenMai getDotKhuyenMai(long dotKhuyenMaiId)
		throws PortalException, SystemException {
		return dotKhuyenMaiPersistence.findByPrimaryKey(dotKhuyenMaiId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return dotKhuyenMaiPersistence.findByPrimaryKey(primaryKeyObj);
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
	public List<DotKhuyenMai> getDotKhuyenMais(int start, int end)
		throws SystemException {
		return dotKhuyenMaiPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of dot khuyen mais.
	 *
	 * @return the number of dot khuyen mais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getDotKhuyenMaisCount() throws SystemException {
		return dotKhuyenMaiPersistence.countAll();
	}

	/**
	 * Updates the dot khuyen mai in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param dotKhuyenMai the dot khuyen mai
	 * @return the dot khuyen mai that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public DotKhuyenMai updateDotKhuyenMai(DotKhuyenMai dotKhuyenMai)
		throws SystemException {
		return dotKhuyenMaiPersistence.update(dotKhuyenMai);
	}

	/**
	 * Returns the dot khuyen mai local service.
	 *
	 * @return the dot khuyen mai local service
	 */
	public com.minimart.portlet.khuyenmai.service.DotKhuyenMaiLocalService getDotKhuyenMaiLocalService() {
		return dotKhuyenMaiLocalService;
	}

	/**
	 * Sets the dot khuyen mai local service.
	 *
	 * @param dotKhuyenMaiLocalService the dot khuyen mai local service
	 */
	public void setDotKhuyenMaiLocalService(
		com.minimart.portlet.khuyenmai.service.DotKhuyenMaiLocalService dotKhuyenMaiLocalService) {
		this.dotKhuyenMaiLocalService = dotKhuyenMaiLocalService;
	}

	/**
	 * Returns the dot khuyen mai remote service.
	 *
	 * @return the dot khuyen mai remote service
	 */
	public com.minimart.portlet.khuyenmai.service.DotKhuyenMaiService getDotKhuyenMaiService() {
		return dotKhuyenMaiService;
	}

	/**
	 * Sets the dot khuyen mai remote service.
	 *
	 * @param dotKhuyenMaiService the dot khuyen mai remote service
	 */
	public void setDotKhuyenMaiService(
		com.minimart.portlet.khuyenmai.service.DotKhuyenMaiService dotKhuyenMaiService) {
		this.dotKhuyenMaiService = dotKhuyenMaiService;
	}

	/**
	 * Returns the dot khuyen mai persistence.
	 *
	 * @return the dot khuyen mai persistence
	 */
	public DotKhuyenMaiPersistence getDotKhuyenMaiPersistence() {
		return dotKhuyenMaiPersistence;
	}

	/**
	 * Sets the dot khuyen mai persistence.
	 *
	 * @param dotKhuyenMaiPersistence the dot khuyen mai persistence
	 */
	public void setDotKhuyenMaiPersistence(
		DotKhuyenMaiPersistence dotKhuyenMaiPersistence) {
		this.dotKhuyenMaiPersistence = dotKhuyenMaiPersistence;
	}

	/**
	 * Returns the dot khuyen mai chi tiet local service.
	 *
	 * @return the dot khuyen mai chi tiet local service
	 */
	public com.minimart.portlet.khuyenmai.service.DotKhuyenMaiChiTietLocalService getDotKhuyenMaiChiTietLocalService() {
		return dotKhuyenMaiChiTietLocalService;
	}

	/**
	 * Sets the dot khuyen mai chi tiet local service.
	 *
	 * @param dotKhuyenMaiChiTietLocalService the dot khuyen mai chi tiet local service
	 */
	public void setDotKhuyenMaiChiTietLocalService(
		com.minimart.portlet.khuyenmai.service.DotKhuyenMaiChiTietLocalService dotKhuyenMaiChiTietLocalService) {
		this.dotKhuyenMaiChiTietLocalService = dotKhuyenMaiChiTietLocalService;
	}

	/**
	 * Returns the dot khuyen mai chi tiet remote service.
	 *
	 * @return the dot khuyen mai chi tiet remote service
	 */
	public com.minimart.portlet.khuyenmai.service.DotKhuyenMaiChiTietService getDotKhuyenMaiChiTietService() {
		return dotKhuyenMaiChiTietService;
	}

	/**
	 * Sets the dot khuyen mai chi tiet remote service.
	 *
	 * @param dotKhuyenMaiChiTietService the dot khuyen mai chi tiet remote service
	 */
	public void setDotKhuyenMaiChiTietService(
		com.minimart.portlet.khuyenmai.service.DotKhuyenMaiChiTietService dotKhuyenMaiChiTietService) {
		this.dotKhuyenMaiChiTietService = dotKhuyenMaiChiTietService;
	}

	/**
	 * Returns the dot khuyen mai chi tiet persistence.
	 *
	 * @return the dot khuyen mai chi tiet persistence
	 */
	public DotKhuyenMaiChiTietPersistence getDotKhuyenMaiChiTietPersistence() {
		return dotKhuyenMaiChiTietPersistence;
	}

	/**
	 * Sets the dot khuyen mai chi tiet persistence.
	 *
	 * @param dotKhuyenMaiChiTietPersistence the dot khuyen mai chi tiet persistence
	 */
	public void setDotKhuyenMaiChiTietPersistence(
		DotKhuyenMaiChiTietPersistence dotKhuyenMaiChiTietPersistence) {
		this.dotKhuyenMaiChiTietPersistence = dotKhuyenMaiChiTietPersistence;
	}

	/**
	 * Returns the loai hinh khuyen mai local service.
	 *
	 * @return the loai hinh khuyen mai local service
	 */
	public com.minimart.portlet.khuyenmai.service.LoaiHinhKhuyenMaiLocalService getLoaiHinhKhuyenMaiLocalService() {
		return loaiHinhKhuyenMaiLocalService;
	}

	/**
	 * Sets the loai hinh khuyen mai local service.
	 *
	 * @param loaiHinhKhuyenMaiLocalService the loai hinh khuyen mai local service
	 */
	public void setLoaiHinhKhuyenMaiLocalService(
		com.minimart.portlet.khuyenmai.service.LoaiHinhKhuyenMaiLocalService loaiHinhKhuyenMaiLocalService) {
		this.loaiHinhKhuyenMaiLocalService = loaiHinhKhuyenMaiLocalService;
	}

	/**
	 * Returns the loai hinh khuyen mai remote service.
	 *
	 * @return the loai hinh khuyen mai remote service
	 */
	public com.minimart.portlet.khuyenmai.service.LoaiHinhKhuyenMaiService getLoaiHinhKhuyenMaiService() {
		return loaiHinhKhuyenMaiService;
	}

	/**
	 * Sets the loai hinh khuyen mai remote service.
	 *
	 * @param loaiHinhKhuyenMaiService the loai hinh khuyen mai remote service
	 */
	public void setLoaiHinhKhuyenMaiService(
		com.minimart.portlet.khuyenmai.service.LoaiHinhKhuyenMaiService loaiHinhKhuyenMaiService) {
		this.loaiHinhKhuyenMaiService = loaiHinhKhuyenMaiService;
	}

	/**
	 * Returns the loai hinh khuyen mai persistence.
	 *
	 * @return the loai hinh khuyen mai persistence
	 */
	public LoaiHinhKhuyenMaiPersistence getLoaiHinhKhuyenMaiPersistence() {
		return loaiHinhKhuyenMaiPersistence;
	}

	/**
	 * Sets the loai hinh khuyen mai persistence.
	 *
	 * @param loaiHinhKhuyenMaiPersistence the loai hinh khuyen mai persistence
	 */
	public void setLoaiHinhKhuyenMaiPersistence(
		LoaiHinhKhuyenMaiPersistence loaiHinhKhuyenMaiPersistence) {
		this.loaiHinhKhuyenMaiPersistence = loaiHinhKhuyenMaiPersistence;
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

		PersistedModelLocalServiceRegistryUtil.register("com.minimart.portlet.khuyenmai.model.DotKhuyenMai",
			dotKhuyenMaiLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.minimart.portlet.khuyenmai.model.DotKhuyenMai");
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
		return DotKhuyenMai.class;
	}

	protected String getModelClassName() {
		return DotKhuyenMai.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = dotKhuyenMaiPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.minimart.portlet.khuyenmai.service.DotKhuyenMaiLocalService.class)
	protected com.minimart.portlet.khuyenmai.service.DotKhuyenMaiLocalService dotKhuyenMaiLocalService;
	@BeanReference(type = com.minimart.portlet.khuyenmai.service.DotKhuyenMaiService.class)
	protected com.minimart.portlet.khuyenmai.service.DotKhuyenMaiService dotKhuyenMaiService;
	@BeanReference(type = DotKhuyenMaiPersistence.class)
	protected DotKhuyenMaiPersistence dotKhuyenMaiPersistence;
	@BeanReference(type = com.minimart.portlet.khuyenmai.service.DotKhuyenMaiChiTietLocalService.class)
	protected com.minimart.portlet.khuyenmai.service.DotKhuyenMaiChiTietLocalService dotKhuyenMaiChiTietLocalService;
	@BeanReference(type = com.minimart.portlet.khuyenmai.service.DotKhuyenMaiChiTietService.class)
	protected com.minimart.portlet.khuyenmai.service.DotKhuyenMaiChiTietService dotKhuyenMaiChiTietService;
	@BeanReference(type = DotKhuyenMaiChiTietPersistence.class)
	protected DotKhuyenMaiChiTietPersistence dotKhuyenMaiChiTietPersistence;
	@BeanReference(type = com.minimart.portlet.khuyenmai.service.LoaiHinhKhuyenMaiLocalService.class)
	protected com.minimart.portlet.khuyenmai.service.LoaiHinhKhuyenMaiLocalService loaiHinhKhuyenMaiLocalService;
	@BeanReference(type = com.minimart.portlet.khuyenmai.service.LoaiHinhKhuyenMaiService.class)
	protected com.minimart.portlet.khuyenmai.service.LoaiHinhKhuyenMaiService loaiHinhKhuyenMaiService;
	@BeanReference(type = LoaiHinhKhuyenMaiPersistence.class)
	protected LoaiHinhKhuyenMaiPersistence loaiHinhKhuyenMaiPersistence;
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
	private DotKhuyenMaiLocalServiceClpInvoker _clpInvoker = new DotKhuyenMaiLocalServiceClpInvoker();
}