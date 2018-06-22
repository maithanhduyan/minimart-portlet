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

package com.minimart.portlet.danhmucchung.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.minimart.portlet.danhmucchung.model.Duong;
import com.minimart.portlet.danhmucchung.service.DuongLocalServiceUtil;

/**
 * @author Mai Thành Duy An
 * @generated
 */
public abstract class DuongActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public DuongActionableDynamicQuery() throws SystemException {
		setBaseLocalService(DuongLocalServiceUtil.getService());
		setClass(Duong.class);

		setClassLoader(com.minimart.portlet.danhmucchung.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("duongId");
	}
}