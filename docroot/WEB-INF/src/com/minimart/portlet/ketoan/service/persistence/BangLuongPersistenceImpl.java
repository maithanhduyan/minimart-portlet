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

package com.minimart.portlet.ketoan.service.persistence;

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

import com.minimart.portlet.ketoan.NoSuchBangLuongException;
import com.minimart.portlet.ketoan.model.BangLuong;
import com.minimart.portlet.ketoan.model.impl.BangLuongImpl;
import com.minimart.portlet.ketoan.model.impl.BangLuongModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the bang luong service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see BangLuongPersistence
 * @see BangLuongUtil
 * @generated
 */
public class BangLuongPersistenceImpl extends BasePersistenceImpl<BangLuong>
	implements BangLuongPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BangLuongUtil} to access the bang luong persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BangLuongImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BangLuongModelImpl.ENTITY_CACHE_ENABLED,
			BangLuongModelImpl.FINDER_CACHE_ENABLED, BangLuongImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BangLuongModelImpl.ENTITY_CACHE_ENABLED,
			BangLuongModelImpl.FINDER_CACHE_ENABLED, BangLuongImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BangLuongModelImpl.ENTITY_CACHE_ENABLED,
			BangLuongModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_TT = new FinderPath(BangLuongModelImpl.ENTITY_CACHE_ENABLED,
			BangLuongModelImpl.FINDER_CACHE_ENABLED, BangLuongImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTEN_TT",
			new String[] {
				String.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_TT =
		new FinderPath(BangLuongModelImpl.ENTITY_CACHE_ENABLED,
			BangLuongModelImpl.FINDER_CACHE_ENABLED, BangLuongImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTEN_TT",
			new String[] { String.class.getName(), Boolean.class.getName() },
			BangLuongModelImpl.TEN_COLUMN_BITMASK |
			BangLuongModelImpl.TRANGTHAI_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEN_TT = new FinderPath(BangLuongModelImpl.ENTITY_CACHE_ENABLED,
			BangLuongModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTEN_TT",
			new String[] { String.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the bang luongs where ten = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param trangThai the trang thai
	 * @return the matching bang luongs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BangLuong> findByTEN_TT(String ten, boolean trangThai)
		throws SystemException {
		return findByTEN_TT(ten, trangThai, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bang luongs where ten = &#63; and trangThai = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.ketoan.model.impl.BangLuongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param trangThai the trang thai
	 * @param start the lower bound of the range of bang luongs
	 * @param end the upper bound of the range of bang luongs (not inclusive)
	 * @return the range of matching bang luongs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BangLuong> findByTEN_TT(String ten, boolean trangThai,
		int start, int end) throws SystemException {
		return findByTEN_TT(ten, trangThai, start, end, null);
	}

	/**
	 * Returns an ordered range of all the bang luongs where ten = &#63; and trangThai = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.ketoan.model.impl.BangLuongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param trangThai the trang thai
	 * @param start the lower bound of the range of bang luongs
	 * @param end the upper bound of the range of bang luongs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching bang luongs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BangLuong> findByTEN_TT(String ten, boolean trangThai,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_TT;
			finderArgs = new Object[] { ten, trangThai };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_TT;
			finderArgs = new Object[] {
					ten, trangThai,
					
					start, end, orderByComparator
				};
		}

		List<BangLuong> list = (List<BangLuong>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (BangLuong bangLuong : list) {
				if (!Validator.equals(ten, bangLuong.getTen()) ||
						(trangThai != bangLuong.getTrangThai())) {
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

			query.append(_SQL_SELECT_BANGLUONG_WHERE);

			boolean bindTen = false;

			if (ten == null) {
				query.append(_FINDER_COLUMN_TEN_TT_TEN_1);
			}
			else if (ten.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_TT_TEN_3);
			}
			else {
				bindTen = true;

				query.append(_FINDER_COLUMN_TEN_TT_TEN_2);
			}

			query.append(_FINDER_COLUMN_TEN_TT_TRANGTHAI_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(BangLuongModelImpl.ORDER_BY_JPQL);
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

				qPos.add(trangThai);

				if (!pagination) {
					list = (List<BangLuong>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<BangLuong>(list);
				}
				else {
					list = (List<BangLuong>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first bang luong in the ordered set where ten = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bang luong
	 * @throws com.minimart.portlet.ketoan.NoSuchBangLuongException if a matching bang luong could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BangLuong findByTEN_TT_First(String ten, boolean trangThai,
		OrderByComparator orderByComparator)
		throws NoSuchBangLuongException, SystemException {
		BangLuong bangLuong = fetchByTEN_TT_First(ten, trangThai,
				orderByComparator);

		if (bangLuong != null) {
			return bangLuong;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(", trangThai=");
		msg.append(trangThai);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBangLuongException(msg.toString());
	}

	/**
	 * Returns the first bang luong in the ordered set where ten = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching bang luong, or <code>null</code> if a matching bang luong could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BangLuong fetchByTEN_TT_First(String ten, boolean trangThai,
		OrderByComparator orderByComparator) throws SystemException {
		List<BangLuong> list = findByTEN_TT(ten, trangThai, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last bang luong in the ordered set where ten = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bang luong
	 * @throws com.minimart.portlet.ketoan.NoSuchBangLuongException if a matching bang luong could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BangLuong findByTEN_TT_Last(String ten, boolean trangThai,
		OrderByComparator orderByComparator)
		throws NoSuchBangLuongException, SystemException {
		BangLuong bangLuong = fetchByTEN_TT_Last(ten, trangThai,
				orderByComparator);

		if (bangLuong != null) {
			return bangLuong;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(", trangThai=");
		msg.append(trangThai);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBangLuongException(msg.toString());
	}

	/**
	 * Returns the last bang luong in the ordered set where ten = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching bang luong, or <code>null</code> if a matching bang luong could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BangLuong fetchByTEN_TT_Last(String ten, boolean trangThai,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTEN_TT(ten, trangThai);

		if (count == 0) {
			return null;
		}

		List<BangLuong> list = findByTEN_TT(ten, trangThai, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the bang luongs before and after the current bang luong in the ordered set where ten = &#63; and trangThai = &#63;.
	 *
	 * @param banLuongId the primary key of the current bang luong
	 * @param ten the ten
	 * @param trangThai the trang thai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next bang luong
	 * @throws com.minimart.portlet.ketoan.NoSuchBangLuongException if a bang luong with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BangLuong[] findByTEN_TT_PrevAndNext(long banLuongId, String ten,
		boolean trangThai, OrderByComparator orderByComparator)
		throws NoSuchBangLuongException, SystemException {
		BangLuong bangLuong = findByPrimaryKey(banLuongId);

		Session session = null;

		try {
			session = openSession();

			BangLuong[] array = new BangLuongImpl[3];

			array[0] = getByTEN_TT_PrevAndNext(session, bangLuong, ten,
					trangThai, orderByComparator, true);

			array[1] = bangLuong;

			array[2] = getByTEN_TT_PrevAndNext(session, bangLuong, ten,
					trangThai, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected BangLuong getByTEN_TT_PrevAndNext(Session session,
		BangLuong bangLuong, String ten, boolean trangThai,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BANGLUONG_WHERE);

		boolean bindTen = false;

		if (ten == null) {
			query.append(_FINDER_COLUMN_TEN_TT_TEN_1);
		}
		else if (ten.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TEN_TT_TEN_3);
		}
		else {
			bindTen = true;

			query.append(_FINDER_COLUMN_TEN_TT_TEN_2);
		}

		query.append(_FINDER_COLUMN_TEN_TT_TRANGTHAI_2);

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
			query.append(BangLuongModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindTen) {
			qPos.add(ten);
		}

		qPos.add(trangThai);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(bangLuong);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<BangLuong> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the bang luongs where ten = &#63; and trangThai = &#63; from the database.
	 *
	 * @param ten the ten
	 * @param trangThai the trang thai
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTEN_TT(String ten, boolean trangThai)
		throws SystemException {
		for (BangLuong bangLuong : findByTEN_TT(ten, trangThai,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(bangLuong);
		}
	}

	/**
	 * Returns the number of bang luongs where ten = &#63; and trangThai = &#63;.
	 *
	 * @param ten the ten
	 * @param trangThai the trang thai
	 * @return the number of matching bang luongs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTEN_TT(String ten, boolean trangThai)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TEN_TT;

		Object[] finderArgs = new Object[] { ten, trangThai };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_BANGLUONG_WHERE);

			boolean bindTen = false;

			if (ten == null) {
				query.append(_FINDER_COLUMN_TEN_TT_TEN_1);
			}
			else if (ten.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_TT_TEN_3);
			}
			else {
				bindTen = true;

				query.append(_FINDER_COLUMN_TEN_TT_TEN_2);
			}

			query.append(_FINDER_COLUMN_TEN_TT_TRANGTHAI_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTen) {
					qPos.add(ten);
				}

				qPos.add(trangThai);

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

	private static final String _FINDER_COLUMN_TEN_TT_TEN_1 = "bangLuong.ten IS NULL AND ";
	private static final String _FINDER_COLUMN_TEN_TT_TEN_2 = "bangLuong.ten = ? AND ";
	private static final String _FINDER_COLUMN_TEN_TT_TEN_3 = "(bangLuong.ten IS NULL OR bangLuong.ten = '') AND ";
	private static final String _FINDER_COLUMN_TEN_TT_TRANGTHAI_2 = "bangLuong.trangThai = ?";

	public BangLuongPersistenceImpl() {
		setModelClass(BangLuong.class);
	}

	/**
	 * Caches the bang luong in the entity cache if it is enabled.
	 *
	 * @param bangLuong the bang luong
	 */
	@Override
	public void cacheResult(BangLuong bangLuong) {
		EntityCacheUtil.putResult(BangLuongModelImpl.ENTITY_CACHE_ENABLED,
			BangLuongImpl.class, bangLuong.getPrimaryKey(), bangLuong);

		bangLuong.resetOriginalValues();
	}

	/**
	 * Caches the bang luongs in the entity cache if it is enabled.
	 *
	 * @param bangLuongs the bang luongs
	 */
	@Override
	public void cacheResult(List<BangLuong> bangLuongs) {
		for (BangLuong bangLuong : bangLuongs) {
			if (EntityCacheUtil.getResult(
						BangLuongModelImpl.ENTITY_CACHE_ENABLED,
						BangLuongImpl.class, bangLuong.getPrimaryKey()) == null) {
				cacheResult(bangLuong);
			}
			else {
				bangLuong.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all bang luongs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(BangLuongImpl.class.getName());
		}

		EntityCacheUtil.clearCache(BangLuongImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the bang luong.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(BangLuong bangLuong) {
		EntityCacheUtil.removeResult(BangLuongModelImpl.ENTITY_CACHE_ENABLED,
			BangLuongImpl.class, bangLuong.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<BangLuong> bangLuongs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (BangLuong bangLuong : bangLuongs) {
			EntityCacheUtil.removeResult(BangLuongModelImpl.ENTITY_CACHE_ENABLED,
				BangLuongImpl.class, bangLuong.getPrimaryKey());
		}
	}

	/**
	 * Creates a new bang luong with the primary key. Does not add the bang luong to the database.
	 *
	 * @param banLuongId the primary key for the new bang luong
	 * @return the new bang luong
	 */
	@Override
	public BangLuong create(long banLuongId) {
		BangLuong bangLuong = new BangLuongImpl();

		bangLuong.setNew(true);
		bangLuong.setPrimaryKey(banLuongId);

		return bangLuong;
	}

	/**
	 * Removes the bang luong with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param banLuongId the primary key of the bang luong
	 * @return the bang luong that was removed
	 * @throws com.minimart.portlet.ketoan.NoSuchBangLuongException if a bang luong with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BangLuong remove(long banLuongId)
		throws NoSuchBangLuongException, SystemException {
		return remove((Serializable)banLuongId);
	}

	/**
	 * Removes the bang luong with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the bang luong
	 * @return the bang luong that was removed
	 * @throws com.minimart.portlet.ketoan.NoSuchBangLuongException if a bang luong with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BangLuong remove(Serializable primaryKey)
		throws NoSuchBangLuongException, SystemException {
		Session session = null;

		try {
			session = openSession();

			BangLuong bangLuong = (BangLuong)session.get(BangLuongImpl.class,
					primaryKey);

			if (bangLuong == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBangLuongException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(bangLuong);
		}
		catch (NoSuchBangLuongException nsee) {
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
	protected BangLuong removeImpl(BangLuong bangLuong)
		throws SystemException {
		bangLuong = toUnwrappedModel(bangLuong);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(bangLuong)) {
				bangLuong = (BangLuong)session.get(BangLuongImpl.class,
						bangLuong.getPrimaryKeyObj());
			}

			if (bangLuong != null) {
				session.delete(bangLuong);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (bangLuong != null) {
			clearCache(bangLuong);
		}

		return bangLuong;
	}

	@Override
	public BangLuong updateImpl(
		com.minimart.portlet.ketoan.model.BangLuong bangLuong)
		throws SystemException {
		bangLuong = toUnwrappedModel(bangLuong);

		boolean isNew = bangLuong.isNew();

		BangLuongModelImpl bangLuongModelImpl = (BangLuongModelImpl)bangLuong;

		Session session = null;

		try {
			session = openSession();

			if (bangLuong.isNew()) {
				session.save(bangLuong);

				bangLuong.setNew(false);
			}
			else {
				session.merge(bangLuong);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !BangLuongModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((bangLuongModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_TT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						bangLuongModelImpl.getOriginalTen(),
						bangLuongModelImpl.getOriginalTrangThai()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_TT, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_TT,
					args);

				args = new Object[] {
						bangLuongModelImpl.getTen(),
						bangLuongModelImpl.getTrangThai()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_TT, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_TT,
					args);
			}
		}

		EntityCacheUtil.putResult(BangLuongModelImpl.ENTITY_CACHE_ENABLED,
			BangLuongImpl.class, bangLuong.getPrimaryKey(), bangLuong);

		return bangLuong;
	}

	protected BangLuong toUnwrappedModel(BangLuong bangLuong) {
		if (bangLuong instanceof BangLuongImpl) {
			return bangLuong;
		}

		BangLuongImpl bangLuongImpl = new BangLuongImpl();

		bangLuongImpl.setNew(bangLuong.isNew());
		bangLuongImpl.setPrimaryKey(bangLuong.getPrimaryKey());

		bangLuongImpl.setBanLuongId(bangLuong.getBanLuongId());
		bangLuongImpl.setCompanyId(bangLuong.getCompanyId());
		bangLuongImpl.setUserId(bangLuong.getUserId());
		bangLuongImpl.setUserName(bangLuong.getUserName());
		bangLuongImpl.setCreateDate(bangLuong.getCreateDate());
		bangLuongImpl.setModifiedDate(bangLuong.getModifiedDate());
		bangLuongImpl.setTen(bangLuong.getTen());
		bangLuongImpl.setTrangThai(bangLuong.isTrangThai());
		bangLuongImpl.setThang(bangLuong.getThang());
		bangLuongImpl.setNam(bangLuong.getNam());
		bangLuongImpl.setNgay(bangLuong.getNgay());
		bangLuongImpl.setChiTiet(bangLuong.getChiTiet());
		bangLuongImpl.setGhiChu(bangLuong.getGhiChu());

		return bangLuongImpl;
	}

	/**
	 * Returns the bang luong with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the bang luong
	 * @return the bang luong
	 * @throws com.minimart.portlet.ketoan.NoSuchBangLuongException if a bang luong with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BangLuong findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBangLuongException, SystemException {
		BangLuong bangLuong = fetchByPrimaryKey(primaryKey);

		if (bangLuong == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBangLuongException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return bangLuong;
	}

	/**
	 * Returns the bang luong with the primary key or throws a {@link com.minimart.portlet.ketoan.NoSuchBangLuongException} if it could not be found.
	 *
	 * @param banLuongId the primary key of the bang luong
	 * @return the bang luong
	 * @throws com.minimart.portlet.ketoan.NoSuchBangLuongException if a bang luong with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BangLuong findByPrimaryKey(long banLuongId)
		throws NoSuchBangLuongException, SystemException {
		return findByPrimaryKey((Serializable)banLuongId);
	}

	/**
	 * Returns the bang luong with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the bang luong
	 * @return the bang luong, or <code>null</code> if a bang luong with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BangLuong fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		BangLuong bangLuong = (BangLuong)EntityCacheUtil.getResult(BangLuongModelImpl.ENTITY_CACHE_ENABLED,
				BangLuongImpl.class, primaryKey);

		if (bangLuong == _nullBangLuong) {
			return null;
		}

		if (bangLuong == null) {
			Session session = null;

			try {
				session = openSession();

				bangLuong = (BangLuong)session.get(BangLuongImpl.class,
						primaryKey);

				if (bangLuong != null) {
					cacheResult(bangLuong);
				}
				else {
					EntityCacheUtil.putResult(BangLuongModelImpl.ENTITY_CACHE_ENABLED,
						BangLuongImpl.class, primaryKey, _nullBangLuong);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(BangLuongModelImpl.ENTITY_CACHE_ENABLED,
					BangLuongImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return bangLuong;
	}

	/**
	 * Returns the bang luong with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param banLuongId the primary key of the bang luong
	 * @return the bang luong, or <code>null</code> if a bang luong with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public BangLuong fetchByPrimaryKey(long banLuongId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)banLuongId);
	}

	/**
	 * Returns all the bang luongs.
	 *
	 * @return the bang luongs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BangLuong> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the bang luongs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.ketoan.model.impl.BangLuongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bang luongs
	 * @param end the upper bound of the range of bang luongs (not inclusive)
	 * @return the range of bang luongs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BangLuong> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the bang luongs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.ketoan.model.impl.BangLuongModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of bang luongs
	 * @param end the upper bound of the range of bang luongs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of bang luongs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<BangLuong> findAll(int start, int end,
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

		List<BangLuong> list = (List<BangLuong>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_BANGLUONG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BANGLUONG;

				if (pagination) {
					sql = sql.concat(BangLuongModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<BangLuong>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<BangLuong>(list);
				}
				else {
					list = (List<BangLuong>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the bang luongs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (BangLuong bangLuong : findAll()) {
			remove(bangLuong);
		}
	}

	/**
	 * Returns the number of bang luongs.
	 *
	 * @return the number of bang luongs
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

				Query q = session.createQuery(_SQL_COUNT_BANGLUONG);

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
	 * Initializes the bang luong persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.minimart.portlet.ketoan.model.BangLuong")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<BangLuong>> listenersList = new ArrayList<ModelListener<BangLuong>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<BangLuong>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(BangLuongImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_BANGLUONG = "SELECT bangLuong FROM BangLuong bangLuong";
	private static final String _SQL_SELECT_BANGLUONG_WHERE = "SELECT bangLuong FROM BangLuong bangLuong WHERE ";
	private static final String _SQL_COUNT_BANGLUONG = "SELECT COUNT(bangLuong) FROM BangLuong bangLuong";
	private static final String _SQL_COUNT_BANGLUONG_WHERE = "SELECT COUNT(bangLuong) FROM BangLuong bangLuong WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "bangLuong.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No BangLuong exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No BangLuong exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(BangLuongPersistenceImpl.class);
	private static BangLuong _nullBangLuong = new BangLuongImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<BangLuong> toCacheModel() {
				return _nullBangLuongCacheModel;
			}
		};

	private static CacheModel<BangLuong> _nullBangLuongCacheModel = new CacheModel<BangLuong>() {
			@Override
			public BangLuong toEntityModel() {
				return _nullBangLuong;
			}
		};
}