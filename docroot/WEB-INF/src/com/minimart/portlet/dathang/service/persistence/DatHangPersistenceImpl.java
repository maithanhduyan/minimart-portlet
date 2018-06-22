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

package com.minimart.portlet.dathang.service.persistence;

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

import com.minimart.portlet.dathang.NoSuchDatHangException;
import com.minimart.portlet.dathang.model.DatHang;
import com.minimart.portlet.dathang.model.impl.DatHangImpl;
import com.minimart.portlet.dathang.model.impl.DatHangModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dat hang service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see DatHangPersistence
 * @see DatHangUtil
 * @generated
 */
public class DatHangPersistenceImpl extends BasePersistenceImpl<DatHang>
	implements DatHangPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DatHangUtil} to access the dat hang persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DatHangImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DatHangModelImpl.ENTITY_CACHE_ENABLED,
			DatHangModelImpl.FINDER_CACHE_ENABLED, DatHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DatHangModelImpl.ENTITY_CACHE_ENABLED,
			DatHangModelImpl.FINDER_CACHE_ENABLED, DatHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DatHangModelImpl.ENTITY_CACHE_ENABLED,
			DatHangModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_HD = new FinderPath(DatHangModelImpl.ENTITY_CACHE_ENABLED,
			DatHangModelImpl.FINDER_CACHE_ENABLED, DatHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTEN_HD",
			new String[] {
				String.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HD =
		new FinderPath(DatHangModelImpl.ENTITY_CACHE_ENABLED,
			DatHangModelImpl.FINDER_CACHE_ENABLED, DatHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTEN_HD",
			new String[] { String.class.getName(), Boolean.class.getName() },
			DatHangModelImpl.TEN_COLUMN_BITMASK |
			DatHangModelImpl.HOATDONG_COLUMN_BITMASK |
			DatHangModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEN_HD = new FinderPath(DatHangModelImpl.ENTITY_CACHE_ENABLED,
			DatHangModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTEN_HD",
			new String[] { String.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the dat hangs where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @return the matching dat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DatHang> findByTEN_HD(String ten, boolean hoatDong)
		throws SystemException {
		return findByTEN_HD(ten, hoatDong, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dat hangs where ten = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.dathang.model.impl.DatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of dat hangs
	 * @param end the upper bound of the range of dat hangs (not inclusive)
	 * @return the range of matching dat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DatHang> findByTEN_HD(String ten, boolean hoatDong, int start,
		int end) throws SystemException {
		return findByTEN_HD(ten, hoatDong, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dat hangs where ten = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.dathang.model.impl.DatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of dat hangs
	 * @param end the upper bound of the range of dat hangs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DatHang> findByTEN_HD(String ten, boolean hoatDong, int start,
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

		List<DatHang> list = (List<DatHang>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DatHang datHang : list) {
				if (!Validator.equals(ten, datHang.getTen()) ||
						(hoatDong != datHang.getHoatDong())) {
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

			query.append(_SQL_SELECT_DATHANG_WHERE);

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
				query.append(DatHangModelImpl.ORDER_BY_JPQL);
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
					list = (List<DatHang>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DatHang>(list);
				}
				else {
					list = (List<DatHang>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dat hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dat hang
	 * @throws com.minimart.portlet.dathang.NoSuchDatHangException if a matching dat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DatHang findByTEN_HD_First(String ten, boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchDatHangException, SystemException {
		DatHang datHang = fetchByTEN_HD_First(ten, hoatDong, orderByComparator);

		if (datHang != null) {
			return datHang;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDatHangException(msg.toString());
	}

	/**
	 * Returns the first dat hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dat hang, or <code>null</code> if a matching dat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DatHang fetchByTEN_HD_First(String ten, boolean hoatDong,
		OrderByComparator orderByComparator) throws SystemException {
		List<DatHang> list = findByTEN_HD(ten, hoatDong, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dat hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dat hang
	 * @throws com.minimart.portlet.dathang.NoSuchDatHangException if a matching dat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DatHang findByTEN_HD_Last(String ten, boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchDatHangException, SystemException {
		DatHang datHang = fetchByTEN_HD_Last(ten, hoatDong, orderByComparator);

		if (datHang != null) {
			return datHang;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDatHangException(msg.toString());
	}

	/**
	 * Returns the last dat hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dat hang, or <code>null</code> if a matching dat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DatHang fetchByTEN_HD_Last(String ten, boolean hoatDong,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTEN_HD(ten, hoatDong);

		if (count == 0) {
			return null;
		}

		List<DatHang> list = findByTEN_HD(ten, hoatDong, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dat hangs before and after the current dat hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param datHangId the primary key of the current dat hang
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dat hang
	 * @throws com.minimart.portlet.dathang.NoSuchDatHangException if a dat hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DatHang[] findByTEN_HD_PrevAndNext(long datHangId, String ten,
		boolean hoatDong, OrderByComparator orderByComparator)
		throws NoSuchDatHangException, SystemException {
		DatHang datHang = findByPrimaryKey(datHangId);

		Session session = null;

		try {
			session = openSession();

			DatHang[] array = new DatHangImpl[3];

			array[0] = getByTEN_HD_PrevAndNext(session, datHang, ten, hoatDong,
					orderByComparator, true);

			array[1] = datHang;

			array[2] = getByTEN_HD_PrevAndNext(session, datHang, ten, hoatDong,
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

	protected DatHang getByTEN_HD_PrevAndNext(Session session, DatHang datHang,
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

		query.append(_SQL_SELECT_DATHANG_WHERE);

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
			query.append(DatHangModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(datHang);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DatHang> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dat hangs where ten = &#63; and hoatDong = &#63; from the database.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTEN_HD(String ten, boolean hoatDong)
		throws SystemException {
		for (DatHang datHang : findByTEN_HD(ten, hoatDong, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(datHang);
		}
	}

	/**
	 * Returns the number of dat hangs where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @return the number of matching dat hangs
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

			query.append(_SQL_COUNT_DATHANG_WHERE);

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

	private static final String _FINDER_COLUMN_TEN_HD_TEN_1 = "datHang.ten IS NULL AND ";
	private static final String _FINDER_COLUMN_TEN_HD_TEN_2 = "datHang.ten = ? AND ";
	private static final String _FINDER_COLUMN_TEN_HD_TEN_3 = "(datHang.ten IS NULL OR datHang.ten = '') AND ";
	private static final String _FINDER_COLUMN_TEN_HD_HOATDONG_2 = "datHang.hoatDong = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_HD_KHID =
		new FinderPath(DatHangModelImpl.ENTITY_CACHE_ENABLED,
			DatHangModelImpl.FINDER_CACHE_ENABLED, DatHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTEN_HD_KHID",
			new String[] {
				String.class.getName(), Boolean.class.getName(),
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HD_KHID =
		new FinderPath(DatHangModelImpl.ENTITY_CACHE_ENABLED,
			DatHangModelImpl.FINDER_CACHE_ENABLED, DatHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTEN_HD_KHID",
			new String[] {
				String.class.getName(), Boolean.class.getName(),
				Long.class.getName()
			},
			DatHangModelImpl.TEN_COLUMN_BITMASK |
			DatHangModelImpl.HOATDONG_COLUMN_BITMASK |
			DatHangModelImpl.KHACHHANGID_COLUMN_BITMASK |
			DatHangModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEN_HD_KHID = new FinderPath(DatHangModelImpl.ENTITY_CACHE_ENABLED,
			DatHangModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTEN_HD_KHID",
			new String[] {
				String.class.getName(), Boolean.class.getName(),
				Long.class.getName()
			});

	/**
	 * Returns all the dat hangs where ten = &#63; and hoatDong = &#63; and khachHangId = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param khachHangId the khach hang ID
	 * @return the matching dat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DatHang> findByTEN_HD_KHID(String ten, boolean hoatDong,
		long khachHangId) throws SystemException {
		return findByTEN_HD_KHID(ten, hoatDong, khachHangId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dat hangs where ten = &#63; and hoatDong = &#63; and khachHangId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.dathang.model.impl.DatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param khachHangId the khach hang ID
	 * @param start the lower bound of the range of dat hangs
	 * @param end the upper bound of the range of dat hangs (not inclusive)
	 * @return the range of matching dat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DatHang> findByTEN_HD_KHID(String ten, boolean hoatDong,
		long khachHangId, int start, int end) throws SystemException {
		return findByTEN_HD_KHID(ten, hoatDong, khachHangId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dat hangs where ten = &#63; and hoatDong = &#63; and khachHangId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.dathang.model.impl.DatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param khachHangId the khach hang ID
	 * @param start the lower bound of the range of dat hangs
	 * @param end the upper bound of the range of dat hangs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DatHang> findByTEN_HD_KHID(String ten, boolean hoatDong,
		long khachHangId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HD_KHID;
			finderArgs = new Object[] { ten, hoatDong, khachHangId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_HD_KHID;
			finderArgs = new Object[] {
					ten, hoatDong, khachHangId,
					
					start, end, orderByComparator
				};
		}

		List<DatHang> list = (List<DatHang>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DatHang datHang : list) {
				if (!Validator.equals(ten, datHang.getTen()) ||
						(hoatDong != datHang.getHoatDong()) ||
						(khachHangId != datHang.getKhachHangId())) {
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

			query.append(_SQL_SELECT_DATHANG_WHERE);

			boolean bindTen = false;

			if (ten == null) {
				query.append(_FINDER_COLUMN_TEN_HD_KHID_TEN_1);
			}
			else if (ten.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_HD_KHID_TEN_3);
			}
			else {
				bindTen = true;

				query.append(_FINDER_COLUMN_TEN_HD_KHID_TEN_2);
			}

			query.append(_FINDER_COLUMN_TEN_HD_KHID_HOATDONG_2);

			query.append(_FINDER_COLUMN_TEN_HD_KHID_KHACHHANGID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DatHangModelImpl.ORDER_BY_JPQL);
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

				qPos.add(khachHangId);

				if (!pagination) {
					list = (List<DatHang>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DatHang>(list);
				}
				else {
					list = (List<DatHang>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dat hang in the ordered set where ten = &#63; and hoatDong = &#63; and khachHangId = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param khachHangId the khach hang ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dat hang
	 * @throws com.minimart.portlet.dathang.NoSuchDatHangException if a matching dat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DatHang findByTEN_HD_KHID_First(String ten, boolean hoatDong,
		long khachHangId, OrderByComparator orderByComparator)
		throws NoSuchDatHangException, SystemException {
		DatHang datHang = fetchByTEN_HD_KHID_First(ten, hoatDong, khachHangId,
				orderByComparator);

		if (datHang != null) {
			return datHang;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(", khachHangId=");
		msg.append(khachHangId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDatHangException(msg.toString());
	}

	/**
	 * Returns the first dat hang in the ordered set where ten = &#63; and hoatDong = &#63; and khachHangId = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param khachHangId the khach hang ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dat hang, or <code>null</code> if a matching dat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DatHang fetchByTEN_HD_KHID_First(String ten, boolean hoatDong,
		long khachHangId, OrderByComparator orderByComparator)
		throws SystemException {
		List<DatHang> list = findByTEN_HD_KHID(ten, hoatDong, khachHangId, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dat hang in the ordered set where ten = &#63; and hoatDong = &#63; and khachHangId = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param khachHangId the khach hang ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dat hang
	 * @throws com.minimart.portlet.dathang.NoSuchDatHangException if a matching dat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DatHang findByTEN_HD_KHID_Last(String ten, boolean hoatDong,
		long khachHangId, OrderByComparator orderByComparator)
		throws NoSuchDatHangException, SystemException {
		DatHang datHang = fetchByTEN_HD_KHID_Last(ten, hoatDong, khachHangId,
				orderByComparator);

		if (datHang != null) {
			return datHang;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(", khachHangId=");
		msg.append(khachHangId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDatHangException(msg.toString());
	}

	/**
	 * Returns the last dat hang in the ordered set where ten = &#63; and hoatDong = &#63; and khachHangId = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param khachHangId the khach hang ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dat hang, or <code>null</code> if a matching dat hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DatHang fetchByTEN_HD_KHID_Last(String ten, boolean hoatDong,
		long khachHangId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByTEN_HD_KHID(ten, hoatDong, khachHangId);

		if (count == 0) {
			return null;
		}

		List<DatHang> list = findByTEN_HD_KHID(ten, hoatDong, khachHangId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dat hangs before and after the current dat hang in the ordered set where ten = &#63; and hoatDong = &#63; and khachHangId = &#63;.
	 *
	 * @param datHangId the primary key of the current dat hang
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param khachHangId the khach hang ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dat hang
	 * @throws com.minimart.portlet.dathang.NoSuchDatHangException if a dat hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DatHang[] findByTEN_HD_KHID_PrevAndNext(long datHangId, String ten,
		boolean hoatDong, long khachHangId, OrderByComparator orderByComparator)
		throws NoSuchDatHangException, SystemException {
		DatHang datHang = findByPrimaryKey(datHangId);

		Session session = null;

		try {
			session = openSession();

			DatHang[] array = new DatHangImpl[3];

			array[0] = getByTEN_HD_KHID_PrevAndNext(session, datHang, ten,
					hoatDong, khachHangId, orderByComparator, true);

			array[1] = datHang;

			array[2] = getByTEN_HD_KHID_PrevAndNext(session, datHang, ten,
					hoatDong, khachHangId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DatHang getByTEN_HD_KHID_PrevAndNext(Session session,
		DatHang datHang, String ten, boolean hoatDong, long khachHangId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DATHANG_WHERE);

		boolean bindTen = false;

		if (ten == null) {
			query.append(_FINDER_COLUMN_TEN_HD_KHID_TEN_1);
		}
		else if (ten.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TEN_HD_KHID_TEN_3);
		}
		else {
			bindTen = true;

			query.append(_FINDER_COLUMN_TEN_HD_KHID_TEN_2);
		}

		query.append(_FINDER_COLUMN_TEN_HD_KHID_HOATDONG_2);

		query.append(_FINDER_COLUMN_TEN_HD_KHID_KHACHHANGID_2);

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
			query.append(DatHangModelImpl.ORDER_BY_JPQL);
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

		qPos.add(khachHangId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(datHang);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DatHang> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dat hangs where ten = &#63; and hoatDong = &#63; and khachHangId = &#63; from the database.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param khachHangId the khach hang ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTEN_HD_KHID(String ten, boolean hoatDong,
		long khachHangId) throws SystemException {
		for (DatHang datHang : findByTEN_HD_KHID(ten, hoatDong, khachHangId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(datHang);
		}
	}

	/**
	 * Returns the number of dat hangs where ten = &#63; and hoatDong = &#63; and khachHangId = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param khachHangId the khach hang ID
	 * @return the number of matching dat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTEN_HD_KHID(String ten, boolean hoatDong, long khachHangId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TEN_HD_KHID;

		Object[] finderArgs = new Object[] { ten, hoatDong, khachHangId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DATHANG_WHERE);

			boolean bindTen = false;

			if (ten == null) {
				query.append(_FINDER_COLUMN_TEN_HD_KHID_TEN_1);
			}
			else if (ten.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_HD_KHID_TEN_3);
			}
			else {
				bindTen = true;

				query.append(_FINDER_COLUMN_TEN_HD_KHID_TEN_2);
			}

			query.append(_FINDER_COLUMN_TEN_HD_KHID_HOATDONG_2);

			query.append(_FINDER_COLUMN_TEN_HD_KHID_KHACHHANGID_2);

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

				qPos.add(khachHangId);

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

	private static final String _FINDER_COLUMN_TEN_HD_KHID_TEN_1 = "datHang.ten IS NULL AND ";
	private static final String _FINDER_COLUMN_TEN_HD_KHID_TEN_2 = "datHang.ten = ? AND ";
	private static final String _FINDER_COLUMN_TEN_HD_KHID_TEN_3 = "(datHang.ten IS NULL OR datHang.ten = '') AND ";
	private static final String _FINDER_COLUMN_TEN_HD_KHID_HOATDONG_2 = "datHang.hoatDong = ? AND ";
	private static final String _FINDER_COLUMN_TEN_HD_KHID_KHACHHANGID_2 = "datHang.khachHangId = ?";

	public DatHangPersistenceImpl() {
		setModelClass(DatHang.class);
	}

	/**
	 * Caches the dat hang in the entity cache if it is enabled.
	 *
	 * @param datHang the dat hang
	 */
	@Override
	public void cacheResult(DatHang datHang) {
		EntityCacheUtil.putResult(DatHangModelImpl.ENTITY_CACHE_ENABLED,
			DatHangImpl.class, datHang.getPrimaryKey(), datHang);

		datHang.resetOriginalValues();
	}

	/**
	 * Caches the dat hangs in the entity cache if it is enabled.
	 *
	 * @param datHangs the dat hangs
	 */
	@Override
	public void cacheResult(List<DatHang> datHangs) {
		for (DatHang datHang : datHangs) {
			if (EntityCacheUtil.getResult(
						DatHangModelImpl.ENTITY_CACHE_ENABLED,
						DatHangImpl.class, datHang.getPrimaryKey()) == null) {
				cacheResult(datHang);
			}
			else {
				datHang.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dat hangs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DatHangImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DatHangImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dat hang.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DatHang datHang) {
		EntityCacheUtil.removeResult(DatHangModelImpl.ENTITY_CACHE_ENABLED,
			DatHangImpl.class, datHang.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DatHang> datHangs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DatHang datHang : datHangs) {
			EntityCacheUtil.removeResult(DatHangModelImpl.ENTITY_CACHE_ENABLED,
				DatHangImpl.class, datHang.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dat hang with the primary key. Does not add the dat hang to the database.
	 *
	 * @param datHangId the primary key for the new dat hang
	 * @return the new dat hang
	 */
	@Override
	public DatHang create(long datHangId) {
		DatHang datHang = new DatHangImpl();

		datHang.setNew(true);
		datHang.setPrimaryKey(datHangId);

		return datHang;
	}

	/**
	 * Removes the dat hang with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param datHangId the primary key of the dat hang
	 * @return the dat hang that was removed
	 * @throws com.minimart.portlet.dathang.NoSuchDatHangException if a dat hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DatHang remove(long datHangId)
		throws NoSuchDatHangException, SystemException {
		return remove((Serializable)datHangId);
	}

	/**
	 * Removes the dat hang with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dat hang
	 * @return the dat hang that was removed
	 * @throws com.minimart.portlet.dathang.NoSuchDatHangException if a dat hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DatHang remove(Serializable primaryKey)
		throws NoSuchDatHangException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DatHang datHang = (DatHang)session.get(DatHangImpl.class, primaryKey);

			if (datHang == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDatHangException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(datHang);
		}
		catch (NoSuchDatHangException nsee) {
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
	protected DatHang removeImpl(DatHang datHang) throws SystemException {
		datHang = toUnwrappedModel(datHang);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(datHang)) {
				datHang = (DatHang)session.get(DatHangImpl.class,
						datHang.getPrimaryKeyObj());
			}

			if (datHang != null) {
				session.delete(datHang);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (datHang != null) {
			clearCache(datHang);
		}

		return datHang;
	}

	@Override
	public DatHang updateImpl(
		com.minimart.portlet.dathang.model.DatHang datHang)
		throws SystemException {
		datHang = toUnwrappedModel(datHang);

		boolean isNew = datHang.isNew();

		DatHangModelImpl datHangModelImpl = (DatHangModelImpl)datHang;

		Session session = null;

		try {
			session = openSession();

			if (datHang.isNew()) {
				session.save(datHang);

				datHang.setNew(false);
			}
			else {
				session.merge(datHang);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DatHangModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((datHangModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HD.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						datHangModelImpl.getOriginalTen(),
						datHangModelImpl.getOriginalHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_HD, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HD,
					args);

				args = new Object[] {
						datHangModelImpl.getTen(),
						datHangModelImpl.getHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_HD, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HD,
					args);
			}

			if ((datHangModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HD_KHID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						datHangModelImpl.getOriginalTen(),
						datHangModelImpl.getOriginalHoatDong(),
						datHangModelImpl.getOriginalKhachHangId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_HD_KHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HD_KHID,
					args);

				args = new Object[] {
						datHangModelImpl.getTen(),
						datHangModelImpl.getHoatDong(),
						datHangModelImpl.getKhachHangId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_HD_KHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HD_KHID,
					args);
			}
		}

		EntityCacheUtil.putResult(DatHangModelImpl.ENTITY_CACHE_ENABLED,
			DatHangImpl.class, datHang.getPrimaryKey(), datHang);

		return datHang;
	}

	protected DatHang toUnwrappedModel(DatHang datHang) {
		if (datHang instanceof DatHangImpl) {
			return datHang;
		}

		DatHangImpl datHangImpl = new DatHangImpl();

		datHangImpl.setNew(datHang.isNew());
		datHangImpl.setPrimaryKey(datHang.getPrimaryKey());

		datHangImpl.setDatHangId(datHang.getDatHangId());
		datHangImpl.setCompanyId(datHang.getCompanyId());
		datHangImpl.setUserId(datHang.getUserId());
		datHangImpl.setUserName(datHang.getUserName());
		datHangImpl.setCreateDate(datHang.getCreateDate());
		datHangImpl.setModifiedDate(datHang.getModifiedDate());
		datHangImpl.setTen(datHang.getTen());
		datHangImpl.setKhachHangId(datHang.getKhachHangId());
		datHangImpl.setDiaChiId(datHang.getDiaChiId());
		datHangImpl.setTienHang(datHang.getTienHang());
		datHangImpl.setTiLeThue(datHang.getTiLeThue());
		datHangImpl.setTiLeGiamGia(datHang.getTiLeGiamGia());
		datHangImpl.setTienGiamGia(datHang.getTienGiamGia());
		datHangImpl.setPhiVanChuyen(datHang.getPhiVanChuyen());
		datHangImpl.setTongCong(datHang.getTongCong());
		datHangImpl.setLoai(datHang.getLoai());
		datHangImpl.setGiamTheoTien(datHang.getGiamTheoTien());
		datHangImpl.setTrangThai(datHang.isTrangThai());
		datHangImpl.setUserModifiedId(datHang.getUserModifiedId());
		datHangImpl.setTimeModified(datHang.getTimeModified());
		datHangImpl.setUserCreateId(datHang.getUserCreateId());
		datHangImpl.setLoaiGia(datHang.getLoaiGia());
		datHangImpl.setHoatDong(datHang.isHoatDong());

		return datHangImpl;
	}

	/**
	 * Returns the dat hang with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dat hang
	 * @return the dat hang
	 * @throws com.minimart.portlet.dathang.NoSuchDatHangException if a dat hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DatHang findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDatHangException, SystemException {
		DatHang datHang = fetchByPrimaryKey(primaryKey);

		if (datHang == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDatHangException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return datHang;
	}

	/**
	 * Returns the dat hang with the primary key or throws a {@link com.minimart.portlet.dathang.NoSuchDatHangException} if it could not be found.
	 *
	 * @param datHangId the primary key of the dat hang
	 * @return the dat hang
	 * @throws com.minimart.portlet.dathang.NoSuchDatHangException if a dat hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DatHang findByPrimaryKey(long datHangId)
		throws NoSuchDatHangException, SystemException {
		return findByPrimaryKey((Serializable)datHangId);
	}

	/**
	 * Returns the dat hang with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dat hang
	 * @return the dat hang, or <code>null</code> if a dat hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DatHang fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DatHang datHang = (DatHang)EntityCacheUtil.getResult(DatHangModelImpl.ENTITY_CACHE_ENABLED,
				DatHangImpl.class, primaryKey);

		if (datHang == _nullDatHang) {
			return null;
		}

		if (datHang == null) {
			Session session = null;

			try {
				session = openSession();

				datHang = (DatHang)session.get(DatHangImpl.class, primaryKey);

				if (datHang != null) {
					cacheResult(datHang);
				}
				else {
					EntityCacheUtil.putResult(DatHangModelImpl.ENTITY_CACHE_ENABLED,
						DatHangImpl.class, primaryKey, _nullDatHang);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DatHangModelImpl.ENTITY_CACHE_ENABLED,
					DatHangImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return datHang;
	}

	/**
	 * Returns the dat hang with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param datHangId the primary key of the dat hang
	 * @return the dat hang, or <code>null</code> if a dat hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DatHang fetchByPrimaryKey(long datHangId) throws SystemException {
		return fetchByPrimaryKey((Serializable)datHangId);
	}

	/**
	 * Returns all the dat hangs.
	 *
	 * @return the dat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DatHang> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dat hangs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.dathang.model.impl.DatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dat hangs
	 * @param end the upper bound of the range of dat hangs (not inclusive)
	 * @return the range of dat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DatHang> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dat hangs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.dathang.model.impl.DatHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dat hangs
	 * @param end the upper bound of the range of dat hangs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dat hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DatHang> findAll(int start, int end,
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

		List<DatHang> list = (List<DatHang>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DATHANG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DATHANG;

				if (pagination) {
					sql = sql.concat(DatHangModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DatHang>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DatHang>(list);
				}
				else {
					list = (List<DatHang>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dat hangs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DatHang datHang : findAll()) {
			remove(datHang);
		}
	}

	/**
	 * Returns the number of dat hangs.
	 *
	 * @return the number of dat hangs
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

				Query q = session.createQuery(_SQL_COUNT_DATHANG);

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
	 * Initializes the dat hang persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.minimart.portlet.dathang.model.DatHang")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DatHang>> listenersList = new ArrayList<ModelListener<DatHang>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DatHang>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DatHangImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DATHANG = "SELECT datHang FROM DatHang datHang";
	private static final String _SQL_SELECT_DATHANG_WHERE = "SELECT datHang FROM DatHang datHang WHERE ";
	private static final String _SQL_COUNT_DATHANG = "SELECT COUNT(datHang) FROM DatHang datHang";
	private static final String _SQL_COUNT_DATHANG_WHERE = "SELECT COUNT(datHang) FROM DatHang datHang WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "datHang.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DatHang exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DatHang exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DatHangPersistenceImpl.class);
	private static DatHang _nullDatHang = new DatHangImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DatHang> toCacheModel() {
				return _nullDatHangCacheModel;
			}
		};

	private static CacheModel<DatHang> _nullDatHangCacheModel = new CacheModel<DatHang>() {
			@Override
			public DatHang toEntityModel() {
				return _nullDatHang;
			}
		};
}