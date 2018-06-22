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

package com.minimart.portlet.ketoan.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import com.minimart.portlet.ketoan.model.ThuChi;
import com.minimart.portlet.ketoan.service.ThuChiService;
import com.minimart.portlet.ketoan.service.persistence.BangLuongPersistence;
import com.minimart.portlet.ketoan.service.persistence.ThuChiPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the thu chi remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.minimart.portlet.ketoan.service.impl.ThuChiServiceImpl}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see com.minimart.portlet.ketoan.service.impl.ThuChiServiceImpl
 * @see com.minimart.portlet.ketoan.service.ThuChiServiceUtil
 * @generated
 */
public abstract class ThuChiServiceBaseImpl extends BaseServiceImpl
	implements ThuChiService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.minimart.portlet.ketoan.service.ThuChiServiceUtil} to access the thu chi remote service.
	 */

	/**
	 * Returns the bang luong local service.
	 *
	 * @return the bang luong local service
	 */
	public com.minimart.portlet.ketoan.service.BangLuongLocalService getBangLuongLocalService() {
		return bangLuongLocalService;
	}

	/**
	 * Sets the bang luong local service.
	 *
	 * @param bangLuongLocalService the bang luong local service
	 */
	public void setBangLuongLocalService(
		com.minimart.portlet.ketoan.service.BangLuongLocalService bangLuongLocalService) {
		this.bangLuongLocalService = bangLuongLocalService;
	}

	/**
	 * Returns the bang luong remote service.
	 *
	 * @return the bang luong remote service
	 */
	public com.minimart.portlet.ketoan.service.BangLuongService getBangLuongService() {
		return bangLuongService;
	}

	/**
	 * Sets the bang luong remote service.
	 *
	 * @param bangLuongService the bang luong remote service
	 */
	public void setBangLuongService(
		com.minimart.portlet.ketoan.service.BangLuongService bangLuongService) {
		this.bangLuongService = bangLuongService;
	}

	/**
	 * Returns the bang luong persistence.
	 *
	 * @return the bang luong persistence
	 */
	public BangLuongPersistence getBangLuongPersistence() {
		return bangLuongPersistence;
	}

	/**
	 * Sets the bang luong persistence.
	 *
	 * @param bangLuongPersistence the bang luong persistence
	 */
	public void setBangLuongPersistence(
		BangLuongPersistence bangLuongPersistence) {
		this.bangLuongPersistence = bangLuongPersistence;
	}

	/**
	 * Returns the thu chi local service.
	 *
	 * @return the thu chi local service
	 */
	public com.minimart.portlet.ketoan.service.ThuChiLocalService getThuChiLocalService() {
		return thuChiLocalService;
	}

	/**
	 * Sets the thu chi local service.
	 *
	 * @param thuChiLocalService the thu chi local service
	 */
	public void setThuChiLocalService(
		com.minimart.portlet.ketoan.service.ThuChiLocalService thuChiLocalService) {
		this.thuChiLocalService = thuChiLocalService;
	}

	/**
	 * Returns the thu chi remote service.
	 *
	 * @return the thu chi remote service
	 */
	public com.minimart.portlet.ketoan.service.ThuChiService getThuChiService() {
		return thuChiService;
	}

	/**
	 * Sets the thu chi remote service.
	 *
	 * @param thuChiService the thu chi remote service
	 */
	public void setThuChiService(
		com.minimart.portlet.ketoan.service.ThuChiService thuChiService) {
		this.thuChiService = thuChiService;
	}

	/**
	 * Returns the thu chi persistence.
	 *
	 * @return the thu chi persistence
	 */
	public ThuChiPersistence getThuChiPersistence() {
		return thuChiPersistence;
	}

	/**
	 * Sets the thu chi persistence.
	 *
	 * @param thuChiPersistence the thu chi persistence
	 */
	public void setThuChiPersistence(ThuChiPersistence thuChiPersistence) {
		this.thuChiPersistence = thuChiPersistence;
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
		return ThuChi.class;
	}

	protected String getModelClassName() {
		return ThuChi.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = thuChiPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.minimart.portlet.ketoan.service.BangLuongLocalService.class)
	protected com.minimart.portlet.ketoan.service.BangLuongLocalService bangLuongLocalService;
	@BeanReference(type = com.minimart.portlet.ketoan.service.BangLuongService.class)
	protected com.minimart.portlet.ketoan.service.BangLuongService bangLuongService;
	@BeanReference(type = BangLuongPersistence.class)
	protected BangLuongPersistence bangLuongPersistence;
	@BeanReference(type = com.minimart.portlet.ketoan.service.ThuChiLocalService.class)
	protected com.minimart.portlet.ketoan.service.ThuChiLocalService thuChiLocalService;
	@BeanReference(type = com.minimart.portlet.ketoan.service.ThuChiService.class)
	protected com.minimart.portlet.ketoan.service.ThuChiService thuChiService;
	@BeanReference(type = ThuChiPersistence.class)
	protected ThuChiPersistence thuChiPersistence;
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
	private ThuChiServiceClpInvoker _clpInvoker = new ThuChiServiceClpInvoker();
}