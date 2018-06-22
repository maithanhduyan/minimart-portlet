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

package com.minimart.portlet.cuahang.model;

import com.liferay.portal.kernel.util.Accessor;
import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the CuaHang service. Represents a row in the &quot;minimart_cuahang&quot; database table, with each column mapped to a property of this class.
 *
 * @author Mai Thành Duy An
 * @see CuaHangModel
 * @see com.minimart.portlet.cuahang.model.impl.CuaHangImpl
 * @see com.minimart.portlet.cuahang.model.impl.CuaHangModelImpl
 * @generated
 */
public interface CuaHang extends CuaHangModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.minimart.portlet.cuahang.model.impl.CuaHangImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CuaHang, String> UUID_ACCESSOR = new Accessor<CuaHang, String>() {
			@Override
			public String get(CuaHang cuaHang) {
				return cuaHang.getUuid();
			}
		};
}