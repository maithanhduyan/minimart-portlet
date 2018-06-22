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

import com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiChiTietException;
import com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet;
import com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiChiTietImpl;
import com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiChiTietModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the dot khuyen mai chi tiet service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mai Thành Duy An
 * @see DotKhuyenMaiChiTietPersistence
 * @see DotKhuyenMaiChiTietUtil
 * @generated
 */
public class DotKhuyenMaiChiTietPersistenceImpl extends BasePersistenceImpl<DotKhuyenMaiChiTiet>
	implements DotKhuyenMaiChiTietPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DotKhuyenMaiChiTietUtil} to access the dot khuyen mai chi tiet persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DotKhuyenMaiChiTietImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DotKhuyenMaiChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DotKhuyenMaiChiTietModelImpl.FINDER_CACHE_ENABLED,
			DotKhuyenMaiChiTietImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DotKhuyenMaiChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DotKhuyenMaiChiTietModelImpl.FINDER_CACHE_ENABLED,
			DotKhuyenMaiChiTietImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DotKhuyenMaiChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DotKhuyenMaiChiTietModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DKMID_NMHID =
		new FinderPath(DotKhuyenMaiChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DotKhuyenMaiChiTietModelImpl.FINDER_CACHE_ENABLED,
			DotKhuyenMaiChiTietImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDKMID_NMHID",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DKMID_NMHID =
		new FinderPath(DotKhuyenMaiChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DotKhuyenMaiChiTietModelImpl.FINDER_CACHE_ENABLED,
			DotKhuyenMaiChiTietImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDKMID_NMHID",
			new String[] { Long.class.getName(), Long.class.getName() },
			DotKhuyenMaiChiTietModelImpl.DOTKHUYENMAIID_COLUMN_BITMASK |
			DotKhuyenMaiChiTietModelImpl.NHOMMATHANGID_COLUMN_BITMASK |
			DotKhuyenMaiChiTietModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DKMID_NMHID = new FinderPath(DotKhuyenMaiChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DotKhuyenMaiChiTietModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDKMID_NMHID",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the dot khuyen mai chi tiets where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63;.
	 *
	 * @param dotKhuyenMaiId the dot khuyen mai ID
	 * @param nhomMatHangId the nhom mat hang ID
	 * @return the matching dot khuyen mai chi tiets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DotKhuyenMaiChiTiet> findByDKMID_NMHID(long dotKhuyenMaiId,
		long nhomMatHangId) throws SystemException {
		return findByDKMID_NMHID(dotKhuyenMaiId, nhomMatHangId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dot khuyen mai chi tiets where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dotKhuyenMaiId the dot khuyen mai ID
	 * @param nhomMatHangId the nhom mat hang ID
	 * @param start the lower bound of the range of dot khuyen mai chi tiets
	 * @param end the upper bound of the range of dot khuyen mai chi tiets (not inclusive)
	 * @return the range of matching dot khuyen mai chi tiets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DotKhuyenMaiChiTiet> findByDKMID_NMHID(long dotKhuyenMaiId,
		long nhomMatHangId, int start, int end) throws SystemException {
		return findByDKMID_NMHID(dotKhuyenMaiId, nhomMatHangId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dot khuyen mai chi tiets where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dotKhuyenMaiId the dot khuyen mai ID
	 * @param nhomMatHangId the nhom mat hang ID
	 * @param start the lower bound of the range of dot khuyen mai chi tiets
	 * @param end the upper bound of the range of dot khuyen mai chi tiets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dot khuyen mai chi tiets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DotKhuyenMaiChiTiet> findByDKMID_NMHID(long dotKhuyenMaiId,
		long nhomMatHangId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DKMID_NMHID;
			finderArgs = new Object[] { dotKhuyenMaiId, nhomMatHangId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DKMID_NMHID;
			finderArgs = new Object[] {
					dotKhuyenMaiId, nhomMatHangId,
					
					start, end, orderByComparator
				};
		}

		List<DotKhuyenMaiChiTiet> list = (List<DotKhuyenMaiChiTiet>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet : list) {
				if ((dotKhuyenMaiId != dotKhuyenMaiChiTiet.getDotKhuyenMaiId()) ||
						(nhomMatHangId != dotKhuyenMaiChiTiet.getNhomMatHangId())) {
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

			query.append(_SQL_SELECT_DOTKHUYENMAICHITIET_WHERE);

			query.append(_FINDER_COLUMN_DKMID_NMHID_DOTKHUYENMAIID_2);

			query.append(_FINDER_COLUMN_DKMID_NMHID_NHOMMATHANGID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DotKhuyenMaiChiTietModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dotKhuyenMaiId);

				qPos.add(nhomMatHangId);

				if (!pagination) {
					list = (List<DotKhuyenMaiChiTiet>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DotKhuyenMaiChiTiet>(list);
				}
				else {
					list = (List<DotKhuyenMaiChiTiet>)QueryUtil.list(q,
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
	 * Returns the first dot khuyen mai chi tiet in the ordered set where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63;.
	 *
	 * @param dotKhuyenMaiId the dot khuyen mai ID
	 * @param nhomMatHangId the nhom mat hang ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dot khuyen mai chi tiet
	 * @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiChiTietException if a matching dot khuyen mai chi tiet could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMaiChiTiet findByDKMID_NMHID_First(long dotKhuyenMaiId,
		long nhomMatHangId, OrderByComparator orderByComparator)
		throws NoSuchDotKhuyenMaiChiTietException, SystemException {
		DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet = fetchByDKMID_NMHID_First(dotKhuyenMaiId,
				nhomMatHangId, orderByComparator);

		if (dotKhuyenMaiChiTiet != null) {
			return dotKhuyenMaiChiTiet;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dotKhuyenMaiId=");
		msg.append(dotKhuyenMaiId);

		msg.append(", nhomMatHangId=");
		msg.append(nhomMatHangId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDotKhuyenMaiChiTietException(msg.toString());
	}

	/**
	 * Returns the first dot khuyen mai chi tiet in the ordered set where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63;.
	 *
	 * @param dotKhuyenMaiId the dot khuyen mai ID
	 * @param nhomMatHangId the nhom mat hang ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dot khuyen mai chi tiet, or <code>null</code> if a matching dot khuyen mai chi tiet could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMaiChiTiet fetchByDKMID_NMHID_First(long dotKhuyenMaiId,
		long nhomMatHangId, OrderByComparator orderByComparator)
		throws SystemException {
		List<DotKhuyenMaiChiTiet> list = findByDKMID_NMHID(dotKhuyenMaiId,
				nhomMatHangId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dot khuyen mai chi tiet in the ordered set where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63;.
	 *
	 * @param dotKhuyenMaiId the dot khuyen mai ID
	 * @param nhomMatHangId the nhom mat hang ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dot khuyen mai chi tiet
	 * @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiChiTietException if a matching dot khuyen mai chi tiet could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMaiChiTiet findByDKMID_NMHID_Last(long dotKhuyenMaiId,
		long nhomMatHangId, OrderByComparator orderByComparator)
		throws NoSuchDotKhuyenMaiChiTietException, SystemException {
		DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet = fetchByDKMID_NMHID_Last(dotKhuyenMaiId,
				nhomMatHangId, orderByComparator);

		if (dotKhuyenMaiChiTiet != null) {
			return dotKhuyenMaiChiTiet;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dotKhuyenMaiId=");
		msg.append(dotKhuyenMaiId);

		msg.append(", nhomMatHangId=");
		msg.append(nhomMatHangId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDotKhuyenMaiChiTietException(msg.toString());
	}

	/**
	 * Returns the last dot khuyen mai chi tiet in the ordered set where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63;.
	 *
	 * @param dotKhuyenMaiId the dot khuyen mai ID
	 * @param nhomMatHangId the nhom mat hang ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dot khuyen mai chi tiet, or <code>null</code> if a matching dot khuyen mai chi tiet could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMaiChiTiet fetchByDKMID_NMHID_Last(long dotKhuyenMaiId,
		long nhomMatHangId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByDKMID_NMHID(dotKhuyenMaiId, nhomMatHangId);

		if (count == 0) {
			return null;
		}

		List<DotKhuyenMaiChiTiet> list = findByDKMID_NMHID(dotKhuyenMaiId,
				nhomMatHangId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dot khuyen mai chi tiets before and after the current dot khuyen mai chi tiet in the ordered set where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63;.
	 *
	 * @param dotKhuyenMaiChiTietId the primary key of the current dot khuyen mai chi tiet
	 * @param dotKhuyenMaiId the dot khuyen mai ID
	 * @param nhomMatHangId the nhom mat hang ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dot khuyen mai chi tiet
	 * @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiChiTietException if a dot khuyen mai chi tiet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMaiChiTiet[] findByDKMID_NMHID_PrevAndNext(
		long dotKhuyenMaiChiTietId, long dotKhuyenMaiId, long nhomMatHangId,
		OrderByComparator orderByComparator)
		throws NoSuchDotKhuyenMaiChiTietException, SystemException {
		DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet = findByPrimaryKey(dotKhuyenMaiChiTietId);

		Session session = null;

		try {
			session = openSession();

			DotKhuyenMaiChiTiet[] array = new DotKhuyenMaiChiTietImpl[3];

			array[0] = getByDKMID_NMHID_PrevAndNext(session,
					dotKhuyenMaiChiTiet, dotKhuyenMaiId, nhomMatHangId,
					orderByComparator, true);

			array[1] = dotKhuyenMaiChiTiet;

			array[2] = getByDKMID_NMHID_PrevAndNext(session,
					dotKhuyenMaiChiTiet, dotKhuyenMaiId, nhomMatHangId,
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

	protected DotKhuyenMaiChiTiet getByDKMID_NMHID_PrevAndNext(
		Session session, DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet,
		long dotKhuyenMaiId, long nhomMatHangId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOTKHUYENMAICHITIET_WHERE);

		query.append(_FINDER_COLUMN_DKMID_NMHID_DOTKHUYENMAIID_2);

		query.append(_FINDER_COLUMN_DKMID_NMHID_NHOMMATHANGID_2);

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
			query.append(DotKhuyenMaiChiTietModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dotKhuyenMaiId);

		qPos.add(nhomMatHangId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dotKhuyenMaiChiTiet);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DotKhuyenMaiChiTiet> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dot khuyen mai chi tiets where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63; from the database.
	 *
	 * @param dotKhuyenMaiId the dot khuyen mai ID
	 * @param nhomMatHangId the nhom mat hang ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDKMID_NMHID(long dotKhuyenMaiId, long nhomMatHangId)
		throws SystemException {
		for (DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet : findByDKMID_NMHID(
				dotKhuyenMaiId, nhomMatHangId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(dotKhuyenMaiChiTiet);
		}
	}

	/**
	 * Returns the number of dot khuyen mai chi tiets where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63;.
	 *
	 * @param dotKhuyenMaiId the dot khuyen mai ID
	 * @param nhomMatHangId the nhom mat hang ID
	 * @return the number of matching dot khuyen mai chi tiets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDKMID_NMHID(long dotKhuyenMaiId, long nhomMatHangId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DKMID_NMHID;

		Object[] finderArgs = new Object[] { dotKhuyenMaiId, nhomMatHangId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DOTKHUYENMAICHITIET_WHERE);

			query.append(_FINDER_COLUMN_DKMID_NMHID_DOTKHUYENMAIID_2);

			query.append(_FINDER_COLUMN_DKMID_NMHID_NHOMMATHANGID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dotKhuyenMaiId);

				qPos.add(nhomMatHangId);

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

	private static final String _FINDER_COLUMN_DKMID_NMHID_DOTKHUYENMAIID_2 = "dotKhuyenMaiChiTiet.dotKhuyenMaiId = ? AND ";
	private static final String _FINDER_COLUMN_DKMID_NMHID_NHOMMATHANGID_2 = "dotKhuyenMaiChiTiet.nhomMatHangId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DKMID_NMHID_MHID =
		new FinderPath(DotKhuyenMaiChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DotKhuyenMaiChiTietModelImpl.FINDER_CACHE_ENABLED,
			DotKhuyenMaiChiTietImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDKMID_NMHID_MHID",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DKMID_NMHID_MHID =
		new FinderPath(DotKhuyenMaiChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DotKhuyenMaiChiTietModelImpl.FINDER_CACHE_ENABLED,
			DotKhuyenMaiChiTietImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDKMID_NMHID_MHID",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			DotKhuyenMaiChiTietModelImpl.DOTKHUYENMAIID_COLUMN_BITMASK |
			DotKhuyenMaiChiTietModelImpl.NHOMMATHANGID_COLUMN_BITMASK |
			DotKhuyenMaiChiTietModelImpl.MATHANGID_COLUMN_BITMASK |
			DotKhuyenMaiChiTietModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DKMID_NMHID_MHID = new FinderPath(DotKhuyenMaiChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DotKhuyenMaiChiTietModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDKMID_NMHID_MHID",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns all the dot khuyen mai chi tiets where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63; and matHangId = &#63;.
	 *
	 * @param dotKhuyenMaiId the dot khuyen mai ID
	 * @param nhomMatHangId the nhom mat hang ID
	 * @param matHangId the mat hang ID
	 * @return the matching dot khuyen mai chi tiets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DotKhuyenMaiChiTiet> findByDKMID_NMHID_MHID(
		long dotKhuyenMaiId, long nhomMatHangId, long matHangId)
		throws SystemException {
		return findByDKMID_NMHID_MHID(dotKhuyenMaiId, nhomMatHangId, matHangId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dot khuyen mai chi tiets where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63; and matHangId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dotKhuyenMaiId the dot khuyen mai ID
	 * @param nhomMatHangId the nhom mat hang ID
	 * @param matHangId the mat hang ID
	 * @param start the lower bound of the range of dot khuyen mai chi tiets
	 * @param end the upper bound of the range of dot khuyen mai chi tiets (not inclusive)
	 * @return the range of matching dot khuyen mai chi tiets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DotKhuyenMaiChiTiet> findByDKMID_NMHID_MHID(
		long dotKhuyenMaiId, long nhomMatHangId, long matHangId, int start,
		int end) throws SystemException {
		return findByDKMID_NMHID_MHID(dotKhuyenMaiId, nhomMatHangId, matHangId,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the dot khuyen mai chi tiets where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63; and matHangId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dotKhuyenMaiId the dot khuyen mai ID
	 * @param nhomMatHangId the nhom mat hang ID
	 * @param matHangId the mat hang ID
	 * @param start the lower bound of the range of dot khuyen mai chi tiets
	 * @param end the upper bound of the range of dot khuyen mai chi tiets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dot khuyen mai chi tiets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DotKhuyenMaiChiTiet> findByDKMID_NMHID_MHID(
		long dotKhuyenMaiId, long nhomMatHangId, long matHangId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DKMID_NMHID_MHID;
			finderArgs = new Object[] { dotKhuyenMaiId, nhomMatHangId, matHangId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DKMID_NMHID_MHID;
			finderArgs = new Object[] {
					dotKhuyenMaiId, nhomMatHangId, matHangId,
					
					start, end, orderByComparator
				};
		}

		List<DotKhuyenMaiChiTiet> list = (List<DotKhuyenMaiChiTiet>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet : list) {
				if ((dotKhuyenMaiId != dotKhuyenMaiChiTiet.getDotKhuyenMaiId()) ||
						(nhomMatHangId != dotKhuyenMaiChiTiet.getNhomMatHangId()) ||
						(matHangId != dotKhuyenMaiChiTiet.getMatHangId())) {
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

			query.append(_SQL_SELECT_DOTKHUYENMAICHITIET_WHERE);

			query.append(_FINDER_COLUMN_DKMID_NMHID_MHID_DOTKHUYENMAIID_2);

			query.append(_FINDER_COLUMN_DKMID_NMHID_MHID_NHOMMATHANGID_2);

			query.append(_FINDER_COLUMN_DKMID_NMHID_MHID_MATHANGID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DotKhuyenMaiChiTietModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dotKhuyenMaiId);

				qPos.add(nhomMatHangId);

				qPos.add(matHangId);

				if (!pagination) {
					list = (List<DotKhuyenMaiChiTiet>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DotKhuyenMaiChiTiet>(list);
				}
				else {
					list = (List<DotKhuyenMaiChiTiet>)QueryUtil.list(q,
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
	 * Returns the first dot khuyen mai chi tiet in the ordered set where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63; and matHangId = &#63;.
	 *
	 * @param dotKhuyenMaiId the dot khuyen mai ID
	 * @param nhomMatHangId the nhom mat hang ID
	 * @param matHangId the mat hang ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dot khuyen mai chi tiet
	 * @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiChiTietException if a matching dot khuyen mai chi tiet could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMaiChiTiet findByDKMID_NMHID_MHID_First(
		long dotKhuyenMaiId, long nhomMatHangId, long matHangId,
		OrderByComparator orderByComparator)
		throws NoSuchDotKhuyenMaiChiTietException, SystemException {
		DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet = fetchByDKMID_NMHID_MHID_First(dotKhuyenMaiId,
				nhomMatHangId, matHangId, orderByComparator);

		if (dotKhuyenMaiChiTiet != null) {
			return dotKhuyenMaiChiTiet;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dotKhuyenMaiId=");
		msg.append(dotKhuyenMaiId);

		msg.append(", nhomMatHangId=");
		msg.append(nhomMatHangId);

		msg.append(", matHangId=");
		msg.append(matHangId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDotKhuyenMaiChiTietException(msg.toString());
	}

	/**
	 * Returns the first dot khuyen mai chi tiet in the ordered set where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63; and matHangId = &#63;.
	 *
	 * @param dotKhuyenMaiId the dot khuyen mai ID
	 * @param nhomMatHangId the nhom mat hang ID
	 * @param matHangId the mat hang ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dot khuyen mai chi tiet, or <code>null</code> if a matching dot khuyen mai chi tiet could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMaiChiTiet fetchByDKMID_NMHID_MHID_First(
		long dotKhuyenMaiId, long nhomMatHangId, long matHangId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DotKhuyenMaiChiTiet> list = findByDKMID_NMHID_MHID(dotKhuyenMaiId,
				nhomMatHangId, matHangId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dot khuyen mai chi tiet in the ordered set where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63; and matHangId = &#63;.
	 *
	 * @param dotKhuyenMaiId the dot khuyen mai ID
	 * @param nhomMatHangId the nhom mat hang ID
	 * @param matHangId the mat hang ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dot khuyen mai chi tiet
	 * @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiChiTietException if a matching dot khuyen mai chi tiet could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMaiChiTiet findByDKMID_NMHID_MHID_Last(
		long dotKhuyenMaiId, long nhomMatHangId, long matHangId,
		OrderByComparator orderByComparator)
		throws NoSuchDotKhuyenMaiChiTietException, SystemException {
		DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet = fetchByDKMID_NMHID_MHID_Last(dotKhuyenMaiId,
				nhomMatHangId, matHangId, orderByComparator);

		if (dotKhuyenMaiChiTiet != null) {
			return dotKhuyenMaiChiTiet;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dotKhuyenMaiId=");
		msg.append(dotKhuyenMaiId);

		msg.append(", nhomMatHangId=");
		msg.append(nhomMatHangId);

		msg.append(", matHangId=");
		msg.append(matHangId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDotKhuyenMaiChiTietException(msg.toString());
	}

	/**
	 * Returns the last dot khuyen mai chi tiet in the ordered set where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63; and matHangId = &#63;.
	 *
	 * @param dotKhuyenMaiId the dot khuyen mai ID
	 * @param nhomMatHangId the nhom mat hang ID
	 * @param matHangId the mat hang ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dot khuyen mai chi tiet, or <code>null</code> if a matching dot khuyen mai chi tiet could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMaiChiTiet fetchByDKMID_NMHID_MHID_Last(
		long dotKhuyenMaiId, long nhomMatHangId, long matHangId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDKMID_NMHID_MHID(dotKhuyenMaiId, nhomMatHangId,
				matHangId);

		if (count == 0) {
			return null;
		}

		List<DotKhuyenMaiChiTiet> list = findByDKMID_NMHID_MHID(dotKhuyenMaiId,
				nhomMatHangId, matHangId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dot khuyen mai chi tiets before and after the current dot khuyen mai chi tiet in the ordered set where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63; and matHangId = &#63;.
	 *
	 * @param dotKhuyenMaiChiTietId the primary key of the current dot khuyen mai chi tiet
	 * @param dotKhuyenMaiId the dot khuyen mai ID
	 * @param nhomMatHangId the nhom mat hang ID
	 * @param matHangId the mat hang ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dot khuyen mai chi tiet
	 * @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiChiTietException if a dot khuyen mai chi tiet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMaiChiTiet[] findByDKMID_NMHID_MHID_PrevAndNext(
		long dotKhuyenMaiChiTietId, long dotKhuyenMaiId, long nhomMatHangId,
		long matHangId, OrderByComparator orderByComparator)
		throws NoSuchDotKhuyenMaiChiTietException, SystemException {
		DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet = findByPrimaryKey(dotKhuyenMaiChiTietId);

		Session session = null;

		try {
			session = openSession();

			DotKhuyenMaiChiTiet[] array = new DotKhuyenMaiChiTietImpl[3];

			array[0] = getByDKMID_NMHID_MHID_PrevAndNext(session,
					dotKhuyenMaiChiTiet, dotKhuyenMaiId, nhomMatHangId,
					matHangId, orderByComparator, true);

			array[1] = dotKhuyenMaiChiTiet;

			array[2] = getByDKMID_NMHID_MHID_PrevAndNext(session,
					dotKhuyenMaiChiTiet, dotKhuyenMaiId, nhomMatHangId,
					matHangId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DotKhuyenMaiChiTiet getByDKMID_NMHID_MHID_PrevAndNext(
		Session session, DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet,
		long dotKhuyenMaiId, long nhomMatHangId, long matHangId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOTKHUYENMAICHITIET_WHERE);

		query.append(_FINDER_COLUMN_DKMID_NMHID_MHID_DOTKHUYENMAIID_2);

		query.append(_FINDER_COLUMN_DKMID_NMHID_MHID_NHOMMATHANGID_2);

		query.append(_FINDER_COLUMN_DKMID_NMHID_MHID_MATHANGID_2);

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
			query.append(DotKhuyenMaiChiTietModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dotKhuyenMaiId);

		qPos.add(nhomMatHangId);

		qPos.add(matHangId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dotKhuyenMaiChiTiet);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DotKhuyenMaiChiTiet> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dot khuyen mai chi tiets where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63; and matHangId = &#63; from the database.
	 *
	 * @param dotKhuyenMaiId the dot khuyen mai ID
	 * @param nhomMatHangId the nhom mat hang ID
	 * @param matHangId the mat hang ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDKMID_NMHID_MHID(long dotKhuyenMaiId,
		long nhomMatHangId, long matHangId) throws SystemException {
		for (DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet : findByDKMID_NMHID_MHID(
				dotKhuyenMaiId, nhomMatHangId, matHangId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(dotKhuyenMaiChiTiet);
		}
	}

	/**
	 * Returns the number of dot khuyen mai chi tiets where dotKhuyenMaiId = &#63; and nhomMatHangId = &#63; and matHangId = &#63;.
	 *
	 * @param dotKhuyenMaiId the dot khuyen mai ID
	 * @param nhomMatHangId the nhom mat hang ID
	 * @param matHangId the mat hang ID
	 * @return the number of matching dot khuyen mai chi tiets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDKMID_NMHID_MHID(long dotKhuyenMaiId, long nhomMatHangId,
		long matHangId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DKMID_NMHID_MHID;

		Object[] finderArgs = new Object[] {
				dotKhuyenMaiId, nhomMatHangId, matHangId
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DOTKHUYENMAICHITIET_WHERE);

			query.append(_FINDER_COLUMN_DKMID_NMHID_MHID_DOTKHUYENMAIID_2);

			query.append(_FINDER_COLUMN_DKMID_NMHID_MHID_NHOMMATHANGID_2);

			query.append(_FINDER_COLUMN_DKMID_NMHID_MHID_MATHANGID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dotKhuyenMaiId);

				qPos.add(nhomMatHangId);

				qPos.add(matHangId);

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

	private static final String _FINDER_COLUMN_DKMID_NMHID_MHID_DOTKHUYENMAIID_2 =
		"dotKhuyenMaiChiTiet.dotKhuyenMaiId = ? AND ";
	private static final String _FINDER_COLUMN_DKMID_NMHID_MHID_NHOMMATHANGID_2 = "dotKhuyenMaiChiTiet.nhomMatHangId = ? AND ";
	private static final String _FINDER_COLUMN_DKMID_NMHID_MHID_MATHANGID_2 = "dotKhuyenMaiChiTiet.matHangId = ?";

	public DotKhuyenMaiChiTietPersistenceImpl() {
		setModelClass(DotKhuyenMaiChiTiet.class);
	}

	/**
	 * Caches the dot khuyen mai chi tiet in the entity cache if it is enabled.
	 *
	 * @param dotKhuyenMaiChiTiet the dot khuyen mai chi tiet
	 */
	@Override
	public void cacheResult(DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet) {
		EntityCacheUtil.putResult(DotKhuyenMaiChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DotKhuyenMaiChiTietImpl.class, dotKhuyenMaiChiTiet.getPrimaryKey(),
			dotKhuyenMaiChiTiet);

		dotKhuyenMaiChiTiet.resetOriginalValues();
	}

	/**
	 * Caches the dot khuyen mai chi tiets in the entity cache if it is enabled.
	 *
	 * @param dotKhuyenMaiChiTiets the dot khuyen mai chi tiets
	 */
	@Override
	public void cacheResult(List<DotKhuyenMaiChiTiet> dotKhuyenMaiChiTiets) {
		for (DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet : dotKhuyenMaiChiTiets) {
			if (EntityCacheUtil.getResult(
						DotKhuyenMaiChiTietModelImpl.ENTITY_CACHE_ENABLED,
						DotKhuyenMaiChiTietImpl.class,
						dotKhuyenMaiChiTiet.getPrimaryKey()) == null) {
				cacheResult(dotKhuyenMaiChiTiet);
			}
			else {
				dotKhuyenMaiChiTiet.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dot khuyen mai chi tiets.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DotKhuyenMaiChiTietImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DotKhuyenMaiChiTietImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dot khuyen mai chi tiet.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet) {
		EntityCacheUtil.removeResult(DotKhuyenMaiChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DotKhuyenMaiChiTietImpl.class, dotKhuyenMaiChiTiet.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DotKhuyenMaiChiTiet> dotKhuyenMaiChiTiets) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet : dotKhuyenMaiChiTiets) {
			EntityCacheUtil.removeResult(DotKhuyenMaiChiTietModelImpl.ENTITY_CACHE_ENABLED,
				DotKhuyenMaiChiTietImpl.class,
				dotKhuyenMaiChiTiet.getPrimaryKey());
		}
	}

	/**
	 * Creates a new dot khuyen mai chi tiet with the primary key. Does not add the dot khuyen mai chi tiet to the database.
	 *
	 * @param dotKhuyenMaiChiTietId the primary key for the new dot khuyen mai chi tiet
	 * @return the new dot khuyen mai chi tiet
	 */
	@Override
	public DotKhuyenMaiChiTiet create(long dotKhuyenMaiChiTietId) {
		DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet = new DotKhuyenMaiChiTietImpl();

		dotKhuyenMaiChiTiet.setNew(true);
		dotKhuyenMaiChiTiet.setPrimaryKey(dotKhuyenMaiChiTietId);

		return dotKhuyenMaiChiTiet;
	}

	/**
	 * Removes the dot khuyen mai chi tiet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dotKhuyenMaiChiTietId the primary key of the dot khuyen mai chi tiet
	 * @return the dot khuyen mai chi tiet that was removed
	 * @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiChiTietException if a dot khuyen mai chi tiet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMaiChiTiet remove(long dotKhuyenMaiChiTietId)
		throws NoSuchDotKhuyenMaiChiTietException, SystemException {
		return remove((Serializable)dotKhuyenMaiChiTietId);
	}

	/**
	 * Removes the dot khuyen mai chi tiet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dot khuyen mai chi tiet
	 * @return the dot khuyen mai chi tiet that was removed
	 * @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiChiTietException if a dot khuyen mai chi tiet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMaiChiTiet remove(Serializable primaryKey)
		throws NoSuchDotKhuyenMaiChiTietException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet = (DotKhuyenMaiChiTiet)session.get(DotKhuyenMaiChiTietImpl.class,
					primaryKey);

			if (dotKhuyenMaiChiTiet == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDotKhuyenMaiChiTietException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dotKhuyenMaiChiTiet);
		}
		catch (NoSuchDotKhuyenMaiChiTietException nsee) {
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
	protected DotKhuyenMaiChiTiet removeImpl(
		DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet) throws SystemException {
		dotKhuyenMaiChiTiet = toUnwrappedModel(dotKhuyenMaiChiTiet);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dotKhuyenMaiChiTiet)) {
				dotKhuyenMaiChiTiet = (DotKhuyenMaiChiTiet)session.get(DotKhuyenMaiChiTietImpl.class,
						dotKhuyenMaiChiTiet.getPrimaryKeyObj());
			}

			if (dotKhuyenMaiChiTiet != null) {
				session.delete(dotKhuyenMaiChiTiet);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dotKhuyenMaiChiTiet != null) {
			clearCache(dotKhuyenMaiChiTiet);
		}

		return dotKhuyenMaiChiTiet;
	}

	@Override
	public DotKhuyenMaiChiTiet updateImpl(
		com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet)
		throws SystemException {
		dotKhuyenMaiChiTiet = toUnwrappedModel(dotKhuyenMaiChiTiet);

		boolean isNew = dotKhuyenMaiChiTiet.isNew();

		DotKhuyenMaiChiTietModelImpl dotKhuyenMaiChiTietModelImpl = (DotKhuyenMaiChiTietModelImpl)dotKhuyenMaiChiTiet;

		Session session = null;

		try {
			session = openSession();

			if (dotKhuyenMaiChiTiet.isNew()) {
				session.save(dotKhuyenMaiChiTiet);

				dotKhuyenMaiChiTiet.setNew(false);
			}
			else {
				session.merge(dotKhuyenMaiChiTiet);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DotKhuyenMaiChiTietModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dotKhuyenMaiChiTietModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DKMID_NMHID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dotKhuyenMaiChiTietModelImpl.getOriginalDotKhuyenMaiId(),
						dotKhuyenMaiChiTietModelImpl.getOriginalNhomMatHangId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DKMID_NMHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DKMID_NMHID,
					args);

				args = new Object[] {
						dotKhuyenMaiChiTietModelImpl.getDotKhuyenMaiId(),
						dotKhuyenMaiChiTietModelImpl.getNhomMatHangId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DKMID_NMHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DKMID_NMHID,
					args);
			}

			if ((dotKhuyenMaiChiTietModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DKMID_NMHID_MHID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dotKhuyenMaiChiTietModelImpl.getOriginalDotKhuyenMaiId(),
						dotKhuyenMaiChiTietModelImpl.getOriginalNhomMatHangId(),
						dotKhuyenMaiChiTietModelImpl.getOriginalMatHangId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DKMID_NMHID_MHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DKMID_NMHID_MHID,
					args);

				args = new Object[] {
						dotKhuyenMaiChiTietModelImpl.getDotKhuyenMaiId(),
						dotKhuyenMaiChiTietModelImpl.getNhomMatHangId(),
						dotKhuyenMaiChiTietModelImpl.getMatHangId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DKMID_NMHID_MHID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DKMID_NMHID_MHID,
					args);
			}
		}

		EntityCacheUtil.putResult(DotKhuyenMaiChiTietModelImpl.ENTITY_CACHE_ENABLED,
			DotKhuyenMaiChiTietImpl.class, dotKhuyenMaiChiTiet.getPrimaryKey(),
			dotKhuyenMaiChiTiet);

		return dotKhuyenMaiChiTiet;
	}

	protected DotKhuyenMaiChiTiet toUnwrappedModel(
		DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet) {
		if (dotKhuyenMaiChiTiet instanceof DotKhuyenMaiChiTietImpl) {
			return dotKhuyenMaiChiTiet;
		}

		DotKhuyenMaiChiTietImpl dotKhuyenMaiChiTietImpl = new DotKhuyenMaiChiTietImpl();

		dotKhuyenMaiChiTietImpl.setNew(dotKhuyenMaiChiTiet.isNew());
		dotKhuyenMaiChiTietImpl.setPrimaryKey(dotKhuyenMaiChiTiet.getPrimaryKey());

		dotKhuyenMaiChiTietImpl.setDotKhuyenMaiChiTietId(dotKhuyenMaiChiTiet.getDotKhuyenMaiChiTietId());
		dotKhuyenMaiChiTietImpl.setCompanyId(dotKhuyenMaiChiTiet.getCompanyId());
		dotKhuyenMaiChiTietImpl.setUserId(dotKhuyenMaiChiTiet.getUserId());
		dotKhuyenMaiChiTietImpl.setUserName(dotKhuyenMaiChiTiet.getUserName());
		dotKhuyenMaiChiTietImpl.setCreateDate(dotKhuyenMaiChiTiet.getCreateDate());
		dotKhuyenMaiChiTietImpl.setModifiedDate(dotKhuyenMaiChiTiet.getModifiedDate());
		dotKhuyenMaiChiTietImpl.setDotKhuyenMaiId(dotKhuyenMaiChiTiet.getDotKhuyenMaiId());
		dotKhuyenMaiChiTietImpl.setNhomMatHangId(dotKhuyenMaiChiTiet.getNhomMatHangId());
		dotKhuyenMaiChiTietImpl.setMatHangId(dotKhuyenMaiChiTiet.getMatHangId());
		dotKhuyenMaiChiTietImpl.setMatHangTangId(dotKhuyenMaiChiTiet.getMatHangTangId());
		dotKhuyenMaiChiTietImpl.setTiLeGiamGia(dotKhuyenMaiChiTiet.getTiLeGiamGia());
		dotKhuyenMaiChiTietImpl.setGiaTriDonHang(dotKhuyenMaiChiTiet.getGiaTriDonHang());
		dotKhuyenMaiChiTietImpl.setSoLuongMua(dotKhuyenMaiChiTiet.getSoLuongMua());
		dotKhuyenMaiChiTietImpl.setSoLuongTang(dotKhuyenMaiChiTiet.getSoLuongTang());
		dotKhuyenMaiChiTietImpl.setGiaBan(dotKhuyenMaiChiTiet.getGiaBan());

		return dotKhuyenMaiChiTietImpl;
	}

	/**
	 * Returns the dot khuyen mai chi tiet with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dot khuyen mai chi tiet
	 * @return the dot khuyen mai chi tiet
	 * @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiChiTietException if a dot khuyen mai chi tiet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMaiChiTiet findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDotKhuyenMaiChiTietException, SystemException {
		DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet = fetchByPrimaryKey(primaryKey);

		if (dotKhuyenMaiChiTiet == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDotKhuyenMaiChiTietException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dotKhuyenMaiChiTiet;
	}

	/**
	 * Returns the dot khuyen mai chi tiet with the primary key or throws a {@link com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiChiTietException} if it could not be found.
	 *
	 * @param dotKhuyenMaiChiTietId the primary key of the dot khuyen mai chi tiet
	 * @return the dot khuyen mai chi tiet
	 * @throws com.minimart.portlet.khuyenmai.NoSuchDotKhuyenMaiChiTietException if a dot khuyen mai chi tiet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMaiChiTiet findByPrimaryKey(long dotKhuyenMaiChiTietId)
		throws NoSuchDotKhuyenMaiChiTietException, SystemException {
		return findByPrimaryKey((Serializable)dotKhuyenMaiChiTietId);
	}

	/**
	 * Returns the dot khuyen mai chi tiet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dot khuyen mai chi tiet
	 * @return the dot khuyen mai chi tiet, or <code>null</code> if a dot khuyen mai chi tiet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMaiChiTiet fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet = (DotKhuyenMaiChiTiet)EntityCacheUtil.getResult(DotKhuyenMaiChiTietModelImpl.ENTITY_CACHE_ENABLED,
				DotKhuyenMaiChiTietImpl.class, primaryKey);

		if (dotKhuyenMaiChiTiet == _nullDotKhuyenMaiChiTiet) {
			return null;
		}

		if (dotKhuyenMaiChiTiet == null) {
			Session session = null;

			try {
				session = openSession();

				dotKhuyenMaiChiTiet = (DotKhuyenMaiChiTiet)session.get(DotKhuyenMaiChiTietImpl.class,
						primaryKey);

				if (dotKhuyenMaiChiTiet != null) {
					cacheResult(dotKhuyenMaiChiTiet);
				}
				else {
					EntityCacheUtil.putResult(DotKhuyenMaiChiTietModelImpl.ENTITY_CACHE_ENABLED,
						DotKhuyenMaiChiTietImpl.class, primaryKey,
						_nullDotKhuyenMaiChiTiet);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DotKhuyenMaiChiTietModelImpl.ENTITY_CACHE_ENABLED,
					DotKhuyenMaiChiTietImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dotKhuyenMaiChiTiet;
	}

	/**
	 * Returns the dot khuyen mai chi tiet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dotKhuyenMaiChiTietId the primary key of the dot khuyen mai chi tiet
	 * @return the dot khuyen mai chi tiet, or <code>null</code> if a dot khuyen mai chi tiet with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DotKhuyenMaiChiTiet fetchByPrimaryKey(long dotKhuyenMaiChiTietId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)dotKhuyenMaiChiTietId);
	}

	/**
	 * Returns all the dot khuyen mai chi tiets.
	 *
	 * @return the dot khuyen mai chi tiets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DotKhuyenMaiChiTiet> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dot khuyen mai chi tiets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dot khuyen mai chi tiets
	 * @param end the upper bound of the range of dot khuyen mai chi tiets (not inclusive)
	 * @return the range of dot khuyen mai chi tiets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DotKhuyenMaiChiTiet> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dot khuyen mai chi tiets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.minimart.portlet.khuyenmai.model.impl.DotKhuyenMaiChiTietModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dot khuyen mai chi tiets
	 * @param end the upper bound of the range of dot khuyen mai chi tiets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dot khuyen mai chi tiets
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DotKhuyenMaiChiTiet> findAll(int start, int end,
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

		List<DotKhuyenMaiChiTiet> list = (List<DotKhuyenMaiChiTiet>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOTKHUYENMAICHITIET);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOTKHUYENMAICHITIET;

				if (pagination) {
					sql = sql.concat(DotKhuyenMaiChiTietModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DotKhuyenMaiChiTiet>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DotKhuyenMaiChiTiet>(list);
				}
				else {
					list = (List<DotKhuyenMaiChiTiet>)QueryUtil.list(q,
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
	 * Removes all the dot khuyen mai chi tiets from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet : findAll()) {
			remove(dotKhuyenMaiChiTiet);
		}
	}

	/**
	 * Returns the number of dot khuyen mai chi tiets.
	 *
	 * @return the number of dot khuyen mai chi tiets
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

				Query q = session.createQuery(_SQL_COUNT_DOTKHUYENMAICHITIET);

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
	 * Initializes the dot khuyen mai chi tiet persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.minimart.portlet.khuyenmai.model.DotKhuyenMaiChiTiet")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DotKhuyenMaiChiTiet>> listenersList = new ArrayList<ModelListener<DotKhuyenMaiChiTiet>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DotKhuyenMaiChiTiet>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DotKhuyenMaiChiTietImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DOTKHUYENMAICHITIET = "SELECT dotKhuyenMaiChiTiet FROM DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet";
	private static final String _SQL_SELECT_DOTKHUYENMAICHITIET_WHERE = "SELECT dotKhuyenMaiChiTiet FROM DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet WHERE ";
	private static final String _SQL_COUNT_DOTKHUYENMAICHITIET = "SELECT COUNT(dotKhuyenMaiChiTiet) FROM DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet";
	private static final String _SQL_COUNT_DOTKHUYENMAICHITIET_WHERE = "SELECT COUNT(dotKhuyenMaiChiTiet) FROM DotKhuyenMaiChiTiet dotKhuyenMaiChiTiet WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dotKhuyenMaiChiTiet.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DotKhuyenMaiChiTiet exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DotKhuyenMaiChiTiet exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DotKhuyenMaiChiTietPersistenceImpl.class);
	private static DotKhuyenMaiChiTiet _nullDotKhuyenMaiChiTiet = new DotKhuyenMaiChiTietImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DotKhuyenMaiChiTiet> toCacheModel() {
				return _nullDotKhuyenMaiChiTietCacheModel;
			}
		};

	private static CacheModel<DotKhuyenMaiChiTiet> _nullDotKhuyenMaiChiTietCacheModel =
		new CacheModel<DotKhuyenMaiChiTiet>() {
			@Override
			public DotKhuyenMaiChiTiet toEntityModel() {
				return _nullDotKhuyenMaiChiTiet;
			}
		};
}