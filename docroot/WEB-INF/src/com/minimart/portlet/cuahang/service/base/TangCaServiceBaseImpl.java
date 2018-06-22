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

package com.minimart.portlet.cuahang.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import com.minimart.portlet.cuahang.model.TangCa;
import com.minimart.portlet.cuahang.service.TangCaService;
import com.minimart.portlet.cuahang.service.persistence.CaLamViecPersistence;
import com.minimart.portlet.cuahang.service.persistence.CuaHangPersistence;
import com.minimart.portlet.cuahang.service.persistence.TangCaPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the tang ca remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.minimart.portlet.cuahang.service.impl.TangCaServiceImpl}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see com.minimart.portlet.cuahang.service.impl.TangCaServiceImpl
 * @see com.minimart.portlet.cuahang.service.TangCaServiceUtil
 * @generated
 */
public abstract class TangCaServiceBaseImpl extends BaseServiceImpl
	implements TangCaService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.minimart.portlet.cuahang.service.TangCaServiceUtil} to access the tang ca remote service.
	 */

	/**
	 * Returns the ca lam viec local service.
	 *
	 * @return the ca lam viec local service
	 */
	public com.minimart.portlet.cuahang.service.CaLamViecLocalService getCaLamViecLocalService() {
		return caLamViecLocalService;
	}

	/**
	 * Sets the ca lam viec local service.
	 *
	 * @param caLamViecLocalService the ca lam viec local service
	 */
	public void setCaLamViecLocalService(
		com.minimart.portlet.cuahang.service.CaLamViecLocalService caLamViecLocalService) {
		this.caLamViecLocalService = caLamViecLocalService;
	}

	/**
	 * Returns the ca lam viec remote service.
	 *
	 * @return the ca lam viec remote service
	 */
	public com.minimart.portlet.cuahang.service.CaLamViecService getCaLamViecService() {
		return caLamViecService;
	}

	/**
	 * Sets the ca lam viec remote service.
	 *
	 * @param caLamViecService the ca lam viec remote service
	 */
	public void setCaLamViecService(
		com.minimart.portlet.cuahang.service.CaLamViecService caLamViecService) {
		this.caLamViecService = caLamViecService;
	}

	/**
	 * Returns the ca lam viec persistence.
	 *
	 * @return the ca lam viec persistence
	 */
	public CaLamViecPersistence getCaLamViecPersistence() {
		return caLamViecPersistence;
	}

	/**
	 * Sets the ca lam viec persistence.
	 *
	 * @param caLamViecPersistence the ca lam viec persistence
	 */
	public void setCaLamViecPersistence(
		CaLamViecPersistence caLamViecPersistence) {
		this.caLamViecPersistence = caLamViecPersistence;
	}

	/**
	 * Returns the cua hang local service.
	 *
	 * @return the cua hang local service
	 */
	public com.minimart.portlet.cuahang.service.CuaHangLocalService getCuaHangLocalService() {
		return cuaHangLocalService;
	}

	/**
	 * Sets the cua hang local service.
	 *
	 * @param cuaHangLocalService the cua hang local service
	 */
	public void setCuaHangLocalService(
		com.minimart.portlet.cuahang.service.CuaHangLocalService cuaHangLocalService) {
		this.cuaHangLocalService = cuaHangLocalService;
	}

	/**
	 * Returns the cua hang remote service.
	 *
	 * @return the cua hang remote service
	 */
	public com.minimart.portlet.cuahang.service.CuaHangService getCuaHangService() {
		return cuaHangService;
	}

	/**
	 * Sets the cua hang remote service.
	 *
	 * @param cuaHangService the cua hang remote service
	 */
	public void setCuaHangService(
		com.minimart.portlet.cuahang.service.CuaHangService cuaHangService) {
		this.cuaHangService = cuaHangService;
	}

	/**
	 * Returns the cua hang persistence.
	 *
	 * @return the cua hang persistence
	 */
	public CuaHangPersistence getCuaHangPersistence() {
		return cuaHangPersistence;
	}

	/**
	 * Sets the cua hang persistence.
	 *
	 * @param cuaHangPersistence the cua hang persistence
	 */
	public void setCuaHangPersistence(CuaHangPersistence cuaHangPersistence) {
		this.cuaHangPersistence = cuaHangPersistence;
	}

	/**
	 * Returns the tang ca local service.
	 *
	 * @return the tang ca local service
	 */
	public com.minimart.portlet.cuahang.service.TangCaLocalService getTangCaLocalService() {
		return tangCaLocalService;
	}

	/**
	 * Sets the tang ca local service.
	 *
	 * @param tangCaLocalService the tang ca local service
	 */
	public void setTangCaLocalService(
		com.minimart.portlet.cuahang.service.TangCaLocalService tangCaLocalService) {
		this.tangCaLocalService = tangCaLocalService;
	}

	/**
	 * Returns the tang ca remote service.
	 *
	 * @return the tang ca remote service
	 */
	public com.minimart.portlet.cuahang.service.TangCaService getTangCaService() {
		return tangCaService;
	}

	/**
	 * Sets the tang ca remote service.
	 *
	 * @param tangCaService the tang ca remote service
	 */
	public void setTangCaService(
		com.minimart.portlet.cuahang.service.TangCaService tangCaService) {
		this.tangCaService = tangCaService;
	}

	/**
	 * Returns the tang ca persistence.
	 *
	 * @return the tang ca persistence
	 */
	public TangCaPersistence getTangCaPersistence() {
		return tangCaPersistence;
	}

	/**
	 * Sets the tang ca persistence.
	 *
	 * @param tangCaPersistence the tang ca persistence
	 */
	public void setTangCaPersistence(TangCaPersistence tangCaPersistence) {
		this.tangCaPersistence = tangCaPersistence;
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
	}

	public void destroy() {
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
		return TangCa.class;
	}

	protected String getModelClassName() {
		return TangCa.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = tangCaPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.minimart.portlet.cuahang.service.CaLamViecLocalService.class)
	protected com.minimart.portlet.cuahang.service.CaLamViecLocalService caLamViecLocalService;
	@BeanReference(type = com.minimart.portlet.cuahang.service.CaLamViecService.class)
	protected com.minimart.portlet.cuahang.service.CaLamViecService caLamViecService;
	@BeanReference(type = CaLamViecPersistence.class)
	protected CaLamViecPersistence caLamViecPersistence;
	@BeanReference(type = com.minimart.portlet.cuahang.service.CuaHangLocalService.class)
	protected com.minimart.portlet.cuahang.service.CuaHangLocalService cuaHangLocalService;
	@BeanReference(type = com.minimart.portlet.cuahang.service.CuaHangService.class)
	protected com.minimart.portlet.cuahang.service.CuaHangService cuaHangService;
	@BeanReference(type = CuaHangPersistence.class)
	protected CuaHangPersistence cuaHangPersistence;
	@BeanReference(type = com.minimart.portlet.cuahang.service.TangCaLocalService.class)
	protected com.minimart.portlet.cuahang.service.TangCaLocalService tangCaLocalService;
	@BeanReference(type = com.minimart.portlet.cuahang.service.TangCaService.class)
	protected com.minimart.portlet.cuahang.service.TangCaService tangCaService;
	@BeanReference(type = TangCaPersistence.class)
	protected TangCaPersistence tangCaPersistence;
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
	private TangCaServiceClpInvoker _clpInvoker = new TangCaServiceClpInvoker();
}