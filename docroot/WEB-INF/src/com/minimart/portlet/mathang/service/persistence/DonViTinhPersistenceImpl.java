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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.minimart.portlet.mathang.NoSuchDonViTinhException;
import com.minimart.portlet.mathang.model.DonViTinh;
import com.minimart.portlet.mathang.model.impl.DonViTinhImpl;
import com.minimart.portlet.mathang.model.impl.DonViTinhModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the don vi tinh service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see DonViTinhPersistence
 * @see DonViTinhUtil
 * @generated
 */
public class DonViTinhPersistenceImpl extends BasePersistenceImpl<DonViTinh>
	implements DonViTinhPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DonViTinhUtil} to access the don vi tinh persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DonViTinhImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DonViTinhModelImpl.ENTITY_CACHE_ENABLED,
			DonViTinhModelImpl.FINDER_CACHE_ENABLED, DonViTinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DonViTinhModelImpl.ENTITY_CACHE_ENABLED,
			DonViTinhModelImpl.FINDER_CACHE_ENABLED, DonViTinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DonViTinhModelImpl.ENTITY_CACHE_ENABLED,
			DonViTinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NAME = new FinderPath(DonViTinhModelImpl.ENTITY_CACHE_ENABLED,
			DonViTinhModelImpl.FINDER_CACHE_ENABLED, DonViTinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByName",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME = new FinderPath(DonViTinhModelImpl.ENTITY_CACHE_ENABLED,
			DonViTinhModelImpl.FINDER_CACHE_ENABLED, DonViTinhImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByName",
			new String[] { String.class.getName() },
			DonViTinhModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NAME = new FinderPath(DonViTinhModelImpl.ENTITY_CACHE_ENABLED,
			DonViTinhModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByName",
			new String[] { String.class.getName() });

	/**
	 * Returns all the don vi tinhs where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching don vi tinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DonViTinh> findByName(String name) throws SystemException {
		return findByName(name, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the don vi tinhs where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.DonViTinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of don vi tinhs
	 * @param end the upper bound of the range of don vi tinhs (not inclusive)
	 * @return the range of matching don vi tinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DonViTinh> findByName(String name, int start, int end)
		throws SystemException {
		return findByName(name, start, end, null);
	}

	/**
	 * Returns an ordered range of all the don vi tinhs where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.DonViTinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of don vi tinhs
	 * @param end the upper bound of the range of don vi tinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching don vi tinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DonViTinh> findByName(String name, int start, int end,
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

		List<DonViTinh> list = (List<DonViTinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DonViTinh donViTinh : list) {
				if (!Validator.equals(name, donViTinh.getName())) {
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

			query.append(_SQL_SELECT_DONVITINH_WHERE);

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
				query.append(DonViTinhModelImpl.ORDER_BY_JPQL);
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
					list = (List<DonViTinh>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DonViTinh>(list);
				}
				else {
					list = (List<DonViTinh>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first don vi tinh in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching don vi tinh
	 * @throws com.minimart.portlet.mathang.NoSuchDonViTinhException if a matching don vi tinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonViTinh findByName_First(String name,
		OrderByComparator orderByComparator)
		throws NoSuchDonViTinhException, SystemException {
		DonViTinh donViTinh = fetchByName_First(name, orderByComparator);

		if (donViTinh != null) {
			return donViTinh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDonViTinhException(msg.toString());
	}

	/**
	 * Returns the first don vi tinh in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching don vi tinh, or <code>null</code> if a matching don vi tinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonViTinh fetchByName_First(String name,
		OrderByComparator orderByComparator) throws SystemException {
		List<DonViTinh> list = findByName(name, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last don vi tinh in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching don vi tinh
	 * @throws com.minimart.portlet.mathang.NoSuchDonViTinhException if a matching don vi tinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonViTinh findByName_Last(String name,
		OrderByComparator orderByComparator)
		throws NoSuchDonViTinhException, SystemException {
		DonViTinh donViTinh = fetchByName_Last(name, orderByComparator);

		if (donViTinh != null) {
			return donViTinh;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDonViTinhException(msg.toString());
	}

	/**
	 * Returns the last don vi tinh in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching don vi tinh, or <code>null</code> if a matching don vi tinh could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonViTinh fetchByName_Last(String name,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByName(name);

		if (count == 0) {
			return null;
		}

		List<DonViTinh> list = findByName(name, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the don vi tinhs before and after the current don vi tinh in the ordered set where name = &#63;.
	 *
	 * @param donViTinhId the primary key of the current don vi tinh
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next don vi tinh
	 * @throws com.minimart.portlet.mathang.NoSuchDonViTinhException if a don vi tinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonViTinh[] findByName_PrevAndNext(long donViTinhId, String name,
		OrderByComparator orderByComparator)
		throws NoSuchDonViTinhException, SystemException {
		DonViTinh donViTinh = findByPrimaryKey(donViTinhId);

		Session session = null;

		try {
			session = openSession();

			DonViTinh[] array = new DonViTinhImpl[3];

			array[0] = getByName_PrevAndNext(session, donViTinh, name,
					orderByComparator, true);

			array[1] = donViTinh;

			array[2] = getByName_PrevAndNext(session, donViTinh, name,
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

	protected DonViTinh getByName_PrevAndNext(Session session,
		DonViTinh donViTinh, String name, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DONVITINH_WHERE);

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
			query.append(DonViTinhModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(donViTinh);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DonViTinh> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the don vi tinhs where name = &#63; from the database.
	 *
	 * @param name the name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByName(String name) throws SystemException {
		for (DonViTinh donViTinh : findByName(name, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(donViTinh);
		}
	}

	/**
	 * Returns the number of don vi tinhs where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching don vi tinhs
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

			query.append(_SQL_COUNT_DONVITINH_WHERE);

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

	private static final String _FINDER_COLUMN_NAME_NAME_1 = "donViTinh.name IS NULL";
	private static final String _FINDER_COLUMN_NAME_NAME_2 = "donViTinh.name = ?";
	private static final String _FINDER_COLUMN_NAME_NAME_3 = "(donViTinh.name IS NULL OR donViTinh.name = '')";

	public DonViTinhPersistenceImpl() {
		setModelClass(DonViTinh.class);
	}

	/**
	 * Caches the don vi tinh in the entity cache if it is enabled.
	 *
	 * @param donViTinh the don vi tinh
	 */
	@Override
	public void cacheResult(DonViTinh donViTinh) {
		EntityCacheUtil.putResult(DonViTinhModelImpl.ENTITY_CACHE_ENABLED,
			DonViTinhImpl.class, donViTinh.getPrimaryKey(), donViTinh);

		donViTinh.resetOriginalValues();
	}

	/**
	 * Caches the don vi tinhs in the entity cache if it is enabled.
	 *
	 * @param donViTinhs the don vi tinhs
	 */
	@Override
	public void cacheResult(List<DonViTinh> donViTinhs) {
		for (DonViTinh donViTinh : donViTinhs) {
			if (EntityCacheUtil.getResult(
						DonViTinhModelImpl.ENTITY_CACHE_ENABLED,
						DonViTinhImpl.class, donViTinh.getPrimaryKey()) == null) {
				cacheResult(donViTinh);
			}
			else {
				donViTinh.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all don vi tinhs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DonViTinhImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DonViTinhImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the don vi tinh.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DonViTinh donViTinh) {
		EntityCacheUtil.removeResult(DonViTinhModelImpl.ENTITY_CACHE_ENABLED,
			DonViTinhImpl.class, donViTinh.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DonViTinh> donViTinhs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DonViTinh donViTinh : donViTinhs) {
			EntityCacheUtil.removeResult(DonViTinhModelImpl.ENTITY_CACHE_ENABLED,
				DonViTinhImpl.class, donViTinh.getPrimaryKey());
		}
	}

	/**
	 * Creates a new don vi tinh with the primary key. Does not add the don vi tinh to the database.
	 *
	 * @param donViTinhId the primary key for the new don vi tinh
	 * @return the new don vi tinh
	 */
	@Override
	public DonViTinh create(long donViTinhId) {
		DonViTinh donViTinh = new DonViTinhImpl();

		donViTinh.setNew(true);
		donViTinh.setPrimaryKey(donViTinhId);

		return donViTinh;
	}

	/**
	 * Removes the don vi tinh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param donViTinhId the primary key of the don vi tinh
	 * @return the don vi tinh that was removed
	 * @throws com.minimart.portlet.mathang.NoSuchDonViTinhException if a don vi tinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonViTinh remove(long donViTinhId)
		throws NoSuchDonViTinhException, SystemException {
		return remove((Serializable)donViTinhId);
	}

	/**
	 * Removes the don vi tinh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the don vi tinh
	 * @return the don vi tinh that was removed
	 * @throws com.minimart.portlet.mathang.NoSuchDonViTinhException if a don vi tinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonViTinh remove(Serializable primaryKey)
		throws NoSuchDonViTinhException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DonViTinh donViTinh = (DonViTinh)session.get(DonViTinhImpl.class,
					primaryKey);

			if (donViTinh == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDonViTinhException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(donViTinh);
		}
		catch (NoSuchDonViTinhException nsee) {
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
	protected DonViTinh removeImpl(DonViTinh donViTinh)
		throws SystemException {
		donViTinh = toUnwrappedModel(donViTinh);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(donViTinh)) {
				donViTinh = (DonViTinh)session.get(DonViTinhImpl.class,
						donViTinh.getPrimaryKeyObj());
			}

			if (donViTinh != null) {
				session.delete(donViTinh);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (donViTinh != null) {
			clearCache(donViTinh);
		}

		return donViTinh;
	}

	@Override
	public DonViTinh updateImpl(
		com.minimart.portlet.mathang.model.DonViTinh donViTinh)
		throws SystemException {
		donViTinh = toUnwrappedModel(donViTinh);

		boolean isNew = donViTinh.isNew();

		DonViTinhModelImpl donViTinhModelImpl = (DonViTinhModelImpl)donViTinh;

		Session session = null;

		try {
			session = openSession();

			if (donViTinh.isNew()) {
				session.save(donViTinh);

				donViTinh.setNew(false);
			}
			else {
				session.merge(donViTinh);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DonViTinhModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((donViTinhModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						donViTinhModelImpl.getOriginalName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAME, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME,
					args);

				args = new Object[] { donViTinhModelImpl.getName() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAME, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME,
					args);
			}
		}

		EntityCacheUtil.putResult(DonViTinhModelImpl.ENTITY_CACHE_ENABLED,
			DonViTinhImpl.class, donViTinh.getPrimaryKey(), donViTinh);

		return donViTinh;
	}

	protected DonViTinh toUnwrappedModel(DonViTinh donViTinh) {
		if (donViTinh instanceof DonViTinhImpl) {
			return donViTinh;
		}

		DonViTinhImpl donViTinhImpl = new DonViTinhImpl();

		donViTinhImpl.setNew(donViTinh.isNew());
		donViTinhImpl.setPrimaryKey(donViTinh.getPrimaryKey());

		donViTinhImpl.setDonViTinhId(donViTinh.getDonViTinhId());
		donViTinhImpl.setGroupId(donViTinh.getGroupId());
		donViTinhImpl.setCompanyId(donViTinh.getCompanyId());
		donViTinhImpl.setUserId(donViTinh.getUserId());
		donViTinhImpl.setUserName(donViTinh.getUserName());
		donViTinhImpl.setCreateDate(donViTinh.getCreateDate());
		donViTinhImpl.setModifiedDate(donViTinh.getModifiedDate());
		donViTinhImpl.setName(donViTinh.getName());
		donViTinhImpl.setStatus(donViTinh.getStatus());
		donViTinhImpl.setNote(donViTinh.getNote());

		return donViTinhImpl;
	}

	/**
	 * Returns the don vi tinh with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the don vi tinh
	 * @return the don vi tinh
	 * @throws com.minimart.portlet.mathang.NoSuchDonViTinhException if a don vi tinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonViTinh findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDonViTinhException, SystemException {
		DonViTinh donViTinh = fetchByPrimaryKey(primaryKey);

		if (donViTinh == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDonViTinhException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return donViTinh;
	}

	/**
	 * Returns the don vi tinh with the primary key or throws a {@link com.minimart.portlet.mathang.NoSuchDonViTinhException} if it could not be found.
	 *
	 * @param donViTinhId the primary key of the don vi tinh
	 * @return the don vi tinh
	 * @throws com.minimart.portlet.mathang.NoSuchDonViTinhException if a don vi tinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonViTinh findByPrimaryKey(long donViTinhId)
		throws NoSuchDonViTinhException, SystemException {
		return findByPrimaryKey((Serializable)donViTinhId);
	}

	/**
	 * Returns the don vi tinh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the don vi tinh
	 * @return the don vi tinh, or <code>null</code> if a don vi tinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonViTinh fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DonViTinh donViTinh = (DonViTinh)EntityCacheUtil.getResult(DonViTinhModelImpl.ENTITY_CACHE_ENABLED,
				DonViTinhImpl.class, primaryKey);

		if (donViTinh == _nullDonViTinh) {
			return null;
		}

		if (donViTinh == null) {
			Session session = null;

			try {
				session = openSession();

				donViTinh = (DonViTinh)session.get(DonViTinhImpl.class,
						primaryKey);

				if (donViTinh != null) {
					cacheResult(donViTinh);
				}
				else {
					EntityCacheUtil.putResult(DonViTinhModelImpl.ENTITY_CACHE_ENABLED,
						DonViTinhImpl.class, primaryKey, _nullDonViTinh);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DonViTinhModelImpl.ENTITY_CACHE_ENABLED,
					DonViTinhImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return donViTinh;
	}

	/**
	 * Returns the don vi tinh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param donViTinhId the primary key of the don vi tinh
	 * @return the don vi tinh, or <code>null</code> if a don vi tinh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonViTinh fetchByPrimaryKey(long donViTinhId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)donViTinhId);
	}

	/**
	 * Returns all the don vi tinhs.
	 *
	 * @return the don vi tinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DonViTinh> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the don vi tinhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.DonViTinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of don vi tinhs
	 * @param end the upper bound of the range of don vi tinhs (not inclusive)
	 * @return the range of don vi tinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DonViTinh> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the don vi tinhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.mathang.model.impl.DonViTinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of don vi tinhs
	 * @param end the upper bound of the range of don vi tinhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of don vi tinhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DonViTinh> findAll(int start, int end,
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

		List<DonViTinh> list = (List<DonViTinh>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DONVITINH);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DONVITINH;

				if (pagination) {
					sql = sql.concat(DonViTinhModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DonViTinh>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DonViTinh>(list);
				}
				else {
					list = (List<DonViTinh>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the don vi tinhs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DonViTinh donViTinh : findAll()) {
			remove(donViTinh);
		}
	}

	/**
	 * Returns the number of don vi tinhs.
	 *
	 * @return the number of don vi tinhs
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

				Query q = session.createQuery(_SQL_COUNT_DONVITINH);

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

	/**
	 * Initializes the don vi tinh persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.minimart.portlet.mathang.model.DonViTinh")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DonViTinh>> listenersList = new ArrayList<ModelListener<DonViTinh>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DonViTinh>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DonViTinhImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DONVITINH = "SELECT donViTinh FROM DonViTinh donViTinh";
	private static final String _SQL_SELECT_DONVITINH_WHERE = "SELECT donViTinh FROM DonViTinh donViTinh WHERE ";
	private static final String _SQL_COUNT_DONVITINH = "SELECT COUNT(donViTinh) FROM DonViTinh donViTinh";
	private static final String _SQL_COUNT_DONVITINH_WHERE = "SELECT COUNT(donViTinh) FROM DonViTinh donViTinh WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "donViTinh.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DonViTinh exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DonViTinh exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DonViTinhPersistenceImpl.class);
	private static DonViTinh _nullDonViTinh = new DonViTinhImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DonViTinh> toCacheModel() {
				return _nullDonViTinhCacheModel;
			}
		};

	private static CacheModel<DonViTinh> _nullDonViTinhCacheModel = new CacheModel<DonViTinh>() {
			@Override
			public DonViTinh toEntityModel() {
				return _nullDonViTinh;
			}
		};
}