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

package com.minimart.portlet.cuahang.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.minimart.portlet.cuahang.model.CaLamViec;
import com.minimart.portlet.cuahang.service.CaLamViecLocalServiceUtil;

/**
 * @author Mai Thành Duy An
 * @generated
 */
public abstract class CaLamViecActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public CaLamViecActionableDynamicQuery() throws SystemException {
		setBaseLocalService(CaLamViecLocalServiceUtil.getService());
		setClass(CaLamViec.class);

		setClassLoader(com.minimart.portlet.cuahang.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("caLamViecId");
	}
}