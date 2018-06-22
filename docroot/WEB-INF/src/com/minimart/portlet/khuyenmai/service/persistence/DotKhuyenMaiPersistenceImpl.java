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

package com.minimart.portlet.khuyenmai.service.persistence;

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
import com.liferay.portal.kernel.util.CalendarUtil;
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

import com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException;
import com.minimart.portlet.khuyenmai.model.DotKhuyenMai;
import com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiImpl;
import com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * The persistence implementation for the dot khuyen mai service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see DotKhuyenMaiPersistence
 * @see DotKhuyenMaiUtil
 * @generated
 */
public class DotKhuyenMaiPersistenceImpl extends BasePersistenceImpl<DotKhuyenMai>
	implements DotKhuyenMaiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DotKhuyenMaiUtil} to access the dot khuyen mai persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DotKhuyenMaiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DotKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
			DotKhuyenMaiModelImpl.FINDER_CACHE_ENABLED, DotKhuyenMaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DotKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
			DotKhuyenMaiModelImpl.FINDER_CACHE_ENABLED, DotKhuyenMaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DotKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
			DotKhuyenMaiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_TH = new FinderPath(DotKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
			DotKhuyenMaiModelImpl.FINDER_CACHE_ENABLED, DotKhuyenMaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTEN_TH",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_TH =
		new FinderPath(DotKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
			DotKhuyenMaiModelImpl.FINDER_CACHE_ENABLED, DotKhuyenMaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTEN_TH",
			new String[] { String.class.getName() },
			DotKhuyenMaiModelImpl.TEN_COLUMN_BITMASK |
			DotKhuyenMaiModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TEN_TH = new FinderPath(DotKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
			DotKhuyenMaiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTEN_TH",
			new String[] { String.class.getName() });

	/**
	 * Returns all the dot khuyen mais where ten = &#63;.
	 *
	 * @param ten the ten
	 * @return the matching dot khuyen mais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DotKhuyenMai> findByTEN_TH(String ten)
		throws SystemException {
		return findByTEN_TH(ten, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dot khuyen mais where ten = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param start the lower bound of the range of dot khuyen mais
	 * @param end the upper bound of the range of dot khuyen mais (not inclusive)
	 * @return the range of matching dot khuyen mais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DotKhuyenMai> findByTEN_TH(String ten, int start, int end)
		throws SystemException {
		return findByTEN_TH(ten, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dot khuyen mais where ten = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ten the ten
	 * @param start the lower bound of the range of dot khuyen mais
	 * @param end the upper bound of the range of dot khuyen mais (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dot khuyen mais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DotKhuyenMai> findByTEN_TH(String ten, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_TH;
			finderArgs = new Object[] { ten };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TEN_TH;
			finderArgs = new Object[] { ten, start, end, orderByComparator };
		}

		List<DotKhuyenMai> list = (List<DotKhuyenMai>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DotKhuyenMai dotKhuyenMai : list) {
				if (!Validator.equals(ten, dotKhuyenMai.getTen())) {
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

			query.append(_SQL_SELECT_DOTKHUYENMAI_WHERE);

			boolean bindTen = false;

			if (ten == null) {
				query.append(_FINDER_COLUMN_TEN_TH_TEN_1);
			}
			else if (ten.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_TH_TEN_3);
			}
			else {
				bindTen = true;

				query.append(_FINDER_COLUMN_TEN_TH_TEN_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DotKhuyenMaiModelImpl.ORDER_BY_JPQL);
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
					list = (List<DotKhuyenMai>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DotKhuyenMai>(list);
				}
				else {
					list = (List<DotKhuyenMai>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dot khuyen mai in the ordered set where ten = &#63;.
	 *
	 * @param ten the ten
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dot khuyen mai
	 * @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException if a matching dot khuyen mai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMai findByTEN_TH_First(String ten,
		OrderByComparator orderByComparator)
		throws NoSuchDotKhuyenMaiException, SystemException {
		DotKhuyenMai dotKhuyenMai = fetchByTEN_TH_First(ten, orderByComparator);

		if (dotKhuyenMai != null) {
			return dotKhuyenMai;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDotKhuyenMaiException(msg.toString());
	}

	/**
	 * Returns the first dot khuyen mai in the ordered set where ten = &#63;.
	 *
	 * @param ten the ten
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dot khuyen mai, or <code>null</code> if a matching dot khuyen mai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMai fetchByTEN_TH_First(String ten,
		OrderByComparator orderByComparator) throws SystemException {
		List<DotKhuyenMai> list = findByTEN_TH(ten, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dot khuyen mai in the ordered set where ten = &#63;.
	 *
	 * @param ten the ten
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dot khuyen mai
	 * @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException if a matching dot khuyen mai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMai findByTEN_TH_Last(String ten,
		OrderByComparator orderByComparator)
		throws NoSuchDotKhuyenMaiException, SystemException {
		DotKhuyenMai dotKhuyenMai = fetchByTEN_TH_Last(ten, orderByComparator);

		if (dotKhuyenMai != null) {
			return dotKhuyenMai;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ten=");
		msg.append(ten);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDotKhuyenMaiException(msg.toString());
	}

	/**
	 * Returns the last dot khuyen mai in the ordered set where ten = &#63;.
	 *
	 * @param ten the ten
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dot khuyen mai, or <code>null</code> if a matching dot khuyen mai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMai fetchByTEN_TH_Last(String ten,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTEN_TH(ten);

		if (count == 0) {
			return null;
		}

		List<DotKhuyenMai> list = findByTEN_TH(ten, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dot khuyen mais before and after the current dot khuyen mai in the ordered set where ten = &#63;.
	 *
	 * @param dotKhuyenMaiId the primary key of the current dot khuyen mai
	 * @param ten the ten
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dot khuyen mai
	 * @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException if a dot khuyen mai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMai[] findByTEN_TH_PrevAndNext(long dotKhuyenMaiId,
		String ten, OrderByComparator orderByComparator)
		throws NoSuchDotKhuyenMaiException, SystemException {
		DotKhuyenMai dotKhuyenMai = findByPrimaryKey(dotKhuyenMaiId);

		Session session = null;

		try {
			session = openSession();

			DotKhuyenMai[] array = new DotKhuyenMaiImpl[3];

			array[0] = getByTEN_TH_PrevAndNext(session, dotKhuyenMai, ten,
					orderByComparator, true);

			array[1] = dotKhuyenMai;

			array[2] = getByTEN_TH_PrevAndNext(session, dotKhuyenMai, ten,
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

	protected DotKhuyenMai getByTEN_TH_PrevAndNext(Session session,
		DotKhuyenMai dotKhuyenMai, String ten,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOTKHUYENMAI_WHERE);

		boolean bindTen = false;

		if (ten == null) {
			query.append(_FINDER_COLUMN_TEN_TH_TEN_1);
		}
		else if (ten.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TEN_TH_TEN_3);
		}
		else {
			bindTen = true;

			query.append(_FINDER_COLUMN_TEN_TH_TEN_2);
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
			query.append(DotKhuyenMaiModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(dotKhuyenMai);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DotKhuyenMai> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dot khuyen mais where ten = &#63; from the database.
	 *
	 * @param ten the ten
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTEN_TH(String ten) throws SystemException {
		for (DotKhuyenMai dotKhuyenMai : findByTEN_TH(ten, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(dotKhuyenMai);
		}
	}

	/**
	 * Returns the number of dot khuyen mais where ten = &#63;.
	 *
	 * @param ten the ten
	 * @return the number of matching dot khuyen mais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTEN_TH(String ten) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TEN_TH;

		Object[] finderArgs = new Object[] { ten };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOTKHUYENMAI_WHERE);

			boolean bindTen = false;

			if (ten == null) {
				query.append(_FINDER_COLUMN_TEN_TH_TEN_1);
			}
			else if (ten.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TEN_TH_TEN_3);
			}
			else {
				bindTen = true;

				query.append(_FINDER_COLUMN_TEN_TH_TEN_2);
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

	private static final String _FINDER_COLUMN_TEN_TH_TEN_1 = "dotKhuyenMai.ten IS NULL";
	private static final String _FINDER_COLUMN_TEN_TH_TEN_2 = "dotKhuyenMai.ten = ?";
	private static final String _FINDER_COLUMN_TEN_TH_TEN_3 = "(dotKhuyenMai.ten IS NULL OR dotKhuyenMai.ten = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NGAY_HH = new FinderPath(DotKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
			DotKhuyenMaiModelImpl.FINDER_CACHE_ENABLED, DotKhuyenMaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNGAY_HH",
			new String[] {
				Date.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGAY_HH =
		new FinderPath(DotKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
			DotKhuyenMaiModelImpl.FINDER_CACHE_ENABLED, DotKhuyenMaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNGAY_HH",
			new String[] { Date.class.getName() },
			DotKhuyenMaiModelImpl.NGAYHETHAN_COLUMN_BITMASK |
			DotKhuyenMaiModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NGAY_HH = new FinderPath(DotKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
			DotKhuyenMaiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNGAY_HH",
			new String[] { Date.class.getName() });

	/**
	 * Returns all the dot khuyen mais where ngayHetHan = &#63;.
	 *
	 * @param ngayHetHan the ngay het han
	 * @return the matching dot khuyen mais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DotKhuyenMai> findByNGAY_HH(Date ngayHetHan)
		throws SystemException {
		return findByNGAY_HH(ngayHetHan, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the dot khuyen mais where ngayHetHan = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ngayHetHan the ngay het han
	 * @param start the lower bound of the range of dot khuyen mais
	 * @param end the upper bound of the range of dot khuyen mais (not inclusive)
	 * @return the range of matching dot khuyen mais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DotKhuyenMai> findByNGAY_HH(Date ngayHetHan, int start, int end)
		throws SystemException {
		return findByNGAY_HH(ngayHetHan, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dot khuyen mais where ngayHetHan = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ngayHetHan the ngay het han
	 * @param start the lower bound of the range of dot khuyen mais
	 * @param end the upper bound of the range of dot khuyen mais (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dot khuyen mais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DotKhuyenMai> findByNGAY_HH(Date ngayHetHan, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGAY_HH;
			finderArgs = new Object[] { ngayHetHan };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NGAY_HH;
			finderArgs = new Object[] { ngayHetHan, start, end, orderByComparator };
		}

		List<DotKhuyenMai> list = (List<DotKhuyenMai>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DotKhuyenMai dotKhuyenMai : list) {
				if (!Validator.equals(ngayHetHan, dotKhuyenMai.getNgayHetHan())) {
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

			query.append(_SQL_SELECT_DOTKHUYENMAI_WHERE);

			boolean bindNgayHetHan = false;

			if (ngayHetHan == null) {
				query.append(_FINDER_COLUMN_NGAY_HH_NGAYHETHAN_1);
			}
			else {
				bindNgayHetHan = true;

				query.append(_FINDER_COLUMN_NGAY_HH_NGAYHETHAN_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DotKhuyenMaiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindNgayHetHan) {
					qPos.add(CalendarUtil.getTimestamp(ngayHetHan));
				}

				if (!pagination) {
					list = (List<DotKhuyenMai>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DotKhuyenMai>(list);
				}
				else {
					list = (List<DotKhuyenMai>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dot khuyen mai in the ordered set where ngayHetHan = &#63;.
	 *
	 * @param ngayHetHan the ngay het han
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dot khuyen mai
	 * @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException if a matching dot khuyen mai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMai findByNGAY_HH_First(Date ngayHetHan,
		OrderByComparator orderByComparator)
		throws NoSuchDotKhuyenMaiException, SystemException {
		DotKhuyenMai dotKhuyenMai = fetchByNGAY_HH_First(ngayHetHan,
				orderByComparator);

		if (dotKhuyenMai != null) {
			return dotKhuyenMai;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ngayHetHan=");
		msg.append(ngayHetHan);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDotKhuyenMaiException(msg.toString());
	}

	/**
	 * Returns the first dot khuyen mai in the ordered set where ngayHetHan = &#63;.
	 *
	 * @param ngayHetHan the ngay het han
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dot khuyen mai, or <code>null</code> if a matching dot khuyen mai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMai fetchByNGAY_HH_First(Date ngayHetHan,
		OrderByComparator orderByComparator) throws SystemException {
		List<DotKhuyenMai> list = findByNGAY_HH(ngayHetHan, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dot khuyen mai in the ordered set where ngayHetHan = &#63;.
	 *
	 * @param ngayHetHan the ngay het han
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dot khuyen mai
	 * @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException if a matching dot khuyen mai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMai findByNGAY_HH_Last(Date ngayHetHan,
		OrderByComparator orderByComparator)
		throws NoSuchDotKhuyenMaiException, SystemException {
		DotKhuyenMai dotKhuyenMai = fetchByNGAY_HH_Last(ngayHetHan,
				orderByComparator);

		if (dotKhuyenMai != null) {
			return dotKhuyenMai;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ngayHetHan=");
		msg.append(ngayHetHan);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDotKhuyenMaiException(msg.toString());
	}

	/**
	 * Returns the last dot khuyen mai in the ordered set where ngayHetHan = &#63;.
	 *
	 * @param ngayHetHan the ngay het han
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dot khuyen mai, or <code>null</code> if a matching dot khuyen mai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMai fetchByNGAY_HH_Last(Date ngayHetHan,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByNGAY_HH(ngayHetHan);

		if (count == 0) {
			return null;
		}

		List<DotKhuyenMai> list = findByNGAY_HH(ngayHetHan, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dot khuyen mais before and after the current dot khuyen mai in the ordered set where ngayHetHan = &#63;.
	 *
	 * @param dotKhuyenMaiId the primary key of the current dot khuyen mai
	 * @param ngayHetHan the ngay het han
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dot khuyen mai
	 * @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException if a dot khuyen mai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMai[] findByNGAY_HH_PrevAndNext(long dotKhuyenMaiId,
		Date ngayHetHan, OrderByComparator orderByComparator)
		throws NoSuchDotKhuyenMaiException, SystemException {
		DotKhuyenMai dotKhuyenMai = findByPrimaryKey(dotKhuyenMaiId);

		Session session = null;

		try {
			session = openSession();

			DotKhuyenMai[] array = new DotKhuyenMaiImpl[3];

			array[0] = getByNGAY_HH_PrevAndNext(session, dotKhuyenMai,
					ngayHetHan, orderByComparator, true);

			array[1] = dotKhuyenMai;

			array[2] = getByNGAY_HH_PrevAndNext(session, dotKhuyenMai,
					ngayHetHan, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DotKhuyenMai getByNGAY_HH_PrevAndNext(Session session,
		DotKhuyenMai dotKhuyenMai, Date ngayHetHan,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOTKHUYENMAI_WHERE);

		boolean bindNgayHetHan = false;

		if (ngayHetHan == null) {
			query.append(_FINDER_COLUMN_NGAY_HH_NGAYHETHAN_1);
		}
		else {
			bindNgayHetHan = true;

			query.append(_FINDER_COLUMN_NGAY_HH_NGAYHETHAN_2);
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
			query.append(DotKhuyenMaiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindNgayHetHan) {
			qPos.add(CalendarUtil.getTimestamp(ngayHetHan));
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dotKhuyenMai);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DotKhuyenMai> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dot khuyen mais where ngayHetHan = &#63; from the database.
	 *
	 * @param ngayHetHan the ngay het han
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNGAY_HH(Date ngayHetHan) throws SystemException {
		for (DotKhuyenMai dotKhuyenMai : findByNGAY_HH(ngayHetHan,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dotKhuyenMai);
		}
	}

	/**
	 * Returns the number of dot khuyen mais where ngayHetHan = &#63;.
	 *
	 * @param ngayHetHan the ngay het han
	 * @return the number of matching dot khuyen mais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByNGAY_HH(Date ngayHetHan) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NGAY_HH;

		Object[] finderArgs = new Object[] { ngayHetHan };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOTKHUYENMAI_WHERE);

			boolean bindNgayHetHan = false;

			if (ngayHetHan == null) {
				query.append(_FINDER_COLUMN_NGAY_HH_NGAYHETHAN_1);
			}
			else {
				bindNgayHetHan = true;

				query.append(_FINDER_COLUMN_NGAY_HH_NGAYHETHAN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindNgayHetHan) {
					qPos.add(CalendarUtil.getTimestamp(ngayHetHan));
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

	private static final String _FINDER_COLUMN_NGAY_HH_NGAYHETHAN_1 = "dotKhuyenMai.ngayHetHan IS NULL";
	private static final String _FINDER_COLUMN_NGAY_HH_NGAYHETHAN_2 = "dotKhuyenMai.ngayHetHan = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NGAY_BD = new FinderPath(DotKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
			DotKhuyenMaiModelImpl.FINDER_CACHE_ENABLED, DotKhuyenMaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNGAY_BD",
			new String[] {
				Date.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGAY_BD =
		new FinderPath(DotKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
			DotKhuyenMaiModelImpl.FINDER_CACHE_ENABLED, DotKhuyenMaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNGAY_BD",
			new String[] { Date.class.getName() },
			DotKhuyenMaiModelImpl.NGAYBATDAU_COLUMN_BITMASK |
			DotKhuyenMaiModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NGAY_BD = new FinderPath(DotKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
			DotKhuyenMaiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNGAY_BD",
			new String[] { Date.class.getName() });

	/**
	 * Returns all the dot khuyen mais where ngayBatDau = &#63;.
	 *
	 * @param ngayBatDau the ngay bat dau
	 * @return the matching dot khuyen mais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DotKhuyenMai> findByNGAY_BD(Date ngayBatDau)
		throws SystemException {
		return findByNGAY_BD(ngayBatDau, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the dot khuyen mais where ngayBatDau = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ngayBatDau the ngay bat dau
	 * @param start the lower bound of the range of dot khuyen mais
	 * @param end the upper bound of the range of dot khuyen mais (not inclusive)
	 * @return the range of matching dot khuyen mais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DotKhuyenMai> findByNGAY_BD(Date ngayBatDau, int start, int end)
		throws SystemException {
		return findByNGAY_BD(ngayBatDau, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dot khuyen mais where ngayBatDau = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ngayBatDau the ngay bat dau
	 * @param start the lower bound of the range of dot khuyen mais
	 * @param end the upper bound of the range of dot khuyen mais (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dot khuyen mais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DotKhuyenMai> findByNGAY_BD(Date ngayBatDau, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGAY_BD;
			finderArgs = new Object[] { ngayBatDau };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NGAY_BD;
			finderArgs = new Object[] { ngayBatDau, start, end, orderByComparator };
		}

		List<DotKhuyenMai> list = (List<DotKhuyenMai>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DotKhuyenMai dotKhuyenMai : list) {
				if (!Validator.equals(ngayBatDau, dotKhuyenMai.getNgayBatDau())) {
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

			query.append(_SQL_SELECT_DOTKHUYENMAI_WHERE);

			boolean bindNgayBatDau = false;

			if (ngayBatDau == null) {
				query.append(_FINDER_COLUMN_NGAY_BD_NGAYBATDAU_1);
			}
			else {
				bindNgayBatDau = true;

				query.append(_FINDER_COLUMN_NGAY_BD_NGAYBATDAU_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DotKhuyenMaiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindNgayBatDau) {
					qPos.add(CalendarUtil.getTimestamp(ngayBatDau));
				}

				if (!pagination) {
					list = (List<DotKhuyenMai>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DotKhuyenMai>(list);
				}
				else {
					list = (List<DotKhuyenMai>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dot khuyen mai in the ordered set where ngayBatDau = &#63;.
	 *
	 * @param ngayBatDau the ngay bat dau
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dot khuyen mai
	 * @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException if a matching dot khuyen mai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMai findByNGAY_BD_First(Date ngayBatDau,
		OrderByComparator orderByComparator)
		throws NoSuchDotKhuyenMaiException, SystemException {
		DotKhuyenMai dotKhuyenMai = fetchByNGAY_BD_First(ngayBatDau,
				orderByComparator);

		if (dotKhuyenMai != null) {
			return dotKhuyenMai;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ngayBatDau=");
		msg.append(ngayBatDau);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDotKhuyenMaiException(msg.toString());
	}

	/**
	 * Returns the first dot khuyen mai in the ordered set where ngayBatDau = &#63;.
	 *
	 * @param ngayBatDau the ngay bat dau
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dot khuyen mai, or <code>null</code> if a matching dot khuyen mai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMai fetchByNGAY_BD_First(Date ngayBatDau,
		OrderByComparator orderByComparator) throws SystemException {
		List<DotKhuyenMai> list = findByNGAY_BD(ngayBatDau, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dot khuyen mai in the ordered set where ngayBatDau = &#63;.
	 *
	 * @param ngayBatDau the ngay bat dau
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dot khuyen mai
	 * @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException if a matching dot khuyen mai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMai findByNGAY_BD_Last(Date ngayBatDau,
		OrderByComparator orderByComparator)
		throws NoSuchDotKhuyenMaiException, SystemException {
		DotKhuyenMai dotKhuyenMai = fetchByNGAY_BD_Last(ngayBatDau,
				orderByComparator);

		if (dotKhuyenMai != null) {
			return dotKhuyenMai;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ngayBatDau=");
		msg.append(ngayBatDau);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDotKhuyenMaiException(msg.toString());
	}

	/**
	 * Returns the last dot khuyen mai in the ordered set where ngayBatDau = &#63;.
	 *
	 * @param ngayBatDau the ngay bat dau
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dot khuyen mai, or <code>null</code> if a matching dot khuyen mai could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMai fetchByNGAY_BD_Last(Date ngayBatDau,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByNGAY_BD(ngayBatDau);

		if (count == 0) {
			return null;
		}

		List<DotKhuyenMai> list = findByNGAY_BD(ngayBatDau, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dot khuyen mais before and after the current dot khuyen mai in the ordered set where ngayBatDau = &#63;.
	 *
	 * @param dotKhuyenMaiId the primary key of the current dot khuyen mai
	 * @param ngayBatDau the ngay bat dau
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dot khuyen mai
	 * @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException if a dot khuyen mai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMai[] findByNGAY_BD_PrevAndNext(long dotKhuyenMaiId,
		Date ngayBatDau, OrderByComparator orderByComparator)
		throws NoSuchDotKhuyenMaiException, SystemException {
		DotKhuyenMai dotKhuyenMai = findByPrimaryKey(dotKhuyenMaiId);

		Session session = null;

		try {
			session = openSession();

			DotKhuyenMai[] array = new DotKhuyenMaiImpl[3];

			array[0] = getByNGAY_BD_PrevAndNext(session, dotKhuyenMai,
					ngayBatDau, orderByComparator, true);

			array[1] = dotKhuyenMai;

			array[2] = getByNGAY_BD_PrevAndNext(session, dotKhuyenMai,
					ngayBatDau, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DotKhuyenMai getByNGAY_BD_PrevAndNext(Session session,
		DotKhuyenMai dotKhuyenMai, Date ngayBatDau,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOTKHUYENMAI_WHERE);

		boolean bindNgayBatDau = false;

		if (ngayBatDau == null) {
			query.append(_FINDER_COLUMN_NGAY_BD_NGAYBATDAU_1);
		}
		else {
			bindNgayBatDau = true;

			query.append(_FINDER_COLUMN_NGAY_BD_NGAYBATDAU_2);
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
			query.append(DotKhuyenMaiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindNgayBatDau) {
			qPos.add(CalendarUtil.getTimestamp(ngayBatDau));
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dotKhuyenMai);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DotKhuyenMai> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dot khuyen mais where ngayBatDau = &#63; from the database.
	 *
	 * @param ngayBatDau the ngay bat dau
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNGAY_BD(Date ngayBatDau) throws SystemException {
		for (DotKhuyenMai dotKhuyenMai : findByNGAY_BD(ngayBatDau,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dotKhuyenMai);
		}
	}

	/**
	 * Returns the number of dot khuyen mais where ngayBatDau = &#63;.
	 *
	 * @param ngayBatDau the ngay bat dau
	 * @return the number of matching dot khuyen mais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByNGAY_BD(Date ngayBatDau) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NGAY_BD;

		Object[] finderArgs = new Object[] { ngayBatDau };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOTKHUYENMAI_WHERE);

			boolean bindNgayBatDau = false;

			if (ngayBatDau == null) {
				query.append(_FINDER_COLUMN_NGAY_BD_NGAYBATDAU_1);
			}
			else {
				bindNgayBatDau = true;

				query.append(_FINDER_COLUMN_NGAY_BD_NGAYBATDAU_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindNgayBatDau) {
					qPos.add(CalendarUtil.getTimestamp(ngayBatDau));
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

	private static final String _FINDER_COLUMN_NGAY_BD_NGAYBATDAU_1 = "dotKhuyenMai.ngayBatDau IS NULL";
	private static final String _FINDER_COLUMN_NGAY_BD_NGAYBATDAU_2 = "dotKhuyenMai.ngayBatDau = ?";

	public DotKhuyenMaiPersistenceImpl() {
		setModelClass(DotKhuyenMai.class);
	}

	/**
	 * Caches the dot khuyen mai in the entity cache if it is enabled.
	 *
	 * @param dotKhuyenMai the dot khuyen mai
	 */
	@Override
	public void cacheResult(DotKhuyenMai dotKhuyenMai) {
		EntityCacheUtil.putResult(DotKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
			DotKhuyenMaiImpl.class, dotKhuyenMai.getPrimaryKey(), dotKhuyenMai);

		dotKhuyenMai.resetOriginalValues();
	}

	/**
	 * Caches the dot khuyen mais in the entity cache if it is enabled.
	 *
	 * @param dotKhuyenMais the dot khuyen mais
	 */
	@Override
	public void cacheResult(List<DotKhuyenMai> dotKhuyenMais) {
		for (DotKhuyenMai dotKhuyenMai : dotKhuyenMais) {
			if (EntityCacheUtil.getResult(
						DotKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
						DotKhuyenMaiImpl.class, dotKhuyenMai.getPrimaryKey()) == null) {
				cacheResult(dotKhuyenMai);
			}
			else {
				dotKhuyenMai.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dot khuyen mais.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DotKhuyenMaiImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DotKhuyenMaiImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dot khuyen mai.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DotKhuyenMai dotKhuyenMai) {
		EntityCacheUtil.removeResult(DotKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
			DotKhuyenMaiImpl.class, dotKhuyenMai.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DotKhuyenMai> dotKhuyenMais) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DotKhuyenMai dotKhuyenMai : dotKhuyenMais) {
			EntityCacheUtil.removeResult(DotKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
				DotKhuyenMaiImpl.class, dotKhuyenMai.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dot khuyen mai with the primary key. Does not add the dot khuyen mai to the database.
	 *
	 * @param dotKhuyenMaiId the primary key for the new dot khuyen mai
	 * @return the new dot khuyen mai
	 */
	@Override
	public DotKhuyenMai create(long dotKhuyenMaiId) {
		DotKhuyenMai dotKhuyenMai = new DotKhuyenMaiImpl();

		dotKhuyenMai.setNew(true);
		dotKhuyenMai.setPrimaryKey(dotKhuyenMaiId);

		return dotKhuyenMai;
	}

	/**
	 * Removes the dot khuyen mai with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dotKhuyenMaiId the primary key of the dot khuyen mai
	 * @return the dot khuyen mai that was removed
	 * @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException if a dot khuyen mai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMai remove(long dotKhuyenMaiId)
		throws NoSuchDotKhuyenMaiException, SystemException {
		return remove((Serializable)dotKhuyenMaiId);
	}

	/**
	 * Removes the dot khuyen mai with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dot khuyen mai
	 * @return the dot khuyen mai that was removed
	 * @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException if a dot khuyen mai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMai remove(Serializable primaryKey)
		throws NoSuchDotKhuyenMaiException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DotKhuyenMai dotKhuyenMai = (DotKhuyenMai)session.get(DotKhuyenMaiImpl.class,
					primaryKey);

			if (dotKhuyenMai == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDotKhuyenMaiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dotKhuyenMai);
		}
		catch (NoSuchDotKhuyenMaiException nsee) {
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
	protected DotKhuyenMai removeImpl(DotKhuyenMai dotKhuyenMai)
		throws SystemException {
		dotKhuyenMai = toUnwrappedModel(dotKhuyenMai);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dotKhuyenMai)) {
				dotKhuyenMai = (DotKhuyenMai)session.get(DotKhuyenMaiImpl.class,
						dotKhuyenMai.getPrimaryKeyObj());
			}

			if (dotKhuyenMai != null) {
				session.delete(dotKhuyenMai);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dotKhuyenMai != null) {
			clearCache(dotKhuyenMai);
		}

		return dotKhuyenMai;
	}

	@Override
	public DotKhuyenMai updateImpl(
		com.minimart.portlet.khuyenmai.model.DotKhuyenMai dotKhuyenMai)
		throws SystemException {
		dotKhuyenMai = toUnwrappedModel(dotKhuyenMai);

		boolean isNew = dotKhuyenMai.isNew();

		DotKhuyenMaiModelImpl dotKhuyenMaiModelImpl = (DotKhuyenMaiModelImpl)dotKhuyenMai;

		Session session = null;

		try {
			session = openSession();

			if (dotKhuyenMai.isNew()) {
				session.save(dotKhuyenMai);

				dotKhuyenMai.setNew(false);
			}
			else {
				session.merge(dotKhuyenMai);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DotKhuyenMaiModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dotKhuyenMaiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_TH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dotKhuyenMaiModelImpl.getOriginalTen()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_TH, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_TH,
					args);

				args = new Object[] { dotKhuyenMaiModelImpl.getTen() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TEN_TH, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TEN_TH,
					args);
			}

			if ((dotKhuyenMaiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGAY_HH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dotKhuyenMaiModelImpl.getOriginalNgayHetHan()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NGAY_HH, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGAY_HH,
					args);

				args = new Object[] { dotKhuyenMaiModelImpl.getNgayHetHan() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NGAY_HH, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGAY_HH,
					args);
			}

			if ((dotKhuyenMaiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGAY_BD.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dotKhuyenMaiModelImpl.getOriginalNgayBatDau()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NGAY_BD, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGAY_BD,
					args);

				args = new Object[] { dotKhuyenMaiModelImpl.getNgayBatDau() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NGAY_BD, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NGAY_BD,
					args);
			}
		}

		EntityCacheUtil.putResult(DotKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
			DotKhuyenMaiImpl.class, dotKhuyenMai.getPrimaryKey(), dotKhuyenMai);

		return dotKhuyenMai;
	}

	protected DotKhuyenMai toUnwrappedModel(DotKhuyenMai dotKhuyenMai) {
		if (dotKhuyenMai instanceof DotKhuyenMaiImpl) {
			return dotKhuyenMai;
		}

		DotKhuyenMaiImpl dotKhuyenMaiImpl = new DotKhuyenMaiImpl();

		dotKhuyenMaiImpl.setNew(dotKhuyenMai.isNew());
		dotKhuyenMaiImpl.setPrimaryKey(dotKhuyenMai.getPrimaryKey());

		dotKhuyenMaiImpl.setDotKhuyenMaiId(dotKhuyenMai.getDotKhuyenMaiId());
		dotKhuyenMaiImpl.setCompanyId(dotKhuyenMai.getCompanyId());
		dotKhuyenMaiImpl.setUserId(dotKhuyenMai.getUserId());
		dotKhuyenMaiImpl.setUserName(dotKhuyenMai.getUserName());
		dotKhuyenMaiImpl.setCreateDate(dotKhuyenMai.getCreateDate());
		dotKhuyenMaiImpl.setModifiedDate(dotKhuyenMai.getModifiedDate());
		dotKhuyenMaiImpl.setTen(dotKhuyenMai.getTen());
		dotKhuyenMaiImpl.setTrangThai(dotKhuyenMai.isTrangThai());
		dotKhuyenMaiImpl.setUserModifieldId(dotKhuyenMai.getUserModifieldId());
		dotKhuyenMaiImpl.setNgayBatDau(dotKhuyenMai.getNgayBatDau());
		dotKhuyenMaiImpl.setNgayHetHan(dotKhuyenMai.getNgayHetHan());
		dotKhuyenMaiImpl.setNgungApDung(dotKhuyenMai.isNgungApDung());
		dotKhuyenMaiImpl.setTiLeGiaGia(dotKhuyenMai.getTiLeGiaGia());
		dotKhuyenMaiImpl.setGhiChu(dotKhuyenMai.getGhiChu());

		return dotKhuyenMaiImpl;
	}

	/**
	 * Returns the dot khuyen mai with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dot khuyen mai
	 * @return the dot khuyen mai
	 * @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException if a dot khuyen mai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMai findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDotKhuyenMaiException, SystemException {
		DotKhuyenMai dotKhuyenMai = fetchByPrimaryKey(primaryKey);

		if (dotKhuyenMai == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDotKhuyenMaiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dotKhuyenMai;
	}

	/**
	 * Returns the dot khuyen mai with the primary key or throws a {@link com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException} if it could not be found.
	 *
	 * @param dotKhuyenMaiId the primary key of the dot khuyen mai
	 * @return the dot khuyen mai
	 * @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiException if a dot khuyen mai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMai findByPrimaryKey(long dotKhuyenMaiId)
		throws NoSuchDotKhuyenMaiException, SystemException {
		return findByPrimaryKey((Serializable)dotKhuyenMaiId);
	}

	/**
	 * Returns the dot khuyen mai with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dot khuyen mai
	 * @return the dot khuyen mai, or <code>null</code> if a dot khuyen mai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMai fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DotKhuyenMai dotKhuyenMai = (DotKhuyenMai)EntityCacheUtil.getResult(DotKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
				DotKhuyenMaiImpl.class, primaryKey);

		if (dotKhuyenMai == _nullDotKhuyenMai) {
			return null;
		}

		if (dotKhuyenMai == null) {
			Session session = null;

			try {
				session = openSession();

				dotKhuyenMai = (DotKhuyenMai)session.get(DotKhuyenMaiImpl.class,
						primaryKey);

				if (dotKhuyenMai != null) {
					cacheResult(dotKhuyenMai);
				}
				else {
					EntityCacheUtil.putResult(DotKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
						DotKhuyenMaiImpl.class, primaryKey, _nullDotKhuyenMai);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DotKhuyenMaiModelImpl.ENTITY_CACHE_ENABLED,
					DotKhuyenMaiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dotKhuyenMai;
	}

	/**
	 * Returns the dot khuyen mai with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dotKhuyenMaiId the primary key of the dot khuyen mai
	 * @return the dot khuyen mai, or <code>null</code> if a dot khuyen mai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMai fetchByPrimaryKey(long dotKhuyenMaiId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)dotKhuyenMaiId);
	}

	/**
	 * Returns all the dot khuyen mais.
	 *
	 * @return the dot khuyen mais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DotKhuyenMai> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dot khuyen mais.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dot khuyen mais
	 * @param end the upper bound of the range of dot khuyen mais (not inclusive)
	 * @return the range of dot khuyen mais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DotKhuyenMai> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dot khuyen mais.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dot khuyen mais
	 * @param end the upper bound of the range of dot khuyen mais (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dot khuyen mais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DotKhuyenMai> findAll(int start, int end,
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

		List<DotKhuyenMai> list = (List<DotKhuyenMai>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOTKHUYENMAI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOTKHUYENMAI;

				if (pagination) {
					sql = sql.concat(DotKhuyenMaiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DotKhuyenMai>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DotKhuyenMai>(list);
				}
				else {
					list = (List<DotKhuyenMai>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dot khuyen mais from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DotKhuyenMai dotKhuyenMai : findAll()) {
			remove(dotKhuyenMai);
		}
	}

	/**
	 * Returns the number of dot khuyen mais.
	 *
	 * @return the number of dot khuyen mais
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

				Query q = session.createQuery(_SQL_COUNT_DOTKHUYENMAI);

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
	 * Initializes the dot khuyen mai persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.minimart.portlet.khuyenmai.model.DotKhuyenMai")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DotKhuyenMai>> listenersList = new ArrayList<ModelListener<DotKhuyenMai>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DotKhuyenMai>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DotKhuyenMaiImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DOTKHUYENMAI = "SELECT dotKhuyenMai FROM DotKhuyenMai dotKhuyenMai";
	private static final String _SQL_SELECT_DOTKHUYENMAI_WHERE = "SELECT dotKhuyenMai FROM DotKhuyenMai dotKhuyenMai WHERE ";
	private static final String _SQL_COUNT_DOTKHUYENMAI = "SELECT COUNT(dotKhuyenMai) FROM DotKhuyenMai dotKhuyenMai";
	private static final String _SQL_COUNT_DOTKHUYENMAI_WHERE = "SELECT COUNT(dotKhuyenMai) FROM DotKhuyenMai dotKhuyenMai WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dotKhuyenMai.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DotKhuyenMai exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DotKhuyenMai exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DotKhuyenMaiPersistenceImpl.class);
	private static DotKhuyenMai _nullDotKhuyenMai = new DotKhuyenMaiImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DotKhuyenMai> toCacheModel() {
				return _nullDotKhuyenMaiCacheModel;
			}
		};

	private static CacheModel<DotKhuyenMai> _nullDotKhuyenMaiCacheModel = new CacheModel<DotKhuyenMai>() {
			@Override
			public DotKhuyenMai toEntityModel() {
				return _nullDotKhuyenMai;
			}
		};
}