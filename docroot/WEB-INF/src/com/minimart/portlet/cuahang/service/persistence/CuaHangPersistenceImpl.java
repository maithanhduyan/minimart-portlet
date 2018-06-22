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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.minimart.portlet.cuahang.NoSuchCuaHangException;
import com.minimart.portlet.cuahang.model.CuaHang;
import com.minimart.portlet.cuahang.model.impl.CuaHangImpl;
import com.minimart.portlet.cuahang.model.impl.CuaHangModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the cua hang service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see CuaHangPersistence
 * @see CuaHangUtil
 * @generated
 */
public class CuaHangPersistenceImpl extends BasePersistenceImpl<CuaHang>
	implements CuaHangPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CuaHangUtil} to access the cua hang persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CuaHangImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CuaHangModelImpl.ENTITY_CACHE_ENABLED,
			CuaHangModelImpl.FINDER_CACHE_ENABLED, CuaHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CuaHangModelImpl.ENTITY_CACHE_ENABLED,
			CuaHangModelImpl.FINDER_CACHE_ENABLED, CuaHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CuaHangModelImpl.ENTITY_CACHE_ENABLED,
			CuaHangModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(CuaHangModelImpl.ENTITY_CACHE_ENABLED,
			CuaHangModelImpl.FINDER_CACHE_ENABLED, CuaHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(CuaHangModelImpl.ENTITY_CACHE_ENABLED,
			CuaHangModelImpl.FINDER_CACHE_ENABLED, CuaHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			CuaHangModelImpl.UUID_COLUMN_BITMASK |
			CuaHangModelImpl.TEN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(CuaHangModelImpl.ENTITY_CACHE_ENABLED,
			CuaHangModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the cua hangs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cua hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CuaHang> findByUuid(String uuid) throws SystemException {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cua hangs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.CuaHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cua hangs
	 * @param end the upper bound of the range of cua hangs (not inclusive)
	 * @return the range of matching cua hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CuaHang> findByUuid(String uuid, int start, int end)
		throws SystemException {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cua hangs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.CuaHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cua hangs
	 * @param end the upper bound of the range of cua hangs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cua hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CuaHang> findByUuid(String uuid, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<CuaHang> list = (List<CuaHang>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CuaHang cuaHang : list) {
				if (!Validator.equals(uuid, cuaHang.getUuid())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_CUAHANG_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CuaHangModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<CuaHang>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CuaHang>(list);
				}
				else {
					list = (List<CuaHang>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first cua hang in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cua hang
	 * @throws com.minimart.portlet.cuahang.NoSuchCuaHangException if a matching cua hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CuaHang findByUuid_First(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchCuaHangException, SystemException {
		CuaHang cuaHang = fetchByUuid_First(uuid, orderByComparator);

		if (cuaHang != null) {
			return cuaHang;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCuaHangException(msg.toString());
	}

	/**
	 * Returns the first cua hang in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cua hang, or <code>null</code> if a matching cua hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CuaHang fetchByUuid_First(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		List<CuaHang> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cua hang in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cua hang
	 * @throws com.minimart.portlet.cuahang.NoSuchCuaHangException if a matching cua hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CuaHang findByUuid_Last(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchCuaHangException, SystemException {
		CuaHang cuaHang = fetchByUuid_Last(uuid, orderByComparator);

		if (cuaHang != null) {
			return cuaHang;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCuaHangException(msg.toString());
	}

	/**
	 * Returns the last cua hang in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cua hang, or <code>null</code> if a matching cua hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CuaHang fetchByUuid_Last(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CuaHang> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cua hangs before and after the current cua hang in the ordered set where uuid = &#63;.
	 *
	 * @param cuaHangId the primary key of the current cua hang
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cua hang
	 * @throws com.minimart.portlet.cuahang.NoSuchCuaHangException if a cua hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CuaHang[] findByUuid_PrevAndNext(long cuaHangId, String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchCuaHangException, SystemException {
		CuaHang cuaHang = findByPrimaryKey(cuaHangId);

		Session session = null;

		try {
			session = openSession();

			CuaHang[] array = new CuaHangImpl[3];

			array[0] = getByUuid_PrevAndNext(session, cuaHang, uuid,
					orderByComparator, true);

			array[1] = cuaHang;

			array[2] = getByUuid_PrevAndNext(session, cuaHang, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CuaHang getByUuid_PrevAndNext(Session session, CuaHang cuaHang,
		String uuid, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CUAHANG_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(CuaHangModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cuaHang);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CuaHang> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cua hangs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid(String uuid) throws SystemException {
		for (CuaHang cuaHang : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(cuaHang);
		}
	}

	/**
	 * Returns the number of cua hangs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cua hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUuid(String uuid) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CUAHANG_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "cuaHang.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "cuaHang.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(cuaHang.uuid IS NULL OR cuaHang.uuid = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(CuaHangModelImpl.ENTITY_CACHE_ENABLED,
			CuaHangModelImpl.FINDER_CACHE_ENABLED, CuaHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(CuaHangModelImpl.ENTITY_CACHE_ENABLED,
			CuaHangModelImpl.FINDER_CACHE_ENABLED, CuaHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			CuaHangModelImpl.UUID_COLUMN_BITMASK |
			CuaHangModelImpl.COMPANYID_COLUMN_BITMASK |
			CuaHangModelImpl.TEN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(CuaHangModelImpl.ENTITY_CACHE_ENABLED,
			CuaHangModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the cua hangs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cua hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CuaHang> findByUuid_C(String uuid, long companyId)
		throws SystemException {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cua hangs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.CuaHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cua hangs
	 * @param end the upper bound of the range of cua hangs (not inclusive)
	 * @return the range of matching cua hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CuaHang> findByUuid_C(String uuid, long companyId, int start,
		int end) throws SystemException {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cua hangs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.CuaHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cua hangs
	 * @param end the upper bound of the range of cua hangs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cua hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CuaHang> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<CuaHang> list = (List<CuaHang>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CuaHang cuaHang : list) {
				if (!Validator.equals(uuid, cuaHang.getUuid()) ||
						(companyId != cuaHang.getCompanyId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_CUAHANG_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CuaHangModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<CuaHang>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CuaHang>(list);
				}
				else {
					list = (List<CuaHang>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first cua hang in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cua hang
	 * @throws com.minimart.portlet.cuahang.NoSuchCuaHangException if a matching cua hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CuaHang findByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchCuaHangException, SystemException {
		CuaHang cuaHang = fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (cuaHang != null) {
			return cuaHang;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCuaHangException(msg.toString());
	}

	/**
	 * Returns the first cua hang in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cua hang, or <code>null</code> if a matching cua hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CuaHang fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<CuaHang> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cua hang in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cua hang
	 * @throws com.minimart.portlet.cuahang.NoSuchCuaHangException if a matching cua hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CuaHang findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchCuaHangException, SystemException {
		CuaHang cuaHang = fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (cuaHang != null) {
			return cuaHang;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCuaHangException(msg.toString());
	}

	/**
	 * Returns the last cua hang in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cua hang, or <code>null</code> if a matching cua hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CuaHang fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<CuaHang> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cua hangs before and after the current cua hang in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param cuaHangId the primary key of the current cua hang
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cua hang
	 * @throws com.minimart.portlet.cuahang.NoSuchCuaHangException if a cua hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CuaHang[] findByUuid_C_PrevAndNext(long cuaHangId, String uuid,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchCuaHangException, SystemException {
		CuaHang cuaHang = findByPrimaryKey(cuaHangId);

		Session session = null;

		try {
			session = openSession();

			CuaHang[] array = new CuaHangImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, cuaHang, uuid,
					companyId, orderByComparator, true);

			array[1] = cuaHang;

			array[2] = getByUuid_C_PrevAndNext(session, cuaHang, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CuaHang getByUuid_C_PrevAndNext(Session session, CuaHang cuaHang,
		String uuid, long companyId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CUAHANG_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(CuaHangModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cuaHang);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CuaHang> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cua hangs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId)
		throws SystemException {
		for (CuaHang cuaHang : findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(cuaHang);
		}
	}

	/**
	 * Returns the number of cua hangs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cua hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CUAHANG_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "cuaHang.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "cuaHang.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(cuaHang.uuid IS NULL OR cuaHang.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "cuaHang.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_HD = new FinderPath(CuaHangModelImpl.ENTITY_CACHE_ENABLED,
			CuaHangModelImpl.FINDER_CACHE_ENABLED, CuaHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTEN_HD",
			new String[] {
				String.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HD =
		new FinderPath(CuaHangModelImpl.ENTITY_CACHE_ENABLED,
			CuaHangModelImpl.FINDER_CACHE_ENABLED, CuaHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTEN_HD",
			new String[] { String.class.getName(), Boolean.class.getName() },
			CuaHangModelImpl.TEN_COLUMN_BITMASK |
			CuaHangModelImpl.HOATDONG_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEN_HD = new FinderPath(CuaHangModelImpl.ENTITY_CACHE_ENABLED,
			CuaHangModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTEN_HD",
			new String[] { String.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the cua hangs where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @return the matching cua hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CuaHang> findByTEN_HD(String ten, boolean hoatDong)
		throws SystemException {
		return findByTEN_HD(ten, hoatDong, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cua hangs where ten = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.CuaHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of cua hangs
	 * @param end the upper bound of the range of cua hangs (not inclusive)
	 * @return the range of matching cua hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CuaHang> findByTEN_HD(String ten, boolean hoatDong, int start,
		int end) throws SystemException {
		return findByTEN_HD(ten, hoatDong, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cua hangs where ten = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.CuaHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of cua hangs
	 * @param end the upper bound of the range of cua hangs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cua hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CuaHang> findByTEN_HD(String ten, boolean hoatDong, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HD;
			finderArgs = new Object[] { ten, hoatDong };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_HD;
			finderArgs = new Object[] {
					ten, hoatDong,
					
					start, end, orderByComparator
				};
		}

		List<CuaHang> list = (List<CuaHang>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CuaHang cuaHang : list) {
				if (!Validator.equals(ten, cuaHang.getTen()) ||
						(hoatDong != cuaHang.getHoatDong())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_CUAHANG_WHERE);

			boolean bindTen = false;

			if (ten == null) {
				query.append(_FINDER_COLUMN_TEN_HD_TEN_1);
			}
			else if (ten.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_HD_TEN_3);
			}
			else {
				bindTen = true;

				query.append(_FINDER_COLUMN_TEN_HD_TEN_2);
			}

			query.append(_FINDER_COLUMN_TEN_HD_HOATDONG_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CuaHangModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTen) {
					qPos.add(ten);
				}

				qPos.add(hoatDong);

				if (!pagination) {
					list = (List<CuaHang>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CuaHang>(list);
				}
				else {
					list = (List<CuaHang>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first cua hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cua hang
	 * @throws com.minimart.portlet.cuahang.NoSuchCuaHangException if a matching cua hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CuaHang findByTEN_HD_First(String ten, boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchCuaHangException, SystemException {
		CuaHang cuaHang = fetchByTEN_HD_First(ten, hoatDong, orderByComparator);

		if (cuaHang != null) {
			return cuaHang;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCuaHangException(msg.toString());
	}

	/**
	 * Returns the first cua hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cua hang, or <code>null</code> if a matching cua hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CuaHang fetchByTEN_HD_First(String ten, boolean hoatDong,
		OrderByComparator orderByComparator) throws SystemException {
		List<CuaHang> list = findByTEN_HD(ten, hoatDong, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cua hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cua hang
	 * @throws com.minimart.portlet.cuahang.NoSuchCuaHangException if a matching cua hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CuaHang findByTEN_HD_Last(String ten, boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchCuaHangException, SystemException {
		CuaHang cuaHang = fetchByTEN_HD_Last(ten, hoatDong, orderByComparator);

		if (cuaHang != null) {
			return cuaHang;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCuaHangException(msg.toString());
	}

	/**
	 * Returns the last cua hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cua hang, or <code>null</code> if a matching cua hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CuaHang fetchByTEN_HD_Last(String ten, boolean hoatDong,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTEN_HD(ten, hoatDong);

		if (count == 0) {
			return null;
		}

		List<CuaHang> list = findByTEN_HD(ten, hoatDong, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cua hangs before and after the current cua hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param cuaHangId the primary key of the current cua hang
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cua hang
	 * @throws com.minimart.portlet.cuahang.NoSuchCuaHangException if a cua hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CuaHang[] findByTEN_HD_PrevAndNext(long cuaHangId, String ten,
		boolean hoatDong, OrderByComparator orderByComparator)
		throws NoSuchCuaHangException, SystemException {
		CuaHang cuaHang = findByPrimaryKey(cuaHangId);

		Session session = null;

		try {
			session = openSession();

			CuaHang[] array = new CuaHangImpl[3];

			array[0] = getByTEN_HD_PrevAndNext(session, cuaHang, ten, hoatDong,
					orderByComparator, true);

			array[1] = cuaHang;

			array[2] = getByTEN_HD_PrevAndNext(session, cuaHang, ten, hoatDong,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CuaHang getByTEN_HD_PrevAndNext(Session session, CuaHang cuaHang,
		String ten, boolean hoatDong, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CUAHANG_WHERE);

		boolean bindTen = false;

		if (ten == null) {
			query.append(_FINDER_COLUMN_TEN_HD_TEN_1);
		}
		else if (ten.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TEN_HD_TEN_3);
		}
		else {
			bindTen = true;

			query.append(_FINDER_COLUMN_TEN_HD_TEN_2);
		}

		query.append(_FINDER_COLUMN_TEN_HD_HOATDONG_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(CuaHangModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindTen) {
			qPos.add(ten);
		}

		qPos.add(hoatDong);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(cuaHang);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CuaHang> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cua hangs where ten = &#63; and hoatDong = &#63; from the database.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTEN_HD(String ten, boolean hoatDong)
		throws SystemException {
		for (CuaHang cuaHang : findByTEN_HD(ten, hoatDong, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(cuaHang);
		}
	}

	/**
	 * Returns the number of cua hangs where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @return the number of matching cua hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTEN_HD(String ten, boolean hoatDong)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TEN_HD;

		Object[] finderArgs = new Object[] { ten, hoatDong };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CUAHANG_WHERE);

			boolean bindTen = false;

			if (ten == null) {
				query.append(_FINDER_COLUMN_TEN_HD_TEN_1);
			}
			else if (ten.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_HD_TEN_3);
			}
			else {
				bindTen = true;

				query.append(_FINDER_COLUMN_TEN_HD_TEN_2);
			}

			query.append(_FINDER_COLUMN_TEN_HD_HOATDONG_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTen) {
					qPos.add(ten);
				}

				qPos.add(hoatDong);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_TEN_HD_TEN_1 = "cuaHang.ten IS NULL AND ";
	private static final String _FINDER_COLUMN_TEN_HD_TEN_2 = "cuaHang.ten = ? AND ";
	private static final String _FINDER_COLUMN_TEN_HD_TEN_3 = "(cuaHang.ten IS NULL OR cuaHang.ten = '') AND ";
	private static final String _FINDER_COLUMN_TEN_HD_HOATDONG_2 = "cuaHang.hoatDong = ?";

	public CuaHangPersistenceImpl() {
		setModelClass(CuaHang.class);
	}

	/**
	 * Caches the cua hang in the entity cache if it is enabled.
	 *
	 * @param cuaHang the cua hang
	 */
	@Override
	public void cacheResult(CuaHang cuaHang) {
		EntityCacheUtil.putResult(CuaHangModelImpl.ENTITY_CACHE_ENABLED,
			CuaHangImpl.class, cuaHang.getPrimaryKey(), cuaHang);

		cuaHang.resetOriginalValues();
	}

	/**
	 * Caches the cua hangs in the entity cache if it is enabled.
	 *
	 * @param cuaHangs the cua hangs
	 */
	@Override
	public void cacheResult(List<CuaHang> cuaHangs) {
		for (CuaHang cuaHang : cuaHangs) {
			if (EntityCacheUtil.getResult(
						CuaHangModelImpl.ENTITY_CACHE_ENABLED,
						CuaHangImpl.class, cuaHang.getPrimaryKey()) == null) {
				cacheResult(cuaHang);
			}
			else {
				cuaHang.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all cua hangs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CuaHangImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CuaHangImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the cua hang.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CuaHang cuaHang) {
		EntityCacheUtil.removeResult(CuaHangModelImpl.ENTITY_CACHE_ENABLED,
			CuaHangImpl.class, cuaHang.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CuaHang> cuaHangs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CuaHang cuaHang : cuaHangs) {
			EntityCacheUtil.removeResult(CuaHangModelImpl.ENTITY_CACHE_ENABLED,
				CuaHangImpl.class, cuaHang.getPrimaryKey());
		}
	}

	/**
	 * Creates a new cua hang with the primary key. Does not add the cua hang to the database.
	 *
	 * @param cuaHangId the primary key for the new cua hang
	 * @return the new cua hang
	 */
	@Override
	public CuaHang create(long cuaHangId) {
		CuaHang cuaHang = new CuaHangImpl();

		cuaHang.setNew(true);
		cuaHang.setPrimaryKey(cuaHangId);

		String uuid = PortalUUIDUtil.generate();

		cuaHang.setUuid(uuid);

		return cuaHang;
	}

	/**
	 * Removes the cua hang with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cuaHangId the primary key of the cua hang
	 * @return the cua hang that was removed
	 * @throws com.minimart.portlet.cuahang.NoSuchCuaHangException if a cua hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CuaHang remove(long cuaHangId)
		throws NoSuchCuaHangException, SystemException {
		return remove((Serializable)cuaHangId);
	}

	/**
	 * Removes the cua hang with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cua hang
	 * @return the cua hang that was removed
	 * @throws com.minimart.portlet.cuahang.NoSuchCuaHangException if a cua hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CuaHang remove(Serializable primaryKey)
		throws NoSuchCuaHangException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CuaHang cuaHang = (CuaHang)session.get(CuaHangImpl.class, primaryKey);

			if (cuaHang == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCuaHangException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(cuaHang);
		}
		catch (NoSuchCuaHangException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected CuaHang removeImpl(CuaHang cuaHang) throws SystemException {
		cuaHang = toUnwrappedModel(cuaHang);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cuaHang)) {
				cuaHang = (CuaHang)session.get(CuaHangImpl.class,
						cuaHang.getPrimaryKeyObj());
			}

			if (cuaHang != null) {
				session.delete(cuaHang);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (cuaHang != null) {
			clearCache(cuaHang);
		}

		return cuaHang;
	}

	@Override
	public CuaHang updateImpl(
		com.minimart.portlet.cuahang.model.CuaHang cuaHang)
		throws SystemException {
		cuaHang = toUnwrappedModel(cuaHang);

		boolean isNew = cuaHang.isNew();

		CuaHangModelImpl cuaHangModelImpl = (CuaHangModelImpl)cuaHang;

		if (Validator.isNull(cuaHang.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			cuaHang.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (cuaHang.isNew()) {
				session.save(cuaHang);

				cuaHang.setNew(false);
			}
			else {
				session.merge(cuaHang);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CuaHangModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((cuaHangModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { cuaHangModelImpl.getOriginalUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { cuaHangModelImpl.getUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((cuaHangModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cuaHangModelImpl.getOriginalUuid(),
						cuaHangModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						cuaHangModelImpl.getUuid(),
						cuaHangModelImpl.getCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((cuaHangModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HD.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						cuaHangModelImpl.getOriginalTen(),
						cuaHangModelImpl.getOriginalHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_HD, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HD,
					args);

				args = new Object[] {
						cuaHangModelImpl.getTen(),
						cuaHangModelImpl.getHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_HD, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HD,
					args);
			}
		}

		EntityCacheUtil.putResult(CuaHangModelImpl.ENTITY_CACHE_ENABLED,
			CuaHangImpl.class, cuaHang.getPrimaryKey(), cuaHang);

		return cuaHang;
	}

	protected CuaHang toUnwrappedModel(CuaHang cuaHang) {
		if (cuaHang instanceof CuaHangImpl) {
			return cuaHang;
		}

		CuaHangImpl cuaHangImpl = new CuaHangImpl();

		cuaHangImpl.setNew(cuaHang.isNew());
		cuaHangImpl.setPrimaryKey(cuaHang.getPrimaryKey());

		cuaHangImpl.setUuid(cuaHang.getUuid());
		cuaHangImpl.setCuaHangId(cuaHang.getCuaHangId());
		cuaHangImpl.setCompanyId(cuaHang.getCompanyId());
		cuaHangImpl.setUserId(cuaHang.getUserId());
		cuaHangImpl.setUserName(cuaHang.getUserName());
		cuaHangImpl.setCreateDate(cuaHang.getCreateDate());
		cuaHangImpl.setModifiedDate(cuaHang.getModifiedDate());
		cuaHangImpl.setTen(cuaHang.getTen());
		cuaHangImpl.setGioMoCua(cuaHang.getGioMoCua());
		cuaHangImpl.setGioDongCua(cuaHang.getGioDongCua());
		cuaHangImpl.setHoatDong(cuaHang.isHoatDong());
		cuaHangImpl.setUuTien(cuaHang.getUuTien());
		cuaHangImpl.setDiaChi(cuaHang.getDiaChi());
		cuaHangImpl.setDienThoai(cuaHang.getDienThoai());
		cuaHangImpl.setKhoHangId(cuaHang.getKhoHangId());

		return cuaHangImpl;
	}

	/**
	 * Returns the cua hang with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the cua hang
	 * @return the cua hang
	 * @throws com.minimart.portlet.cuahang.NoSuchCuaHangException if a cua hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CuaHang findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCuaHangException, SystemException {
		CuaHang cuaHang = fetchByPrimaryKey(primaryKey);

		if (cuaHang == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCuaHangException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return cuaHang;
	}

	/**
	 * Returns the cua hang with the primary key or throws a {@link com.minimart.portlet.cuahang.NoSuchCuaHangException} if it could not be found.
	 *
	 * @param cuaHangId the primary key of the cua hang
	 * @return the cua hang
	 * @throws com.minimart.portlet.cuahang.NoSuchCuaHangException if a cua hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CuaHang findByPrimaryKey(long cuaHangId)
		throws NoSuchCuaHangException, SystemException {
		return findByPrimaryKey((Serializable)cuaHangId);
	}

	/**
	 * Returns the cua hang with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cua hang
	 * @return the cua hang, or <code>null</code> if a cua hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CuaHang fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CuaHang cuaHang = (CuaHang)EntityCacheUtil.getResult(CuaHangModelImpl.ENTITY_CACHE_ENABLED,
				CuaHangImpl.class, primaryKey);

		if (cuaHang == _nullCuaHang) {
			return null;
		}

		if (cuaHang == null) {
			Session session = null;

			try {
				session = openSession();

				cuaHang = (CuaHang)session.get(CuaHangImpl.class, primaryKey);

				if (cuaHang != null) {
					cacheResult(cuaHang);
				}
				else {
					EntityCacheUtil.putResult(CuaHangModelImpl.ENTITY_CACHE_ENABLED,
						CuaHangImpl.class, primaryKey, _nullCuaHang);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CuaHangModelImpl.ENTITY_CACHE_ENABLED,
					CuaHangImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return cuaHang;
	}

	/**
	 * Returns the cua hang with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cuaHangId the primary key of the cua hang
	 * @return the cua hang, or <code>null</code> if a cua hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CuaHang fetchByPrimaryKey(long cuaHangId) throws SystemException {
		return fetchByPrimaryKey((Serializable)cuaHangId);
	}

	/**
	 * Returns all the cua hangs.
	 *
	 * @return the cua hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CuaHang> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cua hangs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.CuaHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cua hangs
	 * @param end the upper bound of the range of cua hangs (not inclusive)
	 * @return the range of cua hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CuaHang> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cua hangs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.cuahang.model.impl.CuaHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cua hangs
	 * @param end the upper bound of the range of cua hangs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cua hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CuaHang> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<CuaHang> list = (List<CuaHang>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CUAHANG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CUAHANG;

				if (pagination) {
					sql = sql.concat(CuaHangModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CuaHang>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CuaHang>(list);
				}
				else {
					list = (List<CuaHang>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the cua hangs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CuaHang cuaHang : findAll()) {
			remove(cuaHang);
		}
	}

	/**
	 * Returns the number of cua hangs.
	 *
	 * @return the number of cua hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CUAHANG);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the cua hang persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.minimart.portlet.cuahang.model.CuaHang")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CuaHang>> listenersList = new ArrayList<ModelListener<CuaHang>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CuaHang>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(CuaHangImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CUAHANG = "SELECT cuaHang FROM CuaHang cuaHang";
	private static final String _SQL_SELECT_CUAHANG_WHERE = "SELECT cuaHang FROM CuaHang cuaHang WHERE ";
	private static final String _SQL_COUNT_CUAHANG = "SELECT COUNT(cuaHang) FROM CuaHang cuaHang";
	private static final String _SQL_COUNT_CUAHANG_WHERE = "SELECT COUNT(cuaHang) FROM CuaHang cuaHang WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "cuaHang.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CuaHang exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CuaHang exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CuaHangPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
	private static CuaHang _nullCuaHang = new CuaHangImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CuaHang> toCacheModel() {
				return _nullCuaHangCacheModel;
			}
		};

	private static CacheModel<CuaHang> _nullCuaHangCacheModel = new CacheModel<CuaHang>() {
			@Override
			public CuaHang toEntityModel() {
				return _nullCuaHang;
			}
		};
}