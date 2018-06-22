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

package com.minimart.portlet.khohang.service.persistence;

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

import com.minimart.portlet.khohang.NoSuchKhoHangException;
import com.minimart.portlet.khohang.model.KhoHang;
import com.minimart.portlet.khohang.model.impl.KhoHangImpl;
import com.minimart.portlet.khohang.model.impl.KhoHangModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the kho hang service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see KhoHangPersistence
 * @see KhoHangUtil
 * @generated
 */
public class KhoHangPersistenceImpl extends BasePersistenceImpl<KhoHang>
	implements KhoHangPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link KhoHangUtil} to access the kho hang persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = KhoHangImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(KhoHangModelImpl.ENTITY_CACHE_ENABLED,
			KhoHangModelImpl.FINDER_CACHE_ENABLED, KhoHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(KhoHangModelImpl.ENTITY_CACHE_ENABLED,
			KhoHangModelImpl.FINDER_CACHE_ENABLED, KhoHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(KhoHangModelImpl.ENTITY_CACHE_ENABLED,
			KhoHangModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN = new FinderPath(KhoHangModelImpl.ENTITY_CACHE_ENABLED,
			KhoHangModelImpl.FINDER_CACHE_ENABLED, KhoHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTen",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN = new FinderPath(KhoHangModelImpl.ENTITY_CACHE_ENABLED,
			KhoHangModelImpl.FINDER_CACHE_ENABLED, KhoHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTen",
			new String[] { String.class.getName() },
			KhoHangModelImpl.TEN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEN = new FinderPath(KhoHangModelImpl.ENTITY_CACHE_ENABLED,
			KhoHangModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTen",
			new String[] { String.class.getName() });

	/**
	 * Returns all the kho hangs where ten = &#63;.
	 *
	 * @param ten the ten
	 * @return the matching kho hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KhoHang> findByTen(String ten) throws SystemException {
		return findByTen(ten, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the kho hangs where ten = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khohang.model.impl.KhoHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param start the lower bound of the range of kho hangs
	 * @param end the upper bound of the range of kho hangs (not inclusive)
	 * @return the range of matching kho hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KhoHang> findByTen(String ten, int start, int end)
		throws SystemException {
		return findByTen(ten, start, end, null);
	}

	/**
	 * Returns an ordered range of all the kho hangs where ten = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khohang.model.impl.KhoHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param start the lower bound of the range of kho hangs
	 * @param end the upper bound of the range of kho hangs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching kho hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KhoHang> findByTen(String ten, int start, int end,
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

		List<KhoHang> list = (List<KhoHang>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (KhoHang khoHang : list) {
				if (!Validator.equals(ten, khoHang.getTen())) {
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

			query.append(_SQL_SELECT_KHOHANG_WHERE);

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
				query.append(KhoHangModelImpl.ORDER_BY_JPQL);
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
					list = (List<KhoHang>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KhoHang>(list);
				}
				else {
					list = (List<KhoHang>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first kho hang in the ordered set where ten = &#63;.
	 *
	 * @param ten the ten
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kho hang
	 * @throws com.minimart.portlet.khohang.NoSuchKhoHangException if a matching kho hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhoHang findByTen_First(String ten,
		OrderByComparator orderByComparator)
		throws NoSuchKhoHangException, SystemException {
		KhoHang khoHang = fetchByTen_First(ten, orderByComparator);

		if (khoHang != null) {
			return khoHang;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKhoHangException(msg.toString());
	}

	/**
	 * Returns the first kho hang in the ordered set where ten = &#63;.
	 *
	 * @param ten the ten
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kho hang, or <code>null</code> if a matching kho hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhoHang fetchByTen_First(String ten,
		OrderByComparator orderByComparator) throws SystemException {
		List<KhoHang> list = findByTen(ten, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last kho hang in the ordered set where ten = &#63;.
	 *
	 * @param ten the ten
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kho hang
	 * @throws com.minimart.portlet.khohang.NoSuchKhoHangException if a matching kho hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhoHang findByTen_Last(String ten,
		OrderByComparator orderByComparator)
		throws NoSuchKhoHangException, SystemException {
		KhoHang khoHang = fetchByTen_Last(ten, orderByComparator);

		if (khoHang != null) {
			return khoHang;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKhoHangException(msg.toString());
	}

	/**
	 * Returns the last kho hang in the ordered set where ten = &#63;.
	 *
	 * @param ten the ten
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kho hang, or <code>null</code> if a matching kho hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhoHang fetchByTen_Last(String ten,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTen(ten);

		if (count == 0) {
			return null;
		}

		List<KhoHang> list = findByTen(ten, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the kho hangs before and after the current kho hang in the ordered set where ten = &#63;.
	 *
	 * @param khoHangId the primary key of the current kho hang
	 * @param ten the ten
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next kho hang
	 * @throws com.minimart.portlet.khohang.NoSuchKhoHangException if a kho hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhoHang[] findByTen_PrevAndNext(long khoHangId, String ten,
		OrderByComparator orderByComparator)
		throws NoSuchKhoHangException, SystemException {
		KhoHang khoHang = findByPrimaryKey(khoHangId);

		Session session = null;

		try {
			session = openSession();

			KhoHang[] array = new KhoHangImpl[3];

			array[0] = getByTen_PrevAndNext(session, khoHang, ten,
					orderByComparator, true);

			array[1] = khoHang;

			array[2] = getByTen_PrevAndNext(session, khoHang, ten,
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

	protected KhoHang getByTen_PrevAndNext(Session session, KhoHang khoHang,
		String ten, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KHOHANG_WHERE);

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
			query.append(KhoHangModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(khoHang);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<KhoHang> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the kho hangs where ten = &#63; from the database.
	 *
	 * @param ten the ten
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTen(String ten) throws SystemException {
		for (KhoHang khoHang : findByTen(ten, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(khoHang);
		}
	}

	/**
	 * Returns the number of kho hangs where ten = &#63;.
	 *
	 * @param ten the ten
	 * @return the number of matching kho hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTen(String ten) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TEN;

		Object[] finderArgs = new Object[] { ten };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_KHOHANG_WHERE);

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

	private static final String _FINDER_COLUMN_TEN_TEN_1 = "khoHang.ten IS NULL";
	private static final String _FINDER_COLUMN_TEN_TEN_2 = "khoHang.ten = ?";
	private static final String _FINDER_COLUMN_TEN_TEN_3 = "(khoHang.ten IS NULL OR khoHang.ten = '')";

	public KhoHangPersistenceImpl() {
		setModelClass(KhoHang.class);
	}

	/**
	 * Caches the kho hang in the entity cache if it is enabled.
	 *
	 * @param khoHang the kho hang
	 */
	@Override
	public void cacheResult(KhoHang khoHang) {
		EntityCacheUtil.putResult(KhoHangModelImpl.ENTITY_CACHE_ENABLED,
			KhoHangImpl.class, khoHang.getPrimaryKey(), khoHang);

		khoHang.resetOriginalValues();
	}

	/**
	 * Caches the kho hangs in the entity cache if it is enabled.
	 *
	 * @param khoHangs the kho hangs
	 */
	@Override
	public void cacheResult(List<KhoHang> khoHangs) {
		for (KhoHang khoHang : khoHangs) {
			if (EntityCacheUtil.getResult(
						KhoHangModelImpl.ENTITY_CACHE_ENABLED,
						KhoHangImpl.class, khoHang.getPrimaryKey()) == null) {
				cacheResult(khoHang);
			}
			else {
				khoHang.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all kho hangs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(KhoHangImpl.class.getName());
		}

		EntityCacheUtil.clearCache(KhoHangImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the kho hang.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(KhoHang khoHang) {
		EntityCacheUtil.removeResult(KhoHangModelImpl.ENTITY_CACHE_ENABLED,
			KhoHangImpl.class, khoHang.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<KhoHang> khoHangs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (KhoHang khoHang : khoHangs) {
			EntityCacheUtil.removeResult(KhoHangModelImpl.ENTITY_CACHE_ENABLED,
				KhoHangImpl.class, khoHang.getPrimaryKey());
		}
	}

	/**
	 * Creates a new kho hang with the primary key. Does not add the kho hang to the database.
	 *
	 * @param khoHangId the primary key for the new kho hang
	 * @return the new kho hang
	 */
	@Override
	public KhoHang create(long khoHangId) {
		KhoHang khoHang = new KhoHangImpl();

		khoHang.setNew(true);
		khoHang.setPrimaryKey(khoHangId);

		return khoHang;
	}

	/**
	 * Removes the kho hang with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param khoHangId the primary key of the kho hang
	 * @return the kho hang that was removed
	 * @throws com.minimart.portlet.khohang.NoSuchKhoHangException if a kho hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhoHang remove(long khoHangId)
		throws NoSuchKhoHangException, SystemException {
		return remove((Serializable)khoHangId);
	}

	/**
	 * Removes the kho hang with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the kho hang
	 * @return the kho hang that was removed
	 * @throws com.minimart.portlet.khohang.NoSuchKhoHangException if a kho hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhoHang remove(Serializable primaryKey)
		throws NoSuchKhoHangException, SystemException {
		Session session = null;

		try {
			session = openSession();

			KhoHang khoHang = (KhoHang)session.get(KhoHangImpl.class, primaryKey);

			if (khoHang == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchKhoHangException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(khoHang);
		}
		catch (NoSuchKhoHangException nsee) {
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
	protected KhoHang removeImpl(KhoHang khoHang) throws SystemException {
		khoHang = toUnwrappedModel(khoHang);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(khoHang)) {
				khoHang = (KhoHang)session.get(KhoHangImpl.class,
						khoHang.getPrimaryKeyObj());
			}

			if (khoHang != null) {
				session.delete(khoHang);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (khoHang != null) {
			clearCache(khoHang);
		}

		return khoHang;
	}

	@Override
	public KhoHang updateImpl(
		com.minimart.portlet.khohang.model.KhoHang khoHang)
		throws SystemException {
		khoHang = toUnwrappedModel(khoHang);

		boolean isNew = khoHang.isNew();

		KhoHangModelImpl khoHangModelImpl = (KhoHangModelImpl)khoHang;

		Session session = null;

		try {
			session = openSession();

			if (khoHang.isNew()) {
				session.save(khoHang);

				khoHang.setNew(false);
			}
			else {
				session.merge(khoHang);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !KhoHangModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((khoHangModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { khoHangModelImpl.getOriginalTen() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN,
					args);

				args = new Object[] { khoHangModelImpl.getTen() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN,
					args);
			}
		}

		EntityCacheUtil.putResult(KhoHangModelImpl.ENTITY_CACHE_ENABLED,
			KhoHangImpl.class, khoHang.getPrimaryKey(), khoHang);

		return khoHang;
	}

	protected KhoHang toUnwrappedModel(KhoHang khoHang) {
		if (khoHang instanceof KhoHangImpl) {
			return khoHang;
		}

		KhoHangImpl khoHangImpl = new KhoHangImpl();

		khoHangImpl.setNew(khoHang.isNew());
		khoHangImpl.setPrimaryKey(khoHang.getPrimaryKey());

		khoHangImpl.setKhoHangId(khoHang.getKhoHangId());
		khoHangImpl.setCompanyId(khoHang.getCompanyId());
		khoHangImpl.setUserId(khoHang.getUserId());
		khoHangImpl.setUserName(khoHang.getUserName());
		khoHangImpl.setCreateDate(khoHang.getCreateDate());
		khoHangImpl.setModifiedDate(khoHang.getModifiedDate());
		khoHangImpl.setTen(khoHang.getTen());
		khoHangImpl.setTrangThai(khoHang.isTrangThai());
		khoHangImpl.setItemType(khoHang.getItemType());
		khoHangImpl.setChoPhepNhapKho(khoHang.isChoPhepNhapKho());
		khoHangImpl.setCuaHangId(khoHang.getCuaHangId());
		khoHangImpl.setAutoId(khoHang.getAutoId());
		khoHangImpl.setSigmaId(khoHang.getSigmaId());
		khoHangImpl.setGhiChu(khoHang.getGhiChu());

		return khoHangImpl;
	}

	/**
	 * Returns the kho hang with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the kho hang
	 * @return the kho hang
	 * @throws com.minimart.portlet.khohang.NoSuchKhoHangException if a kho hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhoHang findByPrimaryKey(Serializable primaryKey)
		throws NoSuchKhoHangException, SystemException {
		KhoHang khoHang = fetchByPrimaryKey(primaryKey);

		if (khoHang == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchKhoHangException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return khoHang;
	}

	/**
	 * Returns the kho hang with the primary key or throws a {@link com.minimart.portlet.khohang.NoSuchKhoHangException} if it could not be found.
	 *
	 * @param khoHangId the primary key of the kho hang
	 * @return the kho hang
	 * @throws com.minimart.portlet.khohang.NoSuchKhoHangException if a kho hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhoHang findByPrimaryKey(long khoHangId)
		throws NoSuchKhoHangException, SystemException {
		return findByPrimaryKey((Serializable)khoHangId);
	}

	/**
	 * Returns the kho hang with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the kho hang
	 * @return the kho hang, or <code>null</code> if a kho hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhoHang fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		KhoHang khoHang = (KhoHang)EntityCacheUtil.getResult(KhoHangModelImpl.ENTITY_CACHE_ENABLED,
				KhoHangImpl.class, primaryKey);

		if (khoHang == _nullKhoHang) {
			return null;
		}

		if (khoHang == null) {
			Session session = null;

			try {
				session = openSession();

				khoHang = (KhoHang)session.get(KhoHangImpl.class, primaryKey);

				if (khoHang != null) {
					cacheResult(khoHang);
				}
				else {
					EntityCacheUtil.putResult(KhoHangModelImpl.ENTITY_CACHE_ENABLED,
						KhoHangImpl.class, primaryKey, _nullKhoHang);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(KhoHangModelImpl.ENTITY_CACHE_ENABLED,
					KhoHangImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return khoHang;
	}

	/**
	 * Returns the kho hang with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param khoHangId the primary key of the kho hang
	 * @return the kho hang, or <code>null</code> if a kho hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhoHang fetchByPrimaryKey(long khoHangId) throws SystemException {
		return fetchByPrimaryKey((Serializable)khoHangId);
	}

	/**
	 * Returns all the kho hangs.
	 *
	 * @return the kho hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KhoHang> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the kho hangs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khohang.model.impl.KhoHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of kho hangs
	 * @param end the upper bound of the range of kho hangs (not inclusive)
	 * @return the range of kho hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KhoHang> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the kho hangs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khohang.model.impl.KhoHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of kho hangs
	 * @param end the upper bound of the range of kho hangs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of kho hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KhoHang> findAll(int start, int end,
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

		List<KhoHang> list = (List<KhoHang>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_KHOHANG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_KHOHANG;

				if (pagination) {
					sql = sql.concat(KhoHangModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<KhoHang>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KhoHang>(list);
				}
				else {
					list = (List<KhoHang>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the kho hangs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (KhoHang khoHang : findAll()) {
			remove(khoHang);
		}
	}

	/**
	 * Returns the number of kho hangs.
	 *
	 * @return the number of kho hangs
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

				Query q = session.createQuery(_SQL_COUNT_KHOHANG);

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
	 * Initializes the kho hang persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.minimart.portlet.khohang.model.KhoHang")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<KhoHang>> listenersList = new ArrayList<ModelListener<KhoHang>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<KhoHang>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(KhoHangImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_KHOHANG = "SELECT khoHang FROM KhoHang khoHang";
	private static final String _SQL_SELECT_KHOHANG_WHERE = "SELECT khoHang FROM KhoHang khoHang WHERE ";
	private static final String _SQL_COUNT_KHOHANG = "SELECT COUNT(khoHang) FROM KhoHang khoHang";
	private static final String _SQL_COUNT_KHOHANG_WHERE = "SELECT COUNT(khoHang) FROM KhoHang khoHang WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "khoHang.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No KhoHang exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No KhoHang exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(KhoHangPersistenceImpl.class);
	private static KhoHang _nullKhoHang = new KhoHangImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<KhoHang> toCacheModel() {
				return _nullKhoHangCacheModel;
			}
		};

	private static CacheModel<KhoHang> _nullKhoHangCacheModel = new CacheModel<KhoHang>() {
			@Override
			public KhoHang toEntityModel() {
				return _nullKhoHang;
			}
		};
}