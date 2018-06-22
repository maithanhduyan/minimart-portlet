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

import com.minimart.portlet.nhacungcap.NoSuchNhomNhaCungCapException;
import com.minimart.portlet.nhacungcap.model.NhomNhaCungCap;
import com.minimart.portlet.nhacungcap.model.impl.NhomNhaCungCapImpl;
import com.minimart.portlet.nhacungcap.model.impl.NhomNhaCungCapModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the nhom nha cung cap service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see NhomNhaCungCapPersistence
 * @see NhomNhaCungCapUtil
 * @generated
 */
public class NhomNhaCungCapPersistenceImpl extends BasePersistenceImpl<NhomNhaCungCap>
	implements NhomNhaCungCapPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link NhomNhaCungCapUtil} to access the nhom nha cung cap persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = NhomNhaCungCapImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(NhomNhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
			NhomNhaCungCapModelImpl.FINDER_CACHE_ENABLED,
			NhomNhaCungCapImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(NhomNhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
			NhomNhaCungCapModelImpl.FINDER_CACHE_ENABLED,
			NhomNhaCungCapImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(NhomNhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
			NhomNhaCungCapModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN = new FinderPath(NhomNhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
			NhomNhaCungCapModelImpl.FINDER_CACHE_ENABLED,
			NhomNhaCungCapImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByTEN",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN = new FinderPath(NhomNhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
			NhomNhaCungCapModelImpl.FINDER_CACHE_ENABLED,
			NhomNhaCungCapImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTEN",
			new String[] { String.class.getName() },
			NhomNhaCungCapModelImpl.TEN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEN = new FinderPath(NhomNhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
			NhomNhaCungCapModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTEN",
			new String[] { String.class.getName() });

	/**
	 * Returns all the nhom nha cung caps where ten = &#63;.
	 *
	 * @param ten the ten
	 * @return the matching nhom nha cung caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhomNhaCungCap> findByTEN(String ten) throws SystemException {
		return findByTEN(ten, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the nhom nha cung caps where ten = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhomNhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param start the lower bound of the range of nhom nha cung caps
	 * @param end the upper bound of the range of nhom nha cung caps (not inclusive)
	 * @return the range of matching nhom nha cung caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhomNhaCungCap> findByTEN(String ten, int start, int end)
		throws SystemException {
		return findByTEN(ten, start, end, null);
	}

	/**
	 * Returns an ordered range of all the nhom nha cung caps where ten = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhomNhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param start the lower bound of the range of nhom nha cung caps
	 * @param end the upper bound of the range of nhom nha cung caps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching nhom nha cung caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhomNhaCungCap> findByTEN(String ten, int start, int end,
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

		List<NhomNhaCungCap> list = (List<NhomNhaCungCap>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (NhomNhaCungCap nhomNhaCungCap : list) {
				if (!Validator.equals(ten, nhomNhaCungCap.getTen())) {
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

			query.append(_SQL_SELECT_NHOMNHACUNGCAP_WHERE);

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
				query.append(NhomNhaCungCapModelImpl.ORDER_BY_JPQL);
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
					list = (List<NhomNhaCungCap>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NhomNhaCungCap>(list);
				}
				else {
					list = (List<NhomNhaCungCap>)QueryUtil.list(q,
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
	 * Returns the first nhom nha cung cap in the ordered set where ten = &#63;.
	 *
	 * @param ten the ten
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nhom nha cung cap
	 * @throws com.minimart.portlet.nhacungcap.NoSuchNhomNhaCungCapException if a matching nhom nha cung cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomNhaCungCap findByTEN_First(String ten,
		OrderByComparator orderByComparator)
		throws NoSuchNhomNhaCungCapException, SystemException {
		NhomNhaCungCap nhomNhaCungCap = fetchByTEN_First(ten, orderByComparator);

		if (nhomNhaCungCap != null) {
			return nhomNhaCungCap;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNhomNhaCungCapException(msg.toString());
	}

	/**
	 * Returns the first nhom nha cung cap in the ordered set where ten = &#63;.
	 *
	 * @param ten the ten
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nhom nha cung cap, or <code>null</code> if a matching nhom nha cung cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomNhaCungCap fetchByTEN_First(String ten,
		OrderByComparator orderByComparator) throws SystemException {
		List<NhomNhaCungCap> list = findByTEN(ten, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last nhom nha cung cap in the ordered set where ten = &#63;.
	 *
	 * @param ten the ten
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nhom nha cung cap
	 * @throws com.minimart.portlet.nhacungcap.NoSuchNhomNhaCungCapException if a matching nhom nha cung cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomNhaCungCap findByTEN_Last(String ten,
		OrderByComparator orderByComparator)
		throws NoSuchNhomNhaCungCapException, SystemException {
		NhomNhaCungCap nhomNhaCungCap = fetchByTEN_Last(ten, orderByComparator);

		if (nhomNhaCungCap != null) {
			return nhomNhaCungCap;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNhomNhaCungCapException(msg.toString());
	}

	/**
	 * Returns the last nhom nha cung cap in the ordered set where ten = &#63;.
	 *
	 * @param ten the ten
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nhom nha cung cap, or <code>null</code> if a matching nhom nha cung cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomNhaCungCap fetchByTEN_Last(String ten,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTEN(ten);

		if (count == 0) {
			return null;
		}

		List<NhomNhaCungCap> list = findByTEN(ten, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the nhom nha cung caps before and after the current nhom nha cung cap in the ordered set where ten = &#63;.
	 *
	 * @param nhomNhaCungCapId the primary key of the current nhom nha cung cap
	 * @param ten the ten
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next nhom nha cung cap
	 * @throws com.minimart.portlet.nhacungcap.NoSuchNhomNhaCungCapException if a nhom nha cung cap with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomNhaCungCap[] findByTEN_PrevAndNext(long nhomNhaCungCapId,
		String ten, OrderByComparator orderByComparator)
		throws NoSuchNhomNhaCungCapException, SystemException {
		NhomNhaCungCap nhomNhaCungCap = findByPrimaryKey(nhomNhaCungCapId);

		Session session = null;

		try {
			session = openSession();

			NhomNhaCungCap[] array = new NhomNhaCungCapImpl[3];

			array[0] = getByTEN_PrevAndNext(session, nhomNhaCungCap, ten,
					orderByComparator, true);

			array[1] = nhomNhaCungCap;

			array[2] = getByTEN_PrevAndNext(session, nhomNhaCungCap, ten,
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

	protected NhomNhaCungCap getByTEN_PrevAndNext(Session session,
		NhomNhaCungCap nhomNhaCungCap, String ten,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_NHOMNHACUNGCAP_WHERE);

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
			query.append(NhomNhaCungCapModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(nhomNhaCungCap);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<NhomNhaCungCap> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the nhom nha cung caps where ten = &#63; from the database.
	 *
	 * @param ten the ten
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTEN(String ten) throws SystemException {
		for (NhomNhaCungCap nhomNhaCungCap : findByTEN(ten, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(nhomNhaCungCap);
		}
	}

	/**
	 * Returns the number of nhom nha cung caps where ten = &#63;.
	 *
	 * @param ten the ten
	 * @return the number of matching nhom nha cung caps
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

			query.append(_SQL_COUNT_NHOMNHACUNGCAP_WHERE);

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

	private static final String _FINDER_COLUMN_TEN_TEN_1 = "nhomNhaCungCap.ten IS NULL";
	private static final String _FINDER_COLUMN_TEN_TEN_2 = "nhomNhaCungCap.ten = ?";
	private static final String _FINDER_COLUMN_TEN_TEN_3 = "(nhomNhaCungCap.ten IS NULL OR nhomNhaCungCap.ten = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_HD = new FinderPath(NhomNhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
			NhomNhaCungCapModelImpl.FINDER_CACHE_ENABLED,
			NhomNhaCungCapImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByTEN_HD",
			new String[] {
				String.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HD =
		new FinderPath(NhomNhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
			NhomNhaCungCapModelImpl.FINDER_CACHE_ENABLED,
			NhomNhaCungCapImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTEN_HD",
			new String[] { String.class.getName(), Boolean.class.getName() },
			NhomNhaCungCapModelImpl.TEN_COLUMN_BITMASK |
			NhomNhaCungCapModelImpl.HOATDONG_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEN_HD = new FinderPath(NhomNhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
			NhomNhaCungCapModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTEN_HD",
			new String[] { String.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the nhom nha cung caps where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @return the matching nhom nha cung caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhomNhaCungCap> findByTEN_HD(String ten, boolean hoatDong)
		throws SystemException {
		return findByTEN_HD(ten, hoatDong, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the nhom nha cung caps where ten = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhomNhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of nhom nha cung caps
	 * @param end the upper bound of the range of nhom nha cung caps (not inclusive)
	 * @return the range of matching nhom nha cung caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhomNhaCungCap> findByTEN_HD(String ten, boolean hoatDong,
		int start, int end) throws SystemException {
		return findByTEN_HD(ten, hoatDong, start, end, null);
	}

	/**
	 * Returns an ordered range of all the nhom nha cung caps where ten = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhomNhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of nhom nha cung caps
	 * @param end the upper bound of the range of nhom nha cung caps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching nhom nha cung caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhomNhaCungCap> findByTEN_HD(String ten, boolean hoatDong,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
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

		List<NhomNhaCungCap> list = (List<NhomNhaCungCap>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (NhomNhaCungCap nhomNhaCungCap : list) {
				if (!Validator.equals(ten, nhomNhaCungCap.getTen()) ||
						(hoatDong != nhomNhaCungCap.getHoatDong())) {
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

			query.append(_SQL_SELECT_NHOMNHACUNGCAP_WHERE);

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
				query.append(NhomNhaCungCapModelImpl.ORDER_BY_JPQL);
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
					list = (List<NhomNhaCungCap>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NhomNhaCungCap>(list);
				}
				else {
					list = (List<NhomNhaCungCap>)QueryUtil.list(q,
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
	 * Returns the first nhom nha cung cap in the ordered set where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nhom nha cung cap
	 * @throws com.minimart.portlet.nhacungcap.NoSuchNhomNhaCungCapException if a matching nhom nha cung cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomNhaCungCap findByTEN_HD_First(String ten, boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchNhomNhaCungCapException, SystemException {
		NhomNhaCungCap nhomNhaCungCap = fetchByTEN_HD_First(ten, hoatDong,
				orderByComparator);

		if (nhomNhaCungCap != null) {
			return nhomNhaCungCap;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNhomNhaCungCapException(msg.toString());
	}

	/**
	 * Returns the first nhom nha cung cap in the ordered set where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nhom nha cung cap, or <code>null</code> if a matching nhom nha cung cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomNhaCungCap fetchByTEN_HD_First(String ten, boolean hoatDong,
		OrderByComparator orderByComparator) throws SystemException {
		List<NhomNhaCungCap> list = findByTEN_HD(ten, hoatDong, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last nhom nha cung cap in the ordered set where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nhom nha cung cap
	 * @throws com.minimart.portlet.nhacungcap.NoSuchNhomNhaCungCapException if a matching nhom nha cung cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomNhaCungCap findByTEN_HD_Last(String ten, boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchNhomNhaCungCapException, SystemException {
		NhomNhaCungCap nhomNhaCungCap = fetchByTEN_HD_Last(ten, hoatDong,
				orderByComparator);

		if (nhomNhaCungCap != null) {
			return nhomNhaCungCap;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNhomNhaCungCapException(msg.toString());
	}

	/**
	 * Returns the last nhom nha cung cap in the ordered set where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nhom nha cung cap, or <code>null</code> if a matching nhom nha cung cap could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomNhaCungCap fetchByTEN_HD_Last(String ten, boolean hoatDong,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTEN_HD(ten, hoatDong);

		if (count == 0) {
			return null;
		}

		List<NhomNhaCungCap> list = findByTEN_HD(ten, hoatDong, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the nhom nha cung caps before and after the current nhom nha cung cap in the ordered set where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param nhomNhaCungCapId the primary key of the current nhom nha cung cap
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next nhom nha cung cap
	 * @throws com.minimart.portlet.nhacungcap.NoSuchNhomNhaCungCapException if a nhom nha cung cap with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomNhaCungCap[] findByTEN_HD_PrevAndNext(long nhomNhaCungCapId,
		String ten, boolean hoatDong, OrderByComparator orderByComparator)
		throws NoSuchNhomNhaCungCapException, SystemException {
		NhomNhaCungCap nhomNhaCungCap = findByPrimaryKey(nhomNhaCungCapId);

		Session session = null;

		try {
			session = openSession();

			NhomNhaCungCap[] array = new NhomNhaCungCapImpl[3];

			array[0] = getByTEN_HD_PrevAndNext(session, nhomNhaCungCap, ten,
					hoatDong, orderByComparator, true);

			array[1] = nhomNhaCungCap;

			array[2] = getByTEN_HD_PrevAndNext(session, nhomNhaCungCap, ten,
					hoatDong, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected NhomNhaCungCap getByTEN_HD_PrevAndNext(Session session,
		NhomNhaCungCap nhomNhaCungCap, String ten, boolean hoatDong,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_NHOMNHACUNGCAP_WHERE);

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
			query.append(NhomNhaCungCapModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(nhomNhaCungCap);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<NhomNhaCungCap> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the nhom nha cung caps where ten = &#63; and hoatDong = &#63; from the database.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTEN_HD(String ten, boolean hoatDong)
		throws SystemException {
		for (NhomNhaCungCap nhomNhaCungCap : findByTEN_HD(ten, hoatDong,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(nhomNhaCungCap);
		}
	}

	/**
	 * Returns the number of nhom nha cung caps where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @return the number of matching nhom nha cung caps
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

			query.append(_SQL_COUNT_NHOMNHACUNGCAP_WHERE);

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

	private static final String _FINDER_COLUMN_TEN_HD_TEN_1 = "nhomNhaCungCap.ten IS NULL AND ";
	private static final String _FINDER_COLUMN_TEN_HD_TEN_2 = "nhomNhaCungCap.ten = ? AND ";
	private static final String _FINDER_COLUMN_TEN_HD_TEN_3 = "(nhomNhaCungCap.ten IS NULL OR nhomNhaCungCap.ten = '') AND ";
	private static final String _FINDER_COLUMN_TEN_HD_HOATDONG_2 = "nhomNhaCungCap.hoatDong = ?";

	public NhomNhaCungCapPersistenceImpl() {
		setModelClass(NhomNhaCungCap.class);
	}

	/**
	 * Caches the nhom nha cung cap in the entity cache if it is enabled.
	 *
	 * @param nhomNhaCungCap the nhom nha cung cap
	 */
	@Override
	public void cacheResult(NhomNhaCungCap nhomNhaCungCap) {
		EntityCacheUtil.putResult(NhomNhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
			NhomNhaCungCapImpl.class, nhomNhaCungCap.getPrimaryKey(),
			nhomNhaCungCap);

		nhomNhaCungCap.resetOriginalValues();
	}

	/**
	 * Caches the nhom nha cung caps in the entity cache if it is enabled.
	 *
	 * @param nhomNhaCungCaps the nhom nha cung caps
	 */
	@Override
	public void cacheResult(List<NhomNhaCungCap> nhomNhaCungCaps) {
		for (NhomNhaCungCap nhomNhaCungCap : nhomNhaCungCaps) {
			if (EntityCacheUtil.getResult(
						NhomNhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
						NhomNhaCungCapImpl.class, nhomNhaCungCap.getPrimaryKey()) == null) {
				cacheResult(nhomNhaCungCap);
			}
			else {
				nhomNhaCungCap.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all nhom nha cung caps.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(NhomNhaCungCapImpl.class.getName());
		}

		EntityCacheUtil.clearCache(NhomNhaCungCapImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the nhom nha cung cap.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NhomNhaCungCap nhomNhaCungCap) {
		EntityCacheUtil.removeResult(NhomNhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
			NhomNhaCungCapImpl.class, nhomNhaCungCap.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<NhomNhaCungCap> nhomNhaCungCaps) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (NhomNhaCungCap nhomNhaCungCap : nhomNhaCungCaps) {
			EntityCacheUtil.removeResult(NhomNhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
				NhomNhaCungCapImpl.class, nhomNhaCungCap.getPrimaryKey());
		}
	}

	/**
	 * Creates a new nhom nha cung cap with the primary key. Does not add the nhom nha cung cap to the database.
	 *
	 * @param nhomNhaCungCapId the primary key for the new nhom nha cung cap
	 * @return the new nhom nha cung cap
	 */
	@Override
	public NhomNhaCungCap create(long nhomNhaCungCapId) {
		NhomNhaCungCap nhomNhaCungCap = new NhomNhaCungCapImpl();

		nhomNhaCungCap.setNew(true);
		nhomNhaCungCap.setPrimaryKey(nhomNhaCungCapId);

		return nhomNhaCungCap;
	}

	/**
	 * Removes the nhom nha cung cap with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param nhomNhaCungCapId the primary key of the nhom nha cung cap
	 * @return the nhom nha cung cap that was removed
	 * @throws com.minimart.portlet.nhacungcap.NoSuchNhomNhaCungCapException if a nhom nha cung cap with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomNhaCungCap remove(long nhomNhaCungCapId)
		throws NoSuchNhomNhaCungCapException, SystemException {
		return remove((Serializable)nhomNhaCungCapId);
	}

	/**
	 * Removes the nhom nha cung cap with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the nhom nha cung cap
	 * @return the nhom nha cung cap that was removed
	 * @throws com.minimart.portlet.nhacungcap.NoSuchNhomNhaCungCapException if a nhom nha cung cap with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomNhaCungCap remove(Serializable primaryKey)
		throws NoSuchNhomNhaCungCapException, SystemException {
		Session session = null;

		try {
			session = openSession();

			NhomNhaCungCap nhomNhaCungCap = (NhomNhaCungCap)session.get(NhomNhaCungCapImpl.class,
					primaryKey);

			if (nhomNhaCungCap == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNhomNhaCungCapException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(nhomNhaCungCap);
		}
		catch (NoSuchNhomNhaCungCapException nsee) {
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
	protected NhomNhaCungCap removeImpl(NhomNhaCungCap nhomNhaCungCap)
		throws SystemException {
		nhomNhaCungCap = toUnwrappedModel(nhomNhaCungCap);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(nhomNhaCungCap)) {
				nhomNhaCungCap = (NhomNhaCungCap)session.get(NhomNhaCungCapImpl.class,
						nhomNhaCungCap.getPrimaryKeyObj());
			}

			if (nhomNhaCungCap != null) {
				session.delete(nhomNhaCungCap);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (nhomNhaCungCap != null) {
			clearCache(nhomNhaCungCap);
		}

		return nhomNhaCungCap;
	}

	@Override
	public NhomNhaCungCap updateImpl(
		com.minimart.portlet.nhacungcap.model.NhomNhaCungCap nhomNhaCungCap)
		throws SystemException {
		nhomNhaCungCap = toUnwrappedModel(nhomNhaCungCap);

		boolean isNew = nhomNhaCungCap.isNew();

		NhomNhaCungCapModelImpl nhomNhaCungCapModelImpl = (NhomNhaCungCapModelImpl)nhomNhaCungCap;

		Session session = null;

		try {
			session = openSession();

			if (nhomNhaCungCap.isNew()) {
				session.save(nhomNhaCungCap);

				nhomNhaCungCap.setNew(false);
			}
			else {
				session.merge(nhomNhaCungCap);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !NhomNhaCungCapModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((nhomNhaCungCapModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						nhomNhaCungCapModelImpl.getOriginalTen()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN,
					args);

				args = new Object[] { nhomNhaCungCapModelImpl.getTen() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN,
					args);
			}

			if ((nhomNhaCungCapModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HD.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						nhomNhaCungCapModelImpl.getOriginalTen(),
						nhomNhaCungCapModelImpl.getOriginalHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_HD, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HD,
					args);

				args = new Object[] {
						nhomNhaCungCapModelImpl.getTen(),
						nhomNhaCungCapModelImpl.getHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_HD, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HD,
					args);
			}
		}

		EntityCacheUtil.putResult(NhomNhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
			NhomNhaCungCapImpl.class, nhomNhaCungCap.getPrimaryKey(),
			nhomNhaCungCap);

		return nhomNhaCungCap;
	}

	protected NhomNhaCungCap toUnwrappedModel(NhomNhaCungCap nhomNhaCungCap) {
		if (nhomNhaCungCap instanceof NhomNhaCungCapImpl) {
			return nhomNhaCungCap;
		}

		NhomNhaCungCapImpl nhomNhaCungCapImpl = new NhomNhaCungCapImpl();

		nhomNhaCungCapImpl.setNew(nhomNhaCungCap.isNew());
		nhomNhaCungCapImpl.setPrimaryKey(nhomNhaCungCap.getPrimaryKey());

		nhomNhaCungCapImpl.setNhomNhaCungCapId(nhomNhaCungCap.getNhomNhaCungCapId());
		nhomNhaCungCapImpl.setCompanyId(nhomNhaCungCap.getCompanyId());
		nhomNhaCungCapImpl.setUserId(nhomNhaCungCap.getUserId());
		nhomNhaCungCapImpl.setUserName(nhomNhaCungCap.getUserName());
		nhomNhaCungCapImpl.setCreateDate(nhomNhaCungCap.getCreateDate());
		nhomNhaCungCapImpl.setModifiedDate(nhomNhaCungCap.getModifiedDate());
		nhomNhaCungCapImpl.setTen(nhomNhaCungCap.getTen());
		nhomNhaCungCapImpl.setGhiChu(nhomNhaCungCap.getGhiChu());
		nhomNhaCungCapImpl.setHoatDong(nhomNhaCungCap.isHoatDong());
		nhomNhaCungCapImpl.setUuTien(nhomNhaCungCap.getUuTien());
		nhomNhaCungCapImpl.setImage(nhomNhaCungCap.getImage());

		return nhomNhaCungCapImpl;
	}

	/**
	 * Returns the nhom nha cung cap with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the nhom nha cung cap
	 * @return the nhom nha cung cap
	 * @throws com.minimart.portlet.nhacungcap.NoSuchNhomNhaCungCapException if a nhom nha cung cap with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomNhaCungCap findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNhomNhaCungCapException, SystemException {
		NhomNhaCungCap nhomNhaCungCap = fetchByPrimaryKey(primaryKey);

		if (nhomNhaCungCap == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNhomNhaCungCapException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return nhomNhaCungCap;
	}

	/**
	 * Returns the nhom nha cung cap with the primary key or throws a {@link com.minimart.portlet.nhacungcap.NoSuchNhomNhaCungCapException} if it could not be found.
	 *
	 * @param nhomNhaCungCapId the primary key of the nhom nha cung cap
	 * @return the nhom nha cung cap
	 * @throws com.minimart.portlet.nhacungcap.NoSuchNhomNhaCungCapException if a nhom nha cung cap with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomNhaCungCap findByPrimaryKey(long nhomNhaCungCapId)
		throws NoSuchNhomNhaCungCapException, SystemException {
		return findByPrimaryKey((Serializable)nhomNhaCungCapId);
	}

	/**
	 * Returns the nhom nha cung cap with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the nhom nha cung cap
	 * @return the nhom nha cung cap, or <code>null</code> if a nhom nha cung cap with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomNhaCungCap fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		NhomNhaCungCap nhomNhaCungCap = (NhomNhaCungCap)EntityCacheUtil.getResult(NhomNhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
				NhomNhaCungCapImpl.class, primaryKey);

		if (nhomNhaCungCap == _nullNhomNhaCungCap) {
			return null;
		}

		if (nhomNhaCungCap == null) {
			Session session = null;

			try {
				session = openSession();

				nhomNhaCungCap = (NhomNhaCungCap)session.get(NhomNhaCungCapImpl.class,
						primaryKey);

				if (nhomNhaCungCap != null) {
					cacheResult(nhomNhaCungCap);
				}
				else {
					EntityCacheUtil.putResult(NhomNhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
						NhomNhaCungCapImpl.class, primaryKey,
						_nullNhomNhaCungCap);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(NhomNhaCungCapModelImpl.ENTITY_CACHE_ENABLED,
					NhomNhaCungCapImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return nhomNhaCungCap;
	}

	/**
	 * Returns the nhom nha cung cap with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param nhomNhaCungCapId the primary key of the nhom nha cung cap
	 * @return the nhom nha cung cap, or <code>null</code> if a nhom nha cung cap with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomNhaCungCap fetchByPrimaryKey(long nhomNhaCungCapId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)nhomNhaCungCapId);
	}

	/**
	 * Returns all the nhom nha cung caps.
	 *
	 * @return the nhom nha cung caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhomNhaCungCap> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the nhom nha cung caps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhomNhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nhom nha cung caps
	 * @param end the upper bound of the range of nhom nha cung caps (not inclusive)
	 * @return the range of nhom nha cung caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhomNhaCungCap> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the nhom nha cung caps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.nhacungcap.model.impl.NhomNhaCungCapModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nhom nha cung caps
	 * @param end the upper bound of the range of nhom nha cung caps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of nhom nha cung caps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhomNhaCungCap> findAll(int start, int end,
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

		List<NhomNhaCungCap> list = (List<NhomNhaCungCap>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_NHOMNHACUNGCAP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_NHOMNHACUNGCAP;

				if (pagination) {
					sql = sql.concat(NhomNhaCungCapModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<NhomNhaCungCap>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NhomNhaCungCap>(list);
				}
				else {
					list = (List<NhomNhaCungCap>)QueryUtil.list(q,
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
	 * Removes all the nhom nha cung caps from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (NhomNhaCungCap nhomNhaCungCap : findAll()) {
			remove(nhomNhaCungCap);
		}
	}

	/**
	 * Returns the number of nhom nha cung caps.
	 *
	 * @return the number of nhom nha cung caps
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

				Query q = session.createQuery(_SQL_COUNT_NHOMNHACUNGCAP);

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
	 * Initializes the nhom nha cung cap persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.minimart.portlet.nhacungcap.model.NhomNhaCungCap")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<NhomNhaCungCap>> listenersList = new ArrayList<ModelListener<NhomNhaCungCap>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<NhomNhaCungCap>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(NhomNhaCungCapImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_NHOMNHACUNGCAP = "SELECT nhomNhaCungCap FROM NhomNhaCungCap nhomNhaCungCap";
	private static final String _SQL_SELECT_NHOMNHACUNGCAP_WHERE = "SELECT nhomNhaCungCap FROM NhomNhaCungCap nhomNhaCungCap WHERE ";
	private static final String _SQL_COUNT_NHOMNHACUNGCAP = "SELECT COUNT(nhomNhaCungCap) FROM NhomNhaCungCap nhomNhaCungCap";
	private static final String _SQL_COUNT_NHOMNHACUNGCAP_WHERE = "SELECT COUNT(nhomNhaCungCap) FROM NhomNhaCungCap nhomNhaCungCap WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "nhomNhaCungCap.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No NhomNhaCungCap exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No NhomNhaCungCap exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(NhomNhaCungCapPersistenceImpl.class);
	private static NhomNhaCungCap _nullNhomNhaCungCap = new NhomNhaCungCapImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<NhomNhaCungCap> toCacheModel() {
				return _nullNhomNhaCungCapCacheModel;
			}
		};

	private static CacheModel<NhomNhaCungCap> _nullNhomNhaCungCapCacheModel = new CacheModel<NhomNhaCungCap>() {
			@Override
			public NhomNhaCungCap toEntityModel() {
				return _nullNhomNhaCungCap;
			}
		};
}