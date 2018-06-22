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

package com.minimart.portlet.khachhang.service.persistence;

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

import com.minimart.portlet.khachhang.NoSuchNhomKhachHangException;
import com.minimart.portlet.khachhang.model.NhomKhachHang;
import com.minimart.portlet.khachhang.model.impl.NhomKhachHangImpl;
import com.minimart.portlet.khachhang.model.impl.NhomKhachHangModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the nhom khach hang service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see NhomKhachHangPersistence
 * @see NhomKhachHangUtil
 * @generated
 */
public class NhomKhachHangPersistenceImpl extends BasePersistenceImpl<NhomKhachHang>
	implements NhomKhachHangPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link NhomKhachHangUtil} to access the nhom khach hang persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = NhomKhachHangImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(NhomKhachHangModelImpl.ENTITY_CACHE_ENABLED,
			NhomKhachHangModelImpl.FINDER_CACHE_ENABLED,
			NhomKhachHangImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(NhomKhachHangModelImpl.ENTITY_CACHE_ENABLED,
			NhomKhachHangModelImpl.FINDER_CACHE_ENABLED,
			NhomKhachHangImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(NhomKhachHangModelImpl.ENTITY_CACHE_ENABLED,
			NhomKhachHangModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_HD = new FinderPath(NhomKhachHangModelImpl.ENTITY_CACHE_ENABLED,
			NhomKhachHangModelImpl.FINDER_CACHE_ENABLED,
			NhomKhachHangImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByTEN_HD",
			new String[] {
				String.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HD =
		new FinderPath(NhomKhachHangModelImpl.ENTITY_CACHE_ENABLED,
			NhomKhachHangModelImpl.FINDER_CACHE_ENABLED,
			NhomKhachHangImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByTEN_HD",
			new String[] { String.class.getName(), Boolean.class.getName() },
			NhomKhachHangModelImpl.TEN_COLUMN_BITMASK |
			NhomKhachHangModelImpl.HOATDONG_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEN_HD = new FinderPath(NhomKhachHangModelImpl.ENTITY_CACHE_ENABLED,
			NhomKhachHangModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTEN_HD",
			new String[] { String.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the nhom khach hangs where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @return the matching nhom khach hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhomKhachHang> findByTEN_HD(String ten, boolean hoatDong)
		throws SystemException {
		return findByTEN_HD(ten, hoatDong, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the nhom khach hangs where ten = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.NhomKhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of nhom khach hangs
	 * @param end the upper bound of the range of nhom khach hangs (not inclusive)
	 * @return the range of matching nhom khach hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhomKhachHang> findByTEN_HD(String ten, boolean hoatDong,
		int start, int end) throws SystemException {
		return findByTEN_HD(ten, hoatDong, start, end, null);
	}

	/**
	 * Returns an ordered range of all the nhom khach hangs where ten = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.NhomKhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of nhom khach hangs
	 * @param end the upper bound of the range of nhom khach hangs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching nhom khach hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhomKhachHang> findByTEN_HD(String ten, boolean hoatDong,
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

		List<NhomKhachHang> list = (List<NhomKhachHang>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (NhomKhachHang nhomKhachHang : list) {
				if (!Validator.equals(ten, nhomKhachHang.getTen()) ||
						(hoatDong != nhomKhachHang.getHoatDong())) {
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

			query.append(_SQL_SELECT_NHOMKHACHHANG_WHERE);

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
				query.append(NhomKhachHangModelImpl.ORDER_BY_JPQL);
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
					list = (List<NhomKhachHang>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NhomKhachHang>(list);
				}
				else {
					list = (List<NhomKhachHang>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first nhom khach hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nhom khach hang
	 * @throws com.minimart.portlet.khachhang.NoSuchNhomKhachHangException if a matching nhom khach hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomKhachHang findByTEN_HD_First(String ten, boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchNhomKhachHangException, SystemException {
		NhomKhachHang nhomKhachHang = fetchByTEN_HD_First(ten, hoatDong,
				orderByComparator);

		if (nhomKhachHang != null) {
			return nhomKhachHang;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNhomKhachHangException(msg.toString());
	}

	/**
	 * Returns the first nhom khach hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching nhom khach hang, or <code>null</code> if a matching nhom khach hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomKhachHang fetchByTEN_HD_First(String ten, boolean hoatDong,
		OrderByComparator orderByComparator) throws SystemException {
		List<NhomKhachHang> list = findByTEN_HD(ten, hoatDong, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last nhom khach hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nhom khach hang
	 * @throws com.minimart.portlet.khachhang.NoSuchNhomKhachHangException if a matching nhom khach hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomKhachHang findByTEN_HD_Last(String ten, boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchNhomKhachHangException, SystemException {
		NhomKhachHang nhomKhachHang = fetchByTEN_HD_Last(ten, hoatDong,
				orderByComparator);

		if (nhomKhachHang != null) {
			return nhomKhachHang;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchNhomKhachHangException(msg.toString());
	}

	/**
	 * Returns the last nhom khach hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching nhom khach hang, or <code>null</code> if a matching nhom khach hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomKhachHang fetchByTEN_HD_Last(String ten, boolean hoatDong,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTEN_HD(ten, hoatDong);

		if (count == 0) {
			return null;
		}

		List<NhomKhachHang> list = findByTEN_HD(ten, hoatDong, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the nhom khach hangs before and after the current nhom khach hang in the ordered set where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param nhomKhachHangId the primary key of the current nhom khach hang
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next nhom khach hang
	 * @throws com.minimart.portlet.khachhang.NoSuchNhomKhachHangException if a nhom khach hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomKhachHang[] findByTEN_HD_PrevAndNext(long nhomKhachHangId,
		String ten, boolean hoatDong, OrderByComparator orderByComparator)
		throws NoSuchNhomKhachHangException, SystemException {
		NhomKhachHang nhomKhachHang = findByPrimaryKey(nhomKhachHangId);

		Session session = null;

		try {
			session = openSession();

			NhomKhachHang[] array = new NhomKhachHangImpl[3];

			array[0] = getByTEN_HD_PrevAndNext(session, nhomKhachHang, ten,
					hoatDong, orderByComparator, true);

			array[1] = nhomKhachHang;

			array[2] = getByTEN_HD_PrevAndNext(session, nhomKhachHang, ten,
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

	protected NhomKhachHang getByTEN_HD_PrevAndNext(Session session,
		NhomKhachHang nhomKhachHang, String ten, boolean hoatDong,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_NHOMKHACHHANG_WHERE);

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
			query.append(NhomKhachHangModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(nhomKhachHang);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<NhomKhachHang> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the nhom khach hangs where ten = &#63; and hoatDong = &#63; from the database.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTEN_HD(String ten, boolean hoatDong)
		throws SystemException {
		for (NhomKhachHang nhomKhachHang : findByTEN_HD(ten, hoatDong,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(nhomKhachHang);
		}
	}

	/**
	 * Returns the number of nhom khach hangs where ten = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param hoatDong the hoat dong
	 * @return the number of matching nhom khach hangs
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

			query.append(_SQL_COUNT_NHOMKHACHHANG_WHERE);

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

	private static final String _FINDER_COLUMN_TEN_HD_TEN_1 = "nhomKhachHang.ten IS NULL AND ";
	private static final String _FINDER_COLUMN_TEN_HD_TEN_2 = "nhomKhachHang.ten = ? AND ";
	private static final String _FINDER_COLUMN_TEN_HD_TEN_3 = "(nhomKhachHang.ten IS NULL OR nhomKhachHang.ten = '') AND ";
	private static final String _FINDER_COLUMN_TEN_HD_HOATDONG_2 = "nhomKhachHang.hoatDong = ?";

	public NhomKhachHangPersistenceImpl() {
		setModelClass(NhomKhachHang.class);
	}

	/**
	 * Caches the nhom khach hang in the entity cache if it is enabled.
	 *
	 * @param nhomKhachHang the nhom khach hang
	 */
	@Override
	public void cacheResult(NhomKhachHang nhomKhachHang) {
		EntityCacheUtil.putResult(NhomKhachHangModelImpl.ENTITY_CACHE_ENABLED,
			NhomKhachHangImpl.class, nhomKhachHang.getPrimaryKey(),
			nhomKhachHang);

		nhomKhachHang.resetOriginalValues();
	}

	/**
	 * Caches the nhom khach hangs in the entity cache if it is enabled.
	 *
	 * @param nhomKhachHangs the nhom khach hangs
	 */
	@Override
	public void cacheResult(List<NhomKhachHang> nhomKhachHangs) {
		for (NhomKhachHang nhomKhachHang : nhomKhachHangs) {
			if (EntityCacheUtil.getResult(
						NhomKhachHangModelImpl.ENTITY_CACHE_ENABLED,
						NhomKhachHangImpl.class, nhomKhachHang.getPrimaryKey()) == null) {
				cacheResult(nhomKhachHang);
			}
			else {
				nhomKhachHang.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all nhom khach hangs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(NhomKhachHangImpl.class.getName());
		}

		EntityCacheUtil.clearCache(NhomKhachHangImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the nhom khach hang.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NhomKhachHang nhomKhachHang) {
		EntityCacheUtil.removeResult(NhomKhachHangModelImpl.ENTITY_CACHE_ENABLED,
			NhomKhachHangImpl.class, nhomKhachHang.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<NhomKhachHang> nhomKhachHangs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (NhomKhachHang nhomKhachHang : nhomKhachHangs) {
			EntityCacheUtil.removeResult(NhomKhachHangModelImpl.ENTITY_CACHE_ENABLED,
				NhomKhachHangImpl.class, nhomKhachHang.getPrimaryKey());
		}
	}

	/**
	 * Creates a new nhom khach hang with the primary key. Does not add the nhom khach hang to the database.
	 *
	 * @param nhomKhachHangId the primary key for the new nhom khach hang
	 * @return the new nhom khach hang
	 */
	@Override
	public NhomKhachHang create(long nhomKhachHangId) {
		NhomKhachHang nhomKhachHang = new NhomKhachHangImpl();

		nhomKhachHang.setNew(true);
		nhomKhachHang.setPrimaryKey(nhomKhachHangId);

		return nhomKhachHang;
	}

	/**
	 * Removes the nhom khach hang with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param nhomKhachHangId the primary key of the nhom khach hang
	 * @return the nhom khach hang that was removed
	 * @throws com.minimart.portlet.khachhang.NoSuchNhomKhachHangException if a nhom khach hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomKhachHang remove(long nhomKhachHangId)
		throws NoSuchNhomKhachHangException, SystemException {
		return remove((Serializable)nhomKhachHangId);
	}

	/**
	 * Removes the nhom khach hang with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the nhom khach hang
	 * @return the nhom khach hang that was removed
	 * @throws com.minimart.portlet.khachhang.NoSuchNhomKhachHangException if a nhom khach hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomKhachHang remove(Serializable primaryKey)
		throws NoSuchNhomKhachHangException, SystemException {
		Session session = null;

		try {
			session = openSession();

			NhomKhachHang nhomKhachHang = (NhomKhachHang)session.get(NhomKhachHangImpl.class,
					primaryKey);

			if (nhomKhachHang == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNhomKhachHangException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(nhomKhachHang);
		}
		catch (NoSuchNhomKhachHangException nsee) {
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
	protected NhomKhachHang removeImpl(NhomKhachHang nhomKhachHang)
		throws SystemException {
		nhomKhachHang = toUnwrappedModel(nhomKhachHang);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(nhomKhachHang)) {
				nhomKhachHang = (NhomKhachHang)session.get(NhomKhachHangImpl.class,
						nhomKhachHang.getPrimaryKeyObj());
			}

			if (nhomKhachHang != null) {
				session.delete(nhomKhachHang);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (nhomKhachHang != null) {
			clearCache(nhomKhachHang);
		}

		return nhomKhachHang;
	}

	@Override
	public NhomKhachHang updateImpl(
		com.minimart.portlet.khachhang.model.NhomKhachHang nhomKhachHang)
		throws SystemException {
		nhomKhachHang = toUnwrappedModel(nhomKhachHang);

		boolean isNew = nhomKhachHang.isNew();

		NhomKhachHangModelImpl nhomKhachHangModelImpl = (NhomKhachHangModelImpl)nhomKhachHang;

		Session session = null;

		try {
			session = openSession();

			if (nhomKhachHang.isNew()) {
				session.save(nhomKhachHang);

				nhomKhachHang.setNew(false);
			}
			else {
				session.merge(nhomKhachHang);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !NhomKhachHangModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((nhomKhachHangModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HD.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						nhomKhachHangModelImpl.getOriginalTen(),
						nhomKhachHangModelImpl.getOriginalHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_HD, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HD,
					args);

				args = new Object[] {
						nhomKhachHangModelImpl.getTen(),
						nhomKhachHangModelImpl.getHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_HD, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_HD,
					args);
			}
		}

		EntityCacheUtil.putResult(NhomKhachHangModelImpl.ENTITY_CACHE_ENABLED,
			NhomKhachHangImpl.class, nhomKhachHang.getPrimaryKey(),
			nhomKhachHang);

		return nhomKhachHang;
	}

	protected NhomKhachHang toUnwrappedModel(NhomKhachHang nhomKhachHang) {
		if (nhomKhachHang instanceof NhomKhachHangImpl) {
			return nhomKhachHang;
		}

		NhomKhachHangImpl nhomKhachHangImpl = new NhomKhachHangImpl();

		nhomKhachHangImpl.setNew(nhomKhachHang.isNew());
		nhomKhachHangImpl.setPrimaryKey(nhomKhachHang.getPrimaryKey());

		nhomKhachHangImpl.setNhomKhachHangId(nhomKhachHang.getNhomKhachHangId());
		nhomKhachHangImpl.setCompanyId(nhomKhachHang.getCompanyId());
		nhomKhachHangImpl.setUserId(nhomKhachHang.getUserId());
		nhomKhachHangImpl.setUserName(nhomKhachHang.getUserName());
		nhomKhachHangImpl.setCreateDate(nhomKhachHang.getCreateDate());
		nhomKhachHangImpl.setModifiedDate(nhomKhachHang.getModifiedDate());
		nhomKhachHangImpl.setTen(nhomKhachHang.getTen());
		nhomKhachHangImpl.setHoatDong(nhomKhachHang.isHoatDong());
		nhomKhachHangImpl.setDiemTichLuy(nhomKhachHang.getDiemTichLuy());
		nhomKhachHangImpl.setTiLeGiamGia(nhomKhachHang.getTiLeGiamGia());
		nhomKhachHangImpl.setUuTien(nhomKhachHang.getUuTien());
		nhomKhachHangImpl.setImage(nhomKhachHang.getImage());

		return nhomKhachHangImpl;
	}

	/**
	 * Returns the nhom khach hang with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the nhom khach hang
	 * @return the nhom khach hang
	 * @throws com.minimart.portlet.khachhang.NoSuchNhomKhachHangException if a nhom khach hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomKhachHang findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNhomKhachHangException, SystemException {
		NhomKhachHang nhomKhachHang = fetchByPrimaryKey(primaryKey);

		if (nhomKhachHang == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNhomKhachHangException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return nhomKhachHang;
	}

	/**
	 * Returns the nhom khach hang with the primary key or throws a {@link com.minimart.portlet.khachhang.NoSuchNhomKhachHangException} if it could not be found.
	 *
	 * @param nhomKhachHangId the primary key of the nhom khach hang
	 * @return the nhom khach hang
	 * @throws com.minimart.portlet.khachhang.NoSuchNhomKhachHangException if a nhom khach hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomKhachHang findByPrimaryKey(long nhomKhachHangId)
		throws NoSuchNhomKhachHangException, SystemException {
		return findByPrimaryKey((Serializable)nhomKhachHangId);
	}

	/**
	 * Returns the nhom khach hang with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the nhom khach hang
	 * @return the nhom khach hang, or <code>null</code> if a nhom khach hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomKhachHang fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		NhomKhachHang nhomKhachHang = (NhomKhachHang)EntityCacheUtil.getResult(NhomKhachHangModelImpl.ENTITY_CACHE_ENABLED,
				NhomKhachHangImpl.class, primaryKey);

		if (nhomKhachHang == _nullNhomKhachHang) {
			return null;
		}

		if (nhomKhachHang == null) {
			Session session = null;

			try {
				session = openSession();

				nhomKhachHang = (NhomKhachHang)session.get(NhomKhachHangImpl.class,
						primaryKey);

				if (nhomKhachHang != null) {
					cacheResult(nhomKhachHang);
				}
				else {
					EntityCacheUtil.putResult(NhomKhachHangModelImpl.ENTITY_CACHE_ENABLED,
						NhomKhachHangImpl.class, primaryKey, _nullNhomKhachHang);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(NhomKhachHangModelImpl.ENTITY_CACHE_ENABLED,
					NhomKhachHangImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return nhomKhachHang;
	}

	/**
	 * Returns the nhom khach hang with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param nhomKhachHangId the primary key of the nhom khach hang
	 * @return the nhom khach hang, or <code>null</code> if a nhom khach hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public NhomKhachHang fetchByPrimaryKey(long nhomKhachHangId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)nhomKhachHangId);
	}

	/**
	 * Returns all the nhom khach hangs.
	 *
	 * @return the nhom khach hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhomKhachHang> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the nhom khach hangs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.NhomKhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nhom khach hangs
	 * @param end the upper bound of the range of nhom khach hangs (not inclusive)
	 * @return the range of nhom khach hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhomKhachHang> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the nhom khach hangs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.NhomKhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of nhom khach hangs
	 * @param end the upper bound of the range of nhom khach hangs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of nhom khach hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<NhomKhachHang> findAll(int start, int end,
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

		List<NhomKhachHang> list = (List<NhomKhachHang>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_NHOMKHACHHANG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_NHOMKHACHHANG;

				if (pagination) {
					sql = sql.concat(NhomKhachHangModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<NhomKhachHang>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<NhomKhachHang>(list);
				}
				else {
					list = (List<NhomKhachHang>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the nhom khach hangs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (NhomKhachHang nhomKhachHang : findAll()) {
			remove(nhomKhachHang);
		}
	}

	/**
	 * Returns the number of nhom khach hangs.
	 *
	 * @return the number of nhom khach hangs
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

				Query q = session.createQuery(_SQL_COUNT_NHOMKHACHHANG);

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
	 * Initializes the nhom khach hang persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.minimart.portlet.khachhang.model.NhomKhachHang")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<NhomKhachHang>> listenersList = new ArrayList<ModelListener<NhomKhachHang>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<NhomKhachHang>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(NhomKhachHangImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_NHOMKHACHHANG = "SELECT nhomKhachHang FROM NhomKhachHang nhomKhachHang";
	private static final String _SQL_SELECT_NHOMKHACHHANG_WHERE = "SELECT nhomKhachHang FROM NhomKhachHang nhomKhachHang WHERE ";
	private static final String _SQL_COUNT_NHOMKHACHHANG = "SELECT COUNT(nhomKhachHang) FROM NhomKhachHang nhomKhachHang";
	private static final String _SQL_COUNT_NHOMKHACHHANG_WHERE = "SELECT COUNT(nhomKhachHang) FROM NhomKhachHang nhomKhachHang WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "nhomKhachHang.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No NhomKhachHang exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No NhomKhachHang exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(NhomKhachHangPersistenceImpl.class);
	private static NhomKhachHang _nullNhomKhachHang = new NhomKhachHangImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<NhomKhachHang> toCacheModel() {
				return _nullNhomKhachHangCacheModel;
			}
		};

	private static CacheModel<NhomKhachHang> _nullNhomKhachHangCacheModel = new CacheModel<NhomKhachHang>() {
			@Override
			public NhomKhachHang toEntityModel() {
				return _nullNhomKhachHang;
			}
		};
}