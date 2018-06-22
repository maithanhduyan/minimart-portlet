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

package com.minimart.portlet.cuahang.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.minimart.portlet.cuahang.model.CaLamViec;
import com.minimart.portlet.cuahang.service.CaLamViecLocalServiceUtil;

/**
 * The extended model base implementation for the CaLamViec service. Represents a row in the &quot;minimart_calamviec&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CaLamViecImpl}.
 * </p>
 *
 * @author Mai Thành Duy An
 * @see CaLamViecImpl
 * @see com.minimart.portlet.cuahang.model.CaLamViec
 * @generated
 */
public abstract class CaLamViecBaseImpl extends CaLamViecModelImpl
	implements CaLamViec {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a ca lam viec model instance should use the {@link CaLamViec} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CaLamViecLocalServiceUtil.addCaLamViec(this);
		}
		else {
			CaLamViecLocalServiceUtil.updateCaLamViec(this);
		}
	}
}