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

package com.minimart.portlet.mathang.service.persistence;

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

import com.minimart.portlet.mathang.NoSuchMatHangException;
import com.minimart.portlet.mathang.model.MatHang;
import com.minimart.portlet.mathang.model.impl.MatHangImpl;
import com.minimart.portlet.mathang.model.impl.MatHangModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the mat hang service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see MatHangPersistence
 * @see MatHangUtil
 * @generated
 */
public class MatHangPersistenceImpl extends BasePersistenceImpl<MatHang>
	implements MatHangPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MatHangUtil} to access the mat hang persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MatHangImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MatHangModelImpl.ENTITY_CACHE_ENABLED,
			MatHangModelImpl.FINDER_CACHE_ENABLED, MatHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MatHangModelImpl.ENTITY_CACHE_ENABLED,
			MatHangModelImpl.FINDER_CACHE_ENABLED, MatHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MatHangModelImpl.ENTITY_CACHE_ENABLED,
			MatHangModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(MatHangModelImpl.ENTITY_CACHE_ENABLED,
			MatHangModelImpl.FINDER_CACHE_ENABLED, MatHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(MatHangModelImpl.ENTITY_CACHE_ENABLED,
			MatHangModelImpl.FINDER_CACHE_ENABLED, MatHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			MatHangModelImpl.UUID_COLUMN_BITMASK |
			MatHangModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(MatHangModelImpl.ENTITY_CACHE_ENABLED,
			MatHangModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the mat hangs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching mat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MatHang> findByUuid(String uuid) throws SystemException {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mat hangs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.MatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mat hangs
	 * @param end the upper bound of the range of mat hangs (not inclusive)
	 * @return the range of matching mat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MatHang> findByUuid(String uuid, int start, int end)
		throws SystemException {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mat hangs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.MatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mat hangs
	 * @param end the upper bound of the range of mat hangs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MatHang> findByUuid(String uuid, int start, int end,
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

		List<MatHang> list = (List<MatHang>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MatHang matHang : list) {
				if (!Validator.equals(uuid, matHang.getUuid())) {
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

			query.append(_SQL_SELECT_MATHANG_WHERE);

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
				query.append(MatHangModelImpl.ORDER_BY_JPQL);
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
					list = (List<MatHang>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MatHang>(list);
				}
				else {
					list = (List<MatHang>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first mat hang in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mat hang
	 * @throws com.minimart.portlet.mathang.NoSuchMatHangException if a matching mat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang findByUuid_First(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchMatHangException, SystemException {
		MatHang matHang = fetchByUuid_First(uuid, orderByComparator);

		if (matHang != null) {
			return matHang;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMatHangException(msg.toString());
	}

	/**
	 * Returns the first mat hang in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mat hang, or <code>null</code> if a matching mat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang fetchByUuid_First(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		List<MatHang> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mat hang in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mat hang
	 * @throws com.minimart.portlet.mathang.NoSuchMatHangException if a matching mat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang findByUuid_Last(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchMatHangException, SystemException {
		MatHang matHang = fetchByUuid_Last(uuid, orderByComparator);

		if (matHang != null) {
			return matHang;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMatHangException(msg.toString());
	}

	/**
	 * Returns the last mat hang in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mat hang, or <code>null</code> if a matching mat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang fetchByUuid_Last(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<MatHang> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mat hangs before and after the current mat hang in the ordered set where uuid = &#63;.
	 *
	 * @param matHangId the primary key of the current mat hang
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mat hang
	 * @throws com.minimart.portlet.mathang.NoSuchMatHangException if a mat hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang[] findByUuid_PrevAndNext(long matHangId, String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchMatHangException, SystemException {
		MatHang matHang = findByPrimaryKey(matHangId);

		Session session = null;

		try {
			session = openSession();

			MatHang[] array = new MatHangImpl[3];

			array[0] = getByUuid_PrevAndNext(session, matHang, uuid,
					orderByComparator, true);

			array[1] = matHang;

			array[2] = getByUuid_PrevAndNext(session, matHang, uuid,
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

	protected MatHang getByUuid_PrevAndNext(Session session, MatHang matHang,
		String uuid, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MATHANG_WHERE);

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
			query.append(MatHangModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(matHang);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MatHang> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mat hangs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid(String uuid) throws SystemException {
		for (MatHang matHang : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(matHang);
		}
	}

	/**
	 * Returns the number of mat hangs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching mat hangs
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

			query.append(_SQL_COUNT_MATHANG_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "matHang.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "matHang.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(matHang.uuid IS NULL OR matHang.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(MatHangModelImpl.ENTITY_CACHE_ENABLED,
			MatHangModelImpl.FINDER_CACHE_ENABLED, MatHangImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			MatHangModelImpl.UUID_COLUMN_BITMASK |
			MatHangModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(MatHangModelImpl.ENTITY_CACHE_ENABLED,
			MatHangModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the mat hang where uuid = &#63; and groupId = &#63; or throws a {@link com.minimart.portlet.mathang.NoSuchMatHangException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mat hang
	 * @throws com.minimart.portlet.mathang.NoSuchMatHangException if a matching mat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang findByUUID_G(String uuid, long groupId)
		throws NoSuchMatHangException, SystemException {
		MatHang matHang = fetchByUUID_G(uuid, groupId);

		if (matHang == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchMatHangException(msg.toString());
		}

		return matHang;
	}

	/**
	 * Returns the mat hang where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mat hang, or <code>null</code> if a matching mat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang fetchByUUID_G(String uuid, long groupId)
		throws SystemException {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the mat hang where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching mat hang, or <code>null</code> if a matching mat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof MatHang) {
			MatHang matHang = (MatHang)result;

			if (!Validator.equals(uuid, matHang.getUuid()) ||
					(groupId != matHang.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_MATHANG_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<MatHang> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					MatHang matHang = list.get(0);

					result = matHang;

					cacheResult(matHang);

					if ((matHang.getUuid() == null) ||
							!matHang.getUuid().equals(uuid) ||
							(matHang.getGroupId() != groupId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, matHang);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (MatHang)result;
		}
	}

	/**
	 * Removes the mat hang where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the mat hang that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang removeByUUID_G(String uuid, long groupId)
		throws NoSuchMatHangException, SystemException {
		MatHang matHang = findByUUID_G(uuid, groupId);

		return remove(matHang);
	}

	/**
	 * Returns the number of mat hangs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching mat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MATHANG_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "matHang.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "matHang.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(matHang.uuid IS NULL OR matHang.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "matHang.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(MatHangModelImpl.ENTITY_CACHE_ENABLED,
			MatHangModelImpl.FINDER_CACHE_ENABLED, MatHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(MatHangModelImpl.ENTITY_CACHE_ENABLED,
			MatHangModelImpl.FINDER_CACHE_ENABLED, MatHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			MatHangModelImpl.UUID_COLUMN_BITMASK |
			MatHangModelImpl.COMPANYID_COLUMN_BITMASK |
			MatHangModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(MatHangModelImpl.ENTITY_CACHE_ENABLED,
			MatHangModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the mat hangs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching mat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MatHang> findByUuid_C(String uuid, long companyId)
		throws SystemException {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mat hangs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.MatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mat hangs
	 * @param end the upper bound of the range of mat hangs (not inclusive)
	 * @return the range of matching mat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MatHang> findByUuid_C(String uuid, long companyId, int start,
		int end) throws SystemException {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mat hangs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.MatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mat hangs
	 * @param end the upper bound of the range of mat hangs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MatHang> findByUuid_C(String uuid, long companyId, int start,
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

		List<MatHang> list = (List<MatHang>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MatHang matHang : list) {
				if (!Validator.equals(uuid, matHang.getUuid()) ||
						(companyId != matHang.getCompanyId())) {
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

			query.append(_SQL_SELECT_MATHANG_WHERE);

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
				query.append(MatHangModelImpl.ORDER_BY_JPQL);
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
					list = (List<MatHang>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MatHang>(list);
				}
				else {
					list = (List<MatHang>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first mat hang in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mat hang
	 * @throws com.minimart.portlet.mathang.NoSuchMatHangException if a matching mat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang findByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchMatHangException, SystemException {
		MatHang matHang = fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (matHang != null) {
			return matHang;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMatHangException(msg.toString());
	}

	/**
	 * Returns the first mat hang in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mat hang, or <code>null</code> if a matching mat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<MatHang> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mat hang in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mat hang
	 * @throws com.minimart.portlet.mathang.NoSuchMatHangException if a matching mat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchMatHangException, SystemException {
		MatHang matHang = fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (matHang != null) {
			return matHang;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMatHangException(msg.toString());
	}

	/**
	 * Returns the last mat hang in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mat hang, or <code>null</code> if a matching mat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<MatHang> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mat hangs before and after the current mat hang in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param matHangId the primary key of the current mat hang
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mat hang
	 * @throws com.minimart.portlet.mathang.NoSuchMatHangException if a mat hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang[] findByUuid_C_PrevAndNext(long matHangId, String uuid,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchMatHangException, SystemException {
		MatHang matHang = findByPrimaryKey(matHangId);

		Session session = null;

		try {
			session = openSession();

			MatHang[] array = new MatHangImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, matHang, uuid,
					companyId, orderByComparator, true);

			array[1] = matHang;

			array[2] = getByUuid_C_PrevAndNext(session, matHang, uuid,
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

	protected MatHang getByUuid_C_PrevAndNext(Session session, MatHang matHang,
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

		query.append(_SQL_SELECT_MATHANG_WHERE);

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
			query.append(MatHangModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(matHang);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MatHang> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mat hangs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId)
		throws SystemException {
		for (MatHang matHang : findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(matHang);
		}
	}

	/**
	 * Returns the number of mat hangs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching mat hangs
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

			query.append(_SQL_COUNT_MATHANG_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "matHang.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "matHang.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(matHang.uuid IS NULL OR matHang.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "matHang.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NAME = new FinderPath(MatHangModelImpl.ENTITY_CACHE_ENABLED,
			MatHangModelImpl.FINDER_CACHE_ENABLED, MatHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByName",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME = new FinderPath(MatHangModelImpl.ENTITY_CACHE_ENABLED,
			MatHangModelImpl.FINDER_CACHE_ENABLED, MatHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByName",
			new String[] { String.class.getName() },
			MatHangModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NAME = new FinderPath(MatHangModelImpl.ENTITY_CACHE_ENABLED,
			MatHangModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByName",
			new String[] { String.class.getName() });

	/**
	 * Returns all the mat hangs where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching mat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MatHang> findByName(String name) throws SystemException {
		return findByName(name, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mat hangs where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.MatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of mat hangs
	 * @param end the upper bound of the range of mat hangs (not inclusive)
	 * @return the range of matching mat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MatHang> findByName(String name, int start, int end)
		throws SystemException {
		return findByName(name, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mat hangs where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.MatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of mat hangs
	 * @param end the upper bound of the range of mat hangs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MatHang> findByName(String name, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME;
			finderArgs = new Object[] { name };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NAME;
			finderArgs = new Object[] { name, start, end, orderByComparator };
		}

		List<MatHang> list = (List<MatHang>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MatHang matHang : list) {
				if (!Validator.equals(name, matHang.getName())) {
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

			query.append(_SQL_SELECT_MATHANG_WHERE);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_NAME_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NAME_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_NAME_NAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MatHangModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindName) {
					qPos.add(name);
				}

				if (!pagination) {
					list = (List<MatHang>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MatHang>(list);
				}
				else {
					list = (List<MatHang>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first mat hang in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mat hang
	 * @throws com.minimart.portlet.mathang.NoSuchMatHangException if a matching mat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang findByName_First(String name,
		OrderByComparator orderByComparator)
		throws NoSuchMatHangException, SystemException {
		MatHang matHang = fetchByName_First(name, orderByComparator);

		if (matHang != null) {
			return matHang;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMatHangException(msg.toString());
	}

	/**
	 * Returns the first mat hang in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mat hang, or <code>null</code> if a matching mat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang fetchByName_First(String name,
		OrderByComparator orderByComparator) throws SystemException {
		List<MatHang> list = findByName(name, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mat hang in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mat hang
	 * @throws com.minimart.portlet.mathang.NoSuchMatHangException if a matching mat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang findByName_Last(String name,
		OrderByComparator orderByComparator)
		throws NoSuchMatHangException, SystemException {
		MatHang matHang = fetchByName_Last(name, orderByComparator);

		if (matHang != null) {
			return matHang;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMatHangException(msg.toString());
	}

	/**
	 * Returns the last mat hang in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mat hang, or <code>null</code> if a matching mat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang fetchByName_Last(String name,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByName(name);

		if (count == 0) {
			return null;
		}

		List<MatHang> list = findByName(name, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mat hangs before and after the current mat hang in the ordered set where name = &#63;.
	 *
	 * @param matHangId the primary key of the current mat hang
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mat hang
	 * @throws com.minimart.portlet.mathang.NoSuchMatHangException if a mat hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang[] findByName_PrevAndNext(long matHangId, String name,
		OrderByComparator orderByComparator)
		throws NoSuchMatHangException, SystemException {
		MatHang matHang = findByPrimaryKey(matHangId);

		Session session = null;

		try {
			session = openSession();

			MatHang[] array = new MatHangImpl[3];

			array[0] = getByName_PrevAndNext(session, matHang, name,
					orderByComparator, true);

			array[1] = matHang;

			array[2] = getByName_PrevAndNext(session, matHang, name,
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

	protected MatHang getByName_PrevAndNext(Session session, MatHang matHang,
		String name, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MATHANG_WHERE);

		boolean bindName = false;

		if (name == null) {
			query.append(_FINDER_COLUMN_NAME_NAME_1);
		}
		else if (name.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NAME_NAME_3);
		}
		else {
			bindName = true;

			query.append(_FINDER_COLUMN_NAME_NAME_2);
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
			query.append(MatHangModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindName) {
			qPos.add(name);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(matHang);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MatHang> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mat hangs where name = &#63; from the database.
	 *
	 * @param name the name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByName(String name) throws SystemException {
		for (MatHang matHang : findByName(name, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(matHang);
		}
	}

	/**
	 * Returns the number of mat hangs where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching mat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByName(String name) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NAME;

		Object[] finderArgs = new Object[] { name };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_MATHANG_WHERE);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_NAME_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NAME_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_NAME_NAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindName) {
					qPos.add(name);
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

	private static final String _FINDER_COLUMN_NAME_NAME_1 = "matHang.name IS NULL";
	private static final String _FINDER_COLUMN_NAME_NAME_2 = "matHang.name = ?";
	private static final String _FINDER_COLUMN_NAME_NAME_3 = "(matHang.name IS NULL OR matHang.name = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_U = new FinderPath(MatHangModelImpl.ENTITY_CACHE_ENABLED,
			MatHangModelImpl.FINDER_CACHE_ENABLED, MatHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_U",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_U = new FinderPath(MatHangModelImpl.ENTITY_CACHE_ENABLED,
			MatHangModelImpl.FINDER_CACHE_ENABLED, MatHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_U",
			new String[] { Long.class.getName(), Long.class.getName() },
			MatHangModelImpl.COMPANYID_COLUMN_BITMASK |
			MatHangModelImpl.USERID_COLUMN_BITMASK |
			MatHangModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_U = new FinderPath(MatHangModelImpl.ENTITY_CACHE_ENABLED,
			MatHangModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_U",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the mat hangs where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @return the matching mat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MatHang> findByC_U(long companyId, long userId)
		throws SystemException {
		return findByC_U(companyId, userId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mat hangs where companyId = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.MatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param start the lower bound of the range of mat hangs
	 * @param end the upper bound of the range of mat hangs (not inclusive)
	 * @return the range of matching mat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MatHang> findByC_U(long companyId, long userId, int start,
		int end) throws SystemException {
		return findByC_U(companyId, userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mat hangs where companyId = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.MatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param start the lower bound of the range of mat hangs
	 * @param end the upper bound of the range of mat hangs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MatHang> findByC_U(long companyId, long userId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_U;
			finderArgs = new Object[] { companyId, userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_U;
			finderArgs = new Object[] {
					companyId, userId,
					
					start, end, orderByComparator
				};
		}

		List<MatHang> list = (List<MatHang>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MatHang matHang : list) {
				if ((companyId != matHang.getCompanyId()) ||
						(userId != matHang.getUserId())) {
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

			query.append(_SQL_SELECT_MATHANG_WHERE);

			query.append(_FINDER_COLUMN_C_U_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_U_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MatHangModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(userId);

				if (!pagination) {
					list = (List<MatHang>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MatHang>(list);
				}
				else {
					list = (List<MatHang>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first mat hang in the ordered set where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mat hang
	 * @throws com.minimart.portlet.mathang.NoSuchMatHangException if a matching mat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang findByC_U_First(long companyId, long userId,
		OrderByComparator orderByComparator)
		throws NoSuchMatHangException, SystemException {
		MatHang matHang = fetchByC_U_First(companyId, userId, orderByComparator);

		if (matHang != null) {
			return matHang;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMatHangException(msg.toString());
	}

	/**
	 * Returns the first mat hang in the ordered set where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mat hang, or <code>null</code> if a matching mat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang fetchByC_U_First(long companyId, long userId,
		OrderByComparator orderByComparator) throws SystemException {
		List<MatHang> list = findByC_U(companyId, userId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mat hang in the ordered set where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mat hang
	 * @throws com.minimart.portlet.mathang.NoSuchMatHangException if a matching mat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang findByC_U_Last(long companyId, long userId,
		OrderByComparator orderByComparator)
		throws NoSuchMatHangException, SystemException {
		MatHang matHang = fetchByC_U_Last(companyId, userId, orderByComparator);

		if (matHang != null) {
			return matHang;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMatHangException(msg.toString());
	}

	/**
	 * Returns the last mat hang in the ordered set where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mat hang, or <code>null</code> if a matching mat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang fetchByC_U_Last(long companyId, long userId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC_U(companyId, userId);

		if (count == 0) {
			return null;
		}

		List<MatHang> list = findByC_U(companyId, userId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mat hangs before and after the current mat hang in the ordered set where companyId = &#63; and userId = &#63;.
	 *
	 * @param matHangId the primary key of the current mat hang
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mat hang
	 * @throws com.minimart.portlet.mathang.NoSuchMatHangException if a mat hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang[] findByC_U_PrevAndNext(long matHangId, long companyId,
		long userId, OrderByComparator orderByComparator)
		throws NoSuchMatHangException, SystemException {
		MatHang matHang = findByPrimaryKey(matHangId);

		Session session = null;

		try {
			session = openSession();

			MatHang[] array = new MatHangImpl[3];

			array[0] = getByC_U_PrevAndNext(session, matHang, companyId,
					userId, orderByComparator, true);

			array[1] = matHang;

			array[2] = getByC_U_PrevAndNext(session, matHang, companyId,
					userId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MatHang getByC_U_PrevAndNext(Session session, MatHang matHang,
		long companyId, long userId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MATHANG_WHERE);

		query.append(_FINDER_COLUMN_C_U_COMPANYID_2);

		query.append(_FINDER_COLUMN_C_U_USERID_2);

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
			query.append(MatHangModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(matHang);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MatHang> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mat hangs where companyId = &#63; and userId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_U(long companyId, long userId)
		throws SystemException {
		for (MatHang matHang : findByC_U(companyId, userId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(matHang);
		}
	}

	/**
	 * Returns the number of mat hangs where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @return the number of matching mat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_U(long companyId, long userId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_U;

		Object[] finderArgs = new Object[] { companyId, userId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MATHANG_WHERE);

			query.append(_FINDER_COLUMN_C_U_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_U_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(userId);

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

	private static final String _FINDER_COLUMN_C_U_COMPANYID_2 = "matHang.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_U_USERID_2 = "matHang.userId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_S = new FinderPath(MatHangModelImpl.ENTITY_CACHE_ENABLED,
			MatHangModelImpl.FINDER_CACHE_ENABLED, MatHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_S",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_S = new FinderPath(MatHangModelImpl.ENTITY_CACHE_ENABLED,
			MatHangModelImpl.FINDER_CACHE_ENABLED, MatHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_S",
			new String[] { Long.class.getName(), Integer.class.getName() },
			MatHangModelImpl.COMPANYID_COLUMN_BITMASK |
			MatHangModelImpl.STATUS_COLUMN_BITMASK |
			MatHangModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_S = new FinderPath(MatHangModelImpl.ENTITY_CACHE_ENABLED,
			MatHangModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_S",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the mat hangs where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the matching mat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MatHang> findByC_S(long companyId, int status)
		throws SystemException {
		return findByC_S(companyId, status, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mat hangs where companyId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.MatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of mat hangs
	 * @param end the upper bound of the range of mat hangs (not inclusive)
	 * @return the range of matching mat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MatHang> findByC_S(long companyId, int status, int start,
		int end) throws SystemException {
		return findByC_S(companyId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mat hangs where companyId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.MatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param start the lower bound of the range of mat hangs
	 * @param end the upper bound of the range of mat hangs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MatHang> findByC_S(long companyId, int status, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_S;
			finderArgs = new Object[] { companyId, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_S;
			finderArgs = new Object[] {
					companyId, status,
					
					start, end, orderByComparator
				};
		}

		List<MatHang> list = (List<MatHang>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (MatHang matHang : list) {
				if ((companyId != matHang.getCompanyId()) ||
						(status != matHang.getStatus())) {
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

			query.append(_SQL_SELECT_MATHANG_WHERE);

			query.append(_FINDER_COLUMN_C_S_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_S_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(MatHangModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(status);

				if (!pagination) {
					list = (List<MatHang>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MatHang>(list);
				}
				else {
					list = (List<MatHang>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first mat hang in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mat hang
	 * @throws com.minimart.portlet.mathang.NoSuchMatHangException if a matching mat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang findByC_S_First(long companyId, int status,
		OrderByComparator orderByComparator)
		throws NoSuchMatHangException, SystemException {
		MatHang matHang = fetchByC_S_First(companyId, status, orderByComparator);

		if (matHang != null) {
			return matHang;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMatHangException(msg.toString());
	}

	/**
	 * Returns the first mat hang in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mat hang, or <code>null</code> if a matching mat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang fetchByC_S_First(long companyId, int status,
		OrderByComparator orderByComparator) throws SystemException {
		List<MatHang> list = findByC_S(companyId, status, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mat hang in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mat hang
	 * @throws com.minimart.portlet.mathang.NoSuchMatHangException if a matching mat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang findByC_S_Last(long companyId, int status,
		OrderByComparator orderByComparator)
		throws NoSuchMatHangException, SystemException {
		MatHang matHang = fetchByC_S_Last(companyId, status, orderByComparator);

		if (matHang != null) {
			return matHang;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("companyId=");
		msg.append(companyId);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchMatHangException(msg.toString());
	}

	/**
	 * Returns the last mat hang in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mat hang, or <code>null</code> if a matching mat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang fetchByC_S_Last(long companyId, int status,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC_S(companyId, status);

		if (count == 0) {
			return null;
		}

		List<MatHang> list = findByC_S(companyId, status, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mat hangs before and after the current mat hang in the ordered set where companyId = &#63; and status = &#63;.
	 *
	 * @param matHangId the primary key of the current mat hang
	 * @param companyId the company ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mat hang
	 * @throws com.minimart.portlet.mathang.NoSuchMatHangException if a mat hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang[] findByC_S_PrevAndNext(long matHangId, long companyId,
		int status, OrderByComparator orderByComparator)
		throws NoSuchMatHangException, SystemException {
		MatHang matHang = findByPrimaryKey(matHangId);

		Session session = null;

		try {
			session = openSession();

			MatHang[] array = new MatHangImpl[3];

			array[0] = getByC_S_PrevAndNext(session, matHang, companyId,
					status, orderByComparator, true);

			array[1] = matHang;

			array[2] = getByC_S_PrevAndNext(session, matHang, companyId,
					status, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected MatHang getByC_S_PrevAndNext(Session session, MatHang matHang,
		long companyId, int status, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MATHANG_WHERE);

		query.append(_FINDER_COLUMN_C_S_COMPANYID_2);

		query.append(_FINDER_COLUMN_C_S_STATUS_2);

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
			query.append(MatHangModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(companyId);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(matHang);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<MatHang> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mat hangs where companyId = &#63; and status = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_S(long companyId, int status)
		throws SystemException {
		for (MatHang matHang : findByC_S(companyId, status, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(matHang);
		}
	}

	/**
	 * Returns the number of mat hangs where companyId = &#63; and status = &#63;.
	 *
	 * @param companyId the company ID
	 * @param status the status
	 * @return the number of matching mat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_S(long companyId, int status) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_S;

		Object[] finderArgs = new Object[] { companyId, status };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MATHANG_WHERE);

			query.append(_FINDER_COLUMN_C_S_COMPANYID_2);

			query.append(_FINDER_COLUMN_C_S_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(companyId);

				qPos.add(status);

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

	private static final String _FINDER_COLUMN_C_S_COMPANYID_2 = "matHang.companyId = ? AND ";
	private static final String _FINDER_COLUMN_C_S_STATUS_2 = "matHang.status = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_BCODE_HD = new FinderPath(MatHangModelImpl.ENTITY_CACHE_ENABLED,
			MatHangModelImpl.FINDER_CACHE_ENABLED, MatHangImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByBCODE_HD",
			new String[] { String.class.getName(), Boolean.class.getName() },
			MatHangModelImpl.CODE_COLUMN_BITMASK |
			MatHangModelImpl.HOATDONG_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BCODE_HD = new FinderPath(MatHangModelImpl.ENTITY_CACHE_ENABLED,
			MatHangModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByBCODE_HD",
			new String[] { String.class.getName(), Boolean.class.getName() });

	/**
	 * Returns the mat hang where code = &#63; and hoatDong = &#63; or throws a {@link com.minimart.portlet.mathang.NoSuchMatHangException} if it could not be found.
	 *
	 * @param code the code
	 * @param hoatDong the hoat dong
	 * @return the matching mat hang
	 * @throws com.minimart.portlet.mathang.NoSuchMatHangException if a matching mat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang findByBCODE_HD(String code, boolean hoatDong)
		throws NoSuchMatHangException, SystemException {
		MatHang matHang = fetchByBCODE_HD(code, hoatDong);

		if (matHang == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("code=");
			msg.append(code);

			msg.append(", hoatDong=");
			msg.append(hoatDong);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchMatHangException(msg.toString());
		}

		return matHang;
	}

	/**
	 * Returns the mat hang where code = &#63; and hoatDong = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param code the code
	 * @param hoatDong the hoat dong
	 * @return the matching mat hang, or <code>null</code> if a matching mat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang fetchByBCODE_HD(String code, boolean hoatDong)
		throws SystemException {
		return fetchByBCODE_HD(code, hoatDong, true);
	}

	/**
	 * Returns the mat hang where code = &#63; and hoatDong = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param code the code
	 * @param hoatDong the hoat dong
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching mat hang, or <code>null</code> if a matching mat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang fetchByBCODE_HD(String code, boolean hoatDong,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { code, hoatDong };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_BCODE_HD,
					finderArgs, this);
		}

		if (result instanceof MatHang) {
			MatHang matHang = (MatHang)result;

			if (!Validator.equals(code, matHang.getCode()) ||
					(hoatDong != matHang.getHoatDong())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_MATHANG_WHERE);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_BCODE_HD_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_BCODE_HD_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_BCODE_HD_CODE_2);
			}

			query.append(_FINDER_COLUMN_BCODE_HD_HOATDONG_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCode) {
					qPos.add(code);
				}

				qPos.add(hoatDong);

				List<MatHang> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BCODE_HD,
						finderArgs, list);
				}
				else {
					MatHang matHang = list.get(0);

					result = matHang;

					cacheResult(matHang);

					if ((matHang.getCode() == null) ||
							!matHang.getCode().equals(code) ||
							(matHang.getHoatDong() != hoatDong)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BCODE_HD,
							finderArgs, matHang);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_BCODE_HD,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (MatHang)result;
		}
	}

	/**
	 * Removes the mat hang where code = &#63; and hoatDong = &#63; from the database.
	 *
	 * @param code the code
	 * @param hoatDong the hoat dong
	 * @return the mat hang that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang removeByBCODE_HD(String code, boolean hoatDong)
		throws NoSuchMatHangException, SystemException {
		MatHang matHang = findByBCODE_HD(code, hoatDong);

		return remove(matHang);
	}

	/**
	 * Returns the number of mat hangs where code = &#63; and hoatDong = &#63;.
	 *
	 * @param code the code
	 * @param hoatDong the hoat dong
	 * @return the number of matching mat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByBCODE_HD(String code, boolean hoatDong)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_BCODE_HD;

		Object[] finderArgs = new Object[] { code, hoatDong };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MATHANG_WHERE);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_BCODE_HD_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_BCODE_HD_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_BCODE_HD_CODE_2);
			}

			query.append(_FINDER_COLUMN_BCODE_HD_HOATDONG_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCode) {
					qPos.add(code);
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

	private static final String _FINDER_COLUMN_BCODE_HD_CODE_1 = "matHang.code IS NULL AND ";
	private static final String _FINDER_COLUMN_BCODE_HD_CODE_2 = "matHang.code = ? AND ";
	private static final String _FINDER_COLUMN_BCODE_HD_CODE_3 = "(matHang.code IS NULL OR matHang.code = '') AND ";
	private static final String _FINDER_COLUMN_BCODE_HD_HOATDONG_2 = "matHang.hoatDong = ?";

	public MatHangPersistenceImpl() {
		setModelClass(MatHang.class);
	}

	/**
	 * Caches the mat hang in the entity cache if it is enabled.
	 *
	 * @param matHang the mat hang
	 */
	@Override
	public void cacheResult(MatHang matHang) {
		EntityCacheUtil.putResult(MatHangModelImpl.ENTITY_CACHE_ENABLED,
			MatHangImpl.class, matHang.getPrimaryKey(), matHang);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { matHang.getUuid(), matHang.getGroupId() }, matHang);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BCODE_HD,
			new Object[] { matHang.getCode(), matHang.getHoatDong() }, matHang);

		matHang.resetOriginalValues();
	}

	/**
	 * Caches the mat hangs in the entity cache if it is enabled.
	 *
	 * @param matHangs the mat hangs
	 */
	@Override
	public void cacheResult(List<MatHang> matHangs) {
		for (MatHang matHang : matHangs) {
			if (EntityCacheUtil.getResult(
						MatHangModelImpl.ENTITY_CACHE_ENABLED,
						MatHangImpl.class, matHang.getPrimaryKey()) == null) {
				cacheResult(matHang);
			}
			else {
				matHang.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all mat hangs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MatHangImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MatHangImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the mat hang.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MatHang matHang) {
		EntityCacheUtil.removeResult(MatHangModelImpl.ENTITY_CACHE_ENABLED,
			MatHangImpl.class, matHang.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(matHang);
	}

	@Override
	public void clearCache(List<MatHang> matHangs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MatHang matHang : matHangs) {
			EntityCacheUtil.removeResult(MatHangModelImpl.ENTITY_CACHE_ENABLED,
				MatHangImpl.class, matHang.getPrimaryKey());

			clearUniqueFindersCache(matHang);
		}
	}

	protected void cacheUniqueFindersCache(MatHang matHang) {
		if (matHang.isNew()) {
			Object[] args = new Object[] { matHang.getUuid(), matHang.getGroupId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args, matHang);

			args = new Object[] { matHang.getCode(), matHang.getHoatDong() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_BCODE_HD, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BCODE_HD, args,
				matHang);
		}
		else {
			MatHangModelImpl matHangModelImpl = (MatHangModelImpl)matHang;

			if ((matHangModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						matHang.getUuid(), matHang.getGroupId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
					matHang);
			}

			if ((matHangModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_BCODE_HD.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						matHang.getCode(), matHang.getHoatDong()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_BCODE_HD, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_BCODE_HD, args,
					matHang);
			}
		}
	}

	protected void clearUniqueFindersCache(MatHang matHang) {
		MatHangModelImpl matHangModelImpl = (MatHangModelImpl)matHang;

		Object[] args = new Object[] { matHang.getUuid(), matHang.getGroupId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

		if ((matHangModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			args = new Object[] {
					matHangModelImpl.getOriginalUuid(),
					matHangModelImpl.getOriginalGroupId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		args = new Object[] { matHang.getCode(), matHang.getHoatDong() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BCODE_HD, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_BCODE_HD, args);

		if ((matHangModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_BCODE_HD.getColumnBitmask()) != 0) {
			args = new Object[] {
					matHangModelImpl.getOriginalCode(),
					matHangModelImpl.getOriginalHoatDong()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BCODE_HD, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_BCODE_HD, args);
		}
	}

	/**
	 * Creates a new mat hang with the primary key. Does not add the mat hang to the database.
	 *
	 * @param matHangId the primary key for the new mat hang
	 * @return the new mat hang
	 */
	@Override
	public MatHang create(long matHangId) {
		MatHang matHang = new MatHangImpl();

		matHang.setNew(true);
		matHang.setPrimaryKey(matHangId);

		String uuid = PortalUUIDUtil.generate();

		matHang.setUuid(uuid);

		return matHang;
	}

	/**
	 * Removes the mat hang with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param matHangId the primary key of the mat hang
	 * @return the mat hang that was removed
	 * @throws com.minimart.portlet.mathang.NoSuchMatHangException if a mat hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang remove(long matHangId)
		throws NoSuchMatHangException, SystemException {
		return remove((Serializable)matHangId);
	}

	/**
	 * Removes the mat hang with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mat hang
	 * @return the mat hang that was removed
	 * @throws com.minimart.portlet.mathang.NoSuchMatHangException if a mat hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang remove(Serializable primaryKey)
		throws NoSuchMatHangException, SystemException {
		Session session = null;

		try {
			session = openSession();

			MatHang matHang = (MatHang)session.get(MatHangImpl.class, primaryKey);

			if (matHang == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMatHangException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(matHang);
		}
		catch (NoSuchMatHangException nsee) {
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
	protected MatHang removeImpl(MatHang matHang) throws SystemException {
		matHang = toUnwrappedModel(matHang);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(matHang)) {
				matHang = (MatHang)session.get(MatHangImpl.class,
						matHang.getPrimaryKeyObj());
			}

			if (matHang != null) {
				session.delete(matHang);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (matHang != null) {
			clearCache(matHang);
		}

		return matHang;
	}

	@Override
	public MatHang updateImpl(
		com.minimart.portlet.mathang.model.MatHang matHang)
		throws SystemException {
		matHang = toUnwrappedModel(matHang);

		boolean isNew = matHang.isNew();

		MatHangModelImpl matHangModelImpl = (MatHangModelImpl)matHang;

		if (Validator.isNull(matHang.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			matHang.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (matHang.isNew()) {
				session.save(matHang);

				matHang.setNew(false);
			}
			else {
				session.merge(matHang);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !MatHangModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((matHangModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { matHangModelImpl.getOriginalUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { matHangModelImpl.getUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((matHangModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						matHangModelImpl.getOriginalUuid(),
						matHangModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						matHangModelImpl.getUuid(),
						matHangModelImpl.getCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((matHangModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { matHangModelImpl.getOriginalName() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAME, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME,
					args);

				args = new Object[] { matHangModelImpl.getName() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAME, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME,
					args);
			}

			if ((matHangModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_U.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						matHangModelImpl.getOriginalCompanyId(),
						matHangModelImpl.getOriginalUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_U, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_U,
					args);

				args = new Object[] {
						matHangModelImpl.getCompanyId(),
						matHangModelImpl.getUserId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_U, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_U,
					args);
			}

			if ((matHangModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						matHangModelImpl.getOriginalCompanyId(),
						matHangModelImpl.getOriginalStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_S, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_S,
					args);

				args = new Object[] {
						matHangModelImpl.getCompanyId(),
						matHangModelImpl.getStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_S, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_S,
					args);
			}
		}

		EntityCacheUtil.putResult(MatHangModelImpl.ENTITY_CACHE_ENABLED,
			MatHangImpl.class, matHang.getPrimaryKey(), matHang);

		clearUniqueFindersCache(matHang);
		cacheUniqueFindersCache(matHang);

		return matHang;
	}

	protected MatHang toUnwrappedModel(MatHang matHang) {
		if (matHang instanceof MatHangImpl) {
			return matHang;
		}

		MatHangImpl matHangImpl = new MatHangImpl();

		matHangImpl.setNew(matHang.isNew());
		matHangImpl.setPrimaryKey(matHang.getPrimaryKey());

		matHangImpl.setUuid(matHang.getUuid());
		matHangImpl.setMatHangId(matHang.getMatHangId());
		matHangImpl.setGroupId(matHang.getGroupId());
		matHangImpl.setCompanyId(matHang.getCompanyId());
		matHangImpl.setUserId(matHang.getUserId());
		matHangImpl.setUserName(matHang.getUserName());
		matHangImpl.setCreateDate(matHang.getCreateDate());
		matHangImpl.setModifiedDate(matHang.getModifiedDate());
		matHangImpl.setName(matHang.getName());
		matHangImpl.setCode(matHang.getCode());
		matHangImpl.setGiaNhap(matHang.getGiaNhap());
		matHangImpl.setStatus(matHang.getStatus());
		matHangImpl.setGiaBan(matHang.getGiaBan());
		matHangImpl.setGiaBan1(matHang.getGiaBan1());
		matHangImpl.setGiaBan2(matHang.getGiaBan2());
		matHangImpl.setGiaBan3(matHang.getGiaBan3());
		matHangImpl.setTonToiThieu(matHang.getTonToiThieu());
		matHangImpl.setTonToiDa(matHang.getTonToiDa());
		matHangImpl.setGiaVon(matHang.getGiaVon());
		matHangImpl.setHoaHong(matHang.getHoaHong());
		matHangImpl.setNhomMatHangId(matHang.getNhomMatHangId());
		matHangImpl.setDonViTinhId(matHang.getDonViTinhId());
		matHangImpl.setSize(matHang.getSize());
		matHangImpl.setImageUrl(matHang.getImageUrl());
		matHangImpl.setHoatDong(matHang.isHoatDong());

		return matHangImpl;
	}

	/**
	 * Returns the mat hang with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the mat hang
	 * @return the mat hang
	 * @throws com.minimart.portlet.mathang.NoSuchMatHangException if a mat hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMatHangException, SystemException {
		MatHang matHang = fetchByPrimaryKey(primaryKey);

		if (matHang == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMatHangException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return matHang;
	}

	/**
	 * Returns the mat hang with the primary key or throws a {@link com.minimart.portlet.mathang.NoSuchMatHangException} if it could not be found.
	 *
	 * @param matHangId the primary key of the mat hang
	 * @return the mat hang
	 * @throws com.minimart.portlet.mathang.NoSuchMatHangException if a mat hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang findByPrimaryKey(long matHangId)
		throws NoSuchMatHangException, SystemException {
		return findByPrimaryKey((Serializable)matHangId);
	}

	/**
	 * Returns the mat hang with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mat hang
	 * @return the mat hang, or <code>null</code> if a mat hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		MatHang matHang = (MatHang)EntityCacheUtil.getResult(MatHangModelImpl.ENTITY_CACHE_ENABLED,
				MatHangImpl.class, primaryKey);

		if (matHang == _nullMatHang) {
			return null;
		}

		if (matHang == null) {
			Session session = null;

			try {
				session = openSession();

				matHang = (MatHang)session.get(MatHangImpl.class, primaryKey);

				if (matHang != null) {
					cacheResult(matHang);
				}
				else {
					EntityCacheUtil.putResult(MatHangModelImpl.ENTITY_CACHE_ENABLED,
						MatHangImpl.class, primaryKey, _nullMatHang);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(MatHangModelImpl.ENTITY_CACHE_ENABLED,
					MatHangImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return matHang;
	}

	/**
	 * Returns the mat hang with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param matHangId the primary key of the mat hang
	 * @return the mat hang, or <code>null</code> if a mat hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public MatHang fetchByPrimaryKey(long matHangId) throws SystemException {
		return fetchByPrimaryKey((Serializable)matHangId);
	}

	/**
	 * Returns all the mat hangs.
	 *
	 * @return the mat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MatHang> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mat hangs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.MatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mat hangs
	 * @param end the upper bound of the range of mat hangs (not inclusive)
	 * @return the range of mat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MatHang> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mat hangs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.MatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mat hangs
	 * @param end the upper bound of the range of mat hangs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<MatHang> findAll(int start, int end,
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

		List<MatHang> list = (List<MatHang>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MATHANG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MATHANG;

				if (pagination) {
					sql = sql.concat(MatHangModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<MatHang>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<MatHang>(list);
				}
				else {
					list = (List<MatHang>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the mat hangs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (MatHang matHang : findAll()) {
			remove(matHang);
		}
	}

	/**
	 * Returns the number of mat hangs.
	 *
	 * @return the number of mat hangs
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

				Query q = session.createQuery(_SQL_COUNT_MATHANG);

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
	 * Initializes the mat hang persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.minimart.portlet.mathang.model.MatHang")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<MatHang>> listenersList = new ArrayList<ModelListener<MatHang>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<MatHang>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(MatHangImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MATHANG = "SELECT matHang FROM MatHang matHang";
	private static final String _SQL_SELECT_MATHANG_WHERE = "SELECT matHang FROM MatHang matHang WHERE ";
	private static final String _SQL_COUNT_MATHANG = "SELECT COUNT(matHang) FROM MatHang matHang";
	private static final String _SQL_COUNT_MATHANG_WHERE = "SELECT COUNT(matHang) FROM MatHang matHang WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "matHang.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MatHang exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No MatHang exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MatHangPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid", "code", "size"
			});
	private static MatHang _nullMatHang = new MatHangImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<MatHang> toCacheModel() {
				return _nullMatHangCacheModel;
			}
		};

	private static CacheModel<MatHang> _nullMatHangCacheModel = new CacheModel<MatHang>() {
			@Override
			public MatHang toEntityModel() {
				return _nullMatHang;
			}
		};
}