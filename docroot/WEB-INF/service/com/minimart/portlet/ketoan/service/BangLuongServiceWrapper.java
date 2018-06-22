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

package com.minimart.portlet.ketoan.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BangLuongService}.
 *
 * @author Mai Thành Duy An
 * @see BangLuongService
 * @generated
 */
public class BangLuongServiceWrapper implements BangLuongService,
	ServiceWrapper<BangLuongService> {
	public BangLuongServiceWrapper(BangLuongService bangLuongService) {
		_bangLuongService = bangLuongService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _bangLuongService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_bangLuongService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _bangLuongService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public BangLuongService getWrappedBangLuongService() {
		return _bangLuongService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedBangLuongService(BangLuongService bangLuongService) {
		_bangLuongService = bangLuongService;
	}

	@Override
	public BangLuongService getWrappedService() {
		return _bangLuongService;
	}

	@Override
	public void setWrappedService(BangLuongService bangLuongService) {
		_bangLuongService = bangLuongService;
	}

	private BangLuongService _bangLuongService;
}