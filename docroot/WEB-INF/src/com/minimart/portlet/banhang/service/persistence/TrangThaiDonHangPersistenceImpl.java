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

package com.minimart.portlet.banhang.service.persistence;

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

import com.minimart.portlet.banhang.NoSuchTrangThaiDonHangException;
import com.minimart.portlet.banhang.model.TrangThaiDonHang;
import com.minimart.portlet.banhang.model.impl.TrangThaiDonHangImpl;
import com.minimart.portlet.banhang.model.impl.TrangThaiDonHangModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the trang thai don hang service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see TrangThaiDonHangPersistence
 * @see TrangThaiDonHangUtil
 * @generated
 */
public class TrangThaiDonHangPersistenceImpl extends BasePersistenceImpl<TrangThaiDonHang>
	implements TrangThaiDonHangPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TrangThaiDonHangUtil} to access the trang thai don hang persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TrangThaiDonHangImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TrangThaiDonHangModelImpl.ENTITY_CACHE_ENABLED,
			TrangThaiDonHangModelImpl.FINDER_CACHE_ENABLED,
			TrangThaiDonHangImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TrangThaiDonHangModelImpl.ENTITY_CACHE_ENABLED,
			TrangThaiDonHangModelImpl.FINDER_CACHE_ENABLED,
			TrangThaiDonHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TrangThaiDonHangModelImpl.ENTITY_CACHE_ENABLED,
			TrangThaiDonHangModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN = new FinderPath(TrangThaiDonHangModelImpl.ENTITY_CACHE_ENABLED,
			TrangThaiDonHangModelImpl.FINDER_CACHE_ENABLED,
			TrangThaiDonHangImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByTEN",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN = new FinderPath(TrangThaiDonHangModelImpl.ENTITY_CACHE_ENABLED,
			TrangThaiDonHangModelImpl.FINDER_CACHE_ENABLED,
			TrangThaiDonHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTEN",
			new String[] { String.class.getName() },
			TrangThaiDonHangModelImpl.TEN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEN = new FinderPath(TrangThaiDonHangModelImpl.ENTITY_CACHE_ENABLED,
			TrangThaiDonHangModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTEN",
			new String[] { String.class.getName() });

	/**
	 * Returns all the trang thai don hangs where ten = &#63;.
	 *
	 * @param ten the ten
	 * @return the matching trang thai don hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TrangThaiDonHang> findByTEN(String ten)
		throws SystemException {
		return findByTEN(ten, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the trang thai don hangs where ten = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.TrangThaiDonHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param start the lower bound of the range of trang thai don hangs
	 * @param end the upper bound of the range of trang thai don hangs (not inclusive)
	 * @return the range of matching trang thai don hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TrangThaiDonHang> findByTEN(String ten, int start, int end)
		throws SystemException {
		return findByTEN(ten, start, end, null);
	}

	/**
	 * Returns an ordered range of all the trang thai don hangs where ten = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.TrangThaiDonHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param start the lower bound of the range of trang thai don hangs
	 * @param end the upper bound of the range of trang thai don hangs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching trang thai don hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TrangThaiDonHang> findByTEN(String ten, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN;
			finderArgs = new Object[] { ten };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN;
			finderArgs = new Object[] { ten, start, end, orderByComparator };
		}

		List<TrangThaiDonHang> list = (List<TrangThaiDonHang>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (TrangThaiDonHang trangThaiDonHang : list) {
				if (!Validator.equals(ten, trangThaiDonHang.getTen())) {
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

			query.append(_SQL_SELECT_TRANGTHAIDONHANG_WHERE);

			boolean bindTen = false;

			if (ten == null) {
				query.append(_FINDER_COLUMN_TEN_TEN_1);
			}
			else if (ten.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_TEN_3);
			}
			else {
				bindTen = true;

				query.append(_FINDER_COLUMN_TEN_TEN_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TrangThaiDonHangModelImpl.ORDER_BY_JPQL);
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

				if (!pagination) {
					list = (List<TrangThaiDonHang>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TrangThaiDonHang>(list);
				}
				else {
					list = (List<TrangThaiDonHang>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first trang thai don hang in the ordered set where ten = &#63;.
	 *
	 * @param ten the ten
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching trang thai don hang
	 * @throws com.minimart.portlet.banhang.NoSuchTrangThaiDonHangException if a matching trang thai don hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TrangThaiDonHang findByTEN_First(String ten,
		OrderByComparator orderByComparator)
		throws NoSuchTrangThaiDonHangException, SystemException {
		TrangThaiDonHang trangThaiDonHang = fetchByTEN_First(ten,
				orderByComparator);

		if (trangThaiDonHang != null) {
			return trangThaiDonHang;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTrangThaiDonHangException(msg.toString());
	}

	/**
	 * Returns the first trang thai don hang in the ordered set where ten = &#63;.
	 *
	 * @param ten the ten
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching trang thai don hang, or <code>null</code> if a matching trang thai don hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TrangThaiDonHang fetchByTEN_First(String ten,
		OrderByComparator orderByComparator) throws SystemException {
		List<TrangThaiDonHang> list = findByTEN(ten, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last trang thai don hang in the ordered set where ten = &#63;.
	 *
	 * @param ten the ten
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching trang thai don hang
	 * @throws com.minimart.portlet.banhang.NoSuchTrangThaiDonHangException if a matching trang thai don hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TrangThaiDonHang findByTEN_Last(String ten,
		OrderByComparator orderByComparator)
		throws NoSuchTrangThaiDonHangException, SystemException {
		TrangThaiDonHang trangThaiDonHang = fetchByTEN_Last(ten,
				orderByComparator);

		if (trangThaiDonHang != null) {
			return trangThaiDonHang;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTrangThaiDonHangException(msg.toString());
	}

	/**
	 * Returns the last trang thai don hang in the ordered set where ten = &#63;.
	 *
	 * @param ten the ten
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching trang thai don hang, or <code>null</code> if a matching trang thai don hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TrangThaiDonHang fetchByTEN_Last(String ten,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTEN(ten);

		if (count == 0) {
			return null;
		}

		List<TrangThaiDonHang> list = findByTEN(ten, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the trang thai don hangs before and after the current trang thai don hang in the ordered set where ten = &#63;.
	 *
	 * @param trangThaiDonHangId the primary key of the current trang thai don hang
	 * @param ten the ten
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next trang thai don hang
	 * @throws com.minimart.portlet.banhang.NoSuchTrangThaiDonHangException if a trang thai don hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TrangThaiDonHang[] findByTEN_PrevAndNext(long trangThaiDonHangId,
		String ten, OrderByComparator orderByComparator)
		throws NoSuchTrangThaiDonHangException, SystemException {
		TrangThaiDonHang trangThaiDonHang = findByPrimaryKey(trangThaiDonHangId);

		Session session = null;

		try {
			session = openSession();

			TrangThaiDonHang[] array = new TrangThaiDonHangImpl[3];

			array[0] = getByTEN_PrevAndNext(session, trangThaiDonHang, ten,
					orderByComparator, true);

			array[1] = trangThaiDonHang;

			array[2] = getByTEN_PrevAndNext(session, trangThaiDonHang, ten,
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

	protected TrangThaiDonHang getByTEN_PrevAndNext(Session session,
		TrangThaiDonHang trangThaiDonHang, String ten,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TRANGTHAIDONHANG_WHERE);

		boolean bindTen = false;

		if (ten == null) {
			query.append(_FINDER_COLUMN_TEN_TEN_1);
		}
		else if (ten.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TEN_TEN_3);
		}
		else {
			bindTen = true;

			query.append(_FINDER_COLUMN_TEN_TEN_2);
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
			query.append(TrangThaiDonHangModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindTen) {
			qPos.add(ten);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(trangThaiDonHang);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TrangThaiDonHang> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the trang thai don hangs where ten = &#63; from the database.
	 *
	 * @param ten the ten
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTEN(String ten) throws SystemException {
		for (TrangThaiDonHang trangThaiDonHang : findByTEN(ten,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(trangThaiDonHang);
		}
	}

	/**
	 * Returns the number of trang thai don hangs where ten = &#63;.
	 *
	 * @param ten the ten
	 * @return the number of matching trang thai don hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTEN(String ten) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TEN;

		Object[] finderArgs = new Object[] { ten };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TRANGTHAIDONHANG_WHERE);

			boolean bindTen = false;

			if (ten == null) {
				query.append(_FINDER_COLUMN_TEN_TEN_1);
			}
			else if (ten.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_TEN_3);
			}
			else {
				bindTen = true;

				query.append(_FINDER_COLUMN_TEN_TEN_2);
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

	private static final String _FINDER_COLUMN_TEN_TEN_1 = "trangThaiDonHang.ten IS NULL";
	private static final String _FINDER_COLUMN_TEN_TEN_2 = "trangThaiDonHang.ten = ?";
	private static final String _FINDER_COLUMN_TEN_TEN_3 = "(trangThaiDonHang.ten IS NULL OR trangThaiDonHang.ten = '')";

	public TrangThaiDonHangPersistenceImpl() {
		setModelClass(TrangThaiDonHang.class);
	}

	/**
	 * Caches the trang thai don hang in the entity cache if it is enabled.
	 *
	 * @param trangThaiDonHang the trang thai don hang
	 */
	@Override
	public void cacheResult(TrangThaiDonHang trangThaiDonHang) {
		EntityCacheUtil.putResult(TrangThaiDonHangModelImpl.ENTITY_CACHE_ENABLED,
			TrangThaiDonHangImpl.class, trangThaiDonHang.getPrimaryKey(),
			trangThaiDonHang);

		trangThaiDonHang.resetOriginalValues();
	}

	/**
	 * Caches the trang thai don hangs in the entity cache if it is enabled.
	 *
	 * @param trangThaiDonHangs the trang thai don hangs
	 */
	@Override
	public void cacheResult(List<TrangThaiDonHang> trangThaiDonHangs) {
		for (TrangThaiDonHang trangThaiDonHang : trangThaiDonHangs) {
			if (EntityCacheUtil.getResult(
						TrangThaiDonHangModelImpl.ENTITY_CACHE_ENABLED,
						TrangThaiDonHangImpl.class,
						trangThaiDonHang.getPrimaryKey()) == null) {
				cacheResult(trangThaiDonHang);
			}
			else {
				trangThaiDonHang.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all trang thai don hangs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(TrangThaiDonHangImpl.class.getName());
		}

		EntityCacheUtil.clearCache(TrangThaiDonHangImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the trang thai don hang.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TrangThaiDonHang trangThaiDonHang) {
		EntityCacheUtil.removeResult(TrangThaiDonHangModelImpl.ENTITY_CACHE_ENABLED,
			TrangThaiDonHangImpl.class, trangThaiDonHang.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TrangThaiDonHang> trangThaiDonHangs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TrangThaiDonHang trangThaiDonHang : trangThaiDonHangs) {
			EntityCacheUtil.removeResult(TrangThaiDonHangModelImpl.ENTITY_CACHE_ENABLED,
				TrangThaiDonHangImpl.class, trangThaiDonHang.getPrimaryKey());
		}
	}

	/**
	 * Creates a new trang thai don hang with the primary key. Does not add the trang thai don hang to the database.
	 *
	 * @param trangThaiDonHangId the primary key for the new trang thai don hang
	 * @return the new trang thai don hang
	 */
	@Override
	public TrangThaiDonHang create(long trangThaiDonHangId) {
		TrangThaiDonHang trangThaiDonHang = new TrangThaiDonHangImpl();

		trangThaiDonHang.setNew(true);
		trangThaiDonHang.setPrimaryKey(trangThaiDonHangId);

		return trangThaiDonHang;
	}

	/**
	 * Removes the trang thai don hang with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param trangThaiDonHangId the primary key of the trang thai don hang
	 * @return the trang thai don hang that was removed
	 * @throws com.minimart.portlet.banhang.NoSuchTrangThaiDonHangException if a trang thai don hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TrangThaiDonHang remove(long trangThaiDonHangId)
		throws NoSuchTrangThaiDonHangException, SystemException {
		return remove((Serializable)trangThaiDonHangId);
	}

	/**
	 * Removes the trang thai don hang with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the trang thai don hang
	 * @return the trang thai don hang that was removed
	 * @throws com.minimart.portlet.banhang.NoSuchTrangThaiDonHangException if a trang thai don hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TrangThaiDonHang remove(Serializable primaryKey)
		throws NoSuchTrangThaiDonHangException, SystemException {
		Session session = null;

		try {
			session = openSession();

			TrangThaiDonHang trangThaiDonHang = (TrangThaiDonHang)session.get(TrangThaiDonHangImpl.class,
					primaryKey);

			if (trangThaiDonHang == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTrangThaiDonHangException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(trangThaiDonHang);
		}
		catch (NoSuchTrangThaiDonHangException nsee) {
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
	protected TrangThaiDonHang removeImpl(TrangThaiDonHang trangThaiDonHang)
		throws SystemException {
		trangThaiDonHang = toUnwrappedModel(trangThaiDonHang);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(trangThaiDonHang)) {
				trangThaiDonHang = (TrangThaiDonHang)session.get(TrangThaiDonHangImpl.class,
						trangThaiDonHang.getPrimaryKeyObj());
			}

			if (trangThaiDonHang != null) {
				session.delete(trangThaiDonHang);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (trangThaiDonHang != null) {
			clearCache(trangThaiDonHang);
		}

		return trangThaiDonHang;
	}

	@Override
	public TrangThaiDonHang updateImpl(
		com.minimart.portlet.banhang.model.TrangThaiDonHang trangThaiDonHang)
		throws SystemException {
		trangThaiDonHang = toUnwrappedModel(trangThaiDonHang);

		boolean isNew = trangThaiDonHang.isNew();

		TrangThaiDonHangModelImpl trangThaiDonHangModelImpl = (TrangThaiDonHangModelImpl)trangThaiDonHang;

		Session session = null;

		try {
			session = openSession();

			if (trangThaiDonHang.isNew()) {
				session.save(trangThaiDonHang);

				trangThaiDonHang.setNew(false);
			}
			else {
				session.merge(trangThaiDonHang);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !TrangThaiDonHangModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((trangThaiDonHangModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						trangThaiDonHangModelImpl.getOriginalTen()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN,
					args);

				args = new Object[] { trangThaiDonHangModelImpl.getTen() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN,
					args);
			}
		}

		EntityCacheUtil.putResult(TrangThaiDonHangModelImpl.ENTITY_CACHE_ENABLED,
			TrangThaiDonHangImpl.class, trangThaiDonHang.getPrimaryKey(),
			trangThaiDonHang);

		return trangThaiDonHang;
	}

	protected TrangThaiDonHang toUnwrappedModel(
		TrangThaiDonHang trangThaiDonHang) {
		if (trangThaiDonHang instanceof TrangThaiDonHangImpl) {
			return trangThaiDonHang;
		}

		TrangThaiDonHangImpl trangThaiDonHangImpl = new TrangThaiDonHangImpl();

		trangThaiDonHangImpl.setNew(trangThaiDonHang.isNew());
		trangThaiDonHangImpl.setPrimaryKey(trangThaiDonHang.getPrimaryKey());

		trangThaiDonHangImpl.setTrangThaiDonHangId(trangThaiDonHang.getTrangThaiDonHangId());
		trangThaiDonHangImpl.setCompanyId(trangThaiDonHang.getCompanyId());
		trangThaiDonHangImpl.setUserId(trangThaiDonHang.getUserId());
		trangThaiDonHangImpl.setUserName(trangThaiDonHang.getUserName());
		trangThaiDonHangImpl.setCreateDate(trangThaiDonHang.getCreateDate());
		trangThaiDonHangImpl.setModifiedDate(trangThaiDonHang.getModifiedDate());
		trangThaiDonHangImpl.setTen(trangThaiDonHang.getTen());
		trangThaiDonHangImpl.setHoatDong(trangThaiDonHang.isHoatDong());
		trangThaiDonHangImpl.setGhiChu(trangThaiDonHang.getGhiChu());

		return trangThaiDonHangImpl;
	}

	/**
	 * Returns the trang thai don hang with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the trang thai don hang
	 * @return the trang thai don hang
	 * @throws com.minimart.portlet.banhang.NoSuchTrangThaiDonHangException if a trang thai don hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TrangThaiDonHang findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTrangThaiDonHangException, SystemException {
		TrangThaiDonHang trangThaiDonHang = fetchByPrimaryKey(primaryKey);

		if (trangThaiDonHang == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTrangThaiDonHangException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return trangThaiDonHang;
	}

	/**
	 * Returns the trang thai don hang with the primary key or throws a {@link com.minimart.portlet.banhang.NoSuchTrangThaiDonHangException} if it could not be found.
	 *
	 * @param trangThaiDonHangId the primary key of the trang thai don hang
	 * @return the trang thai don hang
	 * @throws com.minimart.portlet.banhang.NoSuchTrangThaiDonHangException if a trang thai don hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TrangThaiDonHang findByPrimaryKey(long trangThaiDonHangId)
		throws NoSuchTrangThaiDonHangException, SystemException {
		return findByPrimaryKey((Serializable)trangThaiDonHangId);
	}

	/**
	 * Returns the trang thai don hang with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the trang thai don hang
	 * @return the trang thai don hang, or <code>null</code> if a trang thai don hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TrangThaiDonHang fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		TrangThaiDonHang trangThaiDonHang = (TrangThaiDonHang)EntityCacheUtil.getResult(TrangThaiDonHangModelImpl.ENTITY_CACHE_ENABLED,
				TrangThaiDonHangImpl.class, primaryKey);

		if (trangThaiDonHang == _nullTrangThaiDonHang) {
			return null;
		}

		if (trangThaiDonHang == null) {
			Session session = null;

			try {
				session = openSession();

				trangThaiDonHang = (TrangThaiDonHang)session.get(TrangThaiDonHangImpl.class,
						primaryKey);

				if (trangThaiDonHang != null) {
					cacheResult(trangThaiDonHang);
				}
				else {
					EntityCacheUtil.putResult(TrangThaiDonHangModelImpl.ENTITY_CACHE_ENABLED,
						TrangThaiDonHangImpl.class, primaryKey,
						_nullTrangThaiDonHang);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(TrangThaiDonHangModelImpl.ENTITY_CACHE_ENABLED,
					TrangThaiDonHangImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return trangThaiDonHang;
	}

	/**
	 * Returns the trang thai don hang with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param trangThaiDonHangId the primary key of the trang thai don hang
	 * @return the trang thai don hang, or <code>null</code> if a trang thai don hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public TrangThaiDonHang fetchByPrimaryKey(long trangThaiDonHangId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)trangThaiDonHangId);
	}

	/**
	 * Returns all the trang thai don hangs.
	 *
	 * @return the trang thai don hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TrangThaiDonHang> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the trang thai don hangs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.TrangThaiDonHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of trang thai don hangs
	 * @param end the upper bound of the range of trang thai don hangs (not inclusive)
	 * @return the range of trang thai don hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TrangThaiDonHang> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the trang thai don hangs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.TrangThaiDonHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of trang thai don hangs
	 * @param end the upper bound of the range of trang thai don hangs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of trang thai don hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<TrangThaiDonHang> findAll(int start, int end,
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

		List<TrangThaiDonHang> list = (List<TrangThaiDonHang>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_TRANGTHAIDONHANG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TRANGTHAIDONHANG;

				if (pagination) {
					sql = sql.concat(TrangThaiDonHangModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TrangThaiDonHang>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<TrangThaiDonHang>(list);
				}
				else {
					list = (List<TrangThaiDonHang>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the trang thai don hangs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (TrangThaiDonHang trangThaiDonHang : findAll()) {
			remove(trangThaiDonHang);
		}
	}

	/**
	 * Returns the number of trang thai don hangs.
	 *
	 * @return the number of trang thai don hangs
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

				Query q = session.createQuery(_SQL_COUNT_TRANGTHAIDONHANG);

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
	 * Initializes the trang thai don hang persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.minimart.portlet.banhang.model.TrangThaiDonHang")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<TrangThaiDonHang>> listenersList = new ArrayList<ModelListener<TrangThaiDonHang>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<TrangThaiDonHang>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(TrangThaiDonHangImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_TRANGTHAIDONHANG = "SELECT trangThaiDonHang FROM TrangThaiDonHang trangThaiDonHang";
	private static final String _SQL_SELECT_TRANGTHAIDONHANG_WHERE = "SELECT trangThaiDonHang FROM TrangThaiDonHang trangThaiDonHang WHERE ";
	private static final String _SQL_COUNT_TRANGTHAIDONHANG = "SELECT COUNT(trangThaiDonHang) FROM TrangThaiDonHang trangThaiDonHang";
	private static final String _SQL_COUNT_TRANGTHAIDONHANG_WHERE = "SELECT COUNT(trangThaiDonHang) FROM TrangThaiDonHang trangThaiDonHang WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "trangThaiDonHang.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TrangThaiDonHang exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TrangThaiDonHang exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(TrangThaiDonHangPersistenceImpl.class);
	private static TrangThaiDonHang _nullTrangThaiDonHang = new TrangThaiDonHangImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<TrangThaiDonHang> toCacheModel() {
				return _nullTrangThaiDonHangCacheModel;
			}
		};

	private static CacheModel<TrangThaiDonHang> _nullTrangThaiDonHangCacheModel = new CacheModel<TrangThaiDonHang>() {
			@Override
			public TrangThaiDonHang toEntityModel() {
				return _nullTrangThaiDonHang;
			}
		};
}