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

package com.minimart.portlet.nhacungcap.service.persistence;

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

import com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException;
import com.minimart.portlet.nhacungcap.model.NhaCungCap;
import com.minimart.portlet.nhacungcap.model.impl.NhaCungCapImpl;
import com.minimart.portlet.nhacungcap.model.impl.NhaCungCapModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the nha cung cap service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see NhaCungCapPersistence
 * @see NhaCungCapUtil
 * @generated
 */
public class NhaCungCapPersistenceImpl extends BasePersistenceImpl<NhaCungCap>
	implements NhaCungCapPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link NhaCungCapUtil} to access the nha cung cap persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = NhaCungCapImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(NhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
			NhaCungCapModelImpl.FINDER_CACHE_ENABLED, NhaCungCapImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(NhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
			NhaCungCapModelImpl.FINDER_CACHE_ENABLED, NhaCungCapImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(NhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
			NhaCungCapModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_MA = new FinderPath(NhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
			NhaCungCapModelImpl.FINDER_CACHE_ENABLED, NhaCungCapImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTEN_MA",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA =
		new FinderPath(NhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
			NhaCungCapModelImpl.FINDER_CACHE_ENABLED, NhaCungCapImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTEN_MA",
			new String[] { String.class.getName(), String.class.getName() },
			NhaCungCapModelImpl.TENNHACUNGCAP_COLUMN_BITMASK |
			NhaCungCapModelImpl.MANHACUNGCAP_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEN_MA = new FinderPath(NhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
			NhaCungCapModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTEN_MA",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the nha cung caps where tenNhaCungCap = &#63; and maNhaCungCap = &#63;.
	 *
	 * @param tenNhaCungCap the ten nha cung cap
	 * @param maNhaCungCap the ma nha cung cap
	 * @return the matching nha cung caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhaCungCap> findByTEN_MA(String tenNhaCungCap,
		String maNhaCungCap) throws SystemException {
		return findByTEN_MA(tenNhaCungCap, maNhaCungCap, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the nha cung caps where tenNhaCungCap = &#63; and maNhaCungCap = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tenNhaCungCap the ten nha cung cap
	 * @param maNhaCungCap the ma nha cung cap
	 * @param start the lower bound of the range of nha cung caps
	 * @param end the upper bound of the range of nha cung caps (not inclusive)
	 * @return the range of matching nha cung caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhaCungCap> findByTEN_MA(String tenNhaCungCap,
		String maNhaCungCap, int start, int end) throws SystemException {
		return findByTEN_MA(tenNhaCungCap, maNhaCungCap, start, end, null);
	}

	/**
	 * Returns an ordered range of all the nha cung caps where tenNhaCungCap = &#63; and maNhaCungCap = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tenNhaCungCap the ten nha cung cap
	 * @param maNhaCungCap the ma nha cung cap
	 * @param start the lower bound of the range of nha cung caps
	 * @param end the upper bound of the range of nha cung caps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching nha cung caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhaCungCap> findByTEN_MA(String tenNhaCungCap,
		String maNhaCungCap, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA;
			finderArgs = new Object[] { tenNhaCungCap, maNhaCungCap };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_MA;
			finderArgs = new Object[] {
					tenNhaCungCap, maNhaCungCap,
					
					start, end, orderByComparator
				};
		}

		List<NhaCungCap> list = (List<NhaCungCap>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (NhaCungCap nhaCungCap : list) {
				if (!Validator.equals(tenNhaCungCap,
							nhaCungCap.getTenNhaCungCap()) ||
						!Validator.equals(maNhaCungCap,
							nhaCungCap.getMaNhaCungCap())) {
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

			query.append(_SQL_SELECT_NHACUNGCAP_WHERE);

			boolean bindTenNhaCungCap = false;

			if (tenNhaCungCap == null) {
				query.append(_FINDER_COLUMN_TEN_MA_TENNHACUNGCAP_1);
			}
			else if (tenNhaCungCap.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_MA_TENNHACUNGCAP_3);
			}
			else {
				bindTenNhaCungCap = true;

				query.append(_FINDER_COLUMN_TEN_MA_TENNHACUNGCAP_2);
			}

			boolean bindMaNhaCungCap = false;

			if (maNhaCungCap == null) {
				query.append(_FINDER_COLUMN_TEN_MA_MANHACUNGCAP_1);
			}
			else if (maNhaCungCap.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_MA_MANHACUNGCAP_3);
			}
			else {
				bindMaNhaCungCap = true;

				query.append(_FINDER_COLUMN_TEN_MA_MANHACUNGCAP_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(NhaCungCapModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTenNhaCungCap) {
					qPos.add(tenNhaCungCap);
				}

				if (bindMaNhaCungCap) {
					qPos.add(maNhaCungCap);
				}

				if (!pagination) {
					list = (List<NhaCungCap>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NhaCungCap>(list);
				}
				else {
					list = (List<NhaCungCap>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first nha cung cap in the ordered set where tenNhaCungCap = &#63; and maNhaCungCap = &#63;.
	 *
	 * @param tenNhaCungCap the ten nha cung cap
	 * @param maNhaCungCap the ma nha cung cap
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nha cung cap
	 * @throws com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException if a matching nha cung cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhaCungCap findByTEN_MA_First(String tenNhaCungCap,
		String maNhaCungCap, OrderByComparator orderByComparator)
		throws NoSuchNhaCungCapException, SystemException {
		NhaCungCap nhaCungCap = fetchByTEN_MA_First(tenNhaCungCap,
				maNhaCungCap, orderByComparator);

		if (nhaCungCap != null) {
			return nhaCungCap;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tenNhaCungCap=");
		msg.append(tenNhaCungCap);

		msg.append(", maNhaCungCap=");
		msg.append(maNhaCungCap);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNhaCungCapException(msg.toString());
	}

	/**
	 * Returns the first nha cung cap in the ordered set where tenNhaCungCap = &#63; and maNhaCungCap = &#63;.
	 *
	 * @param tenNhaCungCap the ten nha cung cap
	 * @param maNhaCungCap the ma nha cung cap
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nha cung cap, or <code>null</code> if a matching nha cung cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhaCungCap fetchByTEN_MA_First(String tenNhaCungCap,
		String maNhaCungCap, OrderByComparator orderByComparator)
		throws SystemException {
		List<NhaCungCap> list = findByTEN_MA(tenNhaCungCap, maNhaCungCap, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last nha cung cap in the ordered set where tenNhaCungCap = &#63; and maNhaCungCap = &#63;.
	 *
	 * @param tenNhaCungCap the ten nha cung cap
	 * @param maNhaCungCap the ma nha cung cap
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nha cung cap
	 * @throws com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException if a matching nha cung cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhaCungCap findByTEN_MA_Last(String tenNhaCungCap,
		String maNhaCungCap, OrderByComparator orderByComparator)
		throws NoSuchNhaCungCapException, SystemException {
		NhaCungCap nhaCungCap = fetchByTEN_MA_Last(tenNhaCungCap, maNhaCungCap,
				orderByComparator);

		if (nhaCungCap != null) {
			return nhaCungCap;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tenNhaCungCap=");
		msg.append(tenNhaCungCap);

		msg.append(", maNhaCungCap=");
		msg.append(maNhaCungCap);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNhaCungCapException(msg.toString());
	}

	/**
	 * Returns the last nha cung cap in the ordered set where tenNhaCungCap = &#63; and maNhaCungCap = &#63;.
	 *
	 * @param tenNhaCungCap the ten nha cung cap
	 * @param maNhaCungCap the ma nha cung cap
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nha cung cap, or <code>null</code> if a matching nha cung cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhaCungCap fetchByTEN_MA_Last(String tenNhaCungCap,
		String maNhaCungCap, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByTEN_MA(tenNhaCungCap, maNhaCungCap);

		if (count == 0) {
			return null;
		}

		List<NhaCungCap> list = findByTEN_MA(tenNhaCungCap, maNhaCungCap,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the nha cung caps before and after the current nha cung cap in the ordered set where tenNhaCungCap = &#63; and maNhaCungCap = &#63;.
	 *
	 * @param nhaCungCapId the primary key of the current nha cung cap
	 * @param tenNhaCungCap the ten nha cung cap
	 * @param maNhaCungCap the ma nha cung cap
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next nha cung cap
	 * @throws com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException if a nha cung cap with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhaCungCap[] findByTEN_MA_PrevAndNext(long nhaCungCapId,
		String tenNhaCungCap, String maNhaCungCap,
		OrderByComparator orderByComparator)
		throws NoSuchNhaCungCapException, SystemException {
		NhaCungCap nhaCungCap = findByPrimaryKey(nhaCungCapId);

		Session session = null;

		try {
			session = openSession();

			NhaCungCap[] array = new NhaCungCapImpl[3];

			array[0] = getByTEN_MA_PrevAndNext(session, nhaCungCap,
					tenNhaCungCap, maNhaCungCap, orderByComparator, true);

			array[1] = nhaCungCap;

			array[2] = getByTEN_MA_PrevAndNext(session, nhaCungCap,
					tenNhaCungCap, maNhaCungCap, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected NhaCungCap getByTEN_MA_PrevAndNext(Session session,
		NhaCungCap nhaCungCap, String tenNhaCungCap, String maNhaCungCap,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_NHACUNGCAP_WHERE);

		boolean bindTenNhaCungCap = false;

		if (tenNhaCungCap == null) {
			query.append(_FINDER_COLUMN_TEN_MA_TENNHACUNGCAP_1);
		}
		else if (tenNhaCungCap.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TEN_MA_TENNHACUNGCAP_3);
		}
		else {
			bindTenNhaCungCap = true;

			query.append(_FINDER_COLUMN_TEN_MA_TENNHACUNGCAP_2);
		}

		boolean bindMaNhaCungCap = false;

		if (maNhaCungCap == null) {
			query.append(_FINDER_COLUMN_TEN_MA_MANHACUNGCAP_1);
		}
		else if (maNhaCungCap.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TEN_MA_MANHACUNGCAP_3);
		}
		else {
			bindMaNhaCungCap = true;

			query.append(_FINDER_COLUMN_TEN_MA_MANHACUNGCAP_2);
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
			query.append(NhaCungCapModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindTenNhaCungCap) {
			qPos.add(tenNhaCungCap);
		}

		if (bindMaNhaCungCap) {
			qPos.add(maNhaCungCap);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(nhaCungCap);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<NhaCungCap> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the nha cung caps where tenNhaCungCap = &#63; and maNhaCungCap = &#63; from the database.
	 *
	 * @param tenNhaCungCap the ten nha cung cap
	 * @param maNhaCungCap the ma nha cung cap
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTEN_MA(String tenNhaCungCap, String maNhaCungCap)
		throws SystemException {
		for (NhaCungCap nhaCungCap : findByTEN_MA(tenNhaCungCap, maNhaCungCap,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(nhaCungCap);
		}
	}

	/**
	 * Returns the number of nha cung caps where tenNhaCungCap = &#63; and maNhaCungCap = &#63;.
	 *
	 * @param tenNhaCungCap the ten nha cung cap
	 * @param maNhaCungCap the ma nha cung cap
	 * @return the number of matching nha cung caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTEN_MA(String tenNhaCungCap, String maNhaCungCap)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TEN_MA;

		Object[] finderArgs = new Object[] { tenNhaCungCap, maNhaCungCap };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_NHACUNGCAP_WHERE);

			boolean bindTenNhaCungCap = false;

			if (tenNhaCungCap == null) {
				query.append(_FINDER_COLUMN_TEN_MA_TENNHACUNGCAP_1);
			}
			else if (tenNhaCungCap.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_MA_TENNHACUNGCAP_3);
			}
			else {
				bindTenNhaCungCap = true;

				query.append(_FINDER_COLUMN_TEN_MA_TENNHACUNGCAP_2);
			}

			boolean bindMaNhaCungCap = false;

			if (maNhaCungCap == null) {
				query.append(_FINDER_COLUMN_TEN_MA_MANHACUNGCAP_1);
			}
			else if (maNhaCungCap.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_MA_MANHACUNGCAP_3);
			}
			else {
				bindMaNhaCungCap = true;

				query.append(_FINDER_COLUMN_TEN_MA_MANHACUNGCAP_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTenNhaCungCap) {
					qPos.add(tenNhaCungCap);
				}

				if (bindMaNhaCungCap) {
					qPos.add(maNhaCungCap);
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

	private static final String _FINDER_COLUMN_TEN_MA_TENNHACUNGCAP_1 = "nhaCungCap.tenNhaCungCap IS NULL AND ";
	private static final String _FINDER_COLUMN_TEN_MA_TENNHACUNGCAP_2 = "nhaCungCap.tenNhaCungCap = ? AND ";
	private static final String _FINDER_COLUMN_TEN_MA_TENNHACUNGCAP_3 = "(nhaCungCap.tenNhaCungCap IS NULL OR nhaCungCap.tenNhaCungCap = '') AND ";
	private static final String _FINDER_COLUMN_TEN_MA_MANHACUNGCAP_1 = "nhaCungCap.maNhaCungCap IS NULL";
	private static final String _FINDER_COLUMN_TEN_MA_MANHACUNGCAP_2 = "nhaCungCap.maNhaCungCap = ?";
	private static final String _FINDER_COLUMN_TEN_MA_MANHACUNGCAP_3 = "(nhaCungCap.maNhaCungCap IS NULL OR nhaCungCap.maNhaCungCap = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_MA_NHOM =
		new FinderPath(NhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
			NhaCungCapModelImpl.FINDER_CACHE_ENABLED, NhaCungCapImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTEN_MA_NHOM",
			new String[] {
				String.class.getName(), String.class.getName(),
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_NHOM =
		new FinderPath(NhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
			NhaCungCapModelImpl.FINDER_CACHE_ENABLED, NhaCungCapImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTEN_MA_NHOM",
			new String[] {
				String.class.getName(), String.class.getName(),
				Long.class.getName()
			},
			NhaCungCapModelImpl.TENNHACUNGCAP_COLUMN_BITMASK |
			NhaCungCapModelImpl.MANHACUNGCAP_COLUMN_BITMASK |
			NhaCungCapModelImpl.NHOMNHACUNGCAPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEN_MA_NHOM = new FinderPath(NhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
			NhaCungCapModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTEN_MA_NHOM",
			new String[] {
				String.class.getName(), String.class.getName(),
				Long.class.getName()
			});

	/**
	 * Returns all the nha cung caps where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63;.
	 *
	 * @param tenNhaCungCap the ten nha cung cap
	 * @param maNhaCungCap the ma nha cung cap
	 * @param nhomNhaCungCapId the nhom nha cung cap ID
	 * @return the matching nha cung caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhaCungCap> findByTEN_MA_NHOM(String tenNhaCungCap,
		String maNhaCungCap, long nhomNhaCungCapId) throws SystemException {
		return findByTEN_MA_NHOM(tenNhaCungCap, maNhaCungCap, nhomNhaCungCapId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the nha cung caps where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tenNhaCungCap the ten nha cung cap
	 * @param maNhaCungCap the ma nha cung cap
	 * @param nhomNhaCungCapId the nhom nha cung cap ID
	 * @param start the lower bound of the range of nha cung caps
	 * @param end the upper bound of the range of nha cung caps (not inclusive)
	 * @return the range of matching nha cung caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhaCungCap> findByTEN_MA_NHOM(String tenNhaCungCap,
		String maNhaCungCap, long nhomNhaCungCapId, int start, int end)
		throws SystemException {
		return findByTEN_MA_NHOM(tenNhaCungCap, maNhaCungCap, nhomNhaCungCapId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the nha cung caps where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tenNhaCungCap the ten nha cung cap
	 * @param maNhaCungCap the ma nha cung cap
	 * @param nhomNhaCungCapId the nhom nha cung cap ID
	 * @param start the lower bound of the range of nha cung caps
	 * @param end the upper bound of the range of nha cung caps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching nha cung caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhaCungCap> findByTEN_MA_NHOM(String tenNhaCungCap,
		String maNhaCungCap, long nhomNhaCungCapId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_NHOM;
			finderArgs = new Object[] {
					tenNhaCungCap, maNhaCungCap, nhomNhaCungCapId
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_MA_NHOM;
			finderArgs = new Object[] {
					tenNhaCungCap, maNhaCungCap, nhomNhaCungCapId,
					
					start, end, orderByComparator
				};
		}

		List<NhaCungCap> list = (List<NhaCungCap>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (NhaCungCap nhaCungCap : list) {
				if (!Validator.equals(tenNhaCungCap,
							nhaCungCap.getTenNhaCungCap()) ||
						!Validator.equals(maNhaCungCap,
							nhaCungCap.getMaNhaCungCap()) ||
						(nhomNhaCungCapId != nhaCungCap.getNhomNhaCungCapId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_NHACUNGCAP_WHERE);

			boolean bindTenNhaCungCap = false;

			if (tenNhaCungCap == null) {
				query.append(_FINDER_COLUMN_TEN_MA_NHOM_TENNHACUNGCAP_1);
			}
			else if (tenNhaCungCap.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_MA_NHOM_TENNHACUNGCAP_3);
			}
			else {
				bindTenNhaCungCap = true;

				query.append(_FINDER_COLUMN_TEN_MA_NHOM_TENNHACUNGCAP_2);
			}

			boolean bindMaNhaCungCap = false;

			if (maNhaCungCap == null) {
				query.append(_FINDER_COLUMN_TEN_MA_NHOM_MANHACUNGCAP_1);
			}
			else if (maNhaCungCap.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_MA_NHOM_MANHACUNGCAP_3);
			}
			else {
				bindMaNhaCungCap = true;

				query.append(_FINDER_COLUMN_TEN_MA_NHOM_MANHACUNGCAP_2);
			}

			query.append(_FINDER_COLUMN_TEN_MA_NHOM_NHOMNHACUNGCAPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(NhaCungCapModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTenNhaCungCap) {
					qPos.add(tenNhaCungCap);
				}

				if (bindMaNhaCungCap) {
					qPos.add(maNhaCungCap);
				}

				qPos.add(nhomNhaCungCapId);

				if (!pagination) {
					list = (List<NhaCungCap>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NhaCungCap>(list);
				}
				else {
					list = (List<NhaCungCap>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first nha cung cap in the ordered set where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63;.
	 *
	 * @param tenNhaCungCap the ten nha cung cap
	 * @param maNhaCungCap the ma nha cung cap
	 * @param nhomNhaCungCapId the nhom nha cung cap ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nha cung cap
	 * @throws com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException if a matching nha cung cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhaCungCap findByTEN_MA_NHOM_First(String tenNhaCungCap,
		String maNhaCungCap, long nhomNhaCungCapId,
		OrderByComparator orderByComparator)
		throws NoSuchNhaCungCapException, SystemException {
		NhaCungCap nhaCungCap = fetchByTEN_MA_NHOM_First(tenNhaCungCap,
				maNhaCungCap, nhomNhaCungCapId, orderByComparator);

		if (nhaCungCap != null) {
			return nhaCungCap;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tenNhaCungCap=");
		msg.append(tenNhaCungCap);

		msg.append(", maNhaCungCap=");
		msg.append(maNhaCungCap);

		msg.append(", nhomNhaCungCapId=");
		msg.append(nhomNhaCungCapId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNhaCungCapException(msg.toString());
	}

	/**
	 * Returns the first nha cung cap in the ordered set where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63;.
	 *
	 * @param tenNhaCungCap the ten nha cung cap
	 * @param maNhaCungCap the ma nha cung cap
	 * @param nhomNhaCungCapId the nhom nha cung cap ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nha cung cap, or <code>null</code> if a matching nha cung cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhaCungCap fetchByTEN_MA_NHOM_First(String tenNhaCungCap,
		String maNhaCungCap, long nhomNhaCungCapId,
		OrderByComparator orderByComparator) throws SystemException {
		List<NhaCungCap> list = findByTEN_MA_NHOM(tenNhaCungCap, maNhaCungCap,
				nhomNhaCungCapId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last nha cung cap in the ordered set where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63;.
	 *
	 * @param tenNhaCungCap the ten nha cung cap
	 * @param maNhaCungCap the ma nha cung cap
	 * @param nhomNhaCungCapId the nhom nha cung cap ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nha cung cap
	 * @throws com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException if a matching nha cung cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhaCungCap findByTEN_MA_NHOM_Last(String tenNhaCungCap,
		String maNhaCungCap, long nhomNhaCungCapId,
		OrderByComparator orderByComparator)
		throws NoSuchNhaCungCapException, SystemException {
		NhaCungCap nhaCungCap = fetchByTEN_MA_NHOM_Last(tenNhaCungCap,
				maNhaCungCap, nhomNhaCungCapId, orderByComparator);

		if (nhaCungCap != null) {
			return nhaCungCap;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tenNhaCungCap=");
		msg.append(tenNhaCungCap);

		msg.append(", maNhaCungCap=");
		msg.append(maNhaCungCap);

		msg.append(", nhomNhaCungCapId=");
		msg.append(nhomNhaCungCapId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNhaCungCapException(msg.toString());
	}

	/**
	 * Returns the last nha cung cap in the ordered set where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63;.
	 *
	 * @param tenNhaCungCap the ten nha cung cap
	 * @param maNhaCungCap the ma nha cung cap
	 * @param nhomNhaCungCapId the nhom nha cung cap ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nha cung cap, or <code>null</code> if a matching nha cung cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhaCungCap fetchByTEN_MA_NHOM_Last(String tenNhaCungCap,
		String maNhaCungCap, long nhomNhaCungCapId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTEN_MA_NHOM(tenNhaCungCap, maNhaCungCap,
				nhomNhaCungCapId);

		if (count == 0) {
			return null;
		}

		List<NhaCungCap> list = findByTEN_MA_NHOM(tenNhaCungCap, maNhaCungCap,
				nhomNhaCungCapId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the nha cung caps before and after the current nha cung cap in the ordered set where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63;.
	 *
	 * @param nhaCungCapId the primary key of the current nha cung cap
	 * @param tenNhaCungCap the ten nha cung cap
	 * @param maNhaCungCap the ma nha cung cap
	 * @param nhomNhaCungCapId the nhom nha cung cap ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next nha cung cap
	 * @throws com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException if a nha cung cap with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhaCungCap[] findByTEN_MA_NHOM_PrevAndNext(long nhaCungCapId,
		String tenNhaCungCap, String maNhaCungCap, long nhomNhaCungCapId,
		OrderByComparator orderByComparator)
		throws NoSuchNhaCungCapException, SystemException {
		NhaCungCap nhaCungCap = findByPrimaryKey(nhaCungCapId);

		Session session = null;

		try {
			session = openSession();

			NhaCungCap[] array = new NhaCungCapImpl[3];

			array[0] = getByTEN_MA_NHOM_PrevAndNext(session, nhaCungCap,
					tenNhaCungCap, maNhaCungCap, nhomNhaCungCapId,
					orderByComparator, true);

			array[1] = nhaCungCap;

			array[2] = getByTEN_MA_NHOM_PrevAndNext(session, nhaCungCap,
					tenNhaCungCap, maNhaCungCap, nhomNhaCungCapId,
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

	protected NhaCungCap getByTEN_MA_NHOM_PrevAndNext(Session session,
		NhaCungCap nhaCungCap, String tenNhaCungCap, String maNhaCungCap,
		long nhomNhaCungCapId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_NHACUNGCAP_WHERE);

		boolean bindTenNhaCungCap = false;

		if (tenNhaCungCap == null) {
			query.append(_FINDER_COLUMN_TEN_MA_NHOM_TENNHACUNGCAP_1);
		}
		else if (tenNhaCungCap.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TEN_MA_NHOM_TENNHACUNGCAP_3);
		}
		else {
			bindTenNhaCungCap = true;

			query.append(_FINDER_COLUMN_TEN_MA_NHOM_TENNHACUNGCAP_2);
		}

		boolean bindMaNhaCungCap = false;

		if (maNhaCungCap == null) {
			query.append(_FINDER_COLUMN_TEN_MA_NHOM_MANHACUNGCAP_1);
		}
		else if (maNhaCungCap.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TEN_MA_NHOM_MANHACUNGCAP_3);
		}
		else {
			bindMaNhaCungCap = true;

			query.append(_FINDER_COLUMN_TEN_MA_NHOM_MANHACUNGCAP_2);
		}

		query.append(_FINDER_COLUMN_TEN_MA_NHOM_NHOMNHACUNGCAPID_2);

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
			query.append(NhaCungCapModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindTenNhaCungCap) {
			qPos.add(tenNhaCungCap);
		}

		if (bindMaNhaCungCap) {
			qPos.add(maNhaCungCap);
		}

		qPos.add(nhomNhaCungCapId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(nhaCungCap);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<NhaCungCap> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the nha cung caps where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63; from the database.
	 *
	 * @param tenNhaCungCap the ten nha cung cap
	 * @param maNhaCungCap the ma nha cung cap
	 * @param nhomNhaCungCapId the nhom nha cung cap ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTEN_MA_NHOM(String tenNhaCungCap, String maNhaCungCap,
		long nhomNhaCungCapId) throws SystemException {
		for (NhaCungCap nhaCungCap : findByTEN_MA_NHOM(tenNhaCungCap,
				maNhaCungCap, nhomNhaCungCapId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(nhaCungCap);
		}
	}

	/**
	 * Returns the number of nha cung caps where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63;.
	 *
	 * @param tenNhaCungCap the ten nha cung cap
	 * @param maNhaCungCap the ma nha cung cap
	 * @param nhomNhaCungCapId the nhom nha cung cap ID
	 * @return the number of matching nha cung caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTEN_MA_NHOM(String tenNhaCungCap, String maNhaCungCap,
		long nhomNhaCungCapId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TEN_MA_NHOM;

		Object[] finderArgs = new Object[] {
				tenNhaCungCap, maNhaCungCap, nhomNhaCungCapId
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_NHACUNGCAP_WHERE);

			boolean bindTenNhaCungCap = false;

			if (tenNhaCungCap == null) {
				query.append(_FINDER_COLUMN_TEN_MA_NHOM_TENNHACUNGCAP_1);
			}
			else if (tenNhaCungCap.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_MA_NHOM_TENNHACUNGCAP_3);
			}
			else {
				bindTenNhaCungCap = true;

				query.append(_FINDER_COLUMN_TEN_MA_NHOM_TENNHACUNGCAP_2);
			}

			boolean bindMaNhaCungCap = false;

			if (maNhaCungCap == null) {
				query.append(_FINDER_COLUMN_TEN_MA_NHOM_MANHACUNGCAP_1);
			}
			else if (maNhaCungCap.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_MA_NHOM_MANHACUNGCAP_3);
			}
			else {
				bindMaNhaCungCap = true;

				query.append(_FINDER_COLUMN_TEN_MA_NHOM_MANHACUNGCAP_2);
			}

			query.append(_FINDER_COLUMN_TEN_MA_NHOM_NHOMNHACUNGCAPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTenNhaCungCap) {
					qPos.add(tenNhaCungCap);
				}

				if (bindMaNhaCungCap) {
					qPos.add(maNhaCungCap);
				}

				qPos.add(nhomNhaCungCapId);

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

	private static final String _FINDER_COLUMN_TEN_MA_NHOM_TENNHACUNGCAP_1 = "nhaCungCap.tenNhaCungCap IS NULL AND ";
	private static final String _FINDER_COLUMN_TEN_MA_NHOM_TENNHACUNGCAP_2 = "nhaCungCap.tenNhaCungCap = ? AND ";
	private static final String _FINDER_COLUMN_TEN_MA_NHOM_TENNHACUNGCAP_3 = "(nhaCungCap.tenNhaCungCap IS NULL OR nhaCungCap.tenNhaCungCap = '') AND ";
	private static final String _FINDER_COLUMN_TEN_MA_NHOM_MANHACUNGCAP_1 = "nhaCungCap.maNhaCungCap IS NULL AND ";
	private static final String _FINDER_COLUMN_TEN_MA_NHOM_MANHACUNGCAP_2 = "nhaCungCap.maNhaCungCap = ? AND ";
	private static final String _FINDER_COLUMN_TEN_MA_NHOM_MANHACUNGCAP_3 = "(nhaCungCap.maNhaCungCap IS NULL OR nhaCungCap.maNhaCungCap = '') AND ";
	private static final String _FINDER_COLUMN_TEN_MA_NHOM_NHOMNHACUNGCAPID_2 = "nhaCungCap.nhomNhaCungCapId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_MA_NHOM_HD =
		new FinderPath(NhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
			NhaCungCapModelImpl.FINDER_CACHE_ENABLED, NhaCungCapImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTEN_MA_NHOM_HD",
			new String[] {
				String.class.getName(), String.class.getName(),
				Long.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_NHOM_HD =
		new FinderPath(NhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
			NhaCungCapModelImpl.FINDER_CACHE_ENABLED, NhaCungCapImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTEN_MA_NHOM_HD",
			new String[] {
				String.class.getName(), String.class.getName(),
				Long.class.getName(), Boolean.class.getName()
			},
			NhaCungCapModelImpl.TENNHACUNGCAP_COLUMN_BITMASK |
			NhaCungCapModelImpl.MANHACUNGCAP_COLUMN_BITMASK |
			NhaCungCapModelImpl.NHOMNHACUNGCAPID_COLUMN_BITMASK |
			NhaCungCapModelImpl.HOATDONG_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEN_MA_NHOM_HD = new FinderPath(NhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
			NhaCungCapModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTEN_MA_NHOM_HD",
			new String[] {
				String.class.getName(), String.class.getName(),
				Long.class.getName(), Boolean.class.getName()
			});

	/**
	 * Returns all the nha cung caps where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63; and hoatDong = &#63;.
	 *
	 * @param tenNhaCungCap the ten nha cung cap
	 * @param maNhaCungCap the ma nha cung cap
	 * @param nhomNhaCungCapId the nhom nha cung cap ID
	 * @param hoatDong the hoat dong
	 * @return the matching nha cung caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhaCungCap> findByTEN_MA_NHOM_HD(String tenNhaCungCap,
		String maNhaCungCap, long nhomNhaCungCapId, boolean hoatDong)
		throws SystemException {
		return findByTEN_MA_NHOM_HD(tenNhaCungCap, maNhaCungCap,
			nhomNhaCungCapId, hoatDong, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the nha cung caps where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tenNhaCungCap the ten nha cung cap
	 * @param maNhaCungCap the ma nha cung cap
	 * @param nhomNhaCungCapId the nhom nha cung cap ID
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of nha cung caps
	 * @param end the upper bound of the range of nha cung caps (not inclusive)
	 * @return the range of matching nha cung caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhaCungCap> findByTEN_MA_NHOM_HD(String tenNhaCungCap,
		String maNhaCungCap, long nhomNhaCungCapId, boolean hoatDong,
		int start, int end) throws SystemException {
		return findByTEN_MA_NHOM_HD(tenNhaCungCap, maNhaCungCap,
			nhomNhaCungCapId, hoatDong, start, end, null);
	}

	/**
	 * Returns an ordered range of all the nha cung caps where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param tenNhaCungCap the ten nha cung cap
	 * @param maNhaCungCap the ma nha cung cap
	 * @param nhomNhaCungCapId the nhom nha cung cap ID
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of nha cung caps
	 * @param end the upper bound of the range of nha cung caps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching nha cung caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhaCungCap> findByTEN_MA_NHOM_HD(String tenNhaCungCap,
		String maNhaCungCap, long nhomNhaCungCapId, boolean hoatDong,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_NHOM_HD;
			finderArgs = new Object[] {
					tenNhaCungCap, maNhaCungCap, nhomNhaCungCapId, hoatDong
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_MA_NHOM_HD;
			finderArgs = new Object[] {
					tenNhaCungCap, maNhaCungCap, nhomNhaCungCapId, hoatDong,
					
					start, end, orderByComparator
				};
		}

		List<NhaCungCap> list = (List<NhaCungCap>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (NhaCungCap nhaCungCap : list) {
				if (!Validator.equals(tenNhaCungCap,
							nhaCungCap.getTenNhaCungCap()) ||
						!Validator.equals(maNhaCungCap,
							nhaCungCap.getMaNhaCungCap()) ||
						(nhomNhaCungCapId != nhaCungCap.getNhomNhaCungCapId()) ||
						(hoatDong != nhaCungCap.getHoatDong())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_NHACUNGCAP_WHERE);

			boolean bindTenNhaCungCap = false;

			if (tenNhaCungCap == null) {
				query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_TENNHACUNGCAP_1);
			}
			else if (tenNhaCungCap.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_TENNHACUNGCAP_3);
			}
			else {
				bindTenNhaCungCap = true;

				query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_TENNHACUNGCAP_2);
			}

			boolean bindMaNhaCungCap = false;

			if (maNhaCungCap == null) {
				query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_MANHACUNGCAP_1);
			}
			else if (maNhaCungCap.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_MANHACUNGCAP_3);
			}
			else {
				bindMaNhaCungCap = true;

				query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_MANHACUNGCAP_2);
			}

			query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_NHOMNHACUNGCAPID_2);

			query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_HOATDONG_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(NhaCungCapModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTenNhaCungCap) {
					qPos.add(tenNhaCungCap);
				}

				if (bindMaNhaCungCap) {
					qPos.add(maNhaCungCap);
				}

				qPos.add(nhomNhaCungCapId);

				qPos.add(hoatDong);

				if (!pagination) {
					list = (List<NhaCungCap>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NhaCungCap>(list);
				}
				else {
					list = (List<NhaCungCap>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first nha cung cap in the ordered set where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63; and hoatDong = &#63;.
	 *
	 * @param tenNhaCungCap the ten nha cung cap
	 * @param maNhaCungCap the ma nha cung cap
	 * @param nhomNhaCungCapId the nhom nha cung cap ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nha cung cap
	 * @throws com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException if a matching nha cung cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhaCungCap findByTEN_MA_NHOM_HD_First(String tenNhaCungCap,
		String maNhaCungCap, long nhomNhaCungCapId, boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchNhaCungCapException, SystemException {
		NhaCungCap nhaCungCap = fetchByTEN_MA_NHOM_HD_First(tenNhaCungCap,
				maNhaCungCap, nhomNhaCungCapId, hoatDong, orderByComparator);

		if (nhaCungCap != null) {
			return nhaCungCap;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tenNhaCungCap=");
		msg.append(tenNhaCungCap);

		msg.append(", maNhaCungCap=");
		msg.append(maNhaCungCap);

		msg.append(", nhomNhaCungCapId=");
		msg.append(nhomNhaCungCapId);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNhaCungCapException(msg.toString());
	}

	/**
	 * Returns the first nha cung cap in the ordered set where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63; and hoatDong = &#63;.
	 *
	 * @param tenNhaCungCap the ten nha cung cap
	 * @param maNhaCungCap the ma nha cung cap
	 * @param nhomNhaCungCapId the nhom nha cung cap ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nha cung cap, or <code>null</code> if a matching nha cung cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhaCungCap fetchByTEN_MA_NHOM_HD_First(String tenNhaCungCap,
		String maNhaCungCap, long nhomNhaCungCapId, boolean hoatDong,
		OrderByComparator orderByComparator) throws SystemException {
		List<NhaCungCap> list = findByTEN_MA_NHOM_HD(tenNhaCungCap,
				maNhaCungCap, nhomNhaCungCapId, hoatDong, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last nha cung cap in the ordered set where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63; and hoatDong = &#63;.
	 *
	 * @param tenNhaCungCap the ten nha cung cap
	 * @param maNhaCungCap the ma nha cung cap
	 * @param nhomNhaCungCapId the nhom nha cung cap ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nha cung cap
	 * @throws com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException if a matching nha cung cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhaCungCap findByTEN_MA_NHOM_HD_Last(String tenNhaCungCap,
		String maNhaCungCap, long nhomNhaCungCapId, boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchNhaCungCapException, SystemException {
		NhaCungCap nhaCungCap = fetchByTEN_MA_NHOM_HD_Last(tenNhaCungCap,
				maNhaCungCap, nhomNhaCungCapId, hoatDong, orderByComparator);

		if (nhaCungCap != null) {
			return nhaCungCap;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tenNhaCungCap=");
		msg.append(tenNhaCungCap);

		msg.append(", maNhaCungCap=");
		msg.append(maNhaCungCap);

		msg.append(", nhomNhaCungCapId=");
		msg.append(nhomNhaCungCapId);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNhaCungCapException(msg.toString());
	}

	/**
	 * Returns the last nha cung cap in the ordered set where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63; and hoatDong = &#63;.
	 *
	 * @param tenNhaCungCap the ten nha cung cap
	 * @param maNhaCungCap the ma nha cung cap
	 * @param nhomNhaCungCapId the nhom nha cung cap ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nha cung cap, or <code>null</code> if a matching nha cung cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhaCungCap fetchByTEN_MA_NHOM_HD_Last(String tenNhaCungCap,
		String maNhaCungCap, long nhomNhaCungCapId, boolean hoatDong,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTEN_MA_NHOM_HD(tenNhaCungCap, maNhaCungCap,
				nhomNhaCungCapId, hoatDong);

		if (count == 0) {
			return null;
		}

		List<NhaCungCap> list = findByTEN_MA_NHOM_HD(tenNhaCungCap,
				maNhaCungCap, nhomNhaCungCapId, hoatDong, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the nha cung caps before and after the current nha cung cap in the ordered set where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63; and hoatDong = &#63;.
	 *
	 * @param nhaCungCapId the primary key of the current nha cung cap
	 * @param tenNhaCungCap the ten nha cung cap
	 * @param maNhaCungCap the ma nha cung cap
	 * @param nhomNhaCungCapId the nhom nha cung cap ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next nha cung cap
	 * @throws com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException if a nha cung cap with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhaCungCap[] findByTEN_MA_NHOM_HD_PrevAndNext(long nhaCungCapId,
		String tenNhaCungCap, String maNhaCungCap, long nhomNhaCungCapId,
		boolean hoatDong, OrderByComparator orderByComparator)
		throws NoSuchNhaCungCapException, SystemException {
		NhaCungCap nhaCungCap = findByPrimaryKey(nhaCungCapId);

		Session session = null;

		try {
			session = openSession();

			NhaCungCap[] array = new NhaCungCapImpl[3];

			array[0] = getByTEN_MA_NHOM_HD_PrevAndNext(session, nhaCungCap,
					tenNhaCungCap, maNhaCungCap, nhomNhaCungCapId, hoatDong,
					orderByComparator, true);

			array[1] = nhaCungCap;

			array[2] = getByTEN_MA_NHOM_HD_PrevAndNext(session, nhaCungCap,
					tenNhaCungCap, maNhaCungCap, nhomNhaCungCapId, hoatDong,
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

	protected NhaCungCap getByTEN_MA_NHOM_HD_PrevAndNext(Session session,
		NhaCungCap nhaCungCap, String tenNhaCungCap, String maNhaCungCap,
		long nhomNhaCungCapId, boolean hoatDong,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_NHACUNGCAP_WHERE);

		boolean bindTenNhaCungCap = false;

		if (tenNhaCungCap == null) {
			query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_TENNHACUNGCAP_1);
		}
		else if (tenNhaCungCap.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_TENNHACUNGCAP_3);
		}
		else {
			bindTenNhaCungCap = true;

			query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_TENNHACUNGCAP_2);
		}

		boolean bindMaNhaCungCap = false;

		if (maNhaCungCap == null) {
			query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_MANHACUNGCAP_1);
		}
		else if (maNhaCungCap.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_MANHACUNGCAP_3);
		}
		else {
			bindMaNhaCungCap = true;

			query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_MANHACUNGCAP_2);
		}

		query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_NHOMNHACUNGCAPID_2);

		query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_HOATDONG_2);

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
			query.append(NhaCungCapModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindTenNhaCungCap) {
			qPos.add(tenNhaCungCap);
		}

		if (bindMaNhaCungCap) {
			qPos.add(maNhaCungCap);
		}

		qPos.add(nhomNhaCungCapId);

		qPos.add(hoatDong);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(nhaCungCap);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<NhaCungCap> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the nha cung caps where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63; and hoatDong = &#63; from the database.
	 *
	 * @param tenNhaCungCap the ten nha cung cap
	 * @param maNhaCungCap the ma nha cung cap
	 * @param nhomNhaCungCapId the nhom nha cung cap ID
	 * @param hoatDong the hoat dong
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTEN_MA_NHOM_HD(String tenNhaCungCap,
		String maNhaCungCap, long nhomNhaCungCapId, boolean hoatDong)
		throws SystemException {
		for (NhaCungCap nhaCungCap : findByTEN_MA_NHOM_HD(tenNhaCungCap,
				maNhaCungCap, nhomNhaCungCapId, hoatDong, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(nhaCungCap);
		}
	}

	/**
	 * Returns the number of nha cung caps where tenNhaCungCap = &#63; and maNhaCungCap = &#63; and nhomNhaCungCapId = &#63; and hoatDong = &#63;.
	 *
	 * @param tenNhaCungCap the ten nha cung cap
	 * @param maNhaCungCap the ma nha cung cap
	 * @param nhomNhaCungCapId the nhom nha cung cap ID
	 * @param hoatDong the hoat dong
	 * @return the number of matching nha cung caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTEN_MA_NHOM_HD(String tenNhaCungCap, String maNhaCungCap,
		long nhomNhaCungCapId, boolean hoatDong) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TEN_MA_NHOM_HD;

		Object[] finderArgs = new Object[] {
				tenNhaCungCap, maNhaCungCap, nhomNhaCungCapId, hoatDong
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_NHACUNGCAP_WHERE);

			boolean bindTenNhaCungCap = false;

			if (tenNhaCungCap == null) {
				query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_TENNHACUNGCAP_1);
			}
			else if (tenNhaCungCap.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_TENNHACUNGCAP_3);
			}
			else {
				bindTenNhaCungCap = true;

				query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_TENNHACUNGCAP_2);
			}

			boolean bindMaNhaCungCap = false;

			if (maNhaCungCap == null) {
				query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_MANHACUNGCAP_1);
			}
			else if (maNhaCungCap.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_MANHACUNGCAP_3);
			}
			else {
				bindMaNhaCungCap = true;

				query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_MANHACUNGCAP_2);
			}

			query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_NHOMNHACUNGCAPID_2);

			query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_HOATDONG_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTenNhaCungCap) {
					qPos.add(tenNhaCungCap);
				}

				if (bindMaNhaCungCap) {
					qPos.add(maNhaCungCap);
				}

				qPos.add(nhomNhaCungCapId);

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

	private static final String _FINDER_COLUMN_TEN_MA_NHOM_HD_TENNHACUNGCAP_1 = "nhaCungCap.tenNhaCungCap IS NULL AND ";
	private static final String _FINDER_COLUMN_TEN_MA_NHOM_HD_TENNHACUNGCAP_2 = "nhaCungCap.tenNhaCungCap = ? AND ";
	private static final String _FINDER_COLUMN_TEN_MA_NHOM_HD_TENNHACUNGCAP_3 = "(nhaCungCap.tenNhaCungCap IS NULL OR nhaCungCap.tenNhaCungCap = '') AND ";
	private static final String _FINDER_COLUMN_TEN_MA_NHOM_HD_MANHACUNGCAP_1 = "nhaCungCap.maNhaCungCap IS NULL AND ";
	private static final String _FINDER_COLUMN_TEN_MA_NHOM_HD_MANHACUNGCAP_2 = "nhaCungCap.maNhaCungCap = ? AND ";
	private static final String _FINDER_COLUMN_TEN_MA_NHOM_HD_MANHACUNGCAP_3 = "(nhaCungCap.maNhaCungCap IS NULL OR nhaCungCap.maNhaCungCap = '') AND ";
	private static final String _FINDER_COLUMN_TEN_MA_NHOM_HD_NHOMNHACUNGCAPID_2 =
		"nhaCungCap.nhomNhaCungCapId = ? AND ";
	private static final String _FINDER_COLUMN_TEN_MA_NHOM_HD_HOATDONG_2 = "nhaCungCap.hoatDong = ?";

	public NhaCungCapPersistenceImpl() {
		setModelClass(NhaCungCap.class);
	}

	/**
	 * Caches the nha cung cap in the entity cache if it is enabled.
	 *
	 * @param nhaCungCap the nha cung cap
	 */
	@Override
	public void cacheResult(NhaCungCap nhaCungCap) {
		EntityCacheUtil.putResult(NhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
			NhaCungCapImpl.class, nhaCungCap.getPrimaryKey(), nhaCungCap);

		nhaCungCap.resetOriginalValues();
	}

	/**
	 * Caches the nha cung caps in the entity cache if it is enabled.
	 *
	 * @param nhaCungCaps the nha cung caps
	 */
	@Override
	public void cacheResult(List<NhaCungCap> nhaCungCaps) {
		for (NhaCungCap nhaCungCap : nhaCungCaps) {
			if (EntityCacheUtil.getResult(
						NhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
						NhaCungCapImpl.class, nhaCungCap.getPrimaryKey()) == null) {
				cacheResult(nhaCungCap);
			}
			else {
				nhaCungCap.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all nha cung caps.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(NhaCungCapImpl.class.getName());
		}

		EntityCacheUtil.clearCache(NhaCungCapImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the nha cung cap.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NhaCungCap nhaCungCap) {
		EntityCacheUtil.removeResult(NhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
			NhaCungCapImpl.class, nhaCungCap.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<NhaCungCap> nhaCungCaps) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (NhaCungCap nhaCungCap : nhaCungCaps) {
			EntityCacheUtil.removeResult(NhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
				NhaCungCapImpl.class, nhaCungCap.getPrimaryKey());
		}
	}

	/**
	 * Creates a new nha cung cap with the primary key. Does not add the nha cung cap to the database.
	 *
	 * @param nhaCungCapId the primary key for the new nha cung cap
	 * @return the new nha cung cap
	 */
	@Override
	public NhaCungCap create(long nhaCungCapId) {
		NhaCungCap nhaCungCap = new NhaCungCapImpl();

		nhaCungCap.setNew(true);
		nhaCungCap.setPrimaryKey(nhaCungCapId);

		return nhaCungCap;
	}

	/**
	 * Removes the nha cung cap with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param nhaCungCapId the primary key of the nha cung cap
	 * @return the nha cung cap that was removed
	 * @throws com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException if a nha cung cap with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhaCungCap remove(long nhaCungCapId)
		throws NoSuchNhaCungCapException, SystemException {
		return remove((Serializable)nhaCungCapId);
	}

	/**
	 * Removes the nha cung cap with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the nha cung cap
	 * @return the nha cung cap that was removed
	 * @throws com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException if a nha cung cap with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhaCungCap remove(Serializable primaryKey)
		throws NoSuchNhaCungCapException, SystemException {
		Session session = null;

		try {
			session = openSession();

			NhaCungCap nhaCungCap = (NhaCungCap)session.get(NhaCungCapImpl.class,
					primaryKey);

			if (nhaCungCap == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNhaCungCapException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(nhaCungCap);
		}
		catch (NoSuchNhaCungCapException nsee) {
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
	protected NhaCungCap removeImpl(NhaCungCap nhaCungCap)
		throws SystemException {
		nhaCungCap = toUnwrappedModel(nhaCungCap);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(nhaCungCap)) {
				nhaCungCap = (NhaCungCap)session.get(NhaCungCapImpl.class,
						nhaCungCap.getPrimaryKeyObj());
			}

			if (nhaCungCap != null) {
				session.delete(nhaCungCap);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (nhaCungCap != null) {
			clearCache(nhaCungCap);
		}

		return nhaCungCap;
	}

	@Override
	public NhaCungCap updateImpl(
		com.minimart.portlet.nhacungcap.model.NhaCungCap nhaCungCap)
		throws SystemException {
		nhaCungCap = toUnwrappedModel(nhaCungCap);

		boolean isNew = nhaCungCap.isNew();

		NhaCungCapModelImpl nhaCungCapModelImpl = (NhaCungCapModelImpl)nhaCungCap;

		Session session = null;

		try {
			session = openSession();

			if (nhaCungCap.isNew()) {
				session.save(nhaCungCap);

				nhaCungCap.setNew(false);
			}
			else {
				session.merge(nhaCungCap);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !NhaCungCapModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((nhaCungCapModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						nhaCungCapModelImpl.getOriginalTenNhaCungCap(),
						nhaCungCapModelImpl.getOriginalMaNhaCungCap()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_MA, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA,
					args);

				args = new Object[] {
						nhaCungCapModelImpl.getTenNhaCungCap(),
						nhaCungCapModelImpl.getMaNhaCungCap()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_MA, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA,
					args);
			}

			if ((nhaCungCapModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_NHOM.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						nhaCungCapModelImpl.getOriginalTenNhaCungCap(),
						nhaCungCapModelImpl.getOriginalMaNhaCungCap(),
						nhaCungCapModelImpl.getOriginalNhomNhaCungCapId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_MA_NHOM,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_NHOM,
					args);

				args = new Object[] {
						nhaCungCapModelImpl.getTenNhaCungCap(),
						nhaCungCapModelImpl.getMaNhaCungCap(),
						nhaCungCapModelImpl.getNhomNhaCungCapId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_MA_NHOM,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_NHOM,
					args);
			}

			if ((nhaCungCapModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_NHOM_HD.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						nhaCungCapModelImpl.getOriginalTenNhaCungCap(),
						nhaCungCapModelImpl.getOriginalMaNhaCungCap(),
						nhaCungCapModelImpl.getOriginalNhomNhaCungCapId(),
						nhaCungCapModelImpl.getOriginalHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_MA_NHOM_HD,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_NHOM_HD,
					args);

				args = new Object[] {
						nhaCungCapModelImpl.getTenNhaCungCap(),
						nhaCungCapModelImpl.getMaNhaCungCap(),
						nhaCungCapModelImpl.getNhomNhaCungCapId(),
						nhaCungCapModelImpl.getHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_MA_NHOM_HD,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_NHOM_HD,
					args);
			}
		}

		EntityCacheUtil.putResult(NhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
			NhaCungCapImpl.class, nhaCungCap.getPrimaryKey(), nhaCungCap);

		return nhaCungCap;
	}

	protected NhaCungCap toUnwrappedModel(NhaCungCap nhaCungCap) {
		if (nhaCungCap instanceof NhaCungCapImpl) {
			return nhaCungCap;
		}

		NhaCungCapImpl nhaCungCapImpl = new NhaCungCapImpl();

		nhaCungCapImpl.setNew(nhaCungCap.isNew());
		nhaCungCapImpl.setPrimaryKey(nhaCungCap.getPrimaryKey());

		nhaCungCapImpl.setNhaCungCapId(nhaCungCap.getNhaCungCapId());
		nhaCungCapImpl.setCompanyId(nhaCungCap.getCompanyId());
		nhaCungCapImpl.setUserId(nhaCungCap.getUserId());
		nhaCungCapImpl.setUserName(nhaCungCap.getUserName());
		nhaCungCapImpl.setCreateDate(nhaCungCap.getCreateDate());
		nhaCungCapImpl.setModifiedDate(nhaCungCap.getModifiedDate());
		nhaCungCapImpl.setTenNhaCungCap(nhaCungCap.getTenNhaCungCap());
		nhaCungCapImpl.setNhomNhaCungCapId(nhaCungCap.getNhomNhaCungCapId());
		nhaCungCapImpl.setMaNhaCungCap(nhaCungCap.getMaNhaCungCap());
		nhaCungCapImpl.setDiaChi(nhaCungCap.getDiaChi());
		nhaCungCapImpl.setDienThoai(nhaCungCap.getDienThoai());
		nhaCungCapImpl.setEmail(nhaCungCap.getEmail());
		nhaCungCapImpl.setWebsite(nhaCungCap.getWebsite());
		nhaCungCapImpl.setGhiChu(nhaCungCap.getGhiChu());
		nhaCungCapImpl.setHoatDong(nhaCungCap.isHoatDong());
		nhaCungCapImpl.setDoUuTien(nhaCungCap.getDoUuTien());
		nhaCungCapImpl.setLogoURL(nhaCungCap.getLogoURL());

		return nhaCungCapImpl;
	}

	/**
	 * Returns the nha cung cap with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the nha cung cap
	 * @return the nha cung cap
	 * @throws com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException if a nha cung cap with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhaCungCap findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNhaCungCapException, SystemException {
		NhaCungCap nhaCungCap = fetchByPrimaryKey(primaryKey);

		if (nhaCungCap == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNhaCungCapException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return nhaCungCap;
	}

	/**
	 * Returns the nha cung cap with the primary key or throws a {@link com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException} if it could not be found.
	 *
	 * @param nhaCungCapId the primary key of the nha cung cap
	 * @return the nha cung cap
	 * @throws com.minimart.portlet.nhacungcap.NoSuchNhaCungCapException if a nha cung cap with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhaCungCap findByPrimaryKey(long nhaCungCapId)
		throws NoSuchNhaCungCapException, SystemException {
		return findByPrimaryKey((Serializable)nhaCungCapId);
	}

	/**
	 * Returns the nha cung cap with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the nha cung cap
	 * @return the nha cung cap, or <code>null</code> if a nha cung cap with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhaCungCap fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		NhaCungCap nhaCungCap = (NhaCungCap)EntityCacheUtil.getResult(NhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
				NhaCungCapImpl.class, primaryKey);

		if (nhaCungCap == _nullNhaCungCap) {
			return null;
		}

		if (nhaCungCap == null) {
			Session session = null;

			try {
				session = openSession();

				nhaCungCap = (NhaCungCap)session.get(NhaCungCapImpl.class,
						primaryKey);

				if (nhaCungCap != null) {
					cacheResult(nhaCungCap);
				}
				else {
					EntityCacheUtil.putResult(NhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
						NhaCungCapImpl.class, primaryKey, _nullNhaCungCap);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(NhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
					NhaCungCapImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return nhaCungCap;
	}

	/**
	 * Returns the nha cung cap with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param nhaCungCapId the primary key of the nha cung cap
	 * @return the nha cung cap, or <code>null</code> if a nha cung cap with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhaCungCap fetchByPrimaryKey(long nhaCungCapId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)nhaCungCapId);
	}

	/**
	 * Returns all the nha cung caps.
	 *
	 * @return the nha cung caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhaCungCap> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the nha cung caps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nha cung caps
	 * @param end the upper bound of the range of nha cung caps (not inclusive)
	 * @return the range of nha cung caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhaCungCap> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the nha cung caps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nha cung caps
	 * @param end the upper bound of the range of nha cung caps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of nha cung caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhaCungCap> findAll(int start, int end,
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

		List<NhaCungCap> list = (List<NhaCungCap>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_NHACUNGCAP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_NHACUNGCAP;

				if (pagination) {
					sql = sql.concat(NhaCungCapModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<NhaCungCap>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NhaCungCap>(list);
				}
				else {
					list = (List<NhaCungCap>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the nha cung caps from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (NhaCungCap nhaCungCap : findAll()) {
			remove(nhaCungCap);
		}
	}

	/**
	 * Returns the number of nha cung caps.
	 *
	 * @return the number of nha cung caps
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

				Query q = session.createQuery(_SQL_COUNT_NHACUNGCAP);

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
	 * Initializes the nha cung cap persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.minimart.portlet.nhacungcap.model.NhaCungCap")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<NhaCungCap>> listenersList = new ArrayList<ModelListener<NhaCungCap>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<NhaCungCap>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(NhaCungCapImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_NHACUNGCAP = "SELECT nhaCungCap FROM NhaCungCap nhaCungCap";
	private static final String _SQL_SELECT_NHACUNGCAP_WHERE = "SELECT nhaCungCap FROM NhaCungCap nhaCungCap WHERE ";
	private static final String _SQL_COUNT_NHACUNGCAP = "SELECT COUNT(nhaCungCap) FROM NhaCungCap nhaCungCap";
	private static final String _SQL_COUNT_NHACUNGCAP_WHERE = "SELECT COUNT(nhaCungCap) FROM NhaCungCap nhaCungCap WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "nhaCungCap.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No NhaCungCap exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No NhaCungCap exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(NhaCungCapPersistenceImpl.class);
	private static NhaCungCap _nullNhaCungCap = new NhaCungCapImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<NhaCungCap> toCacheModel() {
				return _nullNhaCungCapCacheModel;
			}
		};

	private static CacheModel<NhaCungCap> _nullNhaCungCapCacheModel = new CacheModel<NhaCungCap>() {
			@Override
			public NhaCungCap toEntityModel() {
				return _nullNhaCungCap;
			}
		};
}