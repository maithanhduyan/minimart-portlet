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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.minimart.portlet.mathang.NoSuchNhomMatHangException;
import com.minimart.portlet.mathang.model.NhomMatHang;
import com.minimart.portlet.mathang.model.impl.NhomMatHangImpl;
import com.minimart.portlet.mathang.model.impl.NhomMatHangModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the nhom mat hang service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see NhomMatHangPersistence
 * @see NhomMatHangUtil
 * @generated
 */
public class NhomMatHangPersistenceImpl extends BasePersistenceImpl<NhomMatHang>
	implements NhomMatHangPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link NhomMatHangUtil} to access the nhom mat hang persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = NhomMatHangImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(NhomMatHangModelImpl.ENTITY_CACHE_ENABLED,
			NhomMatHangModelImpl.FINDER_CACHE_ENABLED, NhomMatHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(NhomMatHangModelImpl.ENTITY_CACHE_ENABLED,
			NhomMatHangModelImpl.FINDER_CACHE_ENABLED, NhomMatHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(NhomMatHangModelImpl.ENTITY_CACHE_ENABLED,
			NhomMatHangModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NAME = new FinderPath(NhomMatHangModelImpl.ENTITY_CACHE_ENABLED,
			NhomMatHangModelImpl.FINDER_CACHE_ENABLED, NhomMatHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByName",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME = new FinderPath(NhomMatHangModelImpl.ENTITY_CACHE_ENABLED,
			NhomMatHangModelImpl.FINDER_CACHE_ENABLED, NhomMatHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByName",
			new String[] { String.class.getName() },
			NhomMatHangModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NAME = new FinderPath(NhomMatHangModelImpl.ENTITY_CACHE_ENABLED,
			NhomMatHangModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByName",
			new String[] { String.class.getName() });

	/**
	 * Returns all the nhom mat hangs where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching nhom mat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhomMatHang> findByName(String name) throws SystemException {
		return findByName(name, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the nhom mat hangs where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.NhomMatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of nhom mat hangs
	 * @param end the upper bound of the range of nhom mat hangs (not inclusive)
	 * @return the range of matching nhom mat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhomMatHang> findByName(String name, int start, int end)
		throws SystemException {
		return findByName(name, start, end, null);
	}

	/**
	 * Returns an ordered range of all the nhom mat hangs where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.NhomMatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of nhom mat hangs
	 * @param end the upper bound of the range of nhom mat hangs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching nhom mat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhomMatHang> findByName(String name, int start, int end,
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

		List<NhomMatHang> list = (List<NhomMatHang>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (NhomMatHang nhomMatHang : list) {
				if (!Validator.equals(name, nhomMatHang.getName())) {
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

			query.append(_SQL_SELECT_NHOMMATHANG_WHERE);

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
				query.append(NhomMatHangModelImpl.ORDER_BY_JPQL);
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
					list = (List<NhomMatHang>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NhomMatHang>(list);
				}
				else {
					list = (List<NhomMatHang>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first nhom mat hang in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nhom mat hang
	 * @throws com.minimart.portlet.mathang.NoSuchNhomMatHangException if a matching nhom mat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomMatHang findByName_First(String name,
		OrderByComparator orderByComparator)
		throws NoSuchNhomMatHangException, SystemException {
		NhomMatHang nhomMatHang = fetchByName_First(name, orderByComparator);

		if (nhomMatHang != null) {
			return nhomMatHang;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNhomMatHangException(msg.toString());
	}

	/**
	 * Returns the first nhom mat hang in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nhom mat hang, or <code>null</code> if a matching nhom mat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomMatHang fetchByName_First(String name,
		OrderByComparator orderByComparator) throws SystemException {
		List<NhomMatHang> list = findByName(name, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last nhom mat hang in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nhom mat hang
	 * @throws com.minimart.portlet.mathang.NoSuchNhomMatHangException if a matching nhom mat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomMatHang findByName_Last(String name,
		OrderByComparator orderByComparator)
		throws NoSuchNhomMatHangException, SystemException {
		NhomMatHang nhomMatHang = fetchByName_Last(name, orderByComparator);

		if (nhomMatHang != null) {
			return nhomMatHang;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNhomMatHangException(msg.toString());
	}

	/**
	 * Returns the last nhom mat hang in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nhom mat hang, or <code>null</code> if a matching nhom mat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomMatHang fetchByName_Last(String name,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByName(name);

		if (count == 0) {
			return null;
		}

		List<NhomMatHang> list = findByName(name, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the nhom mat hangs before and after the current nhom mat hang in the ordered set where name = &#63;.
	 *
	 * @param nhomMatHangId the primary key of the current nhom mat hang
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next nhom mat hang
	 * @throws com.minimart.portlet.mathang.NoSuchNhomMatHangException if a nhom mat hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomMatHang[] findByName_PrevAndNext(long nhomMatHangId,
		String name, OrderByComparator orderByComparator)
		throws NoSuchNhomMatHangException, SystemException {
		NhomMatHang nhomMatHang = findByPrimaryKey(nhomMatHangId);

		Session session = null;

		try {
			session = openSession();

			NhomMatHang[] array = new NhomMatHangImpl[3];

			array[0] = getByName_PrevAndNext(session, nhomMatHang, name,
					orderByComparator, true);

			array[1] = nhomMatHang;

			array[2] = getByName_PrevAndNext(session, nhomMatHang, name,
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

	protected NhomMatHang getByName_PrevAndNext(Session session,
		NhomMatHang nhomMatHang, String name,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_NHOMMATHANG_WHERE);

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
			query.append(NhomMatHangModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(nhomMatHang);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<NhomMatHang> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the nhom mat hangs where name = &#63; from the database.
	 *
	 * @param name the name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByName(String name) throws SystemException {
		for (NhomMatHang nhomMatHang : findByName(name, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(nhomMatHang);
		}
	}

	/**
	 * Returns the number of nhom mat hangs where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching nhom mat hangs
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

			query.append(_SQL_COUNT_NHOMMATHANG_WHERE);

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

	private static final String _FINDER_COLUMN_NAME_NAME_1 = "nhomMatHang.name IS NULL";
	private static final String _FINDER_COLUMN_NAME_NAME_2 = "nhomMatHang.name = ?";
	private static final String _FINDER_COLUMN_NAME_NAME_3 = "(nhomMatHang.name IS NULL OR nhomMatHang.name = '')";

	public NhomMatHangPersistenceImpl() {
		setModelClass(NhomMatHang.class);
	}

	/**
	 * Caches the nhom mat hang in the entity cache if it is enabled.
	 *
	 * @param nhomMatHang the nhom mat hang
	 */
	@Override
	public void cacheResult(NhomMatHang nhomMatHang) {
		EntityCacheUtil.putResult(NhomMatHangModelImpl.ENTITY_CACHE_ENABLED,
			NhomMatHangImpl.class, nhomMatHang.getPrimaryKey(), nhomMatHang);

		nhomMatHang.resetOriginalValues();
	}

	/**
	 * Caches the nhom mat hangs in the entity cache if it is enabled.
	 *
	 * @param nhomMatHangs the nhom mat hangs
	 */
	@Override
	public void cacheResult(List<NhomMatHang> nhomMatHangs) {
		for (NhomMatHang nhomMatHang : nhomMatHangs) {
			if (EntityCacheUtil.getResult(
						NhomMatHangModelImpl.ENTITY_CACHE_ENABLED,
						NhomMatHangImpl.class, nhomMatHang.getPrimaryKey()) == null) {
				cacheResult(nhomMatHang);
			}
			else {
				nhomMatHang.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all nhom mat hangs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(NhomMatHangImpl.class.getName());
		}

		EntityCacheUtil.clearCache(NhomMatHangImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the nhom mat hang.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NhomMatHang nhomMatHang) {
		EntityCacheUtil.removeResult(NhomMatHangModelImpl.ENTITY_CACHE_ENABLED,
			NhomMatHangImpl.class, nhomMatHang.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<NhomMatHang> nhomMatHangs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (NhomMatHang nhomMatHang : nhomMatHangs) {
			EntityCacheUtil.removeResult(NhomMatHangModelImpl.ENTITY_CACHE_ENABLED,
				NhomMatHangImpl.class, nhomMatHang.getPrimaryKey());
		}
	}

	/**
	 * Creates a new nhom mat hang with the primary key. Does not add the nhom mat hang to the database.
	 *
	 * @param nhomMatHangId the primary key for the new nhom mat hang
	 * @return the new nhom mat hang
	 */
	@Override
	public NhomMatHang create(long nhomMatHangId) {
		NhomMatHang nhomMatHang = new NhomMatHangImpl();

		nhomMatHang.setNew(true);
		nhomMatHang.setPrimaryKey(nhomMatHangId);

		return nhomMatHang;
	}

	/**
	 * Removes the nhom mat hang with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param nhomMatHangId the primary key of the nhom mat hang
	 * @return the nhom mat hang that was removed
	 * @throws com.minimart.portlet.mathang.NoSuchNhomMatHangException if a nhom mat hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomMatHang remove(long nhomMatHangId)
		throws NoSuchNhomMatHangException, SystemException {
		return remove((Serializable)nhomMatHangId);
	}

	/**
	 * Removes the nhom mat hang with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the nhom mat hang
	 * @return the nhom mat hang that was removed
	 * @throws com.minimart.portlet.mathang.NoSuchNhomMatHangException if a nhom mat hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomMatHang remove(Serializable primaryKey)
		throws NoSuchNhomMatHangException, SystemException {
		Session session = null;

		try {
			session = openSession();

			NhomMatHang nhomMatHang = (NhomMatHang)session.get(NhomMatHangImpl.class,
					primaryKey);

			if (nhomMatHang == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNhomMatHangException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(nhomMatHang);
		}
		catch (NoSuchNhomMatHangException nsee) {
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
	protected NhomMatHang removeImpl(NhomMatHang nhomMatHang)
		throws SystemException {
		nhomMatHang = toUnwrappedModel(nhomMatHang);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(nhomMatHang)) {
				nhomMatHang = (NhomMatHang)session.get(NhomMatHangImpl.class,
						nhomMatHang.getPrimaryKeyObj());
			}

			if (nhomMatHang != null) {
				session.delete(nhomMatHang);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (nhomMatHang != null) {
			clearCache(nhomMatHang);
		}

		return nhomMatHang;
	}

	@Override
	public NhomMatHang updateImpl(
		com.minimart.portlet.mathang.model.NhomMatHang nhomMatHang)
		throws SystemException {
		nhomMatHang = toUnwrappedModel(nhomMatHang);

		boolean isNew = nhomMatHang.isNew();

		NhomMatHangModelImpl nhomMatHangModelImpl = (NhomMatHangModelImpl)nhomMatHang;

		Session session = null;

		try {
			session = openSession();

			if (nhomMatHang.isNew()) {
				session.save(nhomMatHang);

				nhomMatHang.setNew(false);
			}
			else {
				session.merge(nhomMatHang);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !NhomMatHangModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((nhomMatHangModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						nhomMatHangModelImpl.getOriginalName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAME, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME,
					args);

				args = new Object[] { nhomMatHangModelImpl.getName() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAME, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME,
					args);
			}
		}

		EntityCacheUtil.putResult(NhomMatHangModelImpl.ENTITY_CACHE_ENABLED,
			NhomMatHangImpl.class, nhomMatHang.getPrimaryKey(), nhomMatHang);

		return nhomMatHang;
	}

	protected NhomMatHang toUnwrappedModel(NhomMatHang nhomMatHang) {
		if (nhomMatHang instanceof NhomMatHangImpl) {
			return nhomMatHang;
		}

		NhomMatHangImpl nhomMatHangImpl = new NhomMatHangImpl();

		nhomMatHangImpl.setNew(nhomMatHang.isNew());
		nhomMatHangImpl.setPrimaryKey(nhomMatHang.getPrimaryKey());

		nhomMatHangImpl.setNhomMatHangId(nhomMatHang.getNhomMatHangId());
		nhomMatHangImpl.setGroupId(nhomMatHang.getGroupId());
		nhomMatHangImpl.setCompanyId(nhomMatHang.getCompanyId());
		nhomMatHangImpl.setUserId(nhomMatHang.getUserId());
		nhomMatHangImpl.setUserName(nhomMatHang.getUserName());
		nhomMatHangImpl.setCreateDate(nhomMatHang.getCreateDate());
		nhomMatHangImpl.setModifiedDate(nhomMatHang.getModifiedDate());
		nhomMatHangImpl.setName(nhomMatHang.getName());
		nhomMatHangImpl.setCode(nhomMatHang.getCode());
		nhomMatHangImpl.setStatus(nhomMatHang.getStatus());
		nhomMatHangImpl.setNote(nhomMatHang.getNote());

		return nhomMatHangImpl;
	}

	/**
	 * Returns the nhom mat hang with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the nhom mat hang
	 * @return the nhom mat hang
	 * @throws com.minimart.portlet.mathang.NoSuchNhomMatHangException if a nhom mat hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomMatHang findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNhomMatHangException, SystemException {
		NhomMatHang nhomMatHang = fetchByPrimaryKey(primaryKey);

		if (nhomMatHang == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNhomMatHangException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return nhomMatHang;
	}

	/**
	 * Returns the nhom mat hang with the primary key or throws a {@link com.minimart.portlet.mathang.NoSuchNhomMatHangException} if it could not be found.
	 *
	 * @param nhomMatHangId the primary key of the nhom mat hang
	 * @return the nhom mat hang
	 * @throws com.minimart.portlet.mathang.NoSuchNhomMatHangException if a nhom mat hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomMatHang findByPrimaryKey(long nhomMatHangId)
		throws NoSuchNhomMatHangException, SystemException {
		return findByPrimaryKey((Serializable)nhomMatHangId);
	}

	/**
	 * Returns the nhom mat hang with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the nhom mat hang
	 * @return the nhom mat hang, or <code>null</code> if a nhom mat hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomMatHang fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		NhomMatHang nhomMatHang = (NhomMatHang)EntityCacheUtil.getResult(NhomMatHangModelImpl.ENTITY_CACHE_ENABLED,
				NhomMatHangImpl.class, primaryKey);

		if (nhomMatHang == _nullNhomMatHang) {
			return null;
		}

		if (nhomMatHang == null) {
			Session session = null;

			try {
				session = openSession();

				nhomMatHang = (NhomMatHang)session.get(NhomMatHangImpl.class,
						primaryKey);

				if (nhomMatHang != null) {
					cacheResult(nhomMatHang);
				}
				else {
					EntityCacheUtil.putResult(NhomMatHangModelImpl.ENTITY_CACHE_ENABLED,
						NhomMatHangImpl.class, primaryKey, _nullNhomMatHang);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(NhomMatHangModelImpl.ENTITY_CACHE_ENABLED,
					NhomMatHangImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return nhomMatHang;
	}

	/**
	 * Returns the nhom mat hang with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param nhomMatHangId the primary key of the nhom mat hang
	 * @return the nhom mat hang, or <code>null</code> if a nhom mat hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomMatHang fetchByPrimaryKey(long nhomMatHangId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)nhomMatHangId);
	}

	/**
	 * Returns all the nhom mat hangs.
	 *
	 * @return the nhom mat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhomMatHang> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the nhom mat hangs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.NhomMatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nhom mat hangs
	 * @param end the upper bound of the range of nhom mat hangs (not inclusive)
	 * @return the range of nhom mat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhomMatHang> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the nhom mat hangs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.NhomMatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nhom mat hangs
	 * @param end the upper bound of the range of nhom mat hangs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of nhom mat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhomMatHang> findAll(int start, int end,
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

		List<NhomMatHang> list = (List<NhomMatHang>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_NHOMMATHANG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_NHOMMATHANG;

				if (pagination) {
					sql = sql.concat(NhomMatHangModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<NhomMatHang>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NhomMatHang>(list);
				}
				else {
					list = (List<NhomMatHang>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the nhom mat hangs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (NhomMatHang nhomMatHang : findAll()) {
			remove(nhomMatHang);
		}
	}

	/**
	 * Returns the number of nhom mat hangs.
	 *
	 * @return the number of nhom mat hangs
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

				Query q = session.createQuery(_SQL_COUNT_NHOMMATHANG);

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
	 * Initializes the nhom mat hang persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.minimart.portlet.mathang.model.NhomMatHang")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<NhomMatHang>> listenersList = new ArrayList<ModelListener<NhomMatHang>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<NhomMatHang>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(NhomMatHangImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_NHOMMATHANG = "SELECT nhomMatHang FROM NhomMatHang nhomMatHang";
	private static final String _SQL_SELECT_NHOMMATHANG_WHERE = "SELECT nhomMatHang FROM NhomMatHang nhomMatHang WHERE ";
	private static final String _SQL_COUNT_NHOMMATHANG = "SELECT COUNT(nhomMatHang) FROM NhomMatHang nhomMatHang";
	private static final String _SQL_COUNT_NHOMMATHANG_WHERE = "SELECT COUNT(nhomMatHang) FROM NhomMatHang nhomMatHang WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "nhomMatHang.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No NhomMatHang exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No NhomMatHang exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(NhomMatHangPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"code"
			});
	private static NhomMatHang _nullNhomMatHang = new NhomMatHangImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<NhomMatHang> toCacheModel() {
				return _nullNhomMatHangCacheModel;
			}
		};

	private static CacheModel<NhomMatHang> _nullNhomMatHangCacheModel = new CacheModel<NhomMatHang>() {
			@Override
			public NhomMatHang toEntityModel() {
				return _nullNhomMatHang;
			}
		};
}