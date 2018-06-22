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

import com.minimart.portlet.khachhang.NoSuchKhachHangException;
import com.minimart.portlet.khachhang.model.KhachHang;
import com.minimart.portlet.khachhang.model.impl.KhachHangImpl;
import com.minimart.portlet.khachhang.model.impl.KhachHangModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the khach hang service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see KhachHangPersistence
 * @see KhachHangUtil
 * @generated
 */
public class KhachHangPersistenceImpl extends BasePersistenceImpl<KhachHang>
	implements KhachHangPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link KhachHangUtil} to access the khach hang persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = KhachHangImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(KhachHangModelImpl.ENTITY_CACHE_ENABLED,
			KhachHangModelImpl.FINDER_CACHE_ENABLED, KhachHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(KhachHangModelImpl.ENTITY_CACHE_ENABLED,
			KhachHangModelImpl.FINDER_CACHE_ENABLED, KhachHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(KhachHangModelImpl.ENTITY_CACHE_ENABLED,
			KhachHangModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_MA = new FinderPath(KhachHangModelImpl.ENTITY_CACHE_ENABLED,
			KhachHangModelImpl.FINDER_CACHE_ENABLED, KhachHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTEN_MA",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA =
		new FinderPath(KhachHangModelImpl.ENTITY_CACHE_ENABLED,
			KhachHangModelImpl.FINDER_CACHE_ENABLED, KhachHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTEN_MA",
			new String[] { String.class.getName(), String.class.getName() },
			KhachHangModelImpl.TEN_COLUMN_BITMASK |
			KhachHangModelImpl.MA_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEN_MA = new FinderPath(KhachHangModelImpl.ENTITY_CACHE_ENABLED,
			KhachHangModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTEN_MA",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the khach hangs where ten = &#63; and ma = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @return the matching khach hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KhachHang> findByTEN_MA(String ten, String ma)
		throws SystemException {
		return findByTEN_MA(ten, ma, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the khach hangs where ten = &#63; and ma = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.KhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param start the lower bound of the range of khach hangs
	 * @param end the upper bound of the range of khach hangs (not inclusive)
	 * @return the range of matching khach hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KhachHang> findByTEN_MA(String ten, String ma, int start,
		int end) throws SystemException {
		return findByTEN_MA(ten, ma, start, end, null);
	}

	/**
	 * Returns an ordered range of all the khach hangs where ten = &#63; and ma = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.KhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param start the lower bound of the range of khach hangs
	 * @param end the upper bound of the range of khach hangs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching khach hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KhachHang> findByTEN_MA(String ten, String ma, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA;
			finderArgs = new Object[] { ten, ma };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_MA;
			finderArgs = new Object[] { ten, ma, start, end, orderByComparator };
		}

		List<KhachHang> list = (List<KhachHang>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (KhachHang khachHang : list) {
				if (!Validator.equals(ten, khachHang.getTen()) ||
						!Validator.equals(ma, khachHang.getMa())) {
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

			query.append(_SQL_SELECT_KHACHHANG_WHERE);

			boolean bindTen = false;

			if (ten == null) {
				query.append(_FINDER_COLUMN_TEN_MA_TEN_1);
			}
			else if (ten.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_MA_TEN_3);
			}
			else {
				bindTen = true;

				query.append(_FINDER_COLUMN_TEN_MA_TEN_2);
			}

			boolean bindMa = false;

			if (ma == null) {
				query.append(_FINDER_COLUMN_TEN_MA_MA_1);
			}
			else if (ma.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_MA_MA_3);
			}
			else {
				bindMa = true;

				query.append(_FINDER_COLUMN_TEN_MA_MA_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(KhachHangModelImpl.ORDER_BY_JPQL);
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

				if (bindMa) {
					qPos.add(ma);
				}

				if (!pagination) {
					list = (List<KhachHang>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KhachHang>(list);
				}
				else {
					list = (List<KhachHang>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first khach hang in the ordered set where ten = &#63; and ma = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching khach hang
	 * @throws com.minimart.portlet.khachhang.NoSuchKhachHangException if a matching khach hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhachHang findByTEN_MA_First(String ten, String ma,
		OrderByComparator orderByComparator)
		throws NoSuchKhachHangException, SystemException {
		KhachHang khachHang = fetchByTEN_MA_First(ten, ma, orderByComparator);

		if (khachHang != null) {
			return khachHang;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(", ma=");
		msg.append(ma);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKhachHangException(msg.toString());
	}

	/**
	 * Returns the first khach hang in the ordered set where ten = &#63; and ma = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching khach hang, or <code>null</code> if a matching khach hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhachHang fetchByTEN_MA_First(String ten, String ma,
		OrderByComparator orderByComparator) throws SystemException {
		List<KhachHang> list = findByTEN_MA(ten, ma, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last khach hang in the ordered set where ten = &#63; and ma = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching khach hang
	 * @throws com.minimart.portlet.khachhang.NoSuchKhachHangException if a matching khach hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhachHang findByTEN_MA_Last(String ten, String ma,
		OrderByComparator orderByComparator)
		throws NoSuchKhachHangException, SystemException {
		KhachHang khachHang = fetchByTEN_MA_Last(ten, ma, orderByComparator);

		if (khachHang != null) {
			return khachHang;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(", ma=");
		msg.append(ma);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKhachHangException(msg.toString());
	}

	/**
	 * Returns the last khach hang in the ordered set where ten = &#63; and ma = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching khach hang, or <code>null</code> if a matching khach hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhachHang fetchByTEN_MA_Last(String ten, String ma,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTEN_MA(ten, ma);

		if (count == 0) {
			return null;
		}

		List<KhachHang> list = findByTEN_MA(ten, ma, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the khach hangs before and after the current khach hang in the ordered set where ten = &#63; and ma = &#63;.
	 *
	 * @param khachHangId the primary key of the current khach hang
	 * @param ten the ten
	 * @param ma the ma
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next khach hang
	 * @throws com.minimart.portlet.khachhang.NoSuchKhachHangException if a khach hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhachHang[] findByTEN_MA_PrevAndNext(long khachHangId, String ten,
		String ma, OrderByComparator orderByComparator)
		throws NoSuchKhachHangException, SystemException {
		KhachHang khachHang = findByPrimaryKey(khachHangId);

		Session session = null;

		try {
			session = openSession();

			KhachHang[] array = new KhachHangImpl[3];

			array[0] = getByTEN_MA_PrevAndNext(session, khachHang, ten, ma,
					orderByComparator, true);

			array[1] = khachHang;

			array[2] = getByTEN_MA_PrevAndNext(session, khachHang, ten, ma,
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

	protected KhachHang getByTEN_MA_PrevAndNext(Session session,
		KhachHang khachHang, String ten, String ma,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KHACHHANG_WHERE);

		boolean bindTen = false;

		if (ten == null) {
			query.append(_FINDER_COLUMN_TEN_MA_TEN_1);
		}
		else if (ten.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TEN_MA_TEN_3);
		}
		else {
			bindTen = true;

			query.append(_FINDER_COLUMN_TEN_MA_TEN_2);
		}

		boolean bindMa = false;

		if (ma == null) {
			query.append(_FINDER_COLUMN_TEN_MA_MA_1);
		}
		else if (ma.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TEN_MA_MA_3);
		}
		else {
			bindMa = true;

			query.append(_FINDER_COLUMN_TEN_MA_MA_2);
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
			query.append(KhachHangModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindTen) {
			qPos.add(ten);
		}

		if (bindMa) {
			qPos.add(ma);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(khachHang);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<KhachHang> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the khach hangs where ten = &#63; and ma = &#63; from the database.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTEN_MA(String ten, String ma) throws SystemException {
		for (KhachHang khachHang : findByTEN_MA(ten, ma, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(khachHang);
		}
	}

	/**
	 * Returns the number of khach hangs where ten = &#63; and ma = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @return the number of matching khach hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTEN_MA(String ten, String ma) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TEN_MA;

		Object[] finderArgs = new Object[] { ten, ma };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_KHACHHANG_WHERE);

			boolean bindTen = false;

			if (ten == null) {
				query.append(_FINDER_COLUMN_TEN_MA_TEN_1);
			}
			else if (ten.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_MA_TEN_3);
			}
			else {
				bindTen = true;

				query.append(_FINDER_COLUMN_TEN_MA_TEN_2);
			}

			boolean bindMa = false;

			if (ma == null) {
				query.append(_FINDER_COLUMN_TEN_MA_MA_1);
			}
			else if (ma.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_MA_MA_3);
			}
			else {
				bindMa = true;

				query.append(_FINDER_COLUMN_TEN_MA_MA_2);
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

				if (bindMa) {
					qPos.add(ma);
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

	private static final String _FINDER_COLUMN_TEN_MA_TEN_1 = "khachHang.ten IS NULL AND ";
	private static final String _FINDER_COLUMN_TEN_MA_TEN_2 = "khachHang.ten = ? AND ";
	private static final String _FINDER_COLUMN_TEN_MA_TEN_3 = "(khachHang.ten IS NULL OR khachHang.ten = '') AND ";
	private static final String _FINDER_COLUMN_TEN_MA_MA_1 = "khachHang.ma IS NULL";
	private static final String _FINDER_COLUMN_TEN_MA_MA_2 = "khachHang.ma = ?";
	private static final String _FINDER_COLUMN_TEN_MA_MA_3 = "(khachHang.ma IS NULL OR khachHang.ma = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_MA_NHOM_HD =
		new FinderPath(KhachHangModelImpl.ENTITY_CACHE_ENABLED,
			KhachHangModelImpl.FINDER_CACHE_ENABLED, KhachHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTEN_MA_NHOM_HD",
			new String[] {
				String.class.getName(), String.class.getName(),
				Long.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_NHOM_HD =
		new FinderPath(KhachHangModelImpl.ENTITY_CACHE_ENABLED,
			KhachHangModelImpl.FINDER_CACHE_ENABLED, KhachHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTEN_MA_NHOM_HD",
			new String[] {
				String.class.getName(), String.class.getName(),
				Long.class.getName(), Boolean.class.getName()
			},
			KhachHangModelImpl.TEN_COLUMN_BITMASK |
			KhachHangModelImpl.MA_COLUMN_BITMASK |
			KhachHangModelImpl.NHOMKHACHHANGID_COLUMN_BITMASK |
			KhachHangModelImpl.HOATDONG_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEN_MA_NHOM_HD = new FinderPath(KhachHangModelImpl.ENTITY_CACHE_ENABLED,
			KhachHangModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTEN_MA_NHOM_HD",
			new String[] {
				String.class.getName(), String.class.getName(),
				Long.class.getName(), Boolean.class.getName()
			});

	/**
	 * Returns all the khach hangs where ten = &#63; and ma = &#63; and nhomKhachHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param nhomKhachHangId the nhom khach hang ID
	 * @param hoatDong the hoat dong
	 * @return the matching khach hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KhachHang> findByTEN_MA_NHOM_HD(String ten, String ma,
		long nhomKhachHangId, boolean hoatDong) throws SystemException {
		return findByTEN_MA_NHOM_HD(ten, ma, nhomKhachHangId, hoatDong,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the khach hangs where ten = &#63; and ma = &#63; and nhomKhachHangId = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.KhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param nhomKhachHangId the nhom khach hang ID
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of khach hangs
	 * @param end the upper bound of the range of khach hangs (not inclusive)
	 * @return the range of matching khach hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KhachHang> findByTEN_MA_NHOM_HD(String ten, String ma,
		long nhomKhachHangId, boolean hoatDong, int start, int end)
		throws SystemException {
		return findByTEN_MA_NHOM_HD(ten, ma, nhomKhachHangId, hoatDong, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the khach hangs where ten = &#63; and ma = &#63; and nhomKhachHangId = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.KhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param nhomKhachHangId the nhom khach hang ID
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of khach hangs
	 * @param end the upper bound of the range of khach hangs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching khach hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KhachHang> findByTEN_MA_NHOM_HD(String ten, String ma,
		long nhomKhachHangId, boolean hoatDong, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_NHOM_HD;
			finderArgs = new Object[] { ten, ma, nhomKhachHangId, hoatDong };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_MA_NHOM_HD;
			finderArgs = new Object[] {
					ten, ma, nhomKhachHangId, hoatDong,
					
					start, end, orderByComparator
				};
		}

		List<KhachHang> list = (List<KhachHang>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (KhachHang khachHang : list) {
				if (!Validator.equals(ten, khachHang.getTen()) ||
						!Validator.equals(ma, khachHang.getMa()) ||
						(nhomKhachHangId != khachHang.getNhomKhachHangId()) ||
						(hoatDong != khachHang.getHoatDong())) {
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

			query.append(_SQL_SELECT_KHACHHANG_WHERE);

			boolean bindTen = false;

			if (ten == null) {
				query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_TEN_1);
			}
			else if (ten.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_TEN_3);
			}
			else {
				bindTen = true;

				query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_TEN_2);
			}

			boolean bindMa = false;

			if (ma == null) {
				query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_MA_1);
			}
			else if (ma.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_MA_3);
			}
			else {
				bindMa = true;

				query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_MA_2);
			}

			query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_NHOMKHACHHANGID_2);

			query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_HOATDONG_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(KhachHangModelImpl.ORDER_BY_JPQL);
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

				if (bindMa) {
					qPos.add(ma);
				}

				qPos.add(nhomKhachHangId);

				qPos.add(hoatDong);

				if (!pagination) {
					list = (List<KhachHang>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KhachHang>(list);
				}
				else {
					list = (List<KhachHang>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first khach hang in the ordered set where ten = &#63; and ma = &#63; and nhomKhachHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param nhomKhachHangId the nhom khach hang ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching khach hang
	 * @throws com.minimart.portlet.khachhang.NoSuchKhachHangException if a matching khach hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhachHang findByTEN_MA_NHOM_HD_First(String ten, String ma,
		long nhomKhachHangId, boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchKhachHangException, SystemException {
		KhachHang khachHang = fetchByTEN_MA_NHOM_HD_First(ten, ma,
				nhomKhachHangId, hoatDong, orderByComparator);

		if (khachHang != null) {
			return khachHang;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(", ma=");
		msg.append(ma);

		msg.append(", nhomKhachHangId=");
		msg.append(nhomKhachHangId);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKhachHangException(msg.toString());
	}

	/**
	 * Returns the first khach hang in the ordered set where ten = &#63; and ma = &#63; and nhomKhachHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param nhomKhachHangId the nhom khach hang ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching khach hang, or <code>null</code> if a matching khach hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhachHang fetchByTEN_MA_NHOM_HD_First(String ten, String ma,
		long nhomKhachHangId, boolean hoatDong,
		OrderByComparator orderByComparator) throws SystemException {
		List<KhachHang> list = findByTEN_MA_NHOM_HD(ten, ma, nhomKhachHangId,
				hoatDong, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last khach hang in the ordered set where ten = &#63; and ma = &#63; and nhomKhachHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param nhomKhachHangId the nhom khach hang ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching khach hang
	 * @throws com.minimart.portlet.khachhang.NoSuchKhachHangException if a matching khach hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhachHang findByTEN_MA_NHOM_HD_Last(String ten, String ma,
		long nhomKhachHangId, boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchKhachHangException, SystemException {
		KhachHang khachHang = fetchByTEN_MA_NHOM_HD_Last(ten, ma,
				nhomKhachHangId, hoatDong, orderByComparator);

		if (khachHang != null) {
			return khachHang;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(", ma=");
		msg.append(ma);

		msg.append(", nhomKhachHangId=");
		msg.append(nhomKhachHangId);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKhachHangException(msg.toString());
	}

	/**
	 * Returns the last khach hang in the ordered set where ten = &#63; and ma = &#63; and nhomKhachHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param nhomKhachHangId the nhom khach hang ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching khach hang, or <code>null</code> if a matching khach hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhachHang fetchByTEN_MA_NHOM_HD_Last(String ten, String ma,
		long nhomKhachHangId, boolean hoatDong,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTEN_MA_NHOM_HD(ten, ma, nhomKhachHangId, hoatDong);

		if (count == 0) {
			return null;
		}

		List<KhachHang> list = findByTEN_MA_NHOM_HD(ten, ma, nhomKhachHangId,
				hoatDong, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the khach hangs before and after the current khach hang in the ordered set where ten = &#63; and ma = &#63; and nhomKhachHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param khachHangId the primary key of the current khach hang
	 * @param ten the ten
	 * @param ma the ma
	 * @param nhomKhachHangId the nhom khach hang ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next khach hang
	 * @throws com.minimart.portlet.khachhang.NoSuchKhachHangException if a khach hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhachHang[] findByTEN_MA_NHOM_HD_PrevAndNext(long khachHangId,
		String ten, String ma, long nhomKhachHangId, boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchKhachHangException, SystemException {
		KhachHang khachHang = findByPrimaryKey(khachHangId);

		Session session = null;

		try {
			session = openSession();

			KhachHang[] array = new KhachHangImpl[3];

			array[0] = getByTEN_MA_NHOM_HD_PrevAndNext(session, khachHang, ten,
					ma, nhomKhachHangId, hoatDong, orderByComparator, true);

			array[1] = khachHang;

			array[2] = getByTEN_MA_NHOM_HD_PrevAndNext(session, khachHang, ten,
					ma, nhomKhachHangId, hoatDong, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected KhachHang getByTEN_MA_NHOM_HD_PrevAndNext(Session session,
		KhachHang khachHang, String ten, String ma, long nhomKhachHangId,
		boolean hoatDong, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KHACHHANG_WHERE);

		boolean bindTen = false;

		if (ten == null) {
			query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_TEN_1);
		}
		else if (ten.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_TEN_3);
		}
		else {
			bindTen = true;

			query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_TEN_2);
		}

		boolean bindMa = false;

		if (ma == null) {
			query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_MA_1);
		}
		else if (ma.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_MA_3);
		}
		else {
			bindMa = true;

			query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_MA_2);
		}

		query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_NHOMKHACHHANGID_2);

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
			query.append(KhachHangModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindTen) {
			qPos.add(ten);
		}

		if (bindMa) {
			qPos.add(ma);
		}

		qPos.add(nhomKhachHangId);

		qPos.add(hoatDong);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(khachHang);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<KhachHang> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the khach hangs where ten = &#63; and ma = &#63; and nhomKhachHangId = &#63; and hoatDong = &#63; from the database.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param nhomKhachHangId the nhom khach hang ID
	 * @param hoatDong the hoat dong
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTEN_MA_NHOM_HD(String ten, String ma,
		long nhomKhachHangId, boolean hoatDong) throws SystemException {
		for (KhachHang khachHang : findByTEN_MA_NHOM_HD(ten, ma,
				nhomKhachHangId, hoatDong, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(khachHang);
		}
	}

	/**
	 * Returns the number of khach hangs where ten = &#63; and ma = &#63; and nhomKhachHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param ten the ten
	 * @param ma the ma
	 * @param nhomKhachHangId the nhom khach hang ID
	 * @param hoatDong the hoat dong
	 * @return the number of matching khach hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTEN_MA_NHOM_HD(String ten, String ma,
		long nhomKhachHangId, boolean hoatDong) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TEN_MA_NHOM_HD;

		Object[] finderArgs = new Object[] { ten, ma, nhomKhachHangId, hoatDong };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_KHACHHANG_WHERE);

			boolean bindTen = false;

			if (ten == null) {
				query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_TEN_1);
			}
			else if (ten.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_TEN_3);
			}
			else {
				bindTen = true;

				query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_TEN_2);
			}

			boolean bindMa = false;

			if (ma == null) {
				query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_MA_1);
			}
			else if (ma.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_MA_3);
			}
			else {
				bindMa = true;

				query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_MA_2);
			}

			query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_NHOMKHACHHANGID_2);

			query.append(_FINDER_COLUMN_TEN_MA_NHOM_HD_HOATDONG_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTen) {
					qPos.add(ten);
				}

				if (bindMa) {
					qPos.add(ma);
				}

				qPos.add(nhomKhachHangId);

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

	private static final String _FINDER_COLUMN_TEN_MA_NHOM_HD_TEN_1 = "khachHang.ten IS NULL AND ";
	private static final String _FINDER_COLUMN_TEN_MA_NHOM_HD_TEN_2 = "khachHang.ten = ? AND ";
	private static final String _FINDER_COLUMN_TEN_MA_NHOM_HD_TEN_3 = "(khachHang.ten IS NULL OR khachHang.ten = '') AND ";
	private static final String _FINDER_COLUMN_TEN_MA_NHOM_HD_MA_1 = "khachHang.ma IS NULL AND ";
	private static final String _FINDER_COLUMN_TEN_MA_NHOM_HD_MA_2 = "khachHang.ma = ? AND ";
	private static final String _FINDER_COLUMN_TEN_MA_NHOM_HD_MA_3 = "(khachHang.ma IS NULL OR khachHang.ma = '') AND ";
	private static final String _FINDER_COLUMN_TEN_MA_NHOM_HD_NHOMKHACHHANGID_2 = "khachHang.nhomKhachHangId = ? AND ";
	private static final String _FINDER_COLUMN_TEN_MA_NHOM_HD_HOATDONG_2 = "khachHang.hoatDong = ?";

	public KhachHangPersistenceImpl() {
		setModelClass(KhachHang.class);
	}

	/**
	 * Caches the khach hang in the entity cache if it is enabled.
	 *
	 * @param khachHang the khach hang
	 */
	@Override
	public void cacheResult(KhachHang khachHang) {
		EntityCacheUtil.putResult(KhachHangModelImpl.ENTITY_CACHE_ENABLED,
			KhachHangImpl.class, khachHang.getPrimaryKey(), khachHang);

		khachHang.resetOriginalValues();
	}

	/**
	 * Caches the khach hangs in the entity cache if it is enabled.
	 *
	 * @param khachHangs the khach hangs
	 */
	@Override
	public void cacheResult(List<KhachHang> khachHangs) {
		for (KhachHang khachHang : khachHangs) {
			if (EntityCacheUtil.getResult(
						KhachHangModelImpl.ENTITY_CACHE_ENABLED,
						KhachHangImpl.class, khachHang.getPrimaryKey()) == null) {
				cacheResult(khachHang);
			}
			else {
				khachHang.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all khach hangs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(KhachHangImpl.class.getName());
		}

		EntityCacheUtil.clearCache(KhachHangImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the khach hang.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(KhachHang khachHang) {
		EntityCacheUtil.removeResult(KhachHangModelImpl.ENTITY_CACHE_ENABLED,
			KhachHangImpl.class, khachHang.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<KhachHang> khachHangs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (KhachHang khachHang : khachHangs) {
			EntityCacheUtil.removeResult(KhachHangModelImpl.ENTITY_CACHE_ENABLED,
				KhachHangImpl.class, khachHang.getPrimaryKey());
		}
	}

	/**
	 * Creates a new khach hang with the primary key. Does not add the khach hang to the database.
	 *
	 * @param khachHangId the primary key for the new khach hang
	 * @return the new khach hang
	 */
	@Override
	public KhachHang create(long khachHangId) {
		KhachHang khachHang = new KhachHangImpl();

		khachHang.setNew(true);
		khachHang.setPrimaryKey(khachHangId);

		return khachHang;
	}

	/**
	 * Removes the khach hang with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param khachHangId the primary key of the khach hang
	 * @return the khach hang that was removed
	 * @throws com.minimart.portlet.khachhang.NoSuchKhachHangException if a khach hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhachHang remove(long khachHangId)
		throws NoSuchKhachHangException, SystemException {
		return remove((Serializable)khachHangId);
	}

	/**
	 * Removes the khach hang with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the khach hang
	 * @return the khach hang that was removed
	 * @throws com.minimart.portlet.khachhang.NoSuchKhachHangException if a khach hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhachHang remove(Serializable primaryKey)
		throws NoSuchKhachHangException, SystemException {
		Session session = null;

		try {
			session = openSession();

			KhachHang khachHang = (KhachHang)session.get(KhachHangImpl.class,
					primaryKey);

			if (khachHang == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchKhachHangException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(khachHang);
		}
		catch (NoSuchKhachHangException nsee) {
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
	protected KhachHang removeImpl(KhachHang khachHang)
		throws SystemException {
		khachHang = toUnwrappedModel(khachHang);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(khachHang)) {
				khachHang = (KhachHang)session.get(KhachHangImpl.class,
						khachHang.getPrimaryKeyObj());
			}

			if (khachHang != null) {
				session.delete(khachHang);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (khachHang != null) {
			clearCache(khachHang);
		}

		return khachHang;
	}

	@Override
	public KhachHang updateImpl(
		com.minimart.portlet.khachhang.model.KhachHang khachHang)
		throws SystemException {
		khachHang = toUnwrappedModel(khachHang);

		boolean isNew = khachHang.isNew();

		KhachHangModelImpl khachHangModelImpl = (KhachHangModelImpl)khachHang;

		Session session = null;

		try {
			session = openSession();

			if (khachHang.isNew()) {
				session.save(khachHang);

				khachHang.setNew(false);
			}
			else {
				session.merge(khachHang);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !KhachHangModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((khachHangModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						khachHangModelImpl.getOriginalTen(),
						khachHangModelImpl.getOriginalMa()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_MA, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA,
					args);

				args = new Object[] {
						khachHangModelImpl.getTen(), khachHangModelImpl.getMa()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_MA, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA,
					args);
			}

			if ((khachHangModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_NHOM_HD.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						khachHangModelImpl.getOriginalTen(),
						khachHangModelImpl.getOriginalMa(),
						khachHangModelImpl.getOriginalNhomKhachHangId(),
						khachHangModelImpl.getOriginalHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_MA_NHOM_HD,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_NHOM_HD,
					args);

				args = new Object[] {
						khachHangModelImpl.getTen(), khachHangModelImpl.getMa(),
						khachHangModelImpl.getNhomKhachHangId(),
						khachHangModelImpl.getHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_MA_NHOM_HD,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_MA_NHOM_HD,
					args);
			}
		}

		EntityCacheUtil.putResult(KhachHangModelImpl.ENTITY_CACHE_ENABLED,
			KhachHangImpl.class, khachHang.getPrimaryKey(), khachHang);

		return khachHang;
	}

	protected KhachHang toUnwrappedModel(KhachHang khachHang) {
		if (khachHang instanceof KhachHangImpl) {
			return khachHang;
		}

		KhachHangImpl khachHangImpl = new KhachHangImpl();

		khachHangImpl.setNew(khachHang.isNew());
		khachHangImpl.setPrimaryKey(khachHang.getPrimaryKey());

		khachHangImpl.setKhachHangId(khachHang.getKhachHangId());
		khachHangImpl.setCompanyId(khachHang.getCompanyId());
		khachHangImpl.setUserId(khachHang.getUserId());
		khachHangImpl.setUserName(khachHang.getUserName());
		khachHangImpl.setCreateDate(khachHang.getCreateDate());
		khachHangImpl.setModifiedDate(khachHang.getModifiedDate());
		khachHangImpl.setTen(khachHang.getTen());
		khachHangImpl.setNhomKhachHangId(khachHang.getNhomKhachHangId());
		khachHangImpl.setMa(khachHang.getMa());
		khachHangImpl.setDiaChi(khachHang.getDiaChi());
		khachHangImpl.setDienThoai(khachHang.getDienThoai());
		khachHangImpl.setEmail(khachHang.getEmail());
		khachHangImpl.setFacebook(khachHang.getFacebook());
		khachHangImpl.setTwitter(khachHang.getTwitter());
		khachHangImpl.setSocialMedia1(khachHang.getSocialMedia1());
		khachHangImpl.setSocialMedia2(khachHang.getSocialMedia2());
		khachHangImpl.setSocialMedia3(khachHang.getSocialMedia3());
		khachHangImpl.setTrangThai(khachHang.getTrangThai());
		khachHangImpl.setDiemTichLuy(khachHang.getDiemTichLuy());
		khachHangImpl.setMaSoThue(khachHang.getMaSoThue());
		khachHangImpl.setHoatDong(khachHang.isHoatDong());
		khachHangImpl.setNgaySinh(khachHang.getNgaySinh());

		return khachHangImpl;
	}

	/**
	 * Returns the khach hang with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the khach hang
	 * @return the khach hang
	 * @throws com.minimart.portlet.khachhang.NoSuchKhachHangException if a khach hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhachHang findByPrimaryKey(Serializable primaryKey)
		throws NoSuchKhachHangException, SystemException {
		KhachHang khachHang = fetchByPrimaryKey(primaryKey);

		if (khachHang == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchKhachHangException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return khachHang;
	}

	/**
	 * Returns the khach hang with the primary key or throws a {@link com.minimart.portlet.khachhang.NoSuchKhachHangException} if it could not be found.
	 *
	 * @param khachHangId the primary key of the khach hang
	 * @return the khach hang
	 * @throws com.minimart.portlet.khachhang.NoSuchKhachHangException if a khach hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhachHang findByPrimaryKey(long khachHangId)
		throws NoSuchKhachHangException, SystemException {
		return findByPrimaryKey((Serializable)khachHangId);
	}

	/**
	 * Returns the khach hang with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the khach hang
	 * @return the khach hang, or <code>null</code> if a khach hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhachHang fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		KhachHang khachHang = (KhachHang)EntityCacheUtil.getResult(KhachHangModelImpl.ENTITY_CACHE_ENABLED,
				KhachHangImpl.class, primaryKey);

		if (khachHang == _nullKhachHang) {
			return null;
		}

		if (khachHang == null) {
			Session session = null;

			try {
				session = openSession();

				khachHang = (KhachHang)session.get(KhachHangImpl.class,
						primaryKey);

				if (khachHang != null) {
					cacheResult(khachHang);
				}
				else {
					EntityCacheUtil.putResult(KhachHangModelImpl.ENTITY_CACHE_ENABLED,
						KhachHangImpl.class, primaryKey, _nullKhachHang);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(KhachHangModelImpl.ENTITY_CACHE_ENABLED,
					KhachHangImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return khachHang;
	}

	/**
	 * Returns the khach hang with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param khachHangId the primary key of the khach hang
	 * @return the khach hang, or <code>null</code> if a khach hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public KhachHang fetchByPrimaryKey(long khachHangId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)khachHangId);
	}

	/**
	 * Returns all the khach hangs.
	 *
	 * @return the khach hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KhachHang> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the khach hangs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.KhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of khach hangs
	 * @param end the upper bound of the range of khach hangs (not inclusive)
	 * @return the range of khach hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KhachHang> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the khach hangs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khachhang.model.impl.KhachHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of khach hangs
	 * @param end the upper bound of the range of khach hangs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of khach hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<KhachHang> findAll(int start, int end,
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

		List<KhachHang> list = (List<KhachHang>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_KHACHHANG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_KHACHHANG;

				if (pagination) {
					sql = sql.concat(KhachHangModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<KhachHang>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<KhachHang>(list);
				}
				else {
					list = (List<KhachHang>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the khach hangs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (KhachHang khachHang : findAll()) {
			remove(khachHang);
		}
	}

	/**
	 * Returns the number of khach hangs.
	 *
	 * @return the number of khach hangs
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

				Query q = session.createQuery(_SQL_COUNT_KHACHHANG);

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
	 * Initializes the khach hang persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.minimart.portlet.khachhang.model.KhachHang")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<KhachHang>> listenersList = new ArrayList<ModelListener<KhachHang>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<KhachHang>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(KhachHangImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_KHACHHANG = "SELECT khachHang FROM KhachHang khachHang";
	private static final String _SQL_SELECT_KHACHHANG_WHERE = "SELECT khachHang FROM KhachHang khachHang WHERE ";
	private static final String _SQL_COUNT_KHACHHANG = "SELECT COUNT(khachHang) FROM KhachHang khachHang";
	private static final String _SQL_COUNT_KHACHHANG_WHERE = "SELECT COUNT(khachHang) FROM KhachHang khachHang WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "khachHang.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No KhachHang exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No KhachHang exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(KhachHangPersistenceImpl.class);
	private static KhachHang _nullKhachHang = new KhachHangImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<KhachHang> toCacheModel() {
				return _nullKhachHangCacheModel;
			}
		};

	private static CacheModel<KhachHang> _nullKhachHangCacheModel = new CacheModel<KhachHang>() {
			@Override
			public KhachHang toEntityModel() {
				return _nullKhachHang;
			}
		};
}