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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.minimart.portlet.banhang.NoSuchDonHangException;
import com.minimart.portlet.banhang.model.DonHang;
import com.minimart.portlet.banhang.model.impl.DonHangImpl;
import com.minimart.portlet.banhang.model.impl.DonHangModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the don hang service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see DonHangPersistence
 * @see DonHangUtil
 * @generated
 */
public class DonHangPersistenceImpl extends BasePersistenceImpl<DonHang>
	implements DonHangPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DonHangUtil} to access the don hang persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DonHangImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DonHangModelImpl.ENTITY_CACHE_ENABLED,
			DonHangModelImpl.FINDER_CACHE_ENABLED, DonHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DonHangModelImpl.ENTITY_CACHE_ENABLED,
			DonHangModelImpl.FINDER_CACHE_ENABLED, DonHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DonHangModelImpl.ENTITY_CACHE_ENABLED,
			DonHangModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CH_KH_HD = new FinderPath(DonHangModelImpl.ENTITY_CACHE_ENABLED,
			DonHangModelImpl.FINDER_CACHE_ENABLED, DonHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCH_KH_HD",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CH_KH_HD =
		new FinderPath(DonHangModelImpl.ENTITY_CACHE_ENABLED,
			DonHangModelImpl.FINDER_CACHE_ENABLED, DonHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCH_KH_HD",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Boolean.class.getName()
			},
			DonHangModelImpl.CUAHANGID_COLUMN_BITMASK |
			DonHangModelImpl.KHACHHANGID_COLUMN_BITMASK |
			DonHangModelImpl.HOATDONG_COLUMN_BITMASK |
			DonHangModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CH_KH_HD = new FinderPath(DonHangModelImpl.ENTITY_CACHE_ENABLED,
			DonHangModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCH_KH_HD",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Boolean.class.getName()
			});

	/**
	 * Returns all the don hangs where cuaHangId = &#63; and khachHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param cuaHangId the cua hang ID
	 * @param khachHangId the khach hang ID
	 * @param hoatDong the hoat dong
	 * @return the matching don hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DonHang> findByCH_KH_HD(long cuaHangId, long khachHangId,
		boolean hoatDong) throws SystemException {
		return findByCH_KH_HD(cuaHangId, khachHangId, hoatDong,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the don hangs where cuaHangId = &#63; and khachHangId = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.DonHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param cuaHangId the cua hang ID
	 * @param khachHangId the khach hang ID
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of don hangs
	 * @param end the upper bound of the range of don hangs (not inclusive)
	 * @return the range of matching don hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DonHang> findByCH_KH_HD(long cuaHangId, long khachHangId,
		boolean hoatDong, int start, int end) throws SystemException {
		return findByCH_KH_HD(cuaHangId, khachHangId, hoatDong, start, end, null);
	}

	/**
	 * Returns an ordered range of all the don hangs where cuaHangId = &#63; and khachHangId = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.DonHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param cuaHangId the cua hang ID
	 * @param khachHangId the khach hang ID
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of don hangs
	 * @param end the upper bound of the range of don hangs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching don hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DonHang> findByCH_KH_HD(long cuaHangId, long khachHangId,
		boolean hoatDong, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CH_KH_HD;
			finderArgs = new Object[] { cuaHangId, khachHangId, hoatDong };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CH_KH_HD;
			finderArgs = new Object[] {
					cuaHangId, khachHangId, hoatDong,
					
					start, end, orderByComparator
				};
		}

		List<DonHang> list = (List<DonHang>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DonHang donHang : list) {
				if ((cuaHangId != donHang.getCuaHangId()) ||
						(khachHangId != donHang.getKhachHangId()) ||
						(hoatDong != donHang.getHoatDong())) {
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

			query.append(_SQL_SELECT_DONHANG_WHERE);

			query.append(_FINDER_COLUMN_CH_KH_HD_CUAHANGID_2);

			query.append(_FINDER_COLUMN_CH_KH_HD_KHACHHANGID_2);

			query.append(_FINDER_COLUMN_CH_KH_HD_HOATDONG_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DonHangModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(cuaHangId);

				qPos.add(khachHangId);

				qPos.add(hoatDong);

				if (!pagination) {
					list = (List<DonHang>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DonHang>(list);
				}
				else {
					list = (List<DonHang>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first don hang in the ordered set where cuaHangId = &#63; and khachHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param cuaHangId the cua hang ID
	 * @param khachHangId the khach hang ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching don hang
	 * @throws com.minimart.portlet.banhang.NoSuchDonHangException if a matching don hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHang findByCH_KH_HD_First(long cuaHangId, long khachHangId,
		boolean hoatDong, OrderByComparator orderByComparator)
		throws NoSuchDonHangException, SystemException {
		DonHang donHang = fetchByCH_KH_HD_First(cuaHangId, khachHangId,
				hoatDong, orderByComparator);

		if (donHang != null) {
			return donHang;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("cuaHangId=");
		msg.append(cuaHangId);

		msg.append(", khachHangId=");
		msg.append(khachHangId);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDonHangException(msg.toString());
	}

	/**
	 * Returns the first don hang in the ordered set where cuaHangId = &#63; and khachHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param cuaHangId the cua hang ID
	 * @param khachHangId the khach hang ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching don hang, or <code>null</code> if a matching don hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHang fetchByCH_KH_HD_First(long cuaHangId, long khachHangId,
		boolean hoatDong, OrderByComparator orderByComparator)
		throws SystemException {
		List<DonHang> list = findByCH_KH_HD(cuaHangId, khachHangId, hoatDong,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last don hang in the ordered set where cuaHangId = &#63; and khachHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param cuaHangId the cua hang ID
	 * @param khachHangId the khach hang ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching don hang
	 * @throws com.minimart.portlet.banhang.NoSuchDonHangException if a matching don hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHang findByCH_KH_HD_Last(long cuaHangId, long khachHangId,
		boolean hoatDong, OrderByComparator orderByComparator)
		throws NoSuchDonHangException, SystemException {
		DonHang donHang = fetchByCH_KH_HD_Last(cuaHangId, khachHangId,
				hoatDong, orderByComparator);

		if (donHang != null) {
			return donHang;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("cuaHangId=");
		msg.append(cuaHangId);

		msg.append(", khachHangId=");
		msg.append(khachHangId);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDonHangException(msg.toString());
	}

	/**
	 * Returns the last don hang in the ordered set where cuaHangId = &#63; and khachHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param cuaHangId the cua hang ID
	 * @param khachHangId the khach hang ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching don hang, or <code>null</code> if a matching don hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHang fetchByCH_KH_HD_Last(long cuaHangId, long khachHangId,
		boolean hoatDong, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByCH_KH_HD(cuaHangId, khachHangId, hoatDong);

		if (count == 0) {
			return null;
		}

		List<DonHang> list = findByCH_KH_HD(cuaHangId, khachHangId, hoatDong,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the don hangs before and after the current don hang in the ordered set where cuaHangId = &#63; and khachHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param donHangId the primary key of the current don hang
	 * @param cuaHangId the cua hang ID
	 * @param khachHangId the khach hang ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next don hang
	 * @throws com.minimart.portlet.banhang.NoSuchDonHangException if a don hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHang[] findByCH_KH_HD_PrevAndNext(long donHangId, long cuaHangId,
		long khachHangId, boolean hoatDong, OrderByComparator orderByComparator)
		throws NoSuchDonHangException, SystemException {
		DonHang donHang = findByPrimaryKey(donHangId);

		Session session = null;

		try {
			session = openSession();

			DonHang[] array = new DonHangImpl[3];

			array[0] = getByCH_KH_HD_PrevAndNext(session, donHang, cuaHangId,
					khachHangId, hoatDong, orderByComparator, true);

			array[1] = donHang;

			array[2] = getByCH_KH_HD_PrevAndNext(session, donHang, cuaHangId,
					khachHangId, hoatDong, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DonHang getByCH_KH_HD_PrevAndNext(Session session,
		DonHang donHang, long cuaHangId, long khachHangId, boolean hoatDong,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DONHANG_WHERE);

		query.append(_FINDER_COLUMN_CH_KH_HD_CUAHANGID_2);

		query.append(_FINDER_COLUMN_CH_KH_HD_KHACHHANGID_2);

		query.append(_FINDER_COLUMN_CH_KH_HD_HOATDONG_2);

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
			query.append(DonHangModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(cuaHangId);

		qPos.add(khachHangId);

		qPos.add(hoatDong);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(donHang);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DonHang> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the don hangs where cuaHangId = &#63; and khachHangId = &#63; and hoatDong = &#63; from the database.
	 *
	 * @param cuaHangId the cua hang ID
	 * @param khachHangId the khach hang ID
	 * @param hoatDong the hoat dong
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCH_KH_HD(long cuaHangId, long khachHangId,
		boolean hoatDong) throws SystemException {
		for (DonHang donHang : findByCH_KH_HD(cuaHangId, khachHangId, hoatDong,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(donHang);
		}
	}

	/**
	 * Returns the number of don hangs where cuaHangId = &#63; and khachHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param cuaHangId the cua hang ID
	 * @param khachHangId the khach hang ID
	 * @param hoatDong the hoat dong
	 * @return the number of matching don hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCH_KH_HD(long cuaHangId, long khachHangId,
		boolean hoatDong) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CH_KH_HD;

		Object[] finderArgs = new Object[] { cuaHangId, khachHangId, hoatDong };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DONHANG_WHERE);

			query.append(_FINDER_COLUMN_CH_KH_HD_CUAHANGID_2);

			query.append(_FINDER_COLUMN_CH_KH_HD_KHACHHANGID_2);

			query.append(_FINDER_COLUMN_CH_KH_HD_HOATDONG_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(cuaHangId);

				qPos.add(khachHangId);

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

	private static final String _FINDER_COLUMN_CH_KH_HD_CUAHANGID_2 = "donHang.cuaHangId = ? AND ";
	private static final String _FINDER_COLUMN_CH_KH_HD_KHACHHANGID_2 = "donHang.khachHangId = ? AND ";
	private static final String _FINDER_COLUMN_CH_KH_HD_HOATDONG_2 = "donHang.hoatDong = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CH_TT_HD = new FinderPath(DonHangModelImpl.ENTITY_CACHE_ENABLED,
			DonHangModelImpl.FINDER_CACHE_ENABLED, DonHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCH_TT_HD",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CH_TT_HD =
		new FinderPath(DonHangModelImpl.ENTITY_CACHE_ENABLED,
			DonHangModelImpl.FINDER_CACHE_ENABLED, DonHangImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCH_TT_HD",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Boolean.class.getName()
			},
			DonHangModelImpl.CUAHANGID_COLUMN_BITMASK |
			DonHangModelImpl.TRANGTHAIDONHANGID_COLUMN_BITMASK |
			DonHangModelImpl.HOATDONG_COLUMN_BITMASK |
			DonHangModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CH_TT_HD = new FinderPath(DonHangModelImpl.ENTITY_CACHE_ENABLED,
			DonHangModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCH_TT_HD",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				Boolean.class.getName()
			});

	/**
	 * Returns all the don hangs where cuaHangId = &#63; and trangThaiDonHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param cuaHangId the cua hang ID
	 * @param trangThaiDonHangId the trang thai don hang ID
	 * @param hoatDong the hoat dong
	 * @return the matching don hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DonHang> findByCH_TT_HD(long cuaHangId,
		long trangThaiDonHangId, boolean hoatDong) throws SystemException {
		return findByCH_TT_HD(cuaHangId, trangThaiDonHangId, hoatDong,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the don hangs where cuaHangId = &#63; and trangThaiDonHangId = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.DonHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param cuaHangId the cua hang ID
	 * @param trangThaiDonHangId the trang thai don hang ID
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of don hangs
	 * @param end the upper bound of the range of don hangs (not inclusive)
	 * @return the range of matching don hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DonHang> findByCH_TT_HD(long cuaHangId,
		long trangThaiDonHangId, boolean hoatDong, int start, int end)
		throws SystemException {
		return findByCH_TT_HD(cuaHangId, trangThaiDonHangId, hoatDong, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the don hangs where cuaHangId = &#63; and trangThaiDonHangId = &#63; and hoatDong = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.DonHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param cuaHangId the cua hang ID
	 * @param trangThaiDonHangId the trang thai don hang ID
	 * @param hoatDong the hoat dong
	 * @param start the lower bound of the range of don hangs
	 * @param end the upper bound of the range of don hangs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching don hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DonHang> findByCH_TT_HD(long cuaHangId,
		long trangThaiDonHangId, boolean hoatDong, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CH_TT_HD;
			finderArgs = new Object[] { cuaHangId, trangThaiDonHangId, hoatDong };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CH_TT_HD;
			finderArgs = new Object[] {
					cuaHangId, trangThaiDonHangId, hoatDong,
					
					start, end, orderByComparator
				};
		}

		List<DonHang> list = (List<DonHang>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DonHang donHang : list) {
				if ((cuaHangId != donHang.getCuaHangId()) ||
						(trangThaiDonHangId != donHang.getTrangThaiDonHangId()) ||
						(hoatDong != donHang.getHoatDong())) {
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

			query.append(_SQL_SELECT_DONHANG_WHERE);

			query.append(_FINDER_COLUMN_CH_TT_HD_CUAHANGID_2);

			query.append(_FINDER_COLUMN_CH_TT_HD_TRANGTHAIDONHANGID_2);

			query.append(_FINDER_COLUMN_CH_TT_HD_HOATDONG_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DonHangModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(cuaHangId);

				qPos.add(trangThaiDonHangId);

				qPos.add(hoatDong);

				if (!pagination) {
					list = (List<DonHang>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DonHang>(list);
				}
				else {
					list = (List<DonHang>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first don hang in the ordered set where cuaHangId = &#63; and trangThaiDonHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param cuaHangId the cua hang ID
	 * @param trangThaiDonHangId the trang thai don hang ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching don hang
	 * @throws com.minimart.portlet.banhang.NoSuchDonHangException if a matching don hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHang findByCH_TT_HD_First(long cuaHangId,
		long trangThaiDonHangId, boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchDonHangException, SystemException {
		DonHang donHang = fetchByCH_TT_HD_First(cuaHangId, trangThaiDonHangId,
				hoatDong, orderByComparator);

		if (donHang != null) {
			return donHang;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("cuaHangId=");
		msg.append(cuaHangId);

		msg.append(", trangThaiDonHangId=");
		msg.append(trangThaiDonHangId);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDonHangException(msg.toString());
	}

	/**
	 * Returns the first don hang in the ordered set where cuaHangId = &#63; and trangThaiDonHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param cuaHangId the cua hang ID
	 * @param trangThaiDonHangId the trang thai don hang ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching don hang, or <code>null</code> if a matching don hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHang fetchByCH_TT_HD_First(long cuaHangId,
		long trangThaiDonHangId, boolean hoatDong,
		OrderByComparator orderByComparator) throws SystemException {
		List<DonHang> list = findByCH_TT_HD(cuaHangId, trangThaiDonHangId,
				hoatDong, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last don hang in the ordered set where cuaHangId = &#63; and trangThaiDonHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param cuaHangId the cua hang ID
	 * @param trangThaiDonHangId the trang thai don hang ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching don hang
	 * @throws com.minimart.portlet.banhang.NoSuchDonHangException if a matching don hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHang findByCH_TT_HD_Last(long cuaHangId, long trangThaiDonHangId,
		boolean hoatDong, OrderByComparator orderByComparator)
		throws NoSuchDonHangException, SystemException {
		DonHang donHang = fetchByCH_TT_HD_Last(cuaHangId, trangThaiDonHangId,
				hoatDong, orderByComparator);

		if (donHang != null) {
			return donHang;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("cuaHangId=");
		msg.append(cuaHangId);

		msg.append(", trangThaiDonHangId=");
		msg.append(trangThaiDonHangId);

		msg.append(", hoatDong=");
		msg.append(hoatDong);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDonHangException(msg.toString());
	}

	/**
	 * Returns the last don hang in the ordered set where cuaHangId = &#63; and trangThaiDonHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param cuaHangId the cua hang ID
	 * @param trangThaiDonHangId the trang thai don hang ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching don hang, or <code>null</code> if a matching don hang could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHang fetchByCH_TT_HD_Last(long cuaHangId,
		long trangThaiDonHangId, boolean hoatDong,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCH_TT_HD(cuaHangId, trangThaiDonHangId, hoatDong);

		if (count == 0) {
			return null;
		}

		List<DonHang> list = findByCH_TT_HD(cuaHangId, trangThaiDonHangId,
				hoatDong, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the don hangs before and after the current don hang in the ordered set where cuaHangId = &#63; and trangThaiDonHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param donHangId the primary key of the current don hang
	 * @param cuaHangId the cua hang ID
	 * @param trangThaiDonHangId the trang thai don hang ID
	 * @param hoatDong the hoat dong
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next don hang
	 * @throws com.minimart.portlet.banhang.NoSuchDonHangException if a don hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHang[] findByCH_TT_HD_PrevAndNext(long donHangId, long cuaHangId,
		long trangThaiDonHangId, boolean hoatDong,
		OrderByComparator orderByComparator)
		throws NoSuchDonHangException, SystemException {
		DonHang donHang = findByPrimaryKey(donHangId);

		Session session = null;

		try {
			session = openSession();

			DonHang[] array = new DonHangImpl[3];

			array[0] = getByCH_TT_HD_PrevAndNext(session, donHang, cuaHangId,
					trangThaiDonHangId, hoatDong, orderByComparator, true);

			array[1] = donHang;

			array[2] = getByCH_TT_HD_PrevAndNext(session, donHang, cuaHangId,
					trangThaiDonHangId, hoatDong, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DonHang getByCH_TT_HD_PrevAndNext(Session session,
		DonHang donHang, long cuaHangId, long trangThaiDonHangId,
		boolean hoatDong, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DONHANG_WHERE);

		query.append(_FINDER_COLUMN_CH_TT_HD_CUAHANGID_2);

		query.append(_FINDER_COLUMN_CH_TT_HD_TRANGTHAIDONHANGID_2);

		query.append(_FINDER_COLUMN_CH_TT_HD_HOATDONG_2);

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
			query.append(DonHangModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(cuaHangId);

		qPos.add(trangThaiDonHangId);

		qPos.add(hoatDong);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(donHang);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DonHang> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the don hangs where cuaHangId = &#63; and trangThaiDonHangId = &#63; and hoatDong = &#63; from the database.
	 *
	 * @param cuaHangId the cua hang ID
	 * @param trangThaiDonHangId the trang thai don hang ID
	 * @param hoatDong the hoat dong
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCH_TT_HD(long cuaHangId, long trangThaiDonHangId,
		boolean hoatDong) throws SystemException {
		for (DonHang donHang : findByCH_TT_HD(cuaHangId, trangThaiDonHangId,
				hoatDong, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(donHang);
		}
	}

	/**
	 * Returns the number of don hangs where cuaHangId = &#63; and trangThaiDonHangId = &#63; and hoatDong = &#63;.
	 *
	 * @param cuaHangId the cua hang ID
	 * @param trangThaiDonHangId the trang thai don hang ID
	 * @param hoatDong the hoat dong
	 * @return the number of matching don hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCH_TT_HD(long cuaHangId, long trangThaiDonHangId,
		boolean hoatDong) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CH_TT_HD;

		Object[] finderArgs = new Object[] {
				cuaHangId, trangThaiDonHangId, hoatDong
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DONHANG_WHERE);

			query.append(_FINDER_COLUMN_CH_TT_HD_CUAHANGID_2);

			query.append(_FINDER_COLUMN_CH_TT_HD_TRANGTHAIDONHANGID_2);

			query.append(_FINDER_COLUMN_CH_TT_HD_HOATDONG_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(cuaHangId);

				qPos.add(trangThaiDonHangId);

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

	private static final String _FINDER_COLUMN_CH_TT_HD_CUAHANGID_2 = "donHang.cuaHangId = ? AND ";
	private static final String _FINDER_COLUMN_CH_TT_HD_TRANGTHAIDONHANGID_2 = "donHang.trangThaiDonHangId = ? AND ";
	private static final String _FINDER_COLUMN_CH_TT_HD_HOATDONG_2 = "donHang.hoatDong = ?";

	public DonHangPersistenceImpl() {
		setModelClass(DonHang.class);
	}

	/**
	 * Caches the don hang in the entity cache if it is enabled.
	 *
	 * @param donHang the don hang
	 */
	@Override
	public void cacheResult(DonHang donHang) {
		EntityCacheUtil.putResult(DonHangModelImpl.ENTITY_CACHE_ENABLED,
			DonHangImpl.class, donHang.getPrimaryKey(), donHang);

		donHang.resetOriginalValues();
	}

	/**
	 * Caches the don hangs in the entity cache if it is enabled.
	 *
	 * @param donHangs the don hangs
	 */
	@Override
	public void cacheResult(List<DonHang> donHangs) {
		for (DonHang donHang : donHangs) {
			if (EntityCacheUtil.getResult(
						DonHangModelImpl.ENTITY_CACHE_ENABLED,
						DonHangImpl.class, donHang.getPrimaryKey()) == null) {
				cacheResult(donHang);
			}
			else {
				donHang.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all don hangs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DonHangImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DonHangImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the don hang.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DonHang donHang) {
		EntityCacheUtil.removeResult(DonHangModelImpl.ENTITY_CACHE_ENABLED,
			DonHangImpl.class, donHang.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DonHang> donHangs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DonHang donHang : donHangs) {
			EntityCacheUtil.removeResult(DonHangModelImpl.ENTITY_CACHE_ENABLED,
				DonHangImpl.class, donHang.getPrimaryKey());
		}
	}

	/**
	 * Creates a new don hang with the primary key. Does not add the don hang to the database.
	 *
	 * @param donHangId the primary key for the new don hang
	 * @return the new don hang
	 */
	@Override
	public DonHang create(long donHangId) {
		DonHang donHang = new DonHangImpl();

		donHang.setNew(true);
		donHang.setPrimaryKey(donHangId);

		return donHang;
	}

	/**
	 * Removes the don hang with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param donHangId the primary key of the don hang
	 * @return the don hang that was removed
	 * @throws com.minimart.portlet.banhang.NoSuchDonHangException if a don hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHang remove(long donHangId)
		throws NoSuchDonHangException, SystemException {
		return remove((Serializable)donHangId);
	}

	/**
	 * Removes the don hang with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the don hang
	 * @return the don hang that was removed
	 * @throws com.minimart.portlet.banhang.NoSuchDonHangException if a don hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHang remove(Serializable primaryKey)
		throws NoSuchDonHangException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DonHang donHang = (DonHang)session.get(DonHangImpl.class, primaryKey);

			if (donHang == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDonHangException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(donHang);
		}
		catch (NoSuchDonHangException nsee) {
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
	protected DonHang removeImpl(DonHang donHang) throws SystemException {
		donHang = toUnwrappedModel(donHang);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(donHang)) {
				donHang = (DonHang)session.get(DonHangImpl.class,
						donHang.getPrimaryKeyObj());
			}

			if (donHang != null) {
				session.delete(donHang);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (donHang != null) {
			clearCache(donHang);
		}

		return donHang;
	}

	@Override
	public DonHang updateImpl(
		com.minimart.portlet.banhang.model.DonHang donHang)
		throws SystemException {
		donHang = toUnwrappedModel(donHang);

		boolean isNew = donHang.isNew();

		DonHangModelImpl donHangModelImpl = (DonHangModelImpl)donHang;

		Session session = null;

		try {
			session = openSession();

			if (donHang.isNew()) {
				session.save(donHang);

				donHang.setNew(false);
			}
			else {
				session.merge(donHang);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DonHangModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((donHangModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CH_KH_HD.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						donHangModelImpl.getOriginalCuaHangId(),
						donHangModelImpl.getOriginalKhachHangId(),
						donHangModelImpl.getOriginalHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CH_KH_HD, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CH_KH_HD,
					args);

				args = new Object[] {
						donHangModelImpl.getCuaHangId(),
						donHangModelImpl.getKhachHangId(),
						donHangModelImpl.getHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CH_KH_HD, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CH_KH_HD,
					args);
			}

			if ((donHangModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CH_TT_HD.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						donHangModelImpl.getOriginalCuaHangId(),
						donHangModelImpl.getOriginalTrangThaiDonHangId(),
						donHangModelImpl.getOriginalHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CH_TT_HD, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CH_TT_HD,
					args);

				args = new Object[] {
						donHangModelImpl.getCuaHangId(),
						donHangModelImpl.getTrangThaiDonHangId(),
						donHangModelImpl.getHoatDong()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CH_TT_HD, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CH_TT_HD,
					args);
			}
		}

		EntityCacheUtil.putResult(DonHangModelImpl.ENTITY_CACHE_ENABLED,
			DonHangImpl.class, donHang.getPrimaryKey(), donHang);

		return donHang;
	}

	protected DonHang toUnwrappedModel(DonHang donHang) {
		if (donHang instanceof DonHangImpl) {
			return donHang;
		}

		DonHangImpl donHangImpl = new DonHangImpl();

		donHangImpl.setNew(donHang.isNew());
		donHangImpl.setPrimaryKey(donHang.getPrimaryKey());

		donHangImpl.setDonHangId(donHang.getDonHangId());
		donHangImpl.setCompanyId(donHang.getCompanyId());
		donHangImpl.setUserId(donHang.getUserId());
		donHangImpl.setUserName(donHang.getUserName());
		donHangImpl.setCreateDate(donHang.getCreateDate());
		donHangImpl.setModifiedDate(donHang.getModifiedDate());
		donHangImpl.setCuaHangId(donHang.getCuaHangId());
		donHangImpl.setKhachHangId(donHang.getKhachHangId());
		donHangImpl.setHoatDong(donHang.isHoatDong());
		donHangImpl.setTongCong(donHang.getTongCong());
		donHangImpl.setDaThanhToan(donHang.isDaThanhToan());
		donHangImpl.setPhiVanChuyen(donHang.getPhiVanChuyen());
		donHangImpl.setTrangThaiDonHangId(donHang.getTrangThaiDonHangId());
		donHangImpl.setNgayThanhToan(donHang.getNgayThanhToan());
		donHangImpl.setKhachDua(donHang.getKhachDua());
		donHangImpl.setTraLai(donHang.getTraLai());
		donHangImpl.setThueVAT(donHang.getThueVAT());
		donHangImpl.setDiemTichLuy(donHang.getDiemTichLuy());
		donHangImpl.setThanhToanTienMat(donHang.getThanhToanTienMat());
		donHangImpl.setThanhToanThe(donHang.getThanhToanThe());
		donHangImpl.setThanhToanChuyenKhoan(donHang.getThanhToanChuyenKhoan());
		donHangImpl.setPhieuGiamGiaId(donHang.getPhieuGiamGiaId());
		donHangImpl.setTruTichLuy(donHang.getTruTichLuy());
		donHangImpl.setInHoaDonLan(donHang.getInHoaDonLan());
		donHangImpl.setMaDonHang(donHang.getMaDonHang());

		return donHangImpl;
	}

	/**
	 * Returns the don hang with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the don hang
	 * @return the don hang
	 * @throws com.minimart.portlet.banhang.NoSuchDonHangException if a don hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHang findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDonHangException, SystemException {
		DonHang donHang = fetchByPrimaryKey(primaryKey);

		if (donHang == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDonHangException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return donHang;
	}

	/**
	 * Returns the don hang with the primary key or throws a {@link com.minimart.portlet.banhang.NoSuchDonHangException} if it could not be found.
	 *
	 * @param donHangId the primary key of the don hang
	 * @return the don hang
	 * @throws com.minimart.portlet.banhang.NoSuchDonHangException if a don hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHang findByPrimaryKey(long donHangId)
		throws NoSuchDonHangException, SystemException {
		return findByPrimaryKey((Serializable)donHangId);
	}

	/**
	 * Returns the don hang with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the don hang
	 * @return the don hang, or <code>null</code> if a don hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHang fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DonHang donHang = (DonHang)EntityCacheUtil.getResult(DonHangModelImpl.ENTITY_CACHE_ENABLED,
				DonHangImpl.class, primaryKey);

		if (donHang == _nullDonHang) {
			return null;
		}

		if (donHang == null) {
			Session session = null;

			try {
				session = openSession();

				donHang = (DonHang)session.get(DonHangImpl.class, primaryKey);

				if (donHang != null) {
					cacheResult(donHang);
				}
				else {
					EntityCacheUtil.putResult(DonHangModelImpl.ENTITY_CACHE_ENABLED,
						DonHangImpl.class, primaryKey, _nullDonHang);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DonHangModelImpl.ENTITY_CACHE_ENABLED,
					DonHangImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return donHang;
	}

	/**
	 * Returns the don hang with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param donHangId the primary key of the don hang
	 * @return the don hang, or <code>null</code> if a don hang with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DonHang fetchByPrimaryKey(long donHangId) throws SystemException {
		return fetchByPrimaryKey((Serializable)donHangId);
	}

	/**
	 * Returns all the don hangs.
	 *
	 * @return the don hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DonHang> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the don hangs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.DonHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of don hangs
	 * @param end the upper bound of the range of don hangs (not inclusive)
	 * @return the range of don hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DonHang> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the don hangs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.banhang.model.impl.DonHangModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of don hangs
	 * @param end the upper bound of the range of don hangs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of don hangs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DonHang> findAll(int start, int end,
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

		List<DonHang> list = (List<DonHang>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DONHANG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DONHANG;

				if (pagination) {
					sql = sql.concat(DonHangModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DonHang>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DonHang>(list);
				}
				else {
					list = (List<DonHang>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the don hangs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DonHang donHang : findAll()) {
			remove(donHang);
		}
	}

	/**
	 * Returns the number of don hangs.
	 *
	 * @return the number of don hangs
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

				Query q = session.createQuery(_SQL_COUNT_DONHANG);

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
	 * Initializes the don hang persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.minimart.portlet.banhang.model.DonHang")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DonHang>> listenersList = new ArrayList<ModelListener<DonHang>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DonHang>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DonHangImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DONHANG = "SELECT donHang FROM DonHang donHang";
	private static final String _SQL_SELECT_DONHANG_WHERE = "SELECT donHang FROM DonHang donHang WHERE ";
	private static final String _SQL_COUNT_DONHANG = "SELECT COUNT(donHang) FROM DonHang donHang";
	private static final String _SQL_COUNT_DONHANG_WHERE = "SELECT COUNT(donHang) FROM DonHang donHang WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "donHang.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DonHang exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DonHang exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DonHangPersistenceImpl.class);
	private static DonHang _nullDonHang = new DonHangImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DonHang> toCacheModel() {
				return _nullDonHangCacheModel;
			}
		};

	private static CacheModel<DonHang> _nullDonHangCacheModel = new CacheModel<DonHang>() {
			@Override
			public DonHang toEntityModel() {
				return _nullDonHang;
			}
		};
}