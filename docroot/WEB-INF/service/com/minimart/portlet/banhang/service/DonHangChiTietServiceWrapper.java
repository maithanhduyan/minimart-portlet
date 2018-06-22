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
 * Provides a wrapper for {@link DonHangChiTietService}.
 *
 * @author Mai Thành Duy An
 * @see DonHangChiTietService
 * @generated
 */
public class DonHangChiTietServiceWrapper implements DonHangChiTietService,
	ServiceWrapper<DonHangChiTietService> {
	public DonHangChiTietServiceWrapper(
		DonHangChiTietService donHangChiTietService) {
		_donHangChiTietService = donHangChiTietService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _donHangChiTietService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_donHangChiTietService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _donHangChiTietService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public DonHangChiTietService getWrappedDonHangChiTietService() {
		return _donHangChiTietService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedDonHangChiTietService(
		DonHangChiTietService donHangChiTietService) {
		_donHangChiTietService = donHangChiTietService;
	}

	@Override
	public DonHangChiTietService getWrappedService() {
		return _donHangChiTietService;
	}

	@Override
	public void setWrappedService(DonHangChiTietService donHangChiTietService) {
		_donHangChiTietService = donHangChiTietService;
	}

	private DonHangChiTietService _donHangChiTietService;
}